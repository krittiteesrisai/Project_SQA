package org.jsoup.nodes;

import org.junit.Test;
import sun.nio.cs.SingleByte.Encoder;
import sun.nio.cs.SingleByte;
import java.lang.reflect.Method;
import org.jsoup.nodes.Document.OutputSettings;
import sun.nio.cs.UTF_8;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;

public final class org_jsoup_nodes_EntitiesTest {
    ///region Test suites for executable org.jsoup.nodes.Entities.canEncode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canEncode(org.jsoup.nodes.Entities$CoreCharset, char, java.nio.charset.CharsetEncoder)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#canEncode(org.jsoup.nodes.Entities.CoreCharset,char,java.nio.charset.CharsetEncoder)}
 * @utbot.invokes {@link org.jsoup.nodes.Entities.CoreCharset#ordinal()}
 * @utbot.invokes {@link org.jsoup.nodes.Entities.CoreCharset#ordinal()}
 * @utbot.invokes {@link java.nio.charset.CharsetEncoder#canEncode(char)}
 * @utbot.invokes {@link sun.nio.cs.SingleByte.Encoder#encode(char)}
 * @utbot.invokes {@link java.nio.charset.CharsetEncoder#canEncode(char)}
 * @utbot.activatesSwitch {@code switch(charset) case: default}
 * @utbot.returnsFrom {@code return fallback.canEncode(c);}
 *  */
    @Test
    public void testCanEncode_CharsetEncoderCanEncode() throws Exception  {
        Class coreCharsetClazz = Class.forName("org.jsoup.nodes.Entities$CoreCharset");
        Object coreCharset = getEnumConstantByName(coreCharsetClazz, "fallback");
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2bIndex = {'\uFFFD'};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class charType = char.class;
        Class encoderType = Class.forName("java.nio.charset.CharsetEncoder");
        Method canEncodeMethod = entitiesClazz.getDeclaredMethod("canEncode", coreCharsetClazz, charType, encoderType);
        canEncodeMethod.setAccessible(true);
        java.lang.Object[] canEncodeMethodArguments = new java.lang.Object[3];
        canEncodeMethodArguments[0] = coreCharset;
        canEncodeMethodArguments[1] = ' ';
        canEncodeMethodArguments[2] = encoder;
        boolean actual = ((Boolean) canEncodeMethod.invoke(null, canEncodeMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canEncode(org.jsoup.nodes.Entities$CoreCharset, char, java.nio.charset.CharsetEncoder)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#canEncode(org.jsoup.nodes.Entities.CoreCharset,char,java.nio.charset.CharsetEncoder)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return fallback.canEncode(c);
 *  */
    @Test
    public void testCanEncode_ThrowIndexOutOfBoundsException() throws Throwable  {
        Class coreCharsetClazz = Class.forName("org.jsoup.nodes.Entities$CoreCharset");
        Object coreCharset = getEnumConstantByName(coreCharsetClazz, "fallback");
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2bIndex = {};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        
        /* This test fails because method [org.jsoup.nodes.Entities.canEncode] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class charType = char.class;
        Class encoderType = Class.forName("java.nio.charset.CharsetEncoder");
        Method canEncodeMethod = entitiesClazz.getDeclaredMethod("canEncode", coreCharsetClazz, charType, encoderType);
        canEncodeMethod.setAccessible(true);
        java.lang.Object[] canEncodeMethodArguments = new java.lang.Object[3];
        canEncodeMethodArguments[0] = coreCharset;
        canEncodeMethodArguments[1] = ' ';
        canEncodeMethodArguments[2] = encoder;
        try {
            canEncodeMethod.invoke(null, canEncodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#canEncode(org.jsoup.nodes.Entities.CoreCharset,char,java.nio.charset.CharsetEncoder)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return fallback.canEncode(c);
 *  */
    @Test
    public void testCanEncode_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        Class coreCharsetClazz = Class.forName("org.jsoup.nodes.Entities$CoreCharset");
        Object coreCharset = getEnumConstantByName(coreCharsetClazz, "fallback");
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = {'\uFFC0'};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2b);
        
        /* This test fails because method [org.jsoup.nodes.Entities.canEncode] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class charType = char.class;
        Class encoderType = Class.forName("java.nio.charset.CharsetEncoder");
        Method canEncodeMethod = entitiesClazz.getDeclaredMethod("canEncode", coreCharsetClazz, charType, encoderType);
        canEncodeMethod.setAccessible(true);
        java.lang.Object[] canEncodeMethodArguments = new java.lang.Object[3];
        canEncodeMethodArguments[0] = coreCharset;
        canEncodeMethodArguments[1] = '@';
        canEncodeMethodArguments[2] = encoder;
        try {
            canEncodeMethod.invoke(null, canEncodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for canEncode
    
    public void testCanEncode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.escape
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escape(java.lang.StringBuilder, java.lang.String, org.jsoup.nodes.Document$OutputSettings, boolean, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.StringBuilder,java.lang.String,org.jsoup.nodes.Document.OutputSettings,boolean,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Map<Character, String> map = escapeMode.getMap();
 *  */
    @Test
    public void testEscape_ThrowNullPointerException() throws Exception  {
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Object charsetEncoder = createInstance("sun.nio.cs.ISO_8859_1$Encoder");
        UTF_8 charset = ((UTF_8) createInstance("sun.nio.cs.UTF_8"));
        String name = "";
        setField(charset, "java.nio.charset.Charset", "name", name);
        setField(charsetEncoder, "java.nio.charset.CharsetEncoder", "charset", charset);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder", charsetEncoder);
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.NullPointerException] */
        Entities.escape(null, null, outputSettings, false, false, false);
    }
    
    /**
    @utbot.classUnderTest {@link Entities}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Entities#escape(java.lang.StringBuilder,java.lang.String,org.jsoup.nodes.Document.OutputSettings,boolean,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Map<Character, String> map = escapeMode.getMap();
 *  */
    @Test
    public void testEscape_ThrowNullPointerException_1() throws Exception  {
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Object charsetEncoder = createInstance("sun.nio.cs.ISO_8859_1$Encoder");
        UTF_8 charset = ((UTF_8) createInstance("sun.nio.cs.UTF_8"));
        String name = "";
        setField(charset, "java.nio.charset.Charset", "name", name);
        setField(charsetEncoder, "java.nio.charset.CharsetEncoder", "charset", charset);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder", charsetEncoder);
        
        /* This test fails because method [org.jsoup.nodes.Entities.escape] produces [java.lang.NullPointerException] */
        Entities.escape(null, null, outputSettings, false, false, false);
    }
    ///endregion
    
    ///region Errors report for escape
    
    public void testEscape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 31 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.escape
    
    ///region Errors report for escape
    
    public void testEscape_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 31 occurrences of:
        // Concrete execution failed
        
        // 8 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.unescape
    
    ///region Errors report for unescape
    
    public void testUnescape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Concrete execution failed
        
        // 6 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.unescape
    
    ///region Errors report for unescape
    
    public void testUnescape_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Concrete execution failed
        
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.isNamedEntity
    
    ///region OTHER: ERROR SUITE for method isNamedEntity(java.lang.String)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testIsNamedEntity1() {
        Entities.isNamedEntity(null);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testIsNamedEntity2() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Entities.isNamedEntity(string);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testIsNamedEntity3() {
        String string = "";
        
        Entities.isNamedEntity(string);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testIsNamedEntity4() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Entities.isNamedEntity(string);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testIsNamedEntity5() {
        String string = "";
        
        Entities.isNamedEntity(string);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testIsNamedEntity6() {
        String string = "";
        
        Entities.isNamedEntity(string);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testIsNamedEntity7() {
        String string = "";
        
        Entities.isNamedEntity(string);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testIsNamedEntity8() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Entities.isNamedEntity(string);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testIsNamedEntity9() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Entities.isNamedEntity(string);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testIsNamedEntity10() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Entities.isNamedEntity(string);
    }
    ///endregion
    
    ///region Errors report for isNamedEntity
    
    public void testIsNamedEntity_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 13 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Field $assertionsDisabled is not declared in class java.lang.ClassLoader
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.isBaseNamedEntity
    
    ///region Errors report for isBaseNamedEntity
    
    public void testIsBaseNamedEntity_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Field $assertionsDisabled is not declared in class java.lang.ClassLoader
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.getCharacterByName
    
    ///region Errors report for getCharacterByName
    
    public void testGetCharacterByName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Field $assertionsDisabled is not declared in class java.lang.ClassLoader
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.loadEntities
    
    ///region OTHER: ERROR SUITE for method loadEntities(java.lang.String)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities1() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities2() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities3() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities4() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities5() throws Throwable  {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities6() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities7() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities8() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities9() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities10() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testLoadEntities11() throws Throwable  {
        String string = "";
        
        Class entitiesClazz = Class.forName("org.jsoup.nodes.Entities");
        Class stringType = Class.forName("java.lang.String");
        Method loadEntitiesMethod = entitiesClazz.getDeclaredMethod("loadEntities", stringType);
        loadEntitiesMethod.setAccessible(true);
        java.lang.Object[] loadEntitiesMethodArguments = new java.lang.Object[1];
        loadEntitiesMethodArguments[0] = string;
        try {
            loadEntitiesMethod.invoke(null, loadEntitiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for loadEntities
    
    public void testLoadEntities_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Concrete execution failed
        
        // 4 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        // Field $assertionsDisabled is not declared in class java.lang.ClassLoader
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Entities.toCharacterKey
    
    ///region Errors report for toCharacterKey
    
    public void testToCharacterKey_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1000144391410000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1000144391410000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1000144391414800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1000144391410000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1000144391414800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

