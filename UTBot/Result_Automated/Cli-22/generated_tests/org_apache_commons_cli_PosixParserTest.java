package org.apache.commons.cli;

import org.junit.Test;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Iterator;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
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
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Method initMethod = posixParserClazz.getDeclaredMethod("init");
        initMethod.setAccessible(true);
        java.lang.Object[] initMethodArguments = new java.lang.Object[0];
        initMethod.invoke(posixParser, initMethodArguments);
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
            org.apache.commons.cli.PosixParser.init(PosixParser.java:53) */
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
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 *  */
    @Test
    public void testFlatten_IterHasNext() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        tokens.add(null);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        java.lang.String[] actual = posixParser.flatten(null, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[1];
        expected[0] = string;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Options finalPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        assertNull(finalPosixParserOptions);
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#flatten(org.apache.commons.cli.Options,java.lang.String[],boolean)}
 * @utbot.returnsFrom {@code return (String[]) tokens.toArray(new String[tokens.size()]);}
 *  */
    @Test
    public void testFlatten_IterHasNext_1() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        tokens.add(null);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        java.lang.String[] stringArray = {};
        
        java.lang.String[] actual = posixParser.flatten(null, stringArray, false);
        
        java.lang.String[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Options finalPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        assertNull(finalPosixParserOptions);
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#flatten(org.apache.commons.cli.Options,java.lang.String[],boolean)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.returnsFrom {@code return (String[]) tokens.toArray(new String[tokens.size()]);}
 *  */
    @Test
    public void testFlatten_Equals() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        tokens.add(null);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "-";
        stringArray[0] = string;
        
        java.lang.String[] actual = posixParser.flatten(null, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[1];
        expected[0] = string;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#flatten(org.apache.commons.cli.Options,java.lang.String[],boolean)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.returnsFrom {@code return (String[]) tokens.toArray(new String[tokens.size()]);}
 *  */
    @Test
    public void testFlatten_StopAtNonOption() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        tokens.add(null);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        java.lang.String[] actual = posixParser.flatten(null, stringArray, true);
        
        java.lang.String[] expected = new java.lang.String[2];
        String string1 = "--";
        expected[0] = string1;
        expected[1] = string;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        boolean finalPosixParserEatTheRest = ((Boolean) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "eatTheRest"));
        
        assertTrue(finalPosixParserEatTheRest);
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
            org.apache.commons.cli.PosixParser.init(PosixParser.java:53)
            org.apache.commons.cli.PosixParser.flatten(PosixParser.java:96) */
        posixParser.flatten(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#flatten(org.apache.commons.cli.Options,java.lang.String[],boolean)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
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
            org.apache.commons.cli.PosixParser.flatten(PosixParser.java:109) */
        posixParser.flatten(null, stringArray, false);
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#flatten(org.apache.commons.cli.Options,java.lang.String[],boolean)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: processOptionToken(token, stopAtNonOption);
 *  */
    @Test
    public void testFlatten_ThrowNullPointerException_3() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        tokens.add(null);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "-\u0000";
        stringArray[0] = string;
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.processOptionToken(PosixParser.java:206)
            org.apache.commons.cli.PosixParser.flatten(PosixParser.java:138) */
        posixParser.flatten(null, stringArray, true);
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#flatten(org.apache.commons.cli.Options,java.lang.String[],boolean)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !options.hasOption(opt)
 *  */
    @Test
    public void testFlatten_ThrowNullPointerException_2() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        tokens.add(null);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        java.lang.String[] stringArray = new java.lang.String[2];
        String string = "--=";
        stringArray[0] = string;
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.flatten(PosixParser.java:114) */
        posixParser.flatten(null, stringArray, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method flatten(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    @Test
    public void testFlatten1() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        char[] charArray = {'-', '-', '\u0000', '\u0000', '\u0000'};
        tokens.add(charArray);
        Scanner scanner = ((Scanner) createInstance("java.util.Scanner"));
        tokens.add(scanner);
        tokens.add(scanner);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Options options = new Options();
        java.lang.String[] stringArray = new java.lang.String[9];
        String string = "--\u0000\u0000\u0000";
        stringArray[0] = string;
        
        Options initialPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        java.lang.String[] actual = posixParser.flatten(options, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[10];
        String string1 = "--";
        expected[0] = string1;
        expected[1] = string;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        boolean finalPosixParserEatTheRest = ((Boolean) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "eatTheRest"));
        Options finalPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        String finalStringArray1 = stringArray[1];
        String finalStringArray2 = stringArray[2];
        String finalStringArray3 = stringArray[3];
        String finalStringArray4 = stringArray[4];
        String finalStringArray5 = stringArray[5];
        String finalStringArray6 = stringArray[6];
        String finalStringArray7 = stringArray[7];
        String finalStringArray8 = stringArray[8];
        
        assertFalse(initialPosixParserOptions == finalPosixParserOptions);
        
        assertTrue(finalPosixParserEatTheRest);
        
        assertNull(finalStringArray1);
        
        assertNull(finalStringArray2);
        
        assertNull(finalStringArray3);
        
        assertNull(finalStringArray4);
        
        assertNull(finalStringArray5);
        
        assertNull(finalStringArray6);
        
        assertNull(finalStringArray7);
        
        assertNull(finalStringArray8);
    }
    
    @Test
    public void testFlatten2() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        char[] charArray = {
            '-', '-', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '='
        };
        tokens.add(charArray);
        Scanner scanner = ((Scanner) createInstance("java.util.Scanner"));
        tokens.add(scanner);
        tokens.add(scanner);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Options options = new Options();
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "--\u0000\u0000\u0000\u0000\u0000\u0000=";
        stringArray[0] = string;
        
        Options initialPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        java.lang.String[] actual = posixParser.flatten(options, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[11];
        String string1 = "--";
        expected[0] = string1;
        expected[1] = string;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        boolean finalPosixParserEatTheRest = ((Boolean) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "eatTheRest"));
        Options finalPosixParserOptions = ((Options) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "options"));
        
        String finalStringArray1 = stringArray[1];
        String finalStringArray2 = stringArray[2];
        String finalStringArray3 = stringArray[3];
        String finalStringArray4 = stringArray[4];
        String finalStringArray5 = stringArray[5];
        String finalStringArray6 = stringArray[6];
        String finalStringArray7 = stringArray[7];
        String finalStringArray8 = stringArray[8];
        String finalStringArray9 = stringArray[9];
        
        assertFalse(initialPosixParserOptions == finalPosixParserOptions);
        
        assertTrue(finalPosixParserEatTheRest);
        
        assertNull(finalStringArray1);
        
        assertNull(finalStringArray2);
        
        assertNull(finalStringArray3);
        
        assertNull(finalStringArray4);
        
        assertNull(finalStringArray5);
        
        assertNull(finalStringArray6);
        
        assertNull(finalStringArray7);
        
        assertNull(finalStringArray8);
        
        assertNull(finalStringArray9);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method flatten(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    @Test
    public void testFlatten3() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = objectArray;
        Scanner scanner = ((Scanner) createInstance("java.util.Scanner"));
        objectArray[1] = ((Object) scanner);
        objectArray[2] = ((Object) scanner);
        tokens.add(objectArray);
        tokens.add(scanner);
        tokens.add(scanner);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "-\u0000";
        stringArray[0] = string;
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.flatten(PosixParser.java:109) */
        posixParser.flatten(null, stringArray, false);
    }
    
    @Test
    public void testFlatten4() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = objectArray;
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        objectArray[1] = ((Object) options);
        objectArray[2] = ((Object) options);
        tokens.add(objectArray);
        tokens.add(options);
        tokens.add(options);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        Options options1 = new Options();
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "\u0000\u0000";
        stringArray[0] = string;
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.flatten(PosixParser.java:109) */
        posixParser.flatten(options1, stringArray, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.PosixParser.processNonOptionToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method processNonOptionToken(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processNonOptionToken(java.lang.String)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testProcessNonOptionToken_ListAdd() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Method processNonOptionTokenMethod = posixParserClazz.getDeclaredMethod("processNonOptionToken", stringType);
        processNonOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processNonOptionTokenMethodArguments = new java.lang.Object[1];
        processNonOptionTokenMethodArguments[0] = ((Object) null);
        processNonOptionTokenMethod.invoke(posixParser, processNonOptionTokenMethodArguments);
        
        boolean finalPosixParserEatTheRest = ((Boolean) getFieldValue(posixParser, "org.apache.commons.cli.PosixParser", "eatTheRest"));
        
        assertTrue(finalPosixParserEatTheRest);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processNonOptionToken(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processNonOptionToken(java.lang.String)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tokens.add("--");
 *  */
    @Test
    public void testProcessNonOptionToken_ThrowNullPointerException() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.processNonOptionToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.processNonOptionToken(PosixParser.java:187) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Method processNonOptionTokenMethod = posixParserClazz.getDeclaredMethod("processNonOptionToken", stringType);
        processNonOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processNonOptionTokenMethodArguments = new java.lang.Object[1];
        processNonOptionTokenMethodArguments[0] = ((Object) null);
        try {
            processNonOptionTokenMethod.invoke(posixParser, processNonOptionTokenMethodArguments);
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
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testProcessOptionToken_NotStopAtNonOption() throws Exception  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        ArrayList tokens = new ArrayList();
        tokens.add(null);
        tokens.add(null);
        tokens.add(null);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "tokens", tokens);
        
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processOptionToken(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processOptionToken(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (stopAtNonOption): True}
 * @utbot.invokes {@link org.apache.commons.cli.Options#hasOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: stopAtNonOption && !options.hasOption(token)
 *  */
    @Test
    public void testProcessOptionToken_ThrowNullPointerException() throws Throwable  {
        PosixParser posixParser = new PosixParser();
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.processOptionToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.processOptionToken(PosixParser.java:206) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = ((Object) null);
        processOptionTokenMethodArguments[1] = true;
        try {
            processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processOptionToken(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (stopAtNonOption): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tokens.add(token);
 *  */
    @Test
    public void testProcessOptionToken_ThrowNullPointerException_1() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.processOptionToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.processOptionToken(PosixParser.java:212) */
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
 * @utbot.executesCondition {@code (stopAtNonOption): True}
 * @utbot.executesCondition {@code (!options.hasOption(token)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tokens.add(token);
 *  */
    @Test
    public void testProcessOptionToken_ThrowNullPointerException_3() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.processOptionToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.processOptionToken(PosixParser.java:212) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = ((Object) null);
        processOptionTokenMethodArguments[1] = true;
        try {
            processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processOptionToken(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (stopAtNonOption): True}
 * @utbot.executesCondition {@code (!options.hasOption(token)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tokens.add(token);
 *  */
    @Test
    public void testProcessOptionToken_ThrowNullPointerException_4() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.processOptionToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.processOptionToken(PosixParser.java:212) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = string;
        processOptionTokenMethodArguments[1] = true;
        try {
            processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processOptionToken(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (stopAtNonOption): True}
 * @utbot.executesCondition {@code (!options.hasOption(token)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tokens.add(token);
 *  */
    @Test
    public void testProcessOptionToken_ThrowNullPointerException_5() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        String string = "--";
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.processOptionToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.processOptionToken(PosixParser.java:212) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = string;
        processOptionTokenMethodArguments[1] = true;
        try {
            processOptionTokenMethod.invoke(posixParser, processOptionTokenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PosixParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.PosixParser#processOptionToken(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (stopAtNonOption): True}
 * @utbot.executesCondition {@code (!options.hasOption(token)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tokens.add(token);
 *  */
    @Test
    public void testProcessOptionToken_ThrowNullPointerException_2() throws Throwable  {
        PosixParser posixParser = ((PosixParser) createInstance("org.apache.commons.cli.PosixParser"));
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        shortOpts.put(null, null);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(posixParser, "org.apache.commons.cli.PosixParser", "options", options);
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.processOptionToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.processOptionToken(PosixParser.java:212) */
        Class posixParserClazz = Class.forName("org.apache.commons.cli.PosixParser");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method processOptionTokenMethod = posixParserClazz.getDeclaredMethod("processOptionToken", stringType, booleanType);
        processOptionTokenMethod.setAccessible(true);
        java.lang.Object[] processOptionTokenMethodArguments = new java.lang.Object[2];
        processOptionTokenMethodArguments[0] = ((Object) null);
        processOptionTokenMethodArguments[1] = true;
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
            org.apache.commons.cli.PosixParser.burstToken(PosixParser.java:244) */
        posixParser.burstToken(null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method burstToken(java.lang.String, boolean)
    
    @Test
    public void testBurstToken1() {
        PosixParser posixParser = new PosixParser();
        String string = "\u0000\u0100";
        
        /* This test fails because method [org.apache.commons.cli.PosixParser.burstToken] produces [java.lang.NullPointerException]
            org.apache.commons.cli.PosixParser.burstToken(PosixParser.java:248) */
        posixParser.burstToken(string, false);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields839709656505100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields839709656505100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass839709656520300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields839709656505100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass839709656520300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields839709683354500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields839709683354500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass839709683362500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields839709683354500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass839709683362500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

