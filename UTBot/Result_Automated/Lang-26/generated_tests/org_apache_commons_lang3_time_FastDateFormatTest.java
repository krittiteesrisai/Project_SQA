package org.apache.commons.lang3.time;

import org.junit.Test;
import java.util.SimpleTimeZone;
import sun.util.calendar.ZoneInfo;
import java.util.Locale;
import sun.util.locale.BaseLocale;
import sun.util.locale.LocaleExtensions;
import sun.util.BuddhistCalendar;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.io.ObjectInputStream;
import java.util.zip.InflaterInputStream;
import java.io.ObjectStreamClass;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.jar.JarInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.io.EOFException;
import sun.security.util.ManifestEntryVerifier;
import java.util.jar.JarEntry;
import java.security.CodeSigner;
import java.text.ParsePosition;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_lang3_time_FastDateFormatTest {
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getPattern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPattern()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getPattern()}
 * @utbot.returnsFrom {@code return mPattern;}
 *  */
    @Test
    public void testGetPattern_ReturnMPattern() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        String actual = fastDateFormat.getPattern();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): True}
 *  */
    @Test
    public void testEquals_ObjInstanceOfFastDateFormatEqualsFalse() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        boolean actual = fastDateFormat.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): False}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): False}
 *  */
    @Test
    public void testEquals_MPatternNotEqualsOtherMPattern() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): False}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): False}
 *  */
    @Test
    public void testEquals_MPatternNotEqualsOtherMPattern_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = "\u0000\u0000";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern1 = "\u0000";
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern1);
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): False}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): True}
 *  */
    @Test
    public void testEquals_MPatternEquals() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): False}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): True}
 *  */
    @Test
    public void testEquals_MPatternEquals_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): False}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): True}
 *  */
    @Test
    public void testEquals_MPatternEquals_2() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        String id = "";
        mTimeZone.setID(id);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone1 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone1);
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): False}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): True}
 *  */
    @Test
    public void testEquals_MPatternEquals_3() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(mTimeZone, "java.util.SimpleTimeZone", "useDaylight", true);
        String id = "";
        mTimeZone.setID(id);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        SimpleTimeZone mTimeZone1 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        mTimeZone1.setID(id);
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone1);
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): False}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): True}
 *  */
    @Test
    public void testEquals_MPatternEquals_4() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        String id = "";
        mTimeZone.setID(id);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone1);
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): False}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): True}
 *  */
    @Test
    public void testEquals_MPatternEquals_5() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        mTimeZone.setRawOffset(28368);
        setField(mTimeZone, "sun.util.calendar.ZoneInfo", "rawOffsetDiff", -76120052);
        String id = "";
        mTimeZone.setID(id);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        mTimeZone1.setRawOffset(-2080370656);
        setField(mTimeZone1, "sun.util.calendar.ZoneInfo", "rawOffsetDiff", -2138504957);
        mTimeZone1.setID(id);
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone1);
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): False}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): False}
 * @utbot.executesCondition {@code (mTimeZone == other.mTimeZone): False}
 * @utbot.invokes {@link java.util.Locale#equals(java.lang.Object)}
 *  */
    @Test
    public void testEquals_MTimeZoneNotEqualsOtherMTimeZone() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mLocale", mLocale);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDateFormat == false): False}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): False}
 * @utbot.executesCondition {@code (mTimeZone == other.mTimeZone): True}
 * @utbot.executesCondition {@code (mTimeZone.equals(other.mTimeZone)): False}
 *  */
    @Test
    public void testEquals_NotMTimeZoneEquals() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        boolean actual = fastDateFormat.equals(fastDateFormat1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (mPattern == other.mPattern || mPattern.equals(other.mPattern)) && (mTimeZone == other.mTimeZone || mTimeZone.equals(other.mTimeZone)) && (mLocale == other.mLocale || mLocale.equals(other.mLocale)) && (mTimeZoneForced == other.mTimeZoneForced) && (mLocaleForced == other.mLocaleForced)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.equals] produces [java.lang.NullPointerException] */
        fastDateFormat.equals(fastDateFormat1);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (mTimeZone == other.mTimeZone || mTimeZone.equals(other.mTimeZone))
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.equals] produces [java.lang.NullPointerException] */
        fastDateFormat.equals(fastDateFormat1);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): True}
 * @utbot.executesCondition {@code (mTimeZone == other.mTimeZone): False}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (mLocale == other.mLocale || mLocale.equals(other.mLocale))
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_2() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        mTimeZone.setID(mPattern);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone1 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        mTimeZone1.setID(mPattern);
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone1);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mLocale", mLocale);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.equals] produces [java.lang.NullPointerException] */
        fastDateFormat.equals(fastDateFormat1);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (mPattern == other.mPattern): True}
 * @utbot.executesCondition {@code (mPattern.equals(other.mPattern)): False}
 * @utbot.executesCondition {@code (mTimeZone == other.mTimeZone): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (mLocale == other.mLocale || mLocale.equals(other.mLocale))
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_3() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        FastDateFormat fastDateFormat1 = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateFormat1, "org.apache.commons.lang3.time.FastDateFormat", "mLocale", mLocale);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.equals] produces [java.lang.NullPointerException] */
        fastDateFormat.equals(fastDateFormat1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return "FastDateFormat[" + mPattern + "]";}
 *  */
    @Test
    public void testToString_StringBuilderToString() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        String actual = fastDateFormat.toString();
        
        String expected = "FastDateFormat[null]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.executesCondition {@code (mLocaleForced): True}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_MLocaleForced() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(mLocale, "java.util.Locale", "hashCodeValue", 1);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mLocaleForced", true);
        
        int actual = fastDateFormat.hashCode();
        
        assertEquals(258, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.executesCondition {@code (mLocaleForced): False}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_NotMLocaleForced() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(mLocale, "java.util.Locale", "hashCodeValue", 1);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mLocale", mLocale);
        
        int actual = fastDateFormat.hashCode();
        
        assertEquals(257, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.executesCondition {@code (mLocaleForced): False}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_NotMLocaleForced_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(baseLocale, "sun.util.locale.BaseLocale", "hash", 1);
        setField(mLocale, "java.util.Locale", "baseLocale", baseLocale);
        LocaleExtensions localeExtensions = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        setField(localeExtensions, "sun.util.locale.LocaleExtensions", "id", mPattern);
        setField(mLocale, "java.util.Locale", "localeExtensions", localeExtensions);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mLocale", mLocale);
        
        int actual = fastDateFormat.hashCode();
        
        assertEquals(510, actual);
        
        Locale fastDateFormatMLocale = ((Locale) getFieldValue(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mLocale"));
        int finalFastDateFormatMLocaleHashCodeValue = ((Integer) getFieldValue(fastDateFormatMLocale, "java.util.Locale", "hashCodeValue"));
        
        assertEquals(254, finalFastDateFormatMLocaleHashCodeValue);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): False}
 * @utbot.executesCondition {@code (mLocaleForced): True}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_NotMTimeZoneForced() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = "";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(baseLocale, "sun.util.locale.BaseLocale", "hash", 1);
        setField(mLocale, "java.util.Locale", "baseLocale", baseLocale);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mLocale", mLocale);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mLocaleForced", true);
        
        int actual = fastDateFormat.hashCode();
        
        assertEquals(257, actual);
        
        Locale fastDateFormatMLocale = ((Locale) getFieldValue(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mLocale"));
        int finalFastDateFormatMLocaleHashCodeValue = ((Integer) getFieldValue(fastDateFormatMLocale, "java.util.Locale", "hashCodeValue"));
        
        assertEquals(1, finalFastDateFormatMLocaleHashCodeValue);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.executesCondition {@code (mLocaleForced): False}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_NotMLocaleForced_2() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(baseLocale, "sun.util.locale.BaseLocale", "language", mPattern);
        setField(baseLocale, "sun.util.locale.BaseLocale", "script", mPattern);
        String region = " ";
        setField(baseLocale, "sun.util.locale.BaseLocale", "region", region);
        setField(baseLocale, "sun.util.locale.BaseLocale", "variant", mPattern);
        setField(mLocale, "java.util.Locale", "baseLocale", baseLocale);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mLocale", mLocale);
        
        int actual = fastDateFormat.hashCode();
        
        assertEquals(7850176, actual);
        
        Locale fastDateFormatMLocale = ((Locale) getFieldValue(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mLocale"));
        BaseLocale fastDateFormatMLocaleMLocaleBaseLocale = ((BaseLocale) getFieldValue(fastDateFormatMLocale, "java.util.Locale", "baseLocale"));
        int finalFastDateFormatMLocaleBaseLocaleHash = ((Integer) getFieldValue(fastDateFormatMLocaleMLocaleBaseLocale, "sun.util.locale.BaseLocale", "hash"));
        Locale fastDateFormatMLocale1 = ((Locale) getFieldValue(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mLocale"));
        int finalFastDateFormatMLocaleHashCodeValue = ((Integer) getFieldValue(fastDateFormatMLocale1, "java.util.Locale", "hashCodeValue"));
        
        assertEquals(7849920, finalFastDateFormatMLocaleBaseLocaleHash);
        
        assertEquals(7849920, finalFastDateFormatMLocaleHashCodeValue);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#hashCode()}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: total += mPattern.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.hashCode] produces [java.lang.NullPointerException] */
        fastDateFormat.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#hashCode()}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: total += mTimeZone.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.hashCode] produces [java.lang.NullPointerException] */
        fastDateFormat.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: total += mLocale.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_2() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.hashCode] produces [java.lang.NullPointerException] */
        fastDateFormat.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: total += mLocale.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_3() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.hashCode] produces [java.lang.NullPointerException] */
        fastDateFormat.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#hashCode()}
 * @utbot.executesCondition {@code (mTimeZoneForced): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: total += mLocale.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_4() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        String mPattern = " ";
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mPattern", mPattern);
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZone", mTimeZone);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.hashCode] produces [java.lang.NullPointerException] */
        fastDateFormat.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.format
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (obj instanceof Date): False}
 * @utbot.executesCondition {@code (obj instanceof Calendar): True}
 * @utbot.invokes {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.returnsFrom {@code return format((Calendar) obj, toAppendTo);}
 *  */
    @Test
    public void testFormat_ObjInstanceOfCalendar() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 0);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mRules", mRules);
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        
        StringBuffer actual = fastDateFormat.format(buddhistCalendar, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (obj instanceof Calendar): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return format((Calendar) obj, toAppendTo);
 *  */
    @Test
    public void testFormat_ThrowClassCastException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        setField(buddhistCalendar, "java.util.Calendar", "time", 0L);
        setField(buddhistCalendar, "java.util.Calendar", "isTimeSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.util.Calendar] */
        fastDateFormat.format(buddhistCalendar, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (obj instanceof Calendar): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return format((Calendar) obj, toAppendTo);
 *  */
    @Test
    public void testFormat_ThrowClassCastException_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        setField(japaneseImperialCalendar, "java.util.Calendar", "time", 0L);
        setField(japaneseImperialCalendar, "java.util.Calendar", "isTimeSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.util.Calendar] */
        fastDateFormat.format(japaneseImperialCalendar, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (obj instanceof Calendar): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        int[] stamp = {};
        setField(buddhistCalendar, "java.util.Calendar", "stamp", stamp);
        buddhistCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(buddhistCalendar, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (obj instanceof Calendar): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        int[] stamp = {1, 3, 3, 3, 1, 3, 3, 1};
        setField(buddhistCalendar, "java.util.Calendar", "stamp", stamp);
        buddhistCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(buddhistCalendar, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (obj instanceof Calendar): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException_2() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        int[] stamp = {1};
        setField(buddhistCalendar, "java.util.Calendar", "stamp", stamp);
        buddhistCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(buddhistCalendar, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (obj instanceof Calendar): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException_3() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        int[] originalFields = {0};
        setField(buddhistCalendar, "java.util.GregorianCalendar", "originalFields", originalFields);
        int[] fields = {};
        setField(buddhistCalendar, "java.util.Calendar", "fields", fields);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(buddhistCalendar, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (obj instanceof Calendar): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return format((Calendar) obj, toAppendTo);
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException_4() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        int[] originalFields = {};
        setField(buddhistCalendar, "java.util.GregorianCalendar", "originalFields", originalFields);
        int[] fields = {1};
        setField(buddhistCalendar, "java.util.Calendar", "fields", fields);
        setField(buddhistCalendar, "java.util.Calendar", "stamp", fields);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(buddhistCalendar, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (obj instanceof Calendar): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException_5() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 1);
        Object twoDigitMonthField = createInstance("org.apache.commons.lang3.time.FastDateFormat$TwoDigitMonthField");
        mRules[0] = twoDigitMonthField;
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mRules", mRules);
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        int[] fields = {};
        setField(buddhistCalendar, "java.util.Calendar", "fields", fields);
        setField(buddhistCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(buddhistCalendar, "java.util.Calendar", "areFieldsSet", true);
        setField(buddhistCalendar, "java.util.Calendar", "areAllFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(buddhistCalendar, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (obj instanceof Calendar): False}
 * @utbot.executesCondition {@code (obj instanceof Long): False}
 * @utbot.executesCondition {@code (obj == null): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (obj == null ? "<null>" : obj.getClass().getName())
 *  */
    @Test
    public void testFormat_ThrowNullPointerException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDateFormat.format(FastDateFormat.java:416) */
        fastDateFormat.format(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.format
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method format(java.util.Calendar, java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (mTimeZoneForced): False}
 * @utbot.invokes {@link org.apache.commons.lang3.time.FastDateFormat#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.returnsFrom {@code return applyRules(calendar, buf);}
 *  */
    @Test
    public void testFormat_NotMTimeZoneForced() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 0);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mRules", mRules);
        
        StringBuffer actual = fastDateFormat.format(((Calendar) null), ((StringBuffer) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method format(java.util.Calendar, java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.invokes {@link java.util.Calendar#clone()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: calendar = (Calendar) calendar.clone();
 *  */
    @Test
    public void testFormat_ThrowClassCastException1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "time", -255L);
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.util.Calendar] */
        fastDateFormat.format(gregorianCalendar, ((StringBuffer) null));
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: calendar.getTimeInMillis();
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {1};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(gregorianCalendar, ((StringBuffer) null));
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: calendar.getTimeInMillis();
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException_11() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {1, 0, 0, 0, 1, 0, 0, 0};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(gregorianCalendar, ((StringBuffer) null));
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: calendar.getTimeInMillis();
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException_21() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(gregorianCalendar, ((StringBuffer) null));
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: calendar.getTimeInMillis();
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException_31() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] originalFields = {};
        setField(gregorianCalendar, "java.util.GregorianCalendar", "originalFields", originalFields);
        int[] fields = {1};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        setField(gregorianCalendar, "java.util.Calendar", "stamp", fields);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(gregorianCalendar, ((StringBuffer) null));
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: calendar.getTimeInMillis();
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException_41() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] originalFields = {0};
        setField(gregorianCalendar, "java.util.GregorianCalendar", "originalFields", originalFields);
        int[] fields = {};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(gregorianCalendar, ((StringBuffer) null));
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (mTimeZoneForced): False}
 * @utbot.invokes {@link org.apache.commons.lang3.time.FastDateFormat#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException_51() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 1);
        Object twoDigitMonthField = createInstance("org.apache.commons.lang3.time.FastDateFormat$TwoDigitMonthField");
        mRules[0] = twoDigitMonthField;
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mRules", mRules);
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        int[] fields = {0};
        setField(buddhistCalendar, "java.util.Calendar", "fields", fields);
        int[] stamp = {};
        setField(buddhistCalendar, "java.util.Calendar", "stamp", stamp);
        setField(buddhistCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(buddhistCalendar, "java.util.Calendar", "areFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(buddhistCalendar, ((StringBuffer) null));
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: calendar.getTimeInMillis();
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException_6() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {0};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        int[] stamp = {};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(gregorianCalendar, ((StringBuffer) null));
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (mTimeZoneForced): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: calendar.getTimeInMillis();
 *  */
    @Test
    public void testFormat_ThrowNullPointerException1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.NullPointerException] */
        fastDateFormat.format(((Calendar) null), ((StringBuffer) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method format(java.util.Calendar, java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: calendar.getTimeInMillis();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormat_ThrowIllegalArgumentException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] originalFields = {2};
        setField(gregorianCalendar, "java.util.GregorianCalendar", "originalFields", originalFields);
        int[] fields = {-1};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        setField(gregorianCalendar, "java.util.Calendar", "stamp", originalFields);
        
        fastDateFormat.format(gregorianCalendar, ((StringBuffer) null));
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: calendar.getTimeInMillis();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormat_ThrowIllegalArgumentException_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {2};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        setField(gregorianCalendar, "java.util.Calendar", "stamp", fields);
        
        fastDateFormat.format(gregorianCalendar, ((StringBuffer) null));
    }
    ///endregion
    
    ///region Errors report for format
    
    public void testFormat_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.format
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method format(java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar)}
 * @utbot.invokes {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.invokes {@link java.lang.StringBuffer#toString()}
 * @utbot.returnsFrom {@code return format(calendar, new StringBuffer(mMaxLengthEstimate)).toString();}
 *  */
    @Test
    public void testFormat_StringBufferToString() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 0);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mRules", mRules);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mMaxLengthEstimate", -255);
        
        String actual = fastDateFormat.format(((Calendar) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method format(java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return format(calendar, new StringBuffer(mMaxLengthEstimate)).toString();
 *  */
    @Test
    public void testFormat_ThrowClassCastException2() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mMaxLengthEstimate", -255);
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        setField(gregorianCalendar, "java.util.Calendar", "time", -255L);
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.util.Calendar] */
        fastDateFormat.format(((Calendar) gregorianCalendar));
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException2() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mMaxLengthEstimate", -255);
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(((Calendar) gregorianCalendar));
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException_12() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mMaxLengthEstimate", -255);
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {1, 3, 3, 3, 12, 3, 3, 12};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(((Calendar) gregorianCalendar));
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException_22() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mMaxLengthEstimate", -255);
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(((Calendar) gregorianCalendar));
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testFormat_ThrowIndexOutOfBoundsException_32() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mMaxLengthEstimate", -255);
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {0};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        int[] stamp = {};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.format] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.format(((Calendar) gregorianCalendar));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method format(java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar)}
 * @utbot.invokes {@link org.apache.commons.lang3.time.FastDateFormat#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return format(calendar, new StringBuffer(mMaxLengthEstimate)).toString();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormat_ThrowIllegalArgumentException1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mTimeZoneForced", true);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mMaxLengthEstimate", -255);
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {-1};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        int[] stamp = {2};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        
        fastDateFormat.format(((Calendar) gregorianCalendar));
    }
    ///endregion
    
    ///region Errors report for format
    
    public void testFormat_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getInstance
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInstance()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getInstance()}
     */
    @Test
    public void testGetInstance() throws Exception  {
        FastDateFormat actual = FastDateFormat.getInstance();
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        // org.apache.commons.lang3.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getInstance
    
    public void testGetInstance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String,java.util.Locale)}
 * @utbot.invokes {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 *  */
    @Test
    public void testGetInstance_FastDateFormatGetInstance() throws Exception  {
        String string = "";
        
        FastDateFormat actual = FastDateFormat.getInstance(string, ((Locale) null));
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        // org.apache.commons.lang3.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInstance(java.lang.String, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String,java.util.Locale)}
 * @utbot.invokes {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getInstance(pattern, null, locale);
 *  */
    @Test
    public void testGetInstance_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.getInstance] produces [java.lang.NullPointerException: pattern must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.FormatCache.getInstance(FormatCache.java:72)
            org.apache.commons.lang3.time.FastDateFormat.getInstance(FastDateFormat.java:162) */
        FastDateFormat.getInstance(((String) null), ((Locale) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String,java.util.Locale)}
     */
    @Test
    public void testGetInstanceWithBlankString() throws Exception  {
        Locale locale = new Locale("", "XZ", "-3");
        
        FastDateFormat actual = FastDateFormat.getInstance("\n\t\r", locale);
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        // org.apache.commons.lang3.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getInstance(java.lang.String, java.util.Locale)
    
    @Test
    public void testGetInstance1() throws Exception  {
        String string = "";
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.getInstance] produces [java.lang.NullPointerException]
            java.base/java.util.Locale.hashCode(Locale.java:2145)
            org.apache.commons.lang3.time.FormatCache$MultipartKey.hashCode(FormatCache.java:255)
            java.base/java.util.concurrent.ConcurrentHashMap.get(ConcurrentHashMap.java:936)
            org.apache.commons.lang3.time.FormatCache.getInstance(FormatCache.java:80)
            org.apache.commons.lang3.time.FastDateFormat.getInstance(FastDateFormat.java:162) */
        FastDateFormat.getInstance(string, locale);
    }
    
    @Test
    public void testGetInstance2() throws Exception  {
        String string = "";
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.getInstance] produces [java.lang.NullPointerException]
            java.base/java.util.Locale.hashCode(Locale.java:2145)
            org.apache.commons.lang3.time.FormatCache$MultipartKey.hashCode(FormatCache.java:255)
            java.base/java.util.concurrent.ConcurrentHashMap.get(ConcurrentHashMap.java:936)
            org.apache.commons.lang3.time.FormatCache.getInstance(FormatCache.java:80)
            org.apache.commons.lang3.time.FastDateFormat.getInstance(FastDateFormat.java:162) */
        FastDateFormat.getInstance(string, locale);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 *  */
    @Test
    public void testGetInstance_FastDateFormatGetInstance1() throws Exception  {
        String string = "";
        
        FastDateFormat actual = FastDateFormat.getInstance(string);
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        // org.apache.commons.lang3.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInstance(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getInstance(pattern, null, null);
 *  */
    @Test
    public void testGetInstance_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.getInstance] produces [java.lang.NullPointerException: pattern must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.FormatCache.getInstance(FormatCache.java:72)
            org.apache.commons.lang3.time.FastDateFormat.getInstance(FastDateFormat.java:133) */
        FastDateFormat.getInstance(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String)}
     */
    @Test
    public void testGetInstanceWithNonEmptyString() throws Exception  {
        FastDateFormat actual = FastDateFormat.getInstance("\u0014\n\t\r");
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        // org.apache.commons.lang3.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String)
    
    @Test
    public void testGetInstance3() throws Exception  {
        String string = "";
        
        FastDateFormat actual = FastDateFormat.getInstance(string);
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        // org.apache.commons.lang3.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetInstance4() throws Exception  {
        String string = "";
        
        FastDateFormat actual = FastDateFormat.getInstance(string);
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        // org.apache.commons.lang3.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetInstance5() throws Exception  {
        String string = "";
        
        FastDateFormat actual = FastDateFormat.getInstance(string);
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        // org.apache.commons.lang3.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 *  */
    @Test
    public void testGetInstance6() throws Exception  {
        String string = "";
        
        FastDateFormat actual = FastDateFormat.getInstance(string, null, null);
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        // org.apache.commons.lang3.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FastDateFormat emptyFormat = new FastDateFormat(pattern, timeZone, locale);
 *  */
    @Test
    public void testGetInstance_ThrowNullPointerException2() {
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.getInstance] produces [java.lang.NullPointerException: pattern must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.FormatCache.getInstance(FormatCache.java:72)
            org.apache.commons.lang3.time.FastDateFormat.getInstance(FastDateFormat.java:179) */
        FastDateFormat.getInstance(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)
    
    @Test
    public void testGetInstance7() throws Exception  {
        String string = "";
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        
        FastDateFormat actual = FastDateFormat.getInstance(string, simpleTimeZone, null);
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        // org.apache.commons.lang3.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)
    
    @Test
    public void testGetInstance8() throws Exception  {
        String string = "";
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.getInstance] produces [java.lang.NullPointerException]
            java.base/java.util.Locale.hashCode(Locale.java:2145)
            org.apache.commons.lang3.time.FormatCache$MultipartKey.hashCode(FormatCache.java:255)
            java.base/java.util.concurrent.ConcurrentHashMap.get(ConcurrentHashMap.java:936)
            org.apache.commons.lang3.time.FormatCache.getInstance(FormatCache.java:80)
            org.apache.commons.lang3.time.FastDateFormat.getInstance(FastDateFormat.java:179) */
        FastDateFormat.getInstance(string, null, locale);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String, java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone)}
 * @utbot.invokes {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 *  */
    @Test
    public void testGetInstance_FastDateFormatGetInstance2() throws Exception  {
        String string = "";
        
        FastDateFormat actual = FastDateFormat.getInstance(string, ((TimeZone) null));
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        // org.apache.commons.lang3.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInstance(java.lang.String, java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone)}
 * @utbot.invokes {@link org.apache.commons.lang3.time.FastDateFormat#getInstance(java.lang.String,java.util.TimeZone,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getInstance(pattern, timeZone, null);
 *  */
    @Test
    public void testGetInstance_ThrowNullPointerException3() {
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.getInstance] produces [java.lang.NullPointerException: pattern must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.time.FormatCache.getInstance(FormatCache.java:72)
            org.apache.commons.lang3.time.FastDateFormat.getInstance(FastDateFormat.java:148) */
        FastDateFormat.getInstance(((String) null), ((TimeZone) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getInstance(java.lang.String, java.util.TimeZone)
    
    @Test
    public void testGetInstance9() throws Exception  {
        String string = "";
        
        FastDateFormat actual = FastDateFormat.getInstance(string, ((TimeZone) null));
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        // org.apache.commons.lang3.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetInstance10() throws Exception  {
        String string = "";
        
        FastDateFormat actual = FastDateFormat.getInstance(string, ((TimeZone) null));
        
        FastDateFormat expected = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        // org.apache.commons.lang3.time.FastDateFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.readObject
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException() throws Throwable  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateFormatClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDateFormat, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException_1() throws Throwable  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", -256);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", -256);
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateFormatClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDateFormat, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testReadObject_ThrowZipException() throws Throwable  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(1);
        setField(in1, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        short[][] obj = {};
        setField(curContext, "java.io.SerialCallbackContext", "obj", obj);
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateFormatClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDateFormat, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.EOFException} in: in.defaultReadObject();
 *  */
    @Test(expected = EOFException.class)
    public void testReadObject_ThrowEOFException() throws Throwable  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in1, "java.util.jar.JarInputStream", "first", first);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "totalBytesRead", -255L);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateFormatClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDateFormat, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.EOFException} in: in.defaultReadObject();
 *  */
    @Test(expected = EOFException.class)
    public void testReadObject_ThrowEOFException_1() throws Throwable  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object jv = createInstance("java.util.jar.JarVerifier");
        setField(in1, "java.util.jar.JarInputStream", "jv", jv);
        ManifestEntryVerifier mev = ((ManifestEntryVerifier) createInstance("sun.security.util.ManifestEntryVerifier"));
        JarEntry entry = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        java.security.CodeSigner[] signers = {null};
        setField(entry, "java.util.jar.JarEntry", "signers", signers);
        setField(mev, "sun.security.util.ManifestEntryVerifier", "entry", entry);
        setField(in1, "java.util.jar.JarInputStream", "mev", mev);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "totalBytesRead", 0L);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        int[][] obj = {};
        setField(curContext, "java.io.SerialCallbackContext", "obj", obj);
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateFormatClazz = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateFormatClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
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
        // 17 occurrences of:
        // Concrete execution failed
        
        // 10 occurrences of:
        // Default concrete execution failed
        
        // 9 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 8 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getLocale
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocale()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getLocale()}
 * @utbot.returnsFrom {@code return mLocale;}
 *  */
    @Test
    public void testGetLocale_ReturnMLocale() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        Locale actual = fastDateFormat.getLocale();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.parseObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseObject(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#parseObject(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#setIndex(int)}
 * @utbot.invokes {@link java.text.ParsePosition#setErrorIndex(int)}
 * @utbot.returnsFrom {@code return null;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return null;
 *  */
    @Test
    public void testParseObject_ThrowNullPointerException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        parsePosition.setErrorIndex(-255);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.parseObject] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDateFormat.parseObject(FastDateFormat.java:575) */
        fastDateFormat.parseObject(null, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#parseObject(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#setIndex(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pos.setIndex(0);
 *  */
    @Test
    public void testParseObject_ThrowNullPointerException_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.parseObject] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDateFormat.parseObject(FastDateFormat.java:575) */
        fastDateFormat.parseObject(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance
    
    ///region FUZZER: ERROR SUITE for method getDateTimeInstance(int, int, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getDateTimeInstance(int,int,java.util.Locale)}
     */
    @Test
    public void testGetDateTimeInstanceThrowsIAE() {
        Locale locale = new Locale("XZ");
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
            java.base/java.text.DateFormat.get(DateFormat.java:817)
            java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
            org.apache.commons.lang3.time.FormatCache.getPatternForStyle(FormatCache.java:202)
            org.apache.commons.lang3.time.FormatCache.getDateTimeInstance(FormatCache.java:124)
            org.apache.commons.lang3.time.FormatCache.getDateTimeInstance(FormatCache.java:143)
            org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:335) */
        FastDateFormat.getDateTimeInstance(2147483583, -1, locale);
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
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance
    
    ///region FUZZER: ERROR SUITE for method getDateTimeInstance(int, int, java.util.TimeZone, java.util.Locale)
    
    @Test
    public void testGetDateTimeInstanceByFuzzer() {
        Locale locale = new Locale("");
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
            java.base/java.text.DateFormat.get(DateFormat.java:817)
            java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
            org.apache.commons.lang3.time.FormatCache.getPatternForStyle(FormatCache.java:202)
            org.apache.commons.lang3.time.FormatCache.getDateTimeInstance(FormatCache.java:124)
            org.apache.commons.lang3.time.FormatCache.getDateTimeInstance(FormatCache.java:143)
            org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:369) */
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
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance
    
    ///region FUZZER: ERROR SUITE for method getDateTimeInstance(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getDateTimeInstance(int,int)}
     */
    @Test
    public void testGetDateTimeInstanceThrowsIAEWithCornerCase() {
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -3]
            java.base/java.text.DateFormat.get(DateFormat.java:817)
            java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
            org.apache.commons.lang3.time.FormatCache.getPatternForStyle(FormatCache.java:202)
            org.apache.commons.lang3.time.FormatCache.getDateTimeInstance(FormatCache.java:124)
            org.apache.commons.lang3.time.FormatCache.getDateTimeInstance(FormatCache.java:143)
            org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:319) */
        FastDateFormat.getDateTimeInstance(Integer.MAX_VALUE, -3);
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
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance
    
    ///region FUZZER: ERROR SUITE for method getDateTimeInstance(int, int, java.util.TimeZone)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getDateTimeInstance(int,int,java.util.TimeZone)}
     */
    @Test
    public void testGetDateTimeInstanceThrowsIAE1() {
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
            java.base/java.text.DateFormat.get(DateFormat.java:817)
            java.base/java.text.DateFormat.getDateTimeInstance(DateFormat.java:619)
            org.apache.commons.lang3.time.FormatCache.getPatternForStyle(FormatCache.java:202)
            org.apache.commons.lang3.time.FormatCache.getDateTimeInstance(FormatCache.java:124)
            org.apache.commons.lang3.time.FormatCache.getDateTimeInstance(FormatCache.java:143)
            org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:369)
            org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(FastDateFormat.java:352) */
        FastDateFormat.getDateTimeInstance(2147467263, -1, ((TimeZone) null));
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
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getTimeZone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimeZone()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getTimeZone()}
 * @utbot.returnsFrom {@code return mTimeZone;}
 *  */
    @Test
    public void testGetTimeZone_ReturnMTimeZone() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        TimeZone actual = fastDateFormat.getTimeZone();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getDateInstance
    
    ///region FUZZER: ERROR SUITE for method getDateInstance(int, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getDateInstance(int,java.util.Locale)}
     */
    @Test
    public void testGetDateInstanceThrowsIAE() {
        Locale locale = new Locale("", "XZ", "-3");
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.getDateInstance] produces [java.lang.IllegalArgumentException: Illegal date style -1]
            java.base/java.text.DateFormat.get(DateFormat.java:824)
            java.base/java.text.DateFormat.getDateInstance(DateFormat.java:570)
            org.apache.commons.lang3.time.FormatCache.getPatternForStyle(FormatCache.java:200)
            org.apache.commons.lang3.time.FormatCache.getDateTimeInstance(FormatCache.java:124)
            org.apache.commons.lang3.time.FormatCache.getDateInstance(FormatCache.java:160)
            org.apache.commons.lang3.time.FastDateFormat.getDateInstance(FastDateFormat.java:209) */
        FastDateFormat.getDateInstance(-1, locale);
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
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getDateInstance
    
    ///region FUZZER: ERROR SUITE for method getDateInstance(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getDateInstance(int)}
     */
    @Test
    public void testGetDateInstanceThrowsIAE1() {
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.getDateInstance] produces [java.lang.IllegalArgumentException: Illegal date style 2147483645]
            java.base/java.text.DateFormat.get(DateFormat.java:824)
            java.base/java.text.DateFormat.getDateInstance(DateFormat.java:570)
            org.apache.commons.lang3.time.FormatCache.getPatternForStyle(FormatCache.java:200)
            org.apache.commons.lang3.time.FormatCache.getDateTimeInstance(FormatCache.java:124)
            org.apache.commons.lang3.time.FormatCache.getDateInstance(FormatCache.java:160)
            org.apache.commons.lang3.time.FastDateFormat.getDateInstance(FastDateFormat.java:194) */
        FastDateFormat.getDateInstance(2147483645);
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
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getDateInstance
    
    ///region Errors report for getDateInstance
    
    public void testGetDateInstance_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getDateInstance
    
    ///region Errors report for getDateInstance
    
    public void testGetDateInstance_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getTimeInstance
    
    ///region Errors report for getTimeInstance
    
    public void testGetTimeInstance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getTimeInstance
    
    ///region Errors report for getTimeInstance
    
    public void testGetTimeInstance_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getTimeInstance
    
    ///region FUZZER: ERROR SUITE for method getTimeInstance(int, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getTimeInstance(int,java.util.Locale)}
     */
    @Test
    public void testGetTimeInstanceThrowsIAE() {
        Locale locale = new Locale("", "XZ", "-3");
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.getTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style -1]
            java.base/java.text.DateFormat.get(DateFormat.java:817)
            java.base/java.text.DateFormat.getTimeInstance(DateFormat.java:524)
            org.apache.commons.lang3.time.FormatCache.getPatternForStyle(FormatCache.java:198)
            org.apache.commons.lang3.time.FormatCache.getDateTimeInstance(FormatCache.java:124)
            org.apache.commons.lang3.time.FormatCache.getTimeInstance(FormatCache.java:177)
            org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(FastDateFormat.java:271) */
        FastDateFormat.getTimeInstance(-1, locale);
    }
    ///endregion
    
    ///region Errors report for getTimeInstance
    
    public void testGetTimeInstance_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getTimeInstance
    
    ///region FUZZER: ERROR SUITE for method getTimeInstance(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.time.FastDateFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getTimeInstance(int)}
     */
    @Test
    public void testGetTimeInstanceThrowsIAE1() {
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.getTimeInstance] produces [java.lang.IllegalArgumentException: Illegal time style 2147483645]
            java.base/java.text.DateFormat.get(DateFormat.java:817)
            java.base/java.text.DateFormat.getTimeInstance(DateFormat.java:524)
            org.apache.commons.lang3.time.FormatCache.getPatternForStyle(FormatCache.java:198)
            org.apache.commons.lang3.time.FormatCache.getDateTimeInstance(FormatCache.java:124)
            org.apache.commons.lang3.time.FormatCache.getTimeInstance(FormatCache.java:177)
            org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(FastDateFormat.java:256) */
        FastDateFormat.getTimeInstance(2147483645);
    }
    ///endregion
    
    ///region Errors report for getTimeInstance
    
    public void testGetTimeInstance_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.selectNumberRule
    
    ///region Errors report for selectNumberRule
    
    public void testSelectNumberRule_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.parseToken
    
    ///region Errors report for parseToken
    
    public void testParseToken_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.applyRules
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method applyRules(java.util.Calendar, java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.returnsFrom {@code return buf;}
 *  */
    @Test
    public void testApplyRules_ReturnBuf() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 0);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mRules", mRules);
        
        StringBuffer actual = fastDateFormat.applyRules(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method applyRules(java.util.Calendar, java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: rules[i].appendTo(buf, calendar);
 *  */
    @Test
    public void testApplyRules_ThrowIndexOutOfBoundsException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 1);
        Object twoDigitMonthField = createInstance("org.apache.commons.lang3.time.FastDateFormat$TwoDigitMonthField");
        mRules[0] = twoDigitMonthField;
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mRules", mRules);
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        int[] fields = {};
        setField(buddhistCalendar, "java.util.Calendar", "fields", fields);
        setField(buddhistCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(buddhistCalendar, "java.util.Calendar", "areFieldsSet", true);
        setField(buddhistCalendar, "java.util.Calendar", "areAllFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.applyRules] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.applyRules(buddhistCalendar, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testApplyRules_ThrowIndexOutOfBoundsException_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 1);
        Object twoDigitMonthField = createInstance("org.apache.commons.lang3.time.FastDateFormat$TwoDigitMonthField");
        mRules[0] = twoDigitMonthField;
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mRules", mRules);
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        int[] stamp = {1};
        setField(buddhistCalendar, "java.util.Calendar", "stamp", stamp);
        buddhistCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.applyRules] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.applyRules(buddhistCalendar, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testApplyRules_ThrowIndexOutOfBoundsException_2() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 1);
        Object twoDigitMonthField = createInstance("org.apache.commons.lang3.time.FastDateFormat$TwoDigitMonthField");
        mRules[0] = twoDigitMonthField;
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mRules", mRules);
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        int[] stamp = {0, -2147483616, -2147483616, -2147483616, 0, -2147483616, -2147483616, -2147483616};
        setField(buddhistCalendar, "java.util.Calendar", "stamp", stamp);
        buddhistCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.applyRules] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.applyRules(buddhistCalendar, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testApplyRules_ThrowIndexOutOfBoundsException_3() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 1);
        Object twoDigitMonthField = createInstance("org.apache.commons.lang3.time.FastDateFormat$TwoDigitMonthField");
        mRules[0] = twoDigitMonthField;
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mRules", mRules);
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        int[] originalFields = {0};
        setField(buddhistCalendar, "java.util.GregorianCalendar", "originalFields", originalFields);
        setField(buddhistCalendar, "java.util.Calendar", "fields", originalFields);
        int[] stamp = {};
        setField(buddhistCalendar, "java.util.Calendar", "stamp", stamp);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.applyRules] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.applyRules(buddhistCalendar, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testApplyRules_ThrowIndexOutOfBoundsException_4() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 1);
        Object twoDigitMonthField = createInstance("org.apache.commons.lang3.time.FastDateFormat$TwoDigitMonthField");
        mRules[0] = twoDigitMonthField;
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mRules", mRules);
        BuddhistCalendar buddhistCalendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        int[] originalFields = {};
        setField(buddhistCalendar, "java.util.GregorianCalendar", "originalFields", originalFields);
        int[] fields = {1};
        setField(buddhistCalendar, "java.util.Calendar", "fields", fields);
        setField(buddhistCalendar, "java.util.Calendar", "stamp", fields);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.applyRules] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fastDateFormat.applyRules(buddhistCalendar, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rules[i].appendTo(buf, calendar);
 *  */
    @Test
    public void testApplyRules_ThrowNullPointerException() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 1);
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mRules", mRules);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.applyRules] produces [java.lang.NullPointerException] */
        fastDateFormat.applyRules(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int len = mRules.length;
 *  */
    @Test
    public void testApplyRules_ThrowNullPointerException_1() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateFormat.applyRules] produces [java.lang.NullPointerException] */
        fastDateFormat.applyRules(null, null);
    }
    ///endregion
    
    ///region Errors report for applyRules
    
    public void testApplyRules_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay
    
    ///region Errors report for getTimeZoneDisplay
    
    public void testGetTimeZoneDisplay_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed
        
        // 4 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleServiceProviderPool.poolOfPools accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getDefaultPattern
    
    ///region Errors report for getDefaultPattern
    
    public void testGetDefaultPattern_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getTimeZoneOverridesCalendar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimeZoneOverridesCalendar()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getTimeZoneOverridesCalendar()}
 * @utbot.returnsFrom {@code return mTimeZoneForced;}
 *  */
    @Test
    public void testGetTimeZoneOverridesCalendar_ReturnMTimeZoneForced() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        
        boolean actual = fastDateFormat.getTimeZoneOverridesCalendar();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateFormat.getMaxLengthEstimate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxLengthEstimate()
    
    /**
    @utbot.classUnderTest {@link FastDateFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateFormat#getMaxLengthEstimate()}
 * @utbot.returnsFrom {@code return mMaxLengthEstimate;}
 *  */
    @Test
    public void testGetMaxLengthEstimate_ReturnMMaxLengthEstimate() throws Exception  {
        FastDateFormat fastDateFormat = ((FastDateFormat) createInstance("org.apache.commons.lang3.time.FastDateFormat"));
        setField(fastDateFormat, "org.apache.commons.lang3.time.FastDateFormat", "mMaxLengthEstimate", -255);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields628584122817100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields628584122817100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass628584122825600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields628584122817100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass628584122825600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields628584123179600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields628584123179600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass628584123185200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields628584123179600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass628584123185200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

