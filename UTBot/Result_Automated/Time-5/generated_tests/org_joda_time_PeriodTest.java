package org.joda.time;

import org.junit.Test;
import org.joda.time.format.PeriodFormatter;
import java.lang.reflect.Method;
import org.joda.time.convert.ConverterManager;
import org.joda.time.base.AbstractPeriod;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;

public final class org_joda_time_PeriodTest {
    ///region Test suites for executable org.joda.time.Period.millis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method millis(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#millis(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#standard()}
 * @utbot.returnsFrom {@code return new Period(new int[] { 0, 0, 0, 0, 0, 0, 0, millis }, PeriodType.standard());}
 *  */
    @Test
    public void testMillis_PeriodTypeStandard() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType cStandard = new PeriodType(null, null, null);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            
            Period actual = Period.millis(-255);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(cWeeks, "org.joda.time.PeriodType", "cStandard", iType);
            setField(cWeeks, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            String iName = "Weeks";
            setField(cWeeks, "org.joda.time.PeriodType", "iName", iName);
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName1 = "weeks";
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
            iTypes[0] = ((DurationFieldType) standardDurationFieldType);
            setField(cWeeks, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1, -1, 0, -1, -1, -1, -1, -1};
            setField(cWeeks, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(iType, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {0, 0, 0, 0, 0, 0, 0, -255};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method millis(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#millis(int)}
     */
    @Test
    public void testMillis() throws Exception  {
        Period actual = Period.millis(2);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0, 0, 0, 0, 0, 0, 0, 2};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#parse(java.lang.String)}
 * @utbot.invokes {@link org.joda.time.format.ISOPeriodFormat#standard()}
 * @utbot.invokes {@link org.joda.time.Period#parse(java.lang.String,org.joda.time.format.PeriodFormatter)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return parse(str, ISOPeriodFormat.standard());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testParse_ThrowUnsupportedOperationException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class iSOPeriodFormatClazz = Class.forName("org.joda.time.format.ISOPeriodFormat");
        PeriodFormatter prevCStandard = ((PeriodFormatter) getStaticFieldValue(iSOPeriodFormatClazz, "cStandard"));
        try {
            PeriodFormatter cStandard = new PeriodFormatter(null, null);
            setStaticField(iSOPeriodFormatClazz, "cStandard", cStandard);
            
            Period.parse(null);
        } finally {
            setStaticField(org.joda.time.format.ISOPeriodFormat.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#parse(java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testParseThrowsIAEWithNonEmptyString() {
        Period.parse("\u0014\n\t\r");
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.lang.String)
    
    @Test
    public void testParse1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class iSOPeriodFormatClazz = Class.forName("org.joda.time.format.ISOPeriodFormat");
        PeriodFormatter prevCStandard = ((PeriodFormatter) getStaticFieldValue(iSOPeriodFormatClazz, "cStandard"));
        try {
            setStaticField(iSOPeriodFormatClazz, "cStandard", null);
            
            /* This test fails because method [org.joda.time.Period.parse] produces [java.lang.NullPointerException]
                org.joda.time.format.PeriodFormatterBuilder$Literal.parseInto(PeriodFormatterBuilder.java:1571)
                org.joda.time.format.PeriodFormatterBuilder$Composite.parseInto(PeriodFormatterBuilder.java:1837)
                org.joda.time.format.PeriodFormatterBuilder$Separator.parseInto(PeriodFormatterBuilder.java:1709)
                org.joda.time.format.PeriodFormatter.parseMutablePeriod(PeriodFormatter.java:318)
                org.joda.time.format.PeriodFormatter.parsePeriod(PeriodFormatter.java:304)
                org.joda.time.Period.parse(Period.java:92)
                org.joda.time.Period.parse(Period.java:81) */
            Period.parse(null);
        } finally {
            setStaticField(org.joda.time.format.ISOPeriodFormat.class, "cStandard", prevCStandard);
        }
    }
    
    @Test
    public void testParse2() throws Exception  {
        Class iSOPeriodFormatClazz = Class.forName("org.joda.time.format.ISOPeriodFormat");
        PeriodFormatter prevCStandard = ((PeriodFormatter) getStaticFieldValue(iSOPeriodFormatClazz, "cStandard"));
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard1 = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodFormatter cStandard = ((PeriodFormatter) createInstance("org.joda.time.format.PeriodFormatter"));
            Object iParser = createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter");
            setField(cStandard, "org.joda.time.format.PeriodFormatter", "iParser", iParser);
            setStaticField(iSOPeriodFormatClazz, "cStandard", cStandard);
            setStaticField(periodTypeClazz, "cStandard", null);
            
            /* This test fails because method [org.joda.time.Period.parse] produces [java.lang.NullPointerException]
                org.joda.time.format.PeriodFormatterBuilder$FieldFormatter.parseInto(PeriodFormatterBuilder.java:1193)
                org.joda.time.format.PeriodFormatter.parseMutablePeriod(PeriodFormatter.java:318)
                org.joda.time.format.PeriodFormatter.parsePeriod(PeriodFormatter.java:304)
                org.joda.time.Period.parse(Period.java:92)
                org.joda.time.Period.parse(Period.java:81) */
            Period.parse(null);
        } finally {
            setStaticField(org.joda.time.format.ISOPeriodFormat.class, "cStandard", prevCStandard);
            setStaticField(PeriodType.class, "cStandard", prevCStandard1);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(java.lang.String, org.joda.time.format.PeriodFormatter)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#parse(java.lang.String,org.joda.time.format.PeriodFormatter)}
 * @utbot.invokes {@link org.joda.time.format.PeriodFormatter#parsePeriod(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return formatter.parsePeriod(str);
 *  */
    @Test
    public void testParse_ThrowNullPointerException() {
        /* This test fails because method [org.joda.time.Period.parse] produces [java.lang.NullPointerException]
            org.joda.time.Period.parse(Period.java:92) */
        Period.parse(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String, org.joda.time.format.PeriodFormatter)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#parse(java.lang.String,org.joda.time.format.PeriodFormatter)}
 * @utbot.invokes {@link org.joda.time.format.PeriodFormatter#parsePeriod(java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return formatter.parsePeriod(str);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testParse_ThrowUnsupportedOperationException1() {
        PeriodFormatter periodFormatter = new PeriodFormatter(null, null);
        
        Period.parse(null, periodFormatter);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parse(java.lang.String, org.joda.time.format.PeriodFormatter)
    
    @Test
    public void testParse3() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            setStaticField(periodTypeClazz, "cStandard", null);
            String string = "";
            PeriodFormatter periodFormatter = ((PeriodFormatter) createInstance("org.joda.time.format.PeriodFormatter"));
            Object iParser = createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter");
            setField(periodFormatter, "org.joda.time.format.PeriodFormatter", "iParser", iParser);
            
            Period actual = Period.parse(string, periodFormatter);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(cWeeks, "org.joda.time.PeriodType", "cStandard", iType);
            setField(cWeeks, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            String iName = "Weeks";
            setField(cWeeks, "org.joda.time.PeriodType", "iName", iName);
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName1 = "weeks";
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
            iTypes[0] = ((DurationFieldType) standardDurationFieldType);
            setField(cWeeks, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1, -1, 0, -1, -1, -1, -1, -1};
            setField(cWeeks, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(iType, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            String iName2 = "Standard";
            setField(iType, "org.joda.time.PeriodType", "iName", iName2);
            org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[8];
            Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName3 = "years";
            setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName3);
            iTypes1[0] = ((DurationFieldType) standardDurationFieldType1);
            Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName4 = "months";
            setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName4);
            iTypes1[1] = ((DurationFieldType) standardDurationFieldType2);
            iTypes1[2] = ((DurationFieldType) standardDurationFieldType);
            Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName5 = "days";
            setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName5);
            iTypes1[3] = ((DurationFieldType) standardDurationFieldType3);
            Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName6 = "hours";
            setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName6);
            iTypes1[4] = ((DurationFieldType) standardDurationFieldType4);
            Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName7 = "minutes";
            setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName7);
            iTypes1[5] = ((DurationFieldType) standardDurationFieldType5);
            Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName8 = "seconds";
            setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName8);
            iTypes1[6] = ((DurationFieldType) standardDurationFieldType6);
            Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
            String iName9 = "millis";
            setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName9);
            iTypes1[7] = ((DurationFieldType) standardDurationFieldType7);
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes1);
            int[] iIndices1 = {0, 1, 2, 3, 4, 5, 6, 7};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices1);
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {0, 0, 0, 0, 0, 0, 0, 0};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.lang.String, org.joda.time.format.PeriodFormatter)
    
    @Test
    public void testParse4() throws Exception  {
        PeriodFormatter periodFormatter = ((PeriodFormatter) createInstance("org.joda.time.format.PeriodFormatter"));
        Object iParser = createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter");
        setField(periodFormatter, "org.joda.time.format.PeriodFormatter", "iParser", iParser);
        PeriodType iParseType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        setField(periodFormatter, "org.joda.time.format.PeriodFormatter", "iParseType", iParseType);
        
        /* This test fails because method [org.joda.time.Period.parse] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.size(PeriodType.java:617)
            org.joda.time.base.AbstractPeriod.size(AbstractPeriod.java:56)
            org.joda.time.chrono.BaseChronology.get(BaseChronology.java:276)
            org.joda.time.base.BasePeriod.<init>(BasePeriod.java:258)
            org.joda.time.MutablePeriod.<init>(MutablePeriod.java:200)
            org.joda.time.format.PeriodFormatter.parseMutablePeriod(PeriodFormatter.java:317)
            org.joda.time.format.PeriodFormatter.parsePeriod(PeriodFormatter.java:304)
            org.joda.time.Period.parse(Period.java:92) */
        Period.parse(null, periodFormatter);
    }
    
    @Test
    public void testParse5() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType cStandard = new PeriodType(null, null, null);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            PeriodFormatter periodFormatter = ((PeriodFormatter) createInstance("org.joda.time.format.PeriodFormatter"));
            Object iParser = createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter");
            setField(periodFormatter, "org.joda.time.format.PeriodFormatter", "iParser", iParser);
            
            /* This test fails because method [org.joda.time.Period.parse] produces [java.lang.NullPointerException]
                org.joda.time.PeriodType.size(PeriodType.java:617)
                org.joda.time.base.AbstractPeriod.size(AbstractPeriod.java:56)
                org.joda.time.chrono.BaseChronology.get(BaseChronology.java:276)
                org.joda.time.base.BasePeriod.<init>(BasePeriod.java:258)
                org.joda.time.MutablePeriod.<init>(MutablePeriod.java:200)
                org.joda.time.format.PeriodFormatter.parseMutablePeriod(PeriodFormatter.java:317)
                org.joda.time.format.PeriodFormatter.parsePeriod(PeriodFormatter.java:304)
                org.joda.time.Period.parse(Period.java:92) */
            Period.parse(null, periodFormatter);
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.getSeconds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSeconds()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getSeconds()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);}
 *  */
    @Test
    public void testGetSeconds_ReturnGetPeriodTypeGetIndexedField() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        try {
            PeriodType.SECOND_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            int actual = period.getSeconds();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getSeconds()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);}
 *  */
    @Test
    public void testGetSeconds_ReturnGetPeriodTypeGetIndexedField_1() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        try {
            PeriodType.SECOND_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            int actual = period.getSeconds();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSeconds()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getSeconds()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
 *  */
    @Test
    public void testGetSeconds_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        try {
            PeriodType.SECOND_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.getSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getSeconds(Period.java:792) */
            period.getSeconds();
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getSeconds()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
 *  */
    @Test
    public void testGetSeconds_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        try {
            PeriodType.SECOND_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.getSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getSeconds(Period.java:792) */
            period.getSeconds();
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getSeconds()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
 *  */
    @Test
    public void testGetSeconds_ThrowNullPointerException() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        try {
            PeriodType.SECOND_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.getSeconds] produces [java.lang.NullPointerException]
                org.joda.time.Period.getSeconds(Period.java:792) */
            period.getSeconds();
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.days
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method days(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#days(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#standard()}
 * @utbot.returnsFrom {@code return new Period(new int[] { 0, 0, 0, days, 0, 0, 0, 0 }, PeriodType.standard());}
 *  */
    @Test
    public void testDays_PeriodTypeStandard() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType cStandard = new PeriodType(null, null, null);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            
            Period actual = Period.days(-255);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(cWeeks, "org.joda.time.PeriodType", "cStandard", iType);
            setField(cWeeks, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            String iName = "Weeks";
            setField(cWeeks, "org.joda.time.PeriodType", "iName", iName);
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName1 = "weeks";
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
            iTypes[0] = ((DurationFieldType) standardDurationFieldType);
            setField(cWeeks, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1, -1, 0, -1, -1, -1, -1, -1};
            setField(cWeeks, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(iType, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {0, 0, 0, -255, 0, 0, 0, 0};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.plus
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method plus(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plus(org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (period == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPlus_PeriodEqualsNull() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.plus(null);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method plus(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plus(org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlus_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        /* This test fails because method [org.joda.time.Period.plus] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plus(Period.java:1027) */
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class weeksType = Class.forName("org.joda.time.ReadablePeriod");
        Method plusMethod = periodClazz.getDeclaredMethod("plus", weeksType);
        plusMethod.setAccessible(true);
        java.lang.Object[] plusMethodArguments = new java.lang.Object[1];
        plusMethodArguments[0] = weeks;
        try {
            plusMethod.invoke(period, plusMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plus(org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlus_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        /* This test fails because method [org.joda.time.Period.plus] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plus(Period.java:1027) */
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class weeksType = Class.forName("org.joda.time.ReadablePeriod");
        Method plusMethod = periodClazz.getDeclaredMethod("plus", weeksType);
        plusMethod.setAccessible(true);
        java.lang.Object[] plusMethodArguments = new java.lang.Object[1];
        plusMethodArguments[0] = weeks;
        try {
            plusMethod.invoke(period, plusMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method plus(org.joda.time.ReadablePeriod)
    
    @Test
    public void testPlus1() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            Period period1 = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.plus] produces [java.lang.NullPointerException]
                org.joda.time.base.AbstractPeriod.indexOf(AbstractPeriod.java:137)
                org.joda.time.base.AbstractPeriod.get(AbstractPeriod.java:113)
                org.joda.time.Period.plus(Period.java:1028) */
            period.plus(period1);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    
    @Test
    public void testPlus2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {null, null};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            Period period1 = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.plus] produces [java.lang.NullPointerException]
                org.joda.time.base.AbstractPeriod.indexOf(AbstractPeriod.java:137)
                org.joda.time.base.AbstractPeriod.get(AbstractPeriod.java:113)
                org.joda.time.Period.plus(Period.java:1028) */
            period.plus(period1);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.hours
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hours(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#hours(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#standard()}
 * @utbot.returnsFrom {@code return new Period(new int[] { 0, 0, 0, 0, hours, 0, 0, 0 }, PeriodType.standard());}
 *  */
    @Test
    public void testHours_PeriodTypeStandard() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType cStandard = new PeriodType(null, null, null);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            
            Period actual = Period.hours(-255);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(cWeeks, "org.joda.time.PeriodType", "cStandard", iType);
            setField(cWeeks, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            String iName = "Weeks";
            setField(cWeeks, "org.joda.time.PeriodType", "iName", iName);
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName1 = "weeks";
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
            iTypes[0] = ((DurationFieldType) standardDurationFieldType);
            setField(cWeeks, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1, -1, 0, -1, -1, -1, -1, -1};
            setField(cWeeks, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(iType, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {0, 0, 0, 0, -255, 0, 0, 0};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.minutes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minutes(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minutes(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#standard()}
 * @utbot.returnsFrom {@code return new Period(new int[] { 0, 0, 0, 0, 0, minutes, 0, 0 }, PeriodType.standard());}
 *  */
    @Test
    public void testMinutes_PeriodTypeStandard() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType cStandard = new PeriodType(null, null, null);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            
            Period actual = Period.minutes(-255);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {0, 0, 0, 0, 0, -255, 0, 0};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.seconds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method seconds(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#seconds(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#standard()}
 * @utbot.returnsFrom {@code return new Period(new int[] { 0, 0, 0, 0, 0, 0, seconds, 0 }, PeriodType.standard());}
 *  */
    @Test
    public void testSeconds_PeriodTypeStandard() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType cStandard = new PeriodType(null, null, null);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            
            Period actual = Period.seconds(-255);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {0, 0, 0, 0, 0, 0, -255, 0};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.negated
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method negated()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#negated()}
     */
    @Test(expected = ArithmeticException.class)
    public void testNegatedThrowsAE() {
        Period period = new Period(-1, -1, Integer.MAX_VALUE, 0, 2143289343, Integer.MIN_VALUE, 1, 1);
        
        period.negated();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method negated()
    
    @Test
    public void testNegated1() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            setStaticField(periodTypeClazz, "cStandard", null);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.negated] produces [java.lang.NullPointerException]
                org.joda.time.base.AbstractPeriod.size(AbstractPeriod.java:56)
                org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:95)
                org.joda.time.Period.multipliedBy(Period.java:1337)
                org.joda.time.Period.negated(Period.java:1352) */
            period.negated();
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.plusSeconds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method plusSeconds(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusSeconds(int)}
 * @utbot.executesCondition {@code (seconds == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPlusSeconds_SecondsEqualsZero() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.plusSeconds(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method plusSeconds(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusSeconds(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusSeconds_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusSeconds(Period.java:1161) */
        period.plusSeconds(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusSeconds(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusSeconds_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusSeconds(Period.java:1161) */
        period.plusSeconds(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusSeconds(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, seconds);
 *  */
    @Test
    public void testPlusSeconds_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        try {
            PeriodType.SECOND_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.plusSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
                org.joda.time.Period.plusSeconds(Period.java:1162) */
            period.plusSeconds(-255);
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusSeconds(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, seconds);
 *  */
    @Test
    public void testPlusSeconds_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        try {
            PeriodType.SECOND_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.plusSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusSeconds(Period.java:1162) */
            period.plusSeconds(-255);
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method plusSeconds(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#plusSeconds(int)}
     */
    @Test
    public void testPlusSecondsWithCornerCase() throws Exception  {
        Period period = new Period(1, Integer.MIN_VALUE, -1, Integer.MIN_VALUE, 1, 1, 0, Integer.MAX_VALUE);
        
        Period actual = period.plusSeconds(Integer.MIN_VALUE);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, Integer.MIN_VALUE, -1, Integer.MIN_VALUE, 1, 1, Integer.MIN_VALUE, Integer.MAX_VALUE};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method plusSeconds(int)
    
    @Test
    public void testPlusSeconds1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusSeconds] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusSeconds(Period.java:1162) */
        period.plusSeconds(1);
    }
    
    @Test
    public void testPlusSeconds2() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusSeconds] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusSeconds(Period.java:1162) */
        period.plusSeconds(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.plusMillis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method plusMillis(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusMillis(int)}
 * @utbot.executesCondition {@code (millis == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPlusMillis_MillisEqualsZero() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.plusMillis(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method plusMillis(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusMillis(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusMillis_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusMillis(Period.java:1179) */
        period.plusMillis(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusMillis(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusMillis_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusMillis(Period.java:1179) */
        period.plusMillis(-255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method plusMillis(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#plusMillis(int)}
     */
    @Test
    public void testPlusMillisWithCornerCase() throws Exception  {
        Period period = new Period(1, Integer.MIN_VALUE, -1, Integer.MIN_VALUE, 1, 1, 0, Integer.MAX_VALUE);
        
        Period actual = period.plusMillis(Integer.MIN_VALUE);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, Integer.MIN_VALUE, -1, Integer.MIN_VALUE, 1, 1, 0, -1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method plusMillis(int)
    
    @Test
    public void testPlusMillis1() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.MILLI_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {
                0, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.plusMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusMillis(Period.java:1180) */
            period.plusMillis(1);
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    
    @Test
    public void testPlusMillis2() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusMillis] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusMillis(Period.java:1180) */
        period.plusMillis(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.multipliedBy
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multipliedBy(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#multipliedBy(int)}
     */
    @Test(expected = ArithmeticException.class)
    public void testMultipliedByThrowsAEWithCornerCase() {
        Period period = new Period(1, -1, Integer.MIN_VALUE, 1, 1, 1, 0, 1);
        
        period.multipliedBy(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method multipliedBy(int)
    
    @Test
    public void testMultipliedBy1() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            setStaticField(periodTypeClazz, "cStandard", null);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.multipliedBy] produces [java.lang.NullPointerException]
                org.joda.time.base.AbstractPeriod.size(AbstractPeriod.java:56)
                org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:95)
                org.joda.time.Period.multipliedBy(Period.java:1337) */
            period.multipliedBy(0);
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.plusDays
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method plusDays(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusDays(int)}
 * @utbot.executesCondition {@code (days == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPlusDays_DaysEqualsZero() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.plusDays(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method plusDays(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusDays(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusDays_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusDays(Period.java:1107) */
        period.plusDays(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusDays(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusDays_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusDays(Period.java:1107) */
        period.plusDays(-255);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method plusDays(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#plusDays(int)}
     */
    @Test(expected = ArithmeticException.class)
    public void testPlusDaysThrowsAEWithCornerCase() {
        Period period = new Period(1, Integer.MIN_VALUE, -1, Integer.MIN_VALUE, 1, 1, 0, Integer.MAX_VALUE);
        
        period.plusDays(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method plusDays(int)
    
    @Test
    public void testPlusDays1() throws Exception  {
        int prevDAY_INDEX = PeriodType.DAY_INDEX;
        try {
            PeriodType.DAY_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {
                0, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.plusDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusDays(Period.java:1108) */
            period.plusDays(1);
        } finally {
            PeriodType.DAY_INDEX = prevDAY_INDEX;
        }
    }
    
    @Test
    public void testPlusDays2() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusDays] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusDays(Period.java:1108) */
        period.plusDays(1);
    }
    
    @Test
    public void testPlusDays3() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusDays] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusDays(Period.java:1108) */
        period.plusDays(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.plusHours
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method plusHours(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusHours(int)}
 * @utbot.executesCondition {@code (hours == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPlusHours_HoursEqualsZero() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.plusHours(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method plusHours(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusHours(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusHours_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusHours(Period.java:1125) */
        period.plusHours(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusHours(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusHours_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusHours(Period.java:1125) */
        period.plusHours(-255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method plusHours(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#plusHours(int)}
     */
    @Test
    public void testPlusHoursWithCornerCase() throws Exception  {
        Period period = new Period(1, Integer.MIN_VALUE, -1, Integer.MIN_VALUE, 1, 1, 0, Integer.MAX_VALUE);
        
        Period actual = period.plusHours(Integer.MIN_VALUE);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, Integer.MIN_VALUE, -1, Integer.MIN_VALUE, -2147483647, 1, 0, Integer.MAX_VALUE};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method plusHours(int)
    
    @Test
    public void testPlusHours1() throws Exception  {
        int prevHOUR_INDEX = PeriodType.HOUR_INDEX;
        try {
            PeriodType.HOUR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {
                0, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.plusHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusHours(Period.java:1126) */
            period.plusHours(1);
        } finally {
            PeriodType.HOUR_INDEX = prevHOUR_INDEX;
        }
    }
    
    @Test
    public void testPlusHours2() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusHours] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusHours(Period.java:1126) */
        period.plusHours(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.plusMinutes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method plusMinutes(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusMinutes(int)}
 * @utbot.executesCondition {@code (minutes == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPlusMinutes_MinutesEqualsZero() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.plusMinutes(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method plusMinutes(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusMinutes(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusMinutes_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusMinutes(Period.java:1143) */
        period.plusMinutes(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusMinutes(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusMinutes_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusMinutes(Period.java:1143) */
        period.plusMinutes(-255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method plusMinutes(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#plusMinutes(int)}
     */
    @Test
    public void testPlusMinutesWithCornerCase() throws Exception  {
        Period period = new Period(1, Integer.MIN_VALUE, -1, Integer.MIN_VALUE, 1, 1, 0, Integer.MAX_VALUE);
        
        Period actual = period.plusMinutes(Integer.MIN_VALUE);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, Integer.MIN_VALUE, -1, Integer.MIN_VALUE, 1, -2147483647, 0, Integer.MAX_VALUE};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method plusMinutes(int)
    
    @Test
    public void testPlusMinutes1() throws Exception  {
        int prevMINUTE_INDEX = PeriodType.MINUTE_INDEX;
        try {
            PeriodType.MINUTE_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {
                0, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.plusMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusMinutes(Period.java:1144) */
            period.plusMinutes(1);
        } finally {
            PeriodType.MINUTE_INDEX = prevMINUTE_INDEX;
        }
    }
    
    @Test
    public void testPlusMinutes2() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusMinutes] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusMinutes(Period.java:1144) */
        period.plusMinutes(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.minus
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minus(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minus(org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (period == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMinus_PeriodEqualsNull() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.minus(null);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method minus(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minus(org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testMinus_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        /* This test fails because method [org.joda.time.Period.minus] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.minus(Period.java:1206) */
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class weeksType = Class.forName("org.joda.time.ReadablePeriod");
        Method minusMethod = periodClazz.getDeclaredMethod("minus", weeksType);
        minusMethod.setAccessible(true);
        java.lang.Object[] minusMethodArguments = new java.lang.Object[1];
        minusMethodArguments[0] = weeks;
        try {
            minusMethod.invoke(period, minusMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minus(org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testMinus_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        /* This test fails because method [org.joda.time.Period.minus] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.minus(Period.java:1206) */
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class weeksType = Class.forName("org.joda.time.ReadablePeriod");
        Method minusMethod = periodClazz.getDeclaredMethod("minus", weeksType);
        minusMethod.setAccessible(true);
        java.lang.Object[] minusMethodArguments = new java.lang.Object[1];
        minusMethodArguments[0] = weeks;
        try {
            minusMethod.invoke(period, minusMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method minus(org.joda.time.ReadablePeriod)
    
    @Test
    public void testMinus1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Period period1 = ((Period) createInstance("org.joda.time.Period"));
        
        /* This test fails because method [org.joda.time.Period.minus] produces [java.lang.NullPointerException]
            org.joda.time.base.AbstractPeriod.indexOf(AbstractPeriod.java:137)
            org.joda.time.base.AbstractPeriod.get(AbstractPeriod.java:113)
            org.joda.time.Period.minus(Period.java:1207) */
        period.minus(period1);
    }
    
    @Test
    public void testMinus2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {null};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                0, 0, 0, 0, 0, 0, 0, 0,
                0
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            Period period1 = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.minus] produces [java.lang.NullPointerException]
                org.joda.time.base.AbstractPeriod.indexOf(AbstractPeriod.java:137)
                org.joda.time.base.AbstractPeriod.get(AbstractPeriod.java:113)
                org.joda.time.Period.minus(Period.java:1207) */
            period.minus(period1);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.withSeconds
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withSeconds(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withSeconds(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testWithSeconds_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withSeconds(Period.java:985) */
        period.withSeconds(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withSeconds(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().setIndexedField(this, PeriodType.SECOND_INDEX, values, seconds);
 *  */
    @Test
    public void testWithSeconds_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        try {
            PeriodType.SECOND_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.withSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
                org.joda.time.PeriodType.setIndexedField(PeriodType.java:692)
                org.joda.time.Period.withSeconds(Period.java:986) */
            period.withSeconds(-255);
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withSeconds(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#withSeconds(int)}
     */
    @Test
    public void testWithSeconds() throws Exception  {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        Period actual = period.withSeconds(-1);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withSeconds(int)
    
    @Test
    public void testWithSeconds1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withSeconds(Period.java:985) */
        period.withSeconds(0);
    }
    
    @Test
    public void testWithSeconds2() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withSeconds] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.setIndexedField(PeriodType.java:688)
            org.joda.time.Period.withSeconds(Period.java:986) */
        period.withSeconds(0);
    }
    
    @Test
    public void testWithSeconds3() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withSeconds] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.setIndexedField(PeriodType.java:688)
            org.joda.time.Period.withSeconds(Period.java:986) */
        period.withSeconds(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.minusDays
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minusDays(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusDays(int)}
 * @utbot.invokes {@link org.joda.time.Period#plusDays(int)}
 * @utbot.returnsFrom {@code return plusDays(-days);}
 *  */
    @Test
    public void testMinusDays_PeriodPlusDays() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.minusDays(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method minusDays(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusDays(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return plusDays(-days);
 *  */
    @Test
    public void testMinusDays_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusDays(Period.java:1107)
            org.joda.time.Period.minusDays(Period.java:1268) */
        period.minusDays(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusDays(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return plusDays(-days);
 *  */
    @Test
    public void testMinusDays_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusDays(Period.java:1107)
            org.joda.time.Period.minusDays(Period.java:1268) */
        period.minusDays(-255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method minusDays(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#minusDays(int)}
     */
    @Test
    public void testMinusDays() throws Exception  {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        Period actual = period.minusDays(-1);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, -1, -1, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method minusDays(int)
    
    @Test
    public void testMinusDays1() throws Exception  {
        int prevDAY_INDEX = PeriodType.DAY_INDEX;
        try {
            PeriodType.DAY_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {
                0, -19, -19, -19, -19, -19, -19, -19,
                -19
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.minusDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusDays(Period.java:1108)
                org.joda.time.Period.minusDays(Period.java:1268) */
            period.minusDays(1);
        } finally {
            PeriodType.DAY_INDEX = prevDAY_INDEX;
        }
    }
    
    @Test
    public void testMinusDays2() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusDays] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusDays(Period.java:1108)
            org.joda.time.Period.minusDays(Period.java:1268) */
        period.minusDays(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.minusHours
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minusHours(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusHours(int)}
 * @utbot.invokes {@link org.joda.time.Period#plusHours(int)}
 * @utbot.returnsFrom {@code return plusHours(-hours);}
 *  */
    @Test
    public void testMinusHours_PeriodPlusHours() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.minusHours(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method minusHours(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusHours(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMinusHours_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusHours(Period.java:1125)
            org.joda.time.Period.minusHours(Period.java:1281) */
        period.minusHours(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusHours(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMinusHours_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusHours(Period.java:1125)
            org.joda.time.Period.minusHours(Period.java:1281) */
        period.minusHours(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusHours(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#addIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.Period#plusHours(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return plusHours(-hours);
 *  */
    @Test
    public void testMinusHours_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevHOUR_INDEX = PeriodType.HOUR_INDEX;
        try {
            PeriodType.HOUR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.minusHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusHours(Period.java:1126)
                org.joda.time.Period.minusHours(Period.java:1281) */
            period.minusHours(-255);
        } finally {
            PeriodType.HOUR_INDEX = prevHOUR_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method minusHours(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#minusHours(int)}
     */
    @Test(expected = ArithmeticException.class)
    public void testMinusHoursThrowsAE() {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        period.minusHours(-1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method minusHours(int)
    
    @Test
    public void testMinusHours1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusHours] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusHours(Period.java:1126)
            org.joda.time.Period.minusHours(Period.java:1281) */
        period.minusHours(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.minusMinutes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minusMinutes(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusMinutes(int)}
 * @utbot.invokes {@link org.joda.time.Period#plusMinutes(int)}
 * @utbot.returnsFrom {@code return plusMinutes(-minutes);}
 *  */
    @Test
    public void testMinusMinutes_PeriodPlusMinutes() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.minusMinutes(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method minusMinutes(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusMinutes(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMinusMinutes_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusMinutes(Period.java:1143)
            org.joda.time.Period.minusMinutes(Period.java:1294) */
        period.minusMinutes(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusMinutes(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMinusMinutes_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusMinutes(Period.java:1143)
            org.joda.time.Period.minusMinutes(Period.java:1294) */
        period.minusMinutes(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusMinutes(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#addIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.Period#plusMinutes(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return plusMinutes(-minutes);
 *  */
    @Test
    public void testMinusMinutes_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevMINUTE_INDEX = PeriodType.MINUTE_INDEX;
        try {
            PeriodType.MINUTE_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.minusMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusMinutes(Period.java:1144)
                org.joda.time.Period.minusMinutes(Period.java:1294) */
            period.minusMinutes(-255);
        } finally {
            PeriodType.MINUTE_INDEX = prevMINUTE_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method minusMinutes(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#minusMinutes(int)}
     */
    @Test(expected = ArithmeticException.class)
    public void testMinusMinutesThrowsAE() {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        period.minusMinutes(-1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method minusMinutes(int)
    
    @Test
    public void testMinusMinutes1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusMinutes] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusMinutes(Period.java:1144)
            org.joda.time.Period.minusMinutes(Period.java:1294) */
        period.minusMinutes(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.minusSeconds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minusSeconds(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusSeconds(int)}
 * @utbot.invokes {@link org.joda.time.Period#plusSeconds(int)}
 * @utbot.returnsFrom {@code return plusSeconds(-seconds);}
 *  */
    @Test
    public void testMinusSeconds_PeriodPlusSeconds() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.minusSeconds(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method minusSeconds(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusSeconds(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMinusSeconds_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusSeconds(Period.java:1161)
            org.joda.time.Period.minusSeconds(Period.java:1307) */
        period.minusSeconds(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusSeconds(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMinusSeconds_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusSeconds(Period.java:1161)
            org.joda.time.Period.minusSeconds(Period.java:1307) */
        period.minusSeconds(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusSeconds(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return plusSeconds(-seconds);
 *  */
    @Test
    public void testMinusSeconds_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        try {
            PeriodType.SECOND_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.minusSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusSeconds(Period.java:1162)
                org.joda.time.Period.minusSeconds(Period.java:1307) */
            period.minusSeconds(-255);
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusSeconds(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return plusSeconds(-seconds);
 *  */
    @Test
    public void testMinusSeconds_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        try {
            PeriodType.SECOND_INDEX = 1073741824;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.minusSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
                org.joda.time.Period.plusSeconds(Period.java:1162)
                org.joda.time.Period.minusSeconds(Period.java:1307) */
            period.minusSeconds(-255);
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method minusSeconds(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#minusSeconds(int)}
     */
    @Test
    public void testMinusSeconds() throws Exception  {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        Period actual = period.minusSeconds(-1);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method minusSeconds(int)
    
    @Test
    public void testMinusSeconds1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusSeconds] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusSeconds(Period.java:1162)
            org.joda.time.Period.minusSeconds(Period.java:1307) */
        period.minusSeconds(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.minusMillis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minusMillis(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusMillis(int)}
 * @utbot.invokes {@link org.joda.time.Period#plusMillis(int)}
 * @utbot.returnsFrom {@code return plusMillis(-millis);}
 *  */
    @Test
    public void testMinusMillis_PeriodPlusMillis() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.minusMillis(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method minusMillis(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusMillis(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMinusMillis_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusMillis(Period.java:1179)
            org.joda.time.Period.minusMillis(Period.java:1320) */
        period.minusMillis(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusMillis(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMinusMillis_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusMillis(Period.java:1179)
            org.joda.time.Period.minusMillis(Period.java:1320) */
        period.minusMillis(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusMillis(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return plusMillis(-millis);
 *  */
    @Test
    public void testMinusMillis_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.MILLI_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.minusMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusMillis(Period.java:1180)
                org.joda.time.Period.minusMillis(Period.java:1320) */
            period.minusMillis(-255);
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusMillis(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return plusMillis(-millis);
 *  */
    @Test
    public void testMinusMillis_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.MILLI_INDEX = 1073741824;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.minusMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
                org.joda.time.Period.plusMillis(Period.java:1180)
                org.joda.time.Period.minusMillis(Period.java:1320) */
            period.minusMillis(-255);
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method minusMillis(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#minusMillis(int)}
     */
    @Test
    public void testMinusMillis() throws Exception  {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        Period actual = period.minusMillis(-1);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 2};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method minusMillis(int)
    
    @Test
    public void testMinusMillis1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusMillis] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusMillis(Period.java:1180)
            org.joda.time.Period.minusMillis(Period.java:1320) */
        period.minusMillis(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.minusYears
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minusYears(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusYears(int)}
 * @utbot.invokes {@link org.joda.time.Period#plusYears(int)}
 * @utbot.returnsFrom {@code return plusYears(-years);}
 *  */
    @Test
    public void testMinusYears_PeriodPlusYears() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.minusYears(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method minusYears(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusYears(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMinusYears_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusYears] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusYears(Period.java:1053)
            org.joda.time.Period.minusYears(Period.java:1229) */
        period.minusYears(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusYears(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMinusYears_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusYears] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusYears(Period.java:1053)
            org.joda.time.Period.minusYears(Period.java:1229) */
        period.minusYears(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusYears(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#addIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.Period#plusYears(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return plusYears(-years);
 *  */
    @Test
    public void testMinusYears_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.minusYears] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusYears(Period.java:1054)
                org.joda.time.Period.minusYears(Period.java:1229) */
            period.minusYears(-255);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method minusYears(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#minusYears(int)}
     */
    @Test
    public void testMinusYears() throws Exception  {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        Period actual = period.minusYears(-1);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {2, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method minusYears(int)
    
    @Test
    public void testMinusYears1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusYears] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusYears(Period.java:1054)
            org.joda.time.Period.minusYears(Period.java:1229) */
        period.minusYears(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.plusMonths
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method plusMonths(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusMonths(int)}
 * @utbot.executesCondition {@code (months == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPlusMonths_MonthsEqualsZero() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.plusMonths(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method plusMonths(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusMonths(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusMonths_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusMonths(Period.java:1071) */
        period.plusMonths(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusMonths(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusMonths_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusMonths(Period.java:1071) */
        period.plusMonths(-255);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method plusMonths(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#plusMonths(int)}
     */
    @Test(expected = ArithmeticException.class)
    public void testPlusMonthsThrowsAEWithCornerCase() {
        Period period = new Period(1, Integer.MIN_VALUE, -1, Integer.MIN_VALUE, 1, 1, 0, Integer.MAX_VALUE);
        
        period.plusMonths(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method plusMonths(int)
    
    @Test
    public void testPlusMonths1() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {
                0, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.plusMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusMonths(Period.java:1072) */
            period.plusMonths(1);
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    @Test
    public void testPlusMonths2() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusMonths] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusMonths(Period.java:1072) */
        period.plusMonths(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.plusWeeks
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method plusWeeks(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusWeeks(int)}
 * @utbot.executesCondition {@code (weeks == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPlusWeeks_WeeksEqualsZero() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.plusWeeks(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method plusWeeks(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusWeeks(int)}
 * @utbot.executesCondition {@code (weeks == 0): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.joda.time.Period#getValues()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#addIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#addIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, weeks);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testPlusWeeks_ThrowUnsupportedOperationException() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.plusWeeks(-255);
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method plusWeeks(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusWeeks(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusWeeks_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusWeeks(Period.java:1089) */
        period.plusWeeks(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusWeeks(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusWeeks_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusWeeks(Period.java:1089) */
        period.plusWeeks(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusWeeks(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, weeks);
 *  */
    @Test
    public void testPlusWeeks_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.plusWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
                org.joda.time.Period.plusWeeks(Period.java:1090) */
            period.plusWeeks(-255);
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusWeeks(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, weeks);
 *  */
    @Test
    public void testPlusWeeks_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.plusWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusWeeks(Period.java:1090) */
            period.plusWeeks(-255);
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method plusWeeks(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#plusWeeks(int)}
     */
    @Test(expected = ArithmeticException.class)
    public void testPlusWeeksThrowsAEWithCornerCase() {
        Period period = new Period(1, Integer.MIN_VALUE, -1, Integer.MIN_VALUE, 1, 1, 0, Integer.MAX_VALUE);
        
        period.plusWeeks(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method plusWeeks(int)
    
    @Test
    public void testPlusWeeks1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusWeeks] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusWeeks(Period.java:1090) */
        period.plusWeeks(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.years
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method years(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#years(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#standard()}
 * @utbot.returnsFrom {@code return new Period(new int[] { years, 0, 0, 0, 0, 0, 0, 0, 0 }, PeriodType.standard());}
 *  */
    @Test
    public void testYears_PeriodTypeStandard() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType cStandard = new PeriodType(null, null, null);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            
            Period actual = Period.years(-255);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(cWeeks, "org.joda.time.PeriodType", "cStandard", iType);
            setField(cWeeks, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            String iName = "Weeks";
            setField(cWeeks, "org.joda.time.PeriodType", "iName", iName);
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName1 = "weeks";
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
            iTypes[0] = ((DurationFieldType) standardDurationFieldType);
            setField(cWeeks, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1, -1, 0, -1, -1, -1, -1, -1};
            setField(cWeeks, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(iType, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                -255, 0, 0, 0, 0, 0, 0, 0,
                0
            };
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.months
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method months(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#months(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#standard()}
 * @utbot.returnsFrom {@code return new Period(new int[] { 0, months, 0, 0, 0, 0, 0, 0 }, PeriodType.standard());}
 *  */
    @Test
    public void testMonths_PeriodTypeStandard() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType cStandard = new PeriodType(null, null, null);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            
            Period actual = Period.months(-255);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(cWeeks, "org.joda.time.PeriodType", "cStandard", iType);
            setField(cWeeks, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            String iName = "Weeks";
            setField(cWeeks, "org.joda.time.PeriodType", "iName", iName);
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName1 = "weeks";
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
            iTypes[0] = ((DurationFieldType) standardDurationFieldType);
            setField(cWeeks, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1, -1, 0, -1, -1, -1, -1, -1};
            setField(cWeeks, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(iType, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {0, -255, 0, 0, 0, 0, 0, 0};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method months(int)
    
    @Test
    public void testMonths1() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            setStaticField(periodTypeClazz, "cStandard", null);
            
            Period actual = Period.months(0);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(cWeeks, "org.joda.time.PeriodType", "cStandard", iType);
            setField(cWeeks, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            String iName = "Weeks";
            setField(cWeeks, "org.joda.time.PeriodType", "iName", iName);
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName1 = "weeks";
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
            iTypes[0] = ((DurationFieldType) standardDurationFieldType);
            setField(cWeeks, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1, -1, 0, -1, -1, -1, -1, -1};
            setField(cWeeks, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(iType, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            String iName2 = "Standard";
            setField(iType, "org.joda.time.PeriodType", "iName", iName2);
            org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[8];
            Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName3 = "years";
            setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName3);
            iTypes1[0] = ((DurationFieldType) standardDurationFieldType1);
            Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName4 = "months";
            setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName4);
            iTypes1[1] = ((DurationFieldType) standardDurationFieldType2);
            iTypes1[2] = ((DurationFieldType) standardDurationFieldType);
            Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName5 = "days";
            setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName5);
            iTypes1[3] = ((DurationFieldType) standardDurationFieldType3);
            Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName6 = "hours";
            setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName6);
            iTypes1[4] = ((DurationFieldType) standardDurationFieldType4);
            Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName7 = "minutes";
            setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName7);
            iTypes1[5] = ((DurationFieldType) standardDurationFieldType5);
            Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName8 = "seconds";
            setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName8);
            iTypes1[6] = ((DurationFieldType) standardDurationFieldType6);
            Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
            String iName9 = "millis";
            setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName9);
            iTypes1[7] = ((DurationFieldType) standardDurationFieldType7);
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes1);
            int[] iIndices1 = {0, 1, 2, 3, 4, 5, 6, 7};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices1);
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {0, 0, 0, 0, 0, 0, 0, 0};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.weeks
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method weeks(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#weeks(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#standard()}
 * @utbot.returnsFrom {@code return new Period(new int[] { 0, 0, weeks, 0, 0, 0, 0, 0 }, PeriodType.standard());}
 *  */
    @Test
    public void testWeeks_PeriodTypeStandard() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType cStandard = new PeriodType(null, null, null);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            
            Period actual = Period.weeks(-255);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            PeriodType.MONTH_INDEX = 1;
            PeriodType.WEEK_INDEX = 2;
            PeriodType.DAY_INDEX = 3;
            PeriodType.HOUR_INDEX = 4;
            PeriodType.MINUTE_INDEX = 5;
            PeriodType.SECOND_INDEX = 6;
            PeriodType.MILLI_INDEX = 7;
            setField(cWeeks, "org.joda.time.PeriodType", "cStandard", iType);
            setField(cWeeks, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            String iName = "Weeks";
            setField(cWeeks, "org.joda.time.PeriodType", "iName", iName);
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName1 = "weeks";
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
            iTypes[0] = ((DurationFieldType) standardDurationFieldType);
            setField(cWeeks, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1, -1, 0, -1, -1, -1, -1, -1};
            setField(cWeeks, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(iType, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {0, 0, -255, 0, 0, 0, 0, 0};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.getYears
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getYears()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getYears()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);}
 *  */
    @Test
    public void testGetYears_ReturnGetPeriodTypeGetIndexedField() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            int actual = period.getYears();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getYears()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);}
 *  */
    @Test
    public void testGetYears_ReturnGetPeriodTypeGetIndexedField_1() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            int actual = period.getYears();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getYears()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getYears()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
 *  */
    @Test
    public void testGetYears_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.getYears] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getYears(Period.java:737) */
            period.getYears();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getYears()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
 *  */
    @Test
    public void testGetYears_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.getYears] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getYears(Period.java:737) */
            period.getYears();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getYears()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
 *  */
    @Test
    public void testGetYears_ThrowNullPointerException() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.getYears] produces [java.lang.NullPointerException]
                org.joda.time.Period.getYears(Period.java:737) */
            period.getYears();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.getMonths
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMonths()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getMonths()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);}
 *  */
    @Test
    public void testGetMonths_ReturnGetPeriodTypeGetIndexedField() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            int actual = period.getMonths();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getMonths()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);}
 *  */
    @Test
    public void testGetMonths_ReturnGetPeriodTypeGetIndexedField_1() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            int actual = period.getMonths();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMonths()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getMonths()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
 *  */
    @Test
    public void testGetMonths_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.getMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getMonths(Period.java:746) */
            period.getMonths();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getMonths()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
 *  */
    @Test
    public void testGetMonths_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.getMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMonths(Period.java:746) */
            period.getMonths();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getMonths()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
 *  */
    @Test
    public void testGetMonths_ThrowNullPointerException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.getMonths] produces [java.lang.NullPointerException]
                org.joda.time.Period.getMonths(Period.java:746) */
            period.getMonths();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.getDays
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDays()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getDays()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);}
 *  */
    @Test
    public void testGetDays_ReturnGetPeriodTypeGetIndexedField() throws Exception  {
        int prevDAY_INDEX = PeriodType.DAY_INDEX;
        try {
            PeriodType.DAY_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            int actual = period.getDays();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.DAY_INDEX = prevDAY_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getDays()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);}
 *  */
    @Test
    public void testGetDays_ReturnGetPeriodTypeGetIndexedField_1() throws Exception  {
        int prevDAY_INDEX = PeriodType.DAY_INDEX;
        try {
            PeriodType.DAY_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            int actual = period.getDays();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.DAY_INDEX = prevDAY_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDays()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getDays()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
 *  */
    @Test
    public void testGetDays_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        int prevDAY_INDEX = PeriodType.DAY_INDEX;
        try {
            PeriodType.DAY_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.getDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getDays(Period.java:764) */
            period.getDays();
        } finally {
            PeriodType.DAY_INDEX = prevDAY_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getDays()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
 *  */
    @Test
    public void testGetDays_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevDAY_INDEX = PeriodType.DAY_INDEX;
        try {
            PeriodType.DAY_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.getDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getDays(Period.java:764) */
            period.getDays();
        } finally {
            PeriodType.DAY_INDEX = prevDAY_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getDays()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
 *  */
    @Test
    public void testGetDays_ThrowNullPointerException() throws Exception  {
        int prevDAY_INDEX = PeriodType.DAY_INDEX;
        try {
            PeriodType.DAY_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.getDays] produces [java.lang.NullPointerException]
                org.joda.time.Period.getDays(Period.java:764) */
            period.getDays();
        } finally {
            PeriodType.DAY_INDEX = prevDAY_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.plusYears
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method plusYears(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusYears(int)}
 * @utbot.executesCondition {@code (years == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPlusYears_YearsEqualsZero() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.plusYears(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method plusYears(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusYears(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusYears_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusYears] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusYears(Period.java:1053) */
        period.plusYears(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusYears(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testPlusYears_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusYears] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusYears(Period.java:1053) */
        period.plusYears(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusYears(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, years);
 *  */
    @Test
    public void testPlusYears_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.plusYears] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
                org.joda.time.Period.plusYears(Period.java:1054) */
            period.plusYears(-255);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusYears(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, years);
 *  */
    @Test
    public void testPlusYears_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.plusYears] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusYears(Period.java:1054) */
            period.plusYears(-255);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method plusYears(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#plusYears(int)}
 * @utbot.executesCondition {@code (years == 0): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.joda.time.Period#getValues()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#addIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#addIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, years);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testPlusYears_ThrowUnsupportedOperationException() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.plusYears(-255);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method plusYears(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#plusYears(int)}
     */
    @Test
    public void testPlusYearsWithCornerCase() throws Exception  {
        Period period = new Period(1, Integer.MIN_VALUE, -1, Integer.MIN_VALUE, 1, 1, 0, Integer.MAX_VALUE);
        
        Period actual = period.plusYears(Integer.MIN_VALUE);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {-2147483647, Integer.MIN_VALUE, -1, Integer.MIN_VALUE, 1, 1, 0, Integer.MAX_VALUE};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method plusYears(int)
    
    @Test
    public void testPlusYears1() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {null};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {
                0, -31, -31, -31, -31, -31, -31, -31,
                -31
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            Period actual = period.plusYears(16);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {16};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
            
            assertNull(finalPeriodITypeITypes0);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    
    @Test
    public void testPlusYears2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {null};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {
                0, -31, -31, -31, -31, -31, -31, -31,
                -31
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            Period actual = period.plusYears(-1098185679);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {-1098185679};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
            
            assertNull(finalPeriodITypeITypes0);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method plusYears(int)
    
    @Test
    public void testPlusYears3() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.plusYears] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusYears(Period.java:1054) */
        period.plusYears(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.withYears
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withYears(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withYears(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.Period#getValues()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.returnsFrom {@code return new Period(values, getPeriodType());}
 *  */
    @Test
    public void testWithYears_PeriodGetPeriodType() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {null};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            Period actual = period.withYears(-255);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {-255};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
            
            assertNull(finalPeriodITypeITypes0);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withYears(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withYears(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testWithYears_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withYears] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withYears(Period.java:895) */
        period.withYears(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withYears(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().setIndexedField(this, PeriodType.YEAR_INDEX, values, years);
 *  */
    @Test
    public void testWithYears_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.withYears] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
                org.joda.time.PeriodType.setIndexedField(PeriodType.java:692)
                org.joda.time.Period.withYears(Period.java:896) */
            period.withYears(-255);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withYears(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().setIndexedField(this, PeriodType.YEAR_INDEX, values, years);
 *  */
    @Test
    public void testWithYears_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 1073741824;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.withYears] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.setIndexedField(PeriodType.java:688)
                org.joda.time.Period.withYears(Period.java:896) */
            period.withYears(-255);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withYears(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testWithYears_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withYears] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withYears(Period.java:895) */
        period.withYears(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withYears(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withYears(int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.joda.time.Period#getValues()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: getPeriodType().setIndexedField(this, PeriodType.YEAR_INDEX, values, years);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWithYears_ThrowUnsupportedOperationException() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.withYears(-255);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withYears(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#withYears(int)}
     */
    @Test
    public void testWithYears() throws Exception  {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        Period actual = period.withYears(-1);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {-1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withYears(int)
    
    @Test
    public void testWithYears1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withYears] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.setIndexedField(PeriodType.java:688)
            org.joda.time.Period.withYears(Period.java:896) */
        period.withYears(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.withMonths
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withMonths(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMonths(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.Period#getValues()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.returnsFrom {@code return new Period(values, getPeriodType());}
 *  */
    @Test
    public void testWithMonths_PeriodGetPeriodType() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {null};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            Period actual = period.withMonths(-255);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {-255};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
            
            assertNull(finalPeriodITypeITypes0);
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withMonths(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMonths(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testWithMonths_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withMonths(Period.java:910) */
        period.withMonths(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMonths(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().setIndexedField(this, PeriodType.MONTH_INDEX, values, months);
 *  */
    @Test
    public void testWithMonths_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.withMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
                org.joda.time.PeriodType.setIndexedField(PeriodType.java:692)
                org.joda.time.Period.withMonths(Period.java:911) */
            period.withMonths(-255);
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMonths(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().setIndexedField(this, PeriodType.MONTH_INDEX, values, months);
 *  */
    @Test
    public void testWithMonths_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 1073741824;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.withMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.setIndexedField(PeriodType.java:688)
                org.joda.time.Period.withMonths(Period.java:911) */
            period.withMonths(-255);
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMonths(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testWithMonths_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withMonths(Period.java:910) */
        period.withMonths(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withMonths(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMonths(int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.joda.time.Period#getValues()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: getPeriodType().setIndexedField(this, PeriodType.MONTH_INDEX, values, months);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWithMonths_ThrowUnsupportedOperationException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.withMonths(-255);
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withMonths(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#withMonths(int)}
     */
    @Test
    public void testWithMonths() throws Exception  {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        Period actual = period.withMonths(-1);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.withDays
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withDays(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withDays(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testWithDays_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withDays(Period.java:940) */
        period.withDays(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withDays(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().setIndexedField(this, PeriodType.DAY_INDEX, values, days);
 *  */
    @Test
    public void testWithDays_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevDAY_INDEX = PeriodType.DAY_INDEX;
        try {
            PeriodType.DAY_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.withDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
                org.joda.time.PeriodType.setIndexedField(PeriodType.java:692)
                org.joda.time.Period.withDays(Period.java:941) */
            period.withDays(-255);
        } finally {
            PeriodType.DAY_INDEX = prevDAY_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withDays(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().setIndexedField(this, PeriodType.DAY_INDEX, values, days);
 *  */
    @Test
    public void testWithDays_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevDAY_INDEX = PeriodType.DAY_INDEX;
        try {
            PeriodType.DAY_INDEX = 1073741824;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.withDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.setIndexedField(PeriodType.java:688)
                org.joda.time.Period.withDays(Period.java:941) */
            period.withDays(-255);
        } finally {
            PeriodType.DAY_INDEX = prevDAY_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withDays(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testWithDays_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withDays(Period.java:940) */
        period.withDays(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withDays(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withDays(int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.joda.time.Period#getValues()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: getPeriodType().setIndexedField(this, PeriodType.DAY_INDEX, values, days);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWithDays_ThrowUnsupportedOperationException() throws Exception  {
        int prevDAY_INDEX = PeriodType.DAY_INDEX;
        try {
            PeriodType.DAY_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.withDays(-255);
        } finally {
            PeriodType.DAY_INDEX = prevDAY_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withDays(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#withDays(int)}
     */
    @Test
    public void testWithDays() throws Exception  {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        Period actual = period.withDays(-1);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withDays(int)
    
    @Test
    public void testWithDays1() throws Exception  {
        int prevDAY_INDEX = PeriodType.DAY_INDEX;
        try {
            PeriodType.DAY_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {null};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {
                0, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            Period actual = period.withDays(0);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {0};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
            
            assertNull(finalPeriodITypeITypes0);
        } finally {
            PeriodType.DAY_INDEX = prevDAY_INDEX;
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withDays(int)
    
    @Test
    public void testWithDays2() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withDays] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.setIndexedField(PeriodType.java:688)
            org.joda.time.Period.withDays(Period.java:941) */
        period.withDays(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.minusMonths
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minusMonths(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusMonths(int)}
 * @utbot.invokes {@link org.joda.time.Period#plusMonths(int)}
 * @utbot.returnsFrom {@code return plusMonths(-months);}
 *  */
    @Test
    public void testMinusMonths_PeriodPlusMonths() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.minusMonths(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method minusMonths(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusMonths(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMinusMonths_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusMonths(Period.java:1071)
            org.joda.time.Period.minusMonths(Period.java:1242) */
        period.minusMonths(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusMonths(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMinusMonths_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusMonths(Period.java:1071)
            org.joda.time.Period.minusMonths(Period.java:1242) */
        period.minusMonths(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusMonths(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return plusMonths(-months);
 *  */
    @Test
    public void testMinusMonths_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.minusMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusMonths(Period.java:1072)
                org.joda.time.Period.minusMonths(Period.java:1242) */
            period.minusMonths(-255);
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusMonths(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return plusMonths(-months);
 *  */
    @Test
    public void testMinusMonths_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 1073741824;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.minusMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
                org.joda.time.Period.plusMonths(Period.java:1072)
                org.joda.time.Period.minusMonths(Period.java:1242) */
            period.minusMonths(-255);
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method minusMonths(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusMonths(int)}
 * @utbot.invokes {@link org.joda.time.Period#plusMonths(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#addIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.Period#plusMonths(int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return plusMonths(-months);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMinusMonths_ThrowUnsupportedOperationException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.minusMonths(-255);
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method minusMonths(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#minusMonths(int)}
     */
    @Test
    public void testMinusMonths() throws Exception  {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        Period actual = period.minusMonths(-1);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, 0, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method minusMonths(int)
    
    @Test
    public void testMinusMonths1() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {null};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {
                0, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            Period actual = period.minusMonths(16);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {-16};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
            
            assertNull(finalPeriodITypeITypes0);
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method minusMonths(int)
    
    @Test
    public void testMinusMonths2() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusMonths] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusMonths(Period.java:1072)
            org.joda.time.Period.minusMonths(Period.java:1242) */
        period.minusMonths(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.minusWeeks
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minusWeeks(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusWeeks(int)}
 * @utbot.invokes {@link org.joda.time.Period#plusWeeks(int)}
 * @utbot.returnsFrom {@code return plusWeeks(-weeks);}
 *  */
    @Test
    public void testMinusWeeks_PeriodPlusWeeks() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.minusWeeks(0);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method minusWeeks(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusWeeks(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMinusWeeks_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusWeeks(Period.java:1089)
            org.joda.time.Period.minusWeeks(Period.java:1255) */
        period.minusWeeks(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusWeeks(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMinusWeeks_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.plusWeeks(Period.java:1089)
            org.joda.time.Period.minusWeeks(Period.java:1255) */
        period.minusWeeks(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusWeeks(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return plusWeeks(-weeks);
 *  */
    @Test
    public void testMinusWeeks_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.minusWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:714)
                org.joda.time.Period.plusWeeks(Period.java:1090)
                org.joda.time.Period.minusWeeks(Period.java:1255) */
            period.minusWeeks(-255);
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusWeeks(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return plusWeeks(-weeks);
 *  */
    @Test
    public void testMinusWeeks_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = 1073741824;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.minusWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
                org.joda.time.Period.plusWeeks(Period.java:1090)
                org.joda.time.Period.minusWeeks(Period.java:1255) */
            period.minusWeeks(-255);
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method minusWeeks(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#minusWeeks(int)}
 * @utbot.invokes {@link org.joda.time.Period#plusWeeks(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#addIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.Period#plusWeeks(int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return plusWeeks(-weeks);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMinusWeeks_ThrowUnsupportedOperationException() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.minusWeeks(-255);
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method minusWeeks(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#minusWeeks(int)}
     */
    @Test
    public void testMinusWeeks() throws Exception  {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        Period actual = period.minusWeeks(-1);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, -1, 0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method minusWeeks(int)
    
    @Test
    public void testMinusWeeks1() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {null};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {
                0, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            Period actual = period.minusWeeks(16);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {-16};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
            
            assertNull(finalPeriodITypeITypes0);
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method minusWeeks(int)
    
    @Test
    public void testMinusWeeks2() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.minusWeeks] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.addIndexedField(PeriodType.java:710)
            org.joda.time.Period.plusWeeks(Period.java:1090)
            org.joda.time.Period.minusWeeks(Period.java:1255) */
        period.minusWeeks(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.getHours
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getHours()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getHours()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);}
 *  */
    @Test
    public void testGetHours_ReturnGetPeriodTypeGetIndexedField() throws Exception  {
        int prevHOUR_INDEX = PeriodType.HOUR_INDEX;
        try {
            PeriodType.HOUR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            int actual = period.getHours();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.HOUR_INDEX = prevHOUR_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getHours()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);}
 *  */
    @Test
    public void testGetHours_ReturnGetPeriodTypeGetIndexedField_1() throws Exception  {
        int prevHOUR_INDEX = PeriodType.HOUR_INDEX;
        try {
            PeriodType.HOUR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            int actual = period.getHours();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.HOUR_INDEX = prevHOUR_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getHours()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getHours()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
 *  */
    @Test
    public void testGetHours_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        int prevHOUR_INDEX = PeriodType.HOUR_INDEX;
        try {
            PeriodType.HOUR_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.getHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getHours(Period.java:774) */
            period.getHours();
        } finally {
            PeriodType.HOUR_INDEX = prevHOUR_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getHours()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
 *  */
    @Test
    public void testGetHours_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevHOUR_INDEX = PeriodType.HOUR_INDEX;
        try {
            PeriodType.HOUR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.getHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getHours(Period.java:774) */
            period.getHours();
        } finally {
            PeriodType.HOUR_INDEX = prevHOUR_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getHours()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
 *  */
    @Test
    public void testGetHours_ThrowNullPointerException() throws Exception  {
        int prevHOUR_INDEX = PeriodType.HOUR_INDEX;
        try {
            PeriodType.HOUR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.getHours] produces [java.lang.NullPointerException]
                org.joda.time.Period.getHours(Period.java:774) */
            period.getHours();
        } finally {
            PeriodType.HOUR_INDEX = prevHOUR_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.getMinutes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMinutes()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getMinutes()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);}
 *  */
    @Test
    public void testGetMinutes_ReturnGetPeriodTypeGetIndexedField() throws Exception  {
        int prevMINUTE_INDEX = PeriodType.MINUTE_INDEX;
        try {
            PeriodType.MINUTE_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            int actual = period.getMinutes();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.MINUTE_INDEX = prevMINUTE_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getMinutes()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);}
 *  */
    @Test
    public void testGetMinutes_ReturnGetPeriodTypeGetIndexedField_1() throws Exception  {
        int prevMINUTE_INDEX = PeriodType.MINUTE_INDEX;
        try {
            PeriodType.MINUTE_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            int actual = period.getMinutes();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.MINUTE_INDEX = prevMINUTE_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMinutes()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getMinutes()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
 *  */
    @Test
    public void testGetMinutes_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        int prevMINUTE_INDEX = PeriodType.MINUTE_INDEX;
        try {
            PeriodType.MINUTE_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.getMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getMinutes(Period.java:783) */
            period.getMinutes();
        } finally {
            PeriodType.MINUTE_INDEX = prevMINUTE_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getMinutes()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
 *  */
    @Test
    public void testGetMinutes_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevMINUTE_INDEX = PeriodType.MINUTE_INDEX;
        try {
            PeriodType.MINUTE_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.getMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMinutes(Period.java:783) */
            period.getMinutes();
        } finally {
            PeriodType.MINUTE_INDEX = prevMINUTE_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getMinutes()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
 *  */
    @Test
    public void testGetMinutes_ThrowNullPointerException() throws Exception  {
        int prevMINUTE_INDEX = PeriodType.MINUTE_INDEX;
        try {
            PeriodType.MINUTE_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.getMinutes] produces [java.lang.NullPointerException]
                org.joda.time.Period.getMinutes(Period.java:783) */
            period.getMinutes();
        } finally {
            PeriodType.MINUTE_INDEX = prevMINUTE_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.getMillis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMillis()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getMillis()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);}
 *  */
    @Test
    public void testGetMillis_ReturnGetPeriodTypeGetIndexedField() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.MILLI_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            int actual = period.getMillis();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getMillis()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);}
 *  */
    @Test
    public void testGetMillis_ReturnGetPeriodTypeGetIndexedField_1() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.MILLI_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            int actual = period.getMillis();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMillis()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getMillis()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
 *  */
    @Test
    public void testGetMillis_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.MILLI_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.getMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getMillis(Period.java:801) */
            period.getMillis();
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getMillis()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
 *  */
    @Test
    public void testGetMillis_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.MILLI_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.getMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801) */
            period.getMillis();
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getMillis()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
 *  */
    @Test
    public void testGetMillis_ThrowNullPointerException() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.MILLI_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.getMillis] produces [java.lang.NullPointerException]
                org.joda.time.Period.getMillis(Period.java:801) */
            period.getMillis();
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.checkYearsAndMonths
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkYearsAndMonths(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#checkYearsAndMonths(java.lang.String)}
 * @utbot.invokes {@link org.joda.time.Period#getMonths()}
 * @utbot.invokes {@link org.joda.time.Period#getYears()}
 *  */
    @Test
    public void testCheckYearsAndMonths_PeriodGetMonths() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            Class periodClazz = Class.forName("org.joda.time.Period");
            Class stringType = Class.forName("java.lang.String");
            Method checkYearsAndMonthsMethod = periodClazz.getDeclaredMethod("checkYearsAndMonths", stringType);
            checkYearsAndMonthsMethod.setAccessible(true);
            java.lang.Object[] checkYearsAndMonthsMethodArguments = new java.lang.Object[1];
            checkYearsAndMonthsMethodArguments[0] = ((Object) null);
            checkYearsAndMonthsMethod.invoke(period, checkYearsAndMonthsMethodArguments);
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkYearsAndMonths(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#checkYearsAndMonths(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: getMonths() != 0
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCheckYearsAndMonths_ThrowUnsupportedOperationException() throws Throwable  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {1};
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            Class periodClazz = Class.forName("org.joda.time.Period");
            Class stringType = Class.forName("java.lang.String");
            Method checkYearsAndMonthsMethod = periodClazz.getDeclaredMethod("checkYearsAndMonths", stringType);
            checkYearsAndMonthsMethod.setAccessible(true);
            java.lang.Object[] checkYearsAndMonthsMethodArguments = new java.lang.Object[1];
            checkYearsAndMonthsMethodArguments[0] = ((Object) null);
            try {
                checkYearsAndMonthsMethod.invoke(period, checkYearsAndMonthsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#checkYearsAndMonths(java.lang.String)}
 * @utbot.invokes {@link org.joda.time.Period#getYears()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: getYears() != 0
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCheckYearsAndMonths_ThrowUnsupportedOperationException_1() throws Throwable  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 1;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {-1, 0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {1};
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            Class periodClazz = Class.forName("org.joda.time.Period");
            Class stringType = Class.forName("java.lang.String");
            Method checkYearsAndMonthsMethod = periodClazz.getDeclaredMethod("checkYearsAndMonths", stringType);
            checkYearsAndMonthsMethod.setAccessible(true);
            java.lang.Object[] checkYearsAndMonthsMethodArguments = new java.lang.Object[1];
            checkYearsAndMonthsMethodArguments[0] = ((Object) null);
            try {
                checkYearsAndMonthsMethod.invoke(period, checkYearsAndMonthsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkYearsAndMonths(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#checkYearsAndMonths(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: getMonths() != 0
 *  */
    @Test
    public void testCheckYearsAndMonths_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.checkYearsAndMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getMonths(Period.java:746)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1546) */
            Class periodClazz = Class.forName("org.joda.time.Period");
            Class stringType = Class.forName("java.lang.String");
            Method checkYearsAndMonthsMethod = periodClazz.getDeclaredMethod("checkYearsAndMonths", stringType);
            checkYearsAndMonthsMethod.setAccessible(true);
            java.lang.Object[] checkYearsAndMonthsMethodArguments = new java.lang.Object[1];
            checkYearsAndMonthsMethodArguments[0] = ((Object) null);
            try {
                checkYearsAndMonthsMethod.invoke(period, checkYearsAndMonthsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#checkYearsAndMonths(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: getMonths() != 0
 *  */
    @Test
    public void testCheckYearsAndMonths_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.checkYearsAndMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMonths(Period.java:746)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1546) */
            Class periodClazz = Class.forName("org.joda.time.Period");
            Class stringType = Class.forName("java.lang.String");
            Method checkYearsAndMonthsMethod = periodClazz.getDeclaredMethod("checkYearsAndMonths", stringType);
            checkYearsAndMonthsMethod.setAccessible(true);
            java.lang.Object[] checkYearsAndMonthsMethodArguments = new java.lang.Object[1];
            checkYearsAndMonthsMethodArguments[0] = ((Object) null);
            try {
                checkYearsAndMonthsMethod.invoke(period, checkYearsAndMonthsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#checkYearsAndMonths(java.lang.String)}
 * @utbot.invokes {@link org.joda.time.Period#getYears()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: getYears() != 0
 *  */
    @Test
    public void testCheckYearsAndMonths_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 536870912;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.checkYearsAndMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getYears(Period.java:737)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1549) */
            Class periodClazz = Class.forName("org.joda.time.Period");
            Class stringType = Class.forName("java.lang.String");
            Method checkYearsAndMonthsMethod = periodClazz.getDeclaredMethod("checkYearsAndMonths", stringType);
            checkYearsAndMonthsMethod.setAccessible(true);
            java.lang.Object[] checkYearsAndMonthsMethodArguments = new java.lang.Object[1];
            checkYearsAndMonthsMethodArguments[0] = ((Object) null);
            try {
                checkYearsAndMonthsMethod.invoke(period, checkYearsAndMonthsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.toStandardWeeks
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toStandardWeeks()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardWeeks()}
 * @utbot.invokes org.joda.time.Period#checkYearsAndMonths(java.lang.String)
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes org.joda.time.Period#checkYearsAndMonths(java.lang.String)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: checkYearsAndMonths("Weeks");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardWeeks_ThrowUnsupportedOperationException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {1};
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            period.toStandardWeeks();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toStandardWeeks()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardWeeks()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Weeks");
 *  */
    @Test
    public void testToStandardWeeks_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getMonths(Period.java:746)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1546)
                org.joda.time.Period.toStandardWeeks(Period.java:1376) */
            period.toStandardWeeks();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardWeeks()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Weeks");
 *  */
    @Test
    public void testToStandardWeeks_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.toStandardWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMonths(Period.java:746)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1546)
                org.joda.time.Period.toStandardWeeks(Period.java:1376) */
            period.toStandardWeeks();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardWeeks()}
 * @utbot.invokes {@link org.joda.time.Period#getYears()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Weeks");
 *  */
    @Test
    public void testToStandardWeeks_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 1073741824;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.toStandardWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getYears(Period.java:737)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1549)
                org.joda.time.Period.toStandardWeeks(Period.java:1376) */
            period.toStandardWeeks();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toStandardWeeks()
    
    @Test
    public void testToStandardWeeks1() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = Integer.MIN_VALUE;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {
                -1, 27, 27, 27, 27, 27, 27, 27,
                27
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getYears(Period.java:737)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1549)
                org.joda.time.Period.toStandardWeeks(Period.java:1376) */
            period.toStandardWeeks();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    @Test
    public void testToStandardWeeks2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 2;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = new int[11];
            iIndices[0] = -1;
            iIndices[1] = 27;
            iIndices[3] = 27;
            iIndices[4] = 27;
            iIndices[5] = 27;
            iIndices[6] = 27;
            iIndices[7] = 27;
            iIndices[8] = 27;
            iIndices[9] = 27;
            iIndices[10] = 27;
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                0, 27, 27, 27, 27, 27, 27, 27,
                27
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            /* This test fails because method [org.joda.time.Period.toStandardWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 9]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.toStandardWeeks(Period.java:1377) */
            period.toStandardWeeks();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    @Test
    public void testToStandardWeeks3() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 2;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = new int[11];
            iIndices[1] = 27;
            iIndices[2] = -1;
            iIndices[3] = 27;
            iIndices[4] = 27;
            iIndices[5] = 27;
            iIndices[6] = 27;
            iIndices[7] = 27;
            iIndices[8] = 27;
            iIndices[9] = 27;
            iIndices[10] = 27;
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                0, 0, 0, 0, 0, 0, 0, 0,
                0
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            /* This test fails because method [org.joda.time.Period.toStandardWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 9]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.toStandardWeeks(Period.java:1377) */
            period.toStandardWeeks();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    @Test
    public void testToStandardWeeks4() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {
                -1, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardWeeks] produces [java.lang.NullPointerException]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.toStandardWeeks(Period.java:1377) */
            period.toStandardWeeks();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.withMinutes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withMinutes(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMinutes(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.Period#getValues()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.returnsFrom {@code return new Period(values, getPeriodType());}
 *  */
    @Test
    public void testWithMinutes_PeriodGetPeriodType() throws Exception  {
        int prevMINUTE_INDEX = PeriodType.MINUTE_INDEX;
        try {
            PeriodType.MINUTE_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {null};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            Period actual = period.withMinutes(-255);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {-255};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
            
            assertNull(finalPeriodITypeITypes0);
        } finally {
            PeriodType.MINUTE_INDEX = prevMINUTE_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withMinutes(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMinutes(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testWithMinutes_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withMinutes(Period.java:970) */
        period.withMinutes(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMinutes(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().setIndexedField(this, PeriodType.MINUTE_INDEX, values, minutes);
 *  */
    @Test
    public void testWithMinutes_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevMINUTE_INDEX = PeriodType.MINUTE_INDEX;
        try {
            PeriodType.MINUTE_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.withMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
                org.joda.time.PeriodType.setIndexedField(PeriodType.java:692)
                org.joda.time.Period.withMinutes(Period.java:971) */
            period.withMinutes(-255);
        } finally {
            PeriodType.MINUTE_INDEX = prevMINUTE_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMinutes(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().setIndexedField(this, PeriodType.MINUTE_INDEX, values, minutes);
 *  */
    @Test
    public void testWithMinutes_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevMINUTE_INDEX = PeriodType.MINUTE_INDEX;
        try {
            PeriodType.MINUTE_INDEX = 1073741824;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.withMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.setIndexedField(PeriodType.java:688)
                org.joda.time.Period.withMinutes(Period.java:971) */
            period.withMinutes(-255);
        } finally {
            PeriodType.MINUTE_INDEX = prevMINUTE_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMinutes(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testWithMinutes_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withMinutes(Period.java:970) */
        period.withMinutes(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withMinutes(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMinutes(int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.joda.time.Period#getValues()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: getPeriodType().setIndexedField(this, PeriodType.MINUTE_INDEX, values, minutes);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWithMinutes_ThrowUnsupportedOperationException() throws Exception  {
        int prevMINUTE_INDEX = PeriodType.MINUTE_INDEX;
        try {
            PeriodType.MINUTE_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.withMinutes(-255);
        } finally {
            PeriodType.MINUTE_INDEX = prevMINUTE_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withMinutes(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#withMinutes(int)}
     */
    @Test
    public void testWithMinutes() throws Exception  {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        Period actual = period.withMinutes(-1);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, -1, -1, -1, Integer.MAX_VALUE, -1, -1, 1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.withPeriodType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withPeriodType(org.joda.time.PeriodType)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withPeriodType(org.joda.time.PeriodType)}
 * @utbot.invokes {@link org.joda.time.DateTimeUtils#getPeriodType(org.joda.time.PeriodType)}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithPeriodType_PeriodTypeEquals() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        PeriodType periodType = new PeriodType(null, null, null);
        
        Period actual = period.withPeriodType(periodType);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(periodIType, actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withPeriodType(org.joda.time.PeriodType)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#withPeriodType(org.joda.time.PeriodType)}
     */
    @Test
    public void testWithPeriodType() throws Exception  {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, -2147483647);
        
        Period actual = period.withPeriodType(null);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, -2147483647};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withPeriodType(org.joda.time.PeriodType)
    
    @Test
    public void testWithPeriodType1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 0);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        org.joda.time.DurationFieldType[] durationFieldTypeArray = new org.joda.time.DurationFieldType[1];
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 0);
        durationFieldTypeArray[0] = ((DurationFieldType) standardDurationFieldType1);
        PeriodType periodType = new PeriodType(null, durationFieldTypeArray, null);
        
        Period actual = period.withPeriodType(periodType);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(periodIType, actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withPeriodType(org.joda.time.PeriodType)
    
    @Test
    public void testWithPeriodType2() throws Exception  {
        Class converterManagerClazz = Class.forName("org.joda.time.convert.ConverterManager");
        ConverterManager prevINSTANCE = ((ConverterManager) getStaticFieldValue(converterManagerClazz, "INSTANCE"));
        try {
            ConverterManager instance = ((ConverterManager) createInstance("org.joda.time.convert.ConverterManager"));
            Object iPeriodConverters = createInstance("org.joda.time.convert.ConverterSet");
            java.lang.Object[] iSelectEntries = createArray("org.joda.time.convert.ConverterSet$Entry", 0);
            setField(iPeriodConverters, "org.joda.time.convert.ConverterSet", "iSelectEntries", iSelectEntries);
            setField(instance, "org.joda.time.convert.ConverterManager", "iPeriodConverters", iPeriodConverters);
            setStaticField(converterManagerClazz, "INSTANCE", instance);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes[0] = ((DurationFieldType) standardDurationFieldType);
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            org.joda.time.DurationFieldType[] durationFieldTypeArray = {null};
            PeriodType periodType = new PeriodType(null, durationFieldTypeArray, null);
            
            /* This test fails because method [org.joda.time.Period.withPeriodType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 609635406 out of bounds for length 0]
                org.joda.time.convert.ConverterSet.select(ConverterSet.java:55)
                org.joda.time.convert.ConverterManager.getPeriodConverter(ConverterManager.java:422)
                org.joda.time.base.BasePeriod.<init>(BasePeriod.java:272)
                org.joda.time.Period.<init>(Period.java:671)
                org.joda.time.Period.withPeriodType(Period.java:820) */
            period.withPeriodType(periodType);
        } finally {
            setStaticField(ConverterManager.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    @Test
    public void testWithPeriodType3() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        org.joda.time.DurationFieldType[] durationFieldTypeArray = new org.joda.time.DurationFieldType[1];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        durationFieldTypeArray[0] = ((DurationFieldType) standardDurationFieldType);
        PeriodType periodType = new PeriodType(null, durationFieldTypeArray, null);
        
        /* This test fails because method [org.joda.time.Period.withPeriodType] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.BasePeriod.setPeriodInternal(BasePeriod.java:423)
            org.joda.time.base.BasePeriod.setPeriod(BasePeriod.java:412)
            org.joda.time.MutablePeriod.setPeriod(MutablePeriod.java:468)
            org.joda.time.convert.ReadablePeriodConverter.setInto(ReadablePeriodConverter.java:58)
            org.joda.time.base.BasePeriod.<init>(BasePeriod.java:279)
            org.joda.time.MutablePeriod.<init>(MutablePeriod.java:426)
            org.joda.time.base.BasePeriod.<init>(BasePeriod.java:281)
            org.joda.time.Period.<init>(Period.java:671)
            org.joda.time.Period.withPeriodType(Period.java:820) */
        period.withPeriodType(periodType);
    }
    
    @Test
    public void testWithPeriodType4() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 0);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        org.joda.time.DurationFieldType[] durationFieldTypeArray = new org.joda.time.DurationFieldType[1];
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", java.lang.Byte.MIN_VALUE);
        durationFieldTypeArray[0] = ((DurationFieldType) standardDurationFieldType1);
        PeriodType periodType = new PeriodType(null, durationFieldTypeArray, null);
        
        /* This test fails because method [org.joda.time.Period.withPeriodType] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.BasePeriod.setPeriodInternal(BasePeriod.java:423)
            org.joda.time.base.BasePeriod.setPeriod(BasePeriod.java:412)
            org.joda.time.MutablePeriod.setPeriod(MutablePeriod.java:468)
            org.joda.time.convert.ReadablePeriodConverter.setInto(ReadablePeriodConverter.java:58)
            org.joda.time.base.BasePeriod.<init>(BasePeriod.java:279)
            org.joda.time.MutablePeriod.<init>(MutablePeriod.java:426)
            org.joda.time.base.BasePeriod.<init>(BasePeriod.java:281)
            org.joda.time.Period.<init>(Period.java:671)
            org.joda.time.Period.withPeriodType(Period.java:820) */
        period.withPeriodType(periodType);
    }
    
    @Test
    public void testWithPeriodType5() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType cStandard = new PeriodType(null, null, null);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.withPeriodType] produces [java.lang.NullPointerException]
                org.joda.time.PeriodType.size(PeriodType.java:617)
                org.joda.time.base.AbstractPeriod.size(AbstractPeriod.java:56)
                org.joda.time.base.BasePeriod.<init>(BasePeriod.java:277)
                org.joda.time.MutablePeriod.<init>(MutablePeriod.java:426)
                org.joda.time.base.BasePeriod.<init>(BasePeriod.java:281)
                org.joda.time.Period.<init>(Period.java:671)
                org.joda.time.Period.withPeriodType(Period.java:820) */
            period.withPeriodType(null);
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    
    @Test
    public void testWithPeriodType6() throws Exception  {
        Class converterManagerClazz = Class.forName("org.joda.time.convert.ConverterManager");
        ConverterManager prevINSTANCE = ((ConverterManager) getStaticFieldValue(converterManagerClazz, "INSTANCE"));
        try {
            setStaticField(converterManagerClazz, "INSTANCE", null);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            org.joda.time.DurationFieldType[] durationFieldTypeArray = {null, null, null, null, null, null, null, null, null};
            PeriodType periodType = new PeriodType(null, durationFieldTypeArray, null);
            
            /* This test fails because method [org.joda.time.Period.withPeriodType] produces [java.lang.NullPointerException]
                org.joda.time.PeriodType.size(PeriodType.java:617)
                org.joda.time.base.AbstractPeriod.size(AbstractPeriod.java:56)
                org.joda.time.base.BasePeriod.setPeriodInternal(BasePeriod.java:421)
                org.joda.time.base.BasePeriod.setPeriod(BasePeriod.java:412)
                org.joda.time.MutablePeriod.setPeriod(MutablePeriod.java:468)
                org.joda.time.convert.ReadablePeriodConverter.setInto(ReadablePeriodConverter.java:58)
                org.joda.time.base.BasePeriod.<init>(BasePeriod.java:279)
                org.joda.time.MutablePeriod.<init>(MutablePeriod.java:426)
                org.joda.time.base.BasePeriod.<init>(BasePeriod.java:281)
                org.joda.time.Period.<init>(Period.java:671)
                org.joda.time.Period.withPeriodType(Period.java:820) */
            period.withPeriodType(periodType);
        } finally {
            setStaticField(ConverterManager.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    @Test
    public void testWithPeriodType7() throws Exception  {
        Class converterManagerClazz = Class.forName("org.joda.time.convert.ConverterManager");
        ConverterManager prevINSTANCE = ((ConverterManager) getStaticFieldValue(converterManagerClazz, "INSTANCE"));
        try {
            ConverterManager instance = ((ConverterManager) createInstance("org.joda.time.convert.ConverterManager"));
            Object iPeriodConverters = createInstance("org.joda.time.convert.ConverterSet");
            java.lang.Object[] iSelectEntries = createArray("org.joda.time.convert.ConverterSet$Entry", 39);
            Object entry = createInstance("org.joda.time.convert.ConverterSet$Entry");
            iSelectEntries[38] = entry;
            setField(iPeriodConverters, "org.joda.time.convert.ConverterSet", "iSelectEntries", iSelectEntries);
            setField(instance, "org.joda.time.convert.ConverterManager", "iPeriodConverters", iPeriodConverters);
            setStaticField(converterManagerClazz, "INSTANCE", instance);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType periodType = new PeriodType(null, null, null);
            
            /* This test fails because method [org.joda.time.Period.withPeriodType] produces [java.lang.NullPointerException]
                org.joda.time.convert.ConverterSet.selectSlow(ConverterSet.java:244)
                org.joda.time.convert.ConverterSet.select(ConverterSet.java:66)
                org.joda.time.convert.ConverterManager.getPeriodConverter(ConverterManager.java:422)
                org.joda.time.base.BasePeriod.<init>(BasePeriod.java:272)
                org.joda.time.Period.<init>(Period.java:671)
                org.joda.time.Period.withPeriodType(Period.java:820) */
            period.withPeriodType(periodType);
        } finally {
            setStaticField(ConverterManager.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    @Test
    public void testWithPeriodType8() throws Exception  {
        Class converterManagerClazz = Class.forName("org.joda.time.convert.ConverterManager");
        ConverterManager prevINSTANCE = ((ConverterManager) getStaticFieldValue(converterManagerClazz, "INSTANCE"));
        try {
            ConverterManager instance = ((ConverterManager) createInstance("org.joda.time.convert.ConverterManager"));
            Object iPeriodConverters = createInstance("org.joda.time.convert.ConverterSet");
            java.lang.Object[] iSelectEntries = createArray("org.joda.time.convert.ConverterSet$Entry", 39);
            Object entry = createInstance("org.joda.time.convert.ConverterSet$Entry");
            iSelectEntries[38] = entry;
            setField(iPeriodConverters, "org.joda.time.convert.ConverterSet", "iSelectEntries", iSelectEntries);
            setField(instance, "org.joda.time.convert.ConverterManager", "iPeriodConverters", iPeriodConverters);
            setStaticField(converterManagerClazz, "INSTANCE", instance);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            org.joda.time.DurationFieldType[] durationFieldTypeArray = {null, null, null, null, null, null, null, null, null};
            PeriodType periodType = new PeriodType(null, durationFieldTypeArray, null);
            
            /* This test fails because method [org.joda.time.Period.withPeriodType] produces [java.lang.NullPointerException]
                org.joda.time.convert.ConverterSet.selectSlow(ConverterSet.java:244)
                org.joda.time.convert.ConverterSet.select(ConverterSet.java:66)
                org.joda.time.convert.ConverterManager.getPeriodConverter(ConverterManager.java:422)
                org.joda.time.base.BasePeriod.<init>(BasePeriod.java:272)
                org.joda.time.Period.<init>(Period.java:671)
                org.joda.time.Period.withPeriodType(Period.java:820) */
            period.withPeriodType(periodType);
        } finally {
            setStaticField(ConverterManager.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.fieldDifference
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method fieldDifference(org.joda.time.ReadablePartial, org.joda.time.ReadablePartial)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#fieldDifference(org.joda.time.ReadablePartial,org.joda.time.ReadablePartial)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start.size() != end.size()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFieldDifference_ThrowIllegalArgumentException_2() throws Exception  {
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        
        Period.fieldDifference(localDateTime, localDate);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#fieldDifference(org.joda.time.ReadablePartial,org.joda.time.ReadablePartial)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start.size() != end.size()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFieldDifference_ThrowIllegalArgumentException_3() throws Exception  {
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        
        Period.fieldDifference(localDate, localDateTime);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#fieldDifference(org.joda.time.ReadablePartial,org.joda.time.ReadablePartial)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start.size() != end.size()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFieldDifference_ThrowIllegalArgumentException_4() throws Exception  {
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        LocalTime localTime = ((LocalTime) createInstance("org.joda.time.LocalTime"));
        
        Period.fieldDifference(localDate, localTime);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#fieldDifference(org.joda.time.ReadablePartial,org.joda.time.ReadablePartial)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start.size() != end.size()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFieldDifference_ThrowIllegalArgumentException_5() throws Exception  {
        LocalTime localTime = ((LocalTime) createInstance("org.joda.time.LocalTime"));
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        
        Period.fieldDifference(localTime, localDate);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#fieldDifference(org.joda.time.ReadablePartial,org.joda.time.ReadablePartial)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start == null || end == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFieldDifference_ThrowIllegalArgumentException_1() throws Exception  {
        LocalTime localTime = ((LocalTime) createInstance("org.joda.time.LocalTime"));
        
        Period.fieldDifference(localTime, null);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#fieldDifference(org.joda.time.ReadablePartial,org.joda.time.ReadablePartial)}
 * @utbot.executesCondition {@code (start == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start == null || end == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFieldDifference_ThrowIllegalArgumentException() {
        Period.fieldDifference(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method fieldDifference(org.joda.time.ReadablePartial, org.joda.time.ReadablePartial)
    
    @Test
    public void testFieldDifference1() throws Exception  {
        LocalTime localTime = ((LocalTime) createInstance("org.joda.time.LocalTime"));
        
        /* This test fails because method [org.joda.time.Period.fieldDifference] produces [java.lang.NullPointerException]
            org.joda.time.LocalTime.getField(LocalTime.java:550)
            org.joda.time.base.AbstractPartial.getFieldType(AbstractPartial.java:79)
            org.joda.time.Period.fieldDifference(Period.java:266) */
        Period.fieldDifference(localTime, localTime);
    }
    
    @Test
    public void testFieldDifference2() throws Exception  {
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        LocalTime localTime = ((LocalTime) createInstance("org.joda.time.LocalTime"));
        
        /* This test fails because method [org.joda.time.Period.fieldDifference] produces [java.lang.NullPointerException]
            org.joda.time.LocalDateTime.getField(LocalDateTime.java:554)
            org.joda.time.base.AbstractPartial.getFieldType(AbstractPartial.java:79)
            org.joda.time.Period.fieldDifference(Period.java:266) */
        Period.fieldDifference(localDateTime, localTime);
    }
    
    @Test
    public void testFieldDifference3() throws Exception  {
        LocalTime localTime = ((LocalTime) createInstance("org.joda.time.LocalTime"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        
        /* This test fails because method [org.joda.time.Period.fieldDifference] produces [java.lang.NullPointerException]
            org.joda.time.LocalTime.getField(LocalTime.java:550)
            org.joda.time.base.AbstractPartial.getFieldType(AbstractPartial.java:79)
            org.joda.time.Period.fieldDifference(Period.java:266) */
        Period.fieldDifference(localTime, localDateTime);
    }
    
    @Test
    public void testFieldDifference4() throws Exception  {
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        
        /* This test fails because method [org.joda.time.Period.fieldDifference] produces [java.lang.NullPointerException]
            org.joda.time.LocalDateTime.getField(LocalDateTime.java:554)
            org.joda.time.base.AbstractPartial.getFieldType(AbstractPartial.java:79)
            org.joda.time.Period.fieldDifference(Period.java:266) */
        Period.fieldDifference(localDateTime, localDateTime);
    }
    
    @Test
    public void testFieldDifference5() throws Exception  {
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        
        /* This test fails because method [org.joda.time.Period.fieldDifference] produces [java.lang.NullPointerException]
            org.joda.time.LocalDate.getField(LocalDate.java:501)
            org.joda.time.base.AbstractPartial.getFieldType(AbstractPartial.java:79)
            org.joda.time.Period.fieldDifference(Period.java:266) */
        Period.fieldDifference(localDate, localDate);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.toPeriod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPeriod()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toPeriod()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testToPeriod_Return() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.toPeriod();
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.withField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withField(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withField(org.joda.time.DurationFieldType,int)}
 * @utbot.returnsFrom {@code return new Period(newValues, getPeriodType());}
 *  */
    @Test
    public void testWithField_Return() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method withFieldMethod = periodClazz.getDeclaredMethod("withField", standardDurationFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDurationFieldType;
        withFieldMethodArguments[1] = 0;
        Period actual = ((Period) withFieldMethod.invoke(period, withFieldMethodArguments));
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withField(org.joda.time.DurationFieldType,int)}
 * @utbot.returnsFrom {@code return new Period(newValues, getPeriodType());}
 *  */
    @Test
    public void testWithField_Return_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method withFieldMethod = periodClazz.getDeclaredMethod("withField", standardDurationFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDurationFieldType;
        withFieldMethodArguments[1] = -255;
        Period actual = ((Period) withFieldMethod.invoke(period, withFieldMethodArguments));
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues1 = {-255};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withField(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withField(org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (field == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: field == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithField_ThrowIllegalArgumentException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        period.withField(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withField(org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.setFieldInto(newValues, field, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithField_ThrowIllegalArgumentException_1() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method withFieldMethod = periodClazz.getDeclaredMethod("withField", standardDurationFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDurationFieldType;
        withFieldMethodArguments[1] = -255;
        try {
            withFieldMethod.invoke(period, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withField(org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.setFieldInto(newValues, field, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithField_ThrowIllegalArgumentException_2() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method withFieldMethod = periodClazz.getDeclaredMethod("withField", standardDurationFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDurationFieldType;
        withFieldMethodArguments[1] = -255;
        try {
            withFieldMethod.invoke(period, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withField(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withField(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] newValues = getValues();
 *  */
    @Test
    public void testWithField_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        /* This test fails because method [org.joda.time.Period.withField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withField(Period.java:857) */
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method withFieldMethod = periodClazz.getDeclaredMethod("withField", standardDurationFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDurationFieldType;
        withFieldMethodArguments[1] = -255;
        try {
            withFieldMethod.invoke(period, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withField(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] newValues = getValues();
 *  */
    @Test
    public void testWithField_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        /* This test fails because method [org.joda.time.Period.withField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withField(Period.java:857) */
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method withFieldMethod = periodClazz.getDeclaredMethod("withField", standardDurationFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDurationFieldType;
        withFieldMethodArguments[1] = -255;
        try {
            withFieldMethod.invoke(period, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.withFieldAdded
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withFieldAdded(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (value == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithFieldAdded_ValueEqualsZero() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method withFieldAddedMethod = periodClazz.getDeclaredMethod("withFieldAdded", standardDurationFieldTypeType, intType);
        withFieldAddedMethod.setAccessible(true);
        java.lang.Object[] withFieldAddedMethodArguments = new java.lang.Object[2];
        withFieldAddedMethodArguments[0] = standardDurationFieldType;
        withFieldAddedMethodArguments[1] = 0;
        Period actual = ((Period) withFieldAddedMethod.invoke(period, withFieldAddedMethodArguments));
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (value == 0): False}
 * @utbot.returnsFrom {@code return new Period(newValues, getPeriodType());}
 *  */
    @Test
    public void testWithFieldAdded_ValueNotEqualsZero() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method withFieldAddedMethod = periodClazz.getDeclaredMethod("withFieldAdded", standardDurationFieldTypeType, intType);
        withFieldAddedMethod.setAccessible(true);
        java.lang.Object[] withFieldAddedMethodArguments = new java.lang.Object[2];
        withFieldAddedMethodArguments[0] = standardDurationFieldType;
        withFieldAddedMethodArguments[1] = -1;
        Period actual = ((Period) withFieldAddedMethod.invoke(period, withFieldAddedMethodArguments));
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues1 = {-1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (value == 0): False}
 * @utbot.returnsFrom {@code return new Period(newValues, getPeriodType());}
 *  */
    @Test
    public void testWithFieldAdded_ValueNotEqualsZero_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {2139619681};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method withFieldAddedMethod = periodClazz.getDeclaredMethod("withFieldAdded", standardDurationFieldTypeType, intType);
        withFieldAddedMethod.setAccessible(true);
        java.lang.Object[] withFieldAddedMethodArguments = new java.lang.Object[2];
        withFieldAddedMethodArguments[0] = standardDurationFieldType;
        withFieldAddedMethodArguments[1] = -2139095040;
        Period actual = ((Period) withFieldAddedMethod.invoke(period, withFieldAddedMethodArguments));
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues1 = {524641};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withFieldAdded(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (field == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: field == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_ThrowIllegalArgumentException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        period.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.executesCondition {@code (value == 0): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.addFieldInto(newValues, field, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_ThrowIllegalArgumentException_1() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method withFieldAddedMethod = periodClazz.getDeclaredMethod("withFieldAdded", standardDurationFieldTypeType, intType);
        withFieldAddedMethod.setAccessible(true);
        java.lang.Object[] withFieldAddedMethodArguments = new java.lang.Object[2];
        withFieldAddedMethodArguments[0] = standardDurationFieldType;
        withFieldAddedMethodArguments[1] = -255;
        try {
            withFieldAddedMethod.invoke(period, withFieldAddedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.executesCondition {@code (value == 0): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.addFieldInto(newValues, field, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_ThrowIllegalArgumentException_2() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method withFieldAddedMethod = periodClazz.getDeclaredMethod("withFieldAdded", standardDurationFieldTypeType, intType);
        withFieldAddedMethod.setAccessible(true);
        java.lang.Object[] withFieldAddedMethodArguments = new java.lang.Object[2];
        withFieldAddedMethodArguments[0] = standardDurationFieldType;
        withFieldAddedMethodArguments[1] = -255;
        try {
            withFieldAddedMethod.invoke(period, withFieldAddedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.executesCondition {@code (value == 0): False}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: super.addFieldInto(newValues, field, value);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testWithFieldAdded_ThrowArithmeticException() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {-2147483647};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method withFieldAddedMethod = periodClazz.getDeclaredMethod("withFieldAdded", standardDurationFieldTypeType, intType);
        withFieldAddedMethod.setAccessible(true);
        java.lang.Object[] withFieldAddedMethodArguments = new java.lang.Object[2];
        withFieldAddedMethodArguments[0] = standardDurationFieldType;
        withFieldAddedMethodArguments[1] = -2;
        try {
            withFieldAddedMethod.invoke(period, withFieldAddedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withFieldAdded(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] newValues = getValues();
 *  */
    @Test
    public void testWithFieldAdded_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        /* This test fails because method [org.joda.time.Period.withFieldAdded] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withFieldAdded(Period.java:879) */
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method withFieldAddedMethod = periodClazz.getDeclaredMethod("withFieldAdded", standardDurationFieldTypeType, intType);
        withFieldAddedMethod.setAccessible(true);
        java.lang.Object[] withFieldAddedMethodArguments = new java.lang.Object[2];
        withFieldAddedMethodArguments[0] = standardDurationFieldType;
        withFieldAddedMethodArguments[1] = -255;
        try {
            withFieldAddedMethod.invoke(period, withFieldAddedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] newValues = getValues();
 *  */
    @Test
    public void testWithFieldAdded_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        /* This test fails because method [org.joda.time.Period.withFieldAdded] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withFieldAdded(Period.java:879) */
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method withFieldAddedMethod = periodClazz.getDeclaredMethod("withFieldAdded", standardDurationFieldTypeType, intType);
        withFieldAddedMethod.setAccessible(true);
        java.lang.Object[] withFieldAddedMethodArguments = new java.lang.Object[2];
        withFieldAddedMethodArguments[0] = standardDurationFieldType;
        withFieldAddedMethodArguments[1] = -255;
        try {
            withFieldAddedMethod.invoke(period, withFieldAddedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.withHours
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withHours(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withHours(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.Period#getValues()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.returnsFrom {@code return new Period(values, getPeriodType());}
 *  */
    @Test
    public void testWithHours_PeriodGetPeriodType() throws Exception  {
        int prevHOUR_INDEX = PeriodType.HOUR_INDEX;
        try {
            PeriodType.HOUR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {null};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            Period actual = period.withHours(-255);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {-255};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
            
            assertNull(finalPeriodITypeITypes0);
        } finally {
            PeriodType.HOUR_INDEX = prevHOUR_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withHours(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withHours(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testWithHours_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withHours(Period.java:955) */
        period.withHours(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withHours(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().setIndexedField(this, PeriodType.HOUR_INDEX, values, hours);
 *  */
    @Test
    public void testWithHours_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevHOUR_INDEX = PeriodType.HOUR_INDEX;
        try {
            PeriodType.HOUR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.withHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
                org.joda.time.PeriodType.setIndexedField(PeriodType.java:692)
                org.joda.time.Period.withHours(Period.java:956) */
            period.withHours(-255);
        } finally {
            PeriodType.HOUR_INDEX = prevHOUR_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withHours(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().setIndexedField(this, PeriodType.HOUR_INDEX, values, hours);
 *  */
    @Test
    public void testWithHours_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevHOUR_INDEX = PeriodType.HOUR_INDEX;
        try {
            PeriodType.HOUR_INDEX = 1073741824;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.withHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.setIndexedField(PeriodType.java:688)
                org.joda.time.Period.withHours(Period.java:956) */
            period.withHours(-255);
        } finally {
            PeriodType.HOUR_INDEX = prevHOUR_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withHours(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testWithHours_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withHours(Period.java:955) */
        period.withHours(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHours(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withHours(int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.joda.time.Period#getValues()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: getPeriodType().setIndexedField(this, PeriodType.HOUR_INDEX, values, hours);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWithHours_ThrowUnsupportedOperationException() throws Exception  {
        int prevHOUR_INDEX = PeriodType.HOUR_INDEX;
        try {
            PeriodType.HOUR_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.withHours(-255);
        } finally {
            PeriodType.HOUR_INDEX = prevHOUR_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withHours(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#withHours(int)}
     */
    @Test
    public void testWithHours() throws Exception  {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        Period actual = period.withHours(-1);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, -1, -1, -1, -1, Integer.MAX_VALUE, -1, 1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.withWeeks
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withWeeks(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withWeeks(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.Period#getValues()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.returnsFrom {@code return new Period(values, getPeriodType());}
 *  */
    @Test
    public void testWithWeeks_PeriodGetPeriodType() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {null};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            Period actual = period.withWeeks(-255);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {-255};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
            
            assertNull(finalPeriodITypeITypes0);
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withWeeks(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withWeeks(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testWithWeeks_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withWeeks(Period.java:925) */
        period.withWeeks(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withWeeks(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().setIndexedField(this, PeriodType.WEEK_INDEX, values, weeks);
 *  */
    @Test
    public void testWithWeeks_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.withWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
                org.joda.time.PeriodType.setIndexedField(PeriodType.java:692)
                org.joda.time.Period.withWeeks(Period.java:926) */
            period.withWeeks(-255);
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withWeeks(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().setIndexedField(this, PeriodType.WEEK_INDEX, values, weeks);
 *  */
    @Test
    public void testWithWeeks_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = 1073741824;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.withWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.setIndexedField(PeriodType.java:688)
                org.joda.time.Period.withWeeks(Period.java:926) */
            period.withWeeks(-255);
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withWeeks(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testWithWeeks_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withWeeks(Period.java:925) */
        period.withWeeks(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withWeeks(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withWeeks(int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.joda.time.Period#getValues()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: getPeriodType().setIndexedField(this, PeriodType.WEEK_INDEX, values, weeks);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWithWeeks_ThrowUnsupportedOperationException() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.withWeeks(-255);
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withWeeks(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#withWeeks(int)}
     */
    @Test
    public void testWithWeeks() throws Exception  {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        Period actual = period.withWeeks(-1);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.withFields
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withFields(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withFields(org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (period == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithFields_PeriodEqualsNull() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        Period actual = period.withFields(null);
        
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        assertNull(actualIType);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        assertNull(actualIValues);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withFields(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withFields(org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] newValues = getValues();
 *  */
    @Test
    public void testWithFields_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        /* This test fails because method [org.joda.time.Period.withFields] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withFields(Period.java:837) */
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class weeksType = Class.forName("org.joda.time.ReadablePeriod");
        Method withFieldsMethod = periodClazz.getDeclaredMethod("withFields", weeksType);
        withFieldsMethod.setAccessible(true);
        java.lang.Object[] withFieldsMethodArguments = new java.lang.Object[1];
        withFieldsMethodArguments[0] = weeks;
        try {
            withFieldsMethod.invoke(period, withFieldsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withFields(org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] newValues = getValues();
 *  */
    @Test
    public void testWithFields_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        /* This test fails because method [org.joda.time.Period.withFields] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withFields(Period.java:837) */
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class weeksType = Class.forName("org.joda.time.ReadablePeriod");
        Method withFieldsMethod = periodClazz.getDeclaredMethod("withFields", weeksType);
        withFieldsMethod.setAccessible(true);
        java.lang.Object[] withFieldsMethodArguments = new java.lang.Object[1];
        withFieldsMethodArguments[0] = weeks;
        try {
            withFieldsMethod.invoke(period, withFieldsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withFields(org.joda.time.ReadablePeriod)
    
    @Test
    public void testWithFields1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        AbstractPeriod anonymousAbstractPeriod = ((AbstractPeriod) createInstance("org.joda.time.base.BasePeriod$1"));
        
        Period actual = period.withFields(anonymousAbstractPeriod);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    
    @Test
    public void testWithFields2() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class weeksType = Class.forName("org.joda.time.ReadablePeriod");
        Method withFieldsMethod = periodClazz.getDeclaredMethod("withFields", weeksType);
        withFieldsMethod.setAccessible(true);
        java.lang.Object[] withFieldsMethodArguments = new java.lang.Object[1];
        withFieldsMethodArguments[0] = weeks;
        Period actual = ((Period) withFieldsMethod.invoke(period, withFieldsMethodArguments));
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues1 = {0};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
        
        assertNull(finalPeriodITypeITypes0);
    }
    
    @Test
    public void testWithFields3() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Days days = ((Days) createInstance("org.joda.time.Days"));
        
        Class periodClazz = Class.forName("org.joda.time.Period");
        Class daysType = Class.forName("org.joda.time.ReadablePeriod");
        Method withFieldsMethod = periodClazz.getDeclaredMethod("withFields", daysType);
        withFieldsMethod.setAccessible(true);
        java.lang.Object[] withFieldsMethodArguments = new java.lang.Object[1];
        withFieldsMethodArguments[0] = days;
        Period actual = ((Period) withFieldsMethod.invoke(period, withFieldsMethodArguments));
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withFields(org.joda.time.ReadablePeriod)
    
    @Test
    public void testWithFields4() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Period period1 = ((Period) createInstance("org.joda.time.Period"));
        
        /* This test fails because method [org.joda.time.Period.withFields] produces [java.lang.NullPointerException]
            org.joda.time.base.AbstractPeriod.size(AbstractPeriod.java:56)
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:549)
            org.joda.time.Period.withFields(Period.java:838) */
        period.withFields(period1);
    }
    
    @Test
    public void testWithFields5() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Period period1 = ((Period) createInstance("org.joda.time.Period"));
        
        /* This test fails because method [org.joda.time.Period.withFields] produces [java.lang.NullPointerException]
            org.joda.time.base.AbstractPeriod.size(AbstractPeriod.java:56)
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:549)
            org.joda.time.Period.withFields(Period.java:838) */
        period.withFields(period1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.withMillis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withMillis(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMillis(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testWithMillis_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withMillis(Period.java:1000) */
        period.withMillis(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMillis(int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().setIndexedField(this, PeriodType.MILLI_INDEX, values, millis);
 *  */
    @Test
    public void testWithMillis_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.MILLI_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.withMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
                org.joda.time.PeriodType.setIndexedField(PeriodType.java:692)
                org.joda.time.Period.withMillis(Period.java:1001) */
            period.withMillis(-255);
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMillis(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getPeriodType().setIndexedField(this, PeriodType.MILLI_INDEX, values, millis);
 *  */
    @Test
    public void testWithMillis_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.MILLI_INDEX = 1073741824;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.withMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.setIndexedField(PeriodType.java:688)
                org.joda.time.Period.withMillis(Period.java:1001) */
            period.withMillis(-255);
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMillis(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int[] values = getValues();
 *  */
    @Test
    public void testWithMillis_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:97)
            org.joda.time.Period.withMillis(Period.java:1000) */
        period.withMillis(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withMillis(int)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#withMillis(int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.joda.time.Period#getValues()}
 * @utbot.invokes {@link org.joda.time.Period#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: getPeriodType().setIndexedField(this, PeriodType.MILLI_INDEX, values, millis);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWithMillis_ThrowUnsupportedOperationException() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.MILLI_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.withMillis(-255);
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withMillis(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#withMillis(int)}
     */
    @Test
    public void testWithMillis() throws Exception  {
        Period period = new Period(1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, 1);
        
        Period actual = period.withMillis(-1);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, -1, -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, -1, -1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withMillis(int)
    
    @Test
    public void testWithMillis1() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.MILLI_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {null};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {
                0, 27, 27, 27, 27, 27, 27, 27,
                27
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            Period actual = period.withMillis(0);
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {0};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
            
            assertNull(finalPeriodITypeITypes0);
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withMillis(int)
    
    @Test
    public void testWithMillis2() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.Period.withMillis] produces [java.lang.NullPointerException]
            org.joda.time.PeriodType.setIndexedField(PeriodType.java:688)
            org.joda.time.Period.withMillis(Period.java:1001) */
        period.withMillis(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.getWeeks
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWeeks()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getWeeks()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);}
 *  */
    @Test
    public void testGetWeeks_ReturnGetPeriodTypeGetIndexedField() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            int actual = period.getWeeks();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getWeeks()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);}
 *  */
    @Test
    public void testGetWeeks_ReturnGetPeriodTypeGetIndexedField_1() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            int actual = period.getWeeks();
            
            assertEquals(0, actual);
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getWeeks()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getWeeks()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
 *  */
    @Test
    public void testGetWeeks_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.getWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getWeeks(Period.java:755) */
            period.getWeeks();
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getWeeks()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
 *  */
    @Test
    public void testGetWeeks_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.getWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getWeeks(Period.java:755) */
            period.getWeeks();
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#getWeeks()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
 *  */
    @Test
    public void testGetWeeks_ThrowNullPointerException() throws Exception  {
        int prevWEEK_INDEX = PeriodType.WEEK_INDEX;
        try {
            PeriodType.WEEK_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.getWeeks] produces [java.lang.NullPointerException]
                org.joda.time.Period.getWeeks(Period.java:755) */
            period.getWeeks();
        } finally {
            PeriodType.WEEK_INDEX = prevWEEK_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.toStandardSeconds
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toStandardSeconds()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardSeconds()}
 * @utbot.invokes org.joda.time.Period#checkYearsAndMonths(java.lang.String)
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes org.joda.time.Period#checkYearsAndMonths(java.lang.String)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: checkYearsAndMonths("Seconds");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardSeconds_ThrowUnsupportedOperationException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {1};
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            period.toStandardSeconds();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toStandardSeconds()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardSeconds()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Seconds");
 *  */
    @Test
    public void testToStandardSeconds_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getMonths(Period.java:746)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1546)
                org.joda.time.Period.toStandardSeconds(Period.java:1499) */
            period.toStandardSeconds();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardSeconds()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Seconds");
 *  */
    @Test
    public void testToStandardSeconds_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.toStandardSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMonths(Period.java:746)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1546)
                org.joda.time.Period.toStandardSeconds(Period.java:1499) */
            period.toStandardSeconds();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardSeconds()}
 * @utbot.invokes {@link org.joda.time.Period#getYears()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Seconds");
 *  */
    @Test
    public void testToStandardSeconds_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 67108864;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.toStandardSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 67108864 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getYears(Period.java:737)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1549)
                org.joda.time.Period.toStandardSeconds(Period.java:1499) */
            period.toStandardSeconds();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toStandardSeconds()
    
    @Test
    public void testToStandardSeconds1() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = Integer.MIN_VALUE;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {
                -1, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getYears(Period.java:737)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1549)
                org.joda.time.Period.toStandardSeconds(Period.java:1499) */
            period.toStandardSeconds();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    @Test
    public void testToStandardSeconds2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 2;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = new int[11];
            iIndices[0] = -1;
            iIndices[1] = 26;
            iIndices[3] = 26;
            iIndices[4] = 26;
            iIndices[5] = 26;
            iIndices[6] = 26;
            iIndices[7] = 26;
            iIndices[8] = 26;
            iIndices[9] = 26;
            iIndices[10] = 26;
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                0, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            /* This test fails because method [org.joda.time.Period.toStandardSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 9]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.toStandardSeconds(Period.java:1500) */
            period.toStandardSeconds();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    @Test
    public void testToStandardSeconds3() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 2;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = new int[11];
            iIndices[1] = 26;
            iIndices[2] = -1;
            iIndices[3] = 26;
            iIndices[4] = 26;
            iIndices[5] = 26;
            iIndices[6] = 26;
            iIndices[7] = 26;
            iIndices[8] = 26;
            iIndices[9] = 26;
            iIndices[10] = 26;
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                0, 0, 0, 0, 0, 0, 0, 0,
                0
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            /* This test fails because method [org.joda.time.Period.toStandardSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 9]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.toStandardSeconds(Period.java:1500) */
            period.toStandardSeconds();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    @Test
    public void testToStandardSeconds4() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {
                -1, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardSeconds] produces [java.lang.NullPointerException]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.toStandardSeconds(Period.java:1500) */
            period.toStandardSeconds();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.normalizedStandard
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method normalizedStandard()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#normalizedStandard()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return normalizedStandard(PeriodType.standard());
 *  */
    @Test
    public void testNormalizedStandard_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType.MILLI_INDEX = 1073741824;
            int[] intArray = {0};
            PeriodType cStandard = new PeriodType(null, null, intArray);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(iType, "org.joda.time.PeriodType", "iIndices", intArray);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.normalizedStandard] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.normalizedStandard(Period.java:1618)
                org.joda.time.Period.normalizedStandard(Period.java:1581) */
            period.normalizedStandard();
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#normalizedStandard()}
 * @utbot.invokes {@link org.joda.time.Period#getSeconds()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return normalizedStandard(PeriodType.standard());
 *  */
    @Test
    public void testNormalizedStandard_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType.SECOND_INDEX = 1073741824;
            PeriodType.MILLI_INDEX = 0;
            int[] intArray = {-1};
            PeriodType cStandard = new PeriodType(null, null, intArray);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(iType, "org.joda.time.PeriodType", "iIndices", intArray);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.normalizedStandard] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getSeconds(Period.java:792)
                org.joda.time.Period.normalizedStandard(Period.java:1619)
                org.joda.time.Period.normalizedStandard(Period.java:1581) */
            period.normalizedStandard();
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method normalizedStandard()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#normalizedStandard()}
     */
    @Test
    public void testNormalizedStandard() throws Exception  {
        Period period = new Period(1, -1, -1, -1, 2143289343, Integer.MAX_VALUE, -1, 1);
        
        Period actual = period.normalizedStandard();
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1, -1, 12970717, 3, 17, 6, 59, 1};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method normalizedStandard()
    
    @Test
    public void testNormalizedStandard1() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType.SECOND_INDEX = 0;
            PeriodType.MILLI_INDEX = 2;
            int[] intArray = new int[11];
            intArray[0] = -1;
            intArray[1] = 26;
            intArray[3] = 26;
            intArray[4] = 26;
            intArray[5] = 26;
            intArray[6] = 26;
            intArray[7] = 26;
            intArray[8] = 26;
            intArray[9] = 26;
            intArray[10] = 26;
            PeriodType cStandard = new PeriodType(null, null, intArray);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(iType, "org.joda.time.PeriodType", "iIndices", intArray);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                0, 0, 0, 0, 0, 0, 0, 0,
                0
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            /* This test fails because method [org.joda.time.Period.normalizedStandard] produces [java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 9]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMinutes(Period.java:783)
                org.joda.time.Period.normalizedStandard(Period.java:1620)
                org.joda.time.Period.normalizedStandard(Period.java:1581) */
            period.normalizedStandard();
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    
    @Test
    public void testNormalizedStandard2() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            setStaticField(periodTypeClazz, "cStandard", null);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.normalizedStandard] produces [java.lang.NullPointerException]
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.normalizedStandard(Period.java:1618)
                org.joda.time.Period.normalizedStandard(Period.java:1581) */
            period.normalizedStandard();
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    
    @Test
    public void testNormalizedStandard3() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType.SECOND_INDEX = 0;
            PeriodType.MILLI_INDEX = 0;
            int[] intArray = {
                -1, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            PeriodType cStandard = new PeriodType(null, null, intArray);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(iType, "org.joda.time.PeriodType", "iIndices", intArray);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.normalizedStandard] produces [java.lang.NullPointerException]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMinutes(Period.java:783)
                org.joda.time.Period.normalizedStandard(Period.java:1620)
                org.joda.time.Period.normalizedStandard(Period.java:1581) */
            period.normalizedStandard();
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.normalizedStandard
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method normalizedStandard(org.joda.time.PeriodType)
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#normalizedStandard(org.joda.time.PeriodType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: long millis = getMillis();
 *  */
    @Test
    public void testNormalizedStandard_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.MILLI_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            PeriodType periodType = new PeriodType(null, null, null);
            
            /* This test fails because method [org.joda.time.Period.normalizedStandard] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.normalizedStandard(Period.java:1618) */
            period.normalizedStandard(periodType);
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#normalizedStandard(org.joda.time.PeriodType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: long millis = getMillis();
 *  */
    @Test
    public void testNormalizedStandard_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType.MILLI_INDEX = 129;
            int[] intArray = {0, 0};
            PeriodType cStandard = new PeriodType(null, null, intArray);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(iType, "org.joda.time.PeriodType", "iIndices", intArray);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.normalizedStandard] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.normalizedStandard(Period.java:1618) */
            period.normalizedStandard(null);
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method normalizedStandard(org.joda.time.PeriodType)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Period}
     * @utbot.methodUnderTest {@link org.joda.time.Period#normalizedStandard(org.joda.time.PeriodType)}
     */
    @Test
    public void testNormalizedStandard4() throws Exception  {
        Period period = new Period(86400000, 86400000, 86400000, 86400000, Integer.MAX_VALUE, 1, 12, -2061083648);
        
        Period actual = period.normalizedStandard(null);
        
        Period expected = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        PeriodType.MONTH_INDEX = 1;
        PeriodType.WEEK_INDEX = 2;
        PeriodType.DAY_INDEX = 3;
        PeriodType.HOUR_INDEX = 4;
        PeriodType.MINUTE_INDEX = 5;
        PeriodType.SECOND_INDEX = 6;
        PeriodType.MILLI_INDEX = 7;
        setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
        String iName = "Standard";
        setField(iType, "org.joda.time.PeriodType", "iName", iName);
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName1);
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName2 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName2);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName3 = "weeks";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName3);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName5);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName6 = "minutes";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName7 = "seconds";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName7);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName8 = "millis";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName8);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType7);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
        setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
        setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {93600000, 0, 111525494, 3, 10, 29, 48, 352};
        setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
        PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(expectedIType, actualIType);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method normalizedStandard(org.joda.time.PeriodType)
    
    @Test
    public void testNormalizedStandard5() throws Exception  {
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.MILLI_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {
                0, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            PeriodType periodType = new PeriodType(null, null, null);
            
            /* This test fails because method [org.joda.time.Period.normalizedStandard] produces [java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 9]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getSeconds(Period.java:792)
                org.joda.time.Period.normalizedStandard(Period.java:1619) */
            period.normalizedStandard(periodType);
        } finally {
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    
    @Test
    public void testNormalizedStandard6() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType.SECOND_INDEX = 0;
            PeriodType.MILLI_INDEX = 0;
            int[] intArray = {
                0, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            PeriodType cStandard = new PeriodType(null, null, intArray);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(iType, "org.joda.time.PeriodType", "iIndices", intArray);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", intArray);
            
            /* This test fails because method [org.joda.time.Period.normalizedStandard] produces [java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 9]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMinutes(Period.java:783)
                org.joda.time.Period.normalizedStandard(Period.java:1620) */
            period.normalizedStandard(null);
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    
    @Test
    public void testNormalizedStandard7() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            setStaticField(periodTypeClazz, "cStandard", null);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            
            /* This test fails because method [org.joda.time.Period.normalizedStandard] produces [java.lang.NullPointerException]
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.normalizedStandard(Period.java:1618) */
            period.normalizedStandard(null);
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    
    @Test
    public void testNormalizedStandard8() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.SECOND_INDEX = 0;
            PeriodType.MILLI_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {
                -1, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            PeriodType periodType = new PeriodType(null, null, null);
            
            /* This test fails because method [org.joda.time.Period.normalizedStandard] produces [java.lang.NullPointerException]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMinutes(Period.java:783)
                org.joda.time.Period.normalizedStandard(Period.java:1620) */
            period.normalizedStandard(periodType);
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    
    @Test
    public void testNormalizedStandard9() throws Exception  {
        int prevSECOND_INDEX = PeriodType.SECOND_INDEX;
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType.SECOND_INDEX = 0;
            PeriodType.MILLI_INDEX = 0;
            int[] intArray = {
                -1, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            PeriodType cStandard = new PeriodType(null, null, intArray);
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(iType, "org.joda.time.PeriodType", "iIndices", intArray);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.normalizedStandard] produces [java.lang.NullPointerException]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMinutes(Period.java:783)
                org.joda.time.Period.normalizedStandard(Period.java:1620) */
            period.normalizedStandard(null);
        } finally {
            PeriodType.SECOND_INDEX = prevSECOND_INDEX;
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.toStandardDays
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toStandardDays()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardDays()}
 * @utbot.invokes org.joda.time.Period#checkYearsAndMonths(java.lang.String)
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes org.joda.time.Period#checkYearsAndMonths(java.lang.String)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: checkYearsAndMonths("Days");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardDays_ThrowUnsupportedOperationException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {1};
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            period.toStandardDays();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toStandardDays()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardDays()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Days");
 *  */
    @Test
    public void testToStandardDays_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getMonths(Period.java:746)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1546)
                org.joda.time.Period.toStandardDays(Period.java:1406) */
            period.toStandardDays();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardDays()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Days");
 *  */
    @Test
    public void testToStandardDays_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.toStandardDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMonths(Period.java:746)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1546)
                org.joda.time.Period.toStandardDays(Period.java:1406) */
            period.toStandardDays();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardDays()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Days");
 *  */
    @Test
    public void testToStandardDays_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 16777216;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.toStandardDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16777216 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getYears(Period.java:737)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1549)
                org.joda.time.Period.toStandardDays(Period.java:1406) */
            period.toStandardDays();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardDays()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Days");
 *  */
    @Test
    public void testToStandardDays_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 16777216;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16777216 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getYears(Period.java:737)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1549)
                org.joda.time.Period.toStandardDays(Period.java:1406) */
            period.toStandardDays();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toStandardDays()
    
    @Test
    public void testToStandardDays1() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 2;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = new int[11];
            iIndices[0] = -1;
            iIndices[1] = 26;
            iIndices[3] = 26;
            iIndices[4] = 26;
            iIndices[5] = 26;
            iIndices[6] = 26;
            iIndices[7] = 26;
            iIndices[8] = 26;
            iIndices[9] = 26;
            iIndices[10] = 26;
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                0, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            /* This test fails because method [org.joda.time.Period.toStandardDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 9]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.toStandardDays(Period.java:1407) */
            period.toStandardDays();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    @Test
    public void testToStandardDays2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 2;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = new int[11];
            iIndices[1] = 26;
            iIndices[2] = -1;
            iIndices[3] = 26;
            iIndices[4] = 26;
            iIndices[5] = 26;
            iIndices[6] = 26;
            iIndices[7] = 26;
            iIndices[8] = 26;
            iIndices[9] = 26;
            iIndices[10] = 26;
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                0, 0, 0, 0, 0, 0, 0, 0,
                0
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            /* This test fails because method [org.joda.time.Period.toStandardDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 9]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.toStandardDays(Period.java:1407) */
            period.toStandardDays();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    @Test
    public void testToStandardDays3() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {
                -1, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardDays] produces [java.lang.NullPointerException]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.toStandardDays(Period.java:1407) */
            period.toStandardDays();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.toStandardHours
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toStandardHours()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardHours()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: checkYearsAndMonths("Hours");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardHours_ThrowUnsupportedOperationException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {1};
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            period.toStandardHours();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardHours()}
 * @utbot.invokes {@link org.joda.time.Period#getYears()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: checkYearsAndMonths("Hours");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardHours_ThrowUnsupportedOperationException_1() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 1;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {-1, 0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {1};
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            period.toStandardHours();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toStandardHours()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardHours()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Hours");
 *  */
    @Test
    public void testToStandardHours_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getMonths(Period.java:746)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1546)
                org.joda.time.Period.toStandardHours(Period.java:1437) */
            period.toStandardHours();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardHours()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Hours");
 *  */
    @Test
    public void testToStandardHours_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.toStandardHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMonths(Period.java:746)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1546)
                org.joda.time.Period.toStandardHours(Period.java:1437) */
            period.toStandardHours();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardHours()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Hours");
 *  */
    @Test
    public void testToStandardHours_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 1073741824;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.toStandardHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getYears(Period.java:737)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1549)
                org.joda.time.Period.toStandardHours(Period.java:1437) */
            period.toStandardHours();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardHours()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Hours");
 *  */
    @Test
    public void testToStandardHours_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 1073741824;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getYears(Period.java:737)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1549)
                org.joda.time.Period.toStandardHours(Period.java:1437) */
            period.toStandardHours();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toStandardHours()
    
    @Test
    public void testToStandardHours1() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 2;
            PeriodType.MILLI_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = new int[11];
            iIndices[0] = -1;
            iIndices[1] = 26;
            iIndices[3] = 26;
            iIndices[4] = 26;
            iIndices[5] = 26;
            iIndices[6] = 26;
            iIndices[7] = 26;
            iIndices[8] = 26;
            iIndices[9] = 26;
            iIndices[10] = 26;
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                0, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            /* This test fails because method [org.joda.time.Period.toStandardHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 9]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getSeconds(Period.java:792)
                org.joda.time.Period.toStandardHours(Period.java:1439) */
            period.toStandardHours();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    
    @Test
    public void testToStandardHours2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 2;
            PeriodType.MILLI_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = new int[11];
            iIndices[1] = 26;
            iIndices[2] = -1;
            iIndices[3] = 26;
            iIndices[4] = 26;
            iIndices[5] = 26;
            iIndices[6] = 26;
            iIndices[7] = 26;
            iIndices[8] = 26;
            iIndices[9] = 26;
            iIndices[10] = 26;
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                0, 0, 0, 0, 0, 0, 0, 0,
                0
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            /* This test fails because method [org.joda.time.Period.toStandardHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 9]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getSeconds(Period.java:792)
                org.joda.time.Period.toStandardHours(Period.java:1439) */
            period.toStandardHours();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    
    @Test
    public void testToStandardHours3() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        int prevMILLI_INDEX = PeriodType.MILLI_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 0;
            PeriodType.MILLI_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {
                -1, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardHours] produces [java.lang.NullPointerException]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getSeconds(Period.java:792)
                org.joda.time.Period.toStandardHours(Period.java:1439) */
            period.toStandardHours();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
            PeriodType.MILLI_INDEX = prevMILLI_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.toStandardMinutes
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toStandardMinutes()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardMinutes()}
 * @utbot.invokes org.joda.time.Period#checkYearsAndMonths(java.lang.String)
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes org.joda.time.Period#checkYearsAndMonths(java.lang.String)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: checkYearsAndMonths("Minutes");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardMinutes_ThrowUnsupportedOperationException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {1};
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            period.toStandardMinutes();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toStandardMinutes()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardMinutes()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Minutes");
 *  */
    @Test
    public void testToStandardMinutes_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getMonths(Period.java:746)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1546)
                org.joda.time.Period.toStandardMinutes(Period.java:1468) */
            period.toStandardMinutes();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardMinutes()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Minutes");
 *  */
    @Test
    public void testToStandardMinutes_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.toStandardMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMonths(Period.java:746)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1546)
                org.joda.time.Period.toStandardMinutes(Period.java:1468) */
            period.toStandardMinutes();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardMinutes()}
 * @utbot.invokes {@link org.joda.time.Period#getYears()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Minutes");
 *  */
    @Test
    public void testToStandardMinutes_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 536870912;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.toStandardMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getYears(Period.java:737)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1549)
                org.joda.time.Period.toStandardMinutes(Period.java:1468) */
            period.toStandardMinutes();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toStandardMinutes()
    
    @Test
    public void testToStandardMinutes1() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = Integer.MIN_VALUE;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {
                -1, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getYears(Period.java:737)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1549)
                org.joda.time.Period.toStandardMinutes(Period.java:1468) */
            period.toStandardMinutes();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    @Test
    public void testToStandardMinutes2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 2;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = new int[11];
            iIndices[0] = -1;
            iIndices[1] = 26;
            iIndices[3] = 26;
            iIndices[4] = 26;
            iIndices[5] = 26;
            iIndices[6] = 26;
            iIndices[7] = 26;
            iIndices[8] = 26;
            iIndices[9] = 26;
            iIndices[10] = 26;
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                0, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            /* This test fails because method [org.joda.time.Period.toStandardMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 9]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.toStandardMinutes(Period.java:1469) */
            period.toStandardMinutes();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    @Test
    public void testToStandardMinutes3() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 2;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = new int[11];
            iIndices[1] = 26;
            iIndices[2] = -1;
            iIndices[3] = 26;
            iIndices[4] = 26;
            iIndices[5] = 26;
            iIndices[6] = 26;
            iIndices[7] = 26;
            iIndices[8] = 26;
            iIndices[9] = 26;
            iIndices[10] = 26;
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                0, 0, 0, 0, 0, 0, 0, 0,
                0
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            /* This test fails because method [org.joda.time.Period.toStandardMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 9]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.toStandardMinutes(Period.java:1469) */
            period.toStandardMinutes();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    @Test
    public void testToStandardMinutes4() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {
                -1, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardMinutes] produces [java.lang.NullPointerException]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.toStandardMinutes(Period.java:1469) */
            period.toStandardMinutes();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Period.toStandardDuration
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toStandardDuration()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardDuration()}
 * @utbot.invokes org.joda.time.Period#checkYearsAndMonths(java.lang.String)
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes org.joda.time.Period#checkYearsAndMonths(java.lang.String)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: checkYearsAndMonths("Duration");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardDuration_ThrowUnsupportedOperationException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {1};
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            period.toStandardDuration();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toStandardDuration()
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardDuration()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Duration");
 *  */
    @Test
    public void testToStandardDuration_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = Integer.MIN_VALUE;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardDuration] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getMonths(Period.java:746)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1546)
                org.joda.time.Period.toStandardDuration(Period.java:1529) */
            period.toStandardDuration();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardDuration()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Duration");
 *  */
    @Test
    public void testToStandardDuration_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {Integer.MIN_VALUE};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.toStandardDuration] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMonths(Period.java:746)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1546)
                org.joda.time.Period.toStandardDuration(Period.java:1529) */
            period.toStandardDuration();
        } finally {
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardDuration()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Duration");
 *  */
    @Test
    public void testToStandardDuration_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 1073741824;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {0};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iIndices);
            
            /* This test fails because method [org.joda.time.Period.toStandardDuration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getYears(Period.java:737)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1549)
                org.joda.time.Period.toStandardDuration(Period.java:1529) */
            period.toStandardDuration();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    /**
    @utbot.classUnderTest {@link Period}
 * @utbot.methodUnderTest {@link org.joda.time.Period#toStandardDuration()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkYearsAndMonths("Duration");
 *  */
    @Test
    public void testToStandardDuration_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 1073741824;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {-1};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardDuration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:674)
                org.joda.time.Period.getYears(Period.java:737)
                org.joda.time.Period.checkYearsAndMonths(Period.java:1549)
                org.joda.time.Period.toStandardDuration(Period.java:1529) */
            period.toStandardDuration();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toStandardDuration()
    
    @Test
    public void testToStandardDuration1() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 2;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = new int[11];
            iIndices[0] = -1;
            iIndices[1] = 26;
            iIndices[3] = 26;
            iIndices[4] = 26;
            iIndices[5] = 26;
            iIndices[6] = 26;
            iIndices[7] = 26;
            iIndices[8] = 26;
            iIndices[9] = 26;
            iIndices[10] = 26;
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                0, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            /* This test fails because method [org.joda.time.Period.toStandardDuration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 9]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.toStandardDuration(Period.java:1530) */
            period.toStandardDuration();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    @Test
    public void testToStandardDuration2() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 2;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = new int[11];
            iIndices[1] = 26;
            iIndices[2] = -1;
            iIndices[3] = 26;
            iIndices[4] = 26;
            iIndices[5] = 26;
            iIndices[6] = 26;
            iIndices[7] = 26;
            iIndices[8] = 26;
            iIndices[9] = 26;
            iIndices[10] = 26;
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {
                0, 0, 0, 0, 0, 0, 0, 0,
                0
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            /* This test fails because method [org.joda.time.Period.toStandardDuration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 9]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.toStandardDuration(Period.java:1530) */
            period.toStandardDuration();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    
    @Test
    public void testToStandardDuration3() throws Exception  {
        int prevYEAR_INDEX = PeriodType.YEAR_INDEX;
        int prevMONTH_INDEX = PeriodType.MONTH_INDEX;
        try {
            PeriodType.YEAR_INDEX = 0;
            PeriodType.MONTH_INDEX = 0;
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            int[] iIndices = {
                -1, 26, 26, 26, 26, 26, 26, 26,
                26
            };
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            /* This test fails because method [org.joda.time.Period.toStandardDuration] produces [java.lang.NullPointerException]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.PeriodType.getIndexedField(PeriodType.java:675)
                org.joda.time.Period.getMillis(Period.java:801)
                org.joda.time.Period.toStandardDuration(Period.java:1530) */
            period.toStandardDuration();
        } finally {
            PeriodType.YEAR_INDEX = prevYEAR_INDEX;
            PeriodType.MONTH_INDEX = prevMONTH_INDEX;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1051027830547200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1051027830547200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1051027830555700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1051027830547200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1051027830555700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1051027835310400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1051027835310400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1051027835314299 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1051027835310400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1051027835314299).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1051027835953699 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1051027835953699.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1051027835955699 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1051027835953699.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1051027835955699).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1051027836255300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1051027836255300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1051027836257200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1051027836255300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1051027836257200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

