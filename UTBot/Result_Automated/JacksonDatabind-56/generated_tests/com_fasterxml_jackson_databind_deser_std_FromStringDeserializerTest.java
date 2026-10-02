package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer;
import com.fasterxml.jackson.databind.ext.DOMDeserializer;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public final class com_fasterxml_jackson_databind_deser_std_FromStringDeserializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.types
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method types()
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#types()}
 * @utbot.returnsFrom {@code return new Class<?>[] { File.class, URL.class, URI.class, Class.class, JavaType.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class };}
 *  */
    @Test
    public void testTypes_ReturnNewArrayOfClass() {
        java.lang.Class[] actual = FromStringDeserializer.types();
        
        java.lang.Class[] expected = new java.lang.Class[12];
        Class class1 = java.io.File.class;
        expected[0] = class1;
        Class class2 = java.net.URL.class;
        expected[1] = class2;
        Class class3 = java.net.URI.class;
        expected[2] = class3;
        Class class4 = Class.class;
        expected[3] = class4;
        Class class5 = com.fasterxml.jackson.databind.JavaType.class;
        expected[4] = class5;
        Class class6 = java.util.Currency.class;
        expected[5] = class6;
        Class class7 = java.util.regex.Pattern.class;
        expected[6] = class7;
        Class class8 = java.util.Locale.class;
        expected[7] = class8;
        Class class9 = java.nio.charset.Charset.class;
        expected[8] = class9;
        Class class10 = java.util.TimeZone.class;
        expected[9] = class10;
        Class class11 = java.net.InetAddress.class;
        expected[10] = class11;
        Class class12 = java.net.InetSocketAddress.class;
        expected[11] = class12;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method types()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#types()}
     */
    @Test
    public void testTypes() {
        java.lang.Class[] actual = FromStringDeserializer.types();
        
        java.lang.Class[] expected = new java.lang.Class[12];
        Class class1 = java.io.File.class;
        expected[0] = class1;
        Class class2 = java.net.URL.class;
        expected[1] = class2;
        Class class3 = java.net.URI.class;
        expected[2] = class3;
        Class class4 = Class.class;
        expected[3] = class4;
        Class class5 = com.fasterxml.jackson.databind.JavaType.class;
        expected[4] = class5;
        Class class6 = java.util.Currency.class;
        expected[5] = class6;
        Class class7 = java.util.regex.Pattern.class;
        expected[6] = class7;
        Class class8 = java.util.Locale.class;
        expected[7] = class8;
        Class class9 = java.nio.charset.Charset.class;
        expected[8] = class9;
        Class class10 = java.util.TimeZone.class;
        expected[9] = class10;
        Class class11 = java.net.InetAddress.class;
        expected[10] = class11;
        Class class12 = java.net.InetSocketAddress.class;
        expected[11] = class12;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p.nextToken();
 *  */
    @Test
    public void testDeserialize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {(byte) 32};
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2892)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:707)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:105) */
        documentDeserializer.deserialize(uTF8StreamJsonParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p.nextToken();
 *  */
    @Test
    public void testDeserialize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2872)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:707)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:105) */
        documentDeserializer.deserialize(uTF8StreamJsonParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p.nextToken();
 *  */
    @Test
    public void testDeserialize_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {(byte) 13};
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipCR(UTF8StreamJsonParser.java:3414)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2885)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:707)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:105) */
        documentDeserializer.deserialize(uTF8StreamJsonParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p.nextToken();
 *  */
    @Test
    public void testDeserialize_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {(byte) 32, (byte) 13};
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipCR(UTF8StreamJsonParser.java:3414)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2905)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:707)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:105) */
        uUIDDeserializer.deserialize(uTF8StreamJsonParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p.nextToken();
 *  */
    @Test
    public void testDeserialize_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\"', ' '};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2283)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:105) */
        documentDeserializer.deserialize(readerBasedJsonParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p.nextToken();
 *  */
    @Test
    public void testDeserialize_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2263)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:105) */
        documentDeserializer.deserialize(readerBasedJsonParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p.nextToken();
 *  */
    @Test
    public void testDeserialize_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2010)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:105) */
        documentDeserializer.deserialize(readerBasedJsonParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p.nextToken();
 *  */
    @Test
    public void testDeserialize_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\\', 'u'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2461)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2017)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:105) */
        documentDeserializer.deserialize(readerBasedJsonParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p.nextToken();
 *  */
    @Test
    public void testDeserialize_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\"', '\r'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCR(ReaderBasedJsonParser.java:2046)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2276)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:105) */
        documentDeserializer.deserialize(readerBasedJsonParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p.nextToken();
 *  */
    @Test
    public void testDeserialize_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\\'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2425)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2017)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:105) */
        std.deserialize(readerBasedJsonParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getValueAsString()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String text = p.getValueAsString();
 *  */
    @Test
    public void testDeserialize_ThrowStringIndexOutOfBoundsException() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:344)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getValueAsString(ReaderBasedJsonParser.java:278)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:114) */
        std.deserialize(readerBasedJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.nextToken();
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_5() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2872)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:707)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:105) */
        documentDeserializer.deserialize(uTF8StreamJsonParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.nextToken();
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_6() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32768);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2263)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:105) */
        documentDeserializer.deserialize(readerBasedJsonParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.getCurrentToken() == JsonToken.START_ARRAY && ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() throws IOException  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:104) */
        std.deserialize(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.getCurrentToken() == JsonToken.START_ARRAY && ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_2() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:104) */
        std.deserialize(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.getCurrentToken() == JsonToken.START_ARRAY && ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_3() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:104) */
        uUIDDeserializer.deserialize(jsonParserSequence, null);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.getCurrentToken() == JsonToken.START_ARRAY && ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_4() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:104) */
        std.deserialize(treeTraversingParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.getCurrentToken() == JsonToken.START_ARRAY && ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_1() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:104) */
        std.deserialize(jsonParserSequence, null);
    }
    ///endregion
    
    ///region Errors report for deserialize
    
    public void testDeserialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findDeserializer(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#findDeserializer(java.lang.Class)}
 * @utbot.executesCondition {@code (rawType): False}
 * @utbot.executesCondition {@code (rawType): False}
 * @utbot.executesCondition {@code (rawType): False}
 * @utbot.executesCondition {@code (rawType): True}
 * @utbot.returnsFrom {@code return new Std(rawType, kind);}
 *  */
    @Test
    public void testFindDeserializer_RawType() {
        Class class1 = Object.class;
        
        FromStringDeserializer.Std actual = FromStringDeserializer.findDeserializer(class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeFromEmptyString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _deserializeFromEmptyString()
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#_deserializeFromEmptyString()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_deserializeFromEmptyString_ReturnNull() throws IOException  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        
        Object actual = uUIDDeserializer._deserializeFromEmptyString();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeEmbedded
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeEmbedded(java.lang.Object, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#_deserializeEmbedded(java.lang.Object,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#mappingException(java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw ctxt.mappingException("Don't know how to convert embedded Object of type %s into %s", ob.getClass().getName(), _valueClass.getName());
 *  */
    @Test
    public void test_deserializeEmbedded_ThrowNullPointerException_2() throws IOException  {
        Class class1 = Object.class;
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(class1, 0);
        short[] shortArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeEmbedded] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeEmbedded(FromStringDeserializer.java:161) */
        std._deserializeEmbedded(shortArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#_deserializeEmbedded(java.lang.Object,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ob.getClass().getName()
 *  */
    @Test
    public void test_deserializeEmbedded_ThrowNullPointerException_1() throws IOException  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeEmbedded] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeEmbedded(FromStringDeserializer.java:162) */
        std._deserializeEmbedded(byteArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#_deserializeEmbedded(java.lang.Object,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ob.getClass().getName()
 *  */
    @Test
    public void test_deserializeEmbedded_ThrowNullPointerException() throws IOException  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeEmbedded] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeEmbedded(FromStringDeserializer.java:162) */
        std._deserializeEmbedded(null, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _deserializeEmbedded(java.lang.Object, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = JsonMappingException.class)
    public void test_deserializeEmbedded1() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        nodeDeserializer._deserializeEmbedded(object, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1077718772640500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1077718772640500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1077718772676100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1077718772640500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1077718772676100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

