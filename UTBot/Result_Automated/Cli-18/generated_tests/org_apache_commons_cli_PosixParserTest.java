package org.apache.commons.cli;

import org.junit.Test;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_cli_PosixParserTest {
    ///region Test suites for executable org.apache.commons.cli.PosixParser.init
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method init()
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#init()}
 * @utbot.invokes {@link java.util.List#clear()}
 *  */
    @Test
    public void testInit_ListClear() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        tokens.add(null);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", currentOption);
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Method initMethod = posixParserClazz.getDeclaredMethod("init");
        initMethod.setAccessible(true);
        java.lang.Object[] initMethodArguments = new java.lang.Object[0];
        initMethod.invoke(posixParser, initMethodArguments);
        
        Option finalPosixParserCurrentOption = ((Option) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "currentOption"));
        
        assertNull(finalPosixParserCurrentOption);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method init()
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#init()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tokens.clear();
 *  */
    @Test
    public void testInit_ThrowNullPointerException() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.init] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.init(PosixParser.java:55) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Method initMethod = posixParserClazz.getDeclaredMethod("init");
        initMethod.setAccessible(true);
        java.lang.Object[] initMethodArguments = new java.lang.Object[0];
        try {
            initMethod.invoke(posixParser, initMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.PosixParser.flatten
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flatten(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#flatten(org.apache.commons.cli.Options,java.lang.String[],boolean)}
 * @utbot.invokes org.apache.commons.cli.PosixParser#init()
 * @utbot.invokes {@link java.util.Arrays#asList(java.lang.Object[])}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#toArray(java.lang.Object[])}
 * @utbot.returnsFrom {@code return (String[]) tokens.toArray(new String[tokens.size()]);}
 *  */
    @Test
    public void testFlatten_ListToArray() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        tokens.add(null);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", currentOption);
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        java.lang.String[] stringArray = {};
        
        java.lang.String[] actual = posixParser.flatten(null, stringArray, false);
        
        java.lang.String[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Option finalPosixParserCurrentOption = ((Option) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "currentOption"));
        Options finalPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        assertNull(finalPosixParserCurrentOption);
        
        assertNull(finalPosixParserOptions);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flatten(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#flatten(org.apache.commons.cli.Options,java.lang.String[],boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: init();
 *  */
    @Test
    public void testFlatten_ThrowNullPointerException() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.init(PosixParser.java:55)
            org.apache.commons.cli.PosixParser.flatten(PosixParser.java:99) */
        posixParser.flatten(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#flatten(org.apache.commons.cli.Options,java.lang.String[],boolean)}
 * @utbot.invokes {@link java.util.Arrays#asList(java.lang.Object[])}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: token.startsWith("--")
 *  */
    @Test
    public void testFlatten_ThrowNullPointerException_1() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        tokens.add(null);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.flatten(PosixParser.java:112) */
        posixParser.flatten(null, stringArray, false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method flatten(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.PosixParser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#flatten(org.apache.commons.cli.Options,java.lang.String[],boolean)}
     */
    @Test
    public void testFlattenWithNonEmptyObjectArray() {
        PosixParser posixParser = new PosixParser();
        java.lang.String[] stringArray = {"\n\t\r", "-", ""};
        
        java.lang.String[] actual = posixParser.flatten(null, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[3];
        String string = "\n\t\r";
        expected[0] = string;
        String string1 = "-";
        expected[1] = string1;
        String string2 = "";
        expected[2] = string2;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method flatten(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    @Test
    public void testFlatten1() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = objectArray;
        objectArray[1] = objectArray;
        tokens.add(objectArray);
        tokens.add(objectArray);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", currentOption);
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        java.lang.String[] stringArray = new java.lang.String[2];
        String string = "";
        stringArray[0] = string;
        String string1 = "--\u0000\u0000\u0000\u0000";
        stringArray[1] = string1;
        
        java.lang.String[] actual = posixParser.flatten(null, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[2];
        expected[0] = string;
        expected[1] = string1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Option finalPosixParserCurrentOption = ((Option) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "currentOption"));
        Options finalPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        assertNull(finalPosixParserCurrentOption);
        
        assertNull(finalPosixParserOptions);
    }
    
    @Test
    public void testFlatten2() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = objectArray;
        objectArray[1] = objectArray;
        tokens.add(objectArray);
        tokens.add(objectArray);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", currentOption);
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        java.lang.String[] stringArray = new java.lang.String[2];
        String string = "";
        stringArray[0] = string;
        String string1 = "--\u0000=";
        stringArray[1] = string1;
        
        java.lang.String[] actual = posixParser.flatten(null, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[3];
        expected[0] = string;
        String string2 = "--\u0000";
        expected[1] = string2;
        String string3 = "";
        expected[2] = string3;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Option finalPosixParserCurrentOption = ((Option) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "currentOption"));
        Options finalPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        assertNull(finalPosixParserCurrentOption);
        
        assertNull(finalPosixParserOptions);
    }
    
    @Test
    public void testFlatten3() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = objectArray;
        objectArray[1] = objectArray;
        tokens.add(objectArray);
        tokens.add(objectArray);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", currentOption);
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        java.lang.String[] stringArray = new java.lang.String[2];
        String string = "--\u0000\u0000\u0000\u0000";
        stringArray[0] = string;
        String string1 = "\u0000";
        stringArray[1] = string1;
        
        java.lang.String[] actual = posixParser.flatten(null, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[2];
        expected[0] = string;
        expected[1] = string1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Option finalPosixParserCurrentOption = ((Option) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "currentOption"));
        Options finalPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        assertNull(finalPosixParserCurrentOption);
        
        assertNull(finalPosixParserOptions);
    }
    
    @Test
    public void testFlatten4() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        Object object = createInstance("java.lang.Object");
        tokens.add(object);
        tokens.add(object);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", currentOption);
        Options options = new Options();
        java.lang.String[] stringArray = new java.lang.String[3];
        String string = "";
        stringArray[0] = string;
        
        Options initialPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        java.lang.String[] actual = posixParser.flatten(options, stringArray, true);
        
        java.lang.String[] expected = new java.lang.String[4];
        String string1 = "--";
        expected[0] = string1;
        expected[1] = string;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        boolean finalPosixParserEatTheRest = ((Boolean) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "eatTheRest"));
        Option finalPosixParserCurrentOption = ((Option) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "currentOption"));
        Options finalPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        String finalStringArray1 = stringArray[1];
        String finalStringArray2 = stringArray[2];
        
        assertFalse(initialPosixParserOptions == finalPosixParserOptions);
        
        assertTrue(finalPosixParserEatTheRest);
        
        assertNull(finalPosixParserCurrentOption);
        
        assertNull(finalStringArray1);
        
        assertNull(finalStringArray2);
    }
    
    @Test
    public void testFlatten5() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = objectArray;
        objectArray[1] = objectArray;
        tokens.add(objectArray);
        tokens.add(objectArray);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", currentOption);
        Options options = new Options();
        java.lang.String[] stringArray = new java.lang.String[2];
        String string = "-";
        stringArray[0] = string;
        String string1 = "-\u0000";
        stringArray[1] = string1;
        
        Options initialPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        java.lang.String[] actual = posixParser.flatten(options, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[1];
        expected[0] = string;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Option finalPosixParserCurrentOption = ((Option) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "currentOption"));
        Options finalPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        assertFalse(initialPosixParserOptions == finalPosixParserOptions);
        
        assertNull(finalPosixParserCurrentOption);
    }
    
    @Test
    public void testFlatten6() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = objectArray;
        objectArray[1] = objectArray;
        tokens.add(objectArray);
        tokens.add(objectArray);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Options options = new Options();
        java.lang.String[] stringArray = new java.lang.String[2];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        stringArray[0] = string;
        String string1 = "-\u0000";
        stringArray[1] = string1;
        
        Options initialPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        java.lang.String[] actual = posixParser.flatten(options, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[1];
        expected[0] = string;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Options finalPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        assertFalse(initialPosixParserOptions == finalPosixParserOptions);
    }
    
    @Test
    public void testFlatten7() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        java.lang.String[] stringArray = new java.lang.String[2];
        String string = "-";
        stringArray[0] = string;
        String string1 = "";
        stringArray[1] = string1;
        tokens.add(stringArray);
        tokens.add(stringArray);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Options options = new Options();
        
        Options initialPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        java.lang.String[] actual = posixParser.flatten(options, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[2];
        expected[0] = string;
        expected[1] = string1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Options finalPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        assertFalse(initialPosixParserOptions == finalPosixParserOptions);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method flatten(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    @Test
    public void testFlatten8() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        char[] charArray = {'-', '-', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        tokens.add(charArray);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        tokens.add(option);
        tokens.add(option);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", option);
        java.lang.String[] stringArray = new java.lang.String[2];
        String string = "--\u0000\u0000\u0000\u0000\u0000";
        stringArray[0] = string;
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.flatten(PosixParser.java:112) */
        posixParser.flatten(null, stringArray, false);
    }
    
    @Test
    public void testFlatten9() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        char[] charArray = {'-', '-', '\u0000', '\u0000', '\u0000', '='};
        tokens.add(charArray);
        java.lang.String[] stringArray = new java.lang.String[9];
        String string = "--\u0000\u0000\u0000=";
        stringArray[0] = string;
        tokens.add(stringArray);
        tokens.add(stringArray);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Options options = new Options();
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.flatten(PosixParser.java:112) */
        posixParser.flatten(options, stringArray, false);
    }
    
    @Test
    public void testFlatten10() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        char[] charArray = {};
        tokens.add(charArray);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", currentOption);
        Options options = new Options();
        java.lang.String[] stringArray = new java.lang.String[9];
        String string = "";
        stringArray[0] = string;
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.flatten(PosixParser.java:112) */
        posixParser.flatten(options, stringArray, false);
    }
    
    @Test
    public void testFlatten11() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        tokens.add(null);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        java.lang.String[] stringArray = new java.lang.String[2];
        String string = "\u0000\u0000";
        stringArray[0] = string;
        String string1 = "-\u0000";
        stringArray[1] = string1;
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.processOptionToken(PosixParser.java:233)
            org.apache.commons.cli.PosixParser.flatten(PosixParser.java:134) */
        posixParser.flatten(null, stringArray, false);
    }
    
    @Test
    public void testFlatten12() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        char[] charArray = {'-', '\u0000'};
        tokens.add(charArray);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Options options = new Options();
        java.lang.String[] stringArray = new java.lang.String[9];
        String string = "-\u0000";
        stringArray[0] = string;
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.flatten(PosixParser.java:112) */
        posixParser.flatten(options, stringArray, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.PosixParser.process
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method process(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#process(java.lang.String)}
 * @utbot.executesCondition {@code (currentOption.hasArg()): False}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testProcess_NotCurrentOptionHasArg() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", currentOption);
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Method processMethod = posixParserClazz.getDeclaredMethod("process", stringType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[1];
        processMethodArguments[0] = ((Object) null);
        processMethod.invoke(posixParser, processMethodArguments);
        
        boolean finalPosixParserEatTheRest = ((Boolean) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "eatTheRest"));
        
        assertTrue(finalPosixParserEatTheRest);
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#process(java.lang.String)}
 * @utbot.executesCondition {@code (currentOption.hasArg()): True}
 * @utbot.executesCondition {@code (currentOption.hasArg()): True}
 * @utbot.invokes {@link org.apache.commons.cli.Option#hasArg()}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testProcess_CurrentOptionHasArg() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        tokens.add(null);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(currentOption, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", currentOption);
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Method processMethod = posixParserClazz.getDeclaredMethod("process", stringType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[1];
        processMethodArguments[0] = ((Object) null);
        processMethod.invoke(posixParser, processMethodArguments);
        
        Option finalPosixParserCurrentOption = ((Option) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "currentOption"));
        
        assertNull(finalPosixParserCurrentOption);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#process(java.lang.String)}
 * @utbot.executesCondition {@code (currentOption != null): True}
 * @utbot.executesCondition {@code (currentOption.hasArg()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tokens.add("--");
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", currentOption);
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.process] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.process(PosixParser.java:209) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Method processMethod = posixParserClazz.getDeclaredMethod("process", stringType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[1];
        processMethodArguments[0] = ((Object) null);
        try {
            processMethod.invoke(posixParser, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#process(java.lang.String)}
 * @utbot.executesCondition {@code (currentOption != null): True}
 * @utbot.executesCondition {@code (currentOption.hasArg()): True}
 * @utbot.executesCondition {@code (currentOption.hasArg()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tokens.add(value);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(currentOption, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", currentOption);
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.process] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.process(PosixParser.java:198) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Method processMethod = posixParserClazz.getDeclaredMethod("process", stringType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[1];
        processMethodArguments[0] = ((Object) null);
        try {
            processMethod.invoke(posixParser, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#process(java.lang.String)}
 * @utbot.executesCondition {@code (currentOption != null): True}
 * @utbot.executesCondition {@code (currentOption.hasArg()): True}
 * @utbot.executesCondition {@code (currentOption.hasArg()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tokens.add(value);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(currentOption, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", currentOption);
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.process] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.process(PosixParser.java:198) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Method processMethod = posixParserClazz.getDeclaredMethod("process", stringType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[1];
        processMethodArguments[0] = ((Object) null);
        try {
            processMethod.invoke(posixParser, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#process(java.lang.String)}
 * @utbot.executesCondition {@code (currentOption != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tokens.add("--");
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.process] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.process(PosixParser.java:209) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Method processMethod = posixParserClazz.getDeclaredMethod("process", stringType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[1];
        processMethodArguments[0] = ((Object) null);
        try {
            processMethod.invoke(posixParser, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method process(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.PosixParser}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#process(java.lang.String)}
     */
    @Test
    public void testProcessWithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PosixParser posixParser = new PosixParser();
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Method processMethod = posixParserClazz.getDeclaredMethod("process", stringType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[1];
        processMethodArguments[0] = "--";
        processMethod.invoke(posixParser, processMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.PosixParser.gobble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method gobble(java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#gobble(java.util.Iterator)}
 * @utbot.executesCondition {@code (eatTheRest): False}
 *  */
    @Test
    public void testGobble_NotEatTheRest() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class iteratorType = Class.forName("java.util.Iterator");
        Method gobbleMethod = posixParserClazz.getDeclaredMethod("gobble", iteratorType);
        gobbleMethod.setAccessible(true);
        java.lang.Object[] gobbleMethodArguments = new java.lang.Object[1];
        gobbleMethodArguments[0] = ((Object) null);
        gobbleMethod.invoke(posixParser, gobbleMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#gobble(java.util.Iterator)}
 * @utbot.executesCondition {@code (eatTheRest): True}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 *  */
    @Test
    public void testGobble_IterHasNext() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        tokens.add(null);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "eatTheRest", true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class iteratorType = Class.forName("java.util.Iterator");
        Method gobbleMethod = posixParserClazz.getDeclaredMethod("gobble", iteratorType);
        gobbleMethod.setAccessible(true);
        java.lang.Object[] gobbleMethodArguments = new java.lang.Object[1];
        gobbleMethodArguments[0] = iterator;
        gobbleMethod.invoke(posixParser, gobbleMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method gobble(java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#gobble(java.util.Iterator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(iter.hasNext())
 *  */
    @Test
    public void testGobble_ThrowNullPointerException() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "eatTheRest", true);
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.gobble] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.gobble(PosixParser.java:170) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class iteratorType = Class.forName("java.util.Iterator");
        Method gobbleMethod = posixParserClazz.getDeclaredMethod("gobble", iteratorType);
        gobbleMethod.setAccessible(true);
        java.lang.Object[] gobbleMethodArguments = new java.lang.Object[1];
        gobbleMethodArguments[0] = ((Object) null);
        try {
            gobbleMethod.invoke(posixParser, gobbleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#gobble(java.util.Iterator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGobble_ThrowNullPointerException_1() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "eatTheRest", true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.gobble] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.gobble(PosixParser.java:172) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class iteratorType = Class.forName("java.util.Iterator");
        Method gobbleMethod = posixParserClazz.getDeclaredMethod("gobble", iteratorType);
        gobbleMethod.setAccessible(true);
        java.lang.Object[] gobbleMethodArguments = new java.lang.Object[1];
        gobbleMethodArguments[0] = iterator;
        try {
            gobbleMethod.invoke(posixParser, gobbleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.PosixParser.processOptionToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method processOptionToken(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processOptionToken(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (stopAtNonOption): False}
 *  */
    @Test
    public void testProcessOptionToken_NotStopAtNonOption() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = ((Object) null);
        processOptionTokenMethodArguments[1] = false;
        processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processOptionToken(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (stopAtNonOption): True}
 *  */
    @Test
    public void testProcessOptionToken_StopAtNonOption() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = ((Object) null);
        processOptionTokenMethodArguments[1] = true;
        processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
        
        boolean finalPosixParserEatTheRest = ((Boolean) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "eatTheRest"));
        
        assertTrue(finalPosixParserEatTheRest);
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processOptionToken(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (stopAtNonOption): True}
 *  */
    @Test
    public void testProcessOptionToken_StopAtNonOption_1() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        String string = "";
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = string;
        processOptionTokenMethodArguments[1] = true;
        processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
        
        boolean finalPosixParserEatTheRest = ((Boolean) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "eatTheRest"));
        
        assertTrue(finalPosixParserEatTheRest);
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processOptionToken(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (stopAtNonOption): False}
 *  */
    @Test
    public void testProcessOptionToken_NotStopAtNonOption_1() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        String string = " ";
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = string;
        processOptionTokenMethodArguments[1] = false;
        processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processOptionToken(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (stopAtNonOption): False}
 *  */
    @Test
    public void testProcessOptionToken_NotStopAtNonOption_2() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        String string = "--                                      ";
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = string;
        processOptionTokenMethodArguments[1] = false;
        processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processOptionToken(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (stopAtNonOption): True}
 *  */
    @Test
    public void testProcessOptionToken_StopAtNonOption_2() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        String string = "-";
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = string;
        processOptionTokenMethodArguments[1] = true;
        processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
        
        boolean finalPosixParserEatTheRest = ((Boolean) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "eatTheRest"));
        
        assertTrue(finalPosixParserEatTheRest);
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processOptionToken(java.lang.String,boolean)}
 * @utbot.invokes {@link org.apache.commons.cli.Options#getOption(java.lang.String)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testProcessOptionToken_ListAdd() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        tokens.add(null);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", currentOption);
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        shortOpts.put(null, null);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = ((Object) null);
        processOptionTokenMethodArguments[1] = false;
        processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
        
        Option finalPosixParserCurrentOption = ((Option) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "currentOption"));
        
        assertNull(finalPosixParserCurrentOption);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processOptionToken(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processOptionToken(java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: currentOption = options.getOption(token);
 *  */
    @Test
    public void testProcessOptionToken_ThrowClassCastException() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        shortOpts.put(null, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.processOptionToken] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.cli.Option (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.cli.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @75fe4551)]
            org.apache.commons.cli.Options.getOption(Options.java:217)
            org.apache.commons.cli.PosixParser.processOptionToken(PosixParser.java:235) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = ((Object) null);
        processOptionTokenMethodArguments[1] = false;
        try {
            processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processOptionToken(java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.hasOption(token)
 *  */
    @Test
    public void testProcessOptionToken_ThrowNullPointerException() throws Throwable  {
        PosixParser posixParser = new PosixParser();
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.processOptionToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.processOptionToken(PosixParser.java:233) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = ((Object) null);
        processOptionTokenMethodArguments[1] = false;
        try {
            processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processOptionToken(java.lang.String,boolean)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tokens.add(token);
 *  */
    @Test
    public void testProcessOptionToken_ThrowNullPointerException_1() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Option currentOption = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "currentOption", currentOption);
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        shortOpts.put(null, null);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.processOptionToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.processOptionToken(PosixParser.java:236) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = ((Object) null);
        processOptionTokenMethodArguments[1] = false;
        try {
            processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method processOptionToken(java.lang.String, boolean)
    
    @Test
    public void testProcessOptionToken1() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        shortOpts.put(character, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        String string = "-";
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = string;
        processOptionTokenMethodArguments[1] = false;
        processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method processOptionToken(java.lang.String, boolean)
    
    @Test
    public void testProcessOptionToken2() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        shortOpts.put(integer, object);
        Character character = '\u0000';
        shortOpts.put(character, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        String string = "-";
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.processOptionToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasOption(Options.java:235)
            org.apache.commons.cli.PosixParser.processOptionToken(PosixParser.java:233) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = string;
        processOptionTokenMethodArguments[1] = false;
        try {
            processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessOptionToken3() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        shortOpts.put(integer, object);
        shortOpts.put(null, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.processOptionToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasOption(Options.java:235)
            org.apache.commons.cli.PosixParser.processOptionToken(PosixParser.java:233) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = string;
        processOptionTokenMethodArguments[1] = false;
        try {
            processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessOptionToken4() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        shortOpts.put(integer, object);
        shortOpts.put(null, object);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        String string = "--";
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.processOptionToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasOption(Options.java:235)
            org.apache.commons.cli.PosixParser.processOptionToken(PosixParser.java:233) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = string;
        processOptionTokenMethodArguments[1] = false;
        try {
            processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.PosixParser.burstToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method burstToken(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#burstToken(java.lang.String,boolean)}
 *  */
    @Test
    public void testBurstToken() {
        PosixParser posixParser = new PosixParser();
        String string = " ";
        
        posixParser.burstToken(string, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method burstToken(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#burstToken(java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 1; i < token.length(); i++)
 *  */
    @Test
    public void testBurstToken_ThrowNullPointerException() {
        PosixParser posixParser = new PosixParser();
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.burstToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.burstToken(PosixParser.java:272) */
        posixParser.burstToken(null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method burstToken(java.lang.String, boolean)
    
    @Test
    public void testBurstToken1() {
        PosixParser posixParser = new PosixParser();
        String string = "\u0000\u0100";
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.burstToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.burstToken(PosixParser.java:276) */
        posixParser.burstToken(string, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.PosixParser.processSingleHyphen
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method processSingleHyphen(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processSingleHyphen(java.lang.String)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testProcessSingleHyphen_ListAdd() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        tokens.add(null);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Method processSingleHyphenMethod = posixParserClazz.getDeclaredMethod("processSingleHyphen", stringType);
        processSingleHyphenMethod.setAccessible(true);
        java.lang.Object[] processSingleHyphenMethodArguments = new java.lang.Object[1];
        processSingleHyphenMethodArguments[0] = ((Object) null);
        processSingleHyphenMethod.invoke(posixParser, processSingleHyphenMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processSingleHyphen(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processSingleHyphen(java.lang.String)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tokens.add(hyphen);
 *  */
    @Test
    public void testProcessSingleHyphen_ThrowNullPointerException() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.processSingleHyphen] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.processSingleHyphen(PosixParser.java:215) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Method processSingleHyphenMethod = posixParserClazz.getDeclaredMethod("processSingleHyphen", stringType);
        processSingleHyphenMethod.setAccessible(true);
        java.lang.Object[] processSingleHyphenMethodArguments = new java.lang.Object[1];
        processSingleHyphenMethodArguments[0] = ((Object) null);
        try {
            processSingleHyphenMethod.invoke(posixParser, processSingleHyphenMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields839006030624300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields839006030624300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass839006030633000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields839006030624300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass839006030633000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields839006031004800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields839006031004800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass839006031009300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields839006031004800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass839006031009300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

