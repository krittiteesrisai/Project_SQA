package org.apache.commons.cli;

import org.junit.Test;
import java.util.Properties;
import java.util.LinkedHashMap;
import sun.security.ssl.SunJSSE;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import sun.security.provider.Sun;
import java.util.LinkedHashSet;
import sun.security.provider.VerificationProvider;
import java.util.ArrayList;
import java.util.ListIterator;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_apache_commons_cli_ParserTest {
    ///region Test suites for executable org.apache.commons.cli.Parser.parse
    
    ///region FUZZER: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, java.util.Properties)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Parser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#parse(org.apache.commons.cli.Options,java.lang.String[],java.util.Properties)}
     */
    @Test
    public void testParseThrowsNPEWithNonEmptyObjectArray() throws ParseException  {
        GnuParser gnuParser = new GnuParser();
        java.lang.String[] stringArray = {"10", "", "10"};
        Properties properties = new Properties();
        Object object = new Object();
        Object object1 = new Object();
        properties.put(object, object1);
        Object object2 = new Object();
        Object object3 = new Object();
        properties.put(object2, object3);
        Object object4 = new Object();
        Object object5 = new Object();
        properties.put(object4, object5);
        Object object6 = new Object();
        Object object7 = new Object();
        properties.put(object6, object7);
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.parse(Parser.java:138)
            org.apache.commons.cli.Parser.parse(Parser.java:90) */
        gnuParser.parse(((Options) null), stringArray, properties);
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
    public void testParseThrowsNPEWithNonEmptyObjectArray1() throws ParseException  {
        GnuParser gnuParser = new GnuParser();
        java.lang.String[] stringArray = {"10", "", "10"};
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.parse(Parser.java:138)
            org.apache.commons.cli.Parser.parse(Parser.java:112) */
        gnuParser.parse(((Options) null), stringArray, true);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    @Test
    public void testParse1() throws Exception  {
        GnuParser gnuParser = new GnuParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.helpOptions(Options.java:189)
            org.apache.commons.cli.Parser.parse(Parser.java:138)
            org.apache.commons.cli.Parser.parse(Parser.java:112) */
        gnuParser.parse(options, ((java.lang.String[]) null), false);
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
        GnuParser gnuParser = new GnuParser();
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.parse(Parser.java:138) */
        gnuParser.parse(null, null, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, java.util.Properties, boolean)
    
    @Test
    public void testParse2() throws Exception  {
        BasicParser basicParser = new BasicParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "longOpts", longOpts);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.parse(Parser.java:184) */
        basicParser.parse(options, stringArray, null, false);
    }
    
    @Test
    public void testParse3() throws Exception  {
        BasicParser basicParser = new BasicParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        shortOpts.put(character, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        SunJSSE sunJSSE = ((SunJSSE) createInstance("sun.security.ssl.SunJSSE"));
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.helpOptions(Options.java:189)
            org.apache.commons.cli.Parser.parse(Parser.java:138) */
        basicParser.parse(options, stringArray, sunJSSE, false);
    }
    ///endregion
    
    ///region Errors report for parse
    
    public void testParse_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Parser.parse
    
    ///region FUZZER: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Parser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#parse(org.apache.commons.cli.Options,java.lang.String[])}
     */
    @Test
    public void testParseThrowsNPEWithNonEmptyObjectArray2() throws ParseException  {
        GnuParser gnuParser = new GnuParser();
        java.lang.String[] stringArray = {"10", "10", ""};
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.parse(Parser.java:138)
            org.apache.commons.cli.Parser.parse(Parser.java:71) */
        gnuParser.parse(null, stringArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;)
    
    @Test
    public void testParse4() throws Exception  {
        PosixParser posixParser = new PosixParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "longOpts", longOpts);
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.checkRequiredOptions(Parser.java:295)
            org.apache.commons.cli.Parser.parse(Parser.java:225)
            org.apache.commons.cli.Parser.parse(Parser.java:71) */
        posixParser.parse(options, null);
    }
    
    @Test
    public void testParse5() throws Exception  {
        PosixParser posixParser = new PosixParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        shortOpts.put(integer, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        /* This test fails because method [org.apache.commons.cli.Parser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.helpOptions(Options.java:189)
            org.apache.commons.cli.Parser.parse(Parser.java:138)
            org.apache.commons.cli.Parser.parse(Parser.java:71) */
        posixParser.parse(options, null);
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
    public void testProcessProperties_PropertiesEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        GnuParser gnuParser = new GnuParser();
        
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Class propertiesType = Class.forName("java.util.Properties");
        Method processPropertiesMethod = parserClazz.getDeclaredMethod("processProperties", propertiesType);
        processPropertiesMethod.setAccessible(true);
        java.lang.Object[] processPropertiesMethodArguments = new java.lang.Object[1];
        processPropertiesMethodArguments[0] = ((Object) null);
        processPropertiesMethod.invoke(gnuParser, processPropertiesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processProperties(java.util.Properties)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processProperties(java.util.Properties)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: for(Enumeration e = properties.propertyNames(); e.hasMoreElements(); )
 *  */
    @Test
    public void testProcessProperties_ThrowRuntimeException() throws Throwable  {
        BasicParser basicParser = new BasicParser();
        Sun sun = ((Sun) createInstance("sun.security.provider.Sun"));
        LinkedHashSet entrySet = new LinkedHashSet();
        setField(sun, "java.security.Provider", "entrySet", entrySet);
        setField(sun, "java.security.Provider", "initialized", true);
        
        /* This test fails because method [org.apache.commons.cli.Parser.processProperties] produces [java.lang.RuntimeException: Internal error.]
            java.base/java.security.Provider.entrySet(Provider.java:425)
            java.base/java.util.Properties.enumerate(Properties.java:1230)
            java.base/java.util.Properties.propertyNames(Properties.java:1142)
            org.apache.commons.cli.Parser.processProperties(Parser.java:243) */
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Class sunType = Class.forName("java.util.Properties");
        Method processPropertiesMethod = parserClazz.getDeclaredMethod("processProperties", sunType);
        processPropertiesMethod.setAccessible(true);
        java.lang.Object[] processPropertiesMethodArguments = new java.lang.Object[1];
        processPropertiesMethodArguments[0] = sun;
        try {
            processPropertiesMethod.invoke(basicParser, processPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processProperties(java.util.Properties)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test
    public void testProcessProperties_ThrowIllegalStateException() throws Throwable  {
        GnuParser gnuParser = new GnuParser();
        VerificationProvider verificationProvider = ((VerificationProvider) createInstance("sun.security.provider.VerificationProvider"));
        VerificationProvider defaults = ((VerificationProvider) createInstance("sun.security.provider.VerificationProvider"));
        Sun defaults1 = ((Sun) createInstance("sun.security.provider.Sun"));
        setField(defaults, "java.util.Properties", "defaults", defaults1);
        setField(verificationProvider, "java.util.Properties", "defaults", defaults);
        
        /* This test fails because method [org.apache.commons.cli.Parser.processProperties] produces [java.lang.IllegalStateException]
            java.base/java.security.Provider.checkInitialized(Provider.java:809)
            java.base/java.security.Provider.entrySet(Provider.java:411)
            java.base/java.util.Properties.enumerate(Properties.java:1230)
            java.base/java.util.Properties.enumerate(Properties.java:1228)
            java.base/java.util.Properties.enumerate(Properties.java:1228)
            java.base/java.util.Properties.propertyNames(Properties.java:1142)
            org.apache.commons.cli.Parser.processProperties(Parser.java:243) */
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Class verificationProviderType = Class.forName("java.util.Properties");
        Method processPropertiesMethod = parserClazz.getDeclaredMethod("processProperties", verificationProviderType);
        processPropertiesMethod.setAccessible(true);
        java.lang.Object[] processPropertiesMethodArguments = new java.lang.Object[1];
        processPropertiesMethodArguments[0] = verificationProvider;
        try {
            processPropertiesMethod.invoke(gnuParser, processPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method processProperties(java.util.Properties)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Parser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processProperties(java.util.Properties)}
     */
    @Test
    public void testProcessProperties() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        GnuParser gnuParser = new GnuParser();
        Properties properties = new Properties();
        
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Class propertiesType = Class.forName("java.util.Properties");
        Method processPropertiesMethod = parserClazz.getDeclaredMethod("processProperties", propertiesType);
        processPropertiesMethod.setAccessible(true);
        java.lang.Object[] processPropertiesMethodArguments = new java.lang.Object[1];
        processPropertiesMethodArguments[0] = properties;
        processPropertiesMethod.invoke(gnuParser, processPropertiesMethodArguments);
    }
    ///endregion
    
    ///region Errors report for processProperties
    
    public void testProcessProperties_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
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
        GnuParser gnuParser = new GnuParser();
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        option.setOptionalArg(true);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        ListIterator listIterator = values.listIterator();
        
        gnuParser.processArgs(option, listIterator);
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
        GnuParser gnuParser = new GnuParser();
        
        /* This test fails because method [org.apache.commons.cli.Parser.processArgs] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.processArgs(Parser.java:327) */
        gnuParser.processArgs(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processArgs(org.apache.commons.cli.Option,java.util.ListIterator)}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getValues()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (opt.getValues() == null) && !opt.hasOptionalArg()
 *  */
    @Test
    public void testProcessArgs_ThrowNullPointerException_1() throws ParseException  {
        GnuParser gnuParser = new GnuParser();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        ListIterator listIterator = arrayList.listIterator();
        
        /* This test fails because method [org.apache.commons.cli.Parser.processArgs] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.processArgs(Parser.java:332) */
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
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getKey()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link org.apache.commons.cli.MissingArgumentException} in: opt.getKey()
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
 * @utbot.invokes {@link org.apache.commons.cli.Options#hasOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean hasOption = options.hasOption(arg);
 *  */
    @Test
    public void testProcessOption_ThrowNullPointerException() throws Throwable  {
        GnuParser gnuParser = new GnuParser();
        
        /* This test fails because method [org.apache.commons.cli.Parser.processOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.processOption(Parser.java:372) */
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Class stringType = Class.forName("java.lang.String");
        Class listIteratorType = Class.forName("java.util.ListIterator");
        Method processOptionMethod = parserClazz.getDeclaredMethod("processOption", stringType, listIteratorType);
        processOptionMethod.setAccessible(true);
        java.lang.Object[] processOptionMethodArguments = new java.lang.Object[2];
        processOptionMethodArguments[0] = ((Object) null);
        processOptionMethodArguments[1] = ((Object) null);
        try {
            processOptionMethod.invoke(gnuParser, processOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method processOption(java.lang.String, java.util.ListIterator)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#processOption(java.lang.String,java.util.ListIterator)}
 * @utbot.executesCondition {@code (!hasOption): True}
 * @utbot.invokes {@link org.apache.commons.cli.Options#hasOption(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link org.apache.commons.cli.UnrecognizedOptionException} when: !hasOption
 *  */
    @Test(expected = UnrecognizedOptionException.class)
    public void testProcessOption_ThrowUnrecognizedOptionException() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.Parser", "options", options);
        String string = "";
        
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Class stringType = Class.forName("java.lang.String");
        Class listIteratorType = Class.forName("java.util.ListIterator");
        Method processOptionMethod = parserClazz.getDeclaredMethod("processOption", stringType, listIteratorType);
        processOptionMethod.setAccessible(true);
        java.lang.Object[] processOptionMethodArguments = new java.lang.Object[2];
        processOptionMethodArguments[0] = string;
        processOptionMethodArguments[1] = ((Object) null);
        try {
            processOptionMethod.invoke(posixParser, processOptionMethodArguments);
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
 * @utbot.executesCondition {@code (requiredOptions.size() > 0): False}
 * @utbot.invokes {@link java.util.List#size()}
 *  */
    @Test
    public void testCheckRequiredOptions_RequiredOptionsSizeLessOrEqualZero() throws Exception  {
        BasicParser basicParser = ((BasicParser) createInstance("org.apache.commons.cli.BasicParser"));
        ArrayList requiredOptions = new ArrayList();
        setField(basicParser, "org.apache.commons.cli.Parser", "requiredOptions", requiredOptions);
        
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Method checkRequiredOptionsMethod = parserClazz.getDeclaredMethod("checkRequiredOptions");
        checkRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] checkRequiredOptionsMethodArguments = new java.lang.Object[0];
        checkRequiredOptionsMethod.invoke(basicParser, checkRequiredOptionsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkRequiredOptions()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Parser#checkRequiredOptions()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: requiredOptions.size() > 0
 *  */
    @Test
    public void testCheckRequiredOptions_ThrowNullPointerException() throws Throwable  {
        GnuParser gnuParser = new GnuParser();
        
        /* This test fails because method [org.apache.commons.cli.Parser.checkRequiredOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Parser.checkRequiredOptions(Parser.java:295) */
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Method checkRequiredOptionsMethod = parserClazz.getDeclaredMethod("checkRequiredOptions");
        checkRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] checkRequiredOptionsMethodArguments = new java.lang.Object[0];
        try {
            checkRequiredOptionsMethod.invoke(gnuParser, checkRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method checkRequiredOptions()
    
    @Test(expected = MissingOptionException.class)
    public void testCheckRequiredOptions1() throws Throwable  {
        BasicParser basicParser = ((BasicParser) createInstance("org.apache.commons.cli.BasicParser"));
        ArrayList requiredOptions = new ArrayList();
        Character character = '\u0100';
        requiredOptions.add(character);
        Object object = createInstance("java.lang.Object");
        requiredOptions.add(object);
        requiredOptions.add(object);
        setField(basicParser, "org.apache.commons.cli.Parser", "requiredOptions", requiredOptions);
        
        Class parserClazz = Class.forName("org.apache.commons.cli.Parser");
        Method checkRequiredOptionsMethod = parserClazz.getDeclaredMethod("checkRequiredOptions");
        checkRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] checkRequiredOptionsMethodArguments = new java.lang.Object[0];
        try {
            checkRequiredOptionsMethod.invoke(basicParser, checkRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields837253112509700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields837253112509700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass837253112516200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields837253112509700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass837253112516200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

