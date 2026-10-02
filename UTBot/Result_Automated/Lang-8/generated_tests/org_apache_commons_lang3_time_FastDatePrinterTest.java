package org.apache.commons.lang3.time;

import org.junit.Test;
import java.util.SimpleTimeZone;
import sun.util.calendar.ZoneInfo;
import java.util.Locale;
import sun.util.locale.BaseLocale;
import sun.util.locale.LocaleExtensions;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.lang.reflect.Method;
import java.io.ObjectInputStream;
import java.io.NotActiveException;
import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.util.zip.InflaterInputStream;
import java.io.IOException;
import java.util.jar.JarInputStream;
import java.util.jar.JarEntry;
import java.io.EOFException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_lang3_time_FastDatePrinterTest {
    ///region Test suites for executable org.apache.commons.lang3.time.FastDatePrinter.getPattern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPattern()
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#getPattern()}
 * @utbot.returnsFrom {@code return mPattern;}
 *  */
    @Test
    public void testGetPattern_ReturnMPattern() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        
        String actual = fastDatePrinter.getPattern();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDatePrinter.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDatePrinter == false): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_ObjInstanceOfFastDatePrinterEqualsFalse() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        
        boolean actual = fastDatePrinter.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDatePrinter == false): False}
 * @utbot.returnsFrom {@code return mPattern.equals(other.mPattern) && mTimeZone.equals(other.mTimeZone) && mLocale.equals(other.mLocale);}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfFastDatePrinterNotEqualsFalse() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = " ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        FastDatePrinter fastDatePrinter1 = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        
        boolean actual = fastDatePrinter.equals(fastDatePrinter1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDatePrinter == false): False}
 * @utbot.returnsFrom {@code return mPattern.equals(other.mPattern) && mTimeZone.equals(other.mTimeZone) && mLocale.equals(other.mLocale);}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfFastDatePrinterNotEqualsFalse_1() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = "  ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        FastDatePrinter fastDatePrinter1 = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern1 = "\u0000";
        setField(fastDatePrinter1, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern1);
        
        boolean actual = fastDatePrinter.equals(fastDatePrinter1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDatePrinter == false): False}
 * @utbot.returnsFrom {@code return mPattern.equals(other.mPattern) && mTimeZone.equals(other.mTimeZone) && mLocale.equals(other.mLocale);}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfFastDatePrinterNotEqualsFalse_2() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = " ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(mTimeZone, "java.util.SimpleTimeZone", "useDaylight", true);
        mTimeZone.setID(mPattern);
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mTimeZone", mTimeZone);
        FastDatePrinter fastDatePrinter1 = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        setField(fastDatePrinter1, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        SimpleTimeZone mTimeZone1 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        mTimeZone1.setID(mPattern);
        setField(fastDatePrinter1, "org.apache.commons.lang3.time.FastDatePrinter", "mTimeZone", mTimeZone1);
        
        boolean actual = fastDatePrinter.equals(fastDatePrinter1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDatePrinter == false): False}
 * @utbot.returnsFrom {@code return mPattern.equals(other.mPattern) && mTimeZone.equals(other.mTimeZone) && mLocale.equals(other.mLocale);}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfFastDatePrinterNotEqualsFalse_4() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = " ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        mTimeZone.setRawOffset(2056);
        setField(mTimeZone, "sun.util.calendar.ZoneInfo", "rawOffsetDiff", 256);
        setField(mTimeZone, "sun.util.calendar.ZoneInfo", "checksum", -1);
        mTimeZone.setID(mPattern);
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mTimeZone", mTimeZone);
        FastDatePrinter fastDatePrinter1 = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        setField(fastDatePrinter1, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        ZoneInfo mTimeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        mTimeZone1.setRawOffset(2312);
        mTimeZone1.setID(mPattern);
        setField(fastDatePrinter1, "org.apache.commons.lang3.time.FastDatePrinter", "mTimeZone", mTimeZone1);
        
        boolean actual = fastDatePrinter.equals(fastDatePrinter1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDatePrinter == false): False}
 * @utbot.returnsFrom {@code return mPattern.equals(other.mPattern) && mTimeZone.equals(other.mTimeZone) && mLocale.equals(other.mLocale);}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfFastDatePrinterNotEqualsFalse_3() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = " ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mTimeZone", mTimeZone);
        FastDatePrinter fastDatePrinter1 = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        setField(fastDatePrinter1, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        
        boolean actual = fastDatePrinter.equals(fastDatePrinter1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj instanceof FastDatePrinter == false): False}
 * @utbot.invokes {@link java.util.Locale#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return mPattern.equals(other.mPattern) && mTimeZone.equals(other.mTimeZone) && mLocale.equals(other.mLocale);}
 *  */
    @Test
    public void testEquals_LocaleEquals() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = " ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mTimeZone", mTimeZone);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mLocale", mLocale);
        
        boolean actual = fastDatePrinter.equals(fastDatePrinter);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return mPattern.equals(other.mPattern) && mTimeZone.equals(other.mTimeZone) && mLocale.equals(other.mLocale);
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter.equals(FastDatePrinter.java:634) */
        fastDatePrinter.equals(fastDatePrinter);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mTimeZone.equals(other.mTimeZone)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_1() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = " ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        FastDatePrinter fastDatePrinter1 = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        setField(fastDatePrinter1, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter.equals(FastDatePrinter.java:635) */
        fastDatePrinter.equals(fastDatePrinter1);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mTimeZone.equals(other.mTimeZone)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_2() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = " ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        FastDatePrinter fastDatePrinter1 = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern1 = " ";
        setField(fastDatePrinter1, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern1);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter.equals(FastDatePrinter.java:635) */
        fastDatePrinter.equals(fastDatePrinter1);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.invokes {@link java.util.Locale#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mLocale.equals(other.mLocale)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_3() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = " ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mTimeZone", mTimeZone);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter.equals(FastDatePrinter.java:636) */
        fastDatePrinter.equals(fastDatePrinter);
    }
    ///endregion
    
    ///region Errors report for equals
    
    public void testEquals_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDatePrinter.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#hashCode()}
 * @utbot.returnsFrom {@code return mPattern.hashCode() + 13 * (mTimeZone.hashCode() + 13 * mLocale.hashCode());}
 *  */
    @Test
    public void testHashCode_ReturnMPatternHashCodePlus13MultiplyMTimeZoneHashCodePlus13MultiplyMLocaleHashCode() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = " ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mTimeZone", mTimeZone);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        setField(mLocale, "java.util.Locale", "hashCodeValue", -255);
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mLocale", mLocale);
        
        int actual = fastDatePrinter.hashCode();
        
        assertEquals(-43063, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#hashCode()}
 * @utbot.returnsFrom {@code return mPattern.hashCode() + 13 * (mTimeZone.hashCode() + 13 * mLocale.hashCode());}
 *  */
    @Test
    public void testHashCode_ReturnMPatternHashCodePlus13MultiplyMTimeZoneHashCodePlus13MultiplyMLocaleHashCode_1() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = " ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mTimeZone", mTimeZone);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(baseLocale, "sun.util.locale.BaseLocale", "hash", -255);
        setField(mLocale, "java.util.Locale", "baseLocale", baseLocale);
        LocaleExtensions localeExtensions = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        setField(localeExtensions, "sun.util.locale.LocaleExtensions", "id", mPattern);
        setField(mLocale, "java.util.Locale", "localeExtensions", localeExtensions);
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mLocale", mLocale);
        
        int actual = fastDatePrinter.hashCode();
        
        assertEquals(-83, actual);
        
        Locale fastDatePrinterMLocale = ((Locale) getFieldValue(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mLocale"));
        int finalFastDatePrinterMLocaleHashCodeValue = ((Integer) getFieldValue(fastDatePrinterMLocale, "java.util.Locale", "hashCodeValue"));
        
        assertEquals(-2, finalFastDatePrinterMLocaleHashCodeValue);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#hashCode()}
 * @utbot.returnsFrom {@code return mPattern.hashCode() + 13 * (mTimeZone.hashCode() + 13 * mLocale.hashCode());}
 *  */
    @Test
    public void testHashCode_ReturnMPatternHashCodePlus13MultiplyMTimeZoneHashCodePlus13MultiplyMLocaleHashCode_2() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = " ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mTimeZone", mTimeZone);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(baseLocale, "sun.util.locale.BaseLocale", "hash", -255);
        setField(mLocale, "java.util.Locale", "baseLocale", baseLocale);
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mLocale", mLocale);
        
        int actual = fastDatePrinter.hashCode();
        
        assertEquals(-42840, actual);
        
        Locale fastDatePrinterMLocale = ((Locale) getFieldValue(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mLocale"));
        int finalFastDatePrinterMLocaleHashCodeValue = ((Integer) getFieldValue(fastDatePrinterMLocale, "java.util.Locale", "hashCodeValue"));
        
        assertEquals(-255, finalFastDatePrinterMLocaleHashCodeValue);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#hashCode()}
 * @utbot.returnsFrom {@code return mPattern.hashCode() + 13 * (mTimeZone.hashCode() + 13 * mLocale.hashCode());}
 *  */
    @Test
    public void testHashCode_ReturnMPatternHashCodePlus13MultiplyMTimeZoneHashCodePlus13MultiplyMLocaleHashCode_3() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = " ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mTimeZone", mTimeZone);
        Locale mLocale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        String language = " ";
        setField(baseLocale, "sun.util.locale.BaseLocale", "language", language);
        setField(baseLocale, "sun.util.locale.BaseLocale", "script", mPattern);
        setField(baseLocale, "sun.util.locale.BaseLocale", "region", mPattern);
        setField(baseLocale, "sun.util.locale.BaseLocale", "variant", mPattern);
        setField(mLocale, "java.util.Locale", "baseLocale", baseLocale);
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mLocale", mLocale);
        
        int actual = fastDatePrinter.hashCode();
        
        assertEquals(1326636735, actual);
        
        Locale fastDatePrinterMLocale = ((Locale) getFieldValue(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mLocale"));
        BaseLocale fastDatePrinterMLocaleMLocaleBaseLocale = ((BaseLocale) getFieldValue(fastDatePrinterMLocale, "java.util.Locale", "baseLocale"));
        int finalFastDatePrinterMLocaleBaseLocaleHash = ((Integer) getFieldValue(fastDatePrinterMLocaleMLocaleBaseLocale, "sun.util.locale.BaseLocale", "hash"));
        Locale fastDatePrinterMLocale1 = ((Locale) getFieldValue(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mLocale"));
        int finalFastDatePrinterMLocaleHashCodeValue = ((Integer) getFieldValue(fastDatePrinterMLocale1, "java.util.Locale", "hashCodeValue"));
        
        assertEquals(7849920, finalFastDatePrinterMLocaleBaseLocaleHash);
        
        assertEquals(7849920, finalFastDatePrinterMLocaleHashCodeValue);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return mPattern.hashCode() + 13 * (mTimeZone.hashCode() + 13 * mLocale.hashCode());
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter.hashCode(FastDatePrinter.java:646) */
        fastDatePrinter.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return mPattern.hashCode() + 13 * (mTimeZone.hashCode() + 13 * mLocale.hashCode());
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_1() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = " ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter.hashCode(FastDatePrinter.java:646) */
        fastDatePrinter.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return mPattern.hashCode() + 13 * (mTimeZone.hashCode() + 13 * mLocale.hashCode());
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_2() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = " ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        SimpleTimeZone mTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mTimeZone", mTimeZone);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter.hashCode(FastDatePrinter.java:646) */
        fastDatePrinter.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return mPattern.hashCode() + 13 * (mTimeZone.hashCode() + 13 * mLocale.hashCode());
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_3() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String mPattern = " ";
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mPattern", mPattern);
        ZoneInfo mTimeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mTimeZone", mTimeZone);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.hashCode] produces [java.lang.NullPointerException] */
        fastDatePrinter.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDatePrinter.format
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method format(java.util.Calendar)
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#format(java.util.Calendar)}
 * @utbot.invokes {@link org.apache.commons.lang3.time.FastDatePrinter#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.invokes {@link java.lang.StringBuffer#toString()}
 * @utbot.returnsFrom {@code return format(calendar, new StringBuffer(mMaxLengthEstimate)).toString();}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return format(calendar, new StringBuffer(mMaxLengthEstimate)).toString();
 *  */
    @Test
    public void testFormat_ThrowNegativeArraySizeException() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 0);
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mRules", mRules);
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mMaxLengthEstimate", -255);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.format] produces [java.lang.NegativeArraySizeException: -255]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuilder.<init>(StringBuilder.java:119)
            org.apache.commons.lang3.time.FastDatePrinter.format(FastDatePrinter.java:481) */
        fastDatePrinter.format(((Calendar) null));
    }
    ///endregion
    
    ///region Errors report for format
    
    public void testFormat_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDatePrinter.format
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method format(java.util.Calendar, java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.invokes {@link org.apache.commons.lang3.time.FastDatePrinter#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.returnsFrom {@code return applyRules(calendar, buf);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return applyRules(calendar, buf);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 0);
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mRules", mRules);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.format] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter.format(FastDatePrinter.java:510) */
        fastDatePrinter.format(((Calendar) null), ((StringBuffer) null));
    }
    ///endregion
    
    ///region Errors report for format
    
    public void testFormat_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDatePrinter.format
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (obj instanceof Calendar): False}
 * @utbot.executesCondition {@code (obj instanceof Long): False}
 * @utbot.executesCondition {@code (obj == null): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: (obj == null ? "<null>" : obj.getClass().getName())
 *  */
    @Test
    public void testFormat_ThrowIllegalArgumentException() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.format] produces [java.lang.IllegalArgumentException: Unknown class: <null>]
            org.apache.commons.lang3.time.FastDatePrinter.format(FastDatePrinter.java:415) */
        fastDatePrinter.format(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (obj instanceof Calendar): True}
 * @utbot.invokes {@link org.apache.commons.lang3.time.FastDatePrinter#format(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.returnsFrom {@code return format((Calendar) obj, toAppendTo);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return format((Calendar) obj, toAppendTo);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException1() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 0);
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mRules", mRules);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.format] produces [java.lang.NullPointerException]
            java.base/java.util.concurrent.ConcurrentHashMap.putVal(ConcurrentHashMap.java:1011)
            java.base/java.util.concurrent.ConcurrentHashMap.putIfAbsent(ConcurrentHashMap.java:1541)
            java.base/sun.util.locale.provider.LocaleProviderAdapter.getAdapter(LocaleProviderAdapter.java:260)
            java.base/java.util.Calendar.createCalendar(Calendar.java:1688)
            java.base/java.util.Calendar.getInstance(Calendar.java:1671)
            org.apache.commons.lang3.time.FastDatePrinter.newCalendar(FastDatePrinter.java:463)
            org.apache.commons.lang3.time.FastDatePrinter.format(FastDatePrinter.java:499)
            org.apache.commons.lang3.time.FastDatePrinter.format(FastDatePrinter.java:510)
            org.apache.commons.lang3.time.FastDatePrinter.format(FastDatePrinter.java:410) */
        fastDatePrinter.format(gregorianCalendar, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDatePrinter.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: in.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.readObject] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter.readObject(FastDatePrinter.java:670) */
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDatePrinterClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(fastDatePrinter, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDatePrinterClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDatePrinter, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_1() throws Throwable  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDatePrinterClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDatePrinter, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_2() throws Throwable  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -255);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDatePrinterClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDatePrinter, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_3() throws Throwable  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 255);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", 256);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDatePrinterClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDatePrinter, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_4() throws Throwable  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", -255);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", -255);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        java.io.ObjectStreamField[] fields = {};
        setField(desc, "java.io.ObjectStreamClass", "fields", fields);
        setField(desc, "java.io.ObjectStreamClass", "numObjFields", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDatePrinterClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDatePrinter, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_5() throws Throwable  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object handles = createInstance("java.io.ObjectInputStream$HandleTable");
        byte[] status = {(byte) 0};
        setField(handles, "java.io.ObjectInputStream$HandleTable", "status", status);
        setField(objectInputStream, "java.io.ObjectInputStream", "handles", handles);
        setField(objectInputStream, "java.io.ObjectInputStream", "passHandle", Integer.MIN_VALUE);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        short[] obj = {};
        setField(curContext, "java.io.SerialCallbackContext", "obj", obj);
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "hasWriteObjectData", true);
        setField(desc, "java.io.ObjectStreamClass", "initialized", true);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDatePrinterClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDatePrinter, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_6() throws Throwable  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -255);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object handles = createInstance("java.io.ObjectInputStream$HandleTable");
        byte[] status = {(byte) -127};
        setField(handles, "java.io.ObjectInputStream$HandleTable", "status", status);
        setField(objectInputStream, "java.io.ObjectInputStream", "handles", handles);
        setField(objectInputStream, "java.io.ObjectInputStream", "passHandle", 1073741824);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "initialized", true);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDatePrinterClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDatePrinter, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_7() throws Throwable  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object handles = createInstance("java.io.ObjectInputStream$HandleTable");
        byte[] status = new byte[12];
        status[0] = (byte) 3;
        setField(handles, "java.io.ObjectInputStream$HandleTable", "status", status);
        java.lang.Object[] entries = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        entries[0] = object;
        setField(handles, "java.io.ObjectInputStream$HandleTable", "entries", entries);
        setField(objectInputStream, "java.io.ObjectInputStream", "handles", handles);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        byte[] obj = {};
        setField(curContext, "java.io.SerialCallbackContext", "obj", obj);
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "initialized", true);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDatePrinterClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDatePrinter, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException() throws Throwable  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
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
        
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDatePrinterClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDatePrinter, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.EOFException} in: in.defaultReadObject();
 *  */
    @Test(expected = EOFException.class)
    public void testReadObject_ThrowEOFException() throws Throwable  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        JarEntry first = ((JarEntry) createInstance("java.util.jar.JarEntry"));
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
        
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDatePrinterClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDatePrinter, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testReadObject_ThrowZipException() throws Throwable  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
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
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDatePrinterClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDatePrinter, readObjectMethodArguments);
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
        
        // 6 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDatePrinter.getLocale
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocale()
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#getLocale()}
 * @utbot.returnsFrom {@code return mLocale;}
 *  */
    @Test
    public void testGetLocale_ReturnMLocale() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        
        Locale actual = fastDatePrinter.getLocale();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDatePrinter.getTimeZone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimeZone()
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#getTimeZone()}
 * @utbot.returnsFrom {@code return mTimeZone;}
 *  */
    @Test
    public void testGetTimeZone_ReturnMTimeZone() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        
        TimeZone actual = fastDatePrinter.getTimeZone();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDatePrinter.getMaxLengthEstimate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxLengthEstimate()
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#getMaxLengthEstimate()}
 * @utbot.returnsFrom {@code return mMaxLengthEstimate;}
 *  */
    @Test
    public void testGetMaxLengthEstimate_ReturnMMaxLengthEstimate() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mMaxLengthEstimate", -255);
        
        int actual = fastDatePrinter.getMaxLengthEstimate();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#getTimeZoneDisplay(java.util.TimeZone,boolean,int,java.util.Locale)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link java.util.TimeZone#getDisplayName(boolean,int,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: value = tz.getDisplayName(daylight, style, locale);
 *  */
    @Test
    public void testGetTimeZoneDisplay_ThrowIllegalArgumentException() throws Exception  {
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        ConcurrentMap prevCTimeZoneDisplayCache = ((ConcurrentMap) getStaticFieldValue(fastDatePrinterClazz, "cTimeZoneDisplayCache"));
        try {
            ConcurrentSkipListMap cTimeZoneDisplayCache = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
            Object head = createInstance("java.util.concurrent.ConcurrentSkipListMap$Index");
            setField(cTimeZoneDisplayCache, "java.util.concurrent.ConcurrentSkipListMap", "head", head);
            setStaticField(fastDatePrinterClazz, "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
            
            /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay] produces [java.lang.IllegalArgumentException: Illegal style: -252]
                java.base/java.util.TimeZone.getDisplayName(TimeZone.java:399)
                org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(FastDatePrinter.java:1322) */
            FastDatePrinter.getTimeZoneDisplay(simpleTimeZone, false, -252, null);
        } finally {
            setStaticField(FastDatePrinter.class, "cTimeZoneDisplayCache", prevCTimeZoneDisplayCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#getTimeZoneDisplay(java.util.TimeZone,boolean,int,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetTimeZoneDisplay_ThrowClassCastException() throws Exception  {
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        ConcurrentMap prevCTimeZoneDisplayCache = ((ConcurrentMap) getStaticFieldValue(fastDatePrinterClazz, "cTimeZoneDisplayCache"));
        try {
            ConcurrentSkipListMap cTimeZoneDisplayCache = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
            Object head = createInstance("java.util.concurrent.ConcurrentSkipListMap$Index");
            Object down = createInstance("java.util.concurrent.ConcurrentSkipListMap$Index");
            Object node = createInstance("java.util.concurrent.ConcurrentSkipListMap$Node");
            short[] key = {};
            setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "key", key);
            Object val = createInstance("java.lang.Object");
            setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "val", val);
            setField(down, "java.util.concurrent.ConcurrentSkipListMap$Index", "node", node);
            setField(down, "java.util.concurrent.ConcurrentSkipListMap$Index", "right", down);
            setField(head, "java.util.concurrent.ConcurrentSkipListMap$Index", "down", down);
            setField(cTimeZoneDisplayCache, "java.util.concurrent.ConcurrentSkipListMap", "head", head);
            setStaticField(fastDatePrinterClazz, "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            
            /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay] produces [java.lang.ClassCastException: class org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey cannot be cast to class java.lang.Comparable (org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')]
                java.base/java.util.concurrent.ConcurrentSkipListMap.cpr(ConcurrentSkipListMap.java:393)
                java.base/java.util.concurrent.ConcurrentSkipListMap.doGet(ConcurrentSkipListMap.java:551)
                java.base/java.util.concurrent.ConcurrentSkipListMap.get(ConcurrentSkipListMap.java:1312)
                org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(FastDatePrinter.java:1319) */
            FastDatePrinter.getTimeZoneDisplay(null, false, -240, null);
        } finally {
            setStaticField(FastDatePrinter.class, "cTimeZoneDisplayCache", prevCTimeZoneDisplayCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#getTimeZoneDisplay(java.util.TimeZone,boolean,int,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetTimeZoneDisplay_ThrowClassCastException_1() throws Exception  {
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        ConcurrentMap prevCTimeZoneDisplayCache = ((ConcurrentMap) getStaticFieldValue(fastDatePrinterClazz, "cTimeZoneDisplayCache"));
        try {
            ConcurrentSkipListMap cTimeZoneDisplayCache = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
            Object head = createInstance("java.util.concurrent.ConcurrentSkipListMap$Index");
            Object node = createInstance("java.util.concurrent.ConcurrentSkipListMap$Node");
            short[] key = {};
            setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "key", key);
            Object val = createInstance("java.lang.Object");
            setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "val", val);
            setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "next", node);
            setField(head, "java.util.concurrent.ConcurrentSkipListMap$Index", "node", node);
            setField(cTimeZoneDisplayCache, "java.util.concurrent.ConcurrentSkipListMap", "head", head);
            setStaticField(fastDatePrinterClazz, "cTimeZoneDisplayCache", cTimeZoneDisplayCache);
            
            /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay] produces [java.lang.ClassCastException: class org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey cannot be cast to class java.lang.Comparable (org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')]
                java.base/java.util.concurrent.ConcurrentSkipListMap.cpr(ConcurrentSkipListMap.java:393)
                java.base/java.util.concurrent.ConcurrentSkipListMap.doGet(ConcurrentSkipListMap.java:569)
                java.base/java.util.concurrent.ConcurrentSkipListMap.get(ConcurrentSkipListMap.java:1312)
                org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(FastDatePrinter.java:1319) */
            FastDatePrinter.getTimeZoneDisplay(null, false, -255, null);
        } finally {
            setStaticField(FastDatePrinter.class, "cTimeZoneDisplayCache", prevCTimeZoneDisplayCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#getTimeZoneDisplay(java.util.TimeZone,boolean,int,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String value = cTimeZoneDisplayCache.get(key);
 *  */
    @Test
    public void testGetTimeZoneDisplay_ThrowNullPointerException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        ConcurrentMap prevCTimeZoneDisplayCache = ((ConcurrentMap) getStaticFieldValue(fastDatePrinterClazz, "cTimeZoneDisplayCache"));
        try {
            setStaticField(fastDatePrinterClazz, "cTimeZoneDisplayCache", null);
            
            /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay] produces [java.lang.NullPointerException]
                org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(FastDatePrinter.java:1319) */
            FastDatePrinter.getTimeZoneDisplay(null, false, -255, null);
        } finally {
            setStaticField(FastDatePrinter.class, "cTimeZoneDisplayCache", prevCTimeZoneDisplayCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#getTimeZoneDisplay(java.util.TimeZone,boolean,int,java.util.Locale)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String value = cTimeZoneDisplayCache.get(key);
 *  */
    @Test
    public void testGetTimeZoneDisplay_ThrowNullPointerException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class fastDatePrinterClazz = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        ConcurrentMap prevCTimeZoneDisplayCache = ((ConcurrentMap) getStaticFieldValue(fastDatePrinterClazz, "cTimeZoneDisplayCache"));
        try {
            setStaticField(fastDatePrinterClazz, "cTimeZoneDisplayCache", null);
            
            /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay] produces [java.lang.NullPointerException]
                org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(FastDatePrinter.java:1319) */
            FastDatePrinter.getTimeZoneDisplay(null, true, -255, null);
        } finally {
            setStaticField(FastDatePrinter.class, "cTimeZoneDisplayCache", prevCTimeZoneDisplayCache);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)
    
    @Test
    public void testGetTimeZoneDisplayByFuzzer() {
        Locale locale = new Locale("XZ");
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey.hashCode(FastDatePrinter.java:1553)
            java.base/java.util.concurrent.ConcurrentHashMap.get(ConcurrentHashMap.java:936)
            org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(FastDatePrinter.java:1319) */
        FastDatePrinter.getTimeZoneDisplay(null, false, -1, locale);
    }
    
    @Test
    public void testGetTimeZoneDisplayByFuzzer1() {
        Locale locale = new Locale("XZ");
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey.hashCode(FastDatePrinter.java:1553)
            java.base/java.util.concurrent.ConcurrentHashMap.get(ConcurrentHashMap.java:936)
            org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(FastDatePrinter.java:1319) */
        FastDatePrinter.getTimeZoneDisplay(null, false, Integer.MAX_VALUE, locale);
    }
    
    @Test
    public void testGetTimeZoneDisplayByFuzzer2() {
        Locale locale = new Locale("XZ");
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey.hashCode(FastDatePrinter.java:1553)
            java.base/java.util.concurrent.ConcurrentHashMap.get(ConcurrentHashMap.java:936)
            org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(FastDatePrinter.java:1319) */
        FastDatePrinter.getTimeZoneDisplay(null, true, Integer.MAX_VALUE, locale);
    }
    
    @Test
    public void testGetTimeZoneDisplayByFuzzer3() {
        Locale locale = new Locale("XZ");
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey.hashCode(FastDatePrinter.java:1553)
            java.base/java.util.concurrent.ConcurrentHashMap.get(ConcurrentHashMap.java:936)
            org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(FastDatePrinter.java:1319) */
        FastDatePrinter.getTimeZoneDisplay(null, true, -1, locale);
    }
    
    @Test
    public void testGetTimeZoneDisplayByFuzzer4() {
        Locale locale = new Locale("XZ");
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey.hashCode(FastDatePrinter.java:1553)
            java.base/java.util.concurrent.ConcurrentHashMap.get(ConcurrentHashMap.java:936)
            org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(FastDatePrinter.java:1319) */
        FastDatePrinter.getTimeZoneDisplay(null, false, -1, locale);
    }
    ///endregion
    
    ///region Errors report for getTimeZoneDisplay
    
    public void testGetTimeZoneDisplay_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleServiceProviderPool.poolOfPools accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
        // 11 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDatePrinter.selectNumberRule
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method selectNumberRule(int, int)
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#selectNumberRule(int,int)}
 * @utbot.activatesSwitch {@code switch(padding) case: 1}
 * @utbot.returnsFrom {@code return new UnpaddedNumberField(field);}
 *  */
    @Test
    public void testSelectNumberRule_Return() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        
        Object actual = fastDatePrinter.selectNumberRule(-255, 1);
        
        Object expected = createInstance("org.apache.commons.lang3.time.FastDatePrinter$UnpaddedNumberField");
        
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#selectNumberRule(int,int)}
 * @utbot.activatesSwitch {@code switch(padding) case: 2}
 * @utbot.returnsFrom {@code return new TwoDigitNumberField(field);}
 *  */
    @Test
    public void testSelectNumberRule_Return_1() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        
        Object actual = fastDatePrinter.selectNumberRule(-255, 2);
        
        Object expected = createInstance("org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField");
        
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#selectNumberRule(int,int)}
 * @utbot.activatesSwitch {@code switch(padding) case: default}
 * @utbot.returnsFrom {@code return new PaddedNumberField(field, padding);}
 *  */
    @Test
    public void testSelectNumberRule_Return_2() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        
        Object actual = fastDatePrinter.selectNumberRule(-255, 3);
        
        Object expected = createInstance("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method selectNumberRule(int, int)
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#selectNumberRule(int,int)}
 * @utbot.activatesSwitch {@code switch(padding) case: default}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new PaddedNumberField(field, padding);
 *  */
    @Test
    public void testSelectNumberRule_ThrowIllegalArgumentException() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.selectNumberRule] produces [java.lang.IllegalArgumentException]
            org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField.<init>(FastDatePrinter.java:1010)
            org.apache.commons.lang3.time.FastDatePrinter.selectNumberRule(FastDatePrinter.java:389) */
        fastDatePrinter.selectNumberRule(-255, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDatePrinter.parseToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method parseToken(java.lang.String, [I)
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c >= 'A'): False}
 * @utbot.executesCondition {@code (c >= 'a'): False}
 * @utbot.iterates iterate the loop {@code for(; i < length; i++)} twice
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_InLiteral() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String string = "' ";
        int[] intArray = {0};
        
        String actual = fastDatePrinter.parseToken(string, intArray);
        
        String expected = "' ";
        
        assertEquals(expected, actual);
        
        int finalIntArray0 = intArray[0];
        
        assertEquals(2, finalIntArray0);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c >= 'A'): False}
 * @utbot.executesCondition {@code (c >= 'a'): False}
 * @utbot.iterates iterate the loop {@code for(; i < length; i++)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_IPlus1GreaterOrEqualLength() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String string = "'";
        int[] intArray = {0};
        
        String actual = fastDatePrinter.parseToken(string, intArray);
        
        String expected = "'";
        
        assertEquals(expected, actual);
        
        int finalIntArray0 = intArray[0];
        
        assertEquals(1, finalIntArray0);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c >= 'A'): False}
 * @utbot.executesCondition {@code (c >= 'a'): False}
 * @utbot.iterates iterate the loop {@code for(; i < length; i++)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_CLessThanA() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String string = "@";
        int[] intArray = {0};
        
        String actual = fastDatePrinter.parseToken(string, intArray);
        
        String expected = "'@";
        
        assertEquals(expected, actual);
        
        int finalIntArray0 = intArray[0];
        
        assertEquals(1, finalIntArray0);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c >= 'A'): True}
 * @utbot.executesCondition {@code (c <= 'Z'): False}
 * @utbot.executesCondition {@code (c >= 'a'): True}
 * @utbot.executesCondition {@code (c <= 'z'): False}
 * @utbot.iterates iterate the loop {@code for(; i < length; i++)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_CGreaterThanZ() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String string = "{";
        int[] intArray = {0};
        
        String actual = fastDatePrinter.parseToken(string, intArray);
        
        String expected = "'{";
        
        assertEquals(expected, actual);
        
        int finalIntArray0 = intArray[0];
        
        assertEquals(1, finalIntArray0);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c >= 'A'): True}
 * @utbot.executesCondition {@code (c <= 'Z'): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.iterates iterate the loop {@code while(i + 1 < length)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_PeekEqualsC() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String string = "AA";
        int[] intArray = {0};
        
        String actual = fastDatePrinter.parseToken(string, intArray);
        
        String expected = "AA";
        
        assertEquals(expected, actual);
        
        int finalIntArray0 = intArray[0];
        
        assertEquals(1, finalIntArray0);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c >= 'A'): False}
 * @utbot.executesCondition {@code (c >= 'a'): False}
 * @utbot.iterates iterate the loop {@code for(; i < length; i++)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_PatternCharAtEqualsChar() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String string = "''";
        int[] intArray = {0};
        
        String actual = fastDatePrinter.parseToken(string, intArray);
        
        String expected = "''";
        
        assertEquals(expected, actual);
        
        int finalIntArray0 = intArray[0];
        
        assertEquals(2, finalIntArray0);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c >= 'A'): False}
 * @utbot.executesCondition {@code (c >= 'a'): False}
 * @utbot.iterates iterate the loop {@code for(; i < length; i++)} twice
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_CLessOrEqualZ() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String string = "@A";
        int[] intArray = {0, -255};
        
        String actual = fastDatePrinter.parseToken(string, intArray);
        
        String expected = "'@";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c >= 'A'): False}
 * @utbot.executesCondition {@code (c >= 'a'): False}
 * @utbot.iterates iterate the loop {@code for(; i < length; i++)} twice
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_CLessOrEqualZ_1() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String string = "@a";
        int[] intArray = {0, -255};
        
        String actual = fastDatePrinter.parseToken(string, intArray);
        
        String expected = "'@";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method parseToken(java.lang.String, [I)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (c >= 'A'): True}
    /// invoke:
    ///     {@link java.lang.StringBuilder#append(char)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c <= 'Z'): True}
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_CLessOrEqualZ_2() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String string = "A";
        int[] intArray = {0};
        
        String actual = fastDatePrinter.parseToken(string, intArray);
        
        String expected = "A";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c <= 'Z'): False}
 * @utbot.executesCondition {@code (c >= 'a'): True}
 * @utbot.executesCondition {@code (c <= 'z'): True}
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_IPlus1GreaterOrEqualLength_1() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String string = "a";
        int[] intArray = {0};
        
        String actual = fastDatePrinter.parseToken(string, intArray);
        
        String expected = "a";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#parseToken(java.lang.String,int[])}
 * @utbot.executesCondition {@code (c <= 'Z'): False}
 * @utbot.executesCondition {@code (c >= 'a'): True}
 * @utbot.executesCondition {@code (c <= 'z'): True}
 * @utbot.iterates iterate the loop {@code while(i + 1 < length)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testParseToken_PeekNotEqualsC() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String string = "a ";
        int[] intArray = {0};
        
        String actual = fastDatePrinter.parseToken(string, intArray);
        
        String expected = "a";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseToken(java.lang.String, [I)
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#parseToken(java.lang.String,int[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int i = indexRef[0];
 *  */
    @Test
    public void testParseToken_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.parseToken] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.lang3.time.FastDatePrinter.parseToken(FastDatePrinter.java:326) */
        fastDatePrinter.parseToken(null, intArray);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#parseToken(java.lang.String,int[])}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = pattern.charAt(i);
 *  */
    @Test
    public void testParseToken_ThrowStringIndexOutOfBoundsException() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        String string = "  ";
        int[] intArray = {-255};
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.parseToken] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang3.time.FastDatePrinter.parseToken(FastDatePrinter.java:329) */
        fastDatePrinter.parseToken(string, intArray);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#parseToken(java.lang.String,int[])}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int length = pattern.length();
 *  */
    @Test
    public void testParseToken_ThrowNullPointerException() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        int[] intArray = {-255};
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.parseToken] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter.parseToken(FastDatePrinter.java:327) */
        fastDatePrinter.parseToken(null, intArray);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#parseToken(java.lang.String,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int i = indexRef[0];
 *  */
    @Test
    public void testParseToken_ThrowNullPointerException_1() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.parseToken] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter.parseToken(FastDatePrinter.java:326) */
        fastDatePrinter.parseToken(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDatePrinter.applyRules
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method applyRules(java.util.Calendar, java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.returnsFrom {@code return buf;}
 *  */
    @Test
    public void testApplyRules_ReturnBuf() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 0);
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mRules", mRules);
        
        StringBuffer actual = fastDatePrinter.applyRules(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method applyRules(java.util.Calendar, java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.iterates iterate the loop {@code for(Rule rule: mRules)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rule.appendTo(buf, calendar);
 *  */
    @Test
    public void testApplyRules_ThrowNullPointerException() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        java.lang.Object[] mRules = createArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 1);
        setField(fastDatePrinter, "org.apache.commons.lang3.time.FastDatePrinter", "mRules", mRules);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.applyRules] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter.applyRules(FastDatePrinter.java:573)
            org.apache.commons.lang3.time.FastDatePrinter.applyRules(FastDatePrinter.java:558) */
        fastDatePrinter.applyRules(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDatePrinter}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDatePrinter#applyRules(java.util.Calendar,java.lang.StringBuffer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Rule rule: mRules)
 *  */
    @Test
    public void testApplyRules_ThrowNullPointerException_1() throws Exception  {
        FastDatePrinter fastDatePrinter = ((FastDatePrinter) createInstance("org.apache.commons.lang3.time.FastDatePrinter"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDatePrinter.applyRules] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDatePrinter.applyRules(FastDatePrinter.java:572)
            org.apache.commons.lang3.time.FastDatePrinter.applyRules(FastDatePrinter.java:558) */
        fastDatePrinter.applyRules(null, null);
    }
    ///endregion
    
    ///region Errors report for applyRules
    
    public void testApplyRules_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields678890050712100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields678890050712100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass678890050719500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields678890050712100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass678890050719500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields678890051127700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields678890051127700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass678890051130700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields678890051127700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass678890051130700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields678890051496800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields678890051496800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass678890051499000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields678890051496800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass678890051499000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields678890052040500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields678890052040500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass678890052044300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields678890052040500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass678890052044300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

