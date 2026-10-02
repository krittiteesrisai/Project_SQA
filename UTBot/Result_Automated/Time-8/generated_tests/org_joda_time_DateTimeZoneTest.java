package org.joda.time;

import org.junit.Test;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.CachedDateTimeZone;
import java.lang.reflect.Method;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.StrictChronology;
import java.util.Locale;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.DefaultNameProvider;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import org.joda.time.format.DateTimeFormatter;
import java.lang.ref.SoftReference;
import org.junit.Ignore;
import java.lang.reflect.InvocationTargetException;
import java.util.SimpleTimeZone;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.format.DateTimeParser;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public final class org_joda_time_DateTimeZoneTest {
    ///region Test suites for executable org.joda.time.DateTimeZone.convertUTCToLocal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertUTCToLocal(long)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#convertUTCToLocal(long)}
 * @utbot.executesCondition {@code (instantUTC ^ instantLocal): False}
 * @utbot.returnsFrom {@code return instantLocal;}
 *  */
    @Test
    public void testConvertUTCToLocal_InstantUTCXorInstantLocal() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        long actual = fixedDateTimeZone.convertUTCToLocal(-255L);
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#convertUTCToLocal(long)}
 * @utbot.executesCondition {@code (instantUTC ^ instantLocal): True}
 * @utbot.executesCondition {@code (0): False}
 * @utbot.returnsFrom {@code return instantLocal;}
 *  */
    @Test
    public void testConvertUTCToLocal_Zero() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(fixedDateTimeZone, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", -279);
        
        long actual = fixedDateTimeZone.convertUTCToLocal(128L);
        
        assertEquals(-151L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method convertUTCToLocal(long)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#convertUTCToLocal(long)}
 * @utbot.executesCondition {@code (instantUTC ^ instantLocal): True}
 * @utbot.executesCondition {@code (0): True}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getOffset(long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: (instantUTC ^ instantLocal) < 0 && (instantUTC ^ offset) >= 0
 *  */
    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_ThrowArithmeticException() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(fixedDateTimeZone, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 234452994);
        
        fixedDateTimeZone.convertUTCToLocal(9223372036620550399L);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method convertUTCToLocal(long)
    
    @Test
    public void testConvertUTCToLocal1() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.convertUTCToLocal] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getOffset(CachedDateTimeZone.java:103)
            org.joda.time.DateTimeZone.convertUTCToLocal(DateTimeZone.java:949) */
        cachedDateTimeZone.convertUTCToLocal(0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.convertLocalToUTC
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method convertLocalToUTC(long, boolean, long)
    
    @Test
    public void testConvertLocalToUTC1() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        long actual = fixedDateTimeZone.convertLocalToUTC(0L, false, 0L);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method convertLocalToUTC(long, boolean, long)
    
    @Test
    public void testConvertLocalToUTC2() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.convertLocalToUTC] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getOffset(CachedDateTimeZone.java:103)
            org.joda.time.DateTimeZone.convertLocalToUTC(DateTimeZone.java:976) */
        cachedDateTimeZone.convertLocalToUTC(0L, false, 0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.convertLocalToUTC
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertLocalToUTC(long, boolean)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#convertLocalToUTC(long,boolean)}
 * @utbot.executesCondition {@code (instantLocal ^ instantUTC): False}
 * @utbot.returnsFrom {@code return instantUTC;}
 *  */
    @Test
    public void testConvertLocalToUTC_InstantLocalXorInstantUTC() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        long actual = fixedDateTimeZone.convertLocalToUTC(-253L, false);
        
        assertEquals(-253L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#convertLocalToUTC(long,boolean)}
 * @utbot.executesCondition {@code (instantLocal ^ instantUTC): True}
 * @utbot.executesCondition {@code (0): False}
 * @utbot.returnsFrom {@code return instantUTC;}
 *  */
    @Test
    public void testConvertLocalToUTC_Zero() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(fixedDateTimeZone, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", -211);
        
        long actual = fixedDateTimeZone.convertLocalToUTC(-211L, false);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method convertLocalToUTC(long, boolean)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#convertLocalToUTC(long,boolean)}
 * @utbot.executesCondition {@code (offsetLocal != offset): False}
 * @utbot.executesCondition {@code (instantLocal ^ instantUTC): True}
 * @utbot.executesCondition {@code (0): True}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getOffset(long)}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getOffset(long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: (instantLocal ^ instantUTC) < 0 && (instantLocal ^ offset) < 0
 *  */
    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_ThrowArithmeticException() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(fixedDateTimeZone, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2147483412);
        
        fixedDateTimeZone.convertLocalToUTC(-9223372036854775573L, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method convertLocalToUTC(long, boolean)
    
    @Test
    public void testConvertLocalToUTC3() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.convertLocalToUTC] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getOffset(CachedDateTimeZone.java:103)
            org.joda.time.DateTimeZone.convertLocalToUTC(DateTimeZone.java:999) */
        cachedDateTimeZone.convertLocalToUTC(0L, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.getMillisKeepLocal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMillisKeepLocal(org.joda.time.DateTimeZone, long)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getMillisKeepLocal(org.joda.time.DateTimeZone,long)}
 * @utbot.executesCondition {@code (newZone == null): False}
 * @utbot.executesCondition {@code (newZone): True}
 * @utbot.returnsFrom {@code return oldInstant;}
 *  */
    @Test
    public void testGetMillisKeepLocal_NewZone() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        long actual = cachedDateTimeZone.getMillisKeepLocal(cachedDateTimeZone, 1L);
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMillisKeepLocal(org.joda.time.DateTimeZone, long)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getMillisKeepLocal(org.joda.time.DateTimeZone,long)}
 * @utbot.executesCondition {@code (newZone == null): False}
 * @utbot.executesCondition {@code (newZone): False}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#convertUTCToLocal(long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: long instantLocal = convertUTCToLocal(oldInstant);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetMillisKeepLocal_ThrowArithmeticException() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(fixedDateTimeZone, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", -32514);
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        fixedDateTimeZone.getMillisKeepLocal(cachedDateTimeZone, -9223372036854775679L);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getMillisKeepLocal(org.joda.time.DateTimeZone, long)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.DateTimeZone}
     * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getMillisKeepLocal(org.joda.time.DateTimeZone,long)}
     */
    @Test
    public void testGetMillisKeepLocalWithCornerCase() {
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone("", "XZ", Integer.MAX_VALUE, 0);
        
        long actual = fixedDateTimeZone.getMillisKeepLocal(null, 0L);
        
        assertEquals(2147483647L, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getMillisKeepLocal(org.joda.time.DateTimeZone, long)
    
    @Test
    public void testGetMillisKeepLocal1() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        FixedDateTimeZone fixedDateTimeZone1 = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        long actual = fixedDateTimeZone.getMillisKeepLocal(fixedDateTimeZone1, 0L);
        
        assertEquals(0L, actual);
    }
    
    @Test
    public void testGetMillisKeepLocal2() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(fixedDateTimeZone, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", -2);
        FixedDateTimeZone fixedDateTimeZone1 = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        long actual = fixedDateTimeZone.getMillisKeepLocal(fixedDateTimeZone1, 0L);
        
        assertEquals(-2L, actual);
    }
    
    @Test
    public void testGetMillisKeepLocal3() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        long actual = fixedDateTimeZone.getMillisKeepLocal(null, 0L);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMillisKeepLocal(org.joda.time.DateTimeZone, long)
    
    @Test
    public void testGetMillisKeepLocal4() throws Exception  {
        Object dSTZone = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        
        /* This test fails because method [org.joda.time.DateTimeZone.getMillisKeepLocal] produces [java.lang.NullPointerException]
            org.joda.time.tz.DateTimeZoneBuilder$DSTZone.findMatchingRecurrence(DateTimeZoneBuilder.java:1312)
            org.joda.time.tz.DateTimeZoneBuilder$DSTZone.getOffset(DateTimeZoneBuilder.java:1187)
            org.joda.time.DateTimeZone.convertUTCToLocal(DateTimeZone.java:949)
            org.joda.time.DateTimeZone.getMillisKeepLocal(DateTimeZone.java:1057) */
        (((DateTimeZone) dSTZone)).getMillisKeepLocal(null, 0L);
    }
    
    @Test
    public void testGetMillisKeepLocal5() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.getMillisKeepLocal] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getOffset(CachedDateTimeZone.java:103)
            org.joda.time.DateTimeZone.convertLocalToUTC(DateTimeZone.java:976)
            org.joda.time.DateTimeZone.getMillisKeepLocal(DateTimeZone.java:1058) */
        fixedDateTimeZone.getMillisKeepLocal(cachedDateTimeZone, 3L);
    }
    
    @Test
    public void testGetMillisKeepLocal6() throws Throwable  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object precalculatedZone = createInstance("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone");
        
        /* This test fails because method [org.joda.time.DateTimeZone.getMillisKeepLocal] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getOffset(CachedDateTimeZone.java:103)
            org.joda.time.DateTimeZone.convertUTCToLocal(DateTimeZone.java:949)
            org.joda.time.DateTimeZone.getMillisKeepLocal(DateTimeZone.java:1057) */
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class longType = long.class;
        Method getMillisKeepLocalMethod = dateTimeZoneClazz.getDeclaredMethod("getMillisKeepLocal", dateTimeZoneClazz, longType);
        getMillisKeepLocalMethod.setAccessible(true);
        java.lang.Object[] getMillisKeepLocalMethodArguments = new java.lang.Object[2];
        getMillisKeepLocalMethodArguments[0] = precalculatedZone;
        getMillisKeepLocalMethodArguments[1] = 0L;
        try {
            getMillisKeepLocalMethod.invoke(cachedDateTimeZone, getMillisKeepLocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.isLocalDateTimeGap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLocalDateTimeGap(org.joda.time.LocalDateTime)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#isLocalDateTimeGap(org.joda.time.LocalDateTime)}
 *  */
    @Test
    public void testIsLocalDateTimeGap_ReturnFalse() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        boolean actual = fixedDateTimeZone.isLocalDateTimeGap(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#isLocalDateTimeGap(org.joda.time.LocalDateTime)}
 *  */
    @Test
    public void testIsLocalDateTimeGap_ReturnFalse_1() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        FixedDateTimeZone iZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        
        boolean actual = cachedDateTimeZone.isLocalDateTimeGap(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#isLocalDateTimeGap(org.joda.time.LocalDateTime)}
 *  */
    @Test
    public void testIsLocalDateTimeGap_ReturnFalse_2() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        FixedDateTimeZone iZone1 = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        
        boolean actual = cachedDateTimeZone.isLocalDateTimeGap(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isLocalDateTimeGap(org.joda.time.LocalDateTime)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#isLocalDateTimeGap(org.joda.time.LocalDateTime)}
 * @utbot.invokes {@link org.joda.time.LocalDateTime#toDateTime(org.joda.time.DateTimeZone)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testIsLocalDateTimeGap_ThrowClassCastException() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        byte[] iParam = {};
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.DateTimeZone.isLocalDateTimeGap] produces [java.lang.ClassCastException: class [B cannot be cast to class org.joda.time.DateTimeZone ([B is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3067726d)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:85)
            org.joda.time.chrono.GJChronology.getZone(GJChronology.java:294)
            org.joda.time.chrono.AssembledChronology.getZone(AssembledChronology.java:108)
            org.joda.time.chrono.ISOChronology.withZone(ISOChronology.java:146)
            org.joda.time.LocalDateTime.toDateTime(LocalDateTime.java:741)
            org.joda.time.DateTimeZone.isLocalDateTimeGap(DateTimeZone.java:1172) */
        cachedDateTimeZone.isLocalDateTimeGap(localDateTime);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#isLocalDateTimeGap(org.joda.time.LocalDateTime)}
 * @utbot.invokes {@link org.joda.time.LocalDateTime#toDateTime(org.joda.time.DateTimeZone)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localDateTime.toDateTime(this);
 *  */
    @Test
    public void testIsLocalDateTimeGap_ThrowNullPointerException() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        
        /* This test fails because method [org.joda.time.DateTimeZone.isLocalDateTimeGap] produces [java.lang.NullPointerException]
            org.joda.time.DateTimeZone.isLocalDateTimeGap(DateTimeZone.java:1172) */
        cachedDateTimeZone.isLocalDateTimeGap(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isLocalDateTimeGap(org.joda.time.LocalDateTime)
    
    @Test
    public void testIsLocalDateTimeGap1() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone3 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone4 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone5 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone6 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone7 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone8 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        FixedDateTimeZone iZone9 = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iZone8, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone9);
        setField(iZone7, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone8);
        setField(iZone6, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone7);
        setField(iZone5, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone6);
        setField(iZone4, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone5);
        setField(iZone3, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone4);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iZone1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        
        boolean actual = cachedDateTimeZone.isLocalDateTimeGap(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isLocalDateTimeGap(org.joda.time.LocalDateTime)
    
    @Test(expected = StackOverflowError.class)
    public void testIsLocalDateTimeGap2() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        
        cachedDateTimeZone.isLocalDateTimeGap(null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testIsLocalDateTimeGap3() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        cachedDateTimeZone.isLocalDateTimeGap(localDateTime);
    }
    
    @Test
    public void testIsLocalDateTimeGap4() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", -9223372036854775807L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", cachedDateTimeZone);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        PreciseDateTimeField iYear = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iYear, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 0L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.DateTimeZone.isLocalDateTimeGap] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:82)
            org.joda.time.LocalDateTime.getYear(LocalDateTime.java:1501)
            org.joda.time.LocalDateTime.toDateTime(LocalDateTime.java:743)
            org.joda.time.DateTimeZone.isLocalDateTimeGap(DateTimeZone.java:1172) */
        cachedDateTimeZone.isLocalDateTimeGap(localDateTime);
    }
    
    @Test
    public void testIsLocalDateTimeGap5() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", cachedDateTimeZone);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        PreciseDateTimeField iYear = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iYear, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 0L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.DateTimeZone.isLocalDateTimeGap] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:80)
            org.joda.time.LocalDateTime.getYear(LocalDateTime.java:1501)
            org.joda.time.LocalDateTime.toDateTime(LocalDateTime.java:743)
            org.joda.time.DateTimeZone.isLocalDateTimeGap(DateTimeZone.java:1172) */
        cachedDateTimeZone.isLocalDateTimeGap(localDateTime);
    }
    
    @Test
    public void testIsLocalDateTimeGap6() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ZonedChronology iChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iParam", cachedDateTimeZone);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.DateTimeZone.isLocalDateTimeGap] produces [java.lang.NullPointerException]
            org.joda.time.LocalDateTime.getYear(LocalDateTime.java:1501)
            org.joda.time.LocalDateTime.toDateTime(LocalDateTime.java:743)
            org.joda.time.DateTimeZone.isLocalDateTimeGap(DateTimeZone.java:1172) */
        cachedDateTimeZone.isLocalDateTimeGap(localDateTime);
    }
    
    @Test
    public void testIsLocalDateTimeGap7() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone3 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone4 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone3, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone4);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iZone1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        
        /* This test fails because method [org.joda.time.DateTimeZone.isLocalDateTimeGap] produces [java.lang.NullPointerException]
            org.joda.time.DateTimeZone.isLocalDateTimeGap(DateTimeZone.java:1172) */
        cachedDateTimeZone.isLocalDateTimeGap(null);
    }
    
    @Test
    public void testIsLocalDateTimeGap8() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", cachedDateTimeZone);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        DelegatedDateTimeField iYear = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.DateTimeZone.isLocalDateTimeGap] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:96)
            org.joda.time.LocalDateTime.getYear(LocalDateTime.java:1501)
            org.joda.time.LocalDateTime.toDateTime(LocalDateTime.java:743)
            org.joda.time.DateTimeZone.isLocalDateTimeGap(DateTimeZone.java:1172) */
        cachedDateTimeZone.isLocalDateTimeGap(localDateTime);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isLocalDateTimeGap(org.joda.time.LocalDateTime)
    
    @Test(expected = NullPointerException.class)
    public void testIsLocalDateTimeGap9() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        BuddhistChronology iBase = ((BuddhistChronology) createInstance("org.joda.time.chrono.BuddhistChronology"));
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        cachedDateTimeZone.isLocalDateTimeGap(localDateTime);
    }
    
    @Test(expected = NullPointerException.class)
    public void testIsLocalDateTimeGap10() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        cachedDateTimeZone.isLocalDateTimeGap(localDateTime);
    }
    
    @Test(expected = NullPointerException.class)
    public void testIsLocalDateTimeGap11() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        cachedDateTimeZone.isLocalDateTimeGap(localDateTime);
    }
    
    @Test(expected = NullPointerException.class)
    public void testIsLocalDateTimeGap12() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        StrictChronology iBase1 = ((StrictChronology) createInstance("org.joda.time.chrono.StrictChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        cachedDateTimeZone.isLocalDateTimeGap(localDateTime);
    }
    
    @Test(expected = NullPointerException.class)
    public void testIsLocalDateTimeGap13() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        cachedDateTimeZone.isLocalDateTimeGap(localDateTime);
    }
    
    @Test(expected = NullPointerException.class)
    public void testIsLocalDateTimeGap14() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(cachedDateTimeZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        cachedDateTimeZone.isLocalDateTimeGap(localDateTime);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.adjustOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method adjustOffset(long, boolean)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#adjustOffset(long,boolean)}
 * @utbot.executesCondition {@code (offsetBefore <= offsetAfter): True}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getOffset(long)}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getOffset(long)}
 *  */
    @Test
    public void testAdjustOffset_OffsetBeforeLessOrEqualOffsetAfter() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        long actual = fixedDateTimeZone.adjustOffset(1L, false);
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method adjustOffset(long, boolean)
    
    @Test
    public void testAdjustOffset1() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.adjustOffset] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getOffset(CachedDateTimeZone.java:103)
            org.joda.time.DateTimeZone.adjustOffset(DateTimeZone.java:1192) */
        cachedDateTimeZone.adjustOffset(0L, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName(long)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getName(long)}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getName(long,java.util.Locale)}
 * @utbot.returnsFrom {@code return getName(instant, null);}
 *  */
    @Test
    public void testGetName_DateTimeZoneGetName() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        String actual = fixedDateTimeZone.getName(-255L);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getName(long)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.DateTimeZone}
     * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getName(long)}
     */
    @Test
    public void testGetName() {
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone("", "XZ", -1, -1);
        
        String actual = fixedDateTimeZone.getName(4611686018427387903L);
        
        String expected = "-00:00:00.001";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getName(long)
    
    @Test
    public void testGetName1() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iNameKey = "";
        setField(fixedDateTimeZone, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", iNameKey);
        
        String actual = fixedDateTimeZone.getName(0L);
        
        String expected = "+00:00";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getName(long)
    
    @Test
    public void testGetName2() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.getName] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getNameKey(CachedDateTimeZone.java:99)
            org.joda.time.DateTimeZone.getName(DateTimeZone.java:812)
            org.joda.time.DateTimeZone.getName(DateTimeZone.java:794) */
        cachedDateTimeZone.getName(0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName(long, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getName(long,java.util.Locale)}
 * @utbot.executesCondition {@code (locale == null): False}
 * @utbot.returnsFrom {@code return iID;}
 *  */
    @Test
    public void testGetName_LocaleNotEqualsNull() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        String actual = fixedDateTimeZone.getName(-255L, locale);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getName(long,java.util.Locale)}
 * @utbot.executesCondition {@code (locale == null): True}
 * @utbot.invokes {@link java.util.Locale#getDefault()}
 *  */
    @Test
    public void testGetName_LocaleEqualsNull() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        String actual = fixedDateTimeZone.getName(-255L, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getName(long, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.DateTimeZone}
     * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getName(long,java.util.Locale)}
     */
    @Test
    public void testGetName3() {
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone("", "XZ", -1, -1);
        
        String actual = fixedDateTimeZone.getName(9223371487098961919L, null);
        
        String expected = "-00:00:00.001";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getName(long, java.util.Locale)
    
    @Test
    public void testGetName4() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iNameKey = "";
        setField(fixedDateTimeZone, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", iNameKey);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        String actual = fixedDateTimeZone.getName(0L, locale);
        
        String expected = "+00:00";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetName5() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iNameKey = "";
        setField(fixedDateTimeZone, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", iNameKey);
        
        String actual = fixedDateTimeZone.getName(0L, null);
        
        String expected = "+00:00";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getName(long, java.util.Locale)
    
    @Test
    public void testGetName6() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.getName] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getNameKey(CachedDateTimeZone.java:99)
            org.joda.time.DateTimeZone.getName(DateTimeZone.java:812) */
        cachedDateTimeZone.getName(0L, null);
    }
    
    @Test
    public void testGetName7() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.getName] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getNameKey(CachedDateTimeZone.java:99)
            org.joda.time.DateTimeZone.getName(DateTimeZone.java:812) */
        cachedDateTimeZone.getName(0L, locale);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#toString()}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getID()}
 * @utbot.returnsFrom {@code return getID();}
 *  */
    @Test
    public void testToString_DateTimeZoneGetID() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        String actual = cachedDateTimeZone.toString();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#hashCode()}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getID()}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.returnsFrom {@code return 57 + getID().hashCode();}
 *  */
    @Test
    public void testHashCode_StringHashCode() throws Exception  {
        Object precalculatedZone = createInstance("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone");
        String iID = " ";
        setField(precalculatedZone, "org.joda.time.DateTimeZone", "iID", iID);
        
        int actual = (((DateTimeZone) precalculatedZone)).hashCode();
        
        assertEquals(89, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#hashCode()}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getID()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return 57 + getID().hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        Object precalculatedZone = createInstance("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone");
        
        /* This test fails because method [org.joda.time.DateTimeZone.hashCode] produces [java.lang.NullPointerException]
            org.joda.time.DateTimeZone.hashCode(DateTimeZone.java:1273) */
        (((DateTimeZone) precalculatedZone)).hashCode();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.DateTimeZone}
     * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#hashCode()}
     */
    @Test
    public void testHashCode() {
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone("", "XZ", Integer.MAX_VALUE, 0);
        
        int actual = fixedDateTimeZone.hashCode();
        
        assertEquals(2147483617, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.getDefault
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDefault()
    
    @Test
    public void testGetDefault1() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.getDefault());
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iNameKey = "UTC";
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", iNameKey);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        cAvailableIDs.add(iNameKey);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", expected);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string = "+02:00";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string, softReference);
        String string1 = "-23:59:59.998";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference1);
        String string2 = "\n\t\r";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference2);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string3 = "CTT";
        String string4 = "Asia/Shanghai";
        cZoneIdConversion.put(string3, string4);
        String string5 = "ART";
        String string6 = "Africa/Cairo";
        cZoneIdConversion.put(string5, string6);
        String string7 = "WET";
        cZoneIdConversion.put(string7, string7);
        String string8 = "CNT";
        String string9 = "America/St_Johns";
        cZoneIdConversion.put(string8, string9);
        String string10 = "PRT";
        String string11 = "America/Puerto_Rico";
        cZoneIdConversion.put(string10, string11);
        String string12 = "PNT";
        String string13 = "America/Phoenix";
        cZoneIdConversion.put(string12, string13);
        String string14 = "PLT";
        String string15 = "Asia/Karachi";
        cZoneIdConversion.put(string14, string15);
        String string16 = "AST";
        String string17 = "America/Anchorage";
        cZoneIdConversion.put(string16, string17);
        String string18 = "BST";
        String string19 = "Asia/Dhaka";
        cZoneIdConversion.put(string18, string19);
        String string20 = "CST";
        String string21 = "America/Chicago";
        cZoneIdConversion.put(string20, string21);
        String string22 = "EST";
        String string23 = "America/New_York";
        cZoneIdConversion.put(string22, string23);
        String string24 = "HST";
        String string25 = "Pacific/Honolulu";
        cZoneIdConversion.put(string24, string25);
        String string26 = "JST";
        String string27 = "Asia/Tokyo";
        cZoneIdConversion.put(string26, string27);
        String string28 = "IST";
        String string29 = "Asia/Kolkata";
        cZoneIdConversion.put(string28, string29);
        String string30 = "AGT";
        String string31 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string30, string31);
        String string32 = "NST";
        String string33 = "Pacific/Auckland";
        cZoneIdConversion.put(string32, string33);
        String string34 = "GMT";
        cZoneIdConversion.put(string34, iNameKey);
        String string35 = "MST";
        String string36 = "America/Denver";
        cZoneIdConversion.put(string35, string36);
        String string37 = "PST";
        String string38 = "America/Los_Angeles";
        cZoneIdConversion.put(string37, string38);
        String string39 = "BET";
        String string40 = "America/Sao_Paulo";
        cZoneIdConversion.put(string39, string40);
        String string41 = "AET";
        String string42 = "Australia/Sydney";
        cZoneIdConversion.put(string41, string42);
        String string43 = "ACT";
        String string44 = "Australia/Darwin";
        cZoneIdConversion.put(string43, string44);
        String string45 = "CET";
        cZoneIdConversion.put(string45, string45);
        String string46 = "EET";
        cZoneIdConversion.put(string46, string46);
        String string47 = "SST";
        String string48 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string47, string48);
        String string49 = "VST";
        String string50 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string49, string50);
        String string51 = "ECT";
        cZoneIdConversion.put(string51, string45);
        String string52 = "CAT";
        String string53 = "Africa/Harare";
        cZoneIdConversion.put(string52, string53);
        String string54 = "MIT";
        String string55 = "Pacific/Apia";
        cZoneIdConversion.put(string54, string55);
        String string56 = "IET";
        String string57 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string56, string57);
        String string58 = "EAT";
        String string59 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string58, string59);
        String string60 = "NET";
        String string61 = "Asia/Yerevan";
        cZoneIdConversion.put(string60, string61);
        String string62 = "MET";
        cZoneIdConversion.put(string62, string45);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", iNameKey);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.getOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOffset(org.joda.time.ReadableInstant)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getOffset(org.joda.time.ReadableInstant)}
 * @utbot.executesCondition {@code (instant == null): False}
 * @utbot.invokes {@link org.joda.time.ReadableInstant#getMillis()}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getOffset(long)}
 * @utbot.returnsFrom {@code return getOffset(instant.getMillis());}
 *  */
    @Test
    public void testGetOffset_InstantNotEqualsNull() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        Instant instant = new Instant(0L);
        
        int actual = fixedDateTimeZone.getOffset(instant);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getOffset(org.joda.time.ReadableInstant)
    
    @Test
    public void testGetOffset1() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        MutableDateTime mutableDateTime = ((MutableDateTime) createInstance("org.joda.time.MutableDateTime"));
        setField(mutableDateTime, "org.joda.time.base.BaseDateTime", "iMillis", 0L);
        
        int actual = fixedDateTimeZone.getOffset(mutableDateTime);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetOffset2() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        int actual = fixedDateTimeZone.getOffset(((ReadableInstant) null));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getOffset(org.joda.time.ReadableInstant)
    
    @Test
    public void testGetOffset3() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Instant instant = new Instant(0L);
        
        /* This test fails because method [org.joda.time.DateTimeZone.getOffset] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getOffset(CachedDateTimeZone.java:103)
            org.joda.time.DateTimeZone.getOffset(DateTimeZone.java:841) */
        cachedDateTimeZone.getOffset(instant);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.writeReplace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeReplace()
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#writeReplace()}
 * @utbot.returnsFrom {@code return new Stub(iID);}
 *  */
    @Test
    public void testWriteReplace_Return() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        Object actual = cachedDateTimeZone.writeReplace();
        
        Object expected = createInstance("org.joda.time.DateTimeZone$Stub");
        
        String actualIID = ((String) getFieldValue(actual, "org.joda.time.DateTimeZone$Stub", "iID"));
        assertNull(actualIID);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.setDefault
    
    ///region OTHER: SECURITY for method setDefault(org.joda.time.DateTimeZone)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testSetDefault1() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.setDefault] produces [java.security.AccessControlException: access denied ("org.joda.time.JodaTimePermission" "DateTimeZone.setDefault")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            org.joda.time.DateTimeZone.setDefault(DateTimeZone.java:177) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.getID
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getID()
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getID()}
 * @utbot.returnsFrom {@code return iID;}
 *  */
    @Test
    public void testGetID_ReturnIID() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        String actual = fixedDateTimeZone.getID();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.getProvider
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getProvider()
    
    @Test
    public void testGetProvider1() {
        UTCProvider actual = ((UTCProvider) DateTimeZone.getProvider());
        
        UTCProvider expected = new UTCProvider();
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.getDefaultProvider
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDefaultProvider()
    
    @Test
    public void testGetDefaultProvider1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Method getDefaultProviderMethod = dateTimeZoneClazz.getDeclaredMethod("getDefaultProvider");
        getDefaultProviderMethod.setAccessible(true);
        java.lang.Object[] getDefaultProviderMethodArguments = new java.lang.Object[0];
        UTCProvider actual = ((UTCProvider) getDefaultProviderMethod.invoke(null, getDefaultProviderMethodArguments));
        
        UTCProvider expected = new UTCProvider();
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.getAvailableIDs
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getAvailableIDs()
    
    @Test
    public void testGetAvailableIDs1() {
        Set actual = DateTimeZone.getAvailableIDs();
        
        Set expected = new LinkedHashSet();
        String string = "UTC";
        expected.add(string);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.toTimeZone
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toTimeZone()
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#toTimeZone()}
 * @utbot.invokes {@link java.util.TimeZone#getTimeZone(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return java.util.TimeZone.getTimeZone(iID);
 *  */
    @Test
    public void testToTimeZone_ThrowNullPointerException() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.toTimeZone] produces [java.lang.NullPointerException]
            java.base/java.util.TimeZone.parseCustomTimeZone(TimeZone.java:801)
            java.base/java.util.TimeZone.getTimeZone(TimeZone.java:580)
            java.base/java.util.TimeZone.getTimeZone(TimeZone.java:518)
            org.joda.time.DateTimeZone.toTimeZone(DateTimeZone.java:1256) */
        cachedDateTimeZone.toTimeZone();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toTimeZone()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.DateTimeZone}
     * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#toTimeZone()}
     */
    @Test
    public void testToTimeZone() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone("", "XZ", -1, -1);
        
        SimpleTimeZone actual = ((SimpleTimeZone) fixedDateTimeZone.toTimeZone());
        
        SimpleTimeZone expected = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        
        // java.util.SimpleTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for toTimeZone
    
    public void testToTimeZone_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.getDefaultNameProvider
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDefaultNameProvider()
    
    @Test
    public void testGetDefaultNameProvider1() throws Exception  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Method getDefaultNameProviderMethod = dateTimeZoneClazz.getDeclaredMethod("getDefaultNameProvider");
        getDefaultNameProviderMethod.setAccessible(true);
        java.lang.Object[] getDefaultNameProviderMethodArguments = new java.lang.Object[0];
        DefaultNameProvider actual = ((DefaultNameProvider) getDefaultNameProviderMethod.invoke(null, getDefaultNameProviderMethodArguments));
        
        DefaultNameProvider expected = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(expected, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        
        HashMap expectedIByLocaleCache = ((HashMap) getFieldValue(expected, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache"));
        HashMap actualIByLocaleCache = ((HashMap) getFieldValue(actual, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache"));
        assertTrue(deepEquals(expectedIByLocaleCache, actualIByLocaleCache));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.forOffsetHoursMinutes
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method forOffsetHoursMinutes(int, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#forOffsetHoursMinutes(int,int)}
 * @utbot.executesCondition {@code (hoursOffset == 0): False}
 * @utbot.executesCondition {@code (hoursOffset < -23): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: hoursOffset < -23 || hoursOffset > 23
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_ThrowIllegalArgumentException() {
        DateTimeZone.forOffsetHoursMinutes(-24, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#forOffsetHoursMinutes(int,int)}
 * @utbot.executesCondition {@code (hoursOffset == 0): True}
 * @utbot.executesCondition {@code (minutesOffset == 0): False}
 * @utbot.executesCondition {@code (hoursOffset < -23): False}
 * @utbot.executesCondition {@code (hoursOffset > 23): False}
 * @utbot.executesCondition {@code (minutesOffset < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: minutesOffset < 0 || minutesOffset > 59
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_ThrowIllegalArgumentException_1() {
        DateTimeZone.forOffsetHoursMinutes(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#forOffsetHoursMinutes(int,int)}
 * @utbot.executesCondition {@code (hoursOffset == 0): True}
 * @utbot.executesCondition {@code (minutesOffset == 0): False}
 * @utbot.executesCondition {@code (hoursOffset < -23): False}
 * @utbot.executesCondition {@code (hoursOffset > 23): False}
 * @utbot.executesCondition {@code (minutesOffset < 0): False}
 * @utbot.executesCondition {@code (minutesOffset > 59): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: minutesOffset < 0 || minutesOffset > 59
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_ThrowIllegalArgumentException_2() {
        DateTimeZone.forOffsetHoursMinutes(0, 60);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#forOffsetHoursMinutes(int,int)}
 * @utbot.executesCondition {@code (hoursOffset == 0): False}
 * @utbot.executesCondition {@code (hoursOffset < -23): False}
 * @utbot.executesCondition {@code (hoursOffset > 23): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: hoursOffset < -23 || hoursOffset > 23
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_ThrowIllegalArgumentException_3() {
        DateTimeZone.forOffsetHoursMinutes(26, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method forOffsetHoursMinutes(int, int)
    
    @Test
    public void testForOffsetHoursMinutes1() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forOffsetHoursMinutes(0, 0));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iNameKey = "UTC";
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", iNameKey);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        cAvailableIDs.add(iNameKey);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", expected);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string = "+02:00";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string, softReference);
        String string1 = "+04:01";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference1);
        String string2 = "-23:59:59.998";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference2);
        String string3 = "\n\t\r";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference3);
        String string4 = "-11:32";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference4);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string5 = "CTT";
        String string6 = "Asia/Shanghai";
        cZoneIdConversion.put(string5, string6);
        String string7 = "ART";
        String string8 = "Africa/Cairo";
        cZoneIdConversion.put(string7, string8);
        String string9 = "WET";
        cZoneIdConversion.put(string9, string9);
        String string10 = "CNT";
        String string11 = "America/St_Johns";
        cZoneIdConversion.put(string10, string11);
        String string12 = "PRT";
        String string13 = "America/Puerto_Rico";
        cZoneIdConversion.put(string12, string13);
        String string14 = "PNT";
        String string15 = "America/Phoenix";
        cZoneIdConversion.put(string14, string15);
        String string16 = "PLT";
        String string17 = "Asia/Karachi";
        cZoneIdConversion.put(string16, string17);
        String string18 = "AST";
        String string19 = "America/Anchorage";
        cZoneIdConversion.put(string18, string19);
        String string20 = "BST";
        String string21 = "Asia/Dhaka";
        cZoneIdConversion.put(string20, string21);
        String string22 = "CST";
        String string23 = "America/Chicago";
        cZoneIdConversion.put(string22, string23);
        String string24 = "EST";
        String string25 = "America/New_York";
        cZoneIdConversion.put(string24, string25);
        String string26 = "HST";
        String string27 = "Pacific/Honolulu";
        cZoneIdConversion.put(string26, string27);
        String string28 = "JST";
        String string29 = "Asia/Tokyo";
        cZoneIdConversion.put(string28, string29);
        String string30 = "IST";
        String string31 = "Asia/Kolkata";
        cZoneIdConversion.put(string30, string31);
        String string32 = "AGT";
        String string33 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string32, string33);
        String string34 = "NST";
        String string35 = "Pacific/Auckland";
        cZoneIdConversion.put(string34, string35);
        String string36 = "GMT";
        cZoneIdConversion.put(string36, iNameKey);
        String string37 = "MST";
        String string38 = "America/Denver";
        cZoneIdConversion.put(string37, string38);
        String string39 = "PST";
        String string40 = "America/Los_Angeles";
        cZoneIdConversion.put(string39, string40);
        String string41 = "BET";
        String string42 = "America/Sao_Paulo";
        cZoneIdConversion.put(string41, string42);
        String string43 = "AET";
        String string44 = "Australia/Sydney";
        cZoneIdConversion.put(string43, string44);
        String string45 = "ACT";
        String string46 = "Australia/Darwin";
        cZoneIdConversion.put(string45, string46);
        String string47 = "CET";
        cZoneIdConversion.put(string47, string47);
        String string48 = "EET";
        cZoneIdConversion.put(string48, string48);
        String string49 = "SST";
        String string50 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string49, string50);
        String string51 = "VST";
        String string52 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string51, string52);
        String string53 = "ECT";
        cZoneIdConversion.put(string53, string47);
        String string54 = "CAT";
        String string55 = "Africa/Harare";
        cZoneIdConversion.put(string54, string55);
        String string56 = "MIT";
        String string57 = "Pacific/Apia";
        cZoneIdConversion.put(string56, string57);
        String string58 = "IET";
        String string59 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string58, string59);
        String string60 = "EAT";
        String string61 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string60, string61);
        String string62 = "NET";
        String string63 = "Asia/Yerevan";
        cZoneIdConversion.put(string62, string63);
        String string64 = "MET";
        cZoneIdConversion.put(string64, string47);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", iNameKey);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testForOffsetHoursMinutes2() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forOffsetHoursMinutes(4, 1));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 14460000);
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iStandardOffset", 14460000);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        String string = "UTC";
        cAvailableIDs.add(string);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        FixedDateTimeZone cDefault = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(cDefault, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        setField(cDefault, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs1 = new LinkedHashSet();
        cAvailableIDs1.add(string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(cDefault, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string1 = "+02:00";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference);
        String string2 = "+04:01";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference1);
        String string3 = "-23:59:59.998";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference2);
        String string4 = "\n\t\r";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference3);
        setField(cDefault, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string5 = "CTT";
        String string6 = "Asia/Shanghai";
        cZoneIdConversion.put(string5, string6);
        String string7 = "ART";
        String string8 = "Africa/Cairo";
        cZoneIdConversion.put(string7, string8);
        String string9 = "WET";
        cZoneIdConversion.put(string9, string9);
        String string10 = "CNT";
        String string11 = "America/St_Johns";
        cZoneIdConversion.put(string10, string11);
        String string12 = "PRT";
        String string13 = "America/Puerto_Rico";
        cZoneIdConversion.put(string12, string13);
        String string14 = "PNT";
        String string15 = "America/Phoenix";
        cZoneIdConversion.put(string14, string15);
        String string16 = "PLT";
        String string17 = "Asia/Karachi";
        cZoneIdConversion.put(string16, string17);
        String string18 = "AST";
        String string19 = "America/Anchorage";
        cZoneIdConversion.put(string18, string19);
        String string20 = "BST";
        String string21 = "Asia/Dhaka";
        cZoneIdConversion.put(string20, string21);
        String string22 = "CST";
        String string23 = "America/Chicago";
        cZoneIdConversion.put(string22, string23);
        String string24 = "EST";
        String string25 = "America/New_York";
        cZoneIdConversion.put(string24, string25);
        String string26 = "HST";
        String string27 = "Pacific/Honolulu";
        cZoneIdConversion.put(string26, string27);
        String string28 = "JST";
        String string29 = "Asia/Tokyo";
        cZoneIdConversion.put(string28, string29);
        String string30 = "IST";
        String string31 = "Asia/Kolkata";
        cZoneIdConversion.put(string30, string31);
        String string32 = "AGT";
        String string33 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string32, string33);
        String string34 = "NST";
        String string35 = "Pacific/Auckland";
        cZoneIdConversion.put(string34, string35);
        String string36 = "GMT";
        cZoneIdConversion.put(string36, string);
        String string37 = "MST";
        String string38 = "America/Denver";
        cZoneIdConversion.put(string37, string38);
        String string39 = "PST";
        String string40 = "America/Los_Angeles";
        cZoneIdConversion.put(string39, string40);
        String string41 = "BET";
        String string42 = "America/Sao_Paulo";
        cZoneIdConversion.put(string41, string42);
        String string43 = "AET";
        String string44 = "Australia/Sydney";
        cZoneIdConversion.put(string43, string44);
        String string45 = "ACT";
        String string46 = "Australia/Darwin";
        cZoneIdConversion.put(string45, string46);
        String string47 = "CET";
        cZoneIdConversion.put(string47, string47);
        String string48 = "EET";
        cZoneIdConversion.put(string48, string48);
        String string49 = "SST";
        String string50 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string49, string50);
        String string51 = "VST";
        String string52 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string51, string52);
        String string53 = "ECT";
        cZoneIdConversion.put(string53, string47);
        String string54 = "CAT";
        String string55 = "Africa/Harare";
        cZoneIdConversion.put(string54, string55);
        String string56 = "MIT";
        String string57 = "Pacific/Apia";
        cZoneIdConversion.put(string56, string57);
        String string58 = "IET";
        String string59 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string58, string59);
        String string60 = "EAT";
        String string61 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string60, string61);
        String string62 = "NET";
        String string63 = "Asia/Yerevan";
        cZoneIdConversion.put(string62, string63);
        String string64 = "MET";
        cZoneIdConversion.put(string64, string47);
        setField(cDefault, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(cDefault, "org.joda.time.DateTimeZone", "iID", string);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", string2);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testForOffsetHoursMinutes3() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forOffsetHoursMinutes(-11, 32));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", -41520000);
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iStandardOffset", -41520000);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        String string = "UTC";
        cAvailableIDs.add(string);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        FixedDateTimeZone cDefault = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(cDefault, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        setField(cDefault, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs1 = new LinkedHashSet();
        cAvailableIDs1.add(string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(cDefault, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string1 = "+02:00";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference);
        String string2 = "+04:01";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference1);
        String string3 = "-23:59:59.998";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference2);
        String string4 = "\n\t\r";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference3);
        String string5 = "-11:32";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference4);
        setField(cDefault, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string6 = "CTT";
        String string7 = "Asia/Shanghai";
        cZoneIdConversion.put(string6, string7);
        String string8 = "ART";
        String string9 = "Africa/Cairo";
        cZoneIdConversion.put(string8, string9);
        String string10 = "WET";
        cZoneIdConversion.put(string10, string10);
        String string11 = "CNT";
        String string12 = "America/St_Johns";
        cZoneIdConversion.put(string11, string12);
        String string13 = "PRT";
        String string14 = "America/Puerto_Rico";
        cZoneIdConversion.put(string13, string14);
        String string15 = "PNT";
        String string16 = "America/Phoenix";
        cZoneIdConversion.put(string15, string16);
        String string17 = "PLT";
        String string18 = "Asia/Karachi";
        cZoneIdConversion.put(string17, string18);
        String string19 = "AST";
        String string20 = "America/Anchorage";
        cZoneIdConversion.put(string19, string20);
        String string21 = "BST";
        String string22 = "Asia/Dhaka";
        cZoneIdConversion.put(string21, string22);
        String string23 = "CST";
        String string24 = "America/Chicago";
        cZoneIdConversion.put(string23, string24);
        String string25 = "EST";
        String string26 = "America/New_York";
        cZoneIdConversion.put(string25, string26);
        String string27 = "HST";
        String string28 = "Pacific/Honolulu";
        cZoneIdConversion.put(string27, string28);
        String string29 = "JST";
        String string30 = "Asia/Tokyo";
        cZoneIdConversion.put(string29, string30);
        String string31 = "IST";
        String string32 = "Asia/Kolkata";
        cZoneIdConversion.put(string31, string32);
        String string33 = "AGT";
        String string34 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string33, string34);
        String string35 = "NST";
        String string36 = "Pacific/Auckland";
        cZoneIdConversion.put(string35, string36);
        String string37 = "GMT";
        cZoneIdConversion.put(string37, string);
        String string38 = "MST";
        String string39 = "America/Denver";
        cZoneIdConversion.put(string38, string39);
        String string40 = "PST";
        String string41 = "America/Los_Angeles";
        cZoneIdConversion.put(string40, string41);
        String string42 = "BET";
        String string43 = "America/Sao_Paulo";
        cZoneIdConversion.put(string42, string43);
        String string44 = "AET";
        String string45 = "Australia/Sydney";
        cZoneIdConversion.put(string44, string45);
        String string46 = "ACT";
        String string47 = "Australia/Darwin";
        cZoneIdConversion.put(string46, string47);
        String string48 = "CET";
        cZoneIdConversion.put(string48, string48);
        String string49 = "EET";
        cZoneIdConversion.put(string49, string49);
        String string50 = "SST";
        String string51 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string50, string51);
        String string52 = "VST";
        String string53 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string52, string53);
        String string54 = "ECT";
        cZoneIdConversion.put(string54, string48);
        String string55 = "CAT";
        String string56 = "Africa/Harare";
        cZoneIdConversion.put(string55, string56);
        String string57 = "MIT";
        String string58 = "Pacific/Apia";
        cZoneIdConversion.put(string57, string58);
        String string59 = "IET";
        String string60 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string59, string60);
        String string61 = "EAT";
        String string62 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string61, string62);
        String string63 = "NET";
        String string64 = "Asia/Yerevan";
        cZoneIdConversion.put(string63, string64);
        String string65 = "MET";
        cZoneIdConversion.put(string65, string48);
        setField(cDefault, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(cDefault, "org.joda.time.DateTimeZone", "iID", string);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", string5);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testForOffsetHoursMinutes4() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forOffsetHoursMinutes(0, 44));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2640000);
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iStandardOffset", 2640000);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        String string = "UTC";
        cAvailableIDs.add(string);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        FixedDateTimeZone cDefault = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(cDefault, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        setField(cDefault, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs1 = new LinkedHashSet();
        cAvailableIDs1.add(string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(cDefault, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string1 = "+02:00";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference);
        String string2 = "+04:01";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference1);
        String string3 = "+00:44";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference2);
        String string4 = "-23:59:59.998";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference3);
        String string5 = "\n\t\r";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference4);
        String string6 = "-11:32";
        SoftReference softReference5 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string6, softReference5);
        setField(cDefault, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string7 = "CTT";
        String string8 = "Asia/Shanghai";
        cZoneIdConversion.put(string7, string8);
        String string9 = "ART";
        String string10 = "Africa/Cairo";
        cZoneIdConversion.put(string9, string10);
        String string11 = "WET";
        cZoneIdConversion.put(string11, string11);
        String string12 = "CNT";
        String string13 = "America/St_Johns";
        cZoneIdConversion.put(string12, string13);
        String string14 = "PRT";
        String string15 = "America/Puerto_Rico";
        cZoneIdConversion.put(string14, string15);
        String string16 = "PNT";
        String string17 = "America/Phoenix";
        cZoneIdConversion.put(string16, string17);
        String string18 = "PLT";
        String string19 = "Asia/Karachi";
        cZoneIdConversion.put(string18, string19);
        String string20 = "AST";
        String string21 = "America/Anchorage";
        cZoneIdConversion.put(string20, string21);
        String string22 = "BST";
        String string23 = "Asia/Dhaka";
        cZoneIdConversion.put(string22, string23);
        String string24 = "CST";
        String string25 = "America/Chicago";
        cZoneIdConversion.put(string24, string25);
        String string26 = "EST";
        String string27 = "America/New_York";
        cZoneIdConversion.put(string26, string27);
        String string28 = "HST";
        String string29 = "Pacific/Honolulu";
        cZoneIdConversion.put(string28, string29);
        String string30 = "JST";
        String string31 = "Asia/Tokyo";
        cZoneIdConversion.put(string30, string31);
        String string32 = "IST";
        String string33 = "Asia/Kolkata";
        cZoneIdConversion.put(string32, string33);
        String string34 = "AGT";
        String string35 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string34, string35);
        String string36 = "NST";
        String string37 = "Pacific/Auckland";
        cZoneIdConversion.put(string36, string37);
        String string38 = "GMT";
        cZoneIdConversion.put(string38, string);
        String string39 = "MST";
        String string40 = "America/Denver";
        cZoneIdConversion.put(string39, string40);
        String string41 = "PST";
        String string42 = "America/Los_Angeles";
        cZoneIdConversion.put(string41, string42);
        String string43 = "BET";
        String string44 = "America/Sao_Paulo";
        cZoneIdConversion.put(string43, string44);
        String string45 = "AET";
        String string46 = "Australia/Sydney";
        cZoneIdConversion.put(string45, string46);
        String string47 = "ACT";
        String string48 = "Australia/Darwin";
        cZoneIdConversion.put(string47, string48);
        String string49 = "CET";
        cZoneIdConversion.put(string49, string49);
        String string50 = "EET";
        cZoneIdConversion.put(string50, string50);
        String string51 = "SST";
        String string52 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string51, string52);
        String string53 = "VST";
        String string54 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string53, string54);
        String string55 = "ECT";
        cZoneIdConversion.put(string55, string49);
        String string56 = "CAT";
        String string57 = "Africa/Harare";
        cZoneIdConversion.put(string56, string57);
        String string58 = "MIT";
        String string59 = "Pacific/Apia";
        cZoneIdConversion.put(string58, string59);
        String string60 = "IET";
        String string61 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string60, string61);
        String string62 = "EAT";
        String string63 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string62, string63);
        String string64 = "NET";
        String string65 = "Asia/Yerevan";
        cZoneIdConversion.put(string64, string65);
        String string66 = "MET";
        cZoneIdConversion.put(string66, string49);
        setField(cDefault, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(cDefault, "org.joda.time.DateTimeZone", "iID", string);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", string3);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.setNameProvider
    
    ///region OTHER: SECURITY for method setNameProvider(org.joda.time.tz.NameProvider)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testSetNameProvider1() throws Exception  {
        DefaultNameProvider defaultNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.setNameProvider] produces [java.security.AccessControlException: access denied ("org.joda.time.JodaTimePermission" "DateTimeZone.setNameProvider")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            org.joda.time.DateTimeZone.setNameProvider(DateTimeZone.java:527) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.getNameProvider
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNameProvider()
    
    @Test
    public void testGetNameProvider1() throws Exception  {
        DefaultNameProvider actual = ((DefaultNameProvider) DateTimeZone.getNameProvider());
        
        DefaultNameProvider expected = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(expected, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        
        HashMap expectedIByLocaleCache = ((HashMap) getFieldValue(expected, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache"));
        HashMap actualIByLocaleCache = ((HashMap) getFieldValue(actual, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache"));
        assertTrue(deepEquals(expectedIByLocaleCache, actualIByLocaleCache));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.getConvertedId
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getConvertedId(java.lang.String)
    
    @Test
    public void testGetConvertedId1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class stringType = Class.forName("java.lang.String");
        Method getConvertedIdMethod = dateTimeZoneClazz.getDeclaredMethod("getConvertedId", stringType);
        getConvertedIdMethod.setAccessible(true);
        java.lang.Object[] getConvertedIdMethodArguments = new java.lang.Object[1];
        getConvertedIdMethodArguments[0] = ((Object) null);
        String actual = ((String) getConvertedIdMethod.invoke(null, getConvertedIdMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.parseOffset
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseOffset(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.DateTimeZone}
     * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#parseOffset(java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOffsetThrowsIAEWithNonEmptyString() throws Throwable  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class stringType = Class.forName("java.lang.String");
        Method parseOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("parseOffset", stringType);
        parseOffsetMethod.setAccessible(true);
        java.lang.Object[] parseOffsetMethodArguments = new java.lang.Object[1];
        parseOffsetMethodArguments[0] = "\u0014\n\t\r";
        try {
            parseOffsetMethod.invoke(null, parseOffsetMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseOffset(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testParseOffset1() throws Throwable  {
        String string = "";
        
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class stringType = Class.forName("java.lang.String");
        Method parseOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("parseOffset", stringType);
        parseOffsetMethod.setAccessible(true);
        java.lang.Object[] parseOffsetMethodArguments = new java.lang.Object[1];
        parseOffsetMethodArguments[0] = string;
        try {
            parseOffsetMethod.invoke(null, parseOffsetMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.forID
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method forID(java.lang.String)
    
    @Test
    public void testForID1() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forID(null));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iNameKey = "UTC";
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", iNameKey);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        cAvailableIDs.add(iNameKey);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", expected);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string = "+02:00";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string, softReference);
        String string1 = "+04:01";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference1);
        String string2 = "+00:44";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference2);
        String string3 = "-23:59:59.998";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference3);
        String string4 = "\n\t\r";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference4);
        String string5 = "-11:32";
        SoftReference softReference5 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference5);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string6 = "CTT";
        String string7 = "Asia/Shanghai";
        cZoneIdConversion.put(string6, string7);
        String string8 = "ART";
        String string9 = "Africa/Cairo";
        cZoneIdConversion.put(string8, string9);
        String string10 = "WET";
        cZoneIdConversion.put(string10, string10);
        String string11 = "CNT";
        String string12 = "America/St_Johns";
        cZoneIdConversion.put(string11, string12);
        String string13 = "PRT";
        String string14 = "America/Puerto_Rico";
        cZoneIdConversion.put(string13, string14);
        String string15 = "PNT";
        String string16 = "America/Phoenix";
        cZoneIdConversion.put(string15, string16);
        String string17 = "PLT";
        String string18 = "Asia/Karachi";
        cZoneIdConversion.put(string17, string18);
        String string19 = "AST";
        String string20 = "America/Anchorage";
        cZoneIdConversion.put(string19, string20);
        String string21 = "BST";
        String string22 = "Asia/Dhaka";
        cZoneIdConversion.put(string21, string22);
        String string23 = "CST";
        String string24 = "America/Chicago";
        cZoneIdConversion.put(string23, string24);
        String string25 = "EST";
        String string26 = "America/New_York";
        cZoneIdConversion.put(string25, string26);
        String string27 = "HST";
        String string28 = "Pacific/Honolulu";
        cZoneIdConversion.put(string27, string28);
        String string29 = "JST";
        String string30 = "Asia/Tokyo";
        cZoneIdConversion.put(string29, string30);
        String string31 = "IST";
        String string32 = "Asia/Kolkata";
        cZoneIdConversion.put(string31, string32);
        String string33 = "AGT";
        String string34 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string33, string34);
        String string35 = "NST";
        String string36 = "Pacific/Auckland";
        cZoneIdConversion.put(string35, string36);
        String string37 = "GMT";
        cZoneIdConversion.put(string37, iNameKey);
        String string38 = "MST";
        String string39 = "America/Denver";
        cZoneIdConversion.put(string38, string39);
        String string40 = "PST";
        String string41 = "America/Los_Angeles";
        cZoneIdConversion.put(string40, string41);
        String string42 = "BET";
        String string43 = "America/Sao_Paulo";
        cZoneIdConversion.put(string42, string43);
        String string44 = "AET";
        String string45 = "Australia/Sydney";
        cZoneIdConversion.put(string44, string45);
        String string46 = "ACT";
        String string47 = "Australia/Darwin";
        cZoneIdConversion.put(string46, string47);
        String string48 = "CET";
        cZoneIdConversion.put(string48, string48);
        String string49 = "EET";
        cZoneIdConversion.put(string49, string49);
        String string50 = "SST";
        String string51 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string50, string51);
        String string52 = "VST";
        String string53 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string52, string53);
        String string54 = "ECT";
        cZoneIdConversion.put(string54, string48);
        String string55 = "CAT";
        String string56 = "Africa/Harare";
        cZoneIdConversion.put(string55, string56);
        String string57 = "MIT";
        String string58 = "Pacific/Apia";
        cZoneIdConversion.put(string57, string58);
        String string59 = "IET";
        String string60 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string59, string60);
        String string61 = "EAT";
        String string62 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string61, string62);
        String string63 = "NET";
        String string64 = "Asia/Yerevan";
        cZoneIdConversion.put(string63, string64);
        String string65 = "MET";
        cZoneIdConversion.put(string65, string48);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", iNameKey);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method forID(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testForID2() {
        String string = "\u0000\u0000\u0000";
        
        DateTimeZone.forID(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.setProvider0
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setProvider0(org.joda.time.tz.Provider)
    
    @Test
    public void testSetProvider01() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        UTCProvider uTCProvider = new UTCProvider();
        
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class uTCProviderType = Class.forName("org.joda.time.tz.Provider");
        Method setProvider0Method = dateTimeZoneClazz.getDeclaredMethod("setProvider0", uTCProviderType);
        setProvider0Method.setAccessible(true);
        java.lang.Object[] setProvider0MethodArguments = new java.lang.Object[1];
        setProvider0MethodArguments[0] = uTCProvider;
        setProvider0Method.invoke(null, setProvider0MethodArguments);
    }
    
    @Test
    public void testSetProvider02() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class providerType = Class.forName("org.joda.time.tz.Provider");
        Method setProvider0Method = dateTimeZoneClazz.getDeclaredMethod("setProvider0", providerType);
        setProvider0Method.setAccessible(true);
        java.lang.Object[] setProvider0MethodArguments = new java.lang.Object[1];
        setProvider0MethodArguments[0] = ((Object) null);
        setProvider0Method.invoke(null, setProvider0MethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.getShortName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShortName(long)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getShortName(long)}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getShortName(long,java.util.Locale)}
 * @utbot.returnsFrom {@code return getShortName(instant, null);}
 *  */
    @Test
    public void testGetShortName_DateTimeZoneGetShortName() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        String actual = fixedDateTimeZone.getShortName(-255L);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getShortName(long)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.DateTimeZone}
     * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getShortName(long)}
     */
    @Test
    public void testGetShortName() {
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone("", "XZ", -1, -1);
        
        String actual = fixedDateTimeZone.getShortName(4611686018427387903L);
        
        String expected = "-00:00:00.001";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getShortName(long)
    
    @Test
    public void testGetShortName1() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iNameKey = "";
        setField(fixedDateTimeZone, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", iNameKey);
        
        String actual = fixedDateTimeZone.getShortName(0L);
        
        String expected = "+00:00";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getShortName(long)
    
    @Test
    public void testGetShortName2() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.getShortName] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getNameKey(CachedDateTimeZone.java:99)
            org.joda.time.DateTimeZone.getShortName(DateTimeZone.java:772)
            org.joda.time.DateTimeZone.getShortName(DateTimeZone.java:754) */
        cachedDateTimeZone.getShortName(0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.getShortName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShortName(long, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getShortName(long,java.util.Locale)}
 * @utbot.executesCondition {@code (locale == null): False}
 * @utbot.returnsFrom {@code return iID;}
 *  */
    @Test
    public void testGetShortName_LocaleNotEqualsNull() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        String actual = fixedDateTimeZone.getShortName(-255L, locale);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getShortName(long,java.util.Locale)}
 * @utbot.executesCondition {@code (locale == null): True}
 * @utbot.invokes {@link java.util.Locale#getDefault()}
 *  */
    @Test
    public void testGetShortName_LocaleEqualsNull() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        String actual = fixedDateTimeZone.getShortName(-255L, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getShortName(long, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.DateTimeZone}
     * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getShortName(long,java.util.Locale)}
     */
    @Test
    public void testGetShortName3() {
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone("", "XZ", -1, -1);
        
        String actual = fixedDateTimeZone.getShortName(9223371487098961919L, null);
        
        String expected = "-00:00:00.001";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getShortName(long, java.util.Locale)
    
    @Test
    public void testGetShortName4() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iNameKey = "";
        setField(fixedDateTimeZone, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", iNameKey);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        String actual = fixedDateTimeZone.getShortName(0L, locale);
        
        String expected = "+00:00";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetShortName5() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iNameKey = "";
        setField(fixedDateTimeZone, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", iNameKey);
        
        String actual = fixedDateTimeZone.getShortName(0L, null);
        
        String expected = "+00:00";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getShortName(long, java.util.Locale)
    
    @Test
    public void testGetShortName6() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.getShortName] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getNameKey(CachedDateTimeZone.java:99)
            org.joda.time.DateTimeZone.getShortName(DateTimeZone.java:772) */
        cachedDateTimeZone.getShortName(0L, null);
    }
    
    @Test
    public void testGetShortName7() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.getShortName] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getNameKey(CachedDateTimeZone.java:99)
            org.joda.time.DateTimeZone.getShortName(DateTimeZone.java:772) */
        cachedDateTimeZone.getShortName(0L, locale);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.fixedOffsetZone
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method fixedOffsetZone(java.lang.String, int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.DateTimeZone}
     * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#fixedOffsetZone(java.lang.String,int)}
     */
    @Test
    public void testFixedOffsetZoneWithBlankString() throws Exception  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method fixedOffsetZoneMethod = dateTimeZoneClazz.getDeclaredMethod("fixedOffsetZone", stringType, intType);
        fixedOffsetZoneMethod.setAccessible(true);
        java.lang.Object[] fixedOffsetZoneMethodArguments = new java.lang.Object[2];
        fixedOffsetZoneMethodArguments[0] = "\n\t\r";
        fixedOffsetZoneMethodArguments[1] = -2147483647;
        FixedDateTimeZone actual = ((FixedDateTimeZone) fixedOffsetZoneMethod.invoke(null, fixedOffsetZoneMethodArguments));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", -2147483647);
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iStandardOffset", -2147483647);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        HashMap hashMap = new HashMap();
        String string = "";
        HashMap hashMap1 = new HashMap();
        hashMap.put(string, hashMap1);
        iByLocaleCache.put(locale, hashMap);
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        String string1 = "UTC";
        cAvailableIDs.add(string1);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        FixedDateTimeZone cDefault = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(cDefault, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", string1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        setField(cDefault, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs1 = new LinkedHashSet();
        cAvailableIDs1.add(string1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(cDefault, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string2 = "\n\t\r";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference);
        setField(cDefault, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string3 = "CTT";
        String string4 = "Asia/Shanghai";
        cZoneIdConversion.put(string3, string4);
        String string5 = "ART";
        String string6 = "Africa/Cairo";
        cZoneIdConversion.put(string5, string6);
        String string7 = "WET";
        cZoneIdConversion.put(string7, string7);
        String string8 = "CNT";
        String string9 = "America/St_Johns";
        cZoneIdConversion.put(string8, string9);
        String string10 = "PRT";
        String string11 = "America/Puerto_Rico";
        cZoneIdConversion.put(string10, string11);
        String string12 = "PNT";
        String string13 = "America/Phoenix";
        cZoneIdConversion.put(string12, string13);
        String string14 = "PLT";
        String string15 = "Asia/Karachi";
        cZoneIdConversion.put(string14, string15);
        String string16 = "AST";
        String string17 = "America/Anchorage";
        cZoneIdConversion.put(string16, string17);
        String string18 = "BST";
        String string19 = "Asia/Dhaka";
        cZoneIdConversion.put(string18, string19);
        String string20 = "CST";
        String string21 = "America/Chicago";
        cZoneIdConversion.put(string20, string21);
        String string22 = "EST";
        String string23 = "America/New_York";
        cZoneIdConversion.put(string22, string23);
        String string24 = "HST";
        String string25 = "Pacific/Honolulu";
        cZoneIdConversion.put(string24, string25);
        String string26 = "JST";
        String string27 = "Asia/Tokyo";
        cZoneIdConversion.put(string26, string27);
        String string28 = "IST";
        String string29 = "Asia/Kolkata";
        cZoneIdConversion.put(string28, string29);
        String string30 = "AGT";
        String string31 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string30, string31);
        String string32 = "NST";
        String string33 = "Pacific/Auckland";
        cZoneIdConversion.put(string32, string33);
        String string34 = "GMT";
        cZoneIdConversion.put(string34, string1);
        String string35 = "MST";
        String string36 = "America/Denver";
        cZoneIdConversion.put(string35, string36);
        String string37 = "PST";
        String string38 = "America/Los_Angeles";
        cZoneIdConversion.put(string37, string38);
        String string39 = "BET";
        String string40 = "America/Sao_Paulo";
        cZoneIdConversion.put(string39, string40);
        String string41 = "AET";
        String string42 = "Australia/Sydney";
        cZoneIdConversion.put(string41, string42);
        String string43 = "ACT";
        String string44 = "Australia/Darwin";
        cZoneIdConversion.put(string43, string44);
        String string45 = "CET";
        cZoneIdConversion.put(string45, string45);
        String string46 = "EET";
        cZoneIdConversion.put(string46, string46);
        String string47 = "SST";
        String string48 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string47, string48);
        String string49 = "VST";
        String string50 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string49, string50);
        String string51 = "ECT";
        cZoneIdConversion.put(string51, string45);
        String string52 = "CAT";
        String string53 = "Africa/Harare";
        cZoneIdConversion.put(string52, string53);
        String string54 = "MIT";
        String string55 = "Pacific/Apia";
        cZoneIdConversion.put(string54, string55);
        String string56 = "IET";
        String string57 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string56, string57);
        String string58 = "EAT";
        String string59 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string58, string59);
        String string60 = "NET";
        String string61 = "Asia/Yerevan";
        cZoneIdConversion.put(string60, string61);
        String string62 = "MET";
        cZoneIdConversion.put(string62, string45);
        setField(cDefault, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(cDefault, "org.joda.time.DateTimeZone", "iID", string1);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", string2);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method fixedOffsetZone(java.lang.String, int)
    
    @Test
    public void testFixedOffsetZone1() throws Exception  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method fixedOffsetZoneMethod = dateTimeZoneClazz.getDeclaredMethod("fixedOffsetZone", stringType, intType);
        fixedOffsetZoneMethod.setAccessible(true);
        java.lang.Object[] fixedOffsetZoneMethodArguments = new java.lang.Object[2];
        fixedOffsetZoneMethodArguments[0] = ((Object) null);
        fixedOffsetZoneMethodArguments[1] = 0;
        FixedDateTimeZone actual = ((FixedDateTimeZone) fixedOffsetZoneMethod.invoke(null, fixedOffsetZoneMethodArguments));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iNameKey = "UTC";
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", iNameKey);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        cAvailableIDs.add(iNameKey);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", expected);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string = "";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string, softReference);
        String string1 = "+02:00";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference1);
        String string2 = "+04:01";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference2);
        String string3 = "+00:44";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference3);
        String string4 = "-23:59:59.998";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference4);
        String string5 = "\n\t\r";
        SoftReference softReference5 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference5);
        String string6 = "-11:32";
        SoftReference softReference6 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string6, softReference6);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string7 = "CTT";
        String string8 = "Asia/Shanghai";
        cZoneIdConversion.put(string7, string8);
        String string9 = "ART";
        String string10 = "Africa/Cairo";
        cZoneIdConversion.put(string9, string10);
        String string11 = "WET";
        cZoneIdConversion.put(string11, string11);
        String string12 = "CNT";
        String string13 = "America/St_Johns";
        cZoneIdConversion.put(string12, string13);
        String string14 = "PRT";
        String string15 = "America/Puerto_Rico";
        cZoneIdConversion.put(string14, string15);
        String string16 = "PNT";
        String string17 = "America/Phoenix";
        cZoneIdConversion.put(string16, string17);
        String string18 = "PLT";
        String string19 = "Asia/Karachi";
        cZoneIdConversion.put(string18, string19);
        String string20 = "AST";
        String string21 = "America/Anchorage";
        cZoneIdConversion.put(string20, string21);
        String string22 = "BST";
        String string23 = "Asia/Dhaka";
        cZoneIdConversion.put(string22, string23);
        String string24 = "CST";
        String string25 = "America/Chicago";
        cZoneIdConversion.put(string24, string25);
        String string26 = "EST";
        String string27 = "America/New_York";
        cZoneIdConversion.put(string26, string27);
        String string28 = "HST";
        String string29 = "Pacific/Honolulu";
        cZoneIdConversion.put(string28, string29);
        String string30 = "JST";
        String string31 = "Asia/Tokyo";
        cZoneIdConversion.put(string30, string31);
        String string32 = "IST";
        String string33 = "Asia/Kolkata";
        cZoneIdConversion.put(string32, string33);
        String string34 = "AGT";
        String string35 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string34, string35);
        String string36 = "NST";
        String string37 = "Pacific/Auckland";
        cZoneIdConversion.put(string36, string37);
        String string38 = "GMT";
        cZoneIdConversion.put(string38, iNameKey);
        String string39 = "MST";
        String string40 = "America/Denver";
        cZoneIdConversion.put(string39, string40);
        String string41 = "PST";
        String string42 = "America/Los_Angeles";
        cZoneIdConversion.put(string41, string42);
        String string43 = "BET";
        String string44 = "America/Sao_Paulo";
        cZoneIdConversion.put(string43, string44);
        String string45 = "AET";
        String string46 = "Australia/Sydney";
        cZoneIdConversion.put(string45, string46);
        String string47 = "ACT";
        String string48 = "Australia/Darwin";
        cZoneIdConversion.put(string47, string48);
        String string49 = "CET";
        cZoneIdConversion.put(string49, string49);
        String string50 = "EET";
        cZoneIdConversion.put(string50, string50);
        String string51 = "SST";
        String string52 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string51, string52);
        String string53 = "VST";
        String string54 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string53, string54);
        String string55 = "ECT";
        cZoneIdConversion.put(string55, string49);
        String string56 = "CAT";
        String string57 = "Africa/Harare";
        cZoneIdConversion.put(string56, string57);
        String string58 = "MIT";
        String string59 = "Pacific/Apia";
        cZoneIdConversion.put(string58, string59);
        String string60 = "IET";
        String string61 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string60, string61);
        String string62 = "EAT";
        String string63 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string62, string63);
        String string64 = "NET";
        String string65 = "Asia/Yerevan";
        cZoneIdConversion.put(string64, string65);
        String string66 = "MET";
        cZoneIdConversion.put(string66, string49);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", iNameKey);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFixedOffsetZone2() throws Exception  {
        String string = "";
        
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method fixedOffsetZoneMethod = dateTimeZoneClazz.getDeclaredMethod("fixedOffsetZone", stringType, intType);
        fixedOffsetZoneMethod.setAccessible(true);
        java.lang.Object[] fixedOffsetZoneMethodArguments = new java.lang.Object[2];
        fixedOffsetZoneMethodArguments[0] = string;
        fixedOffsetZoneMethodArguments[1] = 1;
        FixedDateTimeZone actual = ((FixedDateTimeZone) fixedOffsetZoneMethod.invoke(null, fixedOffsetZoneMethodArguments));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 1);
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iStandardOffset", 1);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        String string1 = "UTC";
        cAvailableIDs.add(string1);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        FixedDateTimeZone cDefault = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(cDefault, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", string1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        setField(cDefault, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs1 = new LinkedHashSet();
        cAvailableIDs1.add(string1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(cDefault, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string, softReference);
        String string2 = "+02:00";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference1);
        String string3 = "+04:01";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference2);
        String string4 = "+00:44";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference3);
        String string5 = "-23:59:59.998";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference4);
        String string6 = "\n\t\r";
        SoftReference softReference5 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string6, softReference5);
        String string7 = "-11:32";
        SoftReference softReference6 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string7, softReference6);
        setField(cDefault, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string8 = "CTT";
        String string9 = "Asia/Shanghai";
        cZoneIdConversion.put(string8, string9);
        String string10 = "ART";
        String string11 = "Africa/Cairo";
        cZoneIdConversion.put(string10, string11);
        String string12 = "WET";
        cZoneIdConversion.put(string12, string12);
        String string13 = "CNT";
        String string14 = "America/St_Johns";
        cZoneIdConversion.put(string13, string14);
        String string15 = "PRT";
        String string16 = "America/Puerto_Rico";
        cZoneIdConversion.put(string15, string16);
        String string17 = "PNT";
        String string18 = "America/Phoenix";
        cZoneIdConversion.put(string17, string18);
        String string19 = "PLT";
        String string20 = "Asia/Karachi";
        cZoneIdConversion.put(string19, string20);
        String string21 = "AST";
        String string22 = "America/Anchorage";
        cZoneIdConversion.put(string21, string22);
        String string23 = "BST";
        String string24 = "Asia/Dhaka";
        cZoneIdConversion.put(string23, string24);
        String string25 = "CST";
        String string26 = "America/Chicago";
        cZoneIdConversion.put(string25, string26);
        String string27 = "EST";
        String string28 = "America/New_York";
        cZoneIdConversion.put(string27, string28);
        String string29 = "HST";
        String string30 = "Pacific/Honolulu";
        cZoneIdConversion.put(string29, string30);
        String string31 = "JST";
        String string32 = "Asia/Tokyo";
        cZoneIdConversion.put(string31, string32);
        String string33 = "IST";
        String string34 = "Asia/Kolkata";
        cZoneIdConversion.put(string33, string34);
        String string35 = "AGT";
        String string36 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string35, string36);
        String string37 = "NST";
        String string38 = "Pacific/Auckland";
        cZoneIdConversion.put(string37, string38);
        String string39 = "GMT";
        cZoneIdConversion.put(string39, string1);
        String string40 = "MST";
        String string41 = "America/Denver";
        cZoneIdConversion.put(string40, string41);
        String string42 = "PST";
        String string43 = "America/Los_Angeles";
        cZoneIdConversion.put(string42, string43);
        String string44 = "BET";
        String string45 = "America/Sao_Paulo";
        cZoneIdConversion.put(string44, string45);
        String string46 = "AET";
        String string47 = "Australia/Sydney";
        cZoneIdConversion.put(string46, string47);
        String string48 = "ACT";
        String string49 = "Australia/Darwin";
        cZoneIdConversion.put(string48, string49);
        String string50 = "CET";
        cZoneIdConversion.put(string50, string50);
        String string51 = "EET";
        cZoneIdConversion.put(string51, string51);
        String string52 = "SST";
        String string53 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string52, string53);
        String string54 = "VST";
        String string55 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string54, string55);
        String string56 = "ECT";
        cZoneIdConversion.put(string56, string50);
        String string57 = "CAT";
        String string58 = "Africa/Harare";
        cZoneIdConversion.put(string57, string58);
        String string59 = "MIT";
        String string60 = "Pacific/Apia";
        cZoneIdConversion.put(string59, string60);
        String string61 = "IET";
        String string62 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string61, string62);
        String string63 = "EAT";
        String string64 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string63, string64);
        String string65 = "NET";
        String string66 = "Asia/Yerevan";
        cZoneIdConversion.put(string65, string66);
        String string67 = "MET";
        cZoneIdConversion.put(string67, string50);
        setField(cDefault, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(cDefault, "org.joda.time.DateTimeZone", "iID", string1);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", string);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.forOffsetMillis
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method forOffsetMillis(int)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#forOffsetMillis(int)}
 * @utbot.executesCondition {@code (millisOffset < -MAX_MILLIS): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: millisOffset < -MAX_MILLIS || millisOffset > MAX_MILLIS
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetMillis_ThrowIllegalArgumentException() {
        DateTimeZone.forOffsetMillis(-86400000);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#forOffsetMillis(int)}
 * @utbot.executesCondition {@code (millisOffset < -MAX_MILLIS): False}
 * @utbot.executesCondition {@code (millisOffset > MAX_MILLIS): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: millisOffset < -MAX_MILLIS || millisOffset > MAX_MILLIS
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetMillis_ThrowIllegalArgumentException_1() {
        DateTimeZone.forOffsetMillis(86401024);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method forOffsetMillis(int)
    
    @Test
    public void testForOffsetMillis1() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forOffsetMillis(61500000));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 61500000);
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iStandardOffset", 61500000);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        String string = "UTC";
        cAvailableIDs.add(string);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        FixedDateTimeZone cDefault = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(cDefault, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        setField(cDefault, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs1 = new LinkedHashSet();
        cAvailableIDs1.add(string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(cDefault, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string1 = "";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference);
        String string2 = "+02:00";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference1);
        String string3 = "+04:01";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference2);
        String string4 = "+17:05";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference3);
        String string5 = "+00:44";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference4);
        String string6 = "+18:00";
        SoftReference softReference5 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string6, softReference5);
        String string7 = "+01:00";
        SoftReference softReference6 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string7, softReference6);
        String string8 = "-23:59:59.998";
        SoftReference softReference7 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string8, softReference7);
        String string9 = "\n\t\r";
        SoftReference softReference8 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string9, softReference8);
        String string10 = "-07:00";
        SoftReference softReference9 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string10, softReference9);
        String string11 = "-11:32";
        SoftReference softReference10 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string11, softReference10);
        String string12 = "-14:00";
        SoftReference softReference11 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string12, softReference11);
        setField(cDefault, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string13 = "CTT";
        String string14 = "Asia/Shanghai";
        cZoneIdConversion.put(string13, string14);
        String string15 = "ART";
        String string16 = "Africa/Cairo";
        cZoneIdConversion.put(string15, string16);
        String string17 = "WET";
        cZoneIdConversion.put(string17, string17);
        String string18 = "CNT";
        String string19 = "America/St_Johns";
        cZoneIdConversion.put(string18, string19);
        String string20 = "PRT";
        String string21 = "America/Puerto_Rico";
        cZoneIdConversion.put(string20, string21);
        String string22 = "PNT";
        String string23 = "America/Phoenix";
        cZoneIdConversion.put(string22, string23);
        String string24 = "PLT";
        String string25 = "Asia/Karachi";
        cZoneIdConversion.put(string24, string25);
        String string26 = "AST";
        String string27 = "America/Anchorage";
        cZoneIdConversion.put(string26, string27);
        String string28 = "BST";
        String string29 = "Asia/Dhaka";
        cZoneIdConversion.put(string28, string29);
        String string30 = "CST";
        String string31 = "America/Chicago";
        cZoneIdConversion.put(string30, string31);
        String string32 = "EST";
        String string33 = "America/New_York";
        cZoneIdConversion.put(string32, string33);
        String string34 = "HST";
        String string35 = "Pacific/Honolulu";
        cZoneIdConversion.put(string34, string35);
        String string36 = "JST";
        String string37 = "Asia/Tokyo";
        cZoneIdConversion.put(string36, string37);
        String string38 = "IST";
        String string39 = "Asia/Kolkata";
        cZoneIdConversion.put(string38, string39);
        String string40 = "AGT";
        String string41 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string40, string41);
        String string42 = "NST";
        String string43 = "Pacific/Auckland";
        cZoneIdConversion.put(string42, string43);
        String string44 = "GMT";
        cZoneIdConversion.put(string44, string);
        String string45 = "MST";
        String string46 = "America/Denver";
        cZoneIdConversion.put(string45, string46);
        String string47 = "PST";
        String string48 = "America/Los_Angeles";
        cZoneIdConversion.put(string47, string48);
        String string49 = "BET";
        String string50 = "America/Sao_Paulo";
        cZoneIdConversion.put(string49, string50);
        String string51 = "AET";
        String string52 = "Australia/Sydney";
        cZoneIdConversion.put(string51, string52);
        String string53 = "ACT";
        String string54 = "Australia/Darwin";
        cZoneIdConversion.put(string53, string54);
        String string55 = "CET";
        cZoneIdConversion.put(string55, string55);
        String string56 = "EET";
        cZoneIdConversion.put(string56, string56);
        String string57 = "SST";
        String string58 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string57, string58);
        String string59 = "VST";
        String string60 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string59, string60);
        String string61 = "ECT";
        cZoneIdConversion.put(string61, string55);
        String string62 = "CAT";
        String string63 = "Africa/Harare";
        cZoneIdConversion.put(string62, string63);
        String string64 = "MIT";
        String string65 = "Pacific/Apia";
        cZoneIdConversion.put(string64, string65);
        String string66 = "IET";
        String string67 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string66, string67);
        String string68 = "EAT";
        String string69 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string68, string69);
        String string70 = "NET";
        String string71 = "Asia/Yerevan";
        cZoneIdConversion.put(string70, string71);
        String string72 = "MET";
        cZoneIdConversion.put(string72, string55);
        setField(cDefault, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(cDefault, "org.joda.time.DateTimeZone", "iID", string);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", string4);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testForOffsetMillis2() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forOffsetMillis(36999232));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 36999232);
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iStandardOffset", 36999232);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        String string = "UTC";
        cAvailableIDs.add(string);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        FixedDateTimeZone cDefault = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(cDefault, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        setField(cDefault, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs1 = new LinkedHashSet();
        cAvailableIDs1.add(string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(cDefault, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string1 = "";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference);
        String string2 = "+17:05";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference1);
        String string3 = "+10:16:39.232";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference2);
        String string4 = "+18:00";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference3);
        String string5 = "\n\t\r";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference4);
        String string6 = "-07:00";
        SoftReference softReference5 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string6, softReference5);
        String string7 = "+02:00";
        SoftReference softReference6 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string7, softReference6);
        String string8 = "+04:01";
        SoftReference softReference7 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string8, softReference7);
        String string9 = "+00:44";
        SoftReference softReference8 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string9, softReference8);
        String string10 = "+01:00";
        SoftReference softReference9 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string10, softReference9);
        String string11 = "-23:59:59.998";
        SoftReference softReference10 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string11, softReference10);
        String string12 = "-11:32";
        SoftReference softReference11 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string12, softReference11);
        String string13 = "-14:00";
        SoftReference softReference12 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string13, softReference12);
        setField(cDefault, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string14 = "CTT";
        String string15 = "Asia/Shanghai";
        cZoneIdConversion.put(string14, string15);
        String string16 = "ART";
        String string17 = "Africa/Cairo";
        cZoneIdConversion.put(string16, string17);
        String string18 = "WET";
        cZoneIdConversion.put(string18, string18);
        String string19 = "CNT";
        String string20 = "America/St_Johns";
        cZoneIdConversion.put(string19, string20);
        String string21 = "PRT";
        String string22 = "America/Puerto_Rico";
        cZoneIdConversion.put(string21, string22);
        String string23 = "PNT";
        String string24 = "America/Phoenix";
        cZoneIdConversion.put(string23, string24);
        String string25 = "PLT";
        String string26 = "Asia/Karachi";
        cZoneIdConversion.put(string25, string26);
        String string27 = "AST";
        String string28 = "America/Anchorage";
        cZoneIdConversion.put(string27, string28);
        String string29 = "BST";
        String string30 = "Asia/Dhaka";
        cZoneIdConversion.put(string29, string30);
        String string31 = "CST";
        String string32 = "America/Chicago";
        cZoneIdConversion.put(string31, string32);
        String string33 = "EST";
        String string34 = "America/New_York";
        cZoneIdConversion.put(string33, string34);
        String string35 = "HST";
        String string36 = "Pacific/Honolulu";
        cZoneIdConversion.put(string35, string36);
        String string37 = "JST";
        String string38 = "Asia/Tokyo";
        cZoneIdConversion.put(string37, string38);
        String string39 = "IST";
        String string40 = "Asia/Kolkata";
        cZoneIdConversion.put(string39, string40);
        String string41 = "AGT";
        String string42 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string41, string42);
        String string43 = "NST";
        String string44 = "Pacific/Auckland";
        cZoneIdConversion.put(string43, string44);
        String string45 = "GMT";
        cZoneIdConversion.put(string45, string);
        String string46 = "MST";
        String string47 = "America/Denver";
        cZoneIdConversion.put(string46, string47);
        String string48 = "PST";
        String string49 = "America/Los_Angeles";
        cZoneIdConversion.put(string48, string49);
        String string50 = "BET";
        String string51 = "America/Sao_Paulo";
        cZoneIdConversion.put(string50, string51);
        String string52 = "AET";
        String string53 = "Australia/Sydney";
        cZoneIdConversion.put(string52, string53);
        String string54 = "ACT";
        String string55 = "Australia/Darwin";
        cZoneIdConversion.put(string54, string55);
        String string56 = "CET";
        cZoneIdConversion.put(string56, string56);
        String string57 = "EET";
        cZoneIdConversion.put(string57, string57);
        String string58 = "SST";
        String string59 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string58, string59);
        String string60 = "VST";
        String string61 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string60, string61);
        String string62 = "ECT";
        cZoneIdConversion.put(string62, string56);
        String string63 = "CAT";
        String string64 = "Africa/Harare";
        cZoneIdConversion.put(string63, string64);
        String string65 = "MIT";
        String string66 = "Pacific/Apia";
        cZoneIdConversion.put(string65, string66);
        String string67 = "IET";
        String string68 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string67, string68);
        String string69 = "EAT";
        String string70 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string69, string70);
        String string71 = "NET";
        String string72 = "Asia/Yerevan";
        cZoneIdConversion.put(string71, string72);
        String string73 = "MET";
        cZoneIdConversion.put(string73, string56);
        setField(cDefault, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(cDefault, "org.joda.time.DateTimeZone", "iID", string);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", string3);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testForOffsetMillis3() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forOffsetMillis(-64098560));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", -64098560);
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iStandardOffset", -64098560);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        String string = "UTC";
        cAvailableIDs.add(string);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        FixedDateTimeZone cDefault = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(cDefault, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        setField(cDefault, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs1 = new LinkedHashSet();
        cAvailableIDs1.add(string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(cDefault, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string1 = "";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference);
        String string2 = "+17:05";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference1);
        String string3 = "+10:16:39.232";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference2);
        String string4 = "+18:00";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference3);
        String string5 = "\n\t\r";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference4);
        String string6 = "-07:00";
        SoftReference softReference5 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string6, softReference5);
        String string7 = "+02:00";
        SoftReference softReference6 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string7, softReference6);
        String string8 = "+04:01";
        SoftReference softReference7 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string8, softReference7);
        String string9 = "+00:44";
        SoftReference softReference8 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string9, softReference8);
        String string10 = "+01:00";
        SoftReference softReference9 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string10, softReference9);
        String string11 = "-23:59:59.998";
        SoftReference softReference10 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string11, softReference10);
        String string12 = "-11:32";
        SoftReference softReference11 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string12, softReference11);
        String string13 = "-14:00";
        SoftReference softReference12 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string13, softReference12);
        String string14 = "-17:48:18.560";
        SoftReference softReference13 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string14, softReference13);
        setField(cDefault, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string15 = "CTT";
        String string16 = "Asia/Shanghai";
        cZoneIdConversion.put(string15, string16);
        String string17 = "ART";
        String string18 = "Africa/Cairo";
        cZoneIdConversion.put(string17, string18);
        String string19 = "WET";
        cZoneIdConversion.put(string19, string19);
        String string20 = "CNT";
        String string21 = "America/St_Johns";
        cZoneIdConversion.put(string20, string21);
        String string22 = "PRT";
        String string23 = "America/Puerto_Rico";
        cZoneIdConversion.put(string22, string23);
        String string24 = "PNT";
        String string25 = "America/Phoenix";
        cZoneIdConversion.put(string24, string25);
        String string26 = "PLT";
        String string27 = "Asia/Karachi";
        cZoneIdConversion.put(string26, string27);
        String string28 = "AST";
        String string29 = "America/Anchorage";
        cZoneIdConversion.put(string28, string29);
        String string30 = "BST";
        String string31 = "Asia/Dhaka";
        cZoneIdConversion.put(string30, string31);
        String string32 = "CST";
        String string33 = "America/Chicago";
        cZoneIdConversion.put(string32, string33);
        String string34 = "EST";
        String string35 = "America/New_York";
        cZoneIdConversion.put(string34, string35);
        String string36 = "HST";
        String string37 = "Pacific/Honolulu";
        cZoneIdConversion.put(string36, string37);
        String string38 = "JST";
        String string39 = "Asia/Tokyo";
        cZoneIdConversion.put(string38, string39);
        String string40 = "IST";
        String string41 = "Asia/Kolkata";
        cZoneIdConversion.put(string40, string41);
        String string42 = "AGT";
        String string43 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string42, string43);
        String string44 = "NST";
        String string45 = "Pacific/Auckland";
        cZoneIdConversion.put(string44, string45);
        String string46 = "GMT";
        cZoneIdConversion.put(string46, string);
        String string47 = "MST";
        String string48 = "America/Denver";
        cZoneIdConversion.put(string47, string48);
        String string49 = "PST";
        String string50 = "America/Los_Angeles";
        cZoneIdConversion.put(string49, string50);
        String string51 = "BET";
        String string52 = "America/Sao_Paulo";
        cZoneIdConversion.put(string51, string52);
        String string53 = "AET";
        String string54 = "Australia/Sydney";
        cZoneIdConversion.put(string53, string54);
        String string55 = "ACT";
        String string56 = "Australia/Darwin";
        cZoneIdConversion.put(string55, string56);
        String string57 = "CET";
        cZoneIdConversion.put(string57, string57);
        String string58 = "EET";
        cZoneIdConversion.put(string58, string58);
        String string59 = "SST";
        String string60 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string59, string60);
        String string61 = "VST";
        String string62 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string61, string62);
        String string63 = "ECT";
        cZoneIdConversion.put(string63, string57);
        String string64 = "CAT";
        String string65 = "Africa/Harare";
        cZoneIdConversion.put(string64, string65);
        String string66 = "MIT";
        String string67 = "Pacific/Apia";
        cZoneIdConversion.put(string66, string67);
        String string68 = "IET";
        String string69 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string68, string69);
        String string70 = "EAT";
        String string71 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string70, string71);
        String string72 = "NET";
        String string73 = "Asia/Yerevan";
        cZoneIdConversion.put(string72, string73);
        String string74 = "MET";
        cZoneIdConversion.put(string74, string57);
        setField(cDefault, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(cDefault, "org.joda.time.DateTimeZone", "iID", string);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", string14);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testForOffsetMillis4() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forOffsetMillis(3600000));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 3600000);
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iStandardOffset", 3600000);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        String string = "UTC";
        cAvailableIDs.add(string);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        FixedDateTimeZone cDefault = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(cDefault, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        setField(cDefault, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs1 = new LinkedHashSet();
        cAvailableIDs1.add(string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(cDefault, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string1 = "";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference);
        String string2 = "+17:05";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference1);
        String string3 = "+10:16:39.232";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference2);
        String string4 = "+18:00";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference3);
        String string5 = "\n\t\r";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference4);
        String string6 = "-07:00";
        SoftReference softReference5 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string6, softReference5);
        String string7 = "+02:00";
        SoftReference softReference6 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string7, softReference6);
        String string8 = "+04:01";
        SoftReference softReference7 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string8, softReference7);
        String string9 = "+00:44";
        SoftReference softReference8 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string9, softReference8);
        String string10 = "+01:00";
        SoftReference softReference9 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string10, softReference9);
        String string11 = "-23:59:59.998";
        SoftReference softReference10 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string11, softReference10);
        String string12 = "-11:32";
        SoftReference softReference11 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string12, softReference11);
        String string13 = "-14:00";
        SoftReference softReference12 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string13, softReference12);
        String string14 = "-17:48:18.560";
        SoftReference softReference13 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string14, softReference13);
        setField(cDefault, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string15 = "CTT";
        String string16 = "Asia/Shanghai";
        cZoneIdConversion.put(string15, string16);
        String string17 = "ART";
        String string18 = "Africa/Cairo";
        cZoneIdConversion.put(string17, string18);
        String string19 = "WET";
        cZoneIdConversion.put(string19, string19);
        String string20 = "CNT";
        String string21 = "America/St_Johns";
        cZoneIdConversion.put(string20, string21);
        String string22 = "PRT";
        String string23 = "America/Puerto_Rico";
        cZoneIdConversion.put(string22, string23);
        String string24 = "PNT";
        String string25 = "America/Phoenix";
        cZoneIdConversion.put(string24, string25);
        String string26 = "PLT";
        String string27 = "Asia/Karachi";
        cZoneIdConversion.put(string26, string27);
        String string28 = "AST";
        String string29 = "America/Anchorage";
        cZoneIdConversion.put(string28, string29);
        String string30 = "BST";
        String string31 = "Asia/Dhaka";
        cZoneIdConversion.put(string30, string31);
        String string32 = "CST";
        String string33 = "America/Chicago";
        cZoneIdConversion.put(string32, string33);
        String string34 = "EST";
        String string35 = "America/New_York";
        cZoneIdConversion.put(string34, string35);
        String string36 = "HST";
        String string37 = "Pacific/Honolulu";
        cZoneIdConversion.put(string36, string37);
        String string38 = "JST";
        String string39 = "Asia/Tokyo";
        cZoneIdConversion.put(string38, string39);
        String string40 = "IST";
        String string41 = "Asia/Kolkata";
        cZoneIdConversion.put(string40, string41);
        String string42 = "AGT";
        String string43 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string42, string43);
        String string44 = "NST";
        String string45 = "Pacific/Auckland";
        cZoneIdConversion.put(string44, string45);
        String string46 = "GMT";
        cZoneIdConversion.put(string46, string);
        String string47 = "MST";
        String string48 = "America/Denver";
        cZoneIdConversion.put(string47, string48);
        String string49 = "PST";
        String string50 = "America/Los_Angeles";
        cZoneIdConversion.put(string49, string50);
        String string51 = "BET";
        String string52 = "America/Sao_Paulo";
        cZoneIdConversion.put(string51, string52);
        String string53 = "AET";
        String string54 = "Australia/Sydney";
        cZoneIdConversion.put(string53, string54);
        String string55 = "ACT";
        String string56 = "Australia/Darwin";
        cZoneIdConversion.put(string55, string56);
        String string57 = "CET";
        cZoneIdConversion.put(string57, string57);
        String string58 = "EET";
        cZoneIdConversion.put(string58, string58);
        String string59 = "SST";
        String string60 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string59, string60);
        String string61 = "VST";
        String string62 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string61, string62);
        String string63 = "ECT";
        cZoneIdConversion.put(string63, string57);
        String string64 = "CAT";
        String string65 = "Africa/Harare";
        cZoneIdConversion.put(string64, string65);
        String string66 = "MIT";
        String string67 = "Pacific/Apia";
        cZoneIdConversion.put(string66, string67);
        String string68 = "IET";
        String string69 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string68, string69);
        String string70 = "EAT";
        String string71 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string70, string71);
        String string72 = "NET";
        String string73 = "Asia/Yerevan";
        cZoneIdConversion.put(string72, string73);
        String string74 = "MET";
        cZoneIdConversion.put(string74, string57);
        setField(cDefault, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(cDefault, "org.joda.time.DateTimeZone", "iID", string);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", string10);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testForOffsetMillis5() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forOffsetMillis(3604480));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 3604480);
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iStandardOffset", 3604480);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        String string = "UTC";
        cAvailableIDs.add(string);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        FixedDateTimeZone cDefault = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(cDefault, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        setField(cDefault, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs1 = new LinkedHashSet();
        cAvailableIDs1.add(string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(cDefault, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string1 = "";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference);
        String string2 = "+17:05";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference1);
        String string3 = "+01:00:04.480";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference2);
        String string4 = "+10:16:39.232";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference3);
        String string5 = "+18:00";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference4);
        String string6 = "\n\t\r";
        SoftReference softReference5 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string6, softReference5);
        String string7 = "-07:00";
        SoftReference softReference6 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string7, softReference6);
        String string8 = "+02:00";
        SoftReference softReference7 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string8, softReference7);
        String string9 = "+04:01";
        SoftReference softReference8 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string9, softReference8);
        String string10 = "+00:44";
        SoftReference softReference9 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string10, softReference9);
        String string11 = "+01:00";
        SoftReference softReference10 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string11, softReference10);
        String string12 = "-23:59:59.998";
        SoftReference softReference11 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string12, softReference11);
        String string13 = "-11:32";
        SoftReference softReference12 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string13, softReference12);
        String string14 = "-14:00";
        SoftReference softReference13 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string14, softReference13);
        String string15 = "-17:48:18.560";
        SoftReference softReference14 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string15, softReference14);
        setField(cDefault, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string16 = "CTT";
        String string17 = "Asia/Shanghai";
        cZoneIdConversion.put(string16, string17);
        String string18 = "ART";
        String string19 = "Africa/Cairo";
        cZoneIdConversion.put(string18, string19);
        String string20 = "WET";
        cZoneIdConversion.put(string20, string20);
        String string21 = "CNT";
        String string22 = "America/St_Johns";
        cZoneIdConversion.put(string21, string22);
        String string23 = "PRT";
        String string24 = "America/Puerto_Rico";
        cZoneIdConversion.put(string23, string24);
        String string25 = "PNT";
        String string26 = "America/Phoenix";
        cZoneIdConversion.put(string25, string26);
        String string27 = "PLT";
        String string28 = "Asia/Karachi";
        cZoneIdConversion.put(string27, string28);
        String string29 = "AST";
        String string30 = "America/Anchorage";
        cZoneIdConversion.put(string29, string30);
        String string31 = "BST";
        String string32 = "Asia/Dhaka";
        cZoneIdConversion.put(string31, string32);
        String string33 = "CST";
        String string34 = "America/Chicago";
        cZoneIdConversion.put(string33, string34);
        String string35 = "EST";
        String string36 = "America/New_York";
        cZoneIdConversion.put(string35, string36);
        String string37 = "HST";
        String string38 = "Pacific/Honolulu";
        cZoneIdConversion.put(string37, string38);
        String string39 = "JST";
        String string40 = "Asia/Tokyo";
        cZoneIdConversion.put(string39, string40);
        String string41 = "IST";
        String string42 = "Asia/Kolkata";
        cZoneIdConversion.put(string41, string42);
        String string43 = "AGT";
        String string44 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string43, string44);
        String string45 = "NST";
        String string46 = "Pacific/Auckland";
        cZoneIdConversion.put(string45, string46);
        String string47 = "GMT";
        cZoneIdConversion.put(string47, string);
        String string48 = "MST";
        String string49 = "America/Denver";
        cZoneIdConversion.put(string48, string49);
        String string50 = "PST";
        String string51 = "America/Los_Angeles";
        cZoneIdConversion.put(string50, string51);
        String string52 = "BET";
        String string53 = "America/Sao_Paulo";
        cZoneIdConversion.put(string52, string53);
        String string54 = "AET";
        String string55 = "Australia/Sydney";
        cZoneIdConversion.put(string54, string55);
        String string56 = "ACT";
        String string57 = "Australia/Darwin";
        cZoneIdConversion.put(string56, string57);
        String string58 = "CET";
        cZoneIdConversion.put(string58, string58);
        String string59 = "EET";
        cZoneIdConversion.put(string59, string59);
        String string60 = "SST";
        String string61 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string60, string61);
        String string62 = "VST";
        String string63 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string62, string63);
        String string64 = "ECT";
        cZoneIdConversion.put(string64, string58);
        String string65 = "CAT";
        String string66 = "Africa/Harare";
        cZoneIdConversion.put(string65, string66);
        String string67 = "MIT";
        String string68 = "Pacific/Apia";
        cZoneIdConversion.put(string67, string68);
        String string69 = "IET";
        String string70 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string69, string70);
        String string71 = "EAT";
        String string72 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string71, string72);
        String string73 = "NET";
        String string74 = "Asia/Yerevan";
        cZoneIdConversion.put(string73, string74);
        String string75 = "MET";
        cZoneIdConversion.put(string75, string58);
        setField(cDefault, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(cDefault, "org.joda.time.DateTimeZone", "iID", string);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", string3);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.setProvider
    
    ///region OTHER: SECURITY for method setProvider(org.joda.time.tz.Provider)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testSetProvider1() {
        /* This test fails because method [org.joda.time.DateTimeZone.setProvider] produces [java.security.AccessControlException: access denied ("org.joda.time.JodaTimePermission" "DateTimeZone.setProvider")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            org.joda.time.DateTimeZone.setProvider(DateTimeZone.java:428) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.forOffsetHours
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method forOffsetHours(int)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#forOffsetHours(int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return forOffsetHoursMinutes(hoursOffset, 0);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_ThrowIllegalArgumentException() {
        DateTimeZone.forOffsetHours(-24);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#forOffsetHours(int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return forOffsetHoursMinutes(hoursOffset, 0);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_ThrowIllegalArgumentException_1() {
        DateTimeZone.forOffsetHours(25);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method forOffsetHours(int)
    
    @Test
    public void testForOffsetHours1() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forOffsetHours(18));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 64800000);
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iStandardOffset", 64800000);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        String string = "UTC";
        cAvailableIDs.add(string);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        FixedDateTimeZone cDefault = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(cDefault, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        setField(cDefault, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs1 = new LinkedHashSet();
        cAvailableIDs1.add(string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(cDefault, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string1 = "";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference);
        String string2 = "+02:00";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference1);
        String string3 = "+04:01";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference2);
        String string4 = "+00:44";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference3);
        String string5 = "+18:00";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference4);
        String string6 = "-23:59:59.998";
        SoftReference softReference5 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string6, softReference5);
        String string7 = "\n\t\r";
        SoftReference softReference6 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string7, softReference6);
        String string8 = "-11:32";
        SoftReference softReference7 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string8, softReference7);
        setField(cDefault, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string9 = "CTT";
        String string10 = "Asia/Shanghai";
        cZoneIdConversion.put(string9, string10);
        String string11 = "ART";
        String string12 = "Africa/Cairo";
        cZoneIdConversion.put(string11, string12);
        String string13 = "WET";
        cZoneIdConversion.put(string13, string13);
        String string14 = "CNT";
        String string15 = "America/St_Johns";
        cZoneIdConversion.put(string14, string15);
        String string16 = "PRT";
        String string17 = "America/Puerto_Rico";
        cZoneIdConversion.put(string16, string17);
        String string18 = "PNT";
        String string19 = "America/Phoenix";
        cZoneIdConversion.put(string18, string19);
        String string20 = "PLT";
        String string21 = "Asia/Karachi";
        cZoneIdConversion.put(string20, string21);
        String string22 = "AST";
        String string23 = "America/Anchorage";
        cZoneIdConversion.put(string22, string23);
        String string24 = "BST";
        String string25 = "Asia/Dhaka";
        cZoneIdConversion.put(string24, string25);
        String string26 = "CST";
        String string27 = "America/Chicago";
        cZoneIdConversion.put(string26, string27);
        String string28 = "EST";
        String string29 = "America/New_York";
        cZoneIdConversion.put(string28, string29);
        String string30 = "HST";
        String string31 = "Pacific/Honolulu";
        cZoneIdConversion.put(string30, string31);
        String string32 = "JST";
        String string33 = "Asia/Tokyo";
        cZoneIdConversion.put(string32, string33);
        String string34 = "IST";
        String string35 = "Asia/Kolkata";
        cZoneIdConversion.put(string34, string35);
        String string36 = "AGT";
        String string37 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string36, string37);
        String string38 = "NST";
        String string39 = "Pacific/Auckland";
        cZoneIdConversion.put(string38, string39);
        String string40 = "GMT";
        cZoneIdConversion.put(string40, string);
        String string41 = "MST";
        String string42 = "America/Denver";
        cZoneIdConversion.put(string41, string42);
        String string43 = "PST";
        String string44 = "America/Los_Angeles";
        cZoneIdConversion.put(string43, string44);
        String string45 = "BET";
        String string46 = "America/Sao_Paulo";
        cZoneIdConversion.put(string45, string46);
        String string47 = "AET";
        String string48 = "Australia/Sydney";
        cZoneIdConversion.put(string47, string48);
        String string49 = "ACT";
        String string50 = "Australia/Darwin";
        cZoneIdConversion.put(string49, string50);
        String string51 = "CET";
        cZoneIdConversion.put(string51, string51);
        String string52 = "EET";
        cZoneIdConversion.put(string52, string52);
        String string53 = "SST";
        String string54 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string53, string54);
        String string55 = "VST";
        String string56 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string55, string56);
        String string57 = "ECT";
        cZoneIdConversion.put(string57, string51);
        String string58 = "CAT";
        String string59 = "Africa/Harare";
        cZoneIdConversion.put(string58, string59);
        String string60 = "MIT";
        String string61 = "Pacific/Apia";
        cZoneIdConversion.put(string60, string61);
        String string62 = "IET";
        String string63 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string62, string63);
        String string64 = "EAT";
        String string65 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string64, string65);
        String string66 = "NET";
        String string67 = "Asia/Yerevan";
        cZoneIdConversion.put(string66, string67);
        String string68 = "MET";
        cZoneIdConversion.put(string68, string51);
        setField(cDefault, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(cDefault, "org.joda.time.DateTimeZone", "iID", string);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", string5);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testForOffsetHours2() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forOffsetHours(1));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 3600000);
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iStandardOffset", 3600000);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        String string = "UTC";
        cAvailableIDs.add(string);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        FixedDateTimeZone cDefault = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(cDefault, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        setField(cDefault, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs1 = new LinkedHashSet();
        cAvailableIDs1.add(string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(cDefault, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string1 = "";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference);
        String string2 = "+02:00";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference1);
        String string3 = "+04:01";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference2);
        String string4 = "+00:44";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference3);
        String string5 = "+18:00";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference4);
        String string6 = "+01:00";
        SoftReference softReference5 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string6, softReference5);
        String string7 = "-23:59:59.998";
        SoftReference softReference6 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string7, softReference6);
        String string8 = "\n\t\r";
        SoftReference softReference7 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string8, softReference7);
        String string9 = "-11:32";
        SoftReference softReference8 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string9, softReference8);
        setField(cDefault, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string10 = "CTT";
        String string11 = "Asia/Shanghai";
        cZoneIdConversion.put(string10, string11);
        String string12 = "ART";
        String string13 = "Africa/Cairo";
        cZoneIdConversion.put(string12, string13);
        String string14 = "WET";
        cZoneIdConversion.put(string14, string14);
        String string15 = "CNT";
        String string16 = "America/St_Johns";
        cZoneIdConversion.put(string15, string16);
        String string17 = "PRT";
        String string18 = "America/Puerto_Rico";
        cZoneIdConversion.put(string17, string18);
        String string19 = "PNT";
        String string20 = "America/Phoenix";
        cZoneIdConversion.put(string19, string20);
        String string21 = "PLT";
        String string22 = "Asia/Karachi";
        cZoneIdConversion.put(string21, string22);
        String string23 = "AST";
        String string24 = "America/Anchorage";
        cZoneIdConversion.put(string23, string24);
        String string25 = "BST";
        String string26 = "Asia/Dhaka";
        cZoneIdConversion.put(string25, string26);
        String string27 = "CST";
        String string28 = "America/Chicago";
        cZoneIdConversion.put(string27, string28);
        String string29 = "EST";
        String string30 = "America/New_York";
        cZoneIdConversion.put(string29, string30);
        String string31 = "HST";
        String string32 = "Pacific/Honolulu";
        cZoneIdConversion.put(string31, string32);
        String string33 = "JST";
        String string34 = "Asia/Tokyo";
        cZoneIdConversion.put(string33, string34);
        String string35 = "IST";
        String string36 = "Asia/Kolkata";
        cZoneIdConversion.put(string35, string36);
        String string37 = "AGT";
        String string38 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string37, string38);
        String string39 = "NST";
        String string40 = "Pacific/Auckland";
        cZoneIdConversion.put(string39, string40);
        String string41 = "GMT";
        cZoneIdConversion.put(string41, string);
        String string42 = "MST";
        String string43 = "America/Denver";
        cZoneIdConversion.put(string42, string43);
        String string44 = "PST";
        String string45 = "America/Los_Angeles";
        cZoneIdConversion.put(string44, string45);
        String string46 = "BET";
        String string47 = "America/Sao_Paulo";
        cZoneIdConversion.put(string46, string47);
        String string48 = "AET";
        String string49 = "Australia/Sydney";
        cZoneIdConversion.put(string48, string49);
        String string50 = "ACT";
        String string51 = "Australia/Darwin";
        cZoneIdConversion.put(string50, string51);
        String string52 = "CET";
        cZoneIdConversion.put(string52, string52);
        String string53 = "EET";
        cZoneIdConversion.put(string53, string53);
        String string54 = "SST";
        String string55 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string54, string55);
        String string56 = "VST";
        String string57 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string56, string57);
        String string58 = "ECT";
        cZoneIdConversion.put(string58, string52);
        String string59 = "CAT";
        String string60 = "Africa/Harare";
        cZoneIdConversion.put(string59, string60);
        String string61 = "MIT";
        String string62 = "Pacific/Apia";
        cZoneIdConversion.put(string61, string62);
        String string63 = "IET";
        String string64 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string63, string64);
        String string65 = "EAT";
        String string66 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string65, string66);
        String string67 = "NET";
        String string68 = "Asia/Yerevan";
        cZoneIdConversion.put(string67, string68);
        String string69 = "MET";
        cZoneIdConversion.put(string69, string52);
        setField(cDefault, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(cDefault, "org.joda.time.DateTimeZone", "iID", string);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", string6);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testForOffsetHours3() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forOffsetHours(0));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iNameKey = "UTC";
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", iNameKey);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        cAvailableIDs.add(iNameKey);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", expected);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string = "";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string, softReference);
        String string1 = "+02:00";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference1);
        String string2 = "+04:01";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference2);
        String string3 = "+00:44";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference3);
        String string4 = "+18:00";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference4);
        String string5 = "+01:00";
        SoftReference softReference5 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference5);
        String string6 = "-23:59:59.998";
        SoftReference softReference6 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string6, softReference6);
        String string7 = "\n\t\r";
        SoftReference softReference7 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string7, softReference7);
        String string8 = "-07:00";
        SoftReference softReference8 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string8, softReference8);
        String string9 = "-11:32";
        SoftReference softReference9 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string9, softReference9);
        String string10 = "-14:00";
        SoftReference softReference10 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string10, softReference10);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string11 = "CTT";
        String string12 = "Asia/Shanghai";
        cZoneIdConversion.put(string11, string12);
        String string13 = "ART";
        String string14 = "Africa/Cairo";
        cZoneIdConversion.put(string13, string14);
        String string15 = "WET";
        cZoneIdConversion.put(string15, string15);
        String string16 = "CNT";
        String string17 = "America/St_Johns";
        cZoneIdConversion.put(string16, string17);
        String string18 = "PRT";
        String string19 = "America/Puerto_Rico";
        cZoneIdConversion.put(string18, string19);
        String string20 = "PNT";
        String string21 = "America/Phoenix";
        cZoneIdConversion.put(string20, string21);
        String string22 = "PLT";
        String string23 = "Asia/Karachi";
        cZoneIdConversion.put(string22, string23);
        String string24 = "AST";
        String string25 = "America/Anchorage";
        cZoneIdConversion.put(string24, string25);
        String string26 = "BST";
        String string27 = "Asia/Dhaka";
        cZoneIdConversion.put(string26, string27);
        String string28 = "CST";
        String string29 = "America/Chicago";
        cZoneIdConversion.put(string28, string29);
        String string30 = "EST";
        String string31 = "America/New_York";
        cZoneIdConversion.put(string30, string31);
        String string32 = "HST";
        String string33 = "Pacific/Honolulu";
        cZoneIdConversion.put(string32, string33);
        String string34 = "JST";
        String string35 = "Asia/Tokyo";
        cZoneIdConversion.put(string34, string35);
        String string36 = "IST";
        String string37 = "Asia/Kolkata";
        cZoneIdConversion.put(string36, string37);
        String string38 = "AGT";
        String string39 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string38, string39);
        String string40 = "NST";
        String string41 = "Pacific/Auckland";
        cZoneIdConversion.put(string40, string41);
        String string42 = "GMT";
        cZoneIdConversion.put(string42, iNameKey);
        String string43 = "MST";
        String string44 = "America/Denver";
        cZoneIdConversion.put(string43, string44);
        String string45 = "PST";
        String string46 = "America/Los_Angeles";
        cZoneIdConversion.put(string45, string46);
        String string47 = "BET";
        String string48 = "America/Sao_Paulo";
        cZoneIdConversion.put(string47, string48);
        String string49 = "AET";
        String string50 = "Australia/Sydney";
        cZoneIdConversion.put(string49, string50);
        String string51 = "ACT";
        String string52 = "Australia/Darwin";
        cZoneIdConversion.put(string51, string52);
        String string53 = "CET";
        cZoneIdConversion.put(string53, string53);
        String string54 = "EET";
        cZoneIdConversion.put(string54, string54);
        String string55 = "SST";
        String string56 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string55, string56);
        String string57 = "VST";
        String string58 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string57, string58);
        String string59 = "ECT";
        cZoneIdConversion.put(string59, string53);
        String string60 = "CAT";
        String string61 = "Africa/Harare";
        cZoneIdConversion.put(string60, string61);
        String string62 = "MIT";
        String string63 = "Pacific/Apia";
        cZoneIdConversion.put(string62, string63);
        String string64 = "IET";
        String string65 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string64, string65);
        String string66 = "EAT";
        String string67 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string66, string67);
        String string68 = "NET";
        String string69 = "Asia/Yerevan";
        cZoneIdConversion.put(string68, string69);
        String string70 = "MET";
        cZoneIdConversion.put(string70, string53);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", iNameKey);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testForOffsetHours4() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forOffsetHours(-7));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", -25200000);
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iStandardOffset", -25200000);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        String string = "UTC";
        cAvailableIDs.add(string);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        FixedDateTimeZone cDefault = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(cDefault, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        setField(cDefault, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs1 = new LinkedHashSet();
        cAvailableIDs1.add(string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(cDefault, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string1 = "";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference);
        String string2 = "+02:00";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference1);
        String string3 = "+04:01";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference2);
        String string4 = "+00:44";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference3);
        String string5 = "+18:00";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference4);
        String string6 = "+01:00";
        SoftReference softReference5 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string6, softReference5);
        String string7 = "-23:59:59.998";
        SoftReference softReference6 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string7, softReference6);
        String string8 = "\n\t\r";
        SoftReference softReference7 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string8, softReference7);
        String string9 = "-07:00";
        SoftReference softReference8 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string9, softReference8);
        String string10 = "-11:32";
        SoftReference softReference9 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string10, softReference9);
        setField(cDefault, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string11 = "CTT";
        String string12 = "Asia/Shanghai";
        cZoneIdConversion.put(string11, string12);
        String string13 = "ART";
        String string14 = "Africa/Cairo";
        cZoneIdConversion.put(string13, string14);
        String string15 = "WET";
        cZoneIdConversion.put(string15, string15);
        String string16 = "CNT";
        String string17 = "America/St_Johns";
        cZoneIdConversion.put(string16, string17);
        String string18 = "PRT";
        String string19 = "America/Puerto_Rico";
        cZoneIdConversion.put(string18, string19);
        String string20 = "PNT";
        String string21 = "America/Phoenix";
        cZoneIdConversion.put(string20, string21);
        String string22 = "PLT";
        String string23 = "Asia/Karachi";
        cZoneIdConversion.put(string22, string23);
        String string24 = "AST";
        String string25 = "America/Anchorage";
        cZoneIdConversion.put(string24, string25);
        String string26 = "BST";
        String string27 = "Asia/Dhaka";
        cZoneIdConversion.put(string26, string27);
        String string28 = "CST";
        String string29 = "America/Chicago";
        cZoneIdConversion.put(string28, string29);
        String string30 = "EST";
        String string31 = "America/New_York";
        cZoneIdConversion.put(string30, string31);
        String string32 = "HST";
        String string33 = "Pacific/Honolulu";
        cZoneIdConversion.put(string32, string33);
        String string34 = "JST";
        String string35 = "Asia/Tokyo";
        cZoneIdConversion.put(string34, string35);
        String string36 = "IST";
        String string37 = "Asia/Kolkata";
        cZoneIdConversion.put(string36, string37);
        String string38 = "AGT";
        String string39 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string38, string39);
        String string40 = "NST";
        String string41 = "Pacific/Auckland";
        cZoneIdConversion.put(string40, string41);
        String string42 = "GMT";
        cZoneIdConversion.put(string42, string);
        String string43 = "MST";
        String string44 = "America/Denver";
        cZoneIdConversion.put(string43, string44);
        String string45 = "PST";
        String string46 = "America/Los_Angeles";
        cZoneIdConversion.put(string45, string46);
        String string47 = "BET";
        String string48 = "America/Sao_Paulo";
        cZoneIdConversion.put(string47, string48);
        String string49 = "AET";
        String string50 = "Australia/Sydney";
        cZoneIdConversion.put(string49, string50);
        String string51 = "ACT";
        String string52 = "Australia/Darwin";
        cZoneIdConversion.put(string51, string52);
        String string53 = "CET";
        cZoneIdConversion.put(string53, string53);
        String string54 = "EET";
        cZoneIdConversion.put(string54, string54);
        String string55 = "SST";
        String string56 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string55, string56);
        String string57 = "VST";
        String string58 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string57, string58);
        String string59 = "ECT";
        cZoneIdConversion.put(string59, string53);
        String string60 = "CAT";
        String string61 = "Africa/Harare";
        cZoneIdConversion.put(string60, string61);
        String string62 = "MIT";
        String string63 = "Pacific/Apia";
        cZoneIdConversion.put(string62, string63);
        String string64 = "IET";
        String string65 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string64, string65);
        String string66 = "EAT";
        String string67 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string66, string67);
        String string68 = "NET";
        String string69 = "Asia/Yerevan";
        cZoneIdConversion.put(string68, string69);
        String string70 = "MET";
        cZoneIdConversion.put(string70, string53);
        setField(cDefault, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(cDefault, "org.joda.time.DateTimeZone", "iID", string);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", string9);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testForOffsetHours5() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forOffsetHours(-14));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", -50400000);
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iStandardOffset", -50400000);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        String string = "UTC";
        cAvailableIDs.add(string);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        FixedDateTimeZone cDefault = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(cDefault, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        setField(cDefault, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs1 = new LinkedHashSet();
        cAvailableIDs1.add(string);
        setField(cDefault, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs1);
        setField(cDefault, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(cDefault, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string1 = "";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference);
        String string2 = "+02:00";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference1);
        String string3 = "+04:01";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference2);
        String string4 = "+00:44";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference3);
        String string5 = "+18:00";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference4);
        String string6 = "+01:00";
        SoftReference softReference5 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string6, softReference5);
        String string7 = "-23:59:59.998";
        SoftReference softReference6 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string7, softReference6);
        String string8 = "\n\t\r";
        SoftReference softReference7 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string8, softReference7);
        String string9 = "-07:00";
        SoftReference softReference8 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string9, softReference8);
        String string10 = "-11:32";
        SoftReference softReference9 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string10, softReference9);
        String string11 = "-14:00";
        SoftReference softReference10 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string11, softReference10);
        setField(cDefault, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string12 = "CTT";
        String string13 = "Asia/Shanghai";
        cZoneIdConversion.put(string12, string13);
        String string14 = "ART";
        String string15 = "Africa/Cairo";
        cZoneIdConversion.put(string14, string15);
        String string16 = "WET";
        cZoneIdConversion.put(string16, string16);
        String string17 = "CNT";
        String string18 = "America/St_Johns";
        cZoneIdConversion.put(string17, string18);
        String string19 = "PRT";
        String string20 = "America/Puerto_Rico";
        cZoneIdConversion.put(string19, string20);
        String string21 = "PNT";
        String string22 = "America/Phoenix";
        cZoneIdConversion.put(string21, string22);
        String string23 = "PLT";
        String string24 = "Asia/Karachi";
        cZoneIdConversion.put(string23, string24);
        String string25 = "AST";
        String string26 = "America/Anchorage";
        cZoneIdConversion.put(string25, string26);
        String string27 = "BST";
        String string28 = "Asia/Dhaka";
        cZoneIdConversion.put(string27, string28);
        String string29 = "CST";
        String string30 = "America/Chicago";
        cZoneIdConversion.put(string29, string30);
        String string31 = "EST";
        String string32 = "America/New_York";
        cZoneIdConversion.put(string31, string32);
        String string33 = "HST";
        String string34 = "Pacific/Honolulu";
        cZoneIdConversion.put(string33, string34);
        String string35 = "JST";
        String string36 = "Asia/Tokyo";
        cZoneIdConversion.put(string35, string36);
        String string37 = "IST";
        String string38 = "Asia/Kolkata";
        cZoneIdConversion.put(string37, string38);
        String string39 = "AGT";
        String string40 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string39, string40);
        String string41 = "NST";
        String string42 = "Pacific/Auckland";
        cZoneIdConversion.put(string41, string42);
        String string43 = "GMT";
        cZoneIdConversion.put(string43, string);
        String string44 = "MST";
        String string45 = "America/Denver";
        cZoneIdConversion.put(string44, string45);
        String string46 = "PST";
        String string47 = "America/Los_Angeles";
        cZoneIdConversion.put(string46, string47);
        String string48 = "BET";
        String string49 = "America/Sao_Paulo";
        cZoneIdConversion.put(string48, string49);
        String string50 = "AET";
        String string51 = "Australia/Sydney";
        cZoneIdConversion.put(string50, string51);
        String string52 = "ACT";
        String string53 = "Australia/Darwin";
        cZoneIdConversion.put(string52, string53);
        String string54 = "CET";
        cZoneIdConversion.put(string54, string54);
        String string55 = "EET";
        cZoneIdConversion.put(string55, string55);
        String string56 = "SST";
        String string57 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string56, string57);
        String string58 = "VST";
        String string59 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string58, string59);
        String string60 = "ECT";
        cZoneIdConversion.put(string60, string54);
        String string61 = "CAT";
        String string62 = "Africa/Harare";
        cZoneIdConversion.put(string61, string62);
        String string63 = "MIT";
        String string64 = "Pacific/Apia";
        cZoneIdConversion.put(string63, string64);
        String string65 = "IET";
        String string66 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string65, string66);
        String string67 = "EAT";
        String string68 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string67, string68);
        String string69 = "NET";
        String string70 = "Asia/Yerevan";
        cZoneIdConversion.put(string69, string70);
        String string71 = "MET";
        cZoneIdConversion.put(string71, string54);
        setField(cDefault, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(cDefault, "org.joda.time.DateTimeZone", "iID", string);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", cDefault);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", string11);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.offsetFormatter
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method offsetFormatter()
    
    @Test
    public void testOffsetFormatter1() throws Exception  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Method offsetFormatterMethod = dateTimeZoneClazz.getDeclaredMethod("offsetFormatter");
        offsetFormatterMethod.setAccessible(true);
        java.lang.Object[] offsetFormatterMethodArguments = new java.lang.Object[0];
        DateTimeFormatter actual = ((DateTimeFormatter) offsetFormatterMethod.invoke(null, offsetFormatterMethodArguments));
        
        DateTimeFormatter expected = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(expected, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(expected, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(expected, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        
        DateTimePrinter expectedIPrinter = ((DateTimePrinter) getFieldValue(expected, "org.joda.time.format.DateTimeFormatter", "iPrinter"));
        DateTimePrinter actualIPrinter = ((DateTimePrinter) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iPrinter"));
        String actualIPrinterIZeroOffsetPrintText = ((String) getFieldValue(actualIPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iZeroOffsetPrintText"));
        assertNull(actualIPrinterIZeroOffsetPrintText);
        
        String actualIPrinterIZeroOffsetParseText = ((String) getFieldValue(actualIPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iZeroOffsetParseText"));
        assertNull(actualIPrinterIZeroOffsetParseText);
        
        boolean actualIPrinterIShowSeparators = ((Boolean) getFieldValue(actualIPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators"));
        assertTrue(actualIPrinterIShowSeparators);
        
        int expectedIPrinterIMinFields = ((Integer) getFieldValue(expectedIPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields"));
        int actualIPrinterIMinFields = ((Integer) getFieldValue(actualIPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields"));
        assertEquals(expectedIPrinterIMinFields, actualIPrinterIMinFields);
        
        int expectedIPrinterIMaxFields = ((Integer) getFieldValue(expectedIPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields"));
        int actualIPrinterIMaxFields = ((Integer) getFieldValue(actualIPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields"));
        assertEquals(expectedIPrinterIMaxFields, actualIPrinterIMaxFields);
        
        DateTimeParser expectedIParser = ((DateTimeParser) getFieldValue(expected, "org.joda.time.format.DateTimeFormatter", "iParser"));
        DateTimeParser actualIParser = ((DateTimeParser) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iParser"));
        assertTrue(deepEquals(expectedIParser, actualIParser));
        assertTrue(deepEquals(expectedIParser, actualIParser));
        assertTrue(deepEquals(expectedIParser, actualIParser));
        assertTrue(deepEquals(expectedIParser, actualIParser));
        assertTrue(deepEquals(expectedIParser, actualIParser));
        
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.printOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printOffset(int)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#printOffset(int)}
 * @utbot.executesCondition {@code (offset == 0): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testPrintOffset_StringBufferAppend() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = -1440000;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "-00:24";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#printOffset(int)}
 * @utbot.executesCondition {@code (offset == 0): True}
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testPrintOffset_OffsetEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = 57660000;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "+16:01";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#printOffset(int)}
 * @utbot.executesCondition {@code (offset == 0): True}
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testPrintOffset_OffsetEqualsZero_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = 507300000;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "+140:55";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#printOffset(int)}
 * @utbot.executesCondition {@code (offset == 0): False}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 * @utbot.invokes {@link org.joda.time.format.FormatUtils#appendPaddedInteger(java.lang.StringBuffer,int,int)}
 * @utbot.invokes {@link java.lang.StringBuffer#toString()}
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testPrintOffset_OffsetEqualsZero_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = 492610000;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "+136:50:10";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method printOffset(int)
    
    @Test
    public void testPrintOffset1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = -154676;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "-00:02:34.676";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrintOffset2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = -18604016;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "-05:10:04.016";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrintOffset3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = 234750976;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "+65:12:30.976";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrintOffset4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = 380161024;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "+105:36:01.024";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrintOffset5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = 21627981;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "+06:00:27.981";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrintOffset6() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = 7080016;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "+01:58:00.016";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrintOffset7() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = 3600000;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "+01:00";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrintOffset8() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = -47285176;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "-13:08:05.176";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrintOffset9() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = -234006023;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "-65:00:06.023";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrintOffset10() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = -73920000;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "-20:32";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrintOffset11() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = -684008064;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "-190:00:08.064";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrintOffset12() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = -784801000;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "-218:00:01";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrintOffset13() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = -2138460000;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "-594:01";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrintOffset14() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class intType = int.class;
        Method printOffsetMethod = dateTimeZoneClazz.getDeclaredMethod("printOffset", intType);
        printOffsetMethod.setAccessible(true);
        java.lang.Object[] printOffsetMethodArguments = new java.lang.Object[1];
        printOffsetMethodArguments[0] = Integer.MIN_VALUE;
        String actual = ((String) printOffsetMethod.invoke(null, printOffsetMethodArguments));
        
        String expected = "--596:-31:-23.-648";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.forTimeZone
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method forTimeZone(java.util.TimeZone)
    
    @Test
    public void testForTimeZone1() throws Exception  {
        FixedDateTimeZone actual = ((FixedDateTimeZone) DateTimeZone.forTimeZone(null));
        
        FixedDateTimeZone expected = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iNameKey = "UTC";
        setField(expected, "org.joda.time.tz.FixedDateTimeZone", "iNameKey", iNameKey);
        UTCProvider cProvider = ((UTCProvider) createInstance("org.joda.time.tz.UTCProvider"));
        setField(expected, "org.joda.time.DateTimeZone", "cProvider", cProvider);
        DefaultNameProvider cNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        HashMap iByLocaleCache = new HashMap();
        setField(cNameProvider, "org.joda.time.tz.DefaultNameProvider", "iByLocaleCache", iByLocaleCache);
        setField(expected, "org.joda.time.DateTimeZone", "cNameProvider", cNameProvider);
        Set cAvailableIDs = new LinkedHashSet();
        cAvailableIDs.add(iNameKey);
        setField(expected, "org.joda.time.DateTimeZone", "cAvailableIDs", cAvailableIDs);
        setField(expected, "org.joda.time.DateTimeZone", "cDefault", expected);
        DateTimeFormatter cOffsetFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iShowSeparators", true);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMinFields", 2);
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", "iMaxFields", 4);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iParser", iPrinter);
        setField(cOffsetFormatter, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        setField(expected, "org.joda.time.DateTimeZone", "cOffsetFormatter", cOffsetFormatter);
        HashMap iFixedOffsetCache = new HashMap();
        String string = "";
        SoftReference softReference = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string, softReference);
        String string1 = "+02:00";
        SoftReference softReference1 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string1, softReference1);
        String string2 = "+04:01";
        SoftReference softReference2 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string2, softReference2);
        String string3 = "+00:44";
        SoftReference softReference3 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string3, softReference3);
        String string4 = "+18:00";
        SoftReference softReference4 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string4, softReference4);
        String string5 = "+01:00";
        SoftReference softReference5 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string5, softReference5);
        String string6 = "-23:59:59.998";
        SoftReference softReference6 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string6, softReference6);
        String string7 = "\n\t\r";
        SoftReference softReference7 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string7, softReference7);
        String string8 = "-07:00";
        SoftReference softReference8 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string8, softReference8);
        String string9 = "-11:32";
        SoftReference softReference9 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string9, softReference9);
        String string10 = "-14:00";
        SoftReference softReference10 = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        iFixedOffsetCache.put(string10, softReference10);
        setField(expected, "org.joda.time.DateTimeZone", "iFixedOffsetCache", iFixedOffsetCache);
        HashMap cZoneIdConversion = new HashMap();
        String string11 = "CTT";
        String string12 = "Asia/Shanghai";
        cZoneIdConversion.put(string11, string12);
        String string13 = "ART";
        String string14 = "Africa/Cairo";
        cZoneIdConversion.put(string13, string14);
        String string15 = "WET";
        cZoneIdConversion.put(string15, string15);
        String string16 = "CNT";
        String string17 = "America/St_Johns";
        cZoneIdConversion.put(string16, string17);
        String string18 = "PRT";
        String string19 = "America/Puerto_Rico";
        cZoneIdConversion.put(string18, string19);
        String string20 = "PNT";
        String string21 = "America/Phoenix";
        cZoneIdConversion.put(string20, string21);
        String string22 = "PLT";
        String string23 = "Asia/Karachi";
        cZoneIdConversion.put(string22, string23);
        String string24 = "AST";
        String string25 = "America/Anchorage";
        cZoneIdConversion.put(string24, string25);
        String string26 = "BST";
        String string27 = "Asia/Dhaka";
        cZoneIdConversion.put(string26, string27);
        String string28 = "CST";
        String string29 = "America/Chicago";
        cZoneIdConversion.put(string28, string29);
        String string30 = "EST";
        String string31 = "America/New_York";
        cZoneIdConversion.put(string30, string31);
        String string32 = "HST";
        String string33 = "Pacific/Honolulu";
        cZoneIdConversion.put(string32, string33);
        String string34 = "JST";
        String string35 = "Asia/Tokyo";
        cZoneIdConversion.put(string34, string35);
        String string36 = "IST";
        String string37 = "Asia/Kolkata";
        cZoneIdConversion.put(string36, string37);
        String string38 = "AGT";
        String string39 = "America/Argentina/Buenos_Aires";
        cZoneIdConversion.put(string38, string39);
        String string40 = "NST";
        String string41 = "Pacific/Auckland";
        cZoneIdConversion.put(string40, string41);
        String string42 = "GMT";
        cZoneIdConversion.put(string42, iNameKey);
        String string43 = "MST";
        String string44 = "America/Denver";
        cZoneIdConversion.put(string43, string44);
        String string45 = "PST";
        String string46 = "America/Los_Angeles";
        cZoneIdConversion.put(string45, string46);
        String string47 = "BET";
        String string48 = "America/Sao_Paulo";
        cZoneIdConversion.put(string47, string48);
        String string49 = "AET";
        String string50 = "Australia/Sydney";
        cZoneIdConversion.put(string49, string50);
        String string51 = "ACT";
        String string52 = "Australia/Darwin";
        cZoneIdConversion.put(string51, string52);
        String string53 = "CET";
        cZoneIdConversion.put(string53, string53);
        String string54 = "EET";
        cZoneIdConversion.put(string54, string54);
        String string55 = "SST";
        String string56 = "Pacific/Guadalcanal";
        cZoneIdConversion.put(string55, string56);
        String string57 = "VST";
        String string58 = "Asia/Ho_Chi_Minh";
        cZoneIdConversion.put(string57, string58);
        String string59 = "ECT";
        cZoneIdConversion.put(string59, string53);
        String string60 = "CAT";
        String string61 = "Africa/Harare";
        cZoneIdConversion.put(string60, string61);
        String string62 = "MIT";
        String string63 = "Pacific/Apia";
        cZoneIdConversion.put(string62, string63);
        String string64 = "IET";
        String string65 = "America/Indiana/Indianapolis";
        cZoneIdConversion.put(string64, string65);
        String string66 = "EAT";
        String string67 = "Africa/Addis_Ababa";
        cZoneIdConversion.put(string66, string67);
        String string68 = "NET";
        String string69 = "Asia/Yerevan";
        cZoneIdConversion.put(string68, string69);
        String string70 = "MET";
        cZoneIdConversion.put(string70, string53);
        setField(expected, "org.joda.time.DateTimeZone", "cZoneIdConversion", cZoneIdConversion);
        setField(expected, "org.joda.time.DateTimeZone", "iID", iNameKey);
        
        // org.joda.time.tz.FixedDateTimeZone has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method forTimeZone(java.util.TimeZone)
    
    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone2() throws Exception  {
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        String id = "";
        simpleTimeZone.setID(id);
        
        DateTimeZone.forTimeZone(simpleTimeZone);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.setNameProvider0
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setNameProvider0(org.joda.time.tz.NameProvider)
    
    @Test
    public void testSetNameProvider01() throws Exception  {
        DefaultNameProvider defaultNameProvider = ((DefaultNameProvider) createInstance("org.joda.time.tz.DefaultNameProvider"));
        
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class defaultNameProviderType = Class.forName("org.joda.time.tz.NameProvider");
        Method setNameProvider0Method = dateTimeZoneClazz.getDeclaredMethod("setNameProvider0", defaultNameProviderType);
        setNameProvider0Method.setAccessible(true);
        java.lang.Object[] setNameProvider0MethodArguments = new java.lang.Object[1];
        setNameProvider0MethodArguments[0] = defaultNameProvider;
        setNameProvider0Method.invoke(null, setNameProvider0MethodArguments);
    }
    
    @Test
    public void testSetNameProvider02() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dateTimeZoneClazz = Class.forName("org.joda.time.DateTimeZone");
        Class nameProviderType = Class.forName("org.joda.time.tz.NameProvider");
        Method setNameProvider0Method = dateTimeZoneClazz.getDeclaredMethod("setNameProvider0", nameProviderType);
        setNameProvider0Method.setAccessible(true);
        java.lang.Object[] setNameProvider0MethodArguments = new java.lang.Object[1];
        setNameProvider0MethodArguments[0] = ((Object) null);
        setNameProvider0Method.invoke(null, setNameProvider0MethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.isStandardOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isStandardOffset(long)
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#isStandardOffset(long)}
 * @utbot.returnsFrom {@code return getOffset(instant) == getStandardOffset(instant);}
 *  */
    @Test
    public void testIsStandardOffset_GetOffsetNotEqualsGetStandardOffset() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(fixedDateTimeZone, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 1);
        
        boolean actual = fixedDateTimeZone.isStandardOffset(-254L);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeZone}
 * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#isStandardOffset(long)}
 * @utbot.returnsFrom {@code return getOffset(instant) == getStandardOffset(instant);}
 *  */
    @Test
    public void testIsStandardOffset_GetOffsetEqualsGetStandardOffset() throws Exception  {
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        boolean actual = fixedDateTimeZone.isStandardOffset(-255L);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isStandardOffset(long)
    
    @Test
    public void testIsStandardOffset1() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.isStandardOffset] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getOffset(CachedDateTimeZone.java:103)
            org.joda.time.DateTimeZone.isStandardOffset(DateTimeZone.java:869) */
        cachedDateTimeZone.isStandardOffset(0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.DateTimeZone.getOffsetFromLocal
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getOffsetFromLocal(long)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.DateTimeZone}
     * @utbot.methodUnderTest {@link org.joda.time.DateTimeZone#getOffsetFromLocal(long)}
     */
    @Test
    public void testGetOffsetFromLocalReturnsZero() {
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone("", "XZ", 0, 1);
        
        int actual = fixedDateTimeZone.getOffsetFromLocal(3221225471L);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getOffsetFromLocal(long)
    
    @Test
    public void testGetOffsetFromLocal1() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        /* This test fails because method [org.joda.time.DateTimeZone.getOffsetFromLocal] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getOffset(CachedDateTimeZone.java:103)
            org.joda.time.DateTimeZone.getOffsetFromLocal(DateTimeZone.java:907) */
        cachedDateTimeZone.getOffsetFromLocal(0L);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1051713741598099 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1051713741598099.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1051713741606900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1051713741598099.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1051713741606900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1051713742352100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1051713742352100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1051713742360699 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1051713742352100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1051713742360699).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

