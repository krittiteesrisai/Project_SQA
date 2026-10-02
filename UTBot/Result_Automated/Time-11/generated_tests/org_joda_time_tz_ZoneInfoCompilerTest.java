package org.joda.time.tz;

import org.junit.Test;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.Chronology;
import java.lang.reflect.Constructor;
import org.joda.time.chrono.CopticChronology;
import org.junit.Ignore;
import java.io.File;
import java.util.ArrayList;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.ScaledDurationField;
import org.joda.time.field.UnsupportedDurationField;
import java.util.HashMap;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.LenientDateTimeField;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.InputStreamReader;
import sun.nio.cs.StreamDecoder;
import org.joda.time.IllegalFieldValueException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.io.DataOutputStream;
import java.util.LinkedHashMap;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_joda_time_tz_ZoneInfoCompilerTest {
    ///region Test suites for executable org.joda.time.tz.ZoneInfoCompiler.parseTime
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseTime(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#parseTime(java.lang.String)}
 * @utbot.invokes {@link org.joda.time.format.ISODateTimeFormat#hourMinuteSecondFraction()}
 * @utbot.invokes {@link org.joda.time.tz.ZoneInfoCompiler#getLenientISOChronology()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testParseTime_ThrowNullPointerException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class iSODateTimeFormatClazz = Class.forName("org.joda.time.format.ISODateTimeFormat");
        DateTimeFormatter prevHmsf = ((DateTimeFormatter) getStaticFieldValue(iSODateTimeFormatClazz, "hmsf"));
        try {
            DateTimeFormatter hmsf = new DateTimeFormatter(null, null);
            setStaticField(iSODateTimeFormatClazz, "hmsf", hmsf);
            
            /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.parseTime] produces [java.lang.NullPointerException]
                org.joda.time.tz.ZoneInfoCompiler.parseTime(ZoneInfoCompiler.java:237) */
            ZoneInfoCompiler.parseTime(null);
        } finally {
            setStaticField(org.joda.time.format.ISODateTimeFormat.class, "hmsf", prevHmsf);
        }
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseTime(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.tz.ZoneInfoCompiler}
     * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#parseTime(java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testParseTimeThrowsIAEWithNonEmptyString() {
        ZoneInfoCompiler.parseTime("XZb");
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseTime(java.lang.String)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testParseTime1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class iSODateTimeFormatClazz = Class.forName("org.joda.time.format.ISODateTimeFormat");
        DateTimeFormatter prevHmsf = ((DateTimeFormatter) getStaticFieldValue(iSODateTimeFormatClazz, "hmsf"));
        try {
            DateTimeFormatter hmsf = new DateTimeFormatter(null, null);
            setStaticField(iSODateTimeFormatClazz, "hmsf", hmsf);
            String string = "";
            
            ZoneInfoCompiler.parseTime(string);
        } finally {
            setStaticField(org.joda.time.format.ISODateTimeFormat.class, "hmsf", prevHmsf);
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testParseTime2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class iSODateTimeFormatClazz = Class.forName("org.joda.time.format.ISODateTimeFormat");
        DateTimeFormatter prevHmsf = ((DateTimeFormatter) getStaticFieldValue(iSODateTimeFormatClazz, "hmsf"));
        Chronology prevCLenientISO = ZoneInfoCompiler.cLenientISO;
        try {
            DateTimeFormatter hmsf = new DateTimeFormatter(null, null);
            setStaticField(iSODateTimeFormatClazz, "hmsf", hmsf);
            ZoneInfoCompiler.cLenientISO = null;
            String string = "";
            
            ZoneInfoCompiler.parseTime(string);
        } finally {
            setStaticField(org.joda.time.format.ISODateTimeFormat.class, "hmsf", prevHmsf);
            ZoneInfoCompiler.cLenientISO = prevCLenientISO;
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testParseTime3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class iSODateTimeFormatClazz = Class.forName("org.joda.time.format.ISODateTimeFormat");
        DateTimeFormatter prevHmsf = ((DateTimeFormatter) getStaticFieldValue(iSODateTimeFormatClazz, "hmsf"));
        DateTimeFormatter prevHde = ((DateTimeFormatter) getStaticFieldValue(iSODateTimeFormatClazz, "hde"));
        DateTimeFormatter prevMhe = ((DateTimeFormatter) getStaticFieldValue(iSODateTimeFormatClazz, "mhe"));
        try {
            setStaticField(iSODateTimeFormatClazz, "hmsf", null);
            DateTimeFormatter hde = new DateTimeFormatter(null, null);
            setStaticField(iSODateTimeFormatClazz, "hde", hde);
            setStaticField(iSODateTimeFormatClazz, "mhe", null);
            String string = "";
            
            ZoneInfoCompiler.parseTime(string);
        } finally {
            setStaticField(org.joda.time.format.ISODateTimeFormat.class, "hmsf", prevHmsf);
            setStaticField(org.joda.time.format.ISODateTimeFormat.class, "hde", prevHde);
            setStaticField(org.joda.time.format.ISODateTimeFormat.class, "mhe", prevMhe);
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testParseTime4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class iSODateTimeFormatClazz = Class.forName("org.joda.time.format.ISODateTimeFormat");
        DateTimeFormatter prevHmsf = ((DateTimeFormatter) getStaticFieldValue(iSODateTimeFormatClazz, "hmsf"));
        DateTimeFormatter prevHde = ((DateTimeFormatter) getStaticFieldValue(iSODateTimeFormatClazz, "hde"));
        DateTimeFormatter prevMhe = ((DateTimeFormatter) getStaticFieldValue(iSODateTimeFormatClazz, "mhe"));
        try {
            setStaticField(iSODateTimeFormatClazz, "hmsf", null);
            DateTimeFormatter hde = new DateTimeFormatter(null, null);
            setStaticField(iSODateTimeFormatClazz, "hde", hde);
            setStaticField(iSODateTimeFormatClazz, "mhe", hde);
            
            ZoneInfoCompiler.parseTime(null);
        } finally {
            setStaticField(org.joda.time.format.ISODateTimeFormat.class, "hmsf", prevHmsf);
            setStaticField(org.joda.time.format.ISODateTimeFormat.class, "hde", prevHde);
            setStaticField(org.joda.time.format.ISODateTimeFormat.class, "mhe", prevMhe);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseTime(java.lang.String)
    
    @Test
    public void testParseTime5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class iSODateTimeFormatClazz = Class.forName("org.joda.time.format.ISODateTimeFormat");
        DateTimeFormatter prevHmsf = ((DateTimeFormatter) getStaticFieldValue(iSODateTimeFormatClazz, "hmsf"));
        DateTimeFormatter prevHde = ((DateTimeFormatter) getStaticFieldValue(iSODateTimeFormatClazz, "hde"));
        try {
            setStaticField(iSODateTimeFormatClazz, "hmsf", null);
            setStaticField(iSODateTimeFormatClazz, "hde", null);
            
            /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.parseTime] produces [java.lang.NullPointerException]
                org.joda.time.tz.ZoneInfoCompiler.parseTime(ZoneInfoCompiler.java:237) */
            ZoneInfoCompiler.parseTime(null);
        } finally {
            setStaticField(org.joda.time.format.ISODateTimeFormat.class, "hmsf", prevHmsf);
            setStaticField(org.joda.time.format.ISODateTimeFormat.class, "hde", prevHde);
        }
    }
    
    @Test
    public void testParseTime6() throws Exception  {
        Class iSODateTimeFormatClazz = Class.forName("org.joda.time.format.ISODateTimeFormat");
        DateTimeFormatter prevHmsf = ((DateTimeFormatter) getStaticFieldValue(iSODateTimeFormatClazz, "hmsf"));
        Chronology prevCLenientISO = ZoneInfoCompiler.cLenientISO;
        try {
            Object characterLiteral = createInstance("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral");
            Class dateTimeFormatterClazz = Class.forName("org.joda.time.format.DateTimeFormatter");
            Class dateTimePrinterType = Class.forName("org.joda.time.format.DateTimePrinter");
            Class characterLiteralType = Class.forName("org.joda.time.format.DateTimeParser");
            Constructor dateTimeFormatterConstructor = dateTimeFormatterClazz.getDeclaredConstructor(dateTimePrinterType, characterLiteralType);
            dateTimeFormatterConstructor.setAccessible(true);
            java.lang.Object[] dateTimeFormatterConstructorArguments = new java.lang.Object[2];
            dateTimeFormatterConstructorArguments[0] = ((Object) null);
            dateTimeFormatterConstructorArguments[1] = characterLiteral;
            DateTimeFormatter hmsf = ((DateTimeFormatter) dateTimeFormatterConstructor.newInstance(dateTimeFormatterConstructorArguments));
            setStaticField(iSODateTimeFormatClazz, "hmsf", hmsf);
            CopticChronology cLenientISO = ((CopticChronology) createInstance("org.joda.time.chrono.CopticChronology"));
            ZoneInfoCompiler.cLenientISO = cLenientISO;
            String string = "";
            
            /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.parseTime] produces [java.lang.NullPointerException]
                org.joda.time.format.DateTimeFormatter.parseInto(DateTimeFormatter.java:710)
                org.joda.time.tz.ZoneInfoCompiler.parseTime(ZoneInfoCompiler.java:240) */
            ZoneInfoCompiler.parseTime(string);
        } finally {
            setStaticField(org.joda.time.format.ISODateTimeFormat.class, "hmsf", prevHmsf);
            ZoneInfoCompiler.cLenientISO = prevCLenientISO;
        }
    }
    
    @Test
    public void testParseTime7() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class iSODateTimeFormatClazz = Class.forName("org.joda.time.format.ISODateTimeFormat");
        DateTimeFormatter prevHmsf = ((DateTimeFormatter) getStaticFieldValue(iSODateTimeFormatClazz, "hmsf"));
        Chronology prevCLenientISO = ZoneInfoCompiler.cLenientISO;
        try {
            DateTimeFormatter hmsf = new DateTimeFormatter(null, null);
            setStaticField(iSODateTimeFormatClazz, "hmsf", hmsf);
            ZoneInfoCompiler.cLenientISO = null;
            
            /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.parseTime] produces [java.lang.NullPointerException]
                org.joda.time.tz.ZoneInfoCompiler.parseTime(ZoneInfoCompiler.java:237) */
            ZoneInfoCompiler.parseTime(null);
        } finally {
            setStaticField(org.joda.time.format.ISODateTimeFormat.class, "hmsf", prevHmsf);
            ZoneInfoCompiler.cLenientISO = prevCLenientISO;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.tz.ZoneInfoCompiler.main
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method main([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#main(java.lang.String[])}
 * @utbot.executesCondition {@code (args.length == 0): True}
 * @utbot.invokes org.joda.time.tz.ZoneInfoCompiler#printUsage()
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testMain_ArgsLengthEqualsZero() throws Exception  {
        java.lang.String[] stringArray = {};
        
        ZoneInfoCompiler.main(stringArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SECURITY for method main([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#main(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < args.length; i++)} once
 * @utbot.throwsException {@link java.security.AccessControlException} in: return;
 *  */
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testMain_ThrowAccessControlException() {
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.main] produces [java.security.AccessControlException: access denied ("java.io.FilePermission" "" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.FileInputStream.<init>(FileInputStream.java:146)
            java.base/java.io.FileReader.<init>(FileReader.java:75)
            org.joda.time.tz.ZoneInfoCompiler.compile(ZoneInfoCompiler.java:369)
            org.joda.time.tz.ZoneInfoCompiler.main(ZoneInfoCompiler.java:136) */
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#main(java.lang.String[])}
 * @utbot.executesCondition {@code (i >= args.length): True}
 * @utbot.invokes org.joda.time.tz.ZoneInfoCompiler#printUsage()
 * @utbot.iterates iterate the loop {@code for(i = 0; i < args.length; i++)} once
 * @utbot.returnsFrom {@code return;}
 * @utbot.throwsException {@link java.security.AccessControlException} in: return;
 *  */
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testMain_ThrowAccessControlException_1() {
        java.lang.String[] stringArray = new java.lang.String[2];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        stringArray[0] = string;
        String string1 = "";
        stringArray[1] = string1;
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.main] produces [java.security.AccessControlException: access denied ("java.io.FilePermission" "                                                           " "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.FileInputStream.<init>(FileInputStream.java:146)
            java.base/java.io.FileReader.<init>(FileReader.java:75)
            org.joda.time.tz.ZoneInfoCompiler.compile(ZoneInfoCompiler.java:369)
            org.joda.time.tz.ZoneInfoCompiler.main(ZoneInfoCompiler.java:136) */
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method main([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#main(java.lang.String[])}
 * @utbot.executesCondition {@code (args.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < args.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inputDir = new File(args[++i]);
 *  */
    @Test
    public void testMain_ThrowNullPointerException_1() throws Exception  {
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "";
        stringArray[0] = string;
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.main] produces [java.lang.NullPointerException]
            java.base/java.io.File.<init>(File.java:278)
            org.joda.time.tz.ZoneInfoCompiler.main(ZoneInfoCompiler.java:131) */
        ZoneInfoCompiler.main(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#main(java.lang.String[])}
 * @utbot.executesCondition {@code (args.length == 0): False}
 * @utbot.executesCondition {@code (i >= args.length): False}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < args.length; i++)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; i < args.length; i++, j++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new File(args[i])
 *  */
    @Test
    public void testMain_ThrowNullPointerException_2() throws Exception  {
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.main] produces [java.lang.NullPointerException]
            java.base/java.io.File.<init>(File.java:278)
            org.joda.time.tz.ZoneInfoCompiler.main(ZoneInfoCompiler.java:131) */
        ZoneInfoCompiler.main(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#main(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: args.length == 0
 *  */
    @Test
    public void testMain_ThrowNullPointerException() throws Exception  {
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.main] produces [java.lang.NullPointerException]
            org.joda.time.tz.ZoneInfoCompiler.main(ZoneInfoCompiler.java:94) */
        ZoneInfoCompiler.main(null);
    }
    ///endregion
    
    ///region FUZZER: SECURITY for method main([Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.tz.ZoneInfoCompiler}
     * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#main(java.lang.String[])}
     */
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testMainWithNonEmptyObjectArray() {
        java.lang.String[] stringArray = {"", "", "-?"};
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.main] produces [java.security.AccessControlException: access denied ("java.io.FilePermission" "" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.FileInputStream.<init>(FileInputStream.java:146)
            java.base/java.io.FileReader.<init>(FileReader.java:75)
            org.joda.time.tz.ZoneInfoCompiler.compile(ZoneInfoCompiler.java:369)
            org.joda.time.tz.ZoneInfoCompiler.main(ZoneInfoCompiler.java:136) */
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method main([Ljava.lang.String;)
    
    @Test
    public void testMain1() throws Exception  {
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "";
        stringArray[0] = string;
        String string1 = "\u0002:\u0000";
        stringArray[1] = string1;
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.main] produces [java.lang.NullPointerException]
            java.base/java.io.File.<init>(File.java:278)
            org.joda.time.tz.ZoneInfoCompiler.main(ZoneInfoCompiler.java:131) */
        ZoneInfoCompiler.main(stringArray);
    }
    
    @Test
    public void testMain2() throws Exception  {
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        stringArray[0] = string;
        String string1 = "";
        stringArray[1] = string1;
        String string2 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        stringArray[2] = string2;
        stringArray[3] = string1;
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.main] produces [java.lang.NullPointerException]
            java.base/java.io.File.<init>(File.java:278)
            org.joda.time.tz.ZoneInfoCompiler.main(ZoneInfoCompiler.java:131) */
        ZoneInfoCompiler.main(stringArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.tz.ZoneInfoCompiler.test
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method test(java.lang.String, org.joda.time.DateTimeZone)
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#test(java.lang.String,org.joda.time.DateTimeZone)}
 * @utbot.executesCondition {@code (!id.equals(tz.getID())): True}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getID()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testTest_NotIdEquals() throws Exception  {
        String string = " ";
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        boolean actual = ZoneInfoCompiler.test(string, cachedDateTimeZone);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method test(java.lang.String, org.joda.time.DateTimeZone)
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#test(java.lang.String,org.joda.time.DateTimeZone)}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getID()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !id.equals(tz.getID())
 *  */
    @Test
    public void testTest_ThrowNullPointerException() {
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.test] produces [java.lang.NullPointerException]
            org.joda.time.tz.ZoneInfoCompiler.test(ZoneInfoCompiler.java:269) */
        ZoneInfoCompiler.test(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#test(java.lang.String,org.joda.time.DateTimeZone)}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getID()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !id.equals(tz.getID())
 *  */
    @Test
    public void testTest_ThrowNullPointerException_1() throws Exception  {
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.test] produces [java.lang.NullPointerException]
            org.joda.time.tz.ZoneInfoCompiler.test(ZoneInfoCompiler.java:269) */
        ZoneInfoCompiler.test(null, cachedDateTimeZone);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method test(java.lang.String, org.joda.time.DateTimeZone)
    
    @Test
    public void testTest1() throws Exception  {
        String string = "";
        CachedDateTimeZone cachedDateTimeZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(cachedDateTimeZone, "org.joda.time.DateTimeZone", "iID", string);
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.test] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:143)
            org.joda.time.tz.CachedDateTimeZone.getOffset(CachedDateTimeZone.java:103)
            org.joda.time.tz.ZoneInfoCompiler.test(ZoneInfoCompiler.java:278) */
        ZoneInfoCompiler.test(string, cachedDateTimeZone);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.tz.ZoneInfoCompiler.compile
    
    ///region OTHER: ERROR SUITE for method compile(java.io.File, [Ljava.io.File;)
    
    @Test
    public void testCompile1() throws Exception  {
        ZoneInfoCompiler zoneInfoCompiler = new ZoneInfoCompiler();
        File file = ((File) createInstance("java.io.File"));
        java.io.File[] fileArray = {};
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.compile] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.exists(File.java:829)
            org.joda.time.tz.ZoneInfoCompiler.compile(ZoneInfoCompiler.java:376) */
        zoneInfoCompiler.compile(file, fileArray);
    }
    
    @Test
    public void testCompile2() throws Exception  {
        ZoneInfoCompiler zoneInfoCompiler = ((ZoneInfoCompiler) createInstance("org.joda.time.tz.ZoneInfoCompiler"));
        ArrayList iZones = new ArrayList();
        setField(zoneInfoCompiler, "org.joda.time.tz.ZoneInfoCompiler", "iZones", iZones);
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.compile] produces [java.lang.NullPointerException]
            org.joda.time.tz.ZoneInfoCompiler.compile(ZoneInfoCompiler.java:426) */
        zoneInfoCompiler.compile(null, null);
    }
    
    @Test
    public void testCompile3() throws Exception  {
        ZoneInfoCompiler zoneInfoCompiler = new ZoneInfoCompiler();
        File file = ((File) createInstance("java.io.File"));
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.compile] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.exists(File.java:829)
            org.joda.time.tz.ZoneInfoCompiler.compile(ZoneInfoCompiler.java:376) */
        zoneInfoCompiler.compile(file, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.tz.ZoneInfoCompiler.verbose
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method verbose()
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#verbose()}
 *  */
    @Test
    public void testVerbose() {
        boolean actual = ZoneInfoCompiler.verbose();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verbose()
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#verbose()}
 * @utbot.invokes {@link java.lang.ThreadLocal#get()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cVerbose.get();
 *  */
    @Test
    public void testVerbose_ThrowNullPointerException() throws Exception  {
        ThreadLocal prevCVerbose = ZoneInfoCompiler.cVerbose;
        try {
            ThreadLocal cVerbose = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(cVerbose, "java.lang.ThreadLocal", "threadLocalHashCode", 125496977);
            ZoneInfoCompiler.cVerbose = cVerbose;
            
            /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.verbose] produces [java.lang.NullPointerException]
                org.joda.time.tz.ZoneInfoCompiler.verbose(ZoneInfoCompiler.java:78) */
            ZoneInfoCompiler.verbose();
        } finally {
            ZoneInfoCompiler.cVerbose = prevCVerbose;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.tz.ZoneInfoCompiler.getLenientISOChronology
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLenientISOChronology()
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#getLenientISOChronology()}
 *  */
    @Test
    public void testGetLenientISOChronology() throws Exception  {
        LenientChronology actual = ((LenientChronology) ZoneInfoCompiler.getLenientISOChronology());
        
        LenientChronology expected = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(expected, "org.joda.time.chrono.LenientChronology", "iWithUTC", expected);
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GregorianChronology iBase1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 1024);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 2050);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", 2524608000000L);
        iYearInfoCache[2] = yearInfo;
        Object yearInfo1 = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo1, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 1850);
        setField(yearInfo1, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", -3786825600000L);
        iYearInfoCache[826] = yearInfo1;
        Object yearInfo2 = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo2, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 1970);
        setField(yearInfo2, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", 0L);
        iYearInfoCache[946] = yearInfo2;
        setField(iBase1, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(iBase1, "org.joda.time.chrono.BasicChronology", "iMinDaysInFirstWeek", 4);
        MillisDurationField iMillis = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMillis", iMillis);
        PreciseDurationField iSeconds = ((PreciseDurationField) createInstance("org.joda.time.field.PreciseDurationField"));
        setField(iSeconds, "org.joda.time.field.PreciseDurationField", "iUnitMillis", 1000L);
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iSeconds, "org.joda.time.field.BaseDurationField", "iType", iType);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iSeconds", iSeconds);
        PreciseDurationField iMinutes = ((PreciseDurationField) createInstance("org.joda.time.field.PreciseDurationField"));
        setField(iMinutes, "org.joda.time.field.PreciseDurationField", "iUnitMillis", 60000L);
        Object iType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iType1, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iMinutes, "org.joda.time.field.BaseDurationField", "iType", iType1);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMinutes", iMinutes);
        PreciseDurationField iHours = ((PreciseDurationField) createInstance("org.joda.time.field.PreciseDurationField"));
        setField(iHours, "org.joda.time.field.PreciseDurationField", "iUnitMillis", 3600000L);
        Object iType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName2 = "hours";
        setField(iType2, "org.joda.time.DurationFieldType", "iName", iName2);
        setField(iHours, "org.joda.time.field.BaseDurationField", "iType", iType2);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iHours", iHours);
        PreciseDurationField iHalfdays = ((PreciseDurationField) createInstance("org.joda.time.field.PreciseDurationField"));
        setField(iHalfdays, "org.joda.time.field.PreciseDurationField", "iUnitMillis", 43200000L);
        Object iType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(iType3, "org.joda.time.DurationFieldType", "iName", iName3);
        setField(iHalfdays, "org.joda.time.field.BaseDurationField", "iType", iType3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iHalfdays", iHalfdays);
        PreciseDurationField iDays = ((PreciseDurationField) createInstance("org.joda.time.field.PreciseDurationField"));
        setField(iDays, "org.joda.time.field.PreciseDurationField", "iUnitMillis", 86400000L);
        Object iType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(iType4, "org.joda.time.DurationFieldType", "iName", iName4);
        setField(iDays, "org.joda.time.field.BaseDurationField", "iType", iType4);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iDays", iDays);
        PreciseDurationField iWeeks = ((PreciseDurationField) createInstance("org.joda.time.field.PreciseDurationField"));
        setField(iWeeks, "org.joda.time.field.PreciseDurationField", "iUnitMillis", 604800000L);
        Object iType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName5 = "weeks";
        setField(iType5, "org.joda.time.DurationFieldType", "iName", iName5);
        setField(iWeeks, "org.joda.time.field.BaseDurationField", "iType", iType5);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iWeeks", iWeeks);
        Object iWeekyears = createInstance("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField");
        Object this$0 = createInstance("org.joda.time.chrono.BasicWeekyearDateTimeField");
        setField(this$0, "org.joda.time.chrono.BasicWeekyearDateTimeField", "iChronology", iBase1);
        setField(this$0, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis", 31556952000L);
        setField(this$0, "org.joda.time.field.ImpreciseDateTimeField", "iDurationField", iWeekyears);
        Object iType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 3);
        String iName6 = "weekyears";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName6);
        setField(iType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        String iName7 = "weekyear";
        setField(iType6, "org.joda.time.DateTimeFieldType", "iName", iName7);
        setField(this$0, "org.joda.time.field.BaseDateTimeField", "iType", iType6);
        setField(iWeekyears, "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", "this$0", this$0);
        setField(iWeekyears, "org.joda.time.field.BaseDurationField", "iType", iUnitType);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iWeekyears", iWeekyears);
        Object iMonths = createInstance("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField");
        Object this$01 = createInstance("org.joda.time.chrono.GJMonthOfYearDateTimeField");
        setField(this$01, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iBase1);
        setField(this$01, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", 12);
        setField(this$01, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iLeapMonth", 2);
        setField(this$01, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis", 2629746000L);
        setField(this$01, "org.joda.time.field.ImpreciseDateTimeField", "iDurationField", iMonths);
        Object iType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 7);
        Object iUnitType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName8 = "months";
        setField(iUnitType1, "org.joda.time.DurationFieldType", "iName", iName8);
        setField(iType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType1);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName9 = "years";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName9);
        setField(iType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName10 = "monthOfYear";
        setField(iType7, "org.joda.time.DateTimeFieldType", "iName", iName10);
        setField(this$01, "org.joda.time.field.BaseDateTimeField", "iType", iType7);
        setField(iMonths, "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", "this$0", this$01);
        setField(iMonths, "org.joda.time.field.BaseDurationField", "iType", iUnitType1);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMonths", iMonths);
        Object iYears = createInstance("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField");
        Object this$02 = createInstance("org.joda.time.chrono.BasicYearDateTimeField");
        setField(this$02, "org.joda.time.chrono.BasicYearDateTimeField", "iChronology", iBase1);
        setField(this$02, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis", 31556952000L);
        setField(this$02, "org.joda.time.field.ImpreciseDateTimeField", "iDurationField", iYears);
        Object iType8 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        setField(iType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iRangeType);
        String iName11 = "year";
        setField(iType8, "org.joda.time.DateTimeFieldType", "iName", iName11);
        setField(this$02, "org.joda.time.field.BaseDateTimeField", "iType", iType8);
        setField(iYears, "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", "this$0", this$02);
        setField(iYears, "org.joda.time.field.BaseDurationField", "iType", iRangeType);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iYears", iYears);
        ScaledDurationField iCenturies = ((ScaledDurationField) createInstance("org.joda.time.field.ScaledDurationField"));
        setField(iCenturies, "org.joda.time.field.ScaledDurationField", "iScalar", 100);
        setField(iCenturies, "org.joda.time.field.DecoratedDurationField", "iField", iYears);
        Object iType9 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iType9, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName12 = "centuries";
        setField(iType9, "org.joda.time.DurationFieldType", "iName", iName12);
        setField(iCenturies, "org.joda.time.field.BaseDurationField", "iType", iType9);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iCenturies", iCenturies);
        UnsupportedDurationField iEras = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache = new HashMap();
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName13 = "eras";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName13);
        cCache.put(standardDurationFieldType, iEras);
        setField(iEras, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
        setField(iEras, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iEras", iEras);
        PreciseDateTimeField iMillisOfSecond = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iMillisOfSecond, "org.joda.time.field.PreciseDateTimeField", "iRange", 1000);
        setField(iMillisOfSecond, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iSeconds);
        setField(iMillisOfSecond, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
        setField(iMillisOfSecond, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iMillis);
        Object iType10 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        Object iUnitType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName14 = "millis";
        setField(iUnitType2, "org.joda.time.DurationFieldType", "iName", iName14);
        setField(iType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType2);
        setField(iType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType);
        String iName15 = "millisOfSecond";
        setField(iType10, "org.joda.time.DateTimeFieldType", "iName", iName15);
        setField(iMillisOfSecond, "org.joda.time.field.BaseDateTimeField", "iType", iType10);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond", iMillisOfSecond);
        PreciseDateTimeField iMillisOfDay = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iMillisOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange", 86400000);
        setField(iMillisOfDay, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iDays);
        setField(iMillisOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
        setField(iMillisOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iMillis);
        Object iType11 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
        setField(iType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType2);
        setField(iType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType4);
        String iName16 = "millisOfDay";
        setField(iType11, "org.joda.time.DateTimeFieldType", "iName", iName16);
        setField(iMillisOfDay, "org.joda.time.field.BaseDateTimeField", "iType", iType11);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay", iMillisOfDay);
        PreciseDateTimeField iSecondOfMinute = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iSecondOfMinute, "org.joda.time.field.PreciseDateTimeField", "iRange", 60);
        setField(iSecondOfMinute, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iMinutes);
        setField(iSecondOfMinute, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1000L);
        setField(iSecondOfMinute, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iSeconds);
        Object iType12 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        setField(iType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType);
        setField(iType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType1);
        String iName17 = "secondOfMinute";
        setField(iType12, "org.joda.time.DateTimeFieldType", "iName", iName17);
        setField(iSecondOfMinute, "org.joda.time.field.BaseDateTimeField", "iType", iType12);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iSecondOfMinute", iSecondOfMinute);
        PreciseDateTimeField iSecondOfDay = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iSecondOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange", 86400);
        setField(iSecondOfDay, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iDays);
        setField(iSecondOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1000L);
        setField(iSecondOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iSeconds);
        Object iType13 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType13, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(iType13, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType);
        setField(iType13, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType4);
        String iName18 = "secondOfDay";
        setField(iType13, "org.joda.time.DateTimeFieldType", "iName", iName18);
        setField(iSecondOfDay, "org.joda.time.field.BaseDateTimeField", "iType", iType13);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iSecondOfDay", iSecondOfDay);
        PreciseDateTimeField iMinuteOfHour = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iMinuteOfHour, "org.joda.time.field.PreciseDateTimeField", "iRange", 60);
        setField(iMinuteOfHour, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iHours);
        setField(iMinuteOfHour, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 60000L);
        setField(iMinuteOfHour, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iMinutes);
        Object iType14 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType14, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
        setField(iType14, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType1);
        setField(iType14, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType2);
        String iName19 = "minuteOfHour";
        setField(iType14, "org.joda.time.DateTimeFieldType", "iName", iName19);
        setField(iMinuteOfHour, "org.joda.time.field.BaseDateTimeField", "iType", iType14);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMinuteOfHour", iMinuteOfHour);
        PreciseDateTimeField iMinuteOfDay = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iMinuteOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange", 1440);
        setField(iMinuteOfDay, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iDays);
        setField(iMinuteOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 60000L);
        setField(iMinuteOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iMinutes);
        Object iType15 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType15, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 18);
        setField(iType15, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType1);
        setField(iType15, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType4);
        String iName20 = "minuteOfDay";
        setField(iType15, "org.joda.time.DateTimeFieldType", "iName", iName20);
        setField(iMinuteOfDay, "org.joda.time.field.BaseDateTimeField", "iType", iType15);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMinuteOfDay", iMinuteOfDay);
        PreciseDateTimeField iHourOfDay = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iHourOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange", 24);
        setField(iHourOfDay, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iDays);
        setField(iHourOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 3600000L);
        setField(iHourOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iHours);
        Object iType16 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType16, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        setField(iType16, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType2);
        setField(iType16, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType4);
        String iName21 = "hourOfDay";
        setField(iType16, "org.joda.time.DateTimeFieldType", "iName", iName21);
        setField(iHourOfDay, "org.joda.time.field.BaseDateTimeField", "iType", iType16);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iHourOfDay", iHourOfDay);
        ZeroIsMaxDateTimeField iClockhourOfDay = ((ZeroIsMaxDateTimeField) createInstance("org.joda.time.field.ZeroIsMaxDateTimeField"));
        setField(iClockhourOfDay, "org.joda.time.field.DecoratedDateTimeField", "iField", iHourOfDay);
        Object iType17 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType17, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 16);
        setField(iType17, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType2);
        setField(iType17, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType4);
        String iName22 = "clockhourOfDay";
        setField(iType17, "org.joda.time.DateTimeFieldType", "iName", iName22);
        setField(iClockhourOfDay, "org.joda.time.field.BaseDateTimeField", "iType", iType17);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay", iClockhourOfDay);
        PreciseDateTimeField iHourOfHalfday = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iHourOfHalfday, "org.joda.time.field.PreciseDateTimeField", "iRange", 12);
        setField(iHourOfHalfday, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iHalfdays);
        setField(iHourOfHalfday, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 3600000L);
        setField(iHourOfHalfday, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iHours);
        Object iType18 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType18, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        setField(iType18, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType2);
        setField(iType18, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType3);
        String iName23 = "hourOfHalfday";
        setField(iType18, "org.joda.time.DateTimeFieldType", "iName", iName23);
        setField(iHourOfHalfday, "org.joda.time.field.BaseDateTimeField", "iType", iType18);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday", iHourOfHalfday);
        ZeroIsMaxDateTimeField iClockhourOfHalfday = ((ZeroIsMaxDateTimeField) createInstance("org.joda.time.field.ZeroIsMaxDateTimeField"));
        setField(iClockhourOfHalfday, "org.joda.time.field.DecoratedDateTimeField", "iField", iHourOfHalfday);
        Object iType19 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType19, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(iType19, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType2);
        setField(iType19, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType3);
        String iName24 = "clockhourOfHalfday";
        setField(iType19, "org.joda.time.DateTimeFieldType", "iName", iName24);
        setField(iClockhourOfHalfday, "org.joda.time.field.BaseDateTimeField", "iType", iType19);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iClockhourOfHalfday", iClockhourOfHalfday);
        Object iHalfdayOfDay = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        setField(iHalfdayOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange", 2);
        setField(iHalfdayOfDay, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iDays);
        setField(iHalfdayOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 43200000L);
        setField(iHalfdayOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iHalfdays);
        Object iType20 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType20, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(iType20, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType3);
        setField(iType20, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType4);
        String iName25 = "halfdayOfDay";
        setField(iType20, "org.joda.time.DateTimeFieldType", "iName", iName25);
        setField(iHalfdayOfDay, "org.joda.time.field.BaseDateTimeField", "iType", iType20);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay", iHalfdayOfDay);
        Object iDayOfWeek = createInstance("org.joda.time.chrono.GJDayOfWeekDateTimeField");
        setField(iDayOfWeek, "org.joda.time.chrono.GJDayOfWeekDateTimeField", "iChronology", iBase1);
        setField(iDayOfWeek, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 86400000L);
        setField(iDayOfWeek, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iDays);
        Object iType21 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType21, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        setField(iType21, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType4);
        setField(iType21, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType5);
        String iName26 = "dayOfWeek";
        setField(iType21, "org.joda.time.DateTimeFieldType", "iName", iName26);
        setField(iDayOfWeek, "org.joda.time.field.BaseDateTimeField", "iType", iType21);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek", iDayOfWeek);
        Object iDayOfMonth = createInstance("org.joda.time.chrono.BasicDayOfMonthDateTimeField");
        setField(iDayOfMonth, "org.joda.time.chrono.BasicDayOfMonthDateTimeField", "iChronology", iBase1);
        setField(iDayOfMonth, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 86400000L);
        setField(iDayOfMonth, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iDays);
        Object iType22 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType22, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 8);
        setField(iType22, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType4);
        setField(iType22, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType1);
        String iName27 = "dayOfMonth";
        setField(iType22, "org.joda.time.DateTimeFieldType", "iName", iName27);
        setField(iDayOfMonth, "org.joda.time.field.BaseDateTimeField", "iType", iType22);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth", iDayOfMonth);
        Object iDayOfYear = createInstance("org.joda.time.chrono.BasicDayOfYearDateTimeField");
        setField(iDayOfYear, "org.joda.time.chrono.BasicDayOfYearDateTimeField", "iChronology", iBase1);
        setField(iDayOfYear, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 86400000L);
        setField(iDayOfYear, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iDays);
        Object iType23 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType23, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        setField(iType23, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType4);
        setField(iType23, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName28 = "dayOfYear";
        setField(iType23, "org.joda.time.DateTimeFieldType", "iName", iName28);
        setField(iDayOfYear, "org.joda.time.field.BaseDateTimeField", "iType", iType23);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iDayOfYear", iDayOfYear);
        Object iWeekOfWeekyear = createInstance("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField");
        setField(iWeekOfWeekyear, "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", "iChronology", iBase1);
        setField(iWeekOfWeekyear, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 604800000L);
        setField(iWeekOfWeekyear, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iWeeks);
        Object iType24 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType24, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 11);
        setField(iType24, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType5);
        setField(iType24, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
        String iName29 = "weekOfWeekyear";
        setField(iType24, "org.joda.time.DateTimeFieldType", "iName", iName29);
        setField(iWeekOfWeekyear, "org.joda.time.field.BaseDateTimeField", "iType", iType24);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear", iWeekOfWeekyear);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iWeekyear", this$0);
        OffsetDateTimeField iWeekyearOfCentury = ((OffsetDateTimeField) createInstance("org.joda.time.field.OffsetDateTimeField"));
        setField(iWeekyearOfCentury, "org.joda.time.field.OffsetDateTimeField", "iOffset", 1);
        setField(iWeekyearOfCentury, "org.joda.time.field.OffsetDateTimeField", "iMin", 1);
        setField(iWeekyearOfCentury, "org.joda.time.field.OffsetDateTimeField", "iMax", 100);
        RemainderDateTimeField iField = ((RemainderDateTimeField) createInstance("org.joda.time.field.RemainderDateTimeField"));
        setField(iField, "org.joda.time.field.RemainderDateTimeField", "iDivisor", 100);
        ScaledDurationField iRangeField = ((ScaledDurationField) createInstance("org.joda.time.field.ScaledDurationField"));
        setField(iRangeField, "org.joda.time.field.ScaledDurationField", "iScalar", 100);
        setField(iRangeField, "org.joda.time.field.DecoratedDurationField", "iField", iWeekyears);
        setField(iRangeField, "org.joda.time.field.BaseDurationField", "iType", iType9);
        setField(iField, "org.joda.time.field.RemainderDateTimeField", "iRangeField", iRangeField);
        setField(iField, "org.joda.time.field.DecoratedDateTimeField", "iField", this$0);
        Object iType25 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType25, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        setField(iType25, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        setField(iType25, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType9);
        String iName30 = "weekyearOfCentury";
        setField(iType25, "org.joda.time.DateTimeFieldType", "iName", iName30);
        setField(iField, "org.joda.time.field.BaseDateTimeField", "iType", iType25);
        setField(iWeekyearOfCentury, "org.joda.time.field.DecoratedDateTimeField", "iField", iField);
        setField(iWeekyearOfCentury, "org.joda.time.field.BaseDateTimeField", "iType", iType25);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury", iWeekyearOfCentury);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", this$01);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iYear", this$02);
        Object iYearOfEra = createInstance("org.joda.time.chrono.GJYearOfEraDateTimeField");
        setField(iYearOfEra, "org.joda.time.chrono.GJYearOfEraDateTimeField", "iChronology", iBase1);
        setField(iYearOfEra, "org.joda.time.field.DecoratedDateTimeField", "iField", this$02);
        Object iType26 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType26, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        setField(iType26, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iRangeType);
        setField(iType26, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName31 = "yearOfEra";
        setField(iType26, "org.joda.time.DateTimeFieldType", "iName", iName31);
        setField(iYearOfEra, "org.joda.time.field.BaseDateTimeField", "iType", iType26);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iYearOfEra", iYearOfEra);
        OffsetDateTimeField iYearOfCentury = ((OffsetDateTimeField) createInstance("org.joda.time.field.OffsetDateTimeField"));
        setField(iYearOfCentury, "org.joda.time.field.OffsetDateTimeField", "iOffset", 1);
        setField(iYearOfCentury, "org.joda.time.field.OffsetDateTimeField", "iMin", 1);
        setField(iYearOfCentury, "org.joda.time.field.OffsetDateTimeField", "iMax", 100);
        RemainderDateTimeField iField1 = ((RemainderDateTimeField) createInstance("org.joda.time.field.RemainderDateTimeField"));
        setField(iField1, "org.joda.time.field.RemainderDateTimeField", "iDivisor", 100);
        setField(iField1, "org.joda.time.field.RemainderDateTimeField", "iRangeField", iCenturies);
        OffsetDateTimeField iField2 = ((OffsetDateTimeField) createInstance("org.joda.time.field.OffsetDateTimeField"));
        setField(iField2, "org.joda.time.field.OffsetDateTimeField", "iOffset", 99);
        setField(iField2, "org.joda.time.field.OffsetDateTimeField", "iMin", 100);
        setField(iField2, "org.joda.time.field.OffsetDateTimeField", "iMax", 292279092);
        setField(iField2, "org.joda.time.field.DecoratedDateTimeField", "iField", iYearOfEra);
        setField(iField2, "org.joda.time.field.BaseDateTimeField", "iType", iType26);
        setField(iField1, "org.joda.time.field.DecoratedDateTimeField", "iField", iField2);
        Object iType27 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType27, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        setField(iType27, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType9);
        setField(iType27, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName32 = "centuryOfEra";
        setField(iType27, "org.joda.time.DateTimeFieldType", "iName", iName32);
        setField(iField1, "org.joda.time.field.BaseDateTimeField", "iType", iType27);
        setField(iYearOfCentury, "org.joda.time.field.DecoratedDateTimeField", "iField", iField1);
        Object iType28 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType28, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(iType28, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iRangeType);
        setField(iType28, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType9);
        String iName33 = "yearOfCentury";
        setField(iType28, "org.joda.time.DateTimeFieldType", "iName", iName33);
        setField(iYearOfCentury, "org.joda.time.field.BaseDateTimeField", "iType", iType28);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury", iYearOfCentury);
        DividedDateTimeField iCenturyOfEra = ((DividedDateTimeField) createInstance("org.joda.time.field.DividedDateTimeField"));
        setField(iCenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iDivisor", 100);
        setField(iCenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iDurationField", iCenturies);
        setField(iCenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iMin", 1);
        setField(iCenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iMax", 2922790);
        setField(iCenturyOfEra, "org.joda.time.field.DecoratedDateTimeField", "iField", iField2);
        setField(iCenturyOfEra, "org.joda.time.field.BaseDateTimeField", "iType", iType27);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra);
        Object iEra = createInstance("org.joda.time.chrono.GJEraDateTimeField");
        setField(iEra, "org.joda.time.chrono.GJEraDateTimeField", "iChronology", iBase1);
        Object iType29 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType29, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 1);
        setField(iType29, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        String iName34 = "era";
        setField(iType29, "org.joda.time.DateTimeFieldType", "iName", iName34);
        setField(iEra, "org.joda.time.field.BaseDateTimeField", "iType", iType29);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iEra", iEra);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMillis", iMillis);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iSeconds", iSeconds);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMinutes", iMinutes);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iHours", iHours);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iHalfdays", iHalfdays);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iDays", iDays);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iWeeks", iWeeks);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iWeekyears", iWeekyears);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMonths", iMonths);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iYears", iYears);
        ScaledDurationField iCenturies1 = ((ScaledDurationField) createInstance("org.joda.time.field.ScaledDurationField"));
        setField(iCenturies1, "org.joda.time.field.ScaledDurationField", "iScalar", 100);
        setField(iCenturies1, "org.joda.time.field.DecoratedDurationField", "iField", iYears);
        setField(iCenturies1, "org.joda.time.field.BaseDurationField", "iType", iType9);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iCenturies", iCenturies1);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iEras", iEras);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond", iMillisOfSecond);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay", iMillisOfDay);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iSecondOfMinute", iSecondOfMinute);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iSecondOfDay", iSecondOfDay);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMinuteOfHour", iMinuteOfHour);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMinuteOfDay", iMinuteOfDay);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iHourOfDay", iHourOfDay);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay", iClockhourOfDay);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday", iHourOfHalfday);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iClockhourOfHalfday", iClockhourOfHalfday);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay", iHalfdayOfDay);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek", iDayOfWeek);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth", iDayOfMonth);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iDayOfYear", iDayOfYear);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear", iWeekOfWeekyear);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iWeekyear", this$0);
        RemainderDateTimeField iWeekyearOfCentury1 = ((RemainderDateTimeField) createInstance("org.joda.time.field.RemainderDateTimeField"));
        setField(iWeekyearOfCentury1, "org.joda.time.field.RemainderDateTimeField", "iDivisor", 100);
        setField(iWeekyearOfCentury1, "org.joda.time.field.RemainderDateTimeField", "iRangeField", iCenturies1);
        Object iField3 = createInstance("org.joda.time.chrono.ISOYearOfEraDateTimeField");
        setField(iField3, "org.joda.time.field.DecoratedDateTimeField", "iField", this$02);
        setField(iField3, "org.joda.time.field.BaseDateTimeField", "iType", iType26);
        setField(iWeekyearOfCentury1, "org.joda.time.field.DecoratedDateTimeField", "iField", iField3);
        setField(iWeekyearOfCentury1, "org.joda.time.field.BaseDateTimeField", "iType", iType25);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury", iWeekyearOfCentury1);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", this$01);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iYear", this$02);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iYearOfEra", iYearOfEra);
        RemainderDateTimeField iYearOfCentury1 = ((RemainderDateTimeField) createInstance("org.joda.time.field.RemainderDateTimeField"));
        setField(iYearOfCentury1, "org.joda.time.field.RemainderDateTimeField", "iDivisor", 100);
        setField(iYearOfCentury1, "org.joda.time.field.RemainderDateTimeField", "iRangeField", iCenturies1);
        setField(iYearOfCentury1, "org.joda.time.field.DecoratedDateTimeField", "iField", iField3);
        setField(iYearOfCentury1, "org.joda.time.field.BaseDateTimeField", "iType", iType28);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury", iYearOfCentury1);
        DividedDateTimeField iCenturyOfEra1 = ((DividedDateTimeField) createInstance("org.joda.time.field.DividedDateTimeField"));
        setField(iCenturyOfEra1, "org.joda.time.field.DividedDateTimeField", "iDivisor", 100);
        setField(iCenturyOfEra1, "org.joda.time.field.DividedDateTimeField", "iDurationField", iCenturies1);
        setField(iCenturyOfEra1, "org.joda.time.field.DividedDateTimeField", "iMax", 2922789);
        setField(iCenturyOfEra1, "org.joda.time.field.DecoratedDateTimeField", "iField", iField3);
        setField(iCenturyOfEra1, "org.joda.time.field.BaseDateTimeField", "iType", iType27);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra1);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iEra", iEra);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBaseFlags", 7);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMillis", iMillis);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iSeconds", iSeconds);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMinutes", iMinutes);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iHours", iHours);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iHalfdays", iHalfdays);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iDays", iDays);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iWeeks", iWeeks);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iWeekyears", iWeekyears);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMonths", iMonths);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iYears", iYears);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iCenturies", iCenturies1);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iEras", iEras);
        LenientDateTimeField iMillisOfSecond1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iMillisOfSecond1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iMillisOfSecond1, "org.joda.time.field.DelegatedDateTimeField", "iField", iMillisOfSecond);
        setField(iMillisOfSecond1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType10);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond", iMillisOfSecond1);
        LenientDateTimeField iMillisOfDay1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iMillisOfDay1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iMillisOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iField", iMillisOfDay);
        setField(iMillisOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType11);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay", iMillisOfDay1);
        LenientDateTimeField iSecondOfMinute1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iSecondOfMinute1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iSecondOfMinute1, "org.joda.time.field.DelegatedDateTimeField", "iField", iSecondOfMinute);
        setField(iSecondOfMinute1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType12);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iSecondOfMinute", iSecondOfMinute1);
        LenientDateTimeField iSecondOfDay1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iSecondOfDay1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iSecondOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iField", iSecondOfDay);
        setField(iSecondOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType13);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iSecondOfDay", iSecondOfDay1);
        LenientDateTimeField iMinuteOfHour1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iMinuteOfHour1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iMinuteOfHour1, "org.joda.time.field.DelegatedDateTimeField", "iField", iMinuteOfHour);
        setField(iMinuteOfHour1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType14);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMinuteOfHour", iMinuteOfHour1);
        LenientDateTimeField iMinuteOfDay1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iMinuteOfDay1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iMinuteOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iField", iMinuteOfDay);
        setField(iMinuteOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType15);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMinuteOfDay", iMinuteOfDay1);
        LenientDateTimeField iHourOfDay1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iHourOfDay1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iHourOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iField", iHourOfDay);
        setField(iHourOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType16);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iHourOfDay", iHourOfDay1);
        LenientDateTimeField iClockhourOfDay1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iClockhourOfDay1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iClockhourOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iField", iClockhourOfDay);
        setField(iClockhourOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType17);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay", iClockhourOfDay1);
        LenientDateTimeField iHourOfHalfday1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iHourOfHalfday1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iHourOfHalfday1, "org.joda.time.field.DelegatedDateTimeField", "iField", iHourOfHalfday);
        setField(iHourOfHalfday1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType18);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday", iHourOfHalfday1);
        LenientDateTimeField iClockhourOfHalfday1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iClockhourOfHalfday1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iClockhourOfHalfday1, "org.joda.time.field.DelegatedDateTimeField", "iField", iClockhourOfHalfday);
        setField(iClockhourOfHalfday1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType19);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iClockhourOfHalfday", iClockhourOfHalfday1);
        LenientDateTimeField iHalfdayOfDay1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iHalfdayOfDay1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iHalfdayOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iField", iHalfdayOfDay);
        setField(iHalfdayOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType20);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay", iHalfdayOfDay1);
        LenientDateTimeField iDayOfWeek1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iDayOfWeek1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iDayOfWeek1, "org.joda.time.field.DelegatedDateTimeField", "iField", iDayOfWeek);
        setField(iDayOfWeek1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType21);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek", iDayOfWeek1);
        LenientDateTimeField iDayOfMonth1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iDayOfMonth1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iDayOfMonth1, "org.joda.time.field.DelegatedDateTimeField", "iField", iDayOfMonth);
        setField(iDayOfMonth1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType22);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth", iDayOfMonth1);
        LenientDateTimeField iDayOfYear1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iDayOfYear1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iDayOfYear1, "org.joda.time.field.DelegatedDateTimeField", "iField", iDayOfYear);
        setField(iDayOfYear1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType23);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iDayOfYear", iDayOfYear1);
        LenientDateTimeField iWeekOfWeekyear1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iWeekOfWeekyear1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iWeekOfWeekyear1, "org.joda.time.field.DelegatedDateTimeField", "iField", iWeekOfWeekyear);
        setField(iWeekOfWeekyear1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType24);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear", iWeekOfWeekyear1);
        LenientDateTimeField iWeekyear = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iWeekyear, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iWeekyear, "org.joda.time.field.DelegatedDateTimeField", "iField", this$0);
        setField(iWeekyear, "org.joda.time.field.DelegatedDateTimeField", "iType", iType6);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iWeekyear", iWeekyear);
        LenientDateTimeField iWeekyearOfCentury2 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iWeekyearOfCentury2, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iWeekyearOfCentury2, "org.joda.time.field.DelegatedDateTimeField", "iField", iWeekyearOfCentury1);
        setField(iWeekyearOfCentury2, "org.joda.time.field.DelegatedDateTimeField", "iType", iType25);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury", iWeekyearOfCentury2);
        LenientDateTimeField iMonthOfYear = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iMonthOfYear, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", this$01);
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iType", iType7);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        LenientDateTimeField iYear = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iYear, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iYear, "org.joda.time.field.DelegatedDateTimeField", "iField", this$02);
        setField(iYear, "org.joda.time.field.DelegatedDateTimeField", "iType", iType8);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        LenientDateTimeField iYearOfEra1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iYearOfEra1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iYearOfEra1, "org.joda.time.field.DelegatedDateTimeField", "iField", iYearOfEra);
        setField(iYearOfEra1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType26);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iYearOfEra", iYearOfEra1);
        LenientDateTimeField iYearOfCentury2 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iYearOfCentury2, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iYearOfCentury2, "org.joda.time.field.DelegatedDateTimeField", "iField", iYearOfCentury1);
        setField(iYearOfCentury2, "org.joda.time.field.DelegatedDateTimeField", "iType", iType28);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury", iYearOfCentury2);
        LenientDateTimeField iCenturyOfEra2 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iCenturyOfEra2, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iCenturyOfEra2, "org.joda.time.field.DelegatedDateTimeField", "iField", iCenturyOfEra1);
        setField(iCenturyOfEra2, "org.joda.time.field.DelegatedDateTimeField", "iType", iType27);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra2);
        LenientDateTimeField iEra1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iEra1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        setField(iEra1, "org.joda.time.field.DelegatedDateTimeField", "iField", iEra);
        setField(iEra1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType29);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iEra", iEra1);
        
        // org.joda.time.chrono.LenientChronology has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLenientISOChronology()
    
    @Test
    public void testGetLenientISOChronology1() throws Exception  {
        Chronology prevCLenientISO = ZoneInfoCompiler.cLenientISO;
        try {
            ZoneInfoCompiler.cLenientISO = null;
            
            LenientChronology actual = ((LenientChronology) ZoneInfoCompiler.getLenientISOChronology());
            
            LenientChronology expected = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
            ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
            GregorianChronology iBase1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
            java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 1024);
            Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
            setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 2050);
            setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", 2524608000000L);
            iYearInfoCache[2] = yearInfo;
            Object yearInfo1 = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
            setField(yearInfo1, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 1850);
            setField(yearInfo1, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", -3786825600000L);
            iYearInfoCache[826] = yearInfo1;
            Object yearInfo2 = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
            setField(yearInfo2, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 1970);
            setField(yearInfo2, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", 0L);
            iYearInfoCache[946] = yearInfo2;
            setField(iBase1, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
            setField(iBase1, "org.joda.time.chrono.BasicChronology", "iMinDaysInFirstWeek", 4);
            MillisDurationField iMillis = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMillis", iMillis);
            PreciseDurationField iSeconds = ((PreciseDurationField) createInstance("org.joda.time.field.PreciseDurationField"));
            setField(iSeconds, "org.joda.time.field.PreciseDurationField", "iUnitMillis", 1000L);
            Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(iType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName = "seconds";
            setField(iType, "org.joda.time.DurationFieldType", "iName", iName);
            setField(iSeconds, "org.joda.time.field.BaseDurationField", "iType", iType);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iSeconds", iSeconds);
            PreciseDurationField iMinutes = ((PreciseDurationField) createInstance("org.joda.time.field.PreciseDurationField"));
            setField(iMinutes, "org.joda.time.field.PreciseDurationField", "iUnitMillis", 60000L);
            Object iType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(iType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName1 = "minutes";
            setField(iType1, "org.joda.time.DurationFieldType", "iName", iName1);
            setField(iMinutes, "org.joda.time.field.BaseDurationField", "iType", iType1);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMinutes", iMinutes);
            PreciseDurationField iHours = ((PreciseDurationField) createInstance("org.joda.time.field.PreciseDurationField"));
            setField(iHours, "org.joda.time.field.PreciseDurationField", "iUnitMillis", 3600000L);
            Object iType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(iType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName2 = "hours";
            setField(iType2, "org.joda.time.DurationFieldType", "iName", iName2);
            setField(iHours, "org.joda.time.field.BaseDurationField", "iType", iType2);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iHours", iHours);
            PreciseDurationField iHalfdays = ((PreciseDurationField) createInstance("org.joda.time.field.PreciseDurationField"));
            setField(iHalfdays, "org.joda.time.field.PreciseDurationField", "iUnitMillis", 43200000L);
            Object iType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(iType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
            String iName3 = "halfdays";
            setField(iType3, "org.joda.time.DurationFieldType", "iName", iName3);
            setField(iHalfdays, "org.joda.time.field.BaseDurationField", "iType", iType3);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iHalfdays", iHalfdays);
            PreciseDurationField iDays = ((PreciseDurationField) createInstance("org.joda.time.field.PreciseDurationField"));
            setField(iDays, "org.joda.time.field.PreciseDurationField", "iUnitMillis", 86400000L);
            Object iType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(iType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName4 = "days";
            setField(iType4, "org.joda.time.DurationFieldType", "iName", iName4);
            setField(iDays, "org.joda.time.field.BaseDurationField", "iType", iType4);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iDays", iDays);
            PreciseDurationField iWeeks = ((PreciseDurationField) createInstance("org.joda.time.field.PreciseDurationField"));
            setField(iWeeks, "org.joda.time.field.PreciseDurationField", "iUnitMillis", 604800000L);
            Object iType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(iType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName5 = "weeks";
            setField(iType5, "org.joda.time.DurationFieldType", "iName", iName5);
            setField(iWeeks, "org.joda.time.field.BaseDurationField", "iType", iType5);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iWeeks", iWeeks);
            Object iWeekyears = createInstance("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField");
            Object this$0 = createInstance("org.joda.time.chrono.BasicWeekyearDateTimeField");
            setField(this$0, "org.joda.time.chrono.BasicWeekyearDateTimeField", "iChronology", iBase1);
            setField(this$0, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis", 31556952000L);
            setField(this$0, "org.joda.time.field.ImpreciseDateTimeField", "iDurationField", iWeekyears);
            Object iType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
            Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 3);
            String iName6 = "weekyears";
            setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName6);
            setField(iType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
            String iName7 = "weekyear";
            setField(iType6, "org.joda.time.DateTimeFieldType", "iName", iName7);
            setField(this$0, "org.joda.time.field.BaseDateTimeField", "iType", iType6);
            setField(iWeekyears, "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", "this$0", this$0);
            setField(iWeekyears, "org.joda.time.field.BaseDurationField", "iType", iUnitType);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iWeekyears", iWeekyears);
            Object iMonths = createInstance("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField");
            Object this$01 = createInstance("org.joda.time.chrono.GJMonthOfYearDateTimeField");
            setField(this$01, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iBase1);
            setField(this$01, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", 12);
            setField(this$01, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iLeapMonth", 2);
            setField(this$01, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis", 2629746000L);
            setField(this$01, "org.joda.time.field.ImpreciseDateTimeField", "iDurationField", iMonths);
            Object iType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 7);
            Object iUnitType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(iUnitType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName8 = "months";
            setField(iUnitType1, "org.joda.time.DurationFieldType", "iName", iName8);
            setField(iType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType1);
            Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName9 = "years";
            setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName9);
            setField(iType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
            String iName10 = "monthOfYear";
            setField(iType7, "org.joda.time.DateTimeFieldType", "iName", iName10);
            setField(this$01, "org.joda.time.field.BaseDateTimeField", "iType", iType7);
            setField(iMonths, "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", "this$0", this$01);
            setField(iMonths, "org.joda.time.field.BaseDurationField", "iType", iUnitType1);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMonths", iMonths);
            Object iYears = createInstance("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField");
            Object this$02 = createInstance("org.joda.time.chrono.BasicYearDateTimeField");
            setField(this$02, "org.joda.time.chrono.BasicYearDateTimeField", "iChronology", iBase1);
            setField(this$02, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis", 31556952000L);
            setField(this$02, "org.joda.time.field.ImpreciseDateTimeField", "iDurationField", iYears);
            Object iType8 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
            setField(iType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iRangeType);
            String iName11 = "year";
            setField(iType8, "org.joda.time.DateTimeFieldType", "iName", iName11);
            setField(this$02, "org.joda.time.field.BaseDateTimeField", "iType", iType8);
            setField(iYears, "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", "this$0", this$02);
            setField(iYears, "org.joda.time.field.BaseDurationField", "iType", iRangeType);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iYears", iYears);
            ScaledDurationField iCenturies = ((ScaledDurationField) createInstance("org.joda.time.field.ScaledDurationField"));
            setField(iCenturies, "org.joda.time.field.ScaledDurationField", "iScalar", 100);
            setField(iCenturies, "org.joda.time.field.DecoratedDurationField", "iField", iYears);
            Object iType9 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(iType9, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
            String iName12 = "centuries";
            setField(iType9, "org.joda.time.DurationFieldType", "iName", iName12);
            setField(iCenturies, "org.joda.time.field.BaseDurationField", "iType", iType9);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iCenturies", iCenturies);
            UnsupportedDurationField iEras = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            HashMap cCache = new HashMap();
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
            String iName13 = "eras";
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName13);
            cCache.put(standardDurationFieldType, iEras);
            setField(iEras, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
            setField(iEras, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iEras", iEras);
            PreciseDateTimeField iMillisOfSecond = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
            setField(iMillisOfSecond, "org.joda.time.field.PreciseDateTimeField", "iRange", 1000);
            setField(iMillisOfSecond, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iSeconds);
            setField(iMillisOfSecond, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
            setField(iMillisOfSecond, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iMillis);
            Object iType10 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
            Object iUnitType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(iUnitType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
            String iName14 = "millis";
            setField(iUnitType2, "org.joda.time.DurationFieldType", "iName", iName14);
            setField(iType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType2);
            setField(iType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType);
            String iName15 = "millisOfSecond";
            setField(iType10, "org.joda.time.DateTimeFieldType", "iName", iName15);
            setField(iMillisOfSecond, "org.joda.time.field.BaseDateTimeField", "iType", iType10);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond", iMillisOfSecond);
            PreciseDateTimeField iMillisOfDay = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
            setField(iMillisOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange", 86400000);
            setField(iMillisOfDay, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iDays);
            setField(iMillisOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
            setField(iMillisOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iMillis);
            Object iType11 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
            setField(iType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType2);
            setField(iType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType4);
            String iName16 = "millisOfDay";
            setField(iType11, "org.joda.time.DateTimeFieldType", "iName", iName16);
            setField(iMillisOfDay, "org.joda.time.field.BaseDateTimeField", "iType", iType11);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay", iMillisOfDay);
            PreciseDateTimeField iSecondOfMinute = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
            setField(iSecondOfMinute, "org.joda.time.field.PreciseDateTimeField", "iRange", 60);
            setField(iSecondOfMinute, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iMinutes);
            setField(iSecondOfMinute, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1000L);
            setField(iSecondOfMinute, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iSeconds);
            Object iType12 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
            setField(iType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType);
            setField(iType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType1);
            String iName17 = "secondOfMinute";
            setField(iType12, "org.joda.time.DateTimeFieldType", "iName", iName17);
            setField(iSecondOfMinute, "org.joda.time.field.BaseDateTimeField", "iType", iType12);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iSecondOfMinute", iSecondOfMinute);
            PreciseDateTimeField iSecondOfDay = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
            setField(iSecondOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange", 86400);
            setField(iSecondOfDay, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iDays);
            setField(iSecondOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1000L);
            setField(iSecondOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iSeconds);
            Object iType13 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType13, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
            setField(iType13, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType);
            setField(iType13, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType4);
            String iName18 = "secondOfDay";
            setField(iType13, "org.joda.time.DateTimeFieldType", "iName", iName18);
            setField(iSecondOfDay, "org.joda.time.field.BaseDateTimeField", "iType", iType13);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iSecondOfDay", iSecondOfDay);
            PreciseDateTimeField iMinuteOfHour = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
            setField(iMinuteOfHour, "org.joda.time.field.PreciseDateTimeField", "iRange", 60);
            setField(iMinuteOfHour, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iHours);
            setField(iMinuteOfHour, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 60000L);
            setField(iMinuteOfHour, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iMinutes);
            Object iType14 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType14, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
            setField(iType14, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType1);
            setField(iType14, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType2);
            String iName19 = "minuteOfHour";
            setField(iType14, "org.joda.time.DateTimeFieldType", "iName", iName19);
            setField(iMinuteOfHour, "org.joda.time.field.BaseDateTimeField", "iType", iType14);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMinuteOfHour", iMinuteOfHour);
            PreciseDateTimeField iMinuteOfDay = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
            setField(iMinuteOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange", 1440);
            setField(iMinuteOfDay, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iDays);
            setField(iMinuteOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 60000L);
            setField(iMinuteOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iMinutes);
            Object iType15 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType15, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 18);
            setField(iType15, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType1);
            setField(iType15, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType4);
            String iName20 = "minuteOfDay";
            setField(iType15, "org.joda.time.DateTimeFieldType", "iName", iName20);
            setField(iMinuteOfDay, "org.joda.time.field.BaseDateTimeField", "iType", iType15);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMinuteOfDay", iMinuteOfDay);
            PreciseDateTimeField iHourOfDay = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
            setField(iHourOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange", 24);
            setField(iHourOfDay, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iDays);
            setField(iHourOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 3600000L);
            setField(iHourOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iHours);
            Object iType16 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType16, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
            setField(iType16, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType2);
            setField(iType16, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType4);
            String iName21 = "hourOfDay";
            setField(iType16, "org.joda.time.DateTimeFieldType", "iName", iName21);
            setField(iHourOfDay, "org.joda.time.field.BaseDateTimeField", "iType", iType16);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iHourOfDay", iHourOfDay);
            ZeroIsMaxDateTimeField iClockhourOfDay = ((ZeroIsMaxDateTimeField) createInstance("org.joda.time.field.ZeroIsMaxDateTimeField"));
            setField(iClockhourOfDay, "org.joda.time.field.DecoratedDateTimeField", "iField", iHourOfDay);
            Object iType17 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType17, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 16);
            setField(iType17, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType2);
            setField(iType17, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType4);
            String iName22 = "clockhourOfDay";
            setField(iType17, "org.joda.time.DateTimeFieldType", "iName", iName22);
            setField(iClockhourOfDay, "org.joda.time.field.BaseDateTimeField", "iType", iType17);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay", iClockhourOfDay);
            PreciseDateTimeField iHourOfHalfday = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
            setField(iHourOfHalfday, "org.joda.time.field.PreciseDateTimeField", "iRange", 12);
            setField(iHourOfHalfday, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iHalfdays);
            setField(iHourOfHalfday, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 3600000L);
            setField(iHourOfHalfday, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iHours);
            Object iType18 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType18, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
            setField(iType18, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType2);
            setField(iType18, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType3);
            String iName23 = "hourOfHalfday";
            setField(iType18, "org.joda.time.DateTimeFieldType", "iName", iName23);
            setField(iHourOfHalfday, "org.joda.time.field.BaseDateTimeField", "iType", iType18);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday", iHourOfHalfday);
            ZeroIsMaxDateTimeField iClockhourOfHalfday = ((ZeroIsMaxDateTimeField) createInstance("org.joda.time.field.ZeroIsMaxDateTimeField"));
            setField(iClockhourOfHalfday, "org.joda.time.field.DecoratedDateTimeField", "iField", iHourOfHalfday);
            Object iType19 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType19, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
            setField(iType19, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType2);
            setField(iType19, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType3);
            String iName24 = "clockhourOfHalfday";
            setField(iType19, "org.joda.time.DateTimeFieldType", "iName", iName24);
            setField(iClockhourOfHalfday, "org.joda.time.field.BaseDateTimeField", "iType", iType19);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iClockhourOfHalfday", iClockhourOfHalfday);
            Object iHalfdayOfDay = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
            setField(iHalfdayOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange", 2);
            setField(iHalfdayOfDay, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iDays);
            setField(iHalfdayOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 43200000L);
            setField(iHalfdayOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iHalfdays);
            Object iType20 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType20, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
            setField(iType20, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType3);
            setField(iType20, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType4);
            String iName25 = "halfdayOfDay";
            setField(iType20, "org.joda.time.DateTimeFieldType", "iName", iName25);
            setField(iHalfdayOfDay, "org.joda.time.field.BaseDateTimeField", "iType", iType20);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay", iHalfdayOfDay);
            Object iDayOfWeek = createInstance("org.joda.time.chrono.GJDayOfWeekDateTimeField");
            setField(iDayOfWeek, "org.joda.time.chrono.GJDayOfWeekDateTimeField", "iChronology", iBase1);
            setField(iDayOfWeek, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 86400000L);
            setField(iDayOfWeek, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iDays);
            Object iType21 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType21, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
            setField(iType21, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType4);
            setField(iType21, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType5);
            String iName26 = "dayOfWeek";
            setField(iType21, "org.joda.time.DateTimeFieldType", "iName", iName26);
            setField(iDayOfWeek, "org.joda.time.field.BaseDateTimeField", "iType", iType21);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek", iDayOfWeek);
            Object iDayOfMonth = createInstance("org.joda.time.chrono.BasicDayOfMonthDateTimeField");
            setField(iDayOfMonth, "org.joda.time.chrono.BasicDayOfMonthDateTimeField", "iChronology", iBase1);
            setField(iDayOfMonth, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 86400000L);
            setField(iDayOfMonth, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iDays);
            Object iType22 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType22, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 8);
            setField(iType22, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType4);
            setField(iType22, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType1);
            String iName27 = "dayOfMonth";
            setField(iType22, "org.joda.time.DateTimeFieldType", "iName", iName27);
            setField(iDayOfMonth, "org.joda.time.field.BaseDateTimeField", "iType", iType22);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth", iDayOfMonth);
            Object iDayOfYear = createInstance("org.joda.time.chrono.BasicDayOfYearDateTimeField");
            setField(iDayOfYear, "org.joda.time.chrono.BasicDayOfYearDateTimeField", "iChronology", iBase1);
            setField(iDayOfYear, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 86400000L);
            setField(iDayOfYear, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iDays);
            Object iType23 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType23, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
            setField(iType23, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType4);
            setField(iType23, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
            String iName28 = "dayOfYear";
            setField(iType23, "org.joda.time.DateTimeFieldType", "iName", iName28);
            setField(iDayOfYear, "org.joda.time.field.BaseDateTimeField", "iType", iType23);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iDayOfYear", iDayOfYear);
            Object iWeekOfWeekyear = createInstance("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField");
            setField(iWeekOfWeekyear, "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", "iChronology", iBase1);
            setField(iWeekOfWeekyear, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 604800000L);
            setField(iWeekOfWeekyear, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField", iWeeks);
            Object iType24 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType24, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 11);
            setField(iType24, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType5);
            setField(iType24, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
            String iName29 = "weekOfWeekyear";
            setField(iType24, "org.joda.time.DateTimeFieldType", "iName", iName29);
            setField(iWeekOfWeekyear, "org.joda.time.field.BaseDateTimeField", "iType", iType24);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear", iWeekOfWeekyear);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iWeekyear", this$0);
            OffsetDateTimeField iWeekyearOfCentury = ((OffsetDateTimeField) createInstance("org.joda.time.field.OffsetDateTimeField"));
            setField(iWeekyearOfCentury, "org.joda.time.field.OffsetDateTimeField", "iOffset", 1);
            setField(iWeekyearOfCentury, "org.joda.time.field.OffsetDateTimeField", "iMin", 1);
            setField(iWeekyearOfCentury, "org.joda.time.field.OffsetDateTimeField", "iMax", 100);
            RemainderDateTimeField iField = ((RemainderDateTimeField) createInstance("org.joda.time.field.RemainderDateTimeField"));
            setField(iField, "org.joda.time.field.RemainderDateTimeField", "iDivisor", 100);
            ScaledDurationField iRangeField = ((ScaledDurationField) createInstance("org.joda.time.field.ScaledDurationField"));
            setField(iRangeField, "org.joda.time.field.ScaledDurationField", "iScalar", 100);
            setField(iRangeField, "org.joda.time.field.DecoratedDurationField", "iField", iWeekyears);
            setField(iRangeField, "org.joda.time.field.BaseDurationField", "iType", iType9);
            setField(iField, "org.joda.time.field.RemainderDateTimeField", "iRangeField", iRangeField);
            setField(iField, "org.joda.time.field.DecoratedDateTimeField", "iField", this$0);
            Object iType25 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType25, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
            setField(iType25, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
            setField(iType25, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType9);
            String iName30 = "weekyearOfCentury";
            setField(iType25, "org.joda.time.DateTimeFieldType", "iName", iName30);
            setField(iField, "org.joda.time.field.BaseDateTimeField", "iType", iType25);
            setField(iWeekyearOfCentury, "org.joda.time.field.DecoratedDateTimeField", "iField", iField);
            setField(iWeekyearOfCentury, "org.joda.time.field.BaseDateTimeField", "iType", iType25);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury", iWeekyearOfCentury);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", this$01);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iYear", this$02);
            Object iYearOfEra = createInstance("org.joda.time.chrono.GJYearOfEraDateTimeField");
            setField(iYearOfEra, "org.joda.time.chrono.GJYearOfEraDateTimeField", "iChronology", iBase1);
            setField(iYearOfEra, "org.joda.time.field.DecoratedDateTimeField", "iField", this$02);
            Object iType26 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType26, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
            setField(iType26, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iRangeType);
            setField(iType26, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
            String iName31 = "yearOfEra";
            setField(iType26, "org.joda.time.DateTimeFieldType", "iName", iName31);
            setField(iYearOfEra, "org.joda.time.field.BaseDateTimeField", "iType", iType26);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iYearOfEra", iYearOfEra);
            OffsetDateTimeField iYearOfCentury = ((OffsetDateTimeField) createInstance("org.joda.time.field.OffsetDateTimeField"));
            setField(iYearOfCentury, "org.joda.time.field.OffsetDateTimeField", "iOffset", 1);
            setField(iYearOfCentury, "org.joda.time.field.OffsetDateTimeField", "iMin", 1);
            setField(iYearOfCentury, "org.joda.time.field.OffsetDateTimeField", "iMax", 100);
            RemainderDateTimeField iField1 = ((RemainderDateTimeField) createInstance("org.joda.time.field.RemainderDateTimeField"));
            setField(iField1, "org.joda.time.field.RemainderDateTimeField", "iDivisor", 100);
            setField(iField1, "org.joda.time.field.RemainderDateTimeField", "iRangeField", iCenturies);
            OffsetDateTimeField iField2 = ((OffsetDateTimeField) createInstance("org.joda.time.field.OffsetDateTimeField"));
            setField(iField2, "org.joda.time.field.OffsetDateTimeField", "iOffset", 99);
            setField(iField2, "org.joda.time.field.OffsetDateTimeField", "iMin", 100);
            setField(iField2, "org.joda.time.field.OffsetDateTimeField", "iMax", 292279092);
            setField(iField2, "org.joda.time.field.DecoratedDateTimeField", "iField", iYearOfEra);
            setField(iField2, "org.joda.time.field.BaseDateTimeField", "iType", iType26);
            setField(iField1, "org.joda.time.field.DecoratedDateTimeField", "iField", iField2);
            Object iType27 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType27, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
            setField(iType27, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iType9);
            setField(iType27, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
            String iName32 = "centuryOfEra";
            setField(iType27, "org.joda.time.DateTimeFieldType", "iName", iName32);
            setField(iField1, "org.joda.time.field.BaseDateTimeField", "iType", iType27);
            setField(iYearOfCentury, "org.joda.time.field.DecoratedDateTimeField", "iField", iField1);
            Object iType28 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType28, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
            setField(iType28, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iRangeType);
            setField(iType28, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iType9);
            String iName33 = "yearOfCentury";
            setField(iType28, "org.joda.time.DateTimeFieldType", "iName", iName33);
            setField(iYearOfCentury, "org.joda.time.field.BaseDateTimeField", "iType", iType28);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury", iYearOfCentury);
            DividedDateTimeField iCenturyOfEra = ((DividedDateTimeField) createInstance("org.joda.time.field.DividedDateTimeField"));
            setField(iCenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iDivisor", 100);
            setField(iCenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iDurationField", iCenturies);
            setField(iCenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iMin", 1);
            setField(iCenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iMax", 2922790);
            setField(iCenturyOfEra, "org.joda.time.field.DecoratedDateTimeField", "iField", iField2);
            setField(iCenturyOfEra, "org.joda.time.field.BaseDateTimeField", "iType", iType27);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra);
            Object iEra = createInstance("org.joda.time.chrono.GJEraDateTimeField");
            setField(iEra, "org.joda.time.chrono.GJEraDateTimeField", "iChronology", iBase1);
            Object iType29 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(iType29, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 1);
            setField(iType29, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
            String iName34 = "era";
            setField(iType29, "org.joda.time.DateTimeFieldType", "iName", iName34);
            setField(iEra, "org.joda.time.field.BaseDateTimeField", "iType", iType29);
            setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iEra", iEra);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMillis", iMillis);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iSeconds", iSeconds);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMinutes", iMinutes);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iHours", iHours);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iHalfdays", iHalfdays);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iDays", iDays);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iWeeks", iWeeks);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iWeekyears", iWeekyears);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMonths", iMonths);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iYears", iYears);
            ScaledDurationField iCenturies1 = ((ScaledDurationField) createInstance("org.joda.time.field.ScaledDurationField"));
            setField(iCenturies1, "org.joda.time.field.ScaledDurationField", "iScalar", 100);
            setField(iCenturies1, "org.joda.time.field.DecoratedDurationField", "iField", iYears);
            setField(iCenturies1, "org.joda.time.field.BaseDurationField", "iType", iType9);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iCenturies", iCenturies1);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iEras", iEras);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond", iMillisOfSecond);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay", iMillisOfDay);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iSecondOfMinute", iSecondOfMinute);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iSecondOfDay", iSecondOfDay);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMinuteOfHour", iMinuteOfHour);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMinuteOfDay", iMinuteOfDay);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iHourOfDay", iHourOfDay);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay", iClockhourOfDay);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday", iHourOfHalfday);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iClockhourOfHalfday", iClockhourOfHalfday);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay", iHalfdayOfDay);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek", iDayOfWeek);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth", iDayOfMonth);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iDayOfYear", iDayOfYear);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear", iWeekOfWeekyear);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iWeekyear", this$0);
            RemainderDateTimeField iWeekyearOfCentury1 = ((RemainderDateTimeField) createInstance("org.joda.time.field.RemainderDateTimeField"));
            setField(iWeekyearOfCentury1, "org.joda.time.field.RemainderDateTimeField", "iDivisor", 100);
            setField(iWeekyearOfCentury1, "org.joda.time.field.RemainderDateTimeField", "iRangeField", iCenturies1);
            Object iField3 = createInstance("org.joda.time.chrono.ISOYearOfEraDateTimeField");
            setField(iField3, "org.joda.time.field.DecoratedDateTimeField", "iField", this$02);
            setField(iField3, "org.joda.time.field.BaseDateTimeField", "iType", iType26);
            setField(iWeekyearOfCentury1, "org.joda.time.field.DecoratedDateTimeField", "iField", iField3);
            setField(iWeekyearOfCentury1, "org.joda.time.field.BaseDateTimeField", "iType", iType25);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury", iWeekyearOfCentury1);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", this$01);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iYear", this$02);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iYearOfEra", iYearOfEra);
            RemainderDateTimeField iYearOfCentury1 = ((RemainderDateTimeField) createInstance("org.joda.time.field.RemainderDateTimeField"));
            setField(iYearOfCentury1, "org.joda.time.field.RemainderDateTimeField", "iDivisor", 100);
            setField(iYearOfCentury1, "org.joda.time.field.RemainderDateTimeField", "iRangeField", iCenturies1);
            setField(iYearOfCentury1, "org.joda.time.field.DecoratedDateTimeField", "iField", iField3);
            setField(iYearOfCentury1, "org.joda.time.field.BaseDateTimeField", "iType", iType28);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury", iYearOfCentury1);
            DividedDateTimeField iCenturyOfEra1 = ((DividedDateTimeField) createInstance("org.joda.time.field.DividedDateTimeField"));
            setField(iCenturyOfEra1, "org.joda.time.field.DividedDateTimeField", "iDivisor", 100);
            setField(iCenturyOfEra1, "org.joda.time.field.DividedDateTimeField", "iDurationField", iCenturies1);
            setField(iCenturyOfEra1, "org.joda.time.field.DividedDateTimeField", "iMax", 2922789);
            setField(iCenturyOfEra1, "org.joda.time.field.DecoratedDateTimeField", "iField", iField3);
            setField(iCenturyOfEra1, "org.joda.time.field.BaseDateTimeField", "iType", iType27);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra1);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iEra", iEra);
            setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBaseFlags", 7);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iMillis", iMillis);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iSeconds", iSeconds);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iMinutes", iMinutes);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iHours", iHours);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iHalfdays", iHalfdays);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iDays", iDays);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iWeeks", iWeeks);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iWeekyears", iWeekyears);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iMonths", iMonths);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iYears", iYears);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iCenturies", iCenturies1);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iEras", iEras);
            LenientDateTimeField iMillisOfSecond1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iMillisOfSecond1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iMillisOfSecond1, "org.joda.time.field.DelegatedDateTimeField", "iField", iMillisOfSecond);
            setField(iMillisOfSecond1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType10);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond", iMillisOfSecond1);
            LenientDateTimeField iMillisOfDay1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iMillisOfDay1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iMillisOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iField", iMillisOfDay);
            setField(iMillisOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType11);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay", iMillisOfDay1);
            LenientDateTimeField iSecondOfMinute1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iSecondOfMinute1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iSecondOfMinute1, "org.joda.time.field.DelegatedDateTimeField", "iField", iSecondOfMinute);
            setField(iSecondOfMinute1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType12);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iSecondOfMinute", iSecondOfMinute1);
            LenientDateTimeField iSecondOfDay1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iSecondOfDay1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iSecondOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iField", iSecondOfDay);
            setField(iSecondOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType13);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iSecondOfDay", iSecondOfDay1);
            LenientDateTimeField iMinuteOfHour1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iMinuteOfHour1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iMinuteOfHour1, "org.joda.time.field.DelegatedDateTimeField", "iField", iMinuteOfHour);
            setField(iMinuteOfHour1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType14);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iMinuteOfHour", iMinuteOfHour1);
            LenientDateTimeField iMinuteOfDay1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iMinuteOfDay1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iMinuteOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iField", iMinuteOfDay);
            setField(iMinuteOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType15);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iMinuteOfDay", iMinuteOfDay1);
            LenientDateTimeField iHourOfDay1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iHourOfDay1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iHourOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iField", iHourOfDay);
            setField(iHourOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType16);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iHourOfDay", iHourOfDay1);
            LenientDateTimeField iClockhourOfDay1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iClockhourOfDay1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iClockhourOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iField", iClockhourOfDay);
            setField(iClockhourOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType17);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay", iClockhourOfDay1);
            LenientDateTimeField iHourOfHalfday1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iHourOfHalfday1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iHourOfHalfday1, "org.joda.time.field.DelegatedDateTimeField", "iField", iHourOfHalfday);
            setField(iHourOfHalfday1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType18);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday", iHourOfHalfday1);
            LenientDateTimeField iClockhourOfHalfday1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iClockhourOfHalfday1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iClockhourOfHalfday1, "org.joda.time.field.DelegatedDateTimeField", "iField", iClockhourOfHalfday);
            setField(iClockhourOfHalfday1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType19);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iClockhourOfHalfday", iClockhourOfHalfday1);
            LenientDateTimeField iHalfdayOfDay1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iHalfdayOfDay1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iHalfdayOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iField", iHalfdayOfDay);
            setField(iHalfdayOfDay1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType20);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay", iHalfdayOfDay1);
            LenientDateTimeField iDayOfWeek1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iDayOfWeek1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iDayOfWeek1, "org.joda.time.field.DelegatedDateTimeField", "iField", iDayOfWeek);
            setField(iDayOfWeek1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType21);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek", iDayOfWeek1);
            LenientDateTimeField iDayOfMonth1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iDayOfMonth1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iDayOfMonth1, "org.joda.time.field.DelegatedDateTimeField", "iField", iDayOfMonth);
            setField(iDayOfMonth1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType22);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth", iDayOfMonth1);
            LenientDateTimeField iDayOfYear1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iDayOfYear1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iDayOfYear1, "org.joda.time.field.DelegatedDateTimeField", "iField", iDayOfYear);
            setField(iDayOfYear1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType23);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iDayOfYear", iDayOfYear1);
            LenientDateTimeField iWeekOfWeekyear1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iWeekOfWeekyear1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iWeekOfWeekyear1, "org.joda.time.field.DelegatedDateTimeField", "iField", iWeekOfWeekyear);
            setField(iWeekOfWeekyear1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType24);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear", iWeekOfWeekyear1);
            LenientDateTimeField iWeekyear = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iWeekyear, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iWeekyear, "org.joda.time.field.DelegatedDateTimeField", "iField", this$0);
            setField(iWeekyear, "org.joda.time.field.DelegatedDateTimeField", "iType", iType6);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iWeekyear", iWeekyear);
            LenientDateTimeField iWeekyearOfCentury2 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iWeekyearOfCentury2, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iWeekyearOfCentury2, "org.joda.time.field.DelegatedDateTimeField", "iField", iWeekyearOfCentury1);
            setField(iWeekyearOfCentury2, "org.joda.time.field.DelegatedDateTimeField", "iType", iType25);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury", iWeekyearOfCentury2);
            LenientDateTimeField iMonthOfYear = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iMonthOfYear, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", this$01);
            setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iType", iType7);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
            LenientDateTimeField iYear = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iYear, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iYear, "org.joda.time.field.DelegatedDateTimeField", "iField", this$02);
            setField(iYear, "org.joda.time.field.DelegatedDateTimeField", "iType", iType8);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
            LenientDateTimeField iYearOfEra1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iYearOfEra1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iYearOfEra1, "org.joda.time.field.DelegatedDateTimeField", "iField", iYearOfEra);
            setField(iYearOfEra1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType26);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iYearOfEra", iYearOfEra1);
            LenientDateTimeField iYearOfCentury2 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iYearOfCentury2, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iYearOfCentury2, "org.joda.time.field.DelegatedDateTimeField", "iField", iYearOfCentury1);
            setField(iYearOfCentury2, "org.joda.time.field.DelegatedDateTimeField", "iType", iType28);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury", iYearOfCentury2);
            LenientDateTimeField iCenturyOfEra2 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iCenturyOfEra2, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iCenturyOfEra2, "org.joda.time.field.DelegatedDateTimeField", "iField", iCenturyOfEra1);
            setField(iCenturyOfEra2, "org.joda.time.field.DelegatedDateTimeField", "iType", iType27);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra2);
            LenientDateTimeField iEra1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
            setField(iEra1, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
            setField(iEra1, "org.joda.time.field.DelegatedDateTimeField", "iField", iEra);
            setField(iEra1, "org.joda.time.field.DelegatedDateTimeField", "iType", iType29);
            setField(expected, "org.joda.time.chrono.AssembledChronology", "iEra", iEra1);
            
            // org.joda.time.chrono.LenientChronology has overridden equals method
            assertEquals(expected, actual);
        } finally {
            ZoneInfoCompiler.cLenientISO = prevCLenientISO;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.tz.ZoneInfoCompiler.parseZoneChar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseZoneChar(char)
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#parseZoneChar(char)}
 * @utbot.activatesSwitch {@code switch(c) case: 'w'}
 * @utbot.returnsFrom {@code return 'w';}
 *  */
    @Test
    public void testParseZoneChar_ReturnW() {
        char actual = ZoneInfoCompiler.parseZoneChar('w');
        
        assertEquals('w', actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#parseZoneChar(char)}
 * @utbot.activatesSwitch {@code switch(c) case: 'G'}
 * @utbot.returnsFrom {@code return 'u';}
 *  */
    @Test
    public void testParseZoneChar_ReturnU() {
        char actual = ZoneInfoCompiler.parseZoneChar('G');
        
        assertEquals('u', actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#parseZoneChar(char)}
 * @utbot.activatesSwitch {@code switch(c) case: 's'}
 * @utbot.returnsFrom {@code return 's';}
 *  */
    @Test
    public void testParseZoneChar_ReturnS() {
        char actual = ZoneInfoCompiler.parseZoneChar('s');
        
        assertEquals('s', actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.tz.ZoneInfoCompiler.parseDataFile
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseDataFile(java.io.BufferedReader)
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#parseDataFile(java.io.BufferedReader)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((line = in.readLine()) != null)
 *  */
    @Test
    public void testParseDataFile_ThrowNullPointerException() throws IOException  {
        ZoneInfoCompiler zoneInfoCompiler = new ZoneInfoCompiler();
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.parseDataFile] produces [java.lang.NullPointerException]
            org.joda.time.tz.ZoneInfoCompiler.parseDataFile(ZoneInfoCompiler.java:466) */
        zoneInfoCompiler.parseDataFile(null);
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#parseDataFile(java.io.BufferedReader)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((line = in.readLine()) != null)
 *  */
    @Test
    public void testParseDataFile_ThrowNullPointerException_1() throws Exception  {
        ZoneInfoCompiler zoneInfoCompiler = new ZoneInfoCompiler();
        BufferedReader bufferedReader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(bufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000', '\u0000'};
        setField(bufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(bufferedReader, "java.io.BufferedReader", "nChars", 1073741824);
        setField(bufferedReader, "java.io.BufferedReader", "nextChar", 1073741823);
        setField(bufferedReader, "java.io.BufferedReader", "skipLF", true);
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.parseDataFile] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:320)
            java.base/java.io.BufferedReader.readLine(BufferedReader.java:396)
            org.joda.time.tz.ZoneInfoCompiler.parseDataFile(ZoneInfoCompiler.java:466) */
        zoneInfoCompiler.parseDataFile(bufferedReader);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method parseDataFile(java.io.BufferedReader)
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#parseDataFile(java.io.BufferedReader)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testParseDataFile_ThrowIOException() throws Exception  {
        ZoneInfoCompiler zoneInfoCompiler = new ZoneInfoCompiler();
        BufferedReader bufferedReader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(bufferedReader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(bufferedReader, "java.io.BufferedReader", "cb", cb);
        setField(bufferedReader, "java.io.BufferedReader", "markedChar", -1);
        setField(bufferedReader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(bufferedReader, "java.io.Reader", "lock", lock);
        
        zoneInfoCompiler.parseDataFile(bufferedReader);
    }
    ///endregion
    
    ///region Errors report for parseDataFile
    
    public void testParseDataFile_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 30 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.tz.ZoneInfoCompiler.parseMonth
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseMonth(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.tz.ZoneInfoCompiler}
     * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#parseMonth(java.lang.String)}
     */
    @Test(expected = IllegalFieldValueException.class)
    public void testParseMonthThrowsIFVEWithNonEmptyString() {
        ZoneInfoCompiler.parseMonth("\u0014\n\t\r");
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseMonth(java.lang.String)
    
    @Test(expected = IllegalFieldValueException.class)
    public void testParseMonth1() {
        String string = "";
        
        ZoneInfoCompiler.parseMonth(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.tz.ZoneInfoCompiler.parseYear
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseYear(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#parseYear(java.lang.String,int)}
 * @utbot.invokes {@link java.lang.String#toLowerCase()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: str = str.toLowerCase();
 *  */
    @Test
    public void testParseYear_ThrowNullPointerException() {
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.parseYear] produces [java.lang.NullPointerException]
            org.joda.time.tz.ZoneInfoCompiler.parseYear(ZoneInfoCompiler.java:208) */
        ZoneInfoCompiler.parseYear(null, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseYear(java.lang.String, int)
    
    @Test
    public void testParseYear1() {
        String string = "[[\u0000";
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.parseYear] produces [java.lang.NumberFormatException: For input string: "[[ "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.joda.time.tz.ZoneInfoCompiler.parseYear(ZoneInfoCompiler.java:216) */
        ZoneInfoCompiler.parseYear(string, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.tz.ZoneInfoCompiler.parseDayOfWeek
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseDayOfWeek(java.lang.String)
    
    @Test(expected = IllegalFieldValueException.class)
    public void testParseDayOfWeek1() {
        String string = "";
        
        ZoneInfoCompiler.parseDayOfWeek(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.tz.ZoneInfoCompiler.parseOptional
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseOptional(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#parseOptional(java.lang.String)}
 * @utbot.executesCondition {@code ((str.equals("-"))): False}
 * @utbot.returnsFrom {@code return (str.equals("-")) ? null : str;}
 *  */
    @Test
    public void testParseOptional_NotStrEquals() {
        String string = "  ";
        
        String actual = ZoneInfoCompiler.parseOptional(string);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#parseOptional(java.lang.String)}
 * @utbot.executesCondition {@code ((str.equals("-"))): True}
 * @utbot.returnsFrom {@code return (str.equals("-")) ? null : str;}
 *  */
    @Test
    public void testParseOptional_StrEquals() {
        String string = "-";
        
        String actual = ZoneInfoCompiler.parseOptional(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseOptional(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#parseOptional(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (str.equals("-"))
 *  */
    @Test
    public void testParseOptional_ThrowNullPointerException() {
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.parseOptional] produces [java.lang.NullPointerException]
            org.joda.time.tz.ZoneInfoCompiler.parseOptional(ZoneInfoCompiler.java:230) */
        ZoneInfoCompiler.parseOptional(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.tz.ZoneInfoCompiler.printUsage
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printUsage()
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#printUsage()}
 * @utbot.invokes {@link java.io.PrintStream#println(java.lang.String)}
 *  */
    @Test
    public void testPrintUsage_PrintStreamPrintln() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class zoneInfoCompilerClazz = Class.forName("org.joda.time.tz.ZoneInfoCompiler");
        Method printUsageMethod = zoneInfoCompilerClazz.getDeclaredMethod("printUsage");
        printUsageMethod.setAccessible(true);
        java.lang.Object[] printUsageMethodArguments = new java.lang.Object[0];
        printUsageMethod.invoke(null, printUsageMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeZoneInfoMap(java.io.DataOutputStream, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#writeZoneInfoMap(java.io.DataOutputStream,java.util.Map)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: dout.writeShort(indexToId.size());
 *  */
    @Test
    public void testWriteZoneInfoMap_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DataOutputStream dataOutputStream = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
        byte[] writeBuffer = {(byte) -127};
        setField(dataOutputStream, "java.io.DataOutputStream", "writeBuffer", writeBuffer);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.io.DataOutputStream.writeShort(DataOutputStream.java:173)
            org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(ZoneInfoCompiler.java:192) */
        ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream, linkedHashMap);
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#writeZoneInfoMap(java.io.DataOutputStream,java.util.Map)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: dout.writeShort(indexToId.size());
 *  */
    @Test
    public void testWriteZoneInfoMap_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DataOutputStream dataOutputStream = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
        byte[] writeBuffer = {};
        setField(dataOutputStream, "java.io.DataOutputStream", "writeBuffer", writeBuffer);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.DataOutputStream.writeShort(DataOutputStream.java:172)
            org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(ZoneInfoCompiler.java:192) */
        ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream, linkedHashMap);
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#writeZoneInfoMap(java.io.DataOutputStream,java.util.Map)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: dout.writeShort(indexToId.size());
 *  */
    @Test
    public void testWriteZoneInfoMap_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DataOutputStream dataOutputStream = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
        byte[] writeBuffer = {(byte) -127, (byte) -127};
        setField(dataOutputStream, "java.io.DataOutputStream", "writeBuffer", writeBuffer);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", -1);
        setField(dataOutputStream, "java.io.FilterOutputStream", "out", out);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            java.base/java.io.DataOutputStream.writeShort(DataOutputStream.java:174)
            org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(ZoneInfoCompiler.java:192) */
        ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream, linkedHashMap);
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#writeZoneInfoMap(java.io.DataOutputStream,java.util.Map)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWriteZoneInfoMap_ThrowOutOfMemoryError() throws Exception  {
        DataOutputStream dataOutputStream = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
        byte[] writeBuffer = {(byte) -127, (byte) -127};
        setField(dataOutputStream, "java.io.DataOutputStream", "writeBuffer", writeBuffer);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[34];
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", -2147483644);
        setField(dataOutputStream, "java.io.FilterOutputStream", "out", out);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream, linkedHashMap);
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#writeZoneInfoMap(java.io.DataOutputStream,java.util.Map)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteZoneInfoMap_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DataOutputStream dataOutputStream = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
        byte[] writeBuffer = {(byte) -127, (byte) -127};
        setField(dataOutputStream, "java.io.DataOutputStream", "writeBuffer", writeBuffer);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(dataOutputStream, "java.io.FilterOutputStream", "out", out);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.DataOutputStream.writeShort(DataOutputStream.java:174)
            org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(ZoneInfoCompiler.java:192) */
        ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream, linkedHashMap);
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#writeZoneInfoMap(java.io.DataOutputStream,java.util.Map)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteZoneInfoMap_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        DataOutputStream dataOutputStream = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
        byte[] writeBuffer = {(byte) -127, (byte) -127};
        setField(dataOutputStream, "java.io.DataOutputStream", "writeBuffer", writeBuffer);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(dataOutputStream, "java.io.FilterOutputStream", "out", out);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.DataOutputStream.writeShort(DataOutputStream.java:174)
            org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(ZoneInfoCompiler.java:192) */
        ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream, linkedHashMap);
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#writeZoneInfoMap(java.io.DataOutputStream,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Map<String, Short> idToIndex = new HashMap<String, Short>(zimap.size());
 *  */
    @Test
    public void testWriteZoneInfoMap_ThrowNullPointerException() throws IOException  {
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap] produces [java.lang.NullPointerException]
            org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(ZoneInfoCompiler.java:166) */
        ZoneInfoCompiler.writeZoneInfoMap(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#writeZoneInfoMap(java.io.DataOutputStream,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testWriteZoneInfoMap_ThrowNullPointerException_1() throws Exception  {
        DataOutputStream dataOutputStream = ((DataOutputStream) createInstance("java.io.DataOutputStream"));
        byte[] writeBuffer = {(byte) -127, (byte) -127};
        setField(dataOutputStream, "java.io.DataOutputStream", "writeBuffer", writeBuffer);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740801);
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(dataOutputStream, "java.io.FilterOutputStream", "out", out);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.DataOutputStream.writeShort(DataOutputStream.java:174)
            org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(ZoneInfoCompiler.java:192) */
        ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream, linkedHashMap);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method writeZoneInfoMap(java.io.DataOutputStream, java.util.Map)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.tz.ZoneInfoCompiler}
     * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#writeZoneInfoMap(java.io.DataOutputStream,java.util.Map)}
     */
    @Test
    public void testWriteZoneInfoMapThrowsNPE() throws IOException  {
        HashMap hashMap = new HashMap();
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone("abc", "Too many time zone ids", 1, 0);
        hashMap.put("", fixedDateTimeZone);
        FixedDateTimeZone fixedDateTimeZone1 = new FixedDateTimeZone("abc", "", Integer.MAX_VALUE, 0);
        hashMap.put("", fixedDateTimeZone1);
        FixedDateTimeZone fixedDateTimeZone2 = new FixedDateTimeZone("Too many time zone ids", "#$\\\"'", 1, Integer.MIN_VALUE);
        hashMap.put("\n\t\r", fixedDateTimeZone2);
        
        /* This test fails because method [org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap] produces [java.lang.NullPointerException]
            org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(ZoneInfoCompiler.java:192) */
        ZoneInfoCompiler.writeZoneInfoMap(null, hashMap);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.tz.ZoneInfoCompiler.getStartOfYear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStartOfYear()
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#getStartOfYear()}
 *  */
    @Test
    public void testGetStartOfYear() throws Exception  {
        ZoneInfoCompiler.DateTimeOfYear actual = ZoneInfoCompiler.getStartOfYear();
        
        ZoneInfoCompiler.DateTimeOfYear expected = ((ZoneInfoCompiler.DateTimeOfYear) createInstance("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear"));
        setField(expected, "org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", "iMonthOfYear", 1);
        setField(expected, "org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", "iDayOfMonth", 1);
        setField(expected, "org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", "iZoneChar", 'w');
        
        int expectedIMonthOfYear = expected.iMonthOfYear;
        int actualIMonthOfYear = actual.iMonthOfYear;
        assertEquals(expectedIMonthOfYear, actualIMonthOfYear);
        
        int expectedIDayOfMonth = expected.iDayOfMonth;
        int actualIDayOfMonth = actual.iDayOfMonth;
        assertEquals(expectedIDayOfMonth, actualIDayOfMonth);
        
        int expectedIDayOfWeek = expected.iDayOfWeek;
        int actualIDayOfWeek = actual.iDayOfWeek;
        assertEquals(expectedIDayOfWeek, actualIDayOfWeek);
        
        boolean actualIAdvanceDayOfWeek = actual.iAdvanceDayOfWeek;
        assertFalse(actualIAdvanceDayOfWeek);
        
        int expectedIMillisOfDay = expected.iMillisOfDay;
        int actualIMillisOfDay = actual.iMillisOfDay;
        assertEquals(expectedIMillisOfDay, actualIMillisOfDay);
        
        char expectedIZoneChar = expected.iZoneChar;
        char actualIZoneChar = actual.iZoneChar;
        assertEquals(expectedIZoneChar, actualIZoneChar);
        
    }
    
    /**
    @utbot.classUnderTest {@link ZoneInfoCompiler}
 * @utbot.methodUnderTest {@link org.joda.time.tz.ZoneInfoCompiler#getStartOfYear()}
 * @utbot.executesCondition {@code (cStartOfYear == null): True}
 * @utbot.returnsFrom {@code return cStartOfYear;}
 *  */
    @Test
    public void testGetStartOfYear_CStartOfYearEqualsNull() throws Exception  {
        ZoneInfoCompiler.DateTimeOfYear prevCStartOfYear = ZoneInfoCompiler.cStartOfYear;
        try {
            ZoneInfoCompiler.cStartOfYear = null;
            
            ZoneInfoCompiler.DateTimeOfYear actual = ZoneInfoCompiler.getStartOfYear();
            
            ZoneInfoCompiler.DateTimeOfYear expected = ((ZoneInfoCompiler.DateTimeOfYear) createInstance("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear"));
            setField(expected, "org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", "iMonthOfYear", 1);
            setField(expected, "org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", "iDayOfMonth", 1);
            setField(expected, "org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", "iZoneChar", 'w');
            
            int expectedIMonthOfYear = expected.iMonthOfYear;
            int actualIMonthOfYear = actual.iMonthOfYear;
            assertEquals(expectedIMonthOfYear, actualIMonthOfYear);
            
            int expectedIDayOfMonth = expected.iDayOfMonth;
            int actualIDayOfMonth = actual.iDayOfMonth;
            assertEquals(expectedIDayOfMonth, actualIDayOfMonth);
            
            int expectedIDayOfWeek = expected.iDayOfWeek;
            int actualIDayOfWeek = actual.iDayOfWeek;
            assertEquals(expectedIDayOfWeek, actualIDayOfWeek);
            
            boolean actualIAdvanceDayOfWeek = actual.iAdvanceDayOfWeek;
            assertFalse(actualIAdvanceDayOfWeek);
            
            int expectedIMillisOfDay = expected.iMillisOfDay;
            int actualIMillisOfDay = actual.iMillisOfDay;
            assertEquals(expectedIMillisOfDay, actualIMillisOfDay);
            
            char expectedIZoneChar = expected.iZoneChar;
            char actualIZoneChar = actual.iZoneChar;
            assertEquals(expectedIZoneChar, actualIZoneChar);
            
        } finally {
            ZoneInfoCompiler.cStartOfYear = prevCStartOfYear;
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1052305905681600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1052305905681600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1052305905693700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1052305905681600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1052305905693700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1052305907770100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1052305907770100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1052305907775600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1052305907770100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1052305907775600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1052305908286399 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1052305908286399.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1052305908290900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1052305908286399.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1052305908290900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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

