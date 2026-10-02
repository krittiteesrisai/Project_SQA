package org.apache.commons.cli;

import org.junit.Test;
import java.util.Properties;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import sun.security.provider.Sun;
import java.util.LinkedHashSet;
import sun.security.ssl.SunJSSE;
import sun.security.rsa.SunRsaSign;
import java.text.AttributedCharacterIterator.Attribute;
import java.text.AttributedCharacterIterator;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_cli_DefaultParserTest {
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, java.util.Properties, boolean)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#parse(org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean)}
 * @utbot.invokes {@link org.apache.commons.cli.Options#getRequiredOptions()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expectedOpts = new ArrayList(options.getRequiredOptions());
 *  */
    @Test
    public void testParse_ThrowNullPointerException() throws ParseException  {
        DefaultParser defaultParser = new DefaultParser();
        defaultParser.stopAtNonOption = false;
        defaultParser.skipParsing = false;
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.parse(DefaultParser.java:104) */
        defaultParser.parse(null, null, null, false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, java.util.Properties, boolean)
    
    @Test
    public void testParseByFuzzer() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        Options options = new Options();
        java.lang.String[] stringArray = {"\n\t\r", "\n\t\r"};
        Properties properties = new Properties();
        
        CommandLine actual = defaultParser.parse(options, stringArray, properties, false);
        
        CommandLine expected = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedList args = new LinkedList();
        String string = "\n\t\r";
        args.add(string);
        args.add(string);
        setField(expected, "org.apache.commons.cli.CommandLine", "args", args);
        ArrayList options1 = new ArrayList();
        setField(expected, "org.apache.commons.cli.CommandLine", "options", options1);
        
        List expectedArgs = ((List) getFieldValue(expected, "org.apache.commons.cli.CommandLine", "args"));
        List actualArgs = ((List) getFieldValue(actual, "org.apache.commons.cli.CommandLine", "args"));
        assertTrue(deepEquals(expectedArgs, actualArgs));
        
        List expectedOptions = ((List) getFieldValue(expected, "org.apache.commons.cli.CommandLine", "options"));
        List actualOptions = ((List) getFieldValue(actual, "org.apache.commons.cli.CommandLine", "options"));
        assertTrue(deepEquals(expectedOptions, actualOptions));
        
    }
    
    @Test
    public void testParseByFuzzer1() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        Options options = new Options();
        java.lang.String[] stringArray = {"-3", "-3", "-3"};
        Properties properties = new Properties();
        
        CommandLine actual = defaultParser.parse(options, stringArray, properties, true);
        
        CommandLine expected = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedList args = new LinkedList();
        String string = "-3";
        args.add(string);
        args.add(string);
        args.add(string);
        setField(expected, "org.apache.commons.cli.CommandLine", "args", args);
        ArrayList options1 = new ArrayList();
        setField(expected, "org.apache.commons.cli.CommandLine", "options", options1);
        
        List expectedArgs = ((List) getFieldValue(expected, "org.apache.commons.cli.CommandLine", "args"));
        List actualArgs = ((List) getFieldValue(actual, "org.apache.commons.cli.CommandLine", "args"));
        assertTrue(deepEquals(expectedArgs, actualArgs));
        
        List expectedOptions = ((List) getFieldValue(expected, "org.apache.commons.cli.CommandLine", "options"));
        List actualOptions = ((List) getFieldValue(actual, "org.apache.commons.cli.CommandLine", "options"));
        assertTrue(deepEquals(expectedOptions, actualOptions));
        
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, java.util.Properties, boolean)
    
    @Test(expected = UnrecognizedOptionException.class)
    public void testParseByFuzzer2() throws ParseException  {
        DefaultParser defaultParser = new DefaultParser();
        Options options = new Options();
        java.lang.String[] stringArray = {"-3", "-3", "-3"};
        Properties properties = new Properties();
        
        defaultParser.parse(options, stringArray, properties, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.parse
    
    ///region FUZZER: CHECKED EXCEPTIONS for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.DefaultParser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#parse(org.apache.commons.cli.Options,java.lang.String[],boolean)}
     */
    @Test(expected = UnrecognizedOptionException.class)
    public void testParseThrowsUOEWithNonEmptyObjectArray() throws ParseException  {
        DefaultParser defaultParser = new DefaultParser();
        Options options = new Options();
        java.lang.String[] stringArray = {"-3", "-3", "-3"};
        
        defaultParser.parse(options, stringArray, false);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.DefaultParser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#parse(org.apache.commons.cli.Options,java.lang.String[],boolean)}
     */
    @Test
    public void testParseThrowsNPEWithNonEmptyObjectArray() throws ParseException  {
        DefaultParser defaultParser = new DefaultParser();
        java.lang.String[] stringArray = {"\n\t\r", "abc", "XZ"};
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.parse(DefaultParser.java:104)
            org.apache.commons.cli.DefaultParser.parse(DefaultParser.java:80) */
        defaultParser.parse(((Options) null), stringArray, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.parse
    
    ///region FUZZER: CHECKED EXCEPTIONS for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;, java.util.Properties)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.DefaultParser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#parse(org.apache.commons.cli.Options,java.lang.String[],java.util.Properties)}
     */
    @Test(expected = UnrecognizedOptionException.class)
    public void testParseThrowsUOEWithNonEmptyObjectArray1() throws ParseException  {
        DefaultParser defaultParser = new DefaultParser();
        Options options = new Options();
        java.lang.String[] stringArray = {"-3", "-3", "-3"};
        Properties properties = new Properties();
        
        defaultParser.parse(options, stringArray, properties);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.parse
    
    ///region FUZZER: CHECKED EXCEPTIONS for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.DefaultParser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#parse(org.apache.commons.cli.Options,java.lang.String[])}
     */
    @Test(expected = UnrecognizedOptionException.class)
    public void testParseThrowsUOEWithNonEmptyObjectArray2() throws ParseException  {
        DefaultParser defaultParser = new DefaultParser();
        Options options = new Options();
        java.lang.String[] stringArray = {"-3", "-3", "-3"};
        
        defaultParser.parse(options, stringArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parse(org.apache.commons.cli.Options, [Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.DefaultParser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#parse(org.apache.commons.cli.Options,java.lang.String[])}
     */
    @Test
    public void testParseThrowsNPEWithNonEmptyObjectArray1() throws ParseException  {
        DefaultParser defaultParser = new DefaultParser();
        java.lang.String[] stringArray = {"abc", "\n\t\r", "XZ"};
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.parse] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.parse(DefaultParser.java:104)
            org.apache.commons.cli.DefaultParser.parse(DefaultParser.java:75)
            org.apache.commons.cli.DefaultParser.parse(DefaultParser.java:59) */
        defaultParser.parse(null, stringArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.isNegativeNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNegativeNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isNegativeNumber(java.lang.String)}
 *  */
    @Test
    public void testIsNegativeNumber() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isNegativeNumberMethod = defaultParserClazz.getDeclaredMethod("isNegativeNumber", stringType);
        isNegativeNumberMethod.setAccessible(true);
        java.lang.Object[] isNegativeNumberMethodArguments = new java.lang.Object[1];
        isNegativeNumberMethodArguments[0] = string;
        boolean actual = ((Boolean) isNegativeNumberMethod.invoke(defaultParser, isNegativeNumberMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isNegativeNumber(java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsNegativeNumber_ReturnTrue() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "9";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isNegativeNumberMethod = defaultParserClazz.getDeclaredMethod("isNegativeNumber", stringType);
        isNegativeNumberMethod.setAccessible(true);
        java.lang.Object[] isNegativeNumberMethodArguments = new java.lang.Object[1];
        isNegativeNumberMethodArguments[0] = string;
        boolean actual = ((Boolean) isNegativeNumberMethod.invoke(defaultParser, isNegativeNumberMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.handleLongOptionWithEqual
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleLongOptionWithEqual(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleLongOptionWithEqual(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String opt = token.substring(0, pos);
 *  */
    @Test
    public void testHandleLongOptionWithEqual_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = " ";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleLongOptionWithEqual] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.cli.DefaultParser.handleLongOptionWithEqual(DefaultParser.java:415) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleLongOptionWithEqualMethod = defaultParserClazz.getDeclaredMethod("handleLongOptionWithEqual", stringType);
        handleLongOptionWithEqualMethod.setAccessible(true);
        java.lang.Object[] handleLongOptionWithEqualMethodArguments = new java.lang.Object[1];
        handleLongOptionWithEqualMethodArguments[0] = string;
        try {
            handleLongOptionWithEqualMethod.invoke(defaultParser, handleLongOptionWithEqualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleLongOptionWithEqual(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pos = token.indexOf('=');
 *  */
    @Test
    public void testHandleLongOptionWithEqual_ThrowNullPointerException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleLongOptionWithEqual] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleLongOptionWithEqual(DefaultParser.java:411) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleLongOptionWithEqualMethod = defaultParserClazz.getDeclaredMethod("handleLongOptionWithEqual", stringType);
        handleLongOptionWithEqualMethod.setAccessible(true);
        java.lang.Object[] handleLongOptionWithEqualMethodArguments = new java.lang.Object[1];
        handleLongOptionWithEqualMethodArguments[0] = ((Object) null);
        try {
            handleLongOptionWithEqualMethod.invoke(defaultParser, handleLongOptionWithEqualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleLongOptionWithEqual(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.cli.Options#getMatchingOptions(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List matchingOpts = options.getMatchingOptions(opt);
 *  */
    @Test
    public void testHandleLongOptionWithEqual_ThrowNullPointerException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "= ";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleLongOptionWithEqual] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleLongOptionWithEqual(DefaultParser.java:417) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleLongOptionWithEqualMethod = defaultParserClazz.getDeclaredMethod("handleLongOptionWithEqual", stringType);
        handleLongOptionWithEqualMethod.setAccessible(true);
        java.lang.Object[] handleLongOptionWithEqualMethodArguments = new java.lang.Object[1];
        handleLongOptionWithEqualMethodArguments[0] = string;
        try {
            handleLongOptionWithEqualMethod.invoke(defaultParser, handleLongOptionWithEqualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.checkRequiredOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkRequiredOptions()
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#checkRequiredOptions()}
 * @utbot.executesCondition {@code (!expectedOpts.isEmpty()): False}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 *  */
    @Test
    public void testCheckRequiredOptions_ExpectedOptsIsEmpty() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, MissingOptionException  {
        DefaultParser defaultParser = new DefaultParser();
        ArrayList expectedOpts = new ArrayList();
        defaultParser.expectedOpts = expectedOpts;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Method checkRequiredOptionsMethod = defaultParserClazz.getDeclaredMethod("checkRequiredOptions");
        checkRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] checkRequiredOptionsMethodArguments = new java.lang.Object[0];
        checkRequiredOptionsMethod.invoke(defaultParser, checkRequiredOptionsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkRequiredOptions()
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#checkRequiredOptions()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !expectedOpts.isEmpty()
 *  */
    @Test
    public void testCheckRequiredOptions_ThrowNullPointerException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.checkRequiredOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.checkRequiredOptions(DefaultParser.java:190) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Method checkRequiredOptionsMethod = defaultParserClazz.getDeclaredMethod("checkRequiredOptions");
        checkRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] checkRequiredOptionsMethodArguments = new java.lang.Object[0];
        try {
            checkRequiredOptionsMethod.invoke(defaultParser, checkRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method checkRequiredOptions()
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#checkRequiredOptions()}
 * @utbot.executesCondition {@code (!expectedOpts.isEmpty()): True}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link org.apache.commons.cli.MissingOptionException} when: !expectedOpts.isEmpty()
 *  */
    @Test(expected = MissingOptionException.class)
    public void testCheckRequiredOptions_ThrowMissingOptionException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        ArrayList expectedOpts = new ArrayList();
        expectedOpts.add(null);
        expectedOpts.add(null);
        expectedOpts.add(null);
        expectedOpts.add(null);
        expectedOpts.add(null);
        expectedOpts.add(null);
        expectedOpts.add(null);
        expectedOpts.add(null);
        expectedOpts.add(null);
        expectedOpts.add(null);
        defaultParser.expectedOpts = expectedOpts;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Method checkRequiredOptionsMethod = defaultParserClazz.getDeclaredMethod("checkRequiredOptions");
        checkRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] checkRequiredOptionsMethodArguments = new java.lang.Object[0];
        try {
            checkRequiredOptionsMethod.invoke(defaultParser, checkRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.handleConcatenatedOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleConcatenatedOptions(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleConcatenatedOptions(java.lang.String)}
 *  */
    @Test
    public void testHandleConcatenatedOptions() throws ParseException  {
        DefaultParser defaultParser = new DefaultParser();
        String string = " ";
        
        defaultParser.handleConcatenatedOptions(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleConcatenatedOptions(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleConcatenatedOptions(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 1; i < token.length(); i++)
 *  */
    @Test
    public void testHandleConcatenatedOptions_ThrowNullPointerException() throws ParseException  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleConcatenatedOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleConcatenatedOptions(DefaultParser.java:661) */
        defaultParser.handleConcatenatedOptions(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleConcatenatedOptions(java.lang.String)
    
    @Test
    public void testHandleConcatenatedOptions1() throws ParseException  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "\u0000\u0100";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleConcatenatedOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleConcatenatedOptions(DefaultParser.java:665) */
        defaultParser.handleConcatenatedOptions(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.handleShortAndLongOption
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleShortAndLongOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleShortAndLongOption(java.lang.String)}
 * @utbot.executesCondition {@code (t.length() == 1): False}
 * @utbot.executesCondition {@code (pos == -1): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.hasShortOption(t)
 *  */
    @Test
    public void testHandleShortAndLongOption_ThrowNullPointerException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleShortAndLongOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleShortAndLongOption(DefaultParser.java:482) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleShortAndLongOptionMethod = defaultParserClazz.getDeclaredMethod("handleShortAndLongOption", stringType);
        handleShortAndLongOptionMethod.setAccessible(true);
        java.lang.Object[] handleShortAndLongOptionMethodArguments = new java.lang.Object[1];
        handleShortAndLongOptionMethodArguments[0] = string;
        try {
            handleShortAndLongOptionMethod.invoke(defaultParser, handleShortAndLongOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleShortAndLongOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pos = t.indexOf('=');
 *  */
    @Test
    public void testHandleShortAndLongOption_ThrowNullPointerException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleShortAndLongOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleShortAndLongOption(DefaultParser.java:466) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleShortAndLongOptionMethod = defaultParserClazz.getDeclaredMethod("handleShortAndLongOption", stringType);
        handleShortAndLongOptionMethod.setAccessible(true);
        java.lang.Object[] handleShortAndLongOptionMethodArguments = new java.lang.Object[1];
        handleShortAndLongOptionMethodArguments[0] = ((Object) null);
        try {
            handleShortAndLongOptionMethod.invoke(defaultParser, handleShortAndLongOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleShortAndLongOption(java.lang.String)}
 * @utbot.executesCondition {@code (t.length() == 1): True}
 * @utbot.invokes {@link org.apache.commons.cli.Options#hasShortOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.hasShortOption(t)
 *  */
    @Test
    public void testHandleShortAndLongOption_ThrowNullPointerException_2() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "-- ";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleShortAndLongOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleShortAndLongOption(DefaultParser.java:471) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleShortAndLongOptionMethod = defaultParserClazz.getDeclaredMethod("handleShortAndLongOption", stringType);
        handleShortAndLongOptionMethod.setAccessible(true);
        java.lang.Object[] handleShortAndLongOptionMethodArguments = new java.lang.Object[1];
        handleShortAndLongOptionMethodArguments[0] = string;
        try {
            handleShortAndLongOptionMethod.invoke(defaultParser, handleShortAndLongOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleShortAndLongOption(java.lang.String)}
 * @utbot.executesCondition {@code (t.length() == 1): False}
 * @utbot.executesCondition {@code (pos == -1): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.hasShortOption(t)
 *  */
    @Test
    public void testHandleShortAndLongOption_ThrowNullPointerException_3() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "-";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleShortAndLongOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleShortAndLongOption(DefaultParser.java:482) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleShortAndLongOptionMethod = defaultParserClazz.getDeclaredMethod("handleShortAndLongOption", stringType);
        handleShortAndLongOptionMethod.setAccessible(true);
        java.lang.Object[] handleShortAndLongOptionMethodArguments = new java.lang.Object[1];
        handleShortAndLongOptionMethodArguments[0] = string;
        try {
            handleShortAndLongOptionMethod.invoke(defaultParser, handleShortAndLongOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleShortAndLongOption(java.lang.String)}
 * @utbot.executesCondition {@code (t.length() == 1): False}
 * @utbot.executesCondition {@code (pos == -1): False}
 * @utbot.executesCondition {@code (opt.length() == 1): True}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link org.apache.commons.cli.Options#getOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Option option = options.getOption(opt);
 *  */
    @Test
    public void testHandleShortAndLongOption_ThrowNullPointerException_4() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "-- =";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleShortAndLongOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleShortAndLongOption(DefaultParser.java:524) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleShortAndLongOptionMethod = defaultParserClazz.getDeclaredMethod("handleShortAndLongOption", stringType);
        handleShortAndLongOptionMethod.setAccessible(true);
        java.lang.Object[] handleShortAndLongOptionMethodArguments = new java.lang.Object[1];
        handleShortAndLongOptionMethodArguments[0] = string;
        try {
            handleShortAndLongOptionMethod.invoke(defaultParser, handleShortAndLongOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.handleLongOptionWithoutEqual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleLongOptionWithoutEqual(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleLongOptionWithoutEqual(java.lang.String)}
 *  */
    @Test
    public void testHandleLongOptionWithoutEqual_1() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        CommandLine cmd = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        ArrayList args = new ArrayList();
        setField(cmd, "org.apache.commons.cli.CommandLine", "args", args);
        defaultParser.cmd = cmd;
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "longOpts", longOpts);
        defaultParser.options = options;
        defaultParser.stopAtNonOption = false;
        String currentToken = "";
        defaultParser.currentToken = currentToken;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleLongOptionWithoutEqualMethod = defaultParserClazz.getDeclaredMethod("handleLongOptionWithoutEqual", stringType);
        handleLongOptionWithoutEqualMethod.setAccessible(true);
        java.lang.Object[] handleLongOptionWithoutEqualMethodArguments = new java.lang.Object[1];
        handleLongOptionWithoutEqualMethodArguments[0] = ((Object) null);
        handleLongOptionWithoutEqualMethod.invoke(defaultParser, handleLongOptionWithoutEqualMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleLongOptionWithoutEqual(java.lang.String)}
 *  */
    @Test
    public void testHandleLongOptionWithoutEqual() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        CommandLine cmd = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        ArrayList args = new ArrayList();
        setField(cmd, "org.apache.commons.cli.CommandLine", "args", args);
        defaultParser.cmd = cmd;
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "longOpts", longOpts);
        defaultParser.options = options;
        defaultParser.stopAtNonOption = true;
        String currentToken = "";
        defaultParser.currentToken = currentToken;
        defaultParser.skipParsing = false;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleLongOptionWithoutEqualMethod = defaultParserClazz.getDeclaredMethod("handleLongOptionWithoutEqual", stringType);
        handleLongOptionWithoutEqualMethod.setAccessible(true);
        java.lang.Object[] handleLongOptionWithoutEqualMethodArguments = new java.lang.Object[1];
        handleLongOptionWithoutEqualMethodArguments[0] = ((Object) null);
        handleLongOptionWithoutEqualMethod.invoke(defaultParser, handleLongOptionWithoutEqualMethodArguments);
        
        boolean finalDefaultParserSkipParsing = defaultParser.skipParsing;
        
        assertTrue(finalDefaultParserSkipParsing);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleLongOptionWithoutEqual(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleLongOptionWithoutEqual(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List matchingOpts = options.getMatchingOptions(token);
 *  */
    @Test
    public void testHandleLongOptionWithoutEqual_ThrowNullPointerException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleLongOptionWithoutEqual] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleLongOptionWithoutEqual(DefaultParser.java:384) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleLongOptionWithoutEqualMethod = defaultParserClazz.getDeclaredMethod("handleLongOptionWithoutEqual", stringType);
        handleLongOptionWithoutEqualMethod.setAccessible(true);
        java.lang.Object[] handleLongOptionWithoutEqualMethodArguments = new java.lang.Object[1];
        handleLongOptionWithoutEqualMethodArguments[0] = ((Object) null);
        try {
            handleLongOptionWithoutEqualMethod.invoke(defaultParser, handleLongOptionWithoutEqualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleLongOptionWithoutEqual(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handleUnknownToken(currentToken);
 *  */
    @Test
    public void testHandleLongOptionWithoutEqual_ThrowNullPointerException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "longOpts", longOpts);
        defaultParser.options = options;
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleLongOptionWithoutEqual] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleUnknownToken(DefaultParser.java:338)
            org.apache.commons.cli.DefaultParser.handleLongOptionWithoutEqual(DefaultParser.java:387) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleLongOptionWithoutEqualMethod = defaultParserClazz.getDeclaredMethod("handleLongOptionWithoutEqual", stringType);
        handleLongOptionWithoutEqualMethod.setAccessible(true);
        java.lang.Object[] handleLongOptionWithoutEqualMethodArguments = new java.lang.Object[1];
        handleLongOptionWithoutEqualMethodArguments[0] = ((Object) null);
        try {
            handleLongOptionWithoutEqualMethod.invoke(defaultParser, handleLongOptionWithoutEqualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleLongOptionWithoutEqual(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handleUnknownToken(currentToken);
 *  */
    @Test
    public void testHandleLongOptionWithoutEqual_ThrowNullPointerException_2() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "longOpts", longOpts);
        defaultParser.options = options;
        String currentToken = "";
        defaultParser.currentToken = currentToken;
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleLongOptionWithoutEqual] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleUnknownToken(DefaultParser.java:343)
            org.apache.commons.cli.DefaultParser.handleLongOptionWithoutEqual(DefaultParser.java:387) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleLongOptionWithoutEqualMethod = defaultParserClazz.getDeclaredMethod("handleLongOptionWithoutEqual", stringType);
        handleLongOptionWithoutEqualMethod.setAccessible(true);
        java.lang.Object[] handleLongOptionWithoutEqualMethodArguments = new java.lang.Object[1];
        handleLongOptionWithoutEqualMethodArguments[0] = ((Object) null);
        try {
            handleLongOptionWithoutEqualMethod.invoke(defaultParser, handleLongOptionWithoutEqualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.updateRequiredOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateRequiredOptions(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#updateRequiredOptions(org.apache.commons.cli.Option)}
 *  */
    @Test
    public void testUpdateRequiredOptions() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap optionGroups = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        defaultParser.options = options;
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = defaultParserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        updateRequiredOptionsMethod.invoke(defaultParser, updateRequiredOptionsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#updateRequiredOptions(org.apache.commons.cli.Option)}
 *  */
    @Test
    public void testUpdateRequiredOptions_1() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap optionGroups = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        optionGroups.put(character, object);
        setField(options, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        defaultParser.options = options;
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = defaultParserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        updateRequiredOptionsMethod.invoke(defaultParser, updateRequiredOptionsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateRequiredOptions(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#updateRequiredOptions(org.apache.commons.cli.Option)}
 * @utbot.invokes {@link org.apache.commons.cli.Options#getOptionGroup(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: options.getOptionGroup(option) != null
 *  */
    @Test
    public void testUpdateRequiredOptions_ThrowClassCastException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap optionGroups = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        optionGroups.put(null, object);
        setField(options, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        defaultParser.options = options;
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.updateRequiredOptions] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli.OptionGroup (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli.OptionGroup is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.cli.Options.getOptionGroup(Options.java:293)
            org.apache.commons.cli.DefaultParser.updateRequiredOptions(DefaultParser.java:621) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = defaultParserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        try {
            updateRequiredOptionsMethod.invoke(defaultParser, updateRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#updateRequiredOptions(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.getOptionGroup(option) != null
 *  */
    @Test
    public void testUpdateRequiredOptions_ThrowNullPointerException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.updateRequiredOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.updateRequiredOptions(DefaultParser.java:621) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = defaultParserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        try {
            updateRequiredOptionsMethod.invoke(defaultParser, updateRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#updateRequiredOptions(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: option.isRequired()
 *  */
    @Test
    public void testUpdateRequiredOptions_ThrowNullPointerException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.updateRequiredOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.updateRequiredOptions(DefaultParser.java:615) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = defaultParserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = ((Object) null);
        try {
            updateRequiredOptionsMethod.invoke(defaultParser, updateRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#updateRequiredOptions(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expectedOpts.remove(option.getKey());
 *  */
    @Test
    public void testUpdateRequiredOptions_ThrowNullPointerException_2() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        option.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.updateRequiredOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.updateRequiredOptions(DefaultParser.java:617) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = defaultParserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        try {
            updateRequiredOptionsMethod.invoke(defaultParser, updateRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#updateRequiredOptions(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expectedOpts.remove(option.getKey());
 *  */
    @Test
    public void testUpdateRequiredOptions_ThrowNullPointerException_3() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        option.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.updateRequiredOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.updateRequiredOptions(DefaultParser.java:617) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = defaultParserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        try {
            updateRequiredOptionsMethod.invoke(defaultParser, updateRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#updateRequiredOptions(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.getOptionGroup(option) != null
 *  */
    @Test
    public void testUpdateRequiredOptions_ThrowNullPointerException_4() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        ArrayList expectedOpts = new ArrayList();
        defaultParser.expectedOpts = expectedOpts;
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String longOpt = "";
        option.setLongOpt(longOpt);
        option.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.updateRequiredOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.updateRequiredOptions(DefaultParser.java:621) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = defaultParserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        try {
            updateRequiredOptionsMethod.invoke(defaultParser, updateRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#updateRequiredOptions(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.getOptionGroup(option) != null
 *  */
    @Test
    public void testUpdateRequiredOptions_ThrowNullPointerException_5() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        ArrayList expectedOpts = new ArrayList();
        String string = "\u0000";
        expectedOpts.add(string);
        defaultParser.expectedOpts = expectedOpts;
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "\u0000\u0000";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        option.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.updateRequiredOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.updateRequiredOptions(DefaultParser.java:621) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method updateRequiredOptionsMethod = defaultParserClazz.getDeclaredMethod("updateRequiredOptions", optionType);
        updateRequiredOptionsMethod.setAccessible(true);
        java.lang.Object[] updateRequiredOptionsMethodArguments = new java.lang.Object[1];
        updateRequiredOptionsMethodArguments[0] = option;
        try {
            updateRequiredOptionsMethod.invoke(defaultParser, updateRequiredOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.handleProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleProperties(java.util.Properties)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleProperties(java.util.Properties)}
 * @utbot.executesCondition {@code (properties == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testHandleProperties_PropertiesEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, ParseException  {
        DefaultParser defaultParser = new DefaultParser();
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class propertiesType = Class.forName("java.util.Properties");
        Method handlePropertiesMethod = defaultParserClazz.getDeclaredMethod("handleProperties", propertiesType);
        handlePropertiesMethod.setAccessible(true);
        java.lang.Object[] handlePropertiesMethodArguments = new java.lang.Object[1];
        handlePropertiesMethodArguments[0] = ((Object) null);
        handlePropertiesMethod.invoke(defaultParser, handlePropertiesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleProperties(java.util.Properties)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleProperties(java.util.Properties)}
 * @utbot.executesCondition {@code (properties == null): False}
 * @utbot.invokes {@link java.util.Properties#propertyNames()}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: for(Enumeration e = properties.propertyNames(); e.hasMoreElements(); )
 *  */
    @Test
    public void testHandleProperties_ThrowRuntimeException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Sun sun = ((Sun) createInstance("sun.security.provider.Sun"));
        LinkedHashSet entrySet = new LinkedHashSet();
        setField(sun, "java.security.Provider", "entrySet", entrySet);
        setField(sun, "java.security.Provider", "initialized", true);
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleProperties] produces [java.lang.RuntimeException: Internal error.]
            java.base/java.security.Provider.entrySet(Provider.java:425)
            java.base/java.util.Properties.enumerate(Properties.java:1230)
            java.base/java.util.Properties.propertyNames(Properties.java:1142)
            org.apache.commons.cli.DefaultParser.handleProperties(DefaultParser.java:146) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class sunType = Class.forName("java.util.Properties");
        Method handlePropertiesMethod = defaultParserClazz.getDeclaredMethod("handleProperties", sunType);
        handlePropertiesMethod.setAccessible(true);
        java.lang.Object[] handlePropertiesMethodArguments = new java.lang.Object[1];
        handlePropertiesMethodArguments[0] = sun;
        try {
            handlePropertiesMethod.invoke(defaultParser, handlePropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleProperties(java.util.Properties)
    
    @Test
    public void testHandleProperties1() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        SunJSSE sunJSSE = ((SunJSSE) createInstance("sun.security.ssl.SunJSSE"));
        LinkedHashSet entrySet = new LinkedHashSet();
        setField(sunJSSE, "java.security.Provider", "entrySet", entrySet);
        setField(sunJSSE, "java.security.Provider", "entrySetCallCount", 2);
        setField(sunJSSE, "java.security.Provider", "initialized", true);
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class sunJSSEType = Class.forName("java.util.Properties");
        Method handlePropertiesMethod = defaultParserClazz.getDeclaredMethod("handleProperties", sunJSSEType);
        handlePropertiesMethod.setAccessible(true);
        java.lang.Object[] handlePropertiesMethodArguments = new java.lang.Object[1];
        handlePropertiesMethodArguments[0] = sunJSSE;
        handlePropertiesMethod.invoke(defaultParser, handlePropertiesMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleProperties(java.util.Properties)
    
    @Test(expected = StackOverflowError.class)
    public void testHandleProperties2() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Properties properties = ((Properties) createInstance("java.util.Properties"));
        SunRsaSign defaults = ((SunRsaSign) createInstance("sun.security.rsa.SunRsaSign"));
        setField(defaults, "java.util.Properties", "defaults", defaults);
        setField(properties, "java.util.Properties", "defaults", defaults);
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class propertiesType = Class.forName("java.util.Properties");
        Method handlePropertiesMethod = defaultParserClazz.getDeclaredMethod("handleProperties", propertiesType);
        handlePropertiesMethod.setAccessible(true);
        java.lang.Object[] handlePropertiesMethodArguments = new java.lang.Object[1];
        handlePropertiesMethodArguments[0] = properties;
        try {
            handlePropertiesMethod.invoke(defaultParser, handlePropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleProperties3() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        SunJSSE sunJSSE = ((SunJSSE) createInstance("sun.security.ssl.SunJSSE"));
        LinkedHashSet entrySet = new LinkedHashSet();
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        AttributedCharacterIterator.Attribute key = ((AttributedCharacterIterator.Attribute) createInstance("java.text.AttributedCharacterIterator$Attribute"));
        setField(attributeEntry, "java.text.AttributeEntry", "key", key);
        Integer value = 0;
        setField(attributeEntry, "java.text.AttributeEntry", "value", value);
        entrySet.add(attributeEntry);
        setField(sunJSSE, "java.security.Provider", "entrySet", entrySet);
        setField(sunJSSE, "java.security.Provider", "entrySetCallCount", 2);
        setField(sunJSSE, "java.security.Provider", "initialized", true);
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleProperties] produces [java.lang.ClassCastException: class java.text.AttributedCharacterIterator$Attribute cannot be cast to class java.lang.String (java.text.AttributedCharacterIterator$Attribute and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.util.Properties.enumerate(Properties.java:1231)
            java.base/java.util.Properties.propertyNames(Properties.java:1142)
            org.apache.commons.cli.DefaultParser.handleProperties(DefaultParser.java:146) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class sunJSSEType = Class.forName("java.util.Properties");
        Method handlePropertiesMethod = defaultParserClazz.getDeclaredMethod("handleProperties", sunJSSEType);
        handlePropertiesMethod.setAccessible(true);
        java.lang.Object[] handlePropertiesMethodArguments = new java.lang.Object[1];
        handlePropertiesMethodArguments[0] = sunJSSE;
        try {
            handlePropertiesMethod.invoke(defaultParser, handlePropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleProperties4() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        SunJSSE sunJSSE = ((SunJSSE) createInstance("sun.security.ssl.SunJSSE"));
        setField(sunJSSE, "java.security.Provider", "initialized", true);
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleProperties] produces [java.lang.NullPointerException]
            java.base/java.util.Properties.entrySet(Properties.java:1336)
            java.base/java.security.Provider.entrySet(Provider.java:416)
            java.base/java.util.Collections$UnmodifiableMap.entrySet(Collections.java:1529)
            java.base/java.security.Provider.entrySet(Provider.java:414)
            java.base/java.util.Properties.enumerate(Properties.java:1230)
            java.base/java.util.Properties.propertyNames(Properties.java:1142)
            org.apache.commons.cli.DefaultParser.handleProperties(DefaultParser.java:146) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class sunJSSEType = Class.forName("java.util.Properties");
        Method handlePropertiesMethod = defaultParserClazz.getDeclaredMethod("handleProperties", sunJSSEType);
        handlePropertiesMethod.setAccessible(true);
        java.lang.Object[] handlePropertiesMethodArguments = new java.lang.Object[1];
        handlePropertiesMethodArguments[0] = sunJSSE;
        try {
            handlePropertiesMethod.invoke(defaultParser, handlePropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleProperties5() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        SunJSSE sunJSSE = ((SunJSSE) createInstance("sun.security.ssl.SunJSSE"));
        LinkedHashSet entrySet = new LinkedHashSet();
        entrySet.add(null);
        setField(sunJSSE, "java.security.Provider", "entrySet", entrySet);
        setField(sunJSSE, "java.security.Provider", "entrySetCallCount", 2);
        setField(sunJSSE, "java.security.Provider", "initialized", true);
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleProperties] produces [java.lang.NullPointerException]
            java.base/java.util.Properties.enumerate(Properties.java:1231)
            java.base/java.util.Properties.propertyNames(Properties.java:1142)
            org.apache.commons.cli.DefaultParser.handleProperties(DefaultParser.java:146) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class sunJSSEType = Class.forName("java.util.Properties");
        Method handlePropertiesMethod = defaultParserClazz.getDeclaredMethod("handleProperties", sunJSSEType);
        handlePropertiesMethod.setAccessible(true);
        java.lang.Object[] handlePropertiesMethodArguments = new java.lang.Object[1];
        handlePropertiesMethodArguments[0] = sunJSSE;
        try {
            handlePropertiesMethod.invoke(defaultParser, handlePropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleProperties6() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        SunJSSE sunJSSE = ((SunJSSE) createInstance("sun.security.ssl.SunJSSE"));
        LinkedHashSet entrySet = new LinkedHashSet();
        entrySet.add(null);
        Object entry = createInstance("java.util.WeakHashMap$Entry");
        entrySet.add(entry);
        entrySet.add(null);
        setField(sunJSSE, "java.security.Provider", "entrySet", entrySet);
        setField(sunJSSE, "java.security.Provider", "entrySetCallCount", 2);
        setField(sunJSSE, "java.security.Provider", "initialized", true);
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleProperties] produces [java.lang.NullPointerException] */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class sunJSSEType = Class.forName("java.util.Properties");
        Method handlePropertiesMethod = defaultParserClazz.getDeclaredMethod("handleProperties", sunJSSEType);
        handlePropertiesMethod.setAccessible(true);
        java.lang.Object[] handlePropertiesMethodArguments = new java.lang.Object[1];
        handlePropertiesMethodArguments[0] = sunJSSE;
        try {
            handlePropertiesMethod.invoke(defaultParser, handlePropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for handleProperties
    
    public void testHandleProperties_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.isShortOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isShortOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isShortOption(java.lang.String)}
 * @utbot.returnsFrom {@code return token.startsWith("-") && token.length() >= 2 && options.hasShortOption(token.substring(1, 2));}
 *  */
    @Test
    public void testIsShortOption_TokenStartsWithAndTokenLengthLessThan2AndOptionsHasShortOption() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isShortOptionMethod = defaultParserClazz.getDeclaredMethod("isShortOption", stringType);
        isShortOptionMethod.setAccessible(true);
        java.lang.Object[] isShortOptionMethodArguments = new java.lang.Object[1];
        isShortOptionMethodArguments[0] = string;
        boolean actual = ((Boolean) isShortOptionMethod.invoke(defaultParser, isShortOptionMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isShortOption(java.lang.String)}
 * @utbot.returnsFrom {@code return token.startsWith("-") && token.length() >= 2 && options.hasShortOption(token.substring(1, 2));}
 *  */
    @Test
    public void testIsShortOption_TokenStartsWithAndTokenLengthLessThan2AndOptionsHasShortOption_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "-";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isShortOptionMethod = defaultParserClazz.getDeclaredMethod("isShortOption", stringType);
        isShortOptionMethod.setAccessible(true);
        java.lang.Object[] isShortOptionMethodArguments = new java.lang.Object[1];
        isShortOptionMethodArguments[0] = string;
        boolean actual = ((Boolean) isShortOptionMethod.invoke(defaultParser, isShortOptionMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isShortOption(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link org.apache.commons.cli.Options#hasShortOption(java.lang.String)}
 * @utbot.returnsFrom {@code return token.startsWith("-") && token.length() >= 2 && options.hasShortOption(token.substring(1, 2));}
 *  */
    @Test
    public void testIsShortOption_TokenStartsWithAndTokenLengthLessThan2AndOptionsHasShortOption_2() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        defaultParser.options = options;
        String string = "- ";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isShortOptionMethod = defaultParserClazz.getDeclaredMethod("isShortOption", stringType);
        isShortOptionMethod.setAccessible(true);
        java.lang.Object[] isShortOptionMethodArguments = new java.lang.Object[1];
        isShortOptionMethodArguments[0] = string;
        boolean actual = ((Boolean) isShortOptionMethod.invoke(defaultParser, isShortOptionMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isShortOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isShortOption(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return token.startsWith("-") && token.length() >= 2 && options.hasShortOption(token.substring(1, 2));
 *  */
    @Test
    public void testIsShortOption_ThrowNullPointerException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.isShortOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.isShortOption(DefaultParser.java:295) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isShortOptionMethod = defaultParserClazz.getDeclaredMethod("isShortOption", stringType);
        isShortOptionMethod.setAccessible(true);
        java.lang.Object[] isShortOptionMethodArguments = new java.lang.Object[1];
        isShortOptionMethodArguments[0] = ((Object) null);
        try {
            isShortOptionMethod.invoke(defaultParser, isShortOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isShortOption(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return token.startsWith("-") && token.length() >= 2 && options.hasShortOption(token.substring(1, 2));
 *  */
    @Test
    public void testIsShortOption_ThrowNullPointerException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "- ";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.isShortOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.isShortOption(DefaultParser.java:295) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isShortOptionMethod = defaultParserClazz.getDeclaredMethod("isShortOption", stringType);
        isShortOptionMethod.setAccessible(true);
        java.lang.Object[] isShortOptionMethodArguments = new java.lang.Object[1];
        isShortOptionMethodArguments[0] = string;
        try {
            isShortOptionMethod.invoke(defaultParser, isShortOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.isLongOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLongOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isLongOption(java.lang.String)}
 * @utbot.executesCondition {@code (!token.startsWith("-")): False}
 *  */
    @Test
    public void testIsLongOption_TokenStartsWith() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isLongOptionMethod = defaultParserClazz.getDeclaredMethod("isLongOption", stringType);
        isLongOptionMethod.setAccessible(true);
        java.lang.Object[] isLongOptionMethodArguments = new java.lang.Object[1];
        isLongOptionMethodArguments[0] = string;
        boolean actual = ((Boolean) isLongOptionMethod.invoke(defaultParser, isLongOptionMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isLongOption(java.lang.String)}
 * @utbot.executesCondition {@code (!token.startsWith("-")): True}
 * @utbot.executesCondition {@code (token.length() == 1): True}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testIsLongOption_TokenLengthEquals1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "-";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isLongOptionMethod = defaultParserClazz.getDeclaredMethod("isLongOption", stringType);
        isLongOptionMethod.setAccessible(true);
        java.lang.Object[] isLongOptionMethodArguments = new java.lang.Object[1];
        isLongOptionMethodArguments[0] = string;
        boolean actual = ((Boolean) isLongOptionMethod.invoke(defaultParser, isLongOptionMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isLongOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isLongOption(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !token.startsWith("-") || token.length() == 1
 *  */
    @Test
    public void testIsLongOption_ThrowNullPointerException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.isLongOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.isLongOption(DefaultParser.java:305) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isLongOptionMethod = defaultParserClazz.getDeclaredMethod("isLongOption", stringType);
        isLongOptionMethod.setAccessible(true);
        java.lang.Object[] isLongOptionMethodArguments = new java.lang.Object[1];
        isLongOptionMethodArguments[0] = ((Object) null);
        try {
            isLongOptionMethod.invoke(defaultParser, isLongOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isLongOption(java.lang.String)}
 * @utbot.executesCondition {@code (!token.startsWith("-")): True}
 * @utbot.executesCondition {@code (token.length() == 1): False}
 * @utbot.executesCondition {@code (pos == -1): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !options.getMatchingOptions(t).isEmpty()
 *  */
    @Test
    public void testIsLongOption_ThrowNullPointerException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "- ";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.isLongOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.isLongOption(DefaultParser.java:313) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isLongOptionMethod = defaultParserClazz.getDeclaredMethod("isLongOption", stringType);
        isLongOptionMethod.setAccessible(true);
        java.lang.Object[] isLongOptionMethodArguments = new java.lang.Object[1];
        isLongOptionMethodArguments[0] = string;
        try {
            isLongOptionMethod.invoke(defaultParser, isLongOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isLongOption(java.lang.String)}
 * @utbot.executesCondition {@code (!token.startsWith("-")): True}
 * @utbot.executesCondition {@code (token.length() == 1): False}
 * @utbot.executesCondition {@code (pos == -1): False}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !options.getMatchingOptions(t).isEmpty()
 *  */
    @Test
    public void testIsLongOption_ThrowNullPointerException_2() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "-=";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.isLongOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.isLongOption(DefaultParser.java:313) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isLongOptionMethod = defaultParserClazz.getDeclaredMethod("isLongOption", stringType);
        isLongOptionMethod.setAccessible(true);
        java.lang.Object[] isLongOptionMethodArguments = new java.lang.Object[1];
        isLongOptionMethodArguments[0] = string;
        try {
            isLongOptionMethod.invoke(defaultParser, isLongOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.isArgument
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isArgument(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isArgument(java.lang.String)}
 * @utbot.returnsFrom {@code return !isOption(token) || isNegativeNumber(token);}
 *  */
    @Test
    public void testIsArgument_ReturnNotIsOptionOrIsNegativeNumber() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isArgumentMethod = defaultParserClazz.getDeclaredMethod("isArgument", stringType);
        isArgumentMethod.setAccessible(true);
        java.lang.Object[] isArgumentMethodArguments = new java.lang.Object[1];
        isArgumentMethodArguments[0] = string;
        boolean actual = ((Boolean) isArgumentMethod.invoke(defaultParser, isArgumentMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isArgument(java.lang.String)}
 * @utbot.returnsFrom {@code return !isOption(token) || isNegativeNumber(token);}
 *  */
    @Test
    public void testIsArgument_ReturnNotIsOptionOrIsNegativeNumber_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "-";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isArgumentMethod = defaultParserClazz.getDeclaredMethod("isArgument", stringType);
        isArgumentMethod.setAccessible(true);
        java.lang.Object[] isArgumentMethodArguments = new java.lang.Object[1];
        isArgumentMethodArguments[0] = string;
        boolean actual = ((Boolean) isArgumentMethod.invoke(defaultParser, isArgumentMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isArgument(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isArgument(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !isOption(token) || isNegativeNumber(token);
 *  */
    @Test
    public void testIsArgument_ThrowNullPointerException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.isArgument] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.isLongOption(DefaultParser.java:305)
            org.apache.commons.cli.DefaultParser.isOption(DefaultParser.java:284)
            org.apache.commons.cli.DefaultParser.isArgument(DefaultParser.java:256) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isArgumentMethod = defaultParserClazz.getDeclaredMethod("isArgument", stringType);
        isArgumentMethod.setAccessible(true);
        java.lang.Object[] isArgumentMethodArguments = new java.lang.Object[1];
        isArgumentMethodArguments[0] = ((Object) null);
        try {
            isArgumentMethod.invoke(defaultParser, isArgumentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isArgument(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !isOption(token) || isNegativeNumber(token);
 *  */
    @Test
    public void testIsArgument_ThrowNullPointerException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "- ";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.isArgument] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.isLongOption(DefaultParser.java:313)
            org.apache.commons.cli.DefaultParser.isOption(DefaultParser.java:284)
            org.apache.commons.cli.DefaultParser.isArgument(DefaultParser.java:256) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isArgumentMethod = defaultParserClazz.getDeclaredMethod("isArgument", stringType);
        isArgumentMethod.setAccessible(true);
        java.lang.Object[] isArgumentMethodArguments = new java.lang.Object[1];
        isArgumentMethodArguments[0] = string;
        try {
            isArgumentMethod.invoke(defaultParser, isArgumentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isArgument(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !isOption(token) || isNegativeNumber(token);
 *  */
    @Test
    public void testIsArgument_ThrowNullPointerException_2() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "-=";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.isArgument] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.isLongOption(DefaultParser.java:313)
            org.apache.commons.cli.DefaultParser.isOption(DefaultParser.java:284)
            org.apache.commons.cli.DefaultParser.isArgument(DefaultParser.java:256) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isArgumentMethod = defaultParserClazz.getDeclaredMethod("isArgument", stringType);
        isArgumentMethod.setAccessible(true);
        java.lang.Object[] isArgumentMethodArguments = new java.lang.Object[1];
        isArgumentMethodArguments[0] = string;
        try {
            isArgumentMethod.invoke(defaultParser, isArgumentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.checkRequiredArgs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkRequiredArgs()
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#checkRequiredArgs()}
 * @utbot.executesCondition {@code (currentOption != null): False}
 *  */
    @Test
    public void testCheckRequiredArgs_CurrentOptionEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, ParseException  {
        DefaultParser defaultParser = new DefaultParser();
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Method checkRequiredArgsMethod = defaultParserClazz.getDeclaredMethod("checkRequiredArgs");
        checkRequiredArgsMethod.setAccessible(true);
        java.lang.Object[] checkRequiredArgsMethodArguments = new java.lang.Object[0];
        checkRequiredArgsMethod.invoke(defaultParser, checkRequiredArgsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#checkRequiredArgs()}
 * @utbot.executesCondition {@code (currentOption != null): True}
 *  */
    @Test
    public void testCheckRequiredArgs_CurrentOptionNotEqualsNull() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        currentOption.setOptionalArg(true);
        defaultParser.currentOption = currentOption;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Method checkRequiredArgsMethod = defaultParserClazz.getDeclaredMethod("checkRequiredArgs");
        checkRequiredArgsMethod.setAccessible(true);
        java.lang.Object[] checkRequiredArgsMethodArguments = new java.lang.Object[0];
        checkRequiredArgsMethod.invoke(defaultParser, checkRequiredArgsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#checkRequiredArgs()}
 * @utbot.executesCondition {@code (currentOption != null): True}
 *  */
    @Test
    public void testCheckRequiredArgs_CurrentOptionNotEqualsNull_1() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        defaultParser.currentOption = currentOption;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Method checkRequiredArgsMethod = defaultParserClazz.getDeclaredMethod("checkRequiredArgs");
        checkRequiredArgsMethod.setAccessible(true);
        java.lang.Object[] checkRequiredArgsMethodArguments = new java.lang.Object[0];
        checkRequiredArgsMethod.invoke(defaultParser, checkRequiredArgsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#checkRequiredArgs()}
 * @utbot.executesCondition {@code (currentOption != null): True}
 *  */
    @Test
    public void testCheckRequiredArgs_CurrentOptionNotEqualsNull_2() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(currentOption, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        ArrayList values = new ArrayList();
        values.add(null);
        setField(currentOption, "org.apache.commons.cli.Option", "values", values);
        defaultParser.currentOption = currentOption;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Method checkRequiredArgsMethod = defaultParserClazz.getDeclaredMethod("checkRequiredArgs");
        checkRequiredArgsMethod.setAccessible(true);
        java.lang.Object[] checkRequiredArgsMethodArguments = new java.lang.Object[0];
        checkRequiredArgsMethod.invoke(defaultParser, checkRequiredArgsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#checkRequiredArgs()}
 * @utbot.executesCondition {@code (currentOption != null): True}
 *  */
    @Test
    public void testCheckRequiredArgs_CurrentOptionNotEqualsNull_3() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(currentOption, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        values.add(null);
        setField(currentOption, "org.apache.commons.cli.Option", "values", values);
        defaultParser.currentOption = currentOption;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Method checkRequiredArgsMethod = defaultParserClazz.getDeclaredMethod("checkRequiredArgs");
        checkRequiredArgsMethod.setAccessible(true);
        java.lang.Object[] checkRequiredArgsMethodArguments = new java.lang.Object[0];
        checkRequiredArgsMethod.invoke(defaultParser, checkRequiredArgsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method checkRequiredArgs()
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#checkRequiredArgs()}
 * @utbot.throwsException {@link org.apache.commons.cli.MissingArgumentException} when: currentOption != null && currentOption.requiresArg()
 *  */
    @Test(expected = MissingArgumentException.class)
    public void testCheckRequiredArgs_ThrowMissingArgumentException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(currentOption, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        ArrayList values = new ArrayList();
        setField(currentOption, "org.apache.commons.cli.Option", "values", values);
        defaultParser.currentOption = currentOption;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Method checkRequiredArgsMethod = defaultParserClazz.getDeclaredMethod("checkRequiredArgs");
        checkRequiredArgsMethod.setAccessible(true);
        java.lang.Object[] checkRequiredArgsMethodArguments = new java.lang.Object[0];
        try {
            checkRequiredArgsMethod.invoke(defaultParser, checkRequiredArgsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#checkRequiredArgs()}
 * @utbot.throwsException {@link org.apache.commons.cli.MissingArgumentException} when: currentOption != null && currentOption.requiresArg()
 *  */
    @Test(expected = MissingArgumentException.class)
    public void testCheckRequiredArgs_ThrowMissingArgumentException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(currentOption, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        setField(currentOption, "org.apache.commons.cli.Option", "values", values);
        defaultParser.currentOption = currentOption;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Method checkRequiredArgsMethod = defaultParserClazz.getDeclaredMethod("checkRequiredArgs");
        checkRequiredArgsMethod.setAccessible(true);
        java.lang.Object[] checkRequiredArgsMethodArguments = new java.lang.Object[0];
        try {
            checkRequiredArgsMethod.invoke(defaultParser, checkRequiredArgsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.handleLongOption
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleLongOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleLongOption(java.lang.String)}
 * @utbot.executesCondition {@code (token.indexOf('=') == -1): True}
 * @utbot.invokes org.apache.commons.cli.DefaultParser#handleLongOptionWithoutEqual(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handleLongOptionWithoutEqual(token);
 *  */
    @Test
    public void testHandleLongOption_ThrowNullPointerException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleLongOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleLongOptionWithoutEqual(DefaultParser.java:384)
            org.apache.commons.cli.DefaultParser.handleLongOption(DefaultParser.java:364) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleLongOptionMethod = defaultParserClazz.getDeclaredMethod("handleLongOption", stringType);
        handleLongOptionMethod.setAccessible(true);
        java.lang.Object[] handleLongOptionMethodArguments = new java.lang.Object[1];
        handleLongOptionMethodArguments[0] = string;
        try {
            handleLongOptionMethod.invoke(defaultParser, handleLongOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleLongOption(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: token.indexOf('=') == -1
 *  */
    @Test
    public void testHandleLongOption_ThrowNullPointerException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleLongOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleLongOption(DefaultParser.java:362) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleLongOptionMethod = defaultParserClazz.getDeclaredMethod("handleLongOption", stringType);
        handleLongOptionMethod.setAccessible(true);
        java.lang.Object[] handleLongOptionMethodArguments = new java.lang.Object[1];
        handleLongOptionMethodArguments[0] = ((Object) null);
        try {
            handleLongOptionMethod.invoke(defaultParser, handleLongOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleLongOption(java.lang.String)}
 * @utbot.executesCondition {@code (token.indexOf('=') == -1): False}
 * @utbot.invokes org.apache.commons.cli.DefaultParser#handleLongOptionWithEqual(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handleLongOptionWithEqual(token);
 *  */
    @Test
    public void testHandleLongOption_ThrowNullPointerException_2() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "=";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleLongOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleLongOptionWithEqual(DefaultParser.java:417)
            org.apache.commons.cli.DefaultParser.handleLongOption(DefaultParser.java:368) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleLongOptionMethod = defaultParserClazz.getDeclaredMethod("handleLongOption", stringType);
        handleLongOptionMethod.setAccessible(true);
        java.lang.Object[] handleLongOptionMethodArguments = new java.lang.Object[1];
        handleLongOptionMethodArguments[0] = string;
        try {
            handleLongOptionMethod.invoke(defaultParser, handleLongOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.handleToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method handleToken(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (skipParsing): True}
    /// invoke:
    ///     {@link org.apache.commons.cli.CommandLine#addArg(java.lang.String)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleToken(java.lang.String)}
 * @utbot.executesCondition {@code (currentOption != null): False}
 *  */
    @Test
    public void testHandleToken_CurrentOptionEqualsNull() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        CommandLine cmd = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        ArrayList args = new ArrayList();
        args.add(null);
        args.add(null);
        args.add(null);
        setField(cmd, "org.apache.commons.cli.CommandLine", "args", args);
        defaultParser.cmd = cmd;
        String currentToken = "";
        defaultParser.currentToken = currentToken;
        defaultParser.skipParsing = true;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleTokenMethod = defaultParserClazz.getDeclaredMethod("handleToken", stringType);
        handleTokenMethod.setAccessible(true);
        java.lang.Object[] handleTokenMethodArguments = new java.lang.Object[1];
        handleTokenMethodArguments[0] = ((Object) null);
        handleTokenMethod.invoke(defaultParser, handleTokenMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleToken(java.lang.String)}
 * @utbot.executesCondition {@code (currentOption != null): True}
 * @utbot.executesCondition {@code (!currentOption.acceptsArg()): False}
 *  */
    @Test
    public void testHandleToken_CurrentOptionAcceptsArg() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        CommandLine cmd = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        ArrayList args = new ArrayList();
        args.add(null);
        args.add(null);
        args.add(null);
        setField(cmd, "org.apache.commons.cli.CommandLine", "args", args);
        defaultParser.cmd = cmd;
        String currentToken = "";
        defaultParser.currentToken = currentToken;
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(currentOption, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        defaultParser.currentOption = currentOption;
        defaultParser.skipParsing = true;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleTokenMethod = defaultParserClazz.getDeclaredMethod("handleToken", stringType);
        handleTokenMethod.setAccessible(true);
        java.lang.Object[] handleTokenMethodArguments = new java.lang.Object[1];
        handleTokenMethodArguments[0] = ((Object) null);
        handleTokenMethod.invoke(defaultParser, handleTokenMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleToken(java.lang.String)}
 * @utbot.executesCondition {@code (currentOption != null): True}
 * @utbot.executesCondition {@code (!currentOption.acceptsArg()): False}
 *  */
    @Test
    public void testHandleToken_CurrentOptionAcceptsArg_1() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        CommandLine cmd = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        ArrayList args = new ArrayList();
        args.add(null);
        args.add(null);
        args.add(null);
        setField(cmd, "org.apache.commons.cli.CommandLine", "args", args);
        defaultParser.cmd = cmd;
        String currentToken = "";
        defaultParser.currentToken = currentToken;
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        currentOption.setOptionalArg(true);
        defaultParser.currentOption = currentOption;
        defaultParser.skipParsing = true;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleTokenMethod = defaultParserClazz.getDeclaredMethod("handleToken", stringType);
        handleTokenMethod.setAccessible(true);
        java.lang.Object[] handleTokenMethodArguments = new java.lang.Object[1];
        handleTokenMethodArguments[0] = ((Object) null);
        handleTokenMethod.invoke(defaultParser, handleTokenMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleToken(java.lang.String)}
 * @utbot.executesCondition {@code (currentOption != null): True}
 * @utbot.executesCondition {@code (!currentOption.acceptsArg()): True}
 *  */
    @Test
    public void testHandleToken_NotCurrentOptionAcceptsArg() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        CommandLine cmd = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        ArrayList args = new ArrayList();
        args.add(null);
        args.add(null);
        args.add(null);
        setField(cmd, "org.apache.commons.cli.CommandLine", "args", args);
        defaultParser.cmd = cmd;
        String currentToken = "";
        defaultParser.currentToken = currentToken;
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        defaultParser.currentOption = currentOption;
        defaultParser.skipParsing = true;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleTokenMethod = defaultParserClazz.getDeclaredMethod("handleToken", stringType);
        handleTokenMethod.setAccessible(true);
        java.lang.Object[] handleTokenMethodArguments = new java.lang.Object[1];
        handleTokenMethodArguments[0] = ((Object) null);
        handleTokenMethod.invoke(defaultParser, handleTokenMethodArguments);
        
        Option finalDefaultParserCurrentOption = defaultParser.currentOption;
        
        assertNull(finalDefaultParserCurrentOption);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleToken(java.lang.String)}
 * @utbot.executesCondition {@code (currentOption != null): True}
 * @utbot.executesCondition {@code (!currentOption.acceptsArg()): False}
 *  */
    @Test
    public void testHandleToken_CurrentOptionAcceptsArg_2() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        CommandLine cmd = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        ArrayList args = new ArrayList();
        args.add(null);
        args.add(null);
        args.add(null);
        args.add(null);
        args.add(null);
        args.add(null);
        args.add(null);
        setField(cmd, "org.apache.commons.cli.CommandLine", "args", args);
        defaultParser.cmd = cmd;
        String currentToken = "";
        defaultParser.currentToken = currentToken;
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(currentOption, "org.apache.commons.cli.Option", "numberOfArgs", 9);
        setField(currentOption, "org.apache.commons.cli.Option", "values", args);
        defaultParser.currentOption = currentOption;
        defaultParser.skipParsing = true;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleTokenMethod = defaultParserClazz.getDeclaredMethod("handleToken", stringType);
        handleTokenMethod.setAccessible(true);
        java.lang.Object[] handleTokenMethodArguments = new java.lang.Object[1];
        handleTokenMethodArguments[0] = ((Object) null);
        handleTokenMethod.invoke(defaultParser, handleTokenMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method handleToken(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleToken(java.lang.String)}
 * @utbot.executesCondition {@code (skipParsing): False}
 * @utbot.executesCondition {@code ("--".equals(token)): True}
 * @utbot.executesCondition {@code (currentOption != null): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testHandleToken_CurrentOptionEqualsNull_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, ParseException  {
        DefaultParser defaultParser = new DefaultParser();
        defaultParser.skipParsing = false;
        String string = "--";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleTokenMethod = defaultParserClazz.getDeclaredMethod("handleToken", stringType);
        handleTokenMethod.setAccessible(true);
        java.lang.Object[] handleTokenMethodArguments = new java.lang.Object[1];
        handleTokenMethodArguments[0] = string;
        handleTokenMethod.invoke(defaultParser, handleTokenMethodArguments);
        
        boolean finalDefaultParserSkipParsing = defaultParser.skipParsing;
        
        assertTrue(finalDefaultParserSkipParsing);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleToken(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleToken(java.lang.String)}
 * @utbot.executesCondition {@code (skipParsing): False}
 * @utbot.executesCondition {@code ("--".equals(token)): False}
 * @utbot.executesCondition {@code (currentOption != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: token.startsWith("--")
 *  */
    @Test
    public void testHandleToken_ThrowNullPointerException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        defaultParser.skipParsing = false;
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleToken(DefaultParser.java:230) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleTokenMethod = defaultParserClazz.getDeclaredMethod("handleToken", stringType);
        handleTokenMethod.setAccessible(true);
        java.lang.Object[] handleTokenMethodArguments = new java.lang.Object[1];
        handleTokenMethodArguments[0] = ((Object) null);
        try {
            handleTokenMethod.invoke(defaultParser, handleTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleToken(java.lang.String)}
 * @utbot.executesCondition {@code (skipParsing): True}
 * @utbot.invokes {@link org.apache.commons.cli.CommandLine#addArg(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cmd.addArg(token);
 *  */
    @Test
    public void testHandleToken_ThrowNullPointerException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        defaultParser.skipParsing = true;
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleToken(DefaultParser.java:220) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleTokenMethod = defaultParserClazz.getDeclaredMethod("handleToken", stringType);
        handleTokenMethod.setAccessible(true);
        java.lang.Object[] handleTokenMethodArguments = new java.lang.Object[1];
        handleTokenMethodArguments[0] = ((Object) null);
        try {
            handleTokenMethod.invoke(defaultParser, handleTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleToken(java.lang.String)}
 * @utbot.executesCondition {@code (skipParsing): False}
 * @utbot.executesCondition {@code ("--".equals(token)): False}
 * @utbot.executesCondition {@code (currentOption != null): False}
 * @utbot.executesCondition {@code (token.startsWith("--")): True}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.invokes org.apache.commons.cli.DefaultParser#handleLongOption(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handleLongOption(token);
 *  */
    @Test
    public void testHandleToken_ThrowNullPointerException_5() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        defaultParser.skipParsing = false;
        String string = "-- ";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleLongOptionWithoutEqual(DefaultParser.java:384)
            org.apache.commons.cli.DefaultParser.handleLongOption(DefaultParser.java:364)
            org.apache.commons.cli.DefaultParser.handleToken(DefaultParser.java:232) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleTokenMethod = defaultParserClazz.getDeclaredMethod("handleToken", stringType);
        handleTokenMethod.setAccessible(true);
        java.lang.Object[] handleTokenMethodArguments = new java.lang.Object[1];
        handleTokenMethodArguments[0] = string;
        try {
            handleTokenMethod.invoke(defaultParser, handleTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleToken(java.lang.String)}
 * @utbot.executesCondition {@code (skipParsing): False}
 * @utbot.executesCondition {@code ("--".equals(token)): False}
 * @utbot.executesCondition {@code (currentOption != null): True}
 * @utbot.executesCondition {@code (currentOption.acceptsArg()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: token.startsWith("--")
 *  */
    @Test
    public void testHandleToken_ThrowNullPointerException_2() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        defaultParser.currentOption = currentOption;
        defaultParser.skipParsing = false;
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleToken(DefaultParser.java:230) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleTokenMethod = defaultParserClazz.getDeclaredMethod("handleToken", stringType);
        handleTokenMethod.setAccessible(true);
        java.lang.Object[] handleTokenMethodArguments = new java.lang.Object[1];
        handleTokenMethodArguments[0] = ((Object) null);
        try {
            handleTokenMethod.invoke(defaultParser, handleTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleToken(java.lang.String)}
 * @utbot.executesCondition {@code (skipParsing): False}
 * @utbot.executesCondition {@code ("--".equals(token)): False}
 * @utbot.executesCondition {@code (currentOption != null): True}
 * @utbot.executesCondition {@code (currentOption.acceptsArg()): True}
 * @utbot.invokes org.apache.commons.cli.DefaultParser#isArgument(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} when: currentOption != null && currentOption.acceptsArg() && isArgument(token)
 *  */
    @Test
    public void testHandleToken_ThrowNullPointerException_4() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String currentToken = "";
        defaultParser.currentToken = currentToken;
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(currentOption, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        setField(currentOption, "org.apache.commons.cli.Option", "values", values);
        defaultParser.currentOption = currentOption;
        defaultParser.skipParsing = false;
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.isLongOption(DefaultParser.java:305)
            org.apache.commons.cli.DefaultParser.isOption(DefaultParser.java:284)
            org.apache.commons.cli.DefaultParser.isArgument(DefaultParser.java:256)
            org.apache.commons.cli.DefaultParser.handleToken(DefaultParser.java:226) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleTokenMethod = defaultParserClazz.getDeclaredMethod("handleToken", stringType);
        handleTokenMethod.setAccessible(true);
        java.lang.Object[] handleTokenMethodArguments = new java.lang.Object[1];
        handleTokenMethodArguments[0] = ((Object) null);
        try {
            handleTokenMethod.invoke(defaultParser, handleTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleToken(java.lang.String)}
 * @utbot.executesCondition {@code (skipParsing): False}
 * @utbot.executesCondition {@code ("--".equals(token)): False}
 * @utbot.executesCondition {@code (currentOption != null): True}
 * @utbot.executesCondition {@code (currentOption.acceptsArg()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: token.startsWith("--")
 *  */
    @Test
    public void testHandleToken_ThrowNullPointerException_3() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String currentToken = "";
        defaultParser.currentToken = currentToken;
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(currentOption, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        values.add(null);
        setField(currentOption, "org.apache.commons.cli.Option", "values", values);
        defaultParser.currentOption = currentOption;
        defaultParser.skipParsing = false;
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleToken(DefaultParser.java:230) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleTokenMethod = defaultParserClazz.getDeclaredMethod("handleToken", stringType);
        handleTokenMethod.setAccessible(true);
        java.lang.Object[] handleTokenMethodArguments = new java.lang.Object[1];
        handleTokenMethodArguments[0] = ((Object) null);
        try {
            handleTokenMethod.invoke(defaultParser, handleTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method handleToken(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.DefaultParser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleToken(java.lang.String)}
     */
    @Test
    public void testHandleTokenThrowsNPEWithNonEmptyString() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleUnknownToken(DefaultParser.java:343)
            org.apache.commons.cli.DefaultParser.handleToken(DefaultParser.java:240) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleTokenMethod = defaultParserClazz.getDeclaredMethod("handleToken", stringType);
        handleTokenMethod.setAccessible(true);
        java.lang.Object[] handleTokenMethodArguments = new java.lang.Object[1];
        handleTokenMethodArguments[0] = "ZX";
        try {
            handleTokenMethod.invoke(defaultParser, handleTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.handleUnknownToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleUnknownToken(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleUnknownToken(java.lang.String)}
 * @utbot.executesCondition {@code (stopAtNonOption): False}
 *  */
    @Test
    public void testHandleUnknownToken_NotStopAtNonOption() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        CommandLine cmd = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        ArrayList args = new ArrayList();
        args.add(null);
        args.add(null);
        args.add(null);
        setField(cmd, "org.apache.commons.cli.CommandLine", "args", args);
        defaultParser.cmd = cmd;
        defaultParser.stopAtNonOption = false;
        String string = "";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleUnknownTokenMethod = defaultParserClazz.getDeclaredMethod("handleUnknownToken", stringType);
        handleUnknownTokenMethod.setAccessible(true);
        java.lang.Object[] handleUnknownTokenMethodArguments = new java.lang.Object[1];
        handleUnknownTokenMethodArguments[0] = string;
        handleUnknownTokenMethod.invoke(defaultParser, handleUnknownTokenMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleUnknownToken(java.lang.String)}
 * @utbot.executesCondition {@code (stopAtNonOption): True}
 *  */
    @Test
    public void testHandleUnknownToken_StopAtNonOption() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        CommandLine cmd = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        ArrayList args = new ArrayList();
        args.add(null);
        args.add(null);
        args.add(null);
        setField(cmd, "org.apache.commons.cli.CommandLine", "args", args);
        defaultParser.cmd = cmd;
        defaultParser.stopAtNonOption = true;
        defaultParser.skipParsing = false;
        String string = "";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleUnknownTokenMethod = defaultParserClazz.getDeclaredMethod("handleUnknownToken", stringType);
        handleUnknownTokenMethod.setAccessible(true);
        java.lang.Object[] handleUnknownTokenMethodArguments = new java.lang.Object[1];
        handleUnknownTokenMethodArguments[0] = string;
        handleUnknownTokenMethod.invoke(defaultParser, handleUnknownTokenMethodArguments);
        
        boolean finalDefaultParserSkipParsing = defaultParser.skipParsing;
        
        assertTrue(finalDefaultParserSkipParsing);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleUnknownToken(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleUnknownToken(java.lang.String)}
 * @utbot.executesCondition {@code (token.startsWith("-")): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cmd.addArg(token);
 *  */
    @Test
    public void testHandleUnknownToken_ThrowNullPointerException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleUnknownToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleUnknownToken(DefaultParser.java:343) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleUnknownTokenMethod = defaultParserClazz.getDeclaredMethod("handleUnknownToken", stringType);
        handleUnknownTokenMethod.setAccessible(true);
        java.lang.Object[] handleUnknownTokenMethodArguments = new java.lang.Object[1];
        handleUnknownTokenMethodArguments[0] = string;
        try {
            handleUnknownTokenMethod.invoke(defaultParser, handleUnknownTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleUnknownToken(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: token.startsWith("-") && token.length() > 1 && !stopAtNonOption
 *  */
    @Test
    public void testHandleUnknownToken_ThrowNullPointerException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleUnknownToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleUnknownToken(DefaultParser.java:338) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleUnknownTokenMethod = defaultParserClazz.getDeclaredMethod("handleUnknownToken", stringType);
        handleUnknownTokenMethod.setAccessible(true);
        java.lang.Object[] handleUnknownTokenMethodArguments = new java.lang.Object[1];
        handleUnknownTokenMethodArguments[0] = ((Object) null);
        try {
            handleUnknownTokenMethod.invoke(defaultParser, handleUnknownTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleUnknownToken(java.lang.String)}
 * @utbot.executesCondition {@code (token.startsWith("-")): True}
 * @utbot.executesCondition {@code (token.length() > 1): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cmd.addArg(token);
 *  */
    @Test
    public void testHandleUnknownToken_ThrowNullPointerException_2() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "-";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleUnknownToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleUnknownToken(DefaultParser.java:343) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleUnknownTokenMethod = defaultParserClazz.getDeclaredMethod("handleUnknownToken", stringType);
        handleUnknownTokenMethod.setAccessible(true);
        java.lang.Object[] handleUnknownTokenMethodArguments = new java.lang.Object[1];
        handleUnknownTokenMethodArguments[0] = string;
        try {
            handleUnknownTokenMethod.invoke(defaultParser, handleUnknownTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleUnknownToken(java.lang.String)}
 * @utbot.executesCondition {@code (token.startsWith("-")): True}
 * @utbot.executesCondition {@code (token.length() > 1): True}
 * @utbot.executesCondition {@code (!stopAtNonOption): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cmd.addArg(token);
 *  */
    @Test
    public void testHandleUnknownToken_ThrowNullPointerException_3() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        defaultParser.stopAtNonOption = true;
        String string = "- ";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleUnknownToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleUnknownToken(DefaultParser.java:343) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleUnknownTokenMethod = defaultParserClazz.getDeclaredMethod("handleUnknownToken", stringType);
        handleUnknownTokenMethod.setAccessible(true);
        java.lang.Object[] handleUnknownTokenMethodArguments = new java.lang.Object[1];
        handleUnknownTokenMethodArguments[0] = string;
        try {
            handleUnknownTokenMethod.invoke(defaultParser, handleUnknownTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method handleUnknownToken(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleUnknownToken(java.lang.String)}
 * @utbot.executesCondition {@code (token.startsWith("-")): True}
 * @utbot.executesCondition {@code (token.length() > 1): True}
 * @utbot.executesCondition {@code (!stopAtNonOption): True}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link org.apache.commons.cli.UnrecognizedOptionException} when: token.startsWith("-") && token.length() > 1 && !stopAtNonOption
 *  */
    @Test(expected = UnrecognizedOptionException.class)
    public void testHandleUnknownToken_ThrowUnrecognizedOptionException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        defaultParser.stopAtNonOption = false;
        String string = "- ";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method handleUnknownTokenMethod = defaultParserClazz.getDeclaredMethod("handleUnknownToken", stringType);
        handleUnknownTokenMethod.setAccessible(true);
        java.lang.Object[] handleUnknownTokenMethodArguments = new java.lang.Object[1];
        handleUnknownTokenMethodArguments[0] = string;
        try {
            handleUnknownTokenMethod.invoke(defaultParser, handleUnknownTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.getLongPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLongPrefix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#getLongPrefix(java.lang.String)}
 * @utbot.returnsFrom {@code return opt;}
 *  */
    @Test
    public void testGetLongPrefix_ReturnOpt() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method getLongPrefixMethod = defaultParserClazz.getDeclaredMethod("getLongPrefix", stringType);
        getLongPrefixMethod.setAccessible(true);
        java.lang.Object[] getLongPrefixMethodArguments = new java.lang.Object[1];
        getLongPrefixMethodArguments[0] = string;
        String actual = ((String) getLongPrefixMethod.invoke(defaultParser, getLongPrefixMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#getLongPrefix(java.lang.String)}
 * @utbot.returnsFrom {@code return opt;}
 *  */
    @Test
    public void testGetLongPrefix_ReturnOpt_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "--  ";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method getLongPrefixMethod = defaultParserClazz.getDeclaredMethod("getLongPrefix", stringType);
        getLongPrefixMethod.setAccessible(true);
        java.lang.Object[] getLongPrefixMethodArguments = new java.lang.Object[1];
        getLongPrefixMethodArguments[0] = string;
        String actual = ((String) getLongPrefixMethod.invoke(defaultParser, getLongPrefixMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#getLongPrefix(java.lang.String)}
 * @utbot.returnsFrom {@code return opt;}
 *  */
    @Test
    public void testGetLongPrefix_ReturnOpt_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "-";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method getLongPrefixMethod = defaultParserClazz.getDeclaredMethod("getLongPrefix", stringType);
        getLongPrefixMethod.setAccessible(true);
        java.lang.Object[] getLongPrefixMethodArguments = new java.lang.Object[1];
        getLongPrefixMethodArguments[0] = string;
        String actual = ((String) getLongPrefixMethod.invoke(defaultParser, getLongPrefixMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#getLongPrefix(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(i = t.length() - 2; i > 1; i--)} once
 * @utbot.returnsFrom {@code return opt;}
 *  */
    @Test
    public void testGetLongPrefix_NotOptionsHasLongOption() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "longOpts", longOpts);
        defaultParser.options = options;
        String string = "----  ";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method getLongPrefixMethod = defaultParserClazz.getDeclaredMethod("getLongPrefix", stringType);
        getLongPrefixMethod.setAccessible(true);
        java.lang.Object[] getLongPrefixMethodArguments = new java.lang.Object[1];
        getLongPrefixMethodArguments[0] = string;
        String actual = ((String) getLongPrefixMethod.invoke(defaultParser, getLongPrefixMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLongPrefix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#getLongPrefix(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(i = t.length() - 2; i > 1; i--)
 *  */
    @Test
    public void testGetLongPrefix_ThrowNullPointerException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.getLongPrefix] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.getLongPrefix(DefaultParser.java:563) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method getLongPrefixMethod = defaultParserClazz.getDeclaredMethod("getLongPrefix", stringType);
        getLongPrefixMethod.setAccessible(true);
        java.lang.Object[] getLongPrefixMethodArguments = new java.lang.Object[1];
        getLongPrefixMethodArguments[0] = ((Object) null);
        try {
            getLongPrefixMethod.invoke(defaultParser, getLongPrefixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#getLongPrefix(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.iterates iterate the loop {@code for(i = t.length() - 2; i > 1; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.hasLongOption(prefix)
 *  */
    @Test
    public void testGetLongPrefix_ThrowNullPointerException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "--                               ";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.getLongPrefix] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.getLongPrefix(DefaultParser.java:566) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method getLongPrefixMethod = defaultParserClazz.getDeclaredMethod("getLongPrefix", stringType);
        getLongPrefixMethod.setAccessible(true);
        java.lang.Object[] getLongPrefixMethodArguments = new java.lang.Object[1];
        getLongPrefixMethodArguments[0] = string;
        try {
            getLongPrefixMethod.invoke(defaultParser, getLongPrefixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.isJavaProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isJavaProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isJavaProperty(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link org.apache.commons.cli.Options#getOption(java.lang.String)}
 * @utbot.returnsFrom {@code return option != null && (option.getArgs() >= 2 || option.getArgs() == Option.UNLIMITED_VALUES);}
 *  */
    @Test
    public void testIsJavaProperty_OptionEqualsNullAndOptionGetArgsLessThan2OrOptionGetArgsEqualsOptionUNLIMITED_VALUES() throws Exception  {
        DefaultParser defaultParser = new DefaultParser();
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        defaultParser.options = options;
        String string = " ";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isJavaPropertyMethod = defaultParserClazz.getDeclaredMethod("isJavaProperty", stringType);
        isJavaPropertyMethod.setAccessible(true);
        java.lang.Object[] isJavaPropertyMethodArguments = new java.lang.Object[1];
        isJavaPropertyMethodArguments[0] = string;
        boolean actual = ((Boolean) isJavaPropertyMethod.invoke(defaultParser, isJavaPropertyMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isJavaProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isJavaProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String opt = token.substring(0, 1);
 *  */
    @Test
    public void testIsJavaProperty_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.isJavaProperty] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end 1, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.cli.DefaultParser.isJavaProperty(DefaultParser.java:581) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isJavaPropertyMethod = defaultParserClazz.getDeclaredMethod("isJavaProperty", stringType);
        isJavaPropertyMethod.setAccessible(true);
        java.lang.Object[] isJavaPropertyMethodArguments = new java.lang.Object[1];
        isJavaPropertyMethodArguments[0] = string;
        try {
            isJavaPropertyMethod.invoke(defaultParser, isJavaPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isJavaProperty(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.cli.Options#getOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Option option = options.getOption(opt);
 *  */
    @Test
    public void testIsJavaProperty_ThrowNullPointerException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = " ";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.isJavaProperty] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.isJavaProperty(DefaultParser.java:582) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isJavaPropertyMethod = defaultParserClazz.getDeclaredMethod("isJavaProperty", stringType);
        isJavaPropertyMethod.setAccessible(true);
        java.lang.Object[] isJavaPropertyMethodArguments = new java.lang.Object[1];
        isJavaPropertyMethodArguments[0] = string;
        try {
            isJavaPropertyMethod.invoke(defaultParser, isJavaPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isJavaProperty(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String opt = token.substring(0, 1);
 *  */
    @Test
    public void testIsJavaProperty_ThrowNullPointerException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.isJavaProperty] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.isJavaProperty(DefaultParser.java:581) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isJavaPropertyMethod = defaultParserClazz.getDeclaredMethod("isJavaProperty", stringType);
        isJavaPropertyMethod.setAccessible(true);
        java.lang.Object[] isJavaPropertyMethodArguments = new java.lang.Object[1];
        isJavaPropertyMethodArguments[0] = ((Object) null);
        try {
            isJavaPropertyMethod.invoke(defaultParser, isJavaPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.handleOption
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleOption(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: option = (Option) option.clone();
 *  */
    @Test
    public void testHandleOption_ThrowNullPointerException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleOption(DefaultParser.java:592) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method handleOptionMethod = defaultParserClazz.getDeclaredMethod("handleOption", optionType);
        handleOptionMethod.setAccessible(true);
        java.lang.Object[] handleOptionMethodArguments = new java.lang.Object[1];
        handleOptionMethodArguments[0] = ((Object) null);
        try {
            handleOptionMethod.invoke(defaultParser, handleOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleOption(org.apache.commons.cli.Option)}
 * @utbot.invokes {@link org.apache.commons.cli.Option#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: option = (Option) option.clone();
 *  */
    @Test
    public void testHandleOption_ThrowNullPointerException_2() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        currentOption.setOptionalArg(true);
        defaultParser.currentOption = currentOption;
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleOption] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayList.<init>(ArrayList.java:181)
            org.apache.commons.cli.Option.clone(Option.java:643)
            org.apache.commons.cli.DefaultParser.handleOption(DefaultParser.java:592) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method handleOptionMethod = defaultParserClazz.getDeclaredMethod("handleOption", optionType);
        handleOptionMethod.setAccessible(true);
        java.lang.Object[] handleOptionMethodArguments = new java.lang.Object[1];
        handleOptionMethodArguments[0] = option;
        try {
            handleOptionMethod.invoke(defaultParser, handleOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: option = (Option) option.clone();
 *  */
    @Test
    public void testHandleOption_ThrowNullPointerException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        currentOption.setOptionalArg(true);
        defaultParser.currentOption = currentOption;
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleOption(DefaultParser.java:592) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method handleOptionMethod = defaultParserClazz.getDeclaredMethod("handleOption", optionType);
        handleOptionMethod.setAccessible(true);
        java.lang.Object[] handleOptionMethodArguments = new java.lang.Object[1];
        handleOptionMethodArguments[0] = ((Object) null);
        try {
            handleOptionMethod.invoke(defaultParser, handleOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: option = (Option) option.clone();
 *  */
    @Test
    public void testHandleOption_ThrowNullPointerException_4() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        defaultParser.currentOption = currentOption;
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleOption(DefaultParser.java:592) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method handleOptionMethod = defaultParserClazz.getDeclaredMethod("handleOption", optionType);
        handleOptionMethod.setAccessible(true);
        java.lang.Object[] handleOptionMethodArguments = new java.lang.Object[1];
        handleOptionMethodArguments[0] = ((Object) null);
        try {
            handleOptionMethod.invoke(defaultParser, handleOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: option = (Option) option.clone();
 *  */
    @Test
    public void testHandleOption_ThrowNullPointerException_3() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(currentOption, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        ArrayList values = new ArrayList();
        values.add(null);
        setField(currentOption, "org.apache.commons.cli.Option", "values", values);
        defaultParser.currentOption = currentOption;
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleOption(DefaultParser.java:592) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method handleOptionMethod = defaultParserClazz.getDeclaredMethod("handleOption", optionType);
        handleOptionMethod.setAccessible(true);
        java.lang.Object[] handleOptionMethodArguments = new java.lang.Object[1];
        handleOptionMethodArguments[0] = ((Object) null);
        try {
            handleOptionMethod.invoke(defaultParser, handleOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: option = (Option) option.clone();
 *  */
    @Test
    public void testHandleOption_ThrowNullPointerException_5() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(currentOption, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        values.add(null);
        setField(currentOption, "org.apache.commons.cli.Option", "values", values);
        defaultParser.currentOption = currentOption;
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.handleOption(DefaultParser.java:592) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method handleOptionMethod = defaultParserClazz.getDeclaredMethod("handleOption", optionType);
        handleOptionMethod.setAccessible(true);
        java.lang.Object[] handleOptionMethodArguments = new java.lang.Object[1];
        handleOptionMethodArguments[0] = ((Object) null);
        try {
            handleOptionMethod.invoke(defaultParser, handleOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method handleOption(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link org.apache.commons.cli.MissingArgumentException} in: checkRequiredArgs();
 *  */
    @Test(expected = MissingArgumentException.class)
    public void testHandleOption_ThrowMissingArgumentException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(currentOption, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        ArrayList values = new ArrayList();
        setField(currentOption, "org.apache.commons.cli.Option", "values", values);
        defaultParser.currentOption = currentOption;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method handleOptionMethod = defaultParserClazz.getDeclaredMethod("handleOption", optionType);
        handleOptionMethod.setAccessible(true);
        java.lang.Object[] handleOptionMethodArguments = new java.lang.Object[1];
        handleOptionMethodArguments[0] = ((Object) null);
        try {
            handleOptionMethod.invoke(defaultParser, handleOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link org.apache.commons.cli.MissingArgumentException} in: checkRequiredArgs();
 *  */
    @Test(expected = MissingArgumentException.class)
    public void testHandleOption_ThrowMissingArgumentException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(currentOption, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        setField(currentOption, "org.apache.commons.cli.Option", "values", values);
        defaultParser.currentOption = currentOption;
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method handleOptionMethod = defaultParserClazz.getDeclaredMethod("handleOption", optionType);
        handleOptionMethod.setAccessible(true);
        java.lang.Object[] handleOptionMethodArguments = new java.lang.Object[1];
        handleOptionMethodArguments[0] = ((Object) null);
        try {
            handleOptionMethod.invoke(defaultParser, handleOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method handleOption(org.apache.commons.cli.Option)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.DefaultParser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#handleOption(org.apache.commons.cli.Option)}
     */
    @Test
    public void testHandleOptionThrowsNPE() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        Option option = new Option("", false, "\n\t\r");
        option.setDescription("10");
        Object object = new Object();
        option.setType(object);
        option.setArgName("10");
        option.setLongOpt("");
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.handleOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.updateRequiredOptions(DefaultParser.java:621)
            org.apache.commons.cli.DefaultParser.handleOption(DefaultParser.java:594) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class optionType = Class.forName("org.apache.commons.cli.Option");
        Method handleOptionMethod = defaultParserClazz.getDeclaredMethod("handleOption", optionType);
        handleOptionMethod.setAccessible(true);
        java.lang.Object[] handleOptionMethodArguments = new java.lang.Object[1];
        handleOptionMethodArguments[0] = option;
        try {
            handleOptionMethod.invoke(defaultParser, handleOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.DefaultParser.isOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isOption(java.lang.String)}
 * @utbot.returnsFrom {@code return isLongOption(token) || isShortOption(token);}
 *  */
    @Test
    public void testIsOption_ReturnIsLongOptionOrIsShortOption() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isOptionMethod = defaultParserClazz.getDeclaredMethod("isOption", stringType);
        isOptionMethod.setAccessible(true);
        java.lang.Object[] isOptionMethodArguments = new java.lang.Object[1];
        isOptionMethodArguments[0] = string;
        boolean actual = ((Boolean) isOptionMethod.invoke(defaultParser, isOptionMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isOption(java.lang.String)}
 * @utbot.returnsFrom {@code return isLongOption(token) || isShortOption(token);}
 *  */
    @Test
    public void testIsOption_ReturnIsLongOptionOrIsShortOption_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "-";
        
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isOptionMethod = defaultParserClazz.getDeclaredMethod("isOption", stringType);
        isOptionMethod.setAccessible(true);
        java.lang.Object[] isOptionMethodArguments = new java.lang.Object[1];
        isOptionMethodArguments[0] = string;
        boolean actual = ((Boolean) isOptionMethod.invoke(defaultParser, isOptionMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isLongOption(token) || isShortOption(token);
 *  */
    @Test
    public void testIsOption_ThrowNullPointerException() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.isOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.isLongOption(DefaultParser.java:305)
            org.apache.commons.cli.DefaultParser.isOption(DefaultParser.java:284) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isOptionMethod = defaultParserClazz.getDeclaredMethod("isOption", stringType);
        isOptionMethod.setAccessible(true);
        java.lang.Object[] isOptionMethodArguments = new java.lang.Object[1];
        isOptionMethodArguments[0] = ((Object) null);
        try {
            isOptionMethod.invoke(defaultParser, isOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isLongOption(token) || isShortOption(token);
 *  */
    @Test
    public void testIsOption_ThrowNullPointerException_1() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "- ";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.isOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.isLongOption(DefaultParser.java:313)
            org.apache.commons.cli.DefaultParser.isOption(DefaultParser.java:284) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isOptionMethod = defaultParserClazz.getDeclaredMethod("isOption", stringType);
        isOptionMethod.setAccessible(true);
        java.lang.Object[] isOptionMethodArguments = new java.lang.Object[1];
        isOptionMethodArguments[0] = string;
        try {
            isOptionMethod.invoke(defaultParser, isOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.DefaultParser#isOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isLongOption(token) || isShortOption(token);
 *  */
    @Test
    public void testIsOption_ThrowNullPointerException_2() throws Throwable  {
        DefaultParser defaultParser = new DefaultParser();
        String string = "- =     ";
        
        /* This test fails because method [org.apache.commons.cli.DefaultParser.isOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.DefaultParser.isLongOption(DefaultParser.java:313)
            org.apache.commons.cli.DefaultParser.isOption(DefaultParser.java:284) */
        Class defaultParserClazz = Class.forName("org.apache.commons.cli.DefaultParser");
        Class stringType = Class.forName("java.lang.String");
        Method isOptionMethod = defaultParserClazz.getDeclaredMethod("isOption", stringType);
        isOptionMethod.setAccessible(true);
        java.lang.Object[] isOptionMethodArguments = new java.lang.Object[1];
        isOptionMethodArguments[0] = string;
        try {
            isOptionMethod.invoke(defaultParser, isOptionMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields841162334991200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields841162334991200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass841162334998000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields841162334991200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass841162334998000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields841162335420100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields841162335420100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass841162335423900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields841162335420100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass841162335423900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

