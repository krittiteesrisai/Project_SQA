package org.apache.commons.lang.time;

import org.junit.Test;
import java.util.SimpleTimeZone;
import sun.util.calendar.ZoneInfo;
import java.util.Locale;
import sun.util.locale.BaseLocale;
import sun.util.locale.LocaleExtensions;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.TimeZone;
import java.text.ParsePosition;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_lang_time_FastDateFormatTest {
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): True}
 *  */
    @Test
    public void testEquals_ObjInstanceOfFastDateFormatEqualsFalse() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        boolean actual = fastDateFormat.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): False}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): False}
 * @utbot.executesCondition {@code ((mPattern == other.mPattern || mPattern.equals(other.mPattern)) && (mTimeZone == other.mTimeZone || mTimeZone.equals(other.mTimeZone)) && (mLocale == other.mLocale || mLocale.equals(other.mLocale)) && (mTimeZoneForced == other.mTimeZoneForced) && (mLocaleForced == other.mLocaleForced)): False}
 *  */
    @Test
    public void testEquals_MPatternEqualsOtherMPatternOrMPatternEqualsAndMTimeZoneEqualsOtherMTimeZoneOrMTimeZoneEqualsAndMLocaleEqualsOtherMLocaleOrMLocaleEqualsAndMTimeZoneForcedEqualsOtherMTimeZoneForcedAndMLocaleForcedEqualsOtherMLocaleForced() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): False}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): True}
 * @utbot.executesCondition {@code ((mTimeZone == other.mTimeZone || mTimeZone.equals(other.mTimeZone))): False}
 *  */
    @Test
    public void testEquals_MTimeZoneEqualsOtherMTimeZoneOrMTimeZoneEquals() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): False}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): True}
 * @utbot.executesCondition {@code ((mTimeZone == other.mTimeZone || mTimeZone.equals(other.mTimeZone))): False}
 *  */
    @Test
    public void testEquals_MTimeZoneEqualsOtherMTimeZoneOrMTimeZoneEquals_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        mTimeZone.setRawOffset(-306528511);
        setField(mTimeZone, "sun.util.calendar.ZoneInfo", "rawOffsetDiff", 82030);
        String id = "";
        mTimeZone.setID(id);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        mTimeZone1.setRawOffset(262160);
        setField(mTimeZone1, "sun.util.calendar.ZoneInfo", "rawOffsetDiff", 306184320);
        mTimeZone1.setID(id);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): False}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): False}
 * @utbot.executesCondition {@code ((mPattern == other.mPattern || mPattern.equals(other.mPattern)) && (mTimeZone == other.mTimeZone || mTimeZone.equals(other.mTimeZone)) && (mLocale == other.mLocale || mLocale.equals(other.mLocale)) && (mTimeZoneForced == other.mTimeZoneForced) && (mLocaleForced == other.mLocaleForced)): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): False}
 * @utbot.executesCondition {@code (mTimeZone == other.mTimeZone): True}
 * @utbot.executesCondition {@code (mTimeZone.equals(other.mTimeZone)): False}
 *  */
    @Test
    public void testEquals_MPatternNotEqualsOtherMPatternOrMPatternEqualsAndMTimeZoneNotEqualsOtherMTimeZoneOrMTimeZoneEqualsAndMLocaleNotEqualsOtherMLocaleOrMLocaleEqualsAndMTimeZoneForcedNotEqualsOtherMTimeZoneForcedAndMLocaleForcedNotEqualsOtherMLocaleForced() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern1 = "";
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (obj instanceof FastDateFormat == false): False},
    ///     {@code (mPattern == other.mPattern): True},
    ///     {@code (mPattern.equals(other.mPattern)): False},
    ///     {@code (mTimeZone == other.mTimeZone): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (mTimeZone.equals(other.mTimeZone)): False}
 *  */
    @Test
    public void testEquals_NotMTimeZoneEquals() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (mTimeZone.equals(other.mTimeZone)): True}
 * @utbot.executesCondition {@code (mLocale == other.mLocale): False}
 *  */
    @Test
    public void testEquals_MLocaleNotEqualsOtherMLocale() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (mTimeZone.equals(other.mTimeZone)): True}
 * @utbot.executesCondition {@code (mLocale == other.mLocale): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_MLocaleEqualsOtherMLocale() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        
        boolean actual = fastDateFormat.equals(fastDateFormat);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method equals(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (obj instanceof FastDateFormat == false): False},
    ///     {@code (mPattern == other.mPattern): True},
    ///     {@code (mPattern.equals(other.mPattern)): False},
    ///     {@code (mTimeZone == other.mTimeZone): False}
    /// invoke:
    ///     {@link java.util.Locale#equals(java.lang.Object)} once
    /// return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code ((mLocale == other.mLocale || mLocale.equals(other.mLocale))): False}
 *  */
    @Test
    public void testEquals_MLocaleEqualsOtherMLocaleOrMLocaleEquals() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code ((mLocale == other.mLocale || mLocale.equals(other.mLocale))): True}
 * @utbot.executesCondition {@code (mTimeZone.equals(other.mTimeZone)): False}
 *  */
    @Test
    public void testEquals_MLocaleNotEqualsOtherMLocaleOrMLocaleEquals() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(mLocale, "java.util.Locale", "baseLocale", baseLocale);
        LocaleExtensions localeExtensions = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        String id = " ";
        setField(localeExtensions, "sun.util.locale.LocaleExtensions", "id", id);
        setField(mLocale, "java.util.Locale", "localeExtensions", localeExtensions);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
        setField(mLocale1, "java.util.Locale", "baseLocale", baseLocale);
        LocaleExtensions localeExtensions1 = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        setField(localeExtensions1, "sun.util.locale.LocaleExtensions", "id", id);
        setField(mLocale1, "java.util.Locale", "localeExtensions", localeExtensions1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code ((mLocale == other.mLocale || mLocale.equals(other.mLocale))): True}
 * @utbot.executesCondition {@code (mTimeZone.equals(other.mTimeZone)): False}
 *  */
    @Test
    public void testEquals_MLocaleNotEqualsOtherMLocaleOrMLocaleEquals_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(mLocale, "java.util.Locale", "baseLocale", baseLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale1 = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(mLocale1, "java.util.Locale", "baseLocale", baseLocale1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (mPattern == other.mPattern || mPattern.equals(other.mPattern)) && (mTimeZone == other.mTimeZone || mTimeZone.equals(other.mTimeZone)) && (mLocale == other.mLocale || mLocale.equals(other.mLocale)) && (mTimeZoneForced == other.mTimeZoneForced) && (mLocaleForced == other.mLocaleForced)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.equals(FastDateFormat.java:985) */
        fastDateFormat.equals(fastDateFormat1);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): False}
 * @utbot.executesCondition {@code (mTimeZone == other.mTimeZone): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (mLocale == other.mLocale || mLocale.equals(other.mLocale))
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.equals(FastDateFormat.java:987) */
        fastDateFormat.equals(fastDateFormat1);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): True}
 * @utbot.executesCondition {@code ((mTimeZone == other.mTimeZone || mTimeZone.equals(other.mTimeZone))): True}
 * @utbot.executesCondition {@code (mTimeZone == other.mTimeZone): False}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (mLocale == other.mLocale || mLocale.equals(other.mLocale))
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_2() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        String id = "";
        mTimeZone.setID(id);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone1 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        mTimeZone1.setID(id);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.equals(FastDateFormat.java:987) */
        fastDateFormat.equals(fastDateFormat1);
    }
    ///endregion
    
    ///region Errors report for equals
    
    public void testEquals_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return "FastDateFormat[" + mPattern + "]";}
 *  */
    @Test
    public void testToString_StringBuilderToString() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        String actual = fastDateFormat.toString();
        
        String expected = "FastDateFormat[null]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.executesCondition {@code (mLocaleForced): True}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_MLocaleForced() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(mLocale, "java.util.Locale", "hashCodeValue", 1);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        
        int actual = fastDateFormat.hashCode();
        
        assertEquals(35, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.executesCondition {@code (mLocaleForced): False}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_NotMLocaleForced() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(mLocale, "java.util.Locale", "hashCodeValue", 1);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        
        int actual = fastDateFormat.hashCode();
        
        assertEquals(34, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.executesCondition {@code (mLocaleForced): False}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_NotMLocaleForced_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(baseLocale, "sun.util.locale.BaseLocale", "hash", 1);
        setField(mLocale, "java.util.Locale", "baseLocale", baseLocale);
        LocaleExtensions localeExtensions = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        setField(localeExtensions, "sun.util.locale.LocaleExtensions", "id", mPattern);
        setField(mLocale, "java.util.Locale", "localeExtensions", localeExtensions);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        
        int actual = fastDateFormat.hashCode();
        
        assertEquals(510, actual);
        
        Locale fastDateFormatMLocale = ((Locale) getFieldValue(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale"));
        int finalFastDateFormatMLocaleHashCodeValue = ((Integer) getFieldValue(fastDateFormatMLocale, "java.util.Locale", "hashCodeValue"));
        
        assertEquals(254, finalFastDateFormatMLocaleHashCodeValue);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): False}
 * @utbot.executesCondition {@code (mLocaleForced): True}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_NotMTimeZoneForced() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(baseLocale, "sun.util.locale.BaseLocale", "hash", 1);
        setField(mLocale, "java.util.Locale", "baseLocale", baseLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        
        int actual = fastDateFormat.hashCode();
        
        assertEquals(257, actual);
        
        Locale fastDateFormatMLocale = ((Locale) getFieldValue(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale"));
        int finalFastDateFormatMLocaleHashCodeValue = ((Integer) getFieldValue(fastDateFormatMLocale, "java.util.Locale", "hashCodeValue"));
        
        assertEquals(1, finalFastDateFormatMLocaleHashCodeValue);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.executesCondition {@code (mLocaleForced): False}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_NotMLocaleForced_2() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(baseLocale, "sun.util.locale.BaseLocale", "language", mPattern);
        setField(baseLocale, "sun.util.locale.BaseLocale", "script", mPattern);
        String region = " ";
        setField(baseLocale, "sun.util.locale.BaseLocale", "region", region);
        setField(baseLocale, "sun.util.locale.BaseLocale", "variant", mPattern);
        setField(mLocale, "java.util.Locale", "baseLocale", baseLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        
        int actual = fastDateFormat.hashCode();
        
        assertEquals(7850176, actual);
        
        Locale fastDateFormatMLocale = ((Locale) getFieldValue(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale"));
        BaseLocale fastDateFormatMLocaleMLocaleBaseLocale = ((BaseLocale) getFieldValue(fastDateFormatMLocale, "java.util.Locale", "baseLocale"));
        int finalFastDateFormatMLocaleBaseLocaleHash = ((Integer) getFieldValue(fastDateFormatMLocaleMLocaleBaseLocale, "sun.util.locale.BaseLocale", "hash"));
        Locale fastDateFormatMLocale1 = ((Locale) getFieldValue(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale"));
        int finalFastDateFormatMLocaleHashCodeValue = ((Integer) getFieldValue(fastDateFormatMLocale1, "java.util.Locale", "hashCodeValue"));
        
        assertEquals(7849920, finalFastDateFormatMLocaleBaseLocaleHash);
        
        assertEquals(7849920, finalFastDateFormatMLocaleHashCodeValue);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#hashCode()}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: total += mPattern.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.hashCode(FastDateFormat.java:1003) */
        fastDateFormat.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#hashCode()}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: total += mTimeZone.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.hashCode(FastDateFormat.java:1004) */
        fastDateFormat.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: total += mLocale.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_2() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.hashCode(FastDateFormat.java:1006) */
        fastDateFormat.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: total += mLocale.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_3() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.hashCode(FastDateFormat.java:1006) */
        fastDateFormat.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: total += mLocale.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_4() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.hashCode] produces [java.lang.NullPointerException] */
        fastDateFormat.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.format
    
    ///region OTHER: ERROR SUITE for method format(long)
    
    @Test
    public void testFormat1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2303)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.setTimeInMillis(Calendar.java:1827)
            java.base/java.util.GregorianCalendar.<init>(GregorianCalendar.java:628)
            java.base/java.util.GregorianCalendar.<init>(GregorianCalendar.java:604)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:823)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:813) */
        fastDateFormat.format(0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.format
    
    ///region OTHER: ERROR SUITE for method format(java.util.Date)
    
    @Test
    public void testFormat2() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2303)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.setTimeInMillis(Calendar.java:1827)
            java.base/java.util.GregorianCalendar.<init>(GregorianCalendar.java:628)
            java.base/java.util.GregorianCalendar.<init>(GregorianCalendar.java:604)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:823) */
        fastDateFormat.format(((Date) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.format
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (obj instanceof Date): False}
 * @utbot.executesCondition {@code (obj instanceof Calendar): True}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.returnsFrom {@code return format((Calendar) obj, toAppendTo);}
 *  */
    @Test
    public void testFormat_ObjInstanceOfCalendar() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        StringBuffer actual = fastDateFormat.format(gregorianCalendar, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (obj instanceof Date): False}
 * @utbot.executesCondition {@code (obj instanceof Calendar): False}
 * @utbot.executesCondition {@code (obj instanceof Long): False}
 * @utbot.executesCondition {@code (obj == null): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: (obj == null ? "<null>" : obj.getClass().getName())
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormat_ThrowIllegalArgumentException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        fastDateFormat.format(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)
    
    @Test
    public void testFormat3() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        Long long1 = 0L;
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2303)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.setTimeInMillis(Calendar.java:1827)
            java.base/java.util.GregorianCalendar.<init>(GregorianCalendar.java:628)
            java.base/java.util.GregorianCalendar.<init>(GregorianCalendar.java:604)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:860)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:848)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:798) */
        fastDateFormat.format(long1, null, null);
    }
    
    @Test
    public void testFormat4() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        java.sql.Date date = new java.sql.Date(0L);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2303)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.setTimeInMillis(Calendar.java:1827)
            java.base/java.util.GregorianCalendar.<init>(GregorianCalendar.java:628)
            java.base/java.util.GregorianCalendar.<init>(GregorianCalendar.java:604)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:860)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:794) */
        fastDateFormat.format(date, null, null);
    }
    ///endregion
    
    ///region Errors report for format
    
    public void testFormat_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 119 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.format
    
    ///region OTHER: ERROR SUITE for method format(long, java.lang.StringBuffer)
    
    @Test
    public void testFormat5() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2303)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.setTimeInMillis(Calendar.java:1827)
            java.base/java.util.GregorianCalendar.<init>(GregorianCalendar.java:628)
            java.base/java.util.GregorianCalendar.<init>(GregorianCalendar.java:604)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:860)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:848) */
        fastDateFormat.format(0L, stringBuffer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.format
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method format(java.util.Calendar, java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (mTimeZoneForced): False}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.returnsFrom {@code return applyRules(calendar, buf);}
 *  */
    @Test
    public void testFormat_NotMTimeZoneForced() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        
        StringBuffer actual = fastDateFormat.format(((Calendar) null), ((StringBuffer) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method format(java.util.Calendar, java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.invokes {@link java.util.Calendar#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: calendar = (Calendar) calendar.clone();
 *  */
    @Test
    public void testFormat_ThrowNullPointerException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:875) */
        fastDateFormat.format(((Calendar) null), ((StringBuffer) null));
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.invokes {@link java.util.Calendar#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: calendar = (Calendar) calendar.clone();
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.applyRules(FastDateFormat.java:891)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:878) */
        fastDateFormat.format(gregorianCalendar, ((StringBuffer) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method format(java.util.Calendar, java.lang.StringBuffer)
    
    @Test
    public void testFormat6() throws Throwable  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
        Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        mRules[0] = unpaddedNumberField;
        mRules[1] = unpaddedNumberField;
        mRules[2] = unpaddedNumberField;
        mRules[3] = unpaddedNumberField;
        mRules[4] = unpaddedNumberField;
        mRules[5] = unpaddedNumberField;
        mRules[6] = unpaddedNumberField;
        mRules[7] = unpaddedNumberField;
        mRules[8] = unpaddedNumberField;
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        setField(japaneseImperialCalendar, "java.util.Calendar", "isTimeSet", true);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            java.base/java.util.JapaneseImperialCalendar.computeFields(JapaneseImperialCalendar.java:1587)
            java.base/java.util.JapaneseImperialCalendar.computeFields(JapaneseImperialCalendar.java:1557)
            java.base/java.util.Calendar.complete(Calendar.java:2282)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField.appendTo(FastDateFormat.java:1189)
            org.apache.commons.lang.time.FastDateFormat.applyRules(FastDateFormat.java:893)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:878) */
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class japaneseImperialCalendarType = Class.forName("java.util.Calendar");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Method formatMethod = fastDateFormatClazz.getDeclaredMethod("format", japaneseImperialCalendarType, stringBufferType);
        formatMethod.setAccessible(true);
        java.lang.Object[] formatMethodArguments = new java.lang.Object[2];
        formatMethodArguments[0] = japaneseImperialCalendar;
        formatMethodArguments[1] = ((Object) null);
        try {
            formatMethod.invoke(fastDateFormat, formatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFormat7() throws Throwable  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
        Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        mRules[0] = unpaddedNumberField;
        mRules[1] = unpaddedNumberField;
        mRules[2] = unpaddedNumberField;
        mRules[3] = unpaddedNumberField;
        mRules[4] = unpaddedNumberField;
        mRules[5] = unpaddedNumberField;
        mRules[6] = unpaddedNumberField;
        mRules[7] = unpaddedNumberField;
        mRules[8] = unpaddedNumberField;
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        setField(japaneseImperialCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(japaneseImperialCalendar, "java.util.Calendar", "areFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.getSetStateFields(Calendar.java:2312)
            java.base/java.util.JapaneseImperialCalendar.computeFields(JapaneseImperialCalendar.java:1547)
            java.base/java.util.Calendar.complete(Calendar.java:2282)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField.appendTo(FastDateFormat.java:1189)
            org.apache.commons.lang.time.FastDateFormat.applyRules(FastDateFormat.java:893)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:878) */
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class japaneseImperialCalendarType = Class.forName("java.util.Calendar");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Method formatMethod = fastDateFormatClazz.getDeclaredMethod("format", japaneseImperialCalendarType, stringBufferType);
        formatMethod.setAccessible(true);
        java.lang.Object[] formatMethodArguments = new java.lang.Object[2];
        formatMethodArguments[0] = japaneseImperialCalendar;
        formatMethodArguments[1] = ((Object) null);
        try {
            formatMethod.invoke(fastDateFormat, formatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for format
    
    public void testFormat_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 103 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.format
    
    ///region Errors report for format
    
    public void testFormat_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.format
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method format(java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#format(java.util.Calendar)}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return format(calendar, new StringBuffer(mMaxLengthEstimate)).toString();
 *  */
    @Test
    public void testFormat_ThrowNegativeArraySizeException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", -255);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NegativeArraySizeException: -255]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuffer.<init>(StringBuffer.java:146)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:835) */
        fastDateFormat.format(((Calendar) gregorianCalendar));
    }
    ///endregion
    
    ///region Errors report for format
    
    public void testFormat_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 101 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getInstance
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInstance()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance()}
     */
    @Test
    public void testGetInstance() throws Exception  {
        FastDateFormat actual = FastDateFormat.getInstance();
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String cDefaultPattern = "d/M/yy HH:mm";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        HashMap cInstanceCache = new HashMap();
        cInstanceCache.put(expected, expected);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        HashMap cDateInstanceCache = new HashMap();
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        HashMap cTimeInstanceCache = new HashMap();
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        HashMap cDateTimeInstanceCache = new HashMap();
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        HashMap cTimeZoneDisplayCache = new HashMap();
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", cDefaultPattern);
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
        Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
        mRules[0] = unpaddedNumberField;
        Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules[1] = characterLiteral;
        Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
        mRules[2] = unpaddedMonthField;
        Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules[3] = characterLiteral1;
        Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
        mRules[4] = twoDigitYearField;
        Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
        mRules[5] = characterLiteral2;
        Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
        mRules[6] = twoDigitNumberField;
        Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
        mRules[7] = characterLiteral3;
        Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
        mRules[8] = twoDigitNumberField1;
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
        
        // org.apache.commons.lang.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance()}
     */
    @Test
    public void testGetInstance1() throws Exception  {
        FastDateFormat actual = FastDateFormat.getInstance();
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String cDefaultPattern = "d/M/yy HH:mm";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        HashMap cInstanceCache = new HashMap();
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        HashMap cDateInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        HashMap cTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        HashMap cDateTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        HashMap cTimeZoneDisplayCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern = "\n\r\t";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\r\t";
        setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
        mRules[0] = stringLiteral;
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat, fastDateFormat);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern1 = "\n\t\r";
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules1 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\n\t\r";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules1[0] = stringLiteral1;
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat1, fastDateFormat1);
        cInstanceCache.put(expected, expected);
        FastDateFormat fastDateFormat2 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern2 = "\r\n\t";
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
        SimpleTimeZone mTimeZone2 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue2 = "\r\n\t";
        setField(stringLiteral2, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue2);
        mRules2[0] = stringLiteral2;
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat2, fastDateFormat2);
        FastDateFormat fastDateFormat3 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern3 = "\u0014\n\t\r";
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern3);
        ZoneInfo mTimeZone3 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
        Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
        java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue3 = "\u0014\n\t\r";
        setField(stringLiteral3, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue3);
        mRules3[0] = stringLiteral3;
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
        cInstanceCache.put(fastDateFormat3, fastDateFormat3);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", cDefaultPattern);
        ZoneInfo mTimeZone4 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone4);
        Locale mLocale4 = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale4);
        java.lang.Object[] mRules4 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
        Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
        mRules4[0] = unpaddedNumberField;
        Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules4[1] = characterLiteral;
        Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
        mRules4[2] = unpaddedMonthField;
        Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules4[3] = characterLiteral1;
        Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
        mRules4[4] = twoDigitYearField;
        Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
        mRules4[5] = characterLiteral2;
        Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
        mRules4[6] = twoDigitNumberField;
        Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
        mRules4[7] = characterLiteral3;
        Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
        mRules4[8] = twoDigitNumberField1;
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules4);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
        
        // org.apache.commons.lang.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getInstance()
    
    @Test
    public void testGetInstance2() throws Exception  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        String prevCDefaultPattern = ((String) getStaticFieldValue(fastDateFormatClazz, "cDefaultPattern"));
        try {
            setStaticField(fastDateFormatClazz, "cDefaultPattern", null);
            
            FastDateFormat actual = FastDateFormat.getInstance();
            
            FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            String cDefaultPattern = "d/M/yy HH:mm";
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            HashMap cInstanceCache = new HashMap();
            FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            HashMap cDateInstanceCache = new HashMap();
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            HashMap cTimeInstanceCache = new HashMap();
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            HashMap cDateTimeInstanceCache = new HashMap();
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            HashMap cTimeZoneDisplayCache = new HashMap();
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern = "\n\r\t";
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
            SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
            Locale mLocale = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
            java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
            Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
            String mValue = "\n\r\t";
            setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
            mRules[0] = stringLiteral;
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
            cInstanceCache.put(fastDateFormat, fastDateFormat);
            FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern1 = "";
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
            ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
            Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
            java.lang.Object[] mRules1 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules1);
            cInstanceCache.put(fastDateFormat1, fastDateFormat1);
            FastDateFormat fastDateFormat2 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern2 = "\n\t\r";
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
            ZoneInfo mTimeZone2 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
            Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
            java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
            Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
            String mValue1 = "\n\t\r";
            setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
            mRules2[0] = stringLiteral1;
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
            cInstanceCache.put(fastDateFormat2, fastDateFormat2);
            FastDateFormat fastDateFormat3 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern3 = "\r\n\t";
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern3);
            SimpleTimeZone mTimeZone3 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
            Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
            java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
            Object stringLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
            String mValue2 = "\r\n\t";
            setField(stringLiteral2, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue2);
            mRules3[0] = stringLiteral2;
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
            cInstanceCache.put(fastDateFormat3, fastDateFormat3);
            FastDateFormat fastDateFormat4 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern4 = "";
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern4);
            SimpleTimeZone mTimeZone4 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone4);
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
            Locale mLocale4 = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale4);
            java.lang.Object[] mRules4 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules4);
            cInstanceCache.put(fastDateFormat4, fastDateFormat4);
            FastDateFormat fastDateFormat5 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern5 = "\t\r\n";
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern5);
            SimpleTimeZone mTimeZone5 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone5);
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
            Locale mLocale5 = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale5);
            java.lang.Object[] mRules5 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
            Object stringLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
            String mValue3 = "\t\r\n";
            setField(stringLiteral3, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue3);
            mRules5[0] = stringLiteral3;
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules5);
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
            cInstanceCache.put(fastDateFormat5, fastDateFormat5);
            cInstanceCache.put(expected, expected);
            FastDateFormat fastDateFormat6 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern6 = "\u0014\n\t\r";
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern6);
            ZoneInfo mTimeZone6 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone6);
            Locale mLocale6 = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale6);
            java.lang.Object[] mRules6 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
            Object stringLiteral4 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
            String mValue4 = "\u0014\n\t\r";
            setField(stringLiteral4, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue4);
            mRules6[0] = stringLiteral4;
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules6);
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
            cInstanceCache.put(fastDateFormat6, fastDateFormat6);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern7 = "d/M/yy HH:mm";
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern7);
            ZoneInfo mTimeZone7 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone7);
            Locale mLocale7 = ((Locale) createInstance("java.util.Locale"));
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale7);
            java.lang.Object[] mRules7 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
            Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
            setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
            mRules7[0] = unpaddedNumberField;
            Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
            setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
            mRules7[1] = characterLiteral;
            Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
            mRules7[2] = unpaddedMonthField;
            Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
            setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
            mRules7[3] = characterLiteral1;
            Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
            mRules7[4] = twoDigitYearField;
            Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
            setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
            mRules7[5] = characterLiteral2;
            Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
            setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
            mRules7[6] = twoDigitNumberField;
            Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
            setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
            mRules7[7] = characterLiteral3;
            Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
            setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
            mRules7[8] = twoDigitNumberField1;
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules7);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
            
            // org.apache.commons.lang.time.FastDateFormat has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(FastDateFormat.class, "cDefaultPattern", prevCDefaultPattern);
        }
    }
    
    @Test
    public void testGetInstance3() throws Exception  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        String prevCDefaultPattern = ((String) getStaticFieldValue(fastDateFormatClazz, "cDefaultPattern"));
        try {
            String cDefaultPattern = "";
            setStaticField(fastDateFormatClazz, "cDefaultPattern", cDefaultPattern);
            
            FastDateFormat actual = FastDateFormat.getInstance();
            
            FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            HashMap cInstanceCache = new HashMap();
            FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            HashMap cDateInstanceCache = new HashMap();
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            HashMap cTimeInstanceCache = new HashMap();
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            HashMap cDateTimeInstanceCache = new HashMap();
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            HashMap cTimeZoneDisplayCache = new HashMap();
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern = "\n\r\t";
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
            SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
            Locale mLocale = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
            java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
            Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
            String mValue = "\n\r\t";
            setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
            mRules[0] = stringLiteral;
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
            cInstanceCache.put(fastDateFormat, fastDateFormat);
            cInstanceCache.put(expected, expected);
            FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern1 = "\n\t\r";
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
            ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
            Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
            java.lang.Object[] mRules1 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
            Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
            String mValue1 = "\n\t\r";
            setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
            mRules1[0] = stringLiteral1;
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules1);
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
            cInstanceCache.put(fastDateFormat1, fastDateFormat1);
            FastDateFormat fastDateFormat2 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern2 = "\r\n\t";
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
            SimpleTimeZone mTimeZone2 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
            Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
            java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
            Object stringLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
            String mValue2 = "\r\n\t";
            setField(stringLiteral2, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue2);
            mRules2[0] = stringLiteral2;
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
            cInstanceCache.put(fastDateFormat2, fastDateFormat2);
            FastDateFormat fastDateFormat3 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern3 = "";
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern3);
            SimpleTimeZone mTimeZone3 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
            Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
            java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
            setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
            cInstanceCache.put(fastDateFormat3, fastDateFormat3);
            FastDateFormat fastDateFormat4 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern4 = "\t\r\n";
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern4);
            SimpleTimeZone mTimeZone4 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone4);
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
            Locale mLocale4 = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale4);
            java.lang.Object[] mRules4 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
            Object stringLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
            String mValue3 = "\t\r\n";
            setField(stringLiteral3, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue3);
            mRules4[0] = stringLiteral3;
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules4);
            setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
            cInstanceCache.put(fastDateFormat4, fastDateFormat4);
            FastDateFormat fastDateFormat5 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern5 = "d/M/yy HH:mm";
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern5);
            ZoneInfo mTimeZone5 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone5);
            Locale mLocale5 = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale5);
            java.lang.Object[] mRules5 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
            Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
            setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
            mRules5[0] = unpaddedNumberField;
            Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
            setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
            mRules5[1] = characterLiteral;
            Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
            mRules5[2] = unpaddedMonthField;
            Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
            setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
            mRules5[3] = characterLiteral1;
            Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
            mRules5[4] = twoDigitYearField;
            Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
            setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
            mRules5[5] = characterLiteral2;
            Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
            setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
            mRules5[6] = twoDigitNumberField;
            Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
            setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
            mRules5[7] = characterLiteral3;
            Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
            setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
            mRules5[8] = twoDigitNumberField1;
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules5);
            setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
            cInstanceCache.put(fastDateFormat5, fastDateFormat5);
            FastDateFormat fastDateFormat6 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern6 = "\u0014\n\t\r";
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern6);
            ZoneInfo mTimeZone6 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone6);
            Locale mLocale6 = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale6);
            java.lang.Object[] mRules6 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
            Object stringLiteral4 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
            String mValue4 = "\u0014\n\t\r";
            setField(stringLiteral4, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue4);
            mRules6[0] = stringLiteral4;
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules6);
            setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
            cInstanceCache.put(fastDateFormat6, fastDateFormat6);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern7 = "";
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern7);
            ZoneInfo mTimeZone7 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone7);
            Locale mLocale7 = ((Locale) createInstance("java.util.Locale"));
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale7);
            java.lang.Object[] mRules7 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules7);
            
            // org.apache.commons.lang.time.FastDateFormat has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(FastDateFormat.class, "cDefaultPattern", prevCDefaultPattern);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 *  */
    @Test
    public void testGetInstance4() throws Exception  {
        String string = "";
        
        FastDateFormat actual = FastDateFormat.getInstance(string, null, null);
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String cDefaultPattern = "d/M/yy HH:mm";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        HashMap cInstanceCache = new HashMap();
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        HashMap cDateInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        HashMap cTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        HashMap cDateTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        HashMap cTimeZoneDisplayCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern = "\n\r\t";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\r\t";
        setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
        mRules[0] = stringLiteral;
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat, fastDateFormat);
        cInstanceCache.put(expected, expected);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern1 = "\n\t\r";
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules1 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\n\t\r";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules1[0] = stringLiteral1;
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat1, fastDateFormat1);
        FastDateFormat fastDateFormat2 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern2 = "\r\n\t";
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
        SimpleTimeZone mTimeZone2 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue2 = "\r\n\t";
        setField(stringLiteral2, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue2);
        mRules2[0] = stringLiteral2;
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat2, fastDateFormat2);
        FastDateFormat fastDateFormat3 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern3 = "\t\r\n";
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern3);
        SimpleTimeZone mTimeZone3 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
        java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue3 = "\t\r\n";
        setField(stringLiteral3, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue3);
        mRules3[0] = stringLiteral3;
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat3, fastDateFormat3);
        FastDateFormat fastDateFormat4 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mPattern", cDefaultPattern);
        ZoneInfo mTimeZone4 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone4);
        Locale mLocale4 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale4);
        java.lang.Object[] mRules4 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
        Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
        mRules4[0] = unpaddedNumberField;
        Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules4[1] = characterLiteral;
        Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
        mRules4[2] = unpaddedMonthField;
        Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules4[3] = characterLiteral1;
        Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
        mRules4[4] = twoDigitYearField;
        Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
        mRules4[5] = characterLiteral2;
        Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
        mRules4[6] = twoDigitNumberField;
        Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
        mRules4[7] = characterLiteral3;
        Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
        mRules4[8] = twoDigitNumberField1;
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules4);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
        cInstanceCache.put(fastDateFormat4, fastDateFormat4);
        FastDateFormat fastDateFormat5 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern4 = "\u0014\n\t\r";
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern4);
        ZoneInfo mTimeZone5 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone5);
        Locale mLocale5 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale5);
        java.lang.Object[] mRules5 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral4 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue4 = "\u0014\n\t\r";
        setField(stringLiteral4, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue4);
        mRules5[0] = stringLiteral4;
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules5);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
        cInstanceCache.put(fastDateFormat5, fastDateFormat5);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern5 = "";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern5);
        ZoneInfo mTimeZone6 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone6);
        Locale mLocale6 = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale6);
        java.lang.Object[] mRules6 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules6);
        
        // org.apache.commons.lang.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: FastDateFormat emptyFormat = new FastDateFormat(pattern, timeZone, locale);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_ThrowIllegalArgumentException() {
        FastDateFormat.getInstance(null, null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
     */
    @Test
    public void testGetInstanceWithBlankString() throws Exception  {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(-1, "XZ");
        simpleTimeZone.setID("-3");
        simpleTimeZone.setRawOffset(-1);
        Locale locale = new Locale("10", "10", "");
        
        FastDateFormat actual = FastDateFormat.getInstance("\n\r\t", simpleTimeZone, locale);
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String cDefaultPattern = "d/M/yy HH:mm";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        HashMap cInstanceCache = new HashMap();
        cInstanceCache.put(expected, expected);
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        HashMap cDateInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        HashMap cTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        HashMap cDateTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        HashMap cTimeZoneDisplayCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", cDefaultPattern);
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
        Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
        mRules[0] = unpaddedNumberField;
        Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules[1] = characterLiteral;
        Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
        mRules[2] = unpaddedMonthField;
        Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules[3] = characterLiteral1;
        Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
        mRules[4] = twoDigitYearField;
        Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
        mRules[5] = characterLiteral2;
        Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
        mRules[6] = twoDigitNumberField;
        Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
        mRules[7] = characterLiteral3;
        Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
        mRules[8] = twoDigitNumberField1;
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
        cInstanceCache.put(fastDateFormat, fastDateFormat);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern = "\n\r\t";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone1 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        mTimeZone1.setRawOffset(-1);
        byte[] monthLength = new byte[12];
        monthLength[0] = (byte) 31;
        monthLength[1] = (byte) 28;
        monthLength[2] = (byte) 31;
        monthLength[3] = (byte) 30;
        monthLength[4] = (byte) 31;
        monthLength[5] = (byte) 30;
        monthLength[6] = (byte) 31;
        monthLength[7] = (byte) 31;
        monthLength[8] = (byte) 30;
        monthLength[9] = (byte) 31;
        monthLength[10] = (byte) 30;
        monthLength[11] = (byte) 31;
        setField(mTimeZone1, "java.util.SimpleTimeZone", "monthLength", monthLength);
        setField(mTimeZone1, "java.util.SimpleTimeZone", "dstSavings", 3600000);
        setField(mTimeZone1, "java.util.SimpleTimeZone", "serialVersionOnStream", 2);
        String id = "-3";
        mTimeZone1.setID(id);
        ZoneInfo defaultTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(mTimeZone1, "java.util.TimeZone", "defaultTimeZone", defaultTimeZone);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(mLocale1, "java.util.Locale", "baseLocale", baseLocale);
        setField(mLocale1, "java.util.Locale", "hashCodeValue", 46731074);
        Locale defaultLocale = ((Locale) createInstance("java.util.Locale"));
        setField(mLocale1, "java.util.Locale", "defaultLocale", defaultLocale);
        Locale defaultFormatLocale = ((Locale) createInstance("java.util.Locale"));
        setField(mLocale1, "java.util.Locale", "defaultFormatLocale", defaultFormatLocale);
        String languageTag = "und";
        setField(mLocale1, "java.util.Locale", "languageTag", languageTag);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules1 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\r\t";
        setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
        mRules1[0] = stringLiteral;
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules1);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        
        // org.apache.commons.lang.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)
    
    @Test
    public void testGetInstance5() throws Exception  {
        String string = "";
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        
        FastDateFormat actual = FastDateFormat.getInstance(string, simpleTimeZone, null);
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String cDefaultPattern = "d/M/yy HH:mm";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        HashMap cInstanceCache = new HashMap();
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        HashMap cDateInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        HashMap cTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        HashMap cDateTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        HashMap cTimeZoneDisplayCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern = "\n\r\t";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\r\t";
        setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
        mRules[0] = stringLiteral;
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat, fastDateFormat);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern1 = "";
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
        java.lang.Object[] mRules1 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules1);
        cInstanceCache.put(fastDateFormat1, fastDateFormat1);
        FastDateFormat fastDateFormat2 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern2 = "\n\t\r";
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
        ZoneInfo mTimeZone2 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\n\t\r";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules2[0] = stringLiteral1;
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat2, fastDateFormat2);
        FastDateFormat fastDateFormat3 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern3 = "\r\n\t";
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern3);
        SimpleTimeZone mTimeZone3 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
        java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue2 = "\r\n\t";
        setField(stringLiteral2, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue2);
        mRules3[0] = stringLiteral2;
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat3, fastDateFormat3);
        cInstanceCache.put(expected, expected);
        FastDateFormat fastDateFormat4 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern4 = "\t\r\n";
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern4);
        SimpleTimeZone mTimeZone4 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone4);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale4 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale4);
        java.lang.Object[] mRules4 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue3 = "\t\r\n";
        setField(stringLiteral3, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue3);
        mRules4[0] = stringLiteral3;
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules4);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat4, fastDateFormat4);
        FastDateFormat fastDateFormat5 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mPattern", cDefaultPattern);
        ZoneInfo mTimeZone5 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone5);
        Locale mLocale5 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale5);
        java.lang.Object[] mRules5 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
        Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
        mRules5[0] = unpaddedNumberField;
        Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules5[1] = characterLiteral;
        Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
        mRules5[2] = unpaddedMonthField;
        Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules5[3] = characterLiteral1;
        Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
        mRules5[4] = twoDigitYearField;
        Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
        mRules5[5] = characterLiteral2;
        Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
        mRules5[6] = twoDigitNumberField;
        Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
        mRules5[7] = characterLiteral3;
        Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
        mRules5[8] = twoDigitNumberField1;
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules5);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
        cInstanceCache.put(fastDateFormat5, fastDateFormat5);
        FastDateFormat fastDateFormat6 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern5 = "\u0014\n\t\r";
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern5);
        ZoneInfo mTimeZone6 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone6);
        Locale mLocale6 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale6);
        java.lang.Object[] mRules6 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral4 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue4 = "\u0014\n\t\r";
        setField(stringLiteral4, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue4);
        mRules6[0] = stringLiteral4;
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules6);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
        cInstanceCache.put(fastDateFormat6, fastDateFormat6);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", string);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", simpleTimeZone);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale7 = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale7);
        java.lang.Object[] mRules7 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules7);
        
        // org.apache.commons.lang.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String, java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone)}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 *  */
    @Test
    public void testGetInstance_FastDateFormatGetInstance() throws Exception  {
        String string = "";
        
        FastDateFormat actual = FastDateFormat.getInstance(string, ((TimeZone) null));
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String cDefaultPattern = "d/M/yy HH:mm";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        HashMap cInstanceCache = new HashMap();
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        HashMap cDateInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        HashMap cTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        HashMap cDateTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        HashMap cTimeZoneDisplayCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern = "\n\r\t";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\r\t";
        setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
        mRules[0] = stringLiteral;
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat, fastDateFormat);
        cInstanceCache.put(expected, expected);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern1 = "\n\t\r";
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules1 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\n\t\r";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules1[0] = stringLiteral1;
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat1, fastDateFormat1);
        FastDateFormat fastDateFormat2 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern2 = "\r\n\t";
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
        SimpleTimeZone mTimeZone2 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue2 = "\r\n\t";
        setField(stringLiteral2, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue2);
        mRules2[0] = stringLiteral2;
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat2, fastDateFormat2);
        FastDateFormat fastDateFormat3 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern3 = "";
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern3);
        SimpleTimeZone mTimeZone3 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
        java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
        cInstanceCache.put(fastDateFormat3, fastDateFormat3);
        FastDateFormat fastDateFormat4 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern4 = "\t\r\n";
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern4);
        SimpleTimeZone mTimeZone4 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone4);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale4 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale4);
        java.lang.Object[] mRules4 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue3 = "\t\r\n";
        setField(stringLiteral3, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue3);
        mRules4[0] = stringLiteral3;
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules4);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat4, fastDateFormat4);
        FastDateFormat fastDateFormat5 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mPattern", cDefaultPattern);
        ZoneInfo mTimeZone5 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone5);
        Locale mLocale5 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale5);
        java.lang.Object[] mRules5 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
        Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
        mRules5[0] = unpaddedNumberField;
        Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules5[1] = characterLiteral;
        Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
        mRules5[2] = unpaddedMonthField;
        Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules5[3] = characterLiteral1;
        Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
        mRules5[4] = twoDigitYearField;
        Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
        mRules5[5] = characterLiteral2;
        Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
        mRules5[6] = twoDigitNumberField;
        Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
        mRules5[7] = characterLiteral3;
        Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
        mRules5[8] = twoDigitNumberField1;
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules5);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
        cInstanceCache.put(fastDateFormat5, fastDateFormat5);
        FastDateFormat fastDateFormat6 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern5 = "\u0014\n\t\r";
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern5);
        ZoneInfo mTimeZone6 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone6);
        Locale mLocale6 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale6);
        java.lang.Object[] mRules6 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral4 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue4 = "\u0014\n\t\r";
        setField(stringLiteral4, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue4);
        mRules6[0] = stringLiteral4;
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules6);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
        cInstanceCache.put(fastDateFormat6, fastDateFormat6);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern6 = "";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern6);
        ZoneInfo mTimeZone7 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone7);
        Locale mLocale7 = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale7);
        java.lang.Object[] mRules7 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules7);
        
        // org.apache.commons.lang.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInstance(java.lang.String, java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone)}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getInstance(pattern, timeZone, null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_ThrowIllegalArgumentException1() {
        FastDateFormat.getInstance(((String) null), ((TimeZone) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String, java.util.TimeZone)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone)}
     */
    @Test
    public void testGetInstanceWithBlankString1() throws Exception  {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(-1, "XZ");
        simpleTimeZone.setID("-3");
        simpleTimeZone.setRawOffset(-1);
        
        FastDateFormat actual = FastDateFormat.getInstance("\r\n\t", simpleTimeZone);
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String cDefaultPattern = "d/M/yy HH:mm";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        HashMap cInstanceCache = new HashMap();
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        HashMap cDateInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        HashMap cTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        HashMap cDateTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        HashMap cTimeZoneDisplayCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern = "\n\r\t";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\r\t";
        setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
        mRules[0] = stringLiteral;
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat, fastDateFormat);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", cDefaultPattern);
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
        java.lang.Object[] mRules1 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
        Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
        mRules1[0] = unpaddedNumberField;
        Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules1[1] = characterLiteral;
        Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
        mRules1[2] = unpaddedMonthField;
        Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules1[3] = characterLiteral1;
        Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
        mRules1[4] = twoDigitYearField;
        Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
        mRules1[5] = characterLiteral2;
        Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
        mRules1[6] = twoDigitNumberField;
        Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
        mRules1[7] = characterLiteral3;
        Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
        mRules1[8] = twoDigitNumberField1;
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
        cInstanceCache.put(fastDateFormat1, fastDateFormat1);
        cInstanceCache.put(expected, expected);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern1 = "\r\n\t";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        SimpleTimeZone mTimeZone2 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        mTimeZone2.setRawOffset(-1);
        byte[] monthLength = new byte[12];
        monthLength[0] = (byte) 31;
        monthLength[1] = (byte) 28;
        monthLength[2] = (byte) 31;
        monthLength[3] = (byte) 30;
        monthLength[4] = (byte) 31;
        monthLength[5] = (byte) 30;
        monthLength[6] = (byte) 31;
        monthLength[7] = (byte) 31;
        monthLength[8] = (byte) 30;
        monthLength[9] = (byte) 31;
        monthLength[10] = (byte) 30;
        monthLength[11] = (byte) 31;
        setField(mTimeZone2, "java.util.SimpleTimeZone", "monthLength", monthLength);
        setField(mTimeZone2, "java.util.SimpleTimeZone", "dstSavings", 3600000);
        setField(mTimeZone2, "java.util.SimpleTimeZone", "serialVersionOnStream", 2);
        String id = "-3";
        mTimeZone2.setID(id);
        ZoneInfo defaultTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(mTimeZone2, "java.util.TimeZone", "defaultTimeZone", defaultTimeZone);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\r\n\t";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules2[0] = stringLiteral1;
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        
        // org.apache.commons.lang.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 *  */
    @Test
    public void testGetInstance_FastDateFormatGetInstance1() throws Exception  {
        String string = "";
        
        FastDateFormat actual = FastDateFormat.getInstance(string);
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String cDefaultPattern = "d/M/yy HH:mm";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        HashMap cInstanceCache = new HashMap();
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        HashMap cDateInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        HashMap cTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        HashMap cDateTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        HashMap cTimeZoneDisplayCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern = "\n\r\t";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\r\t";
        setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
        mRules[0] = stringLiteral;
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat, fastDateFormat);
        cInstanceCache.put(expected, expected);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern1 = "\n\t\r";
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules1 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\n\t\r";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules1[0] = stringLiteral1;
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat1, fastDateFormat1);
        FastDateFormat fastDateFormat2 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern2 = "\r\n\t";
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
        SimpleTimeZone mTimeZone2 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue2 = "\r\n\t";
        setField(stringLiteral2, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue2);
        mRules2[0] = stringLiteral2;
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat2, fastDateFormat2);
        FastDateFormat fastDateFormat3 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern3 = "";
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern3);
        SimpleTimeZone mTimeZone3 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
        java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
        cInstanceCache.put(fastDateFormat3, fastDateFormat3);
        FastDateFormat fastDateFormat4 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern4 = "\t\r\n";
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern4);
        SimpleTimeZone mTimeZone4 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone4);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale4 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale4);
        java.lang.Object[] mRules4 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue3 = "\t\r\n";
        setField(stringLiteral3, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue3);
        mRules4[0] = stringLiteral3;
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules4);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat4, fastDateFormat4);
        FastDateFormat fastDateFormat5 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mPattern", cDefaultPattern);
        ZoneInfo mTimeZone5 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone5);
        Locale mLocale5 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale5);
        java.lang.Object[] mRules5 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
        Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
        mRules5[0] = unpaddedNumberField;
        Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules5[1] = characterLiteral;
        Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
        mRules5[2] = unpaddedMonthField;
        Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules5[3] = characterLiteral1;
        Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
        mRules5[4] = twoDigitYearField;
        Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
        mRules5[5] = characterLiteral2;
        Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
        mRules5[6] = twoDigitNumberField;
        Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
        mRules5[7] = characterLiteral3;
        Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
        mRules5[8] = twoDigitNumberField1;
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules5);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
        cInstanceCache.put(fastDateFormat5, fastDateFormat5);
        FastDateFormat fastDateFormat6 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern5 = "\u0014\n\t\r";
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern5);
        ZoneInfo mTimeZone6 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone6);
        Locale mLocale6 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale6);
        java.lang.Object[] mRules6 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral4 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue4 = "\u0014\n\t\r";
        setField(stringLiteral4, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue4);
        mRules6[0] = stringLiteral4;
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules6);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
        cInstanceCache.put(fastDateFormat6, fastDateFormat6);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern6 = "";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern6);
        ZoneInfo mTimeZone7 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone7);
        Locale mLocale7 = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale7);
        java.lang.Object[] mRules7 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules7);
        
        // org.apache.commons.lang.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInstance(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getInstance(pattern, null, null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_ThrowIllegalArgumentException2() {
        FastDateFormat.getInstance(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String)}
     */
    @Test
    public void testGetInstanceWithNonEmptyString() throws Exception  {
        FastDateFormat actual = FastDateFormat.getInstance("\u0014\n\t\r");
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String cDefaultPattern = "d/M/yy HH:mm";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        HashMap cInstanceCache = new HashMap();
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        HashMap cDateInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        HashMap cTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        HashMap cDateTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        HashMap cTimeZoneDisplayCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern = "\n\r\t";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\r\t";
        setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
        mRules[0] = stringLiteral;
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat, fastDateFormat);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", cDefaultPattern);
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
        java.lang.Object[] mRules1 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
        Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
        mRules1[0] = unpaddedNumberField;
        Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules1[1] = characterLiteral;
        Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
        mRules1[2] = unpaddedMonthField;
        Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules1[3] = characterLiteral1;
        Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
        mRules1[4] = twoDigitYearField;
        Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
        mRules1[5] = characterLiteral2;
        Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
        mRules1[6] = twoDigitNumberField;
        Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
        mRules1[7] = characterLiteral3;
        Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
        mRules1[8] = twoDigitNumberField1;
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
        cInstanceCache.put(fastDateFormat1, fastDateFormat1);
        FastDateFormat fastDateFormat2 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern1 = "\r\n\t";
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        SimpleTimeZone mTimeZone2 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\r\n\t";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules2[0] = stringLiteral1;
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat2, fastDateFormat2);
        cInstanceCache.put(expected, expected);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern2 = "\u0014\n\t\r";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
        ZoneInfo mTimeZone3 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
        Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
        java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue2 = "\u0014\n\t\r";
        setField(stringLiteral2, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue2);
        mRules3[0] = stringLiteral2;
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
        
        // org.apache.commons.lang.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String)}
     */
    @Test
    public void testGetInstanceWithEmptyString() throws Exception  {
        FastDateFormat actual = FastDateFormat.getInstance("");
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String cDefaultPattern = "d/M/yy HH:mm";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        HashMap cInstanceCache = new HashMap();
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        HashMap cDateInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        HashMap cTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        HashMap cDateTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        HashMap cTimeZoneDisplayCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern = "\n\r\t";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\r\t";
        setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
        mRules[0] = stringLiteral;
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat, fastDateFormat);
        cInstanceCache.put(expected, expected);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern1 = "\n\t\r";
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules1 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\n\t\r";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules1[0] = stringLiteral1;
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat1, fastDateFormat1);
        FastDateFormat fastDateFormat2 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern2 = "\r\n\t";
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
        SimpleTimeZone mTimeZone2 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue2 = "\r\n\t";
        setField(stringLiteral2, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue2);
        mRules2[0] = stringLiteral2;
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat2, fastDateFormat2);
        FastDateFormat fastDateFormat3 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern3 = "\t\r\n";
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern3);
        SimpleTimeZone mTimeZone3 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
        java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue3 = "\t\r\n";
        setField(stringLiteral3, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue3);
        mRules3[0] = stringLiteral3;
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat3, fastDateFormat3);
        FastDateFormat fastDateFormat4 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mPattern", cDefaultPattern);
        ZoneInfo mTimeZone4 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone4);
        Locale mLocale4 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale4);
        java.lang.Object[] mRules4 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
        Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
        mRules4[0] = unpaddedNumberField;
        Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules4[1] = characterLiteral;
        Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
        mRules4[2] = unpaddedMonthField;
        Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules4[3] = characterLiteral1;
        Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
        mRules4[4] = twoDigitYearField;
        Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
        mRules4[5] = characterLiteral2;
        Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
        mRules4[6] = twoDigitNumberField;
        Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
        mRules4[7] = characterLiteral3;
        Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
        mRules4[8] = twoDigitNumberField1;
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules4);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
        cInstanceCache.put(fastDateFormat4, fastDateFormat4);
        FastDateFormat fastDateFormat5 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern4 = "\u0014\n\t\r";
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern4);
        ZoneInfo mTimeZone5 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone5);
        Locale mLocale5 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale5);
        java.lang.Object[] mRules5 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral4 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue4 = "\u0014\n\t\r";
        setField(stringLiteral4, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue4);
        mRules5[0] = stringLiteral4;
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules5);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
        cInstanceCache.put(fastDateFormat5, fastDateFormat5);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern5 = "";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern5);
        ZoneInfo mTimeZone6 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone6);
        Locale mLocale6 = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale6);
        java.lang.Object[] mRules6 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules6);
        
        // org.apache.commons.lang.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.Locale)}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 *  */
    @Test
    public void testGetInstance_FastDateFormatGetInstance2() throws Exception  {
        String string = "";
        
        FastDateFormat actual = FastDateFormat.getInstance(string, ((Locale) null));
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String cDefaultPattern = "d/M/yy HH:mm";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        HashMap cInstanceCache = new HashMap();
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        HashMap cDateInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        HashMap cTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        HashMap cDateTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        HashMap cTimeZoneDisplayCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern = "\n\r\t";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\r\t";
        setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
        mRules[0] = stringLiteral;
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat, fastDateFormat);
        cInstanceCache.put(expected, expected);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern1 = "\n\t\r";
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules1 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\n\t\r";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules1[0] = stringLiteral1;
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat1, fastDateFormat1);
        FastDateFormat fastDateFormat2 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern2 = "\r\n\t";
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
        SimpleTimeZone mTimeZone2 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue2 = "\r\n\t";
        setField(stringLiteral2, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue2);
        mRules2[0] = stringLiteral2;
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat2, fastDateFormat2);
        FastDateFormat fastDateFormat3 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern3 = "";
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern3);
        SimpleTimeZone mTimeZone3 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
        java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
        cInstanceCache.put(fastDateFormat3, fastDateFormat3);
        FastDateFormat fastDateFormat4 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern4 = "\t\r\n";
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern4);
        SimpleTimeZone mTimeZone4 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone4);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale4 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale4);
        java.lang.Object[] mRules4 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue3 = "\t\r\n";
        setField(stringLiteral3, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue3);
        mRules4[0] = stringLiteral3;
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules4);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat4, fastDateFormat4);
        FastDateFormat fastDateFormat5 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mPattern", cDefaultPattern);
        ZoneInfo mTimeZone5 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone5);
        Locale mLocale5 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale5);
        java.lang.Object[] mRules5 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
        Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
        mRules5[0] = unpaddedNumberField;
        Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules5[1] = characterLiteral;
        Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
        mRules5[2] = unpaddedMonthField;
        Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules5[3] = characterLiteral1;
        Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
        mRules5[4] = twoDigitYearField;
        Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
        mRules5[5] = characterLiteral2;
        Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
        mRules5[6] = twoDigitNumberField;
        Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
        mRules5[7] = characterLiteral3;
        Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
        mRules5[8] = twoDigitNumberField1;
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules5);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
        cInstanceCache.put(fastDateFormat5, fastDateFormat5);
        FastDateFormat fastDateFormat6 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern5 = "\u0014\n\t\r";
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern5);
        ZoneInfo mTimeZone6 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone6);
        Locale mLocale6 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale6);
        java.lang.Object[] mRules6 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral4 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue4 = "\u0014\n\t\r";
        setField(stringLiteral4, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue4);
        mRules6[0] = stringLiteral4;
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules6);
        setField(fastDateFormat6, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
        cInstanceCache.put(fastDateFormat6, fastDateFormat6);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern6 = "";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern6);
        ZoneInfo mTimeZone7 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone7);
        Locale mLocale7 = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale7);
        java.lang.Object[] mRules7 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules7);
        
        // org.apache.commons.lang.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInstance(java.lang.String, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.Locale)}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getInstance(pattern, null, locale);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_ThrowIllegalArgumentException3() {
        FastDateFormat.getInstance(((String) null), ((Locale) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.Locale)}
     */
    @Test
    public void testGetInstanceWithBlankString2() throws Exception  {
        Locale locale = new Locale("", "XZ", "-3");
        
        FastDateFormat actual = FastDateFormat.getInstance("\n\t\r", locale);
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String cDefaultPattern = "d/M/yy HH:mm";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        HashMap cInstanceCache = new HashMap();
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        HashMap cDateInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        HashMap cTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        HashMap cDateTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        HashMap cTimeZoneDisplayCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern = "\n\r\t";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\r\t";
        setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
        mRules[0] = stringLiteral;
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat, fastDateFormat);
        cInstanceCache.put(expected, expected);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", cDefaultPattern);
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
        java.lang.Object[] mRules1 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
        Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
        mRules1[0] = unpaddedNumberField;
        Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules1[1] = characterLiteral;
        Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
        mRules1[2] = unpaddedMonthField;
        Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules1[3] = characterLiteral1;
        Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
        mRules1[4] = twoDigitYearField;
        Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
        mRules1[5] = characterLiteral2;
        Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
        mRules1[6] = twoDigitNumberField;
        Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
        mRules1[7] = characterLiteral3;
        Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
        mRules1[8] = twoDigitNumberField1;
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules1);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
        cInstanceCache.put(fastDateFormat1, fastDateFormat1);
        FastDateFormat fastDateFormat2 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern1 = "\r\n\t";
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        SimpleTimeZone mTimeZone2 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\r\n\t";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules2[0] = stringLiteral1;
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat2, fastDateFormat2);
        FastDateFormat fastDateFormat3 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern2 = "\u0014\n\t\r";
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
        ZoneInfo mTimeZone3 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
        Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
        java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue2 = "\u0014\n\t\r";
        setField(stringLiteral2, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue2);
        mRules3[0] = stringLiteral2;
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
        cInstanceCache.put(fastDateFormat3, fastDateFormat3);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern3 = "\n\t\r";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern3);
        ZoneInfo mTimeZone4 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone4);
        Locale mLocale4 = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(mLocale4, "java.util.Locale", "baseLocale", baseLocale);
        setField(mLocale4, "java.util.Locale", "hashCodeValue", 88804);
        Locale defaultLocale = ((Locale) createInstance("java.util.Locale"));
        setField(mLocale4, "java.util.Locale", "defaultLocale", defaultLocale);
        Locale defaultFormatLocale = ((Locale) createInstance("java.util.Locale"));
        setField(mLocale4, "java.util.Locale", "defaultFormatLocale", defaultFormatLocale);
        String languageTag = "und-XZ";
        setField(mLocale4, "java.util.Locale", "languageTag", languageTag);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale4);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules4 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue3 = "\n\t\r";
        setField(stringLiteral3, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue3);
        mRules4[0] = stringLiteral3;
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules4);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        
        // org.apache.commons.lang.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.Locale)}
     */
    @Test
    public void testGetInstanceWithBlankString3() throws Exception  {
        Locale locale = new Locale("", "XZ", "-3");
        
        FastDateFormat actual = FastDateFormat.getInstance("\n\t\r", locale);
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String cDefaultPattern = "d/M/yy HH:mm";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        HashMap cInstanceCache = new HashMap();
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        HashMap cDateInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        HashMap cTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        HashMap cDateTimeInstanceCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        HashMap cTimeZoneDisplayCache = new HashMap();
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern = "\n\r\t";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\r\t";
        setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
        mRules[0] = stringLiteral;
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat, fastDateFormat);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern1 = "";
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
        java.lang.Object[] mRules1 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules1);
        cInstanceCache.put(fastDateFormat1, fastDateFormat1);
        cInstanceCache.put(expected, expected);
        FastDateFormat fastDateFormat2 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern2 = "\r\n\t";
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
        SimpleTimeZone mTimeZone2 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\r\n\t";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules2[0] = stringLiteral1;
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat2, fastDateFormat2);
        FastDateFormat fastDateFormat3 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern3 = "\t\r\n";
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern3);
        SimpleTimeZone mTimeZone3 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
        java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue2 = "\t\r\n";
        setField(stringLiteral2, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue2);
        mRules3[0] = stringLiteral2;
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
        setField(fastDateFormat3, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        cInstanceCache.put(fastDateFormat3, fastDateFormat3);
        FastDateFormat fastDateFormat4 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mPattern", cDefaultPattern);
        ZoneInfo mTimeZone4 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone4);
        Locale mLocale4 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale4);
        java.lang.Object[] mRules4 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
        Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
        mRules4[0] = unpaddedNumberField;
        Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules4[1] = characterLiteral;
        Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
        mRules4[2] = unpaddedMonthField;
        Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
        mRules4[3] = characterLiteral1;
        Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
        mRules4[4] = twoDigitYearField;
        Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
        mRules4[5] = characterLiteral2;
        Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
        mRules4[6] = twoDigitNumberField;
        Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
        setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
        mRules4[7] = characterLiteral3;
        Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
        mRules4[8] = twoDigitNumberField1;
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules4);
        setField(fastDateFormat4, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
        cInstanceCache.put(fastDateFormat4, fastDateFormat4);
        FastDateFormat fastDateFormat5 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDefaultPattern", cDefaultPattern);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern4 = "\u0014\n\t\r";
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern4);
        ZoneInfo mTimeZone5 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone5);
        Locale mLocale5 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale5);
        java.lang.Object[] mRules5 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue3 = "\u0014\n\t\r";
        setField(stringLiteral3, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue3);
        mRules5[0] = stringLiteral3;
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules5);
        setField(fastDateFormat5, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
        cInstanceCache.put(fastDateFormat5, fastDateFormat5);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern5 = "\n\t\r";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern5);
        ZoneInfo mTimeZone6 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone6);
        Locale mLocale6 = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale6);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules6 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral4 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue4 = "\n\t\r";
        setField(stringLiteral4, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue4);
        mRules6[0] = stringLiteral4;
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules6);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        
        // org.apache.commons.lang.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getInstance(java.lang.String, java.util.Locale)
    
    @Test
    public void testGetInstance6() throws Exception  {
        String string = "";
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getInstance] produces [java.lang.NullPointerException]
            java.base/java.util.Locale.hashCode(Locale.java:2145)
            org.apache.commons.lang.time.FastDateFormat.hashCode(FastDateFormat.java:1006)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.HashMap.get(HashMap.java:556)
            org.apache.commons.lang.time.FastDateFormat.getInstance(FastDateFormat.java:214)
            org.apache.commons.lang.time.FastDateFormat.getInstance(FastDateFormat.java:196) */
        FastDateFormat.getInstance(string, locale);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getLocale
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocale()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getLocale()}
 * @utbot.returnsFrom {@code return mLocale;}
 *  */
    @Test
    public void testGetLocale_ReturnMLocale() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        Locale actual = fastDateFormat.getLocale();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.parseObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseObject(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseObject(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#setIndex(int)}
 * @utbot.invokes {@link java.text.ParsePosition#setErrorIndex(int)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testParseObject_ParsePositionSetErrorIndex() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        parsePosition.setErrorIndex(-255);
        
        Object actual = fastDateFormat.parseObject(null, parsePosition);
        
        assertNull(actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(0, finalParsePositionIndex);
        
        assertEquals(0, finalParsePositionErrorIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseObject(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseObject(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#setIndex(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pos.setIndex(0);
 *  */
    @Test
    public void testParseObject_ThrowNullPointerException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.parseObject] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.parseObject(FastDateFormat.java:908) */
        fastDateFormat.parseObject(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDateTimeInstance(int, int)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateTimeInstance(int,int)}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#getDateTimeInstance(int,int,java.util.TimeZone,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getDateTimeInstance(dateStyle, timeStyle, null, null);
 *  */
    @Test
    public void testGetDateTimeInstance_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateTimeInstanceCache"));
        try {
            LinkedHashMap cDateTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateTimeInstanceCache", cDateTimeInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:476)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:408) */
            FastDateFormat.getDateTimeInstance(-255, -1);
        } finally {
            setStaticField(FastDateFormat.class, "cDateTimeInstanceCache", prevCDateTimeInstanceCache);
        }
    }
    ///endregion
    
    ///region Errors report for getDateTimeInstance
    
    public void testGetDateTimeInstance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDateTimeInstance(int, int, java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateTimeInstance(int,int,java.util.TimeZone)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#getDateTimeInstance(int,int,java.util.TimeZone,java.util.Locale)}
 * @utbot.invokes {@link java.util.Locale#getDefault()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getDateTimeInstance(dateStyle, timeStyle, timeZone, null);
 *  */
    @Test
    public void testGetDateTimeInstance_ThrowIllegalArgumentException1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateTimeInstanceCache"));
        try {
            LinkedHashMap cDateTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateTimeInstanceCache", cDateTimeInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:476)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:443) */
            FastDateFormat.getDateTimeInstance(-255, -1, ((TimeZone) null));
        } finally {
            setStaticField(FastDateFormat.class, "cDateTimeInstanceCache", prevCDateTimeInstanceCache);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDateTimeInstance(int, int, java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateTimeInstance(int,int,java.util.TimeZone)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#getDateTimeInstance(int,int,java.util.TimeZone,java.util.Locale)}
 * @utbot.invokes {@link java.util.Locale#getDefault()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getDateTimeInstance(dateStyle, timeStyle, timeZone, null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeInstance_ThrowIllegalArgumentException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateTimeInstanceCache"));
        try {
            LinkedHashMap cDateTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateTimeInstanceCache", cDateTimeInstanceCache);
            ZoneInfo zoneInfo = new ZoneInfo();
            
            FastDateFormat.getDateTimeInstance(-256, 5, zoneInfo);
        } finally {
            setStaticField(FastDateFormat.class, "cDateTimeInstanceCache", prevCDateTimeInstanceCache);
        }
    }
    ///endregion
    
    ///region Errors report for getDateTimeInstance
    
    public void testGetDateTimeInstance_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDateTimeInstance(int, int, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateTimeInstance(int,int,java.util.Locale)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.text.DateFormat#getDateTimeInstance(int,int,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getDateTimeInstance(dateStyle, timeStyle, null, locale);
 *  */
    @Test
    public void testGetDateTimeInstance_ThrowIllegalArgumentException2() throws Exception  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateTimeInstanceCache"));
        try {
            LinkedHashMap cDateTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateTimeInstanceCache", cDateTimeInstanceCache);
            Locale locale = ((Locale) createInstance("java.util.Locale"));
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style 5]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:476)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:425) */
            FastDateFormat.getDateTimeInstance(-256, 5, locale);
        } finally {
            setStaticField(FastDateFormat.class, "cDateTimeInstanceCache", prevCDateTimeInstanceCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateTimeInstance(int,int,java.util.Locale)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link java.util.Locale#getDefault()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getDateTimeInstance(dateStyle, timeStyle, null, locale);
 *  */
    @Test
    public void testGetDateTimeInstance_ThrowIllegalArgumentException_11() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateTimeInstanceCache"));
        try {
            LinkedHashMap cDateTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateTimeInstanceCache", cDateTimeInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:476)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:425) */
            FastDateFormat.getDateTimeInstance(-255, -1, ((Locale) null));
        } finally {
            setStaticField(FastDateFormat.class, "cDateTimeInstanceCache", prevCDateTimeInstanceCache);
        }
    }
    ///endregion
    
    ///region Errors report for getDateTimeInstance
    
    public void testGetDateTimeInstance_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDateTimeInstance(int, int, java.util.TimeZone, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateTimeInstance(int,int,java.util.TimeZone,java.util.Locale)}
 * @utbot.executesCondition {@code (timeZone != null): False}
 * @utbot.executesCondition {@code (locale != null): True}
 * @utbot.executesCondition {@code (locale == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: SimpleDateFormat formatter = (SimpleDateFormat) DateFormat.getDateTimeInstance(dateStyle, timeStyle, locale);
 *  */
    @Test
    public void testGetDateTimeInstance_ThrowIllegalArgumentException3() throws Exception  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateTimeInstanceCache"));
        try {
            LinkedHashMap cDateTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateTimeInstanceCache", cDateTimeInstanceCache);
            Locale locale = ((Locale) createInstance("java.util.Locale"));
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal date style -1]
                java.base/java.text.DateFormat.get(DateFormat.java:824)
                java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:476) */
            FastDateFormat.getDateTimeInstance(-1, 0, null, locale);
        } finally {
            setStaticField(FastDateFormat.class, "cDateTimeInstanceCache", prevCDateTimeInstanceCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateTimeInstance(int,int,java.util.TimeZone,java.util.Locale)}
 * @utbot.executesCondition {@code (timeZone != null): True}
 * @utbot.executesCondition {@code (locale != null): False}
 * @utbot.executesCondition {@code (locale == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: SimpleDateFormat formatter = (SimpleDateFormat) DateFormat.getDateTimeInstance(dateStyle, timeStyle, locale);
 *  */
    @Test
    public void testGetDateTimeInstance_ThrowIllegalArgumentException_2() throws Exception  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateTimeInstanceCache"));
        try {
            LinkedHashMap cDateTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateTimeInstanceCache", cDateTimeInstanceCache);
            SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style 5]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:476) */
            FastDateFormat.getDateTimeInstance(-255, 5, simpleTimeZone, null);
        } finally {
            setStaticField(FastDateFormat.class, "cDateTimeInstanceCache", prevCDateTimeInstanceCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateTimeInstance(int,int,java.util.TimeZone,java.util.Locale)}
 * @utbot.executesCondition {@code (timeZone != null): False}
 * @utbot.executesCondition {@code (locale != null): False}
 * @utbot.executesCondition {@code (locale == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: SimpleDateFormat formatter = (SimpleDateFormat) DateFormat.getDateTimeInstance(dateStyle, timeStyle, locale);
 *  */
    @Test
    public void testGetDateTimeInstance_ThrowIllegalArgumentException_12() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateTimeInstanceCache"));
        try {
            LinkedHashMap cDateTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateTimeInstanceCache", cDateTimeInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:476) */
            FastDateFormat.getDateTimeInstance(-255, -1, null, null);
        } finally {
            setStaticField(FastDateFormat.class, "cDateTimeInstanceCache", prevCDateTimeInstanceCache);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getDateTimeInstance(int, int, java.util.TimeZone, java.util.Locale)
    
    @Test
    public void testGetDateTimeInstanceByFuzzer() {
        Locale locale = new Locale("");
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
            java.base/java.text.DateFormat.get(DateFormat.java:817)
            java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
            org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:476) */
        FastDateFormat.getDateTimeInstance(-1, -1, null, locale);
    }
    ///endregion
    
    ///region Errors report for getDateTimeInstance
    
    public void testGetDateTimeInstance_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getTimeZone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimeZone()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeZone()}
 * @utbot.returnsFrom {@code return mTimeZone;}
 *  */
    @Test
    public void testGetTimeZone_ReturnMTimeZone() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        TimeZone actual = fastDateFormat.getTimeZone();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getDateInstance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDateInstance(int, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateInstance(int,java.util.Locale)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.text.DateFormat#getDateInstance(int,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getDateInstance(style, null, locale);
 *  */
    @Test
    public void testGetDateInstance_ThrowIllegalArgumentException() throws Exception  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateInstanceCache"));
        try {
            LinkedHashMap cDateInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateInstanceCache", cDateInstanceCache);
            Locale locale = ((Locale) createInstance("java.util.Locale"));
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateInstance] produces [java.lang.IllegalArgumentException: Illegal date style 4]
                java.base/java.text.DateFormat.get(DateFormat.java:824)
                java.base/java.text.DateFormat.getDateInstance(DateFormat.java:570)
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:296)
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:250) */
            FastDateFormat.getDateInstance(4, locale);
        } finally {
            setStaticField(FastDateFormat.class, "cDateInstanceCache", prevCDateInstanceCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateInstance(int,java.util.Locale)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link java.util.Locale#getDefault()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getDateInstance(style, null, locale);
 *  */
    @Test
    public void testGetDateInstance_ThrowIllegalArgumentException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateInstanceCache"));
        try {
            LinkedHashMap cDateInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateInstanceCache", cDateInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateInstance] produces [java.lang.IllegalArgumentException: Illegal date style -1]
                java.base/java.text.DateFormat.get(DateFormat.java:824)
                java.base/java.text.DateFormat.getDateInstance(DateFormat.java:570)
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:296)
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:250) */
            FastDateFormat.getDateInstance(-1, ((Locale) null));
        } finally {
            setStaticField(FastDateFormat.class, "cDateInstanceCache", prevCDateInstanceCache);
        }
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method getDateInstance(int, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateInstance(int,java.util.Locale)}
     */
    @Test(timeout = 1000L)
    public void testGetDateInstance() {
        Locale locale = new Locale("-3", "#$\\\"'");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        FastDateFormat.getDateInstance(-2147483647, locale);
    }
    ///endregion
    
    ///region Errors report for getDateInstance
    
    public void testGetDateInstance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getDateInstance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDateInstance(int)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateInstance(int)}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#getDateInstance(int,java.util.TimeZone,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getDateInstance(style, null, null);
 *  */
    @Test
    public void testGetDateInstance_ThrowIllegalArgumentException1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateInstanceCache"));
        try {
            LinkedHashMap cDateInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateInstanceCache", cDateInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateInstance] produces [java.lang.IllegalArgumentException: Illegal date style -1]
                java.base/java.text.DateFormat.get(DateFormat.java:824)
                java.base/java.text.DateFormat.getDateInstance(DateFormat.java:570)
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:296)
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:235) */
            FastDateFormat.getDateInstance(-1);
        } finally {
            setStaticField(FastDateFormat.class, "cDateInstanceCache", prevCDateInstanceCache);
        }
    }
    ///endregion
    
    ///region Errors report for getDateInstance
    
    public void testGetDateInstance_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getDateInstance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDateInstance(int, java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateInstance(int,java.util.TimeZone)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#getDateInstance(int,java.util.TimeZone,java.util.Locale)}
 * @utbot.invokes {@link java.util.Locale#getDefault()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getDateInstance(style, timeZone, null);
 *  */
    @Test
    public void testGetDateInstance_ThrowIllegalArgumentException2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateInstanceCache"));
        try {
            LinkedHashMap cDateInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateInstanceCache", cDateInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateInstance] produces [java.lang.IllegalArgumentException: Illegal date style 5]
                java.base/java.text.DateFormat.get(DateFormat.java:824)
                java.base/java.text.DateFormat.getDateInstance(DateFormat.java:570)
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:296)
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:266) */
            FastDateFormat.getDateInstance(5, ((TimeZone) null));
        } finally {
            setStaticField(FastDateFormat.class, "cDateInstanceCache", prevCDateInstanceCache);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDateInstance(int, java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateInstance(int,java.util.TimeZone)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#getDateInstance(int,java.util.TimeZone,java.util.Locale)}
 * @utbot.invokes {@link java.util.Locale#getDefault()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getDateInstance(style, timeZone, null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDateInstance_ThrowIllegalArgumentException_11() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateInstanceCache"));
        try {
            LinkedHashMap cDateInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateInstanceCache", cDateInstanceCache);
            ZoneInfo zoneInfo = new ZoneInfo();
            
            FastDateFormat.getDateInstance(-1, zoneInfo);
        } finally {
            setStaticField(FastDateFormat.class, "cDateInstanceCache", prevCDateInstanceCache);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getDateInstance(int, java.util.TimeZone)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateInstance(int,java.util.TimeZone)}
     */
    @Test
    public void testGetDateInstanceThrowsIAE() {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(-1, "XZ");
        simpleTimeZone.setID("-3");
        simpleTimeZone.setRawOffset(-1);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateInstance] produces [java.lang.IllegalArgumentException: Illegal date style -1]
            java.base/java.text.DateFormat.get(DateFormat.java:824)
            java.base/java.text.DateFormat.getDateInstance(DateFormat.java:570)
            org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:296)
            org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:266) */
        FastDateFormat.getDateInstance(-1, simpleTimeZone);
    }
    ///endregion
    
    ///region Errors report for getDateInstance
    
    public void testGetDateInstance_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getDateInstance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDateInstance(int, java.util.TimeZone, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateInstance(int,java.util.TimeZone,java.util.Locale)}
 * @utbot.executesCondition {@code (timeZone != null): False}
 * @utbot.executesCondition {@code (locale != null): True}
 * @utbot.executesCondition {@code (locale == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: SimpleDateFormat formatter = (SimpleDateFormat) DateFormat.getDateInstance(style, locale);
 *  */
    @Test
    public void testGetDateInstance_ThrowIllegalArgumentException_12() throws Exception  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateInstanceCache"));
        try {
            LinkedHashMap cDateInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateInstanceCache", cDateInstanceCache);
            Locale locale = ((Locale) createInstance("java.util.Locale"));
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateInstance] produces [java.lang.IllegalArgumentException: Illegal date style 5]
                java.base/java.text.DateFormat.get(DateFormat.java:824)
                java.base/java.text.DateFormat.getDateInstance(DateFormat.java:570)
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:296) */
            FastDateFormat.getDateInstance(5, null, locale);
        } finally {
            setStaticField(FastDateFormat.class, "cDateInstanceCache", prevCDateInstanceCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateInstance(int,java.util.TimeZone,java.util.Locale)}
 * @utbot.executesCondition {@code (timeZone != null): True}
 * @utbot.executesCondition {@code (locale != null): False}
 * @utbot.executesCondition {@code (locale == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: SimpleDateFormat formatter = (SimpleDateFormat) DateFormat.getDateInstance(style, locale);
 *  */
    @Test
    public void testGetDateInstance_ThrowIllegalArgumentException_2() throws Exception  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateInstanceCache"));
        try {
            LinkedHashMap cDateInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateInstanceCache", cDateInstanceCache);
            SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateInstance] produces [java.lang.IllegalArgumentException: Illegal date style -1]
                java.base/java.text.DateFormat.get(DateFormat.java:824)
                java.base/java.text.DateFormat.getDateInstance(DateFormat.java:570)
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:296) */
            FastDateFormat.getDateInstance(-1, simpleTimeZone, null);
        } finally {
            setStaticField(FastDateFormat.class, "cDateInstanceCache", prevCDateInstanceCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateInstance(int,java.util.TimeZone,java.util.Locale)}
 * @utbot.executesCondition {@code (timeZone != null): False}
 * @utbot.executesCondition {@code (locale != null): False}
 * @utbot.executesCondition {@code (locale == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: SimpleDateFormat formatter = (SimpleDateFormat) DateFormat.getDateInstance(style, locale);
 *  */
    @Test
    public void testGetDateInstance_ThrowIllegalArgumentException3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateInstanceCache"));
        try {
            LinkedHashMap cDateInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateInstanceCache", cDateInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateInstance] produces [java.lang.IllegalArgumentException: Illegal date style 5]
                java.base/java.text.DateFormat.get(DateFormat.java:824)
                java.base/java.text.DateFormat.getDateInstance(DateFormat.java:570)
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:296) */
            FastDateFormat.getDateInstance(5, null, null);
        } finally {
            setStaticField(FastDateFormat.class, "cDateInstanceCache", prevCDateInstanceCache);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getDateInstance(int, java.util.TimeZone, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateInstance(int,java.util.TimeZone,java.util.Locale)}
     */
    @Test
    public void testGetDateInstanceThrowsIAE1() {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(-1, "\n\t\r");
        simpleTimeZone.setID("No date pattern for locale: ");
        simpleTimeZone.setRawOffset(-1);
        Locale locale = new Locale("10", "No date pattern for locale: ", "");
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateInstance] produces [java.lang.IllegalArgumentException: Illegal date style -1]
            java.base/java.text.DateFormat.get(DateFormat.java:824)
            java.base/java.text.DateFormat.getDateInstance(DateFormat.java:570)
            org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:296) */
        FastDateFormat.getDateInstance(-1, simpleTimeZone, locale);
    }
    ///endregion
    
    ///region Errors report for getDateInstance
    
    public void testGetDateInstance_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getTimeInstance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTimeInstance(int)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int)}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int,java.util.TimeZone,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getTimeInstance(style, null, null);
 *  */
    @Test
    public void testGetTimeInstance_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeInstanceCache"));
        try {
            LinkedHashMap cTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cTimeInstanceCache", cTimeInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getTimeInstance(DateFormat.java:524)
                org.apache.commons.lang.time.FastDateFormat.getTimeInstance(FastDateFormat.java:382)
                org.apache.commons.lang.time.FastDateFormat.getTimeInstance(FastDateFormat.java:320) */
            FastDateFormat.getTimeInstance(-1);
        } finally {
            setStaticField(FastDateFormat.class, "cTimeInstanceCache", prevCTimeInstanceCache);
        }
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method getTimeInstance(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int)}
     */
    @Test(timeout = 1000L)
    public void testGetTimeInstance() {
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        FastDateFormat.getTimeInstance(-1073741827);
    }
    ///endregion
    
    ///region Errors report for getTimeInstance
    
    public void testGetTimeInstance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getTimeInstance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTimeInstance(int, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int,java.util.Locale)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.text.DateFormat#getTimeInstance(int,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getTimeInstance(style, null, locale);
 *  */
    @Test
    public void testGetTimeInstance_ThrowIllegalArgumentException1() throws Exception  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeInstanceCache"));
        try {
            LinkedHashMap cTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cTimeInstanceCache", cTimeInstanceCache);
            Locale locale = ((Locale) createInstance("java.util.Locale"));
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style 4]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getTimeInstance(DateFormat.java:524)
                org.apache.commons.lang.time.FastDateFormat.getTimeInstance(FastDateFormat.java:382)
                org.apache.commons.lang.time.FastDateFormat.getTimeInstance(FastDateFormat.java:335) */
            FastDateFormat.getTimeInstance(4, locale);
        } finally {
            setStaticField(FastDateFormat.class, "cTimeInstanceCache", prevCTimeInstanceCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int,java.util.Locale)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link java.util.Locale#getDefault()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getTimeInstance(style, null, locale);
 *  */
    @Test
    public void testGetTimeInstance_ThrowIllegalArgumentException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeInstanceCache"));
        try {
            LinkedHashMap cTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cTimeInstanceCache", cTimeInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style 5]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getTimeInstance(DateFormat.java:524)
                org.apache.commons.lang.time.FastDateFormat.getTimeInstance(FastDateFormat.java:382)
                org.apache.commons.lang.time.FastDateFormat.getTimeInstance(FastDateFormat.java:335) */
            FastDateFormat.getTimeInstance(5, ((Locale) null));
        } finally {
            setStaticField(FastDateFormat.class, "cTimeInstanceCache", prevCTimeInstanceCache);
        }
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method getTimeInstance(int, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int,java.util.Locale)}
     */
    @Test(timeout = 1000L)
    public void testGetTimeInstance1() {
        Locale locale = new Locale("-3", "#$\\\"'");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        FastDateFormat.getTimeInstance(-2147483647, locale);
    }
    ///endregion
    
    ///region Errors report for getTimeInstance
    
    public void testGetTimeInstance_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getTimeInstance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTimeInstance(int, java.util.TimeZone, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int,java.util.TimeZone,java.util.Locale)}
 * @utbot.executesCondition {@code (timeZone != null): False}
 * @utbot.executesCondition {@code (locale != null): True}
 * @utbot.executesCondition {@code (locale == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: SimpleDateFormat formatter = (SimpleDateFormat) DateFormat.getTimeInstance(style, locale);
 *  */
    @Test
    public void testGetTimeInstance_ThrowIllegalArgumentException_11() throws Exception  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeInstanceCache"));
        try {
            LinkedHashMap cTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cTimeInstanceCache", cTimeInstanceCache);
            Locale locale = ((Locale) createInstance("java.util.Locale"));
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getTimeInstance(DateFormat.java:524)
                org.apache.commons.lang.time.FastDateFormat.getTimeInstance(FastDateFormat.java:382) */
            FastDateFormat.getTimeInstance(-1, null, locale);
        } finally {
            setStaticField(FastDateFormat.class, "cTimeInstanceCache", prevCTimeInstanceCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int,java.util.TimeZone,java.util.Locale)}
 * @utbot.executesCondition {@code (timeZone != null): True}
 * @utbot.executesCondition {@code (locale != null): False}
 * @utbot.executesCondition {@code (locale == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: SimpleDateFormat formatter = (SimpleDateFormat) DateFormat.getTimeInstance(style, locale);
 *  */
    @Test
    public void testGetTimeInstance_ThrowIllegalArgumentException_2() throws Exception  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeInstanceCache"));
        try {
            LinkedHashMap cTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cTimeInstanceCache", cTimeInstanceCache);
            SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style 4]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getTimeInstance(DateFormat.java:524)
                org.apache.commons.lang.time.FastDateFormat.getTimeInstance(FastDateFormat.java:382) */
            FastDateFormat.getTimeInstance(4, simpleTimeZone, null);
        } finally {
            setStaticField(FastDateFormat.class, "cTimeInstanceCache", prevCTimeInstanceCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int,java.util.TimeZone,java.util.Locale)}
 * @utbot.executesCondition {@code (timeZone != null): False}
 * @utbot.executesCondition {@code (locale != null): False}
 * @utbot.executesCondition {@code (locale == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: SimpleDateFormat formatter = (SimpleDateFormat) DateFormat.getTimeInstance(style, locale);
 *  */
    @Test
    public void testGetTimeInstance_ThrowIllegalArgumentException2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeInstanceCache"));
        try {
            LinkedHashMap cTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cTimeInstanceCache", cTimeInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style 5]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getTimeInstance(DateFormat.java:524)
                org.apache.commons.lang.time.FastDateFormat.getTimeInstance(FastDateFormat.java:382) */
            FastDateFormat.getTimeInstance(5, null, null);
        } finally {
            setStaticField(FastDateFormat.class, "cTimeInstanceCache", prevCTimeInstanceCache);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getTimeInstance(int, java.util.TimeZone, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int,java.util.TimeZone,java.util.Locale)}
     */
    @Test
    public void testGetTimeInstanceThrowsIAE() {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(-1, "\n\t\r");
        simpleTimeZone.setID("No date pattern for locale: ");
        simpleTimeZone.setRawOffset(-1);
        Locale locale = new Locale("10", "No date pattern for locale: ", "");
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
            java.base/java.text.DateFormat.get(DateFormat.java:817)
            java.base/java.text.DateFormat.getTimeInstance(DateFormat.java:524)
            org.apache.commons.lang.time.FastDateFormat.getTimeInstance(FastDateFormat.java:382) */
        FastDateFormat.getTimeInstance(-1, simpleTimeZone, locale);
    }
    ///endregion
    
    ///region Errors report for getTimeInstance
    
    public void testGetTimeInstance_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getTimeInstance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTimeInstance(int, java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int,java.util.TimeZone)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int,java.util.TimeZone,java.util.Locale)}
 * @utbot.invokes {@link java.util.Locale#getDefault()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getTimeInstance(style, timeZone, null);
 *  */
    @Test
    public void testGetTimeInstance_ThrowIllegalArgumentException3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeInstanceCache"));
        try {
            LinkedHashMap cTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cTimeInstanceCache", cTimeInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style 5]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getTimeInstance(DateFormat.java:524)
                org.apache.commons.lang.time.FastDateFormat.getTimeInstance(FastDateFormat.java:382)
                org.apache.commons.lang.time.FastDateFormat.getTimeInstance(FastDateFormat.java:351) */
            FastDateFormat.getTimeInstance(5, ((TimeZone) null));
        } finally {
            setStaticField(FastDateFormat.class, "cTimeInstanceCache", prevCTimeInstanceCache);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTimeInstance(int, java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int,java.util.TimeZone)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int,java.util.TimeZone,java.util.Locale)}
 * @utbot.invokes {@link java.util.Locale#getDefault()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getTimeInstance(style, timeZone, null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetTimeInstance_ThrowIllegalArgumentException_12() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeInstanceCache"));
        try {
            LinkedHashMap cTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cTimeInstanceCache", cTimeInstanceCache);
            ZoneInfo zoneInfo = new ZoneInfo();
            
            FastDateFormat.getTimeInstance(-1, zoneInfo);
        } finally {
            setStaticField(FastDateFormat.class, "cTimeInstanceCache", prevCTimeInstanceCache);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getTimeInstance(int, java.util.TimeZone)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int,java.util.TimeZone)}
     */
    @Test
    public void testGetTimeInstanceThrowsIAE1() {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(-1, "XZ");
        simpleTimeZone.setID("-3");
        simpleTimeZone.setRawOffset(-1);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
            java.base/java.text.DateFormat.get(DateFormat.java:817)
            java.base/java.text.DateFormat.getTimeInstance(DateFormat.java:524)
            org.apache.commons.lang.time.FastDateFormat.getTimeInstance(FastDateFormat.java:382)
            org.apache.commons.lang.time.FastDateFormat.getTimeInstance(FastDateFormat.java:351) */
        FastDateFormat.getTimeInstance(-1, simpleTimeZone);
    }
    ///endregion
    
    ///region Errors report for getTimeInstance
    
    public void testGetTimeInstance_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getPattern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPattern()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getPattern()}
 * @utbot.returnsFrom {@code return mPattern;}
 *  */
    @Test
    public void testGetPattern_ReturnMPattern() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        String actual = fastDateFormat.getPattern();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeZoneDisplay(java.util.TimeZone,boolean,int,java.util.Locale)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link java.util.TimeZone#getDisplayName(boolean,int,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = tz.getDisplayName(daylight, style, locale);
 *  */
    @Test
    public void testGetTimeZoneDisplay_ThrowNullPointerException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeZoneDisplayCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeZoneDisplayCache"));
        try {
            LinkedHashMap cTimeZoneDisplayCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(FastDateFormat.java:505) */
            FastDateFormat.getTimeZoneDisplay(null, true, 0, null);
        } finally {
            setStaticField(FastDateFormat.class, "cTimeZoneDisplayCache", prevCTimeZoneDisplayCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeZoneDisplay(java.util.TimeZone,boolean,int,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String value = (String) cTimeZoneDisplayCache.get(key);
 *  */
    @Test
    public void testGetTimeZoneDisplay_ThrowNullPointerException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeZoneDisplayCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeZoneDisplayCache"));
        try {
            setStaticField(fastDateFormatClazz, "cTimeZoneDisplayCache", null);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(FastDateFormat.java:502) */
            FastDateFormat.getTimeZoneDisplay(null, true, -255, null);
        } finally {
            setStaticField(FastDateFormat.class, "cTimeZoneDisplayCache", prevCTimeZoneDisplayCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeZoneDisplay(java.util.TimeZone,boolean,int,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String value = (String) cTimeZoneDisplayCache.get(key);
 *  */
    @Test
    public void testGetTimeZoneDisplay_ThrowNullPointerException_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeZoneDisplayCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeZoneDisplayCache"));
        try {
            setStaticField(fastDateFormatClazz, "cTimeZoneDisplayCache", null);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(FastDateFormat.java:502) */
            FastDateFormat.getTimeZoneDisplay(null, false, -255, null);
        } finally {
            setStaticField(FastDateFormat.class, "cTimeZoneDisplayCache", prevCTimeZoneDisplayCache);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeZoneDisplay(java.util.TimeZone,boolean,int,java.util.Locale)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link java.util.TimeZone#getDisplayName(boolean,int,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: value = tz.getDisplayName(daylight, style, locale);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetTimeZoneDisplay_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeZoneDisplayCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeZoneDisplayCache"));
        try {
            LinkedHashMap cTimeZoneDisplayCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            ZoneInfo zoneInfo = new ZoneInfo();
            
            FastDateFormat.getTimeZoneDisplay(zoneInfo, true, -252, null);
        } finally {
            setStaticField(FastDateFormat.class, "cTimeZoneDisplayCache", prevCTimeZoneDisplayCache);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)
    
    @Test
    public void testGetTimeZoneDisplayByFuzzer() {
        Locale locale = new Locale("XZ");
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(FastDateFormat.java:505) */
        FastDateFormat.getTimeZoneDisplay(null, false, -1, locale);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)
    
    @Test
    public void testGetTimeZoneDisplay1() throws Exception  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeZoneDisplayCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeZoneDisplayCache"));
        try {
            LinkedHashMap cTimeZoneDisplayCache = new LinkedHashMap();
            Integer integer = 0;
            Object object = new Object();
            cTimeZoneDisplayCache.put(integer, object);
            setStaticField(fastDateFormatClazz, "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            Locale locale = ((Locale) createInstance("java.util.Locale"));
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay] produces [java.lang.NullPointerException]
                java.base/java.util.Locale.hashCode(Locale.java:2145)
                org.apache.commons.lang.time.FastDateFormat$TimeZoneDisplayKey.hashCode(FastDateFormat.java:1660)
                java.base/java.util.HashMap.hash(HashMap.java:338)
                java.base/java.util.HashMap.getNode(HashMap.java:568)
                java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
                org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(FastDateFormat.java:502) */
            FastDateFormat.getTimeZoneDisplay(null, true, 0, locale);
        } finally {
            setStaticField(FastDateFormat.class, "cTimeZoneDisplayCache", prevCTimeZoneDisplayCache);
        }
    }
    ///endregion
    
    ///region Errors report for getTimeZoneDisplay
    
    public void testGetTimeZoneDisplay_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleServiceProviderPool.poolOfPools accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.applyRules
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method applyRules(java.util.Calendar, java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.returnsFrom {@code return buf;}
 *  */
    @Test
    public void testApplyRules_ReturnBuf() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        
        StringBuffer actual = fastDateFormat.applyRules(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method applyRules(java.util.Calendar, java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rules[i].appendTo(buf, calendar);
 *  */
    @Test
    public void testApplyRules_ThrowNullPointerException_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.applyRules] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.applyRules(FastDateFormat.java:893) */
        fastDateFormat.applyRules(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int len = mRules.length;
 *  */
    @Test
    public void testApplyRules_ThrowNullPointerException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.applyRules] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.applyRules(FastDateFormat.java:891) */
        fastDateFormat.applyRules(null, null);
    }
    ///endregion
    
    ///region Errors report for applyRules
    
    public void testApplyRules_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 106 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getDefaultPattern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefaultPattern()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDefaultPattern()}
 * @utbot.executesCondition {@code (cDefaultPattern == null): False}
 * @utbot.returnsFrom {@code return cDefaultPattern;}
 *  */
    @Test
    public void testGetDefaultPattern_CDefaultPatternNotEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        String prevCDefaultPattern = ((String) getStaticFieldValue(fastDateFormatClazz, "cDefaultPattern"));
        try {
            String cDefaultPattern = "";
            setStaticField(fastDateFormatClazz, "cDefaultPattern", cDefaultPattern);
            
            Method getDefaultPatternMethod = fastDateFormatClazz.getDeclaredMethod("getDefaultPattern");
            getDefaultPatternMethod.setAccessible(true);
            java.lang.Object[] getDefaultPatternMethodArguments = new java.lang.Object[0];
            String actual = ((String) getDefaultPatternMethod.invoke(null, getDefaultPatternMethodArguments));
            
            assertEquals(cDefaultPattern, actual);
        } finally {
            setStaticField(FastDateFormat.class, "cDefaultPattern", prevCDefaultPattern);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDefaultPattern()
    
    @Test
    public void testGetDefaultPattern1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        String prevCDefaultPattern = ((String) getStaticFieldValue(fastDateFormatClazz, "cDefaultPattern"));
        try {
            setStaticField(fastDateFormatClazz, "cDefaultPattern", null);
            
            Method getDefaultPatternMethod = fastDateFormatClazz.getDeclaredMethod("getDefaultPattern");
            getDefaultPatternMethod.setAccessible(true);
            java.lang.Object[] getDefaultPatternMethodArguments = new java.lang.Object[0];
            String actual = ((String) getDefaultPatternMethod.invoke(null, getDefaultPatternMethodArguments));
            
            String expected = "d/M/yy HH:mm";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(FastDateFormat.class, "cDefaultPattern", prevCDefaultPattern);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.selectNumberRule
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method selectNumberRule(int, int)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#selectNumberRule(int,int)}
 * @utbot.activatesSwitch {@code switch(padding) case: 1}
 * @utbot.returnsFrom {@code return new UnpaddedNumberField(field);}
 *  */
    @Test
    public void testSelectNumberRule_Return() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        Object actual = fastDateFormat.selectNumberRule(-255, 1);
        
        Object expected = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
        setField(expected, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", -255);
        
        int expectedMField = ((Integer) getFieldValue(expected, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField"));
        int actualMField = ((Integer) getFieldValue(actual, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField"));
        assertEquals(expectedMField, actualMField);
        
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#selectNumberRule(int,int)}
 * @utbot.activatesSwitch {@code switch(padding) case: 2}
 * @utbot.returnsFrom {@code return new TwoDigitNumberField(field);}
 *  */
    @Test
    public void testSelectNumberRule_Return_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        Object actual = fastDateFormat.selectNumberRule(-255, 2);
        
        Object expected = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
        setField(expected, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", -255);
        
        int expectedMField = ((Integer) getFieldValue(expected, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField"));
        int actualMField = ((Integer) getFieldValue(actual, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField"));
        assertEquals(expectedMField, actualMField);
        
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#selectNumberRule(int,int)}
 * @utbot.activatesSwitch {@code switch(padding) case: default}
 * @utbot.returnsFrom {@code return new PaddedNumberField(field, padding);}
 *  */
    @Test
    public void testSelectNumberRule_Return_2() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        Object actual = fastDateFormat.selectNumberRule(-255, 3);
        
        Object expected = createInstance("org.apache.commons.lang.time.FastDateFormat$PaddedNumberField");
        setField(expected, "org.apache.commons.lang.time.FastDateFormat$PaddedNumberField", "mField", -255);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat$PaddedNumberField", "mSize", 3);
        
        int expectedMField = ((Integer) getFieldValue(expected, "org.apache.commons.lang.time.FastDateFormat$PaddedNumberField", "mField"));
        int actualMField = ((Integer) getFieldValue(actual, "org.apache.commons.lang.time.FastDateFormat$PaddedNumberField", "mField"));
        assertEquals(expectedMField, actualMField);
        
        int expectedMSize = ((Integer) getFieldValue(expected, "org.apache.commons.lang.time.FastDateFormat$PaddedNumberField", "mSize"));
        int actualMSize = ((Integer) getFieldValue(actual, "org.apache.commons.lang.time.FastDateFormat$PaddedNumberField", "mSize"));
        assertEquals(expectedMSize, actualMSize);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method selectNumberRule(int, int)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#selectNumberRule(int,int)}
 * @utbot.activatesSwitch {@code switch(padding) case: default}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new PaddedNumberField(field, padding);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSelectNumberRule_ThrowIllegalArgumentException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        fastDateFormat.selectNumberRule(-255, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.parseToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method parseToken(java.lang.String, [I)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (c >= 'A'): True}
    /// invoke:
    ///     {@link java.lang.StringBuffer#append(char)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c <= 'Z'): True}
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_CLessOrEqualZ() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String string = "A";
        int[] intArray = {0};
        
        String actual = fastDateFormat.parseToken(string, intArray);
        
        String expected = "A";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c <= 'Z'): False}
 * @utbot.executesCondition {@code (c >= 'a'): True}
 * @utbot.executesCondition {@code (c <= 'z'): True}
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_IPlus1GreaterOrEqualLength() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String string = "a";
        int[] intArray = {0};
        
        String actual = fastDateFormat.parseToken(string, intArray);
        
        String expected = "a";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c <= 'Z'): False}
 * @utbot.executesCondition {@code (c >= 'a'): True}
 * @utbot.executesCondition {@code (c <= 'z'): True}
 * @utbot.iterates iterate the loop {@code while(i + 1 < length)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_PeekNotEqualsC() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String string = "a ";
        int[] intArray = {0};
        
        String actual = fastDateFormat.parseToken(string, intArray);
        
        String expected = "a";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method parseToken(java.lang.String, [I)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c >= 'A'): False}
 * @utbot.executesCondition {@code (c >= 'a'): False}
 * @utbot.iterates iterate the loop {@code for(; i < length; i++)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_PatternCharAtEqualsChar() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String string = "''";
        int[] intArray = {0};
        
        String actual = fastDateFormat.parseToken(string, intArray);
        
        String expected = "''";
        
        assertEquals(expected, actual);
        
        int finalIntArray0 = intArray[0];
        
        assertEquals(2, finalIntArray0);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c >= 'A'): False}
 * @utbot.executesCondition {@code (c >= 'a'): False}
 * @utbot.iterates iterate the loop {@code for(; i < length; i++)} 3 times
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_InLiteral() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String string = "                              ' '";
        int[] intArray = {30};
        
        String actual = fastDateFormat.parseToken(string, intArray);
        
        String expected = "' ";
        
        assertEquals(expected, actual);
        
        int finalIntArray0 = intArray[0];
        
        assertEquals(33, finalIntArray0);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c >= 'A'): False}
 * @utbot.executesCondition {@code (c >= 'a'): False}
 * @utbot.iterates iterate the loop {@code for(; i < length; i++)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_CLessThanA() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String string = "@";
        int[] intArray = {0};
        
        String actual = fastDateFormat.parseToken(string, intArray);
        
        String expected = "'@";
        
        assertEquals(expected, actual);
        
        int finalIntArray0 = intArray[0];
        
        assertEquals(1, finalIntArray0);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c >= 'A'): False}
 * @utbot.executesCondition {@code (c >= 'a'): False}
 * @utbot.iterates iterate the loop {@code for(; i < length; i++)} twice
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_CLessOrEqualZ_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String string = "@A";
        int[] intArray = {0};
        
        String actual = fastDateFormat.parseToken(string, intArray);
        
        String expected = "'@";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c >= 'A'): False}
 * @utbot.executesCondition {@code (c >= 'a'): False}
 * @utbot.iterates iterate the loop {@code for(; i < length; i++)} twice
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_CLessOrEqualZ_2() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String string = "@a";
        int[] intArray = {0};
        
        String actual = fastDateFormat.parseToken(string, intArray);
        
        String expected = "'@";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c >= 'A'): True}
 * @utbot.executesCondition {@code (c <= 'Z'): False}
 * @utbot.executesCondition {@code (c >= 'a'): True}
 * @utbot.executesCondition {@code (c <= 'z'): False}
 * @utbot.iterates iterate the loop {@code for(; i < length; i++)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_CGreaterThanZ() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String string = "{";
        int[] intArray = {0};
        
        String actual = fastDateFormat.parseToken(string, intArray);
        
        String expected = "'{";
        
        assertEquals(expected, actual);
        
        int finalIntArray0 = intArray[0];
        
        assertEquals(1, finalIntArray0);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c >= 'A'): True}
 * @utbot.executesCondition {@code (c <= 'Z'): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 * @utbot.iterates iterate the loop {@code while(i + 1 < length)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_PeekEqualsC() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String string = "AA";
        int[] intArray = {0};
        
        String actual = fastDateFormat.parseToken(string, intArray);
        
        String expected = "AA";
        
        assertEquals(expected, actual);
        
        int finalIntArray0 = intArray[0];
        
        assertEquals(1, finalIntArray0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseToken(java.lang.String, [I)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseToken(java.lang.String,int[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int i = indexRef[0];
 *  */
    @Test
    public void testParseToken_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.parseToken] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang.time.FastDateFormat.parseToken(FastDateFormat.java:714) */
        fastDateFormat.parseToken(null, intArray);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseToken(java.lang.String,int[])}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = pattern.charAt(i);
 *  */
    @Test
    public void testParseToken_ThrowStringIndexOutOfBoundsException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        String string = "  ";
        int[] intArray = {-255};
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.parseToken] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang.time.FastDateFormat.parseToken(FastDateFormat.java:717) */
        fastDateFormat.parseToken(string, intArray);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseToken(java.lang.String,int[])}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int length = pattern.length();
 *  */
    @Test
    public void testParseToken_ThrowNullPointerException_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        int[] intArray = {-255};
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.parseToken] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.parseToken(FastDateFormat.java:715) */
        fastDateFormat.parseToken(null, intArray);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#parseToken(java.lang.String,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int i = indexRef[0];
 *  */
    @Test
    public void testParseToken_ThrowNullPointerException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.parseToken] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.parseToken(FastDateFormat.java:714) */
        fastDateFormat.parseToken(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getTimeZoneOverridesCalendar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimeZoneOverridesCalendar()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeZoneOverridesCalendar()}
 * @utbot.returnsFrom {@code return mTimeZoneForced;}
 *  */
    @Test
    public void testGetTimeZoneOverridesCalendar_ReturnMTimeZoneForced() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        boolean actual = fastDateFormat.getTimeZoneOverridesCalendar();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getMaxLengthEstimate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxLengthEstimate()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getMaxLengthEstimate()}
 * @utbot.returnsFrom {@code return mMaxLengthEstimate;}
 *  */
    @Test
    public void testGetMaxLengthEstimate_ReturnMMaxLengthEstimate() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", -255);
        
        int actual = fastDateFormat.getMaxLengthEstimate();
        
        assertEquals(-255, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields671127130970400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields671127130970400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass671127130976200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields671127130970400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass671127130976200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields671127131333000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields671127131333000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass671127131334800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields671127131333000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass671127131334800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields671127131743300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields671127131743300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass671127131744800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields671127131743300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass671127131744800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields671127132516100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields671127132516100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass671127132517500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields671127132516100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass671127132517500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

