package org.apache.commons.cli;

import org.junit.Test;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Properties;
import sun.security.provider.Sun;
import sun.security.provider.VerificationProvider;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_cli_ParserTest {
    ///region Test suites for executable org.apache.commons.cli.Parser.parse
    
    ///region FUZZER: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Parser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#parse(org.apache.commons.cli.Options,java.lang.String[])}
     */
    @Test
    public void testParseThrowsNPEWithNonEmptyObjectArray() throws ParseException  {
        PosixParser posixParser = new PosixParser();
        java.lang.String[] stringArray = {"10", "10", ""};
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.parse(Parser.java:147)
            org.apache.commons.cli.Parser.parse(Parser.java:86) */
        posixParser.parse(null, stringArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;)
    
    @Test
    public void testParse1() throws Exception  {
        GnuParser gnuParser = new GnuParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Object object = createInstance("java.lang.Object");
        shortOpts.put(arrayList, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli.Option (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.cli.Parser.parse(Parser.java:149)
            org.apache.commons.cli.Parser.parse(Parser.java:86) */
        gnuParser.parse(options, null);
    }
    
    @Test
    public void testParse2() throws Exception  {
        GnuParser gnuParser = new GnuParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap optionGroups = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        optionGroups.put(null, object);
        setField(options, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        java.lang.String[] stringArray = {null, null, null, null};
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli.OptionGroup (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli.OptionGroup is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.cli.Parser.parse(Parser.java:156)
            org.apache.commons.cli.Parser.parse(Parser.java:86) */
        gnuParser.parse(options, stringArray);
    }
    
    @Test
    public void testParse3() throws Exception  {
        GnuParser gnuParser = new GnuParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "optionGroups", shortOpts);
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayList.<init>(ArrayList.java:181)
            org.apache.commons.cli.Parser.setOptions(Parser.java:49)
            org.apache.commons.cli.Parser.parse(Parser.java:161)
            org.apache.commons.cli.Parser.parse(Parser.java:86) */
        gnuParser.parse(options, null);
    }
    
    @Test
    public void testParse4() throws Exception  {
        GnuParser gnuParser = new GnuParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        Character character = '\u0000';
        shortOpts.put(character, null);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.parse(Parser.java:150)
            org.apache.commons.cli.Parser.parse(Parser.java:86) */
        gnuParser.parse(options, stringArray);
    }
    
    @Test
    public void testParse5() throws Exception  {
        GnuParser gnuParser = new GnuParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap optionGroups = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        optionGroups.put(character, object);
        Object object1 = createInstance("java.lang.Object");
        optionGroups.put(object1, null);
        setField(options, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.parse(Parser.java:157)
            org.apache.commons.cli.Parser.parse(Parser.java:86) */
        gnuParser.parse(options, stringArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Parser.parse
    
    ///region FUZZER: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, java.util.Properties)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Parser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#parse(org.apache.commons.cli.Options,java.lang.String[],java.util.Properties)}
     */
    @Test
    public void testParseThrowsNPEWithNonEmptyObjectArray1() throws ParseException  {
        GnuParser gnuParser = new GnuParser();
        java.lang.String[] stringArray = {"10", "XZ", "10\uFFF7"};
        Properties properties = new Properties(1);
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.parse(Parser.java:147)
            org.apache.commons.cli.Parser.parse(Parser.java:103) */
        gnuParser.parse(((Options) null), stringArray, properties);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, java.util.Properties)
    
    @Test
    public void testParse6() throws Exception  {
        BasicParser basicParser = new BasicParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        shortOpts.put(null, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        Sun sun = ((Sun) createInstance("sun.security.provider.Sun"));
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli.Option (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.cli.Parser.parse(Parser.java:149)
            org.apache.commons.cli.Parser.parse(Parser.java:103) */
        basicParser.parse(options, ((java.lang.String[]) null), sun);
    }
    
    @Test
    public void testParse7() throws Exception  {
        PosixParser posixParser = new PosixParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "optionGroups", shortOpts);
        VerificationProvider verificationProvider = ((VerificationProvider) createInstance("sun.security.provider.VerificationProvider"));
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayList.<init>(ArrayList.java:181)
            org.apache.commons.cli.Parser.setOptions(Parser.java:49)
            org.apache.commons.cli.Parser.parse(Parser.java:161)
            org.apache.commons.cli.Parser.parse(Parser.java:103) */
        posixParser.parse(options, ((java.lang.String[]) null), verificationProvider);
    }
    
    @Test
    public void testParse8() throws Exception  {
        BasicParser basicParser = new BasicParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        Character character = '\u0000';
        shortOpts.put(character, null);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.parse(Parser.java:150)
            org.apache.commons.cli.Parser.parse(Parser.java:103) */
        basicParser.parse(options, stringArray, ((Properties) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Parser.parse
    
    ///region FUZZER: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Parser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#parse(org.apache.commons.cli.Options,java.lang.String[],boolean)}
     */
    @Test
    public void testParseThrowsNPEWithNonEmptyObjectArray2() throws ParseException  {
        PosixParser posixParser = new PosixParser();
        java.lang.String[] stringArray = {"10", "", "10"};
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.parse(Parser.java:147)
            org.apache.commons.cli.Parser.parse(Parser.java:121) */
        posixParser.parse(((Options) null), stringArray, true);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Parser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#parse(org.apache.commons.cli.Options,java.lang.String[],boolean)}
     */
    @Test(expected = UnrecognizedOptionException.class)
    public void testParseThrowsUOEWithNonEmptyObjectArray() throws ParseException  {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        java.lang.String[] stringArray = {"\n\t\r", "\n\r\t", "\n\t\r", "-3", "10"};
        
        posixParser.parse(options, stringArray, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    @Test
    public void testParse9() throws Exception  {
        BasicParser basicParser = new BasicParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        shortOpts.put(character, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli.Option (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.cli.Parser.parse(Parser.java:149)
            org.apache.commons.cli.Parser.parse(Parser.java:121) */
        basicParser.parse(options, stringArray, false);
    }
    
    @Test
    public void testParse10() throws Exception  {
        GnuParser gnuParser = new GnuParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "optionGroups", shortOpts);
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayList.<init>(ArrayList.java:181)
            org.apache.commons.cli.Parser.setOptions(Parser.java:49)
            org.apache.commons.cli.Parser.parse(Parser.java:161)
            org.apache.commons.cli.Parser.parse(Parser.java:121) */
        gnuParser.parse(options, stringArray, false);
    }
    
    @Test
    public void testParse11() throws Exception  {
        PosixParser posixParser = new PosixParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        shortOpts.put(null, null);
        ArrayList arrayList = new ArrayList();
        Object object = createInstance("java.lang.Object");
        shortOpts.put(arrayList, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.parse(Parser.java:150)
            org.apache.commons.cli.Parser.parse(Parser.java:121) */
        posixParser.parse(options, ((java.lang.String[]) null), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Parser.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, java.util.Properties, boolean)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#parse(org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean)}
 * @utbot.invokes {@link org.apache.commons.cli.Options#helpOptions()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Iterator it = options.helpOptions().iterator(); it.hasNext(); )
 *  */
    @Test
    public void testParse_ThrowNullPointerException() throws ParseException  {
        PosixParser posixParser = new PosixParser();
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.parse(Parser.java:147) */
        posixParser.parse(null, null, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, java.util.Properties, boolean)
    
    @Test
    public void testParse12() throws Exception  {
        BasicParser basicParser = new BasicParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Object object = createInstance("java.lang.Object");
        shortOpts.put(arrayList, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli.Option (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.cli.Parser.parse(Parser.java:149) */
        basicParser.parse(options, null, null, false);
    }
    
    @Test
    public void testParse13() throws Exception  {
        GnuParser gnuParser = new GnuParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "optionGroups", shortOpts);
        java.lang.String[] stringArray = {};
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayList.<init>(ArrayList.java:181)
            org.apache.commons.cli.Parser.setOptions(Parser.java:49)
            org.apache.commons.cli.Parser.parse(Parser.java:161) */
        gnuParser.parse(options, stringArray, null, false);
    }
    
    @Test
    public void testParse14() throws Exception  {
        GnuParser gnuParser = new GnuParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        shortOpts.put(null, null);
        ArrayList arrayList = new ArrayList();
        Object object = createInstance("java.lang.Object");
        shortOpts.put(arrayList, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.parse(Parser.java:150) */
        gnuParser.parse(options, null, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Parser.getRequiredOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRequiredOptions()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#getRequiredOptions()}
 * @utbot.returnsFrom {@code return requiredOptions;}
 *  */
    @Test
    public void testGetRequiredOptions_ReturnRequiredOptions() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList requiredOptions = new ArrayList();
        setField(posixParser, "org.apache.commons.cli.Parser", "requiredOptions", requiredOptions);
        
        ArrayList actual = ((ArrayList) posixParser.getRequiredOptions());
        
        assertTrue(deepEquals(requiredOptions, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Parser.setOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setOptions(org.apache.commons.cli.Options)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#setOptions(org.apache.commons.cli.Options)}
 * @utbot.invokes {@link org.apache.commons.cli.Options#getRequiredOptions()}
 *  */
    @Test
    public void testSetOptions_OptionsGetRequiredOptions() throws Exception  {
        GnuParser gnuParser = ((GnuParser) createInstance("org.apache.commons.cli.GnuParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        gnuParser.setOptions(options);
        ArrayList requiredOptions = new ArrayList();
        setField(gnuParser, "org.apache.commons.cli.Parser", "requiredOptions", requiredOptions);
        Options options1 = ((Options) createInstance("org.apache.commons.cli.Options"));
        ArrayList requiredOpts = new ArrayList();
        requiredOpts.add(null);
        requiredOpts.add(null);
        requiredOpts.add(null);
        setField(options1, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        
        Options initialGnuParserOptions = ((Options) getFieldValue(gnuParser, "org.apache.commons.cli.Parser", "options"));
        
        gnuParser.setOptions(options1);
        
        Options finalGnuParserOptions = ((Options) getFieldValue(gnuParser, "org.apache.commons.cli.Parser", "options"));
        
        assertFalse(initialGnuParserOptions == finalGnuParserOptions);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setOptions(org.apache.commons.cli.Options)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#setOptions(org.apache.commons.cli.Options)}
 * @utbot.invokes {@link org.apache.commons.cli.Options#getRequiredOptions()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.requiredOptions = new ArrayList(options.getRequiredOptions());
 *  */
    @Test
    public void testSetOptions_ThrowNullPointerException() {
        PosixParser posixParser = new PosixParser();
        
        /* This test fails because method [org.apache.commons.cli.Parser.setOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.setOptions(Parser.java:49) */
        posixParser.setOptions(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Parser.processProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method processProperties(java.util.Properties)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processProperties(java.util.Properties)}
 * @utbot.executesCondition {@code (properties == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testProcessProperties_PropertiesEqualsNull() throws ParseException  {
        PosixParser posixParser = new PosixParser();
        
        posixParser.processProperties(null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processProperties(java.util.Properties)}
 * @utbot.executesCondition {@code (properties == null): False}
 * @utbot.invokes {@link java.util.Properties#propertyNames()}
 *  */
    @Test
    public void testProcessProperties_PropertiesNotEqualsNull() throws Exception  {
        BasicParser basicParser = new BasicParser();
        Sun sun = ((Sun) createInstance("sun.security.provider.Sun"));
        LinkedHashSet entrySet = new LinkedHashSet();
        setField(sun, "java.security.Provider", "entrySet", entrySet);
        setField(sun, "java.security.Provider", "entrySetCallCount", 2);
        setField(sun, "java.security.Provider", "initialized", true);
        
        basicParser.processProperties(sun);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processProperties(java.util.Properties)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processProperties(java.util.Properties)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: for(Enumeration e = properties.propertyNames(); e.hasMoreElements(); )
 *  */
    @Test
    public void testProcessProperties_ThrowRuntimeException() throws Exception  {
        PosixParser posixParser = new PosixParser();
        Sun sun = ((Sun) createInstance("sun.security.provider.Sun"));
        LinkedHashSet entrySet = new LinkedHashSet();
        setField(sun, "java.security.Provider", "entrySet", entrySet);
        setField(sun, "java.security.Provider", "initialized", true);
        
        /* This test fails because method [org.apache.commons.cli.Parser.processProperties] produces [java.lang.RuntimeException: Internal error.]
            java.base/java.security.Provider.entrySet(Provider.java:425)
            java.base/java.util.Properties.enumerate(Properties.java:1230)
            java.base/java.util.Properties.propertyNames(Properties.java:1142)
            org.apache.commons.cli.Parser.processProperties(Parser.java:259) */
        posixParser.processProperties(sun);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processProperties(java.util.Properties)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: for(Enumeration e = properties.propertyNames(); e.hasMoreElements(); )
 *  */
    @Test
    public void testProcessProperties_ThrowIllegalStateException() throws Exception  {
        BasicParser basicParser = new BasicParser();
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        Properties defaults = ((Properties) createInstance("java.util.Properties"));
        Sun defaults1 = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(defaults, "java.util.Properties", "defaults", defaults1);
        setField(properties, "java.util.Properties", "defaults", defaults);
        
        /* This test fails because method [org.apache.commons.cli.Parser.processProperties] produces [java.lang.IllegalStateException]
            java.base/java.security.Provider.checkInitialized(Provider.java:809)
            java.base/java.security.Provider.entrySet(Provider.java:411)
            java.base/java.util.Properties.enumerate(Properties.java:1230)
            java.base/java.util.Properties.enumerate(Properties.java:1228)
            java.base/java.util.Properties.enumerate(Properties.java:1228)
            java.base/java.util.Properties.propertyNames(Properties.java:1142)
            org.apache.commons.cli.Parser.processProperties(Parser.java:259) */
        basicParser.processProperties(properties);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Parser.processArgs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method processArgs(org.apache.commons.cli.Option, java.util.ListIterator)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processArgs(org.apache.commons.cli.Option,java.util.ListIterator)}
 * @utbot.executesCondition {@code (opt.getValues() == null): True}
 * @utbot.executesCondition {@code (!opt.hasOptionalArg()): False}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getValues()}
 * @utbot.invokes {@link org.apache.commons.cli.Option#hasOptionalArg()}
 *  */
    @Test
    public void testProcessArgs_OptHasOptionalArg() throws Exception  {
        BasicParser basicParser = new BasicParser();
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        option.setOptionalArg(true);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        ListIterator listIterator = values.listIterator();
        
        basicParser.processArgs(option, listIterator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processArgs(org.apache.commons.cli.Option, java.util.ListIterator)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processArgs(org.apache.commons.cli.Option,java.util.ListIterator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(iter.hasNext())
 *  */
    @Test
    public void testProcessArgs_ThrowNullPointerException() throws ParseException  {
        PosixParser posixParser = new PosixParser();
        
        /* This test fails because method [org.apache.commons.cli.Parser.processArgs] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.processArgs(Parser.java:332) */
        posixParser.processArgs(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processArgs(org.apache.commons.cli.Option,java.util.ListIterator)}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getValues()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: opt.getValues() == null && !opt.hasOptionalArg()
 *  */
    @Test
    public void testProcessArgs_ThrowNullPointerException_1() throws ParseException  {
        BasicParser basicParser = new BasicParser();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        ListIterator listIterator = arrayList.listIterator();
        
        /* This test fails because method [org.apache.commons.cli.Parser.processArgs] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.processArgs(Parser.java:337) */
        basicParser.processArgs(null, listIterator);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processArgs(org.apache.commons.cli.Option,java.util.ListIterator)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: getOptions().hasOption(str) && str.startsWith("-")
 *  */
    @Test
    public void testProcessArgs_ThrowNullPointerException_2() throws Exception  {
        GnuParser gnuParser = ((GnuParser) createInstance("org.apache.commons.cli.GnuParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        shortOpts.put(null, null);
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        shortOpts.put(integer, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        gnuParser.setOptions(options);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        ListIterator listIterator = arrayList.listIterator();
        
        /* This test fails because method [org.apache.commons.cli.Parser.processArgs] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.processArgs(Parser.java:337) */
        gnuParser.processArgs(null, listIterator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method processArgs(org.apache.commons.cli.Option, java.util.ListIterator)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processArgs(org.apache.commons.cli.Option,java.util.ListIterator)}
 * @utbot.executesCondition {@code (opt.getValues() == null): True}
 * @utbot.executesCondition {@code (!opt.hasOptionalArg()): True}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getValues()}
 * @utbot.invokes {@link org.apache.commons.cli.Option#hasOptionalArg()}
 * @utbot.throwsException {@link org.apache.commons.cli.MissingArgumentException} when: opt.getValues() == null && !opt.hasOptionalArg()
 *  */
    @Test(expected = MissingArgumentException.class)
    public void testProcessArgs_ThrowMissingArgumentException() throws Exception  {
        GnuParser gnuParser = new GnuParser();
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        ListIterator listIterator = values.listIterator();
        
        gnuParser.processArgs(option, listIterator);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Parser.processOption
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processOption(java.lang.String, java.util.ListIterator)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processOption(java.lang.String,java.util.ListIterator)}
 * @utbot.executesCondition {@code (!hasOption): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Option opt = (Option) getOptions().getOption(arg).clone();
 *  */
    @Test
    public void testProcessOption_ThrowClassCastException() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        shortOpts.put(null, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        posixParser.setOptions(options);
        
        /* This test fails because method [org.apache.commons.cli.Parser.processOption] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli.Option (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.cli.Options.getOption(Options.java:211)
            org.apache.commons.cli.Parser.processOption(Parser.java:381) */
        posixParser.processOption(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processOption(java.lang.String,java.util.ListIterator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean hasOption = getOptions().hasOption(arg);
 *  */
    @Test
    public void testProcessOption_ThrowNullPointerException() throws ParseException  {
        PosixParser posixParser = new PosixParser();
        
        /* This test fails because method [org.apache.commons.cli.Parser.processOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.processOption(Parser.java:372) */
        posixParser.processOption(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processOption(java.lang.String,java.util.ListIterator)}
 * @utbot.executesCondition {@code (!hasOption): False}
 * @utbot.invokes {@link org.apache.commons.cli.Option#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Option opt = (Option) getOptions().getOption(arg).clone();
 *  */
    @Test
    public void testProcessOption_ThrowNullPointerException_2() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        shortOpts.put(null, option);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        posixParser.setOptions(options);
        
        /* This test fails because method [org.apache.commons.cli.Parser.processOption] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayList.<init>(ArrayList.java:181)
            org.apache.commons.cli.Option.clone(Option.java:643)
            org.apache.commons.cli.Parser.processOption(Parser.java:381) */
        posixParser.processOption(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processOption(java.lang.String,java.util.ListIterator)}
 * @utbot.executesCondition {@code (!hasOption): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Option opt = (Option) getOptions().getOption(arg).clone();
 *  */
    @Test
    public void testProcessOption_ThrowNullPointerException_1() throws Exception  {
        GnuParser gnuParser = ((GnuParser) createInstance("org.apache.commons.cli.GnuParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        shortOpts.put(null, null);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        gnuParser.setOptions(options);
        
        /* This test fails because method [org.apache.commons.cli.Parser.processOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.processOption(Parser.java:381) */
        gnuParser.processOption(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method processOption(java.lang.String, java.util.ListIterator)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processOption(java.lang.String,java.util.ListIterator)}
 * @utbot.throwsException {@link org.apache.commons.cli.UnrecognizedOptionException} when: !hasOption
 *  */
    @Test(expected = UnrecognizedOptionException.class)
    public void testProcessOption_ThrowUnrecognizedOptionException() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        posixParser.setOptions(options);
        
        posixParser.processOption(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processOption(java.lang.String,java.util.ListIterator)}
 * @utbot.throwsException {@link org.apache.commons.cli.UnrecognizedOptionException} when: !hasOption
 *  */
    @Test(expected = UnrecognizedOptionException.class)
    public void testProcessOption_ThrowUnrecognizedOptionException_1() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        posixParser.setOptions(options);
        String string = "";
        
        posixParser.processOption(string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Parser.updateRequiredOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateRequiredOptions(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#updateRequiredOptions(org.apache.commons.cli.Option)}
 *  */
    @Test
    public void testUpdateRequiredOptions() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap optionGroups = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        posixParser.setOptions(options);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = parserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        updateRequiredOptionsMethod.invoke(posixParser, updateRequiredOptionsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#updateRequiredOptions(org.apache.commons.cli.Option)}
 *  */
    @Test
    public void testUpdateRequiredOptions_1() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap optionGroups = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        optionGroups.put(integer, object);
        setField(options, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        posixParser.setOptions(options);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = parserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        updateRequiredOptionsMethod.invoke(posixParser, updateRequiredOptionsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateRequiredOptions(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#updateRequiredOptions(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (opt.isRequired()): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: getOptions().getOptionGroup(opt) != null
 *  */
    @Test
    public void testUpdateRequiredOptions_ThrowClassCastException() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap optionGroups = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        optionGroups.put(null, object);
        setField(options, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        posixParser.setOptions(options);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.Parser.updateRequiredOptions] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli.OptionGroup (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli.OptionGroup is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.cli.Options.getOptionGroup(Options.java:293)
            org.apache.commons.cli.Parser.updateRequiredOptions(Parser.java:412) */
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = parserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        try {
            updateRequiredOptionsMethod.invoke(posixParser, updateRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#updateRequiredOptions(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (opt.isRequired()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: getOptions().getOptionGroup(opt) != null
 *  */
    @Test
    public void testUpdateRequiredOptions_ThrowNullPointerException() throws Throwable  {
        PosixParser posixParser = new PosixParser();
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.Parser.updateRequiredOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.updateRequiredOptions(Parser.java:412) */
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = parserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        try {
            updateRequiredOptionsMethod.invoke(posixParser, updateRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#updateRequiredOptions(org.apache.commons.cli.Option)}
 * @utbot.invokes {@link org.apache.commons.cli.Option#isRequired()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: opt.isRequired()
 *  */
    @Test
    public void testUpdateRequiredOptions_ThrowNullPointerException_1() throws Throwable  {
        PosixParser posixParser = new PosixParser();
        
        /* This test fails because method [org.apache.commons.cli.Parser.updateRequiredOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.updateRequiredOptions(Parser.java:405) */
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = parserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = ((Object) null);
        try {
            updateRequiredOptionsMethod.invoke(posixParser, updateRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#updateRequiredOptions(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (opt.isRequired()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getRequiredOptions().remove(opt.getKey());
 *  */
    @Test
    public void testUpdateRequiredOptions_ThrowNullPointerException_4() throws Throwable  {
        PosixParser posixParser = new PosixParser();
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        option.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.Parser.updateRequiredOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.updateRequiredOptions(Parser.java:407) */
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = parserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        try {
            updateRequiredOptionsMethod.invoke(posixParser, updateRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#updateRequiredOptions(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (opt.isRequired()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getRequiredOptions().remove(opt.getKey());
 *  */
    @Test
    public void testUpdateRequiredOptions_ThrowNullPointerException_2() throws Throwable  {
        PosixParser posixParser = new PosixParser();
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        option.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.Parser.updateRequiredOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.updateRequiredOptions(Parser.java:407) */
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = parserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        try {
            updateRequiredOptionsMethod.invoke(posixParser, updateRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#updateRequiredOptions(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (opt.isRequired()): True}
 * @utbot.invokes {@link java.util.List#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: getOptions().getOptionGroup(opt) != null
 *  */
    @Test
    public void testUpdateRequiredOptions_ThrowNullPointerException_3() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList requiredOptions = new ArrayList();
        setField(posixParser, "org.apache.commons.cli.Parser", "requiredOptions", requiredOptions);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String longOpt = "";
        option.setLongOpt(longOpt);
        option.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.Parser.updateRequiredOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.updateRequiredOptions(Parser.java:412) */
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = parserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        try {
            updateRequiredOptionsMethod.invoke(posixParser, updateRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#updateRequiredOptions(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (opt.isRequired()): False}
 * @utbot.executesCondition {@code (getOptions().getOptionGroup(opt) != null): True}
 * @utbot.executesCondition {@code (group.isRequired()): True}
 * @utbot.invokes {@link org.apache.commons.cli.Parser#getOptions()}
 * @utbot.invokes {@link org.apache.commons.cli.Options#getOptionGroup(org.apache.commons.cli.Option)}
 * @utbot.invokes {@link org.apache.commons.cli.OptionGroup#isRequired()}
 * @utbot.invokes {@link org.apache.commons.cli.Parser#getRequiredOptions()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getRequiredOptions().remove(group);
 *  */
    @Test
    public void testUpdateRequiredOptions_ThrowNullPointerException_5() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap optionGroups = new LinkedHashMap();
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        optionGroup.setRequired(true);
        optionGroups.put(null, optionGroup);
        setField(options, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        posixParser.setOptions(options);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.Parser.updateRequiredOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.updateRequiredOptions(Parser.java:418) */
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = parserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        try {
            updateRequiredOptionsMethod.invoke(posixParser, updateRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Parser.checkRequiredOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkRequiredOptions()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#checkRequiredOptions()}
 * @utbot.executesCondition {@code (!getRequiredOptions().isEmpty()): False}
 * @utbot.invokes {@link org.apache.commons.cli.Parser#getRequiredOptions()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 *  */
    @Test
    public void testCheckRequiredOptions_GetRequiredOptionsIsEmpty() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList requiredOptions = new ArrayList();
        setField(posixParser, "org.apache.commons.cli.Parser", "requiredOptions", requiredOptions);
        
        posixParser.checkRequiredOptions();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkRequiredOptions()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#checkRequiredOptions()}
 * @utbot.invokes {@link org.apache.commons.cli.Parser#getRequiredOptions()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !getRequiredOptions().isEmpty()
 *  */
    @Test
    public void testCheckRequiredOptions_ThrowNullPointerException() throws MissingOptionException  {
        PosixParser posixParser = new PosixParser();
        
        /* This test fails because method [org.apache.commons.cli.Parser.checkRequiredOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.checkRequiredOptions(Parser.java:311) */
        posixParser.checkRequiredOptions();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method checkRequiredOptions()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#checkRequiredOptions()}
 * @utbot.executesCondition {@code (!getRequiredOptions().isEmpty()): True}
 * @utbot.invokes {@link org.apache.commons.cli.Parser#getRequiredOptions()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.invokes {@link org.apache.commons.cli.Parser#getRequiredOptions()}
 * @utbot.throwsException {@link org.apache.commons.cli.MissingOptionException} when: !getRequiredOptions().isEmpty()
 *  */
    @Test(expected = MissingOptionException.class)
    public void testCheckRequiredOptions_ThrowMissingOptionException() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList requiredOptions = new ArrayList();
        requiredOptions.add(null);
        requiredOptions.add(null);
        requiredOptions.add(null);
        requiredOptions.add(null);
        requiredOptions.add(null);
        requiredOptions.add(null);
        requiredOptions.add(null);
        requiredOptions.add(null);
        requiredOptions.add(null);
        requiredOptions.add(null);
        setField(posixParser, "org.apache.commons.cli.Parser", "requiredOptions", requiredOptions);
        
        posixParser.checkRequiredOptions();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Parser.getOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptions()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#getOptions()}
 * @utbot.returnsFrom {@code return options;}
 *  */
    @Test
    public void testGetOptions_ReturnOptions() {
        PosixParser posixParser = new PosixParser();
        
        Options actual = posixParser.getOptions();
        
        assertNull(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields841295964407000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields841295964407000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass841295964414800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields841295964407000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass841295964414800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields841295968324800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields841295968324800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass841295968329500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields841295968324800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass841295968329500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

