package org.apache.commons.lang.time;

import org.junit.Test;
import java.util.SimpleTimeZone;
import sun.util.calendar.ZoneInfo;
import java.util.Locale;
import sun.util.locale.BaseLocale;
import sun.util.locale.LocaleExtensions;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.TimeZone;
import java.io.NotActiveException;
import java.util.zip.InflaterInputStream;
import java.io.ObjectStreamClass;
import java.io.IOException;
import java.util.jar.JarInputStream;
import java.io.EOFException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.text.ParsePosition;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_lang_time_FastDateFormatTest {
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
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
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
    public void testEquals_MTimeZoneEqualsOtherMTimeZoneOrMTimeZoneEquals_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        mTimeZone.setRawOffset(-2);
        String id = "";
        mTimeZone.setID(id);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        mTimeZone1.setRawOffset(1);
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
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
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
            org.apache.commons.lang.time.FastDateFormat.equals(FastDateFormat.java:984) */
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
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.equals(FastDateFormat.java:986) */
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
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        String id = "";
        mTimeZone.setID(id);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        SimpleTimeZone mTimeZone1 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        mTimeZone1.setID(id);
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.equals(FastDateFormat.java:986) */
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
            org.apache.commons.lang.time.FastDateFormat.hashCode(FastDateFormat.java:1002) */
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
            org.apache.commons.lang.time.FastDateFormat.hashCode(FastDateFormat.java:1003) */
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
            org.apache.commons.lang.time.FastDateFormat.hashCode(FastDateFormat.java:1005) */
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
            org.apache.commons.lang.time.FastDateFormat.hashCode(FastDateFormat.java:1005) */
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
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:822)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:812) */
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
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:822) */
        fastDateFormat.format(((Date) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.format
    
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
        java.sql.Date date = new java.sql.Date(0L);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2303)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.setTimeInMillis(Calendar.java:1827)
            java.base/java.util.GregorianCalendar.<init>(GregorianCalendar.java:628)
            java.base/java.util.GregorianCalendar.<init>(GregorianCalendar.java:604)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:859)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:793) */
        fastDateFormat.format(date, null, null);
    }
    
    @Test
    public void testFormat4() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        Long long1 = 0L;
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2303)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.setTimeInMillis(Calendar.java:1827)
            java.base/java.util.GregorianCalendar.<init>(GregorianCalendar.java:628)
            java.base/java.util.GregorianCalendar.<init>(GregorianCalendar.java:604)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:859)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:847)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:797) */
        fastDateFormat.format(long1, null, null);
    }
    ///endregion
    
    ///region Errors report for format
    
    public void testFormat_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 143 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
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
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:859)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:847) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: calendar = (Calendar) calendar.clone();
 *  */
    @Test
    public void testFormat_ThrowNullPointerException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZoneForced", true);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:874) */
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
            org.apache.commons.lang.time.FastDateFormat.applyRules(FastDateFormat.java:890)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:877) */
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
        setField(japaneseImperialCalendar, "java.util.Calendar", "areFieldsSet", true);
        setField(japaneseImperialCalendar, "java.util.Calendar", "areAllFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.Calendar.get(Calendar.java:1850)
            org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField.appendTo(FastDateFormat.java:1200)
            org.apache.commons.lang.time.FastDateFormat.applyRules(FastDateFormat.java:892)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:877) */
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
    public void testFormat7() throws Exception  {
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
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2303)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2273)
            java.base/java.util.Calendar.complete(Calendar.java:2282)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField.appendTo(FastDateFormat.java:1200)
            org.apache.commons.lang.time.FastDateFormat.applyRules(FastDateFormat.java:892)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:877) */
        fastDateFormat.format(gregorianCalendar, ((StringBuffer) null));
    }
    
    @Test
    public void testFormat8() throws Exception  {
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
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.getSetStateFields(Calendar.java:2312)
            java.base/java.util.GregorianCalendar.computeFields(GregorianCalendar.java:2262)
            java.base/java.util.Calendar.complete(Calendar.java:2282)
            java.base/java.util.Calendar.get(Calendar.java:1849)
            org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField.appendTo(FastDateFormat.java:1200)
            org.apache.commons.lang.time.FastDateFormat.applyRules(FastDateFormat.java:892)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:877) */
        fastDateFormat.format(gregorianCalendar, ((StringBuffer) null));
    }
    
    @Test
    public void testFormat9() throws Throwable  {
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
            org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField.appendTo(FastDateFormat.java:1200)
            org.apache.commons.lang.time.FastDateFormat.applyRules(FastDateFormat.java:892)
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:877) */
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
        // 137 occurrences of:
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
            org.apache.commons.lang.time.FastDateFormat.format(FastDateFormat.java:834) */
        fastDateFormat.format(((Calendar) gregorianCalendar));
    }
    ///endregion
    
    ///region Errors report for format
    
    public void testFormat_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 114 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getInstance()
    
    @Test
    public void testGetInstance1() throws Exception  {
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
            String mPattern = "";
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
            ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
            Locale mLocale = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
            java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules);
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
            Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
            String mValue = "\n\t\r";
            setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
            mRules1[0] = stringLiteral;
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
            String mPattern2 = "\u0014\n\t\r";
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
            ZoneInfo mTimeZone2 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
            Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
            java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
            Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
            String mValue1 = "\u0014\n\t\r";
            setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
            mRules2[0] = stringLiteral1;
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
            cInstanceCache.put(fastDateFormat2, fastDateFormat2);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern3 = "d/M/yy HH:mm";
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern3);
            ZoneInfo mTimeZone3 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
            Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
            java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 9);
            Object unpaddedNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField");
            setField(unpaddedNumberField, "org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", "mField", 5);
            mRules3[0] = unpaddedNumberField;
            Object characterLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
            setField(characterLiteral, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
            mRules3[1] = characterLiteral;
            Object unpaddedMonthField = createInstance("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField");
            mRules3[2] = unpaddedMonthField;
            Object characterLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
            setField(characterLiteral1, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", '/');
            mRules3[3] = characterLiteral1;
            Object twoDigitYearField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField");
            mRules3[4] = twoDigitYearField;
            Object characterLiteral2 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
            setField(characterLiteral2, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ' ');
            mRules3[5] = characterLiteral2;
            Object twoDigitNumberField = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
            setField(twoDigitNumberField, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 11);
            mRules3[6] = twoDigitNumberField;
            Object characterLiteral3 = createInstance("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
            setField(characterLiteral3, "org.apache.commons.lang.time.FastDateFormat$CharacterLiteral", "mValue", ':');
            mRules3[7] = characterLiteral3;
            Object twoDigitNumberField1 = createInstance("org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField");
            setField(twoDigitNumberField1, "org.apache.commons.lang.time.FastDateFormat$TwoDigitNumberField", "mField", 12);
            mRules3[8] = twoDigitNumberField1;
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 16);
            
            // org.apache.commons.lang.time.FastDateFormat has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(FastDateFormat.class, "cDefaultPattern", prevCDefaultPattern);
        }
    }
    
    @Test
    public void testGetInstance2() throws Exception  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        String prevCDefaultPattern = ((String) getStaticFieldValue(fastDateFormatClazz, "cDefaultPattern"));
        try {
            String cDefaultPattern = "";
            setStaticField(fastDateFormatClazz, "cDefaultPattern", cDefaultPattern);
            
            FastDateFormat actual = FastDateFormat.getInstance();
            
            FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
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
            String mPattern = "\n\t\r";
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
            ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
            Locale mLocale = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
            setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
            java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
            Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
            String mValue = "\n\t\r";
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
            String mPattern1 = "d/M/yy HH:mm";
            setField(fastDateFormat1, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
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
            String mPattern2 = "\u0014\n\t\r";
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
            ZoneInfo mTimeZone2 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
            Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
            java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
            Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
            String mValue1 = "\u0014\n\t\r";
            setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
            mRules2[0] = stringLiteral1;
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
            setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
            cInstanceCache.put(fastDateFormat2, fastDateFormat2);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            String mPattern3 = "";
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern3);
            ZoneInfo mTimeZone3 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
            Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
            java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
            setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
            
            // org.apache.commons.lang.time.FastDateFormat has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(FastDateFormat.class, "cDefaultPattern", prevCDefaultPattern);
        }
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
    public void testGetInstance_FastDateFormatGetInstance() throws Exception  {
        String string = "";
        
        FastDateFormat actual = FastDateFormat.getInstance(string, ((Locale) null));
        
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
        String mPattern = "\n\t\r";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\t\r";
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
        String mPattern1 = "\u0014\n\t\r";
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        ZoneInfo mTimeZone2 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\u0014\n\t\r";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules2[0] = stringLiteral1;
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
        cInstanceCache.put(fastDateFormat2, fastDateFormat2);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", string);
        ZoneInfo mTimeZone3 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
        Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
        java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
        
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
    public void testGetInstance_ThrowIllegalArgumentException() {
        FastDateFormat.getInstance(((String) null), ((Locale) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getInstance(java.lang.String,java.util.Locale)}
     */
    @Test
    public void testGetInstanceWithBlankString() throws Exception  {
        Locale locale = new Locale("", "XZ", "-3");
        
        FastDateFormat actual = FastDateFormat.getInstance("\n\t\r", locale);
        
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
        String mPattern = "\n\t\r";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone1);
        Locale mLocale1 = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(mLocale1, "java.util.Locale", "baseLocale", baseLocale);
        setField(mLocale1, "java.util.Locale", "hashCodeValue", 88804);
        Locale defaultLocale = ((Locale) createInstance("java.util.Locale"));
        setField(mLocale1, "java.util.Locale", "defaultLocale", defaultLocale);
        Locale defaultFormatLocale = ((Locale) createInstance("java.util.Locale"));
        setField(mLocale1, "java.util.Locale", "defaultFormatLocale", defaultFormatLocale);
        String languageTag = "und-XZ";
        setField(mLocale1, "java.util.Locale", "languageTag", languageTag);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale1);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules1 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\t\r";
        setField(stringLiteral, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue);
        mRules1[0] = stringLiteral;
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules1);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 3);
        
        // org.apache.commons.lang.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getInstance(java.lang.String, java.util.Locale)
    
    @Test
    public void testGetInstance3() throws Exception  {
        String string = "";
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getInstance] produces [java.lang.NullPointerException]
            java.base/java.util.Locale.hashCode(Locale.java:2145)
            org.apache.commons.lang.time.FastDateFormat.hashCode(FastDateFormat.java:1005)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.HashMap.get(HashMap.java:556)
            org.apache.commons.lang.time.FastDateFormat.getInstance(FastDateFormat.java:213)
            org.apache.commons.lang.time.FastDateFormat.getInstance(FastDateFormat.java:195) */
        FastDateFormat.getInstance(string, locale);
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
        String mPattern = "\n\t\r";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\t\r";
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
        String mPattern1 = "\u0014\n\t\r";
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        ZoneInfo mTimeZone2 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\u0014\n\t\r";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules2[0] = stringLiteral1;
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
        cInstanceCache.put(fastDateFormat2, fastDateFormat2);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern2 = "";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
        ZoneInfo mTimeZone3 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
        Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
        java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
        
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
    public void testGetInstance_ThrowIllegalArgumentException1() {
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
        String mPattern = "\n\t\r";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\t\r";
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
        String mPattern1 = "\u0014\n\t\r";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        ZoneInfo mTimeZone2 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\u0014\n\t\r";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules2[0] = stringLiteral1;
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
        
        // org.apache.commons.lang.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
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
        String mPattern = "\n\t\r";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\t\r";
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
        String mPattern1 = "\u0014\n\t\r";
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        ZoneInfo mTimeZone2 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\u0014\n\t\r";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules2[0] = stringLiteral1;
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
        cInstanceCache.put(fastDateFormat2, fastDateFormat2);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern2 = "";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
        ZoneInfo mTimeZone3 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
        Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
        java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
        
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
    public void testGetInstance_ThrowIllegalArgumentException2() {
        FastDateFormat.getInstance(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)
    
    @Test
    public void testGetInstance5() throws Exception  {
        String string = "";
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getInstance] produces [java.lang.NullPointerException]
            java.base/java.util.Locale.hashCode(Locale.java:2145)
            org.apache.commons.lang.time.FastDateFormat.hashCode(FastDateFormat.java:1005)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.HashMap.get(HashMap.java:556)
            org.apache.commons.lang.time.FastDateFormat.getInstance(FastDateFormat.java:213) */
        FastDateFormat.getInstance(string, null, locale);
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
    public void testGetInstance_FastDateFormatGetInstance2() throws Exception  {
        String string = "";
        
        FastDateFormat actual = FastDateFormat.getInstance(string, ((TimeZone) null));
        
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
        String mPattern = "\n\t\r";
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern);
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang.time.FastDateFormat", "mLocaleForced", true);
        java.lang.Object[] mRules = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue = "\n\t\r";
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
        String mPattern1 = "\u0014\n\t\r";
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern1);
        ZoneInfo mTimeZone2 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone2);
        Locale mLocale2 = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale2);
        java.lang.Object[] mRules2 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 1);
        Object stringLiteral1 = createInstance("org.apache.commons.lang.time.FastDateFormat$StringLiteral");
        String mValue1 = "\u0014\n\t\r";
        setField(stringLiteral1, "org.apache.commons.lang.time.FastDateFormat$StringLiteral", "mValue", mValue1);
        mRules2[0] = stringLiteral1;
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules2);
        setField(fastDateFormat2, "org.apache.commons.lang.time.FastDateFormat", "mMaxLengthEstimate", 4);
        cInstanceCache.put(fastDateFormat2, fastDateFormat2);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cInstanceCache", cInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateInstanceCache", cDateInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeInstanceCache", cTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cDateTimeInstanceCache", cDateTimeInstanceCache);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
        String mPattern2 = "";
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mPattern", mPattern2);
        ZoneInfo mTimeZone3 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mTimeZone", mTimeZone3);
        Locale mLocale3 = ((Locale) createInstance("java.util.Locale"));
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mLocale", mLocale3);
        java.lang.Object[] mRules3 = createArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(expected, "org.apache.commons.lang.time.FastDateFormat", "mRules", mRules3);
        
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
    public void testGetInstance_ThrowIllegalArgumentException3() {
        FastDateFormat.getInstance(((String) null), ((TimeZone) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: in.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        
        /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.readObject] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.FastDateFormat.readObject(FastDateFormat.java:1030) */
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateFormatClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(fastDateFormat, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class extObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateFormatClazz.getDeclaredMethod("readObject", extObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = extObjectInputStream;
        try {
            readObjectMethod.invoke(fastDateFormat, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_1() throws Throwable  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(extObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class extObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateFormatClazz.getDeclaredMethod("readObject", extObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = extObjectInputStream;
        try {
            readObjectMethod.invoke(fastDateFormat, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException() throws Throwable  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(extObjectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(extObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class extObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateFormatClazz.getDeclaredMethod("readObject", extObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = extObjectInputStream;
        try {
            readObjectMethod.invoke(fastDateFormat, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.EOFException} in: in.defaultReadObject();
 *  */
    @Test(expected = EOFException.class)
    public void testReadObject_ThrowEOFException() throws Throwable  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in1, "java.util.jar.JarInputStream", "first", first);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "totalBytesRead", -255L);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(extObjectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(extObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class extObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateFormatClazz.getDeclaredMethod("readObject", extObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = extObjectInputStream;
        try {
            readObjectMethod.invoke(fastDateFormat, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testReadObject_ThrowZipException() throws Throwable  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang.time.FastDateFormat"));
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(in1, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(extObjectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(extObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class extObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateFormatClazz.getDeclaredMethod("readObject", extObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = extObjectInputStream;
        try {
            readObjectMethod.invoke(fastDateFormat, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readObject
    
    public void testReadObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 7 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
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
            org.apache.commons.lang.time.FastDateFormat.parseObject(FastDateFormat.java:907) */
        fastDateFormat.parseObject(null, null);
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
    public void testGetDateTimeInstance_ThrowIllegalArgumentException() throws Exception  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateTimeInstanceCache"));
        try {
            LinkedHashMap cDateTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateTimeInstanceCache", cDateTimeInstanceCache);
            Locale locale = ((Locale) createInstance("java.util.Locale"));
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style 5]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:475)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:425) */
            FastDateFormat.getDateTimeInstance(1, 5, locale);
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
    public void testGetDateTimeInstance_ThrowIllegalArgumentException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateTimeInstanceCache"));
        try {
            LinkedHashMap cDateTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateTimeInstanceCache", cDateTimeInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:475)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:425) */
            FastDateFormat.getDateTimeInstance(1, -1, ((Locale) null));
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
    public void testGetDateTimeInstance_ThrowIllegalArgumentException1() throws Exception  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateTimeInstanceCache"));
        try {
            LinkedHashMap cDateTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateTimeInstanceCache", cDateTimeInstanceCache);
            Locale locale = ((Locale) createInstance("java.util.Locale"));
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal date style -1]
                java.base/java.text.DateFormat.get(DateFormat.java:824)
                java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:475) */
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
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:475) */
            FastDateFormat.getDateTimeInstance(1, 5, simpleTimeZone, null);
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
    public void testGetDateTimeInstance_ThrowIllegalArgumentException_11() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateTimeInstanceCache"));
        try {
            LinkedHashMap cDateTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateTimeInstanceCache", cDateTimeInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:475) */
            FastDateFormat.getDateTimeInstance(1, -1, null, null);
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
            org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:475) */
        FastDateFormat.getDateTimeInstance(-1, -1, null, locale);
    }
    ///endregion
    
    ///region Errors report for getDateTimeInstance
    
    public void testGetDateTimeInstance_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
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
    public void testGetDateTimeInstance_ThrowIllegalArgumentException2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateTimeInstanceCache"));
        try {
            LinkedHashMap cDateTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateTimeInstanceCache", cDateTimeInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:475)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:408) */
            FastDateFormat.getDateTimeInstance(1, -1);
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
    public void testGetDateTimeInstance_ThrowIllegalArgumentException3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateTimeInstanceCache"));
        try {
            LinkedHashMap cDateTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateTimeInstanceCache", cDateTimeInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
                java.base/java.text.DateFormat.get(DateFormat.java:817)
                java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:475)
                org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:443) */
            FastDateFormat.getDateTimeInstance(1, -1, ((TimeZone) null));
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
    public void testGetDateTimeInstance_ThrowIllegalArgumentException_12() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateTimeInstanceCache"));
        try {
            LinkedHashMap cDateTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateTimeInstanceCache", cDateTimeInstanceCache);
            ZoneInfo zoneInfo = new ZoneInfo();
            
            FastDateFormat.getDateTimeInstance(0, 5, zoneInfo);
        } finally {
            setStaticField(FastDateFormat.class, "cDateTimeInstanceCache", prevCDateTimeInstanceCache);
        }
    }
    ///endregion
    
    ///region Errors report for getDateTimeInstance
    
    public void testGetDateTimeInstance_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
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
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:249) */
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
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:249) */
            FastDateFormat.getDateInstance(-1, ((Locale) null));
        } finally {
            setStaticField(FastDateFormat.class, "cDateInstanceCache", prevCDateInstanceCache);
        }
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
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:234) */
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
    public void testGetDateInstance_ThrowIllegalArgumentException2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
    public void testGetDateInstance_ThrowIllegalArgumentException_11() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateInstanceCache"));
        try {
            LinkedHashMap cDateInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateInstanceCache", cDateInstanceCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getDateInstance] produces [java.lang.IllegalArgumentException: Illegal date style 5]
                java.base/java.text.DateFormat.get(DateFormat.java:824)
                java.base/java.text.DateFormat.getDateInstance(DateFormat.java:570)
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:296)
                org.apache.commons.lang.time.FastDateFormat.getDateInstance(FastDateFormat.java:265) */
            FastDateFormat.getDateInstance(5, ((TimeZone) null));
        } finally {
            setStaticField(FastDateFormat.class, "cDateInstanceCache", prevCDateInstanceCache);
        }
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
 * @utbot.executesCondition {@code (locale != null): False}
 * @utbot.executesCondition {@code (locale == null): True}
 * @utbot.invokes {@link java.util.Locale#getDefault()}
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDateInstance(int, java.util.TimeZone, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getDateInstance(int,java.util.TimeZone,java.util.Locale)}
 * @utbot.executesCondition {@code (timeZone != null): True}
 * @utbot.executesCondition {@code (locale != null): False}
 * @utbot.executesCondition {@code (format == null): True}
 * @utbot.executesCondition {@code (locale == null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link java.util.Locale#getDefault()}
 * @utbot.invokes {@link java.text.DateFormat#getDateInstance(int,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: SimpleDateFormat formatter = (SimpleDateFormat) DateFormat.getDateInstance(style, locale);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDateInstance_ThrowIllegalArgumentException_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCDateInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cDateInstanceCache"));
        try {
            LinkedHashMap cDateInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cDateInstanceCache", cDateInstanceCache);
            ZoneInfo zoneInfo = new ZoneInfo();
            
            FastDateFormat.getDateInstance(-1, zoneInfo, null);
        } finally {
            setStaticField(FastDateFormat.class, "cDateInstanceCache", prevCDateInstanceCache);
        }
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
    public void testGetTimeInstance_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
                org.apache.commons.lang.time.FastDateFormat.getTimeInstance(FastDateFormat.java:351) */
            FastDateFormat.getTimeInstance(5, ((TimeZone) null));
        } finally {
            setStaticField(FastDateFormat.class, "cTimeInstanceCache", prevCTimeInstanceCache);
        }
    }
    ///endregion
    
    ///region Errors report for getTimeInstance
    
    public void testGetTimeInstance_errors()
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
 * @utbot.executesCondition {@code (locale != null): False}
 * @utbot.executesCondition {@code (locale == null): True}
 * @utbot.invokes {@link java.util.Locale#getDefault()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: SimpleDateFormat formatter = (SimpleDateFormat) DateFormat.getTimeInstance(style, locale);
 *  */
    @Test
    public void testGetTimeInstance_ThrowIllegalArgumentException1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTimeInstance(int, java.util.TimeZone, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeInstance(int,java.util.TimeZone,java.util.Locale)}
 * @utbot.executesCondition {@code (timeZone != null): True}
 * @utbot.executesCondition {@code (locale != null): False}
 * @utbot.executesCondition {@code (format == null): True}
 * @utbot.executesCondition {@code (locale == null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link java.util.Locale#getDefault()}
 * @utbot.invokes {@link java.text.DateFormat#getTimeInstance(int,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: SimpleDateFormat formatter = (SimpleDateFormat) DateFormat.getTimeInstance(style, locale);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetTimeInstance_ThrowIllegalArgumentException_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeInstanceCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeInstanceCache"));
        try {
            LinkedHashMap cTimeInstanceCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cTimeInstanceCache", cTimeInstanceCache);
            ZoneInfo zoneInfo = new ZoneInfo();
            
            FastDateFormat.getTimeInstance(4, zoneInfo, null);
        } finally {
            setStaticField(FastDateFormat.class, "cTimeInstanceCache", prevCTimeInstanceCache);
        }
    }
    ///endregion
    
    ///region Errors report for getTimeInstance
    
    public void testGetTimeInstance_errors1()
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
    public void testGetTimeInstance_ThrowIllegalArgumentException2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
    
    ///region Errors report for getTimeInstance
    
    public void testGetTimeInstance_errors2()
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
    public void testGetTimeInstance_ThrowIllegalArgumentException3() throws Exception  {
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
    public void testGetTimeInstance_ThrowIllegalArgumentException_12() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            org.apache.commons.lang.time.FastDateFormat.applyRules(FastDateFormat.java:892) */
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
            org.apache.commons.lang.time.FastDateFormat.applyRules(FastDateFormat.java:890) */
        fastDateFormat.applyRules(null, null);
    }
    ///endregion
    
    ///region Errors report for applyRules
    
    public void testApplyRules_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 118 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeZoneDisplay(java.util.TimeZone,boolean,int,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String value = (String) cTimeZoneDisplayCache.get(key);
 *  */
    @Test
    public void testGetTimeZoneDisplay_ThrowNullPointerException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeZoneDisplayCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeZoneDisplayCache"));
        try {
            setStaticField(fastDateFormatClazz, "cTimeZoneDisplayCache", null);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(FastDateFormat.java:501) */
            FastDateFormat.getTimeZoneDisplay(null, true, -255, null);
        } finally {
            setStaticField(FastDateFormat.class, "cTimeZoneDisplayCache", prevCTimeZoneDisplayCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeZoneDisplay(java.util.TimeZone,boolean,int,java.util.Locale)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = tz.getDisplayName(daylight, style, locale);
 *  */
    @Test
    public void testGetTimeZoneDisplay_ThrowNullPointerException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeZoneDisplayCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeZoneDisplayCache"));
        try {
            LinkedHashMap cTimeZoneDisplayCache = new LinkedHashMap();
            setStaticField(fastDateFormatClazz, "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(FastDateFormat.java:504) */
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
    public void testGetTimeZoneDisplay_ThrowNullPointerException_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeZoneDisplayCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeZoneDisplayCache"));
        try {
            setStaticField(fastDateFormatClazz, "cTimeZoneDisplayCache", null);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(FastDateFormat.java:501) */
            FastDateFormat.getTimeZoneDisplay(null, false, -255, null);
        } finally {
            setStaticField(FastDateFormat.class, "cTimeZoneDisplayCache", prevCTimeZoneDisplayCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.FastDateFormat#getTimeZoneDisplay(java.util.TimeZone,boolean,int,java.util.Locale)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = tz.getDisplayName(daylight, style, locale);
 *  */
    @Test
    public void testGetTimeZoneDisplay_ThrowNullPointerException_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Map prevCTimeZoneDisplayCache = ((Map) getStaticFieldValue(fastDateFormatClazz, "cTimeZoneDisplayCache"));
        try {
            LinkedHashMap cTimeZoneDisplayCache = new LinkedHashMap();
            Integer integer = 0;
            Object object = new Object();
            cTimeZoneDisplayCache.put(integer, object);
            setStaticField(fastDateFormatClazz, "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.FastDateFormat$TimeZoneDisplayKey.hashCode(FastDateFormat.java:1671)
                java.base/java.util.HashMap.hash(HashMap.java:338)
                java.base/java.util.HashMap.getNode(HashMap.java:568)
                java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
                org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(FastDateFormat.java:501) */
            FastDateFormat.getTimeZoneDisplay(null, true, -255, null);
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
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link org.utbot.engine.overrides.collections.UtHashMap#preconditionCheck()}
 * @utbot.invokes org.utbot.engine.overrides.collections.UtHashMap#getKeyIndex(java.lang.Object)
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link java.util.TimeZone#getDisplayName(boolean,int,java.util.Locale)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
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
            
            FastDateFormat.getTimeZoneDisplay(zoneInfo, true, -255, null);
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
            org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(FastDateFormat.java:504) */
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
            Object object = new Object();
            cTimeZoneDisplayCache.put(null, object);
            setStaticField(fastDateFormatClazz, "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
            Locale locale = ((Locale) createInstance("java.util.Locale"));
            
            /* This test fails because method [org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay] produces [java.lang.NullPointerException]
                java.base/java.util.Locale.hashCode(Locale.java:2145)
                org.apache.commons.lang.time.FastDateFormat$TimeZoneDisplayKey.hashCode(FastDateFormat.java:1671)
                java.base/java.util.HashMap.hash(HashMap.java:338)
                java.base/java.util.HashMap.getNode(HashMap.java:568)
                java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
                org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(FastDateFormat.java:501) */
            FastDateFormat.getTimeZoneDisplay(simpleTimeZone, true, 0, locale);
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
        // 8 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleServiceProviderPool.poolOfPools accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
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
            org.apache.commons.lang.time.FastDateFormat.parseToken(FastDateFormat.java:713) */
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
            org.apache.commons.lang.time.FastDateFormat.parseToken(FastDateFormat.java:716) */
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
            org.apache.commons.lang.time.FastDateFormat.parseToken(FastDateFormat.java:714) */
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
            org.apache.commons.lang.time.FastDateFormat.parseToken(FastDateFormat.java:713) */
        fastDateFormat.parseToken(null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields670441281837000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields670441281837000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass670441281896000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields670441281837000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass670441281896000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields670441282256000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields670441282256000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass670441282260400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields670441282256000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass670441282260400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields670441282611700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields670441282611700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass670441282617500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields670441282611700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass670441282617500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields670441283123600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields670441283123600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass670441283127300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields670441283123600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass670441283127300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

