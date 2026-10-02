package org.apache.commons.lang3.time;

import org.junit.Test;
import java.util.SimpleTimeZone;
import sun.util.calendar.ZoneInfo;
import java.util.Locale;
import sun.util.locale.BaseLocale;
import sun.util.locale.LocaleExtensions;
import java.lang.reflect.Method;
import java.io.NotActiveException;
import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.io.ObjectInputStream;
import java.util.jar.JarInputStream;
import java.io.EOFException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.regex.Pattern;
import java.text.ParsePosition;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentSkipListMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_lang3_time_FastDateParserTest {
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.getPattern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPattern()
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#getPattern()}
 * @utbot.returnsFrom {@code return pattern;}
 *  */
    @Test
    public void testGetPattern_ReturnPattern() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        
        String actual = fastDateParser.getPattern();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(obj instanceof FastDateParser)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfFastDateParser() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        
        boolean actual = fastDateParser.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(obj instanceof FastDateParser)): False}
 * @utbot.returnsFrom {@code return pattern.equals(other.pattern) && timeZone.equals(other.timeZone) && locale.equals(other.locale);}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfFastDateParser() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = " ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        FastDateParser fastDateParser1 = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        
        boolean actual = fastDateParser.equals(fastDateParser1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(obj instanceof FastDateParser)): False}
 * @utbot.returnsFrom {@code return pattern.equals(other.pattern) && timeZone.equals(other.timeZone) && locale.equals(other.locale);}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfFastDateParser_1() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = "  ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        FastDateParser fastDateParser1 = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern1 = "\u0000";
        setField(fastDateParser1, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern1);
        
        boolean actual = fastDateParser.equals(fastDateParser1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(obj instanceof FastDateParser)): False}
 * @utbot.returnsFrom {@code return pattern.equals(other.pattern) && timeZone.equals(other.timeZone) && locale.equals(other.locale);}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfFastDateParser_2() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = " ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        SimpleTimeZone timeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(timeZone, "java.util.SimpleTimeZone", "useDaylight", true);
        timeZone.setID(pattern);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "timeZone", timeZone);
        FastDateParser fastDateParser1 = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        setField(fastDateParser1, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        SimpleTimeZone timeZone1 = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        timeZone1.setID(pattern);
        setField(fastDateParser1, "org.apache.commons.lang3.time.FastDateParser", "timeZone", timeZone1);
        
        boolean actual = fastDateParser.equals(fastDateParser1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(obj instanceof FastDateParser)): False}
 * @utbot.returnsFrom {@code return pattern.equals(other.pattern) && timeZone.equals(other.timeZone) && locale.equals(other.locale);}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfFastDateParser_4() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = "  ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        ZoneInfo timeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        timeZone.setRawOffset(32);
        setField(timeZone, "sun.util.calendar.ZoneInfo", "rawOffsetDiff", 268435712);
        setField(timeZone, "sun.util.calendar.ZoneInfo", "checksum", -1);
        timeZone.setID(pattern);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "timeZone", timeZone);
        FastDateParser fastDateParser1 = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        setField(fastDateParser1, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        ZoneInfo timeZone1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        timeZone1.setRawOffset(Integer.MIN_VALUE);
        setField(timeZone1, "sun.util.calendar.ZoneInfo", "rawOffsetDiff", -1879047904);
        timeZone1.setID(pattern);
        setField(fastDateParser1, "org.apache.commons.lang3.time.FastDateParser", "timeZone", timeZone1);
        
        boolean actual = fastDateParser.equals(fastDateParser1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(obj instanceof FastDateParser)): False}
 * @utbot.returnsFrom {@code return pattern.equals(other.pattern) && timeZone.equals(other.timeZone) && locale.equals(other.locale);}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfFastDateParser_3() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = " ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        SimpleTimeZone timeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "timeZone", timeZone);
        FastDateParser fastDateParser1 = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        setField(fastDateParser1, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        
        boolean actual = fastDateParser.equals(fastDateParser1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(obj instanceof FastDateParser)): False}
 * @utbot.invokes {@link java.util.Locale#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return pattern.equals(other.pattern) && timeZone.equals(other.timeZone) && locale.equals(other.locale);}
 *  */
    @Test
    public void testEquals_LocaleEquals() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = " ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        SimpleTimeZone timeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "timeZone", timeZone);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "locale", locale);
        
        boolean actual = fastDateParser.equals(fastDateParser);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return pattern.equals(other.pattern) && timeZone.equals(other.timeZone) && locale.equals(other.locale);
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDateParser.equals(FastDateParser.java:298) */
        fastDateParser.equals(fastDateParser);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: timeZone.equals(other.timeZone)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_1() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = " ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        FastDateParser fastDateParser1 = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        setField(fastDateParser1, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDateParser.equals(FastDateParser.java:299) */
        fastDateParser.equals(fastDateParser1);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: timeZone.equals(other.timeZone)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_2() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = " ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        FastDateParser fastDateParser1 = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern1 = " ";
        setField(fastDateParser1, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern1);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDateParser.equals(FastDateParser.java:299) */
        fastDateParser.equals(fastDateParser1);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.invokes {@link java.util.Locale#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: locale.equals(other.locale)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_3() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = " ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        SimpleTimeZone timeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "timeZone", timeZone);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.equals] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDateParser.equals(FastDateParser.java:300) */
        fastDateParser.equals(fastDateParser);
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
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#hashCode()}
 * @utbot.returnsFrom {@code return pattern.hashCode() + 13 * (timeZone.hashCode() + 13 * locale.hashCode());}
 *  */
    @Test
    public void testHashCode_ReturnPatternHashCodePlus13MultiplyTimeZoneHashCodePlus13MultiplyLocaleHashCode() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = " ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        SimpleTimeZone timeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "timeZone", timeZone);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        setField(locale, "java.util.Locale", "hashCodeValue", -255);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "locale", locale);
        
        int actual = fastDateParser.hashCode();
        
        assertEquals(-43063, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#hashCode()}
 * @utbot.returnsFrom {@code return pattern.hashCode() + 13 * (timeZone.hashCode() + 13 * locale.hashCode());}
 *  */
    @Test
    public void testHashCode_ReturnPatternHashCodePlus13MultiplyTimeZoneHashCodePlus13MultiplyLocaleHashCode_1() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = " ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        SimpleTimeZone timeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "timeZone", timeZone);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(baseLocale, "sun.util.locale.BaseLocale", "hash", -255);
        setField(locale, "java.util.Locale", "baseLocale", baseLocale);
        LocaleExtensions localeExtensions = ((LocaleExtensions) createInstance("sun.util.locale.LocaleExtensions"));
        setField(localeExtensions, "sun.util.locale.LocaleExtensions", "id", pattern);
        setField(locale, "java.util.Locale", "localeExtensions", localeExtensions);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "locale", locale);
        
        int actual = fastDateParser.hashCode();
        
        assertEquals(-83, actual);
        
        Locale fastDateParserLocale = ((Locale) getFieldValue(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "locale"));
        int finalFastDateParserLocaleHashCodeValue = ((Integer) getFieldValue(fastDateParserLocale, "java.util.Locale", "hashCodeValue"));
        
        assertEquals(-2, finalFastDateParserLocaleHashCodeValue);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#hashCode()}
 * @utbot.returnsFrom {@code return pattern.hashCode() + 13 * (timeZone.hashCode() + 13 * locale.hashCode());}
 *  */
    @Test
    public void testHashCode_ReturnPatternHashCodePlus13MultiplyTimeZoneHashCodePlus13MultiplyLocaleHashCode_2() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = " ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        SimpleTimeZone timeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "timeZone", timeZone);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(baseLocale, "sun.util.locale.BaseLocale", "hash", -255);
        setField(locale, "java.util.Locale", "baseLocale", baseLocale);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "locale", locale);
        
        int actual = fastDateParser.hashCode();
        
        assertEquals(-42840, actual);
        
        Locale fastDateParserLocale = ((Locale) getFieldValue(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "locale"));
        int finalFastDateParserLocaleHashCodeValue = ((Integer) getFieldValue(fastDateParserLocale, "java.util.Locale", "hashCodeValue"));
        
        assertEquals(-255, finalFastDateParserLocaleHashCodeValue);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#hashCode()}
 * @utbot.returnsFrom {@code return pattern.hashCode() + 13 * (timeZone.hashCode() + 13 * locale.hashCode());}
 *  */
    @Test
    public void testHashCode_ReturnPatternHashCodePlus13MultiplyTimeZoneHashCodePlus13MultiplyLocaleHashCode_3() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = " ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        SimpleTimeZone timeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "timeZone", timeZone);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        String language = " ";
        setField(baseLocale, "sun.util.locale.BaseLocale", "language", language);
        setField(baseLocale, "sun.util.locale.BaseLocale", "script", pattern);
        setField(baseLocale, "sun.util.locale.BaseLocale", "region", pattern);
        setField(baseLocale, "sun.util.locale.BaseLocale", "variant", pattern);
        setField(locale, "java.util.Locale", "baseLocale", baseLocale);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "locale", locale);
        
        int actual = fastDateParser.hashCode();
        
        assertEquals(1326636735, actual);
        
        Locale fastDateParserLocale = ((Locale) getFieldValue(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "locale"));
        BaseLocale fastDateParserLocaleLocaleBaseLocale = ((BaseLocale) getFieldValue(fastDateParserLocale, "java.util.Locale", "baseLocale"));
        int finalFastDateParserLocaleBaseLocaleHash = ((Integer) getFieldValue(fastDateParserLocaleLocaleBaseLocale, "sun.util.locale.BaseLocale", "hash"));
        Locale fastDateParserLocale1 = ((Locale) getFieldValue(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "locale"));
        int finalFastDateParserLocaleHashCodeValue = ((Integer) getFieldValue(fastDateParserLocale1, "java.util.Locale", "hashCodeValue"));
        
        assertEquals(7849920, finalFastDateParserLocaleBaseLocaleHash);
        
        assertEquals(7849920, finalFastDateParserLocaleHashCodeValue);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return pattern.hashCode() + 13 * (timeZone.hashCode() + 13 * locale.hashCode());
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDateParser.hashCode(FastDateParser.java:310) */
        fastDateParser.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return pattern.hashCode() + 13 * (timeZone.hashCode() + 13 * locale.hashCode());
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_1() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = " ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDateParser.hashCode(FastDateParser.java:310) */
        fastDateParser.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return pattern.hashCode() + 13 * (timeZone.hashCode() + 13 * locale.hashCode());
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_2() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = " ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        SimpleTimeZone timeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "timeZone", timeZone);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDateParser.hashCode(FastDateParser.java:310) */
        fastDateParser.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return pattern.hashCode() + 13 * (timeZone.hashCode() + 13 * locale.hashCode());
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_3() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String pattern = " ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "pattern", pattern);
        ZoneInfo timeZone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "timeZone", timeZone);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.hashCode] produces [java.lang.NullPointerException] */
        fastDateParser.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.toArray
    
    ///region Errors report for toArray
    
    public void testToArray_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.count
    
    ///region Errors report for count
    
    public void testCount_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.init
    
    ///region Errors report for init
    
    public void testInit_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: in.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.readObject] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.time.FastDateParser.readObject(FastDateParser.java:334) */
        Class fastDateParserClazz = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateParserClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(fastDateParser, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        
        Class fastDateParserClazz = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class extObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateParserClazz.getDeclaredMethod("readObject", extObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = extObjectInputStream;
        try {
            readObjectMethod.invoke(fastDateParser, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_1() throws Throwable  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(extObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateParserClazz = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class extObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateParserClazz.getDeclaredMethod("readObject", extObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = extObjectInputStream;
        try {
            readObjectMethod.invoke(fastDateParser, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_2() throws Throwable  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Object classLoaderAwareObjectInputStream = createInstance("org.apache.commons.lang3.SerializationUtils$ClassLoaderAwareObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 255);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", 256);
        setField(classLoaderAwareObjectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(classLoaderAwareObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateParserClazz = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class classLoaderAwareObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateParserClazz.getDeclaredMethod("readObject", classLoaderAwareObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = classLoaderAwareObjectInputStream;
        try {
            readObjectMethod.invoke(fastDateParser, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_3() throws Throwable  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", -255);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", -255);
        setField(extObjectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        java.io.ObjectStreamField[] fields = {};
        setField(desc, "java.io.ObjectStreamClass", "fields", fields);
        setField(desc, "java.io.ObjectStreamClass", "numObjFields", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(extObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateParserClazz = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class extObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateParserClazz.getDeclaredMethod("readObject", extObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = extObjectInputStream;
        try {
            readObjectMethod.invoke(fastDateParser, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_4() throws Throwable  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(extObjectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object handles = createInstance("java.io.ObjectInputStream$HandleTable");
        byte[] status = {(byte) 0};
        setField(handles, "java.io.ObjectInputStream$HandleTable", "status", status);
        setField(extObjectInputStream, "java.io.ObjectInputStream", "handles", handles);
        setField(extObjectInputStream, "java.io.ObjectInputStream", "passHandle", Integer.MIN_VALUE);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        byte[] obj = {};
        setField(curContext, "java.io.SerialCallbackContext", "obj", obj);
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "hasWriteObjectData", true);
        setField(desc, "java.io.ObjectStreamClass", "initialized", true);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(extObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateParserClazz = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class extObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateParserClazz.getDeclaredMethod("readObject", extObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = extObjectInputStream;
        try {
            readObjectMethod.invoke(fastDateParser, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_5() throws Throwable  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
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
        setField(desc, "java.io.ObjectStreamClass", "hasWriteObjectData", true);
        setField(desc, "java.io.ObjectStreamClass", "initialized", true);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateParserClazz = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateParserClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(fastDateParser, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_6() throws Throwable  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Object classLoaderAwareObjectInputStream = createInstance("org.apache.commons.lang3.SerializationUtils$ClassLoaderAwareObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -255);
        setField(classLoaderAwareObjectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object handles = createInstance("java.io.ObjectInputStream$HandleTable");
        byte[] status = {(byte) 3, (byte) -127};
        setField(handles, "java.io.ObjectInputStream$HandleTable", "status", status);
        java.lang.Object[] entries = {};
        setField(handles, "java.io.ObjectInputStream$HandleTable", "entries", entries);
        setField(classLoaderAwareObjectInputStream, "java.io.ObjectInputStream", "handles", handles);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "initialized", true);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(classLoaderAwareObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateParserClazz = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class classLoaderAwareObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateParserClazz.getDeclaredMethod("readObject", classLoaderAwareObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = classLoaderAwareObjectInputStream;
        try {
            readObjectMethod.invoke(fastDateParser, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.EOFException} in: in.defaultReadObject();
 *  */
    @Test(expected = EOFException.class)
    public void testReadObject_ThrowEOFException() throws Throwable  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
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
        int[][] obj = {};
        setField(curContext, "java.io.SerialCallbackContext", "obj", obj);
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(extObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateParserClazz = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class extObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateParserClazz.getDeclaredMethod("readObject", extObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = extObjectInputStream;
        try {
            readObjectMethod.invoke(fastDateParser, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testReadObject_ThrowZipException() throws Throwable  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
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
        short[] obj = {};
        setField(curContext, "java.io.SerialCallbackContext", "obj", obj);
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(extObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class fastDateParserClazz = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class extObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = fastDateParserClazz.getDeclaredMethod("readObject", extObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = extObjectInputStream;
        try {
            readObjectMethod.invoke(fastDateParser, readObjectMethodArguments);
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
        
        // 5 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.copy
    
    ///region Errors report for copy
    
    public void testCopy_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: Matcher matcher = parsePattern.matcher(source.substring(offset));
 *  */
    @Test
    public void testParse_ThrowNegativeArraySizeException() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Pattern parsePattern = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(parsePattern, "java.util.regex.Pattern", "compiled", true);
        setField(parsePattern, "java.util.regex.Pattern", "capturingGroupCount", 13);
        setField(parsePattern, "java.util.regex.Pattern", "localCount", -256);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "parsePattern", parsePattern);
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parse] produces [java.lang.NegativeArraySizeException: Less than zero] */
        fastDateParser.parse(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: Matcher matcher = parsePattern.matcher(source.substring(offset));
 *  */
    @Test
    public void testParse_ThrowNegativeArraySizeException_1() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Pattern parsePattern = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(parsePattern, "java.util.regex.Pattern", "compiled", true);
        setField(parsePattern, "java.util.regex.Pattern", "localTCNCount", -256);
        setField(parsePattern, "java.util.regex.Pattern", "capturingGroupCount", 9);
        setField(parsePattern, "java.util.regex.Pattern", "localCount", 1);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "parsePattern", parsePattern);
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parse] produces [java.lang.NegativeArraySizeException: Less than zero] */
        fastDateParser.parse(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: Matcher matcher = parsePattern.matcher(source.substring(offset));
 *  */
    @Test
    public void testParse_ThrowNegativeArraySizeException_2() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Pattern parsePattern = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(parsePattern, "java.util.regex.Pattern", "compiled", true);
        setField(parsePattern, "java.util.regex.Pattern", "capturingGroupCount", 1073741824);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "parsePattern", parsePattern);
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parse] produces [java.lang.NegativeArraySizeException: Less than zero] */
        fastDateParser.parse(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int offset = pos.getIndex();
 *  */
    @Test
    public void testParse_ThrowNullPointerException() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parse] produces [java.lang.NullPointerException]
            java.base/java.util.concurrent.ConcurrentHashMap.putVal(ConcurrentHashMap.java:1011)
            java.base/java.util.concurrent.ConcurrentHashMap.putIfAbsent(ConcurrentHashMap.java:1541)
            java.base/sun.util.locale.provider.LocaleProviderAdapter.getAdapter(LocaleProviderAdapter.java:260)
            java.base/java.util.Calendar.createCalendar(Calendar.java:1688)
            java.base/java.util.Calendar.getInstance(Calendar.java:1671)
            org.apache.commons.lang3.time.FastDateParser.parse(FastDateParser.java:390) */
        fastDateParser.parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Matcher matcher = parsePattern.matcher(source.substring(offset));
 *  */
    @Test
    public void testParse_ThrowNullPointerException_1() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parse] produces [java.lang.NullPointerException] */
        fastDateParser.parse(null, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Matcher matcher = parsePattern.matcher(source.substring(offset));
 *  */
    @Test
    public void testParse_ThrowNullPointerException_2() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parse] produces [java.lang.NullPointerException] */
        fastDateParser.parse(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Matcher matcher = parsePattern.matcher(source.substring(offset));
 *  */
    @Test
    public void testParse_ThrowNullPointerException_3() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String string = "  ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parse] produces [java.lang.NullPointerException] */
        fastDateParser.parse(string, parsePosition);
    }
    ///endregion
    
    ///region Errors report for parse
    
    public void testParse_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        /* Unable to make field static final boolean java.util.regex.Pattern.$assertionsDisabled accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parse(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: Date date = parse(source, new ParsePosition(0));
 *  */
    @Test
    public void testParse_ThrowNegativeArraySizeException1() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Pattern parsePattern = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(parsePattern, "java.util.regex.Pattern", "compiled", true);
        setField(parsePattern, "java.util.regex.Pattern", "localTCNCount", -256);
        setField(parsePattern, "java.util.regex.Pattern", "capturingGroupCount", 13);
        setField(parsePattern, "java.util.regex.Pattern", "localCount", 1);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "parsePattern", parsePattern);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parse] produces [java.lang.NegativeArraySizeException: Less than zero] */
        fastDateParser.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parse(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: Date date = parse(source, new ParsePosition(0));
 *  */
    @Test
    public void testParse_ThrowNegativeArraySizeException_11() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Pattern parsePattern = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(parsePattern, "java.util.regex.Pattern", "compiled", true);
        setField(parsePattern, "java.util.regex.Pattern", "capturingGroupCount", 9);
        setField(parsePattern, "java.util.regex.Pattern", "localCount", Integer.MIN_VALUE);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "parsePattern", parsePattern);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parse] produces [java.lang.NegativeArraySizeException: Less than zero] */
        fastDateParser.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parse(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: Date date = parse(source, new ParsePosition(0));
 *  */
    @Test
    public void testParse_ThrowNegativeArraySizeException_21() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Pattern parsePattern = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(parsePattern, "java.util.regex.Pattern", "compiled", true);
        setField(parsePattern, "java.util.regex.Pattern", "capturingGroupCount", 1073741824);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "parsePattern", parsePattern);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parse] produces [java.lang.NegativeArraySizeException: Less than zero] */
        fastDateParser.parse(string);
    }
    ///endregion
    
    ///region Errors report for parse
    
    public void testParse_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        /* Unable to make field static final boolean java.util.regex.Pattern.$assertionsDisabled accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.getLocale
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocale()
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#getLocale()}
 * @utbot.returnsFrom {@code return locale;}
 *  */
    @Test
    public void testGetLocale_ReturnLocale() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        
        Locale actual = fastDateParser.getLocale();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.parseObject
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseObject(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parseObject(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link org.apache.commons.lang3.time.FastDateParser#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return parse(source, pos);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testParseObject_ThrowStringIndexOutOfBoundsException() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-1);
        
        fastDateParser.parseObject(string, parsePosition);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseObject(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parseObject(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return parse(source, pos);
 *  */
    @Test
    public void testParseObject_ThrowNegativeArraySizeException() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Pattern parsePattern = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(parsePattern, "java.util.regex.Pattern", "compiled", true);
        setField(parsePattern, "java.util.regex.Pattern", "capturingGroupCount", 9);
        setField(parsePattern, "java.util.regex.Pattern", "localCount", Integer.MIN_VALUE);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "parsePattern", parsePattern);
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parseObject] produces [java.lang.NegativeArraySizeException: Less than zero] */
        fastDateParser.parseObject(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parseObject(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return parse(source, pos);
 *  */
    @Test
    public void testParseObject_ThrowNegativeArraySizeException_1() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Pattern parsePattern = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(parsePattern, "java.util.regex.Pattern", "compiled", true);
        setField(parsePattern, "java.util.regex.Pattern", "capturingGroupCount", 1073741824);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "parsePattern", parsePattern);
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parseObject] produces [java.lang.NegativeArraySizeException: Less than zero] */
        fastDateParser.parseObject(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parseObject(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return parse(source, pos);
 *  */
    @Test
    public void testParseObject_ThrowNegativeArraySizeException_2() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Pattern parsePattern = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(parsePattern, "java.util.regex.Pattern", "compiled", true);
        setField(parsePattern, "java.util.regex.Pattern", "localTCNCount", Integer.MIN_VALUE);
        setField(parsePattern, "java.util.regex.Pattern", "capturingGroupCount", 9);
        setField(parsePattern, "java.util.regex.Pattern", "localCount", 1);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "parsePattern", parsePattern);
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parseObject] produces [java.lang.NegativeArraySizeException: Less than zero] */
        fastDateParser.parseObject(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parseObject(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return parse(source, pos);
 *  */
    @Test
    public void testParseObject_ThrowNegativeArraySizeException_3() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Pattern parsePattern = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(parsePattern, "java.util.regex.Pattern", "compiled", true);
        setField(parsePattern, "java.util.regex.Pattern", "capturingGroupCount", 9);
        setField(parsePattern, "java.util.regex.Pattern", "localCount", Integer.MIN_VALUE);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "parsePattern", parsePattern);
        String string = "  ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parseObject] produces [java.lang.NegativeArraySizeException: Less than zero] */
        fastDateParser.parseObject(string, parsePosition);
    }
    ///endregion
    
    ///region Errors report for parseObject
    
    public void testParseObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        /* Unable to make field static final boolean java.util.regex.Pattern.$assertionsDisabled accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.parseObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseObject(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parseObject(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return parse(source);
 *  */
    @Test
    public void testParseObject_ThrowNegativeArraySizeException1() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Pattern parsePattern = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(parsePattern, "java.util.regex.Pattern", "compiled", true);
        setField(parsePattern, "java.util.regex.Pattern", "localTCNCount", Integer.MIN_VALUE);
        setField(parsePattern, "java.util.regex.Pattern", "capturingGroupCount", 13);
        setField(parsePattern, "java.util.regex.Pattern", "localCount", 1);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "parsePattern", parsePattern);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parseObject] produces [java.lang.NegativeArraySizeException: Less than zero] */
        fastDateParser.parseObject(string);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parseObject(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return parse(source);
 *  */
    @Test
    public void testParseObject_ThrowNegativeArraySizeException_11() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Pattern parsePattern = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(parsePattern, "java.util.regex.Pattern", "compiled", true);
        setField(parsePattern, "java.util.regex.Pattern", "capturingGroupCount", 13);
        setField(parsePattern, "java.util.regex.Pattern", "localCount", Integer.MIN_VALUE);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "parsePattern", parsePattern);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parseObject] produces [java.lang.NegativeArraySizeException: Less than zero] */
        fastDateParser.parseObject(string);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#parseObject(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return parse(source);
 *  */
    @Test
    public void testParseObject_ThrowNegativeArraySizeException_21() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Pattern parsePattern = ((Pattern) createInstance("java.util.regex.Pattern"));
        setField(parsePattern, "java.util.regex.Pattern", "compiled", true);
        setField(parsePattern, "java.util.regex.Pattern", "capturingGroupCount", 1073741824);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "parsePattern", parsePattern);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.parseObject] produces [java.lang.NegativeArraySizeException: Less than zero] */
        fastDateParser.parseObject(string);
    }
    ///endregion
    
    ///region Errors report for parseObject
    
    public void testParseObject_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 13 occurrences of:
        /* Unable to make field static final boolean java.util.regex.Pattern.$assertionsDisabled accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.accept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.getTimeZone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimeZone()
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#getTimeZone()}
 * @utbot.returnsFrom {@code return timeZone;}
 *  */
    @Test
    public void testGetTimeZone_ReturnTimeZone() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        
        TimeZone actual = fastDateParser.getTimeZone();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.getDisplayNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDisplayNames(int)
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#getDisplayNames(int)}
 * @utbot.invokes {@link java.util.concurrent.ConcurrentMap#get(java.lang.Object)}
 *  */
    @Test
    public void testGetDisplayNames_ConcurrentMapGet() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        ConcurrentSkipListMap nameValues = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        Object head = createInstance("java.util.concurrent.ConcurrentSkipListMap$Index");
        Object right = createInstance("java.util.concurrent.ConcurrentSkipListMap$Index");
        Object node = createInstance("java.util.concurrent.ConcurrentSkipListMap$Node");
        Integer key = 1;
        setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "key", key);
        java.lang.Object[] val = createArray("org.apache.commons.lang3.time.FastDateParser$KeyValue", 1);
        setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "val", val);
        setField(right, "java.util.concurrent.ConcurrentSkipListMap$Index", "node", node);
        setField(head, "java.util.concurrent.ConcurrentSkipListMap$Index", "right", right);
        setField(nameValues, "java.util.concurrent.ConcurrentSkipListMap", "head", head);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "nameValues", nameValues);
        
        java.lang.Object[] actual = fastDateParser.getDisplayNames(1);
        
        int valSize = val.length;
        assertEquals(valSize, actual.length);
        assertTrue(deepEquals(val, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDisplayNames(int)
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#getDisplayNames(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: KeyValue[] fieldKeyValues = nameValues.get(fieldInt);
 *  */
    @Test
    public void testGetDisplayNames_ThrowClassCastException() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        ConcurrentSkipListMap nameValues = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        Object head = createInstance("java.util.concurrent.ConcurrentSkipListMap$Index");
        Object node = createInstance("java.util.concurrent.ConcurrentSkipListMap$Node");
        Integer key = -255;
        setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "key", key);
        int[][] val = {};
        setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "val", val);
        setField(head, "java.util.concurrent.ConcurrentSkipListMap$Index", "node", node);
        setField(head, "java.util.concurrent.ConcurrentSkipListMap$Index", "right", head);
        setField(nameValues, "java.util.concurrent.ConcurrentSkipListMap", "head", head);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "nameValues", nameValues);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.getDisplayNames] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.apache.commons.lang3.time.FastDateParser$KeyValue[]] */
        fastDateParser.getDisplayNames(-255);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#getDisplayNames(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: KeyValue[] fieldKeyValues = nameValues.get(fieldInt);
 *  */
    @Test
    public void testGetDisplayNames_ThrowClassCastException_1() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        ConcurrentSkipListMap nameValues = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        Object head = createInstance("java.util.concurrent.ConcurrentSkipListMap$Index");
        Object node = createInstance("java.util.concurrent.ConcurrentSkipListMap$Node");
        byte[] key = {};
        setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "key", key);
        Object val = createInstance("java.lang.Object");
        setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "val", val);
        setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "next", node);
        setField(head, "java.util.concurrent.ConcurrentSkipListMap$Index", "node", node);
        setField(nameValues, "java.util.concurrent.ConcurrentSkipListMap", "head", head);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "nameValues", nameValues);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.getDisplayNames] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        fastDateParser.getDisplayNames(-255);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#getDisplayNames(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: KeyValue[] fieldKeyValues = nameValues.get(fieldInt);
 *  */
    @Test
    public void testGetDisplayNames_ThrowClassCastException_2() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        ConcurrentSkipListMap nameValues = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        Object head = createInstance("java.util.concurrent.ConcurrentSkipListMap$Index");
        Object node = createInstance("java.util.concurrent.ConcurrentSkipListMap$Node");
        Integer key = -255;
        setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "key", key);
        int[][] val = {};
        setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "val", val);
        setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "next", node);
        setField(head, "java.util.concurrent.ConcurrentSkipListMap$Index", "node", node);
        setField(nameValues, "java.util.concurrent.ConcurrentSkipListMap", "head", head);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "nameValues", nameValues);
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.getDisplayNames] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.apache.commons.lang3.time.FastDateParser$KeyValue[]] */
        fastDateParser.getDisplayNames(-255);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#getDisplayNames(int)}
 * @utbot.invokes {@link java.util.concurrent.ConcurrentMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: KeyValue[] fieldKeyValues = nameValues.get(fieldInt);
 *  */
    @Test
    public void testGetDisplayNames_ThrowNullPointerException() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.getDisplayNames] produces [java.lang.NullPointerException] */
        fastDateParser.getDisplayNames(-255);
    }
    ///endregion
    
    ///region Errors report for getDisplayNames
    
    public void testGetDisplayNames_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 19 occurrences of:
        // Failed requirement.
        
        // 14 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.getStrategy
    
    ///region Errors report for getStrategy
    
    public void testGetStrategy_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 69 occurrences of:
        // Default concrete execution failed
        
        // 20 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.escapeRegex
    
    ///region Errors report for escapeRegex
    
    public void testEscapeRegex_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 27 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.getFieldWidth
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFieldWidth()
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#getFieldWidth()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return currentFormatField.length();}
 *  */
    @Test
    public void testGetFieldWidth_StringLength() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        String currentFormatField = " ";
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "currentFormatField", currentFormatField);
        
        int actual = fastDateParser.getFieldWidth();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFieldWidth()
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#getFieldWidth()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return currentFormatField.length();
 *  */
    @Test
    public void testGetFieldWidth_ThrowNullPointerException() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        
        /* This test fails because method [org.apache.commons.lang3.time.FastDateParser.getFieldWidth] produces [java.lang.NullPointerException] */
        fastDateParser.getFieldWidth();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.isNextNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNextNumber()
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#isNextNumber()}
 * @utbot.returnsFrom {@code return nextStrategy != null && nextStrategy.isNumber();}
 *  */
    @Test
    public void testIsNextNumber_NextStrategyNotEqualsNullAndNextStrategyIsNumber() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Object nextStrategy = createInstance("org.apache.commons.lang3.time.FastDateParser$5");
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "nextStrategy", nextStrategy);
        
        boolean actual = fastDateParser.isNextNumber();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#isNextNumber()}
 * @utbot.returnsFrom {@code return nextStrategy != null && nextStrategy.isNumber();}
 *  */
    @Test
    public void testIsNextNumber_NextStrategyNotEqualsNullAndNextStrategyIsNumber_1() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Object nextStrategy = createInstance("org.apache.commons.lang3.time.FastDateParser$TextStrategy");
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "nextStrategy", nextStrategy);
        
        boolean actual = fastDateParser.isNextNumber();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#isNextNumber()}
 * @utbot.returnsFrom {@code return nextStrategy != null && nextStrategy.isNumber();}
 *  */
    @Test
    public void testIsNextNumber_NextStrategyNotEqualsNullAndNextStrategyIsNumber_2() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Object nextStrategy = createInstance("org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy");
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "nextStrategy", nextStrategy);
        
        boolean actual = fastDateParser.isNextNumber();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#isNextNumber()}
 * @utbot.returnsFrom {@code return nextStrategy != null && nextStrategy.isNumber();}
 *  */
    @Test
    public void testIsNextNumber_NextStrategyEqualsNullAndNextStrategyIsNumber() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        
        boolean actual = fastDateParser.isNextNumber();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#isNextNumber()}
 * @utbot.returnsFrom {@code return nextStrategy != null && nextStrategy.isNumber();}
 *  */
    @Test
    public void testIsNextNumber_NextStrategyNotEqualsNullAndNextStrategyIsNumber_3() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Object nextStrategy = createInstance("org.apache.commons.lang3.time.FastDateParser$CopyQuotedStrategy");
        String formatField = "2";
        setField(nextStrategy, "org.apache.commons.lang3.time.FastDateParser$CopyQuotedStrategy", "formatField", formatField);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "nextStrategy", nextStrategy);
        
        boolean actual = fastDateParser.isNextNumber();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#isNextNumber()}
 * @utbot.returnsFrom {@code return nextStrategy != null && nextStrategy.isNumber();}
 *  */
    @Test
    public void testIsNextNumber_NextStrategyNotEqualsNullAndNextStrategyIsNumber_4() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Object nextStrategy = createInstance("org.apache.commons.lang3.time.FastDateParser$CopyQuotedStrategy");
        String formatField = "'2";
        setField(nextStrategy, "org.apache.commons.lang3.time.FastDateParser$CopyQuotedStrategy", "formatField", formatField);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "nextStrategy", nextStrategy);
        
        boolean actual = fastDateParser.isNextNumber();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isNextNumber()
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#isNextNumber()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return nextStrategy != null && nextStrategy.isNumber();
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testIsNextNumber_ThrowStringIndexOutOfBoundsException() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Object nextStrategy = createInstance("org.apache.commons.lang3.time.FastDateParser$CopyQuotedStrategy");
        String formatField = "";
        setField(nextStrategy, "org.apache.commons.lang3.time.FastDateParser$CopyQuotedStrategy", "formatField", formatField);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "nextStrategy", nextStrategy);
        
        fastDateParser.isNextNumber();
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#isNextNumber()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return nextStrategy != null && nextStrategy.isNumber();
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testIsNextNumber_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        Object nextStrategy = createInstance("org.apache.commons.lang3.time.FastDateParser$CopyQuotedStrategy");
        String formatField = "'";
        setField(nextStrategy, "org.apache.commons.lang3.time.FastDateParser$CopyQuotedStrategy", "formatField", formatField);
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "nextStrategy", nextStrategy);
        
        fastDateParser.isNextNumber();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.adjustYear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method adjustYear(int)
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#adjustYear(int)}
 * @utbot.executesCondition {@code (trial < thisYear + 20): False}
 * @utbot.returnsFrom {@code return trial - 100;}
 *  */
    @Test
    public void testAdjustYear_TrialGreaterOrEqualThisYearPlus20() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "thisYear", 4);
        
        int actual = fastDateParser.adjustYear(24);
        
        assertEquals(-76, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#adjustYear(int)}
 * @utbot.executesCondition {@code (trial < thisYear + 20): True}
 * @utbot.returnsFrom {@code return trial;}
 *  */
    @Test
    public void testAdjustYear_TrialLessThanThisYearPlus20() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        setField(fastDateParser, "org.apache.commons.lang3.time.FastDateParser", "thisYear", 256);
        
        int actual = fastDateParser.adjustYear(75);
        
        assertEquals(275, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.getParsePattern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParsePattern()
    
    /**
    @utbot.classUnderTest {@link FastDateParser}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.time.FastDateParser#getParsePattern()}
 * @utbot.returnsFrom {@code return parsePattern;}
 *  */
    @Test
    public void testGetParsePattern_ReturnParsePattern() throws Exception  {
        FastDateParser fastDateParser = ((FastDateParser) createInstance("org.apache.commons.lang3.time.FastDateParser"));
        
        Pattern actual = fastDateParser.getParsePattern();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.time.FastDateParser.createKeyValues
    
    ///region Errors report for createKeyValues
    
    public void testCreateKeyValues_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 39 occurrences of:
        // Concrete execution failed
        
        // 8 occurrences of:
        // Default concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields625909423874300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields625909423874300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass625909423897700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields625909423874300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass625909423897700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields625909425851200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields625909425851200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass625909425853400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields625909425851200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass625909425853400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

