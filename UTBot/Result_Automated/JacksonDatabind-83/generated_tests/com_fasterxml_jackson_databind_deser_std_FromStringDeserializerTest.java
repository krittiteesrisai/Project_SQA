package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import java.util.Locale;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer;
import com.fasterxml.jackson.databind.ext.DOMDeserializer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.util.ArrayList;
import java.io.IOException;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer;
import java.util.regex.Pattern;
import java.net.URI;
import java.net.InetSocketAddress;
import java.io.File;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.net.UnknownHostException;
import com.fasterxml.jackson.databind.type.TypeParser;
import org.junit.Ignore;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Objects;
import java.util.Map;
import java.util.List;
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
 * @utbot.returnsFrom {@code return new Class<?>[] { File.class, URL.class, URI.class, Class.class, JavaType.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class, StringBuilder.class };}
 *  */
    @Test
    public void testTypes_ReturnNewArrayOfClass() {
        java.lang.Class[] actual = FromStringDeserializer.types();
        
        java.lang.Class[] expected = new java.lang.Class[13];
        Class class1 = File.class;
        expected[0] = class1;
        Class class2 = java.net.URL.class;
        expected[1] = class2;
        Class class3 = URI.class;
        expected[2] = class3;
        Class class4 = Class.class;
        expected[3] = class4;
        Class class5 = com.fasterxml.jackson.databind.JavaType.class;
        expected[4] = class5;
        Class class6 = java.util.Currency.class;
        expected[5] = class6;
        Class class7 = Pattern.class;
        expected[6] = class7;
        Class class8 = Locale.class;
        expected[7] = class8;
        Class class9 = java.nio.charset.Charset.class;
        expected[8] = class9;
        Class class10 = java.util.TimeZone.class;
        expected[9] = class10;
        Class class11 = java.net.InetAddress.class;
        expected[10] = class11;
        Class class12 = InetSocketAddress.class;
        expected[11] = class12;
        Class class13 = StringBuilder.class;
        expected[12] = class13;
        
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
        
        java.lang.Class[] expected = new java.lang.Class[13];
        Class class1 = File.class;
        expected[0] = class1;
        Class class2 = java.net.URL.class;
        expected[1] = class2;
        Class class3 = URI.class;
        expected[2] = class3;
        Class class4 = Class.class;
        expected[3] = class4;
        Class class5 = com.fasterxml.jackson.databind.JavaType.class;
        expected[4] = class5;
        Class class6 = java.util.Currency.class;
        expected[5] = class6;
        Class class7 = Pattern.class;
        expected[6] = class7;
        Class class8 = Locale.class;
        expected[7] = class8;
        Class class9 = java.nio.charset.Charset.class;
        expected[8] = class9;
        Class class10 = java.util.TimeZone.class;
        expected[9] = class10;
        Class class11 = java.net.InetAddress.class;
        expected[10] = class11;
        Class class12 = InetSocketAddress.class;
        expected[11] = class12;
        Class class13 = StringBuilder.class;
        expected[12] = class13;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return _deserializeFromEmptyString();}
 *  */
    @Test
    public void testDeserialize_Return_deserializeFromEmptyString_2() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        Locale actual = ((Locale) std.deserialize(jsonParserDelegate, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return _deserializeFromEmptyString();}
 *  */
    @Test
    public void testDeserialize_Return_deserializeFromEmptyString() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Locale actual = ((Locale) std.deserialize(jsonParserSequence, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return _deserializeFromEmptyString();}
 *  */
    @Test
    public void testDeserialize_Return_deserializeFromEmptyString_1() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 13);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        StringBuilder actual = ((StringBuilder) std.deserialize(jsonParserDelegate, null));
        
        StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String text = p.getValueAsString();
 *  */
    @Test
    public void testDeserialize_ThrowStringIndexOutOfBoundsException() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:337)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:223)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        documentDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String text = p.getValueAsString();
 *  */
    @Test
    public void testDeserialize_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:344)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:223)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        documentDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String text = p.getValueAsString();
 *  */
    @Test
    public void testDeserialize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
            TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            char[] _inputBuffer = {'\u0000'};
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
            ArrayList _segments = new ArrayList();
            _segments.add(null);
            _segments.add(null);
            _segments.add(null);
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
            String _resultString = "";
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _inputBuffer);
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
            JsonToken _currToken = JsonToken.VALUE_STRING;
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:591)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:221)
                com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
                com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
            documentDeserializer.deserialize(jsonParserDelegate, null);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String text = p.getValueAsString();
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() throws IOException  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        std.deserialize(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String text = p.getValueAsString();
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_3() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:221)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        uUIDDeserializer.deserialize(uTF8DataInputJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String text = p.getValueAsString();
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_1() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:221)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        std.deserialize(jsonParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_2() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        char[] _resultArray = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:587)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:221)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        uUIDDeserializer.deserialize(jsonParserDelegate, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link FromStringDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getValueAsString()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#_deserialize(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.RuntimeException} when: _deserialize(text, ctxt) != null
 *  */
    @Test(expected = RuntimeException.class)
    public void testDeserialize_ThrowRuntimeException() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 14);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        std.deserialize(jsonParserSequence, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    /// Actual number of generated tests (74) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test
    public void testDeserialize1() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "\u0001\u0001\u0001\u0000\u0000\u0000\u0000";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = uUIDDeserializer.deserialize(jsonParserSequence, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize2() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = nodeDeserializer.deserialize(jsonParserSequence, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize3() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 7);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Pattern actual = ((Pattern) std.deserialize(jsonParserSequence, impl));
        
        Pattern expected = ((Pattern) createInstance("java.util.regex.Pattern"));
        
    }
    
    @Test
    public void testDeserialize4() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 3);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        URI actual = ((URI) std.deserialize(jsonParserSequence, impl));
        
        URI expected = ((URI) createInstance("java.net.URI"));
        
        // java.net.URI has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize5() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 12);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        InetSocketAddress actual = ((InetSocketAddress) std.deserialize(jsonParserSequence, impl));
        
        InetSocketAddress expected = ((InetSocketAddress) createInstance("java.net.InetSocketAddress"));
        
        // java.net.InetSocketAddress has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize6() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Locale actual = ((Locale) std.deserialize(jsonParserSequence, impl));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize7() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 1);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        File actual = ((File) std.deserialize(jsonParserSequence, impl));
        
        File expected = ((File) createInstance("java.io.File"));
        
        // java.io.File has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize8() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 1);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        File actual = ((File) std.deserialize(jsonParserSequence, impl));
        
        File expected = ((File) createInstance("java.io.File"));
        
        // java.io.File has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize9() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 13);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        StringBuilder actual = ((StringBuilder) std.deserialize(jsonParserSequence, null));
        
        StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        
    }
    
    @Test
    public void testDeserialize10() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = std.deserialize(jsonParserSequence, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize11() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Locale actual = ((Locale) std.deserialize(jsonParserSequence, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize12() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 13);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        StringBuilder actual = ((StringBuilder) std.deserialize(jsonParserDelegate, impl));
        
        StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        
    }
    
    @Test
    public void testDeserialize13() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 13);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        StringBuilder actual = ((StringBuilder) std.deserialize(jsonParserSequence, null));
        
        StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        
    }
    
    @Test
    public void testDeserialize14() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 12);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        InetSocketAddress actual = ((InetSocketAddress) std.deserialize(jsonParserDelegate, impl));
        
        InetSocketAddress expected = ((InetSocketAddress) createInstance("java.net.InetSocketAddress"));
        
        // java.net.InetSocketAddress has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize15() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Locale actual = ((Locale) std.deserialize(jsonParserDelegate, impl));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize16() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 7);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Pattern actual = ((Pattern) std.deserialize(jsonParserDelegate, impl));
        
        Pattern expected = ((Pattern) createInstance("java.util.regex.Pattern"));
        
    }
    
    @Test
    public void testDeserialize17() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "\u0001\u0001\u0001\u0000\u0000\u0000\u0000";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = std.deserialize(jsonParserSequence, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize18() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 3);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        URI actual = ((URI) std.deserialize(jsonParserDelegate, impl));
        
        URI expected = ((URI) createInstance("java.net.URI"));
        
        // java.net.URI has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize19() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 13);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        StringBuilder actual = ((StringBuilder) std.deserialize(jsonParserDelegate, impl));
        
        StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        
    }
    
    @Test
    public void testDeserialize20() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        Object actual = uUIDDeserializer.deserialize(uTF8DataInputJsonParser, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize21() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        Object actual = uUIDDeserializer.deserialize(uTF8DataInputJsonParser, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize22() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 13);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = new char[16];
        _resultArray[0] = '!';
        _resultArray[1] = '}';
        _resultArray[2] = '}';
        _resultArray[3] = '}';
        _resultArray[4] = '}';
        _resultArray[5] = '}';
        _resultArray[6] = '}';
        _resultArray[7] = '}';
        _resultArray[8] = '}';
        _resultArray[9] = '}';
        _resultArray[10] = '}';
        _resultArray[11] = '}';
        _resultArray[12] = '}';
        _resultArray[13] = '}';
        _resultArray[14] = '}';
        _resultArray[15] = '!';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        StringBuilder actual = ((StringBuilder) std.deserialize(jsonParserDelegate, impl));
        
        StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        
    }
    
    @Test
    public void testDeserialize23() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 1);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = new char[16];
        _resultArray[0] = '!';
        _resultArray[1] = '}';
        _resultArray[2] = '}';
        _resultArray[3] = '}';
        _resultArray[4] = '}';
        _resultArray[5] = '}';
        _resultArray[6] = '}';
        _resultArray[7] = '}';
        _resultArray[8] = '}';
        _resultArray[9] = '}';
        _resultArray[10] = '}';
        _resultArray[11] = '}';
        _resultArray[12] = '}';
        _resultArray[13] = '}';
        _resultArray[14] = '}';
        _resultArray[15] = '!';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        File actual = ((File) std.deserialize(jsonParserDelegate, impl));
        
        File expected = ((File) createInstance("java.io.File"));
        
        // java.io.File has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize24() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = new char[16];
        _resultArray[0] = '!';
        _resultArray[1] = '}';
        _resultArray[2] = '}';
        _resultArray[3] = '}';
        _resultArray[4] = '}';
        _resultArray[5] = '}';
        _resultArray[6] = '}';
        _resultArray[7] = '}';
        _resultArray[8] = '}';
        _resultArray[9] = '}';
        _resultArray[10] = '}';
        _resultArray[11] = '}';
        _resultArray[12] = '}';
        _resultArray[13] = '}';
        _resultArray[14] = '}';
        _resultArray[15] = '!';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Locale actual = ((Locale) std.deserialize(jsonParserDelegate, impl));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize25() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 13);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        StringBuilder actual = ((StringBuilder) std.deserialize(jsonParserSequence, impl));
        
        StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        
    }
    
    @Test
    public void testDeserialize26() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = documentDeserializer.deserialize(jsonParserDelegate, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize27() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "\u0000";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = std.deserialize(jsonParserSequence, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize28() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0001'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = std.deserialize(jsonParserSequence, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize29() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 3);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        URI actual = ((URI) std.deserialize(jsonParserSequence, impl));
        
        URI expected = ((URI) createInstance("java.net.URI"));
        
        // java.net.URI has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize30() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = nodeDeserializer.deserialize(jsonParserSequence, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize31() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = documentDeserializer.deserialize(jsonParserDelegate, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize32() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "\u0001";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = documentDeserializer.deserialize(jsonParserDelegate1, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize33() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 29);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = documentDeserializer.deserialize(jsonParserDelegate, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize34() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 13);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        StringBuilder actual = ((StringBuilder) std.deserialize(jsonParserDelegate1, impl));
        
        StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        
    }
    
    @Test
    public void testDeserialize35() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 13);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        StringBuilder actual = ((StringBuilder) std.deserialize(jsonParserDelegate, null));
        
        StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        
    }
    
    @Test
    public void testDeserialize36() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 29);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = documentDeserializer.deserialize(jsonParserSequence, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize37() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[16];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        Object actual = std.deserialize(uTF8DataInputJsonParser, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize38() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        Object actual = uUIDDeserializer.deserialize(jsonParserDelegate, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize39() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        Locale actual = ((Locale) std.deserialize(jsonParserDelegate1, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize40() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = uUIDDeserializer.deserialize(jsonParserSequence, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize41() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 3);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[40];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '!';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '}';
        _inputBuffer[38] = '}';
        _inputBuffer[39] = '}';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 30);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        URI actual = ((URI) std.deserialize(jsonParserDelegate, null));
        
        URI expected = ((URI) createInstance("java.net.URI"));
        
        // java.net.URI has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize42() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 7);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[40];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '!';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '}';
        _inputBuffer[38] = '}';
        _inputBuffer[39] = '}';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 30);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        Pattern actual = ((Pattern) std.deserialize(jsonParserDelegate, null));
        
        Pattern expected = ((Pattern) createInstance("java.util.regex.Pattern"));
        
    }
    
    @Test
    public void testDeserialize43() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[32];
        _currentSegment[1] = '}';
        _currentSegment[2] = '}';
        _currentSegment[3] = '}';
        _currentSegment[4] = '}';
        _currentSegment[5] = '}';
        _currentSegment[6] = '}';
        _currentSegment[7] = '}';
        _currentSegment[8] = '}';
        _currentSegment[9] = '}';
        _currentSegment[10] = '}';
        _currentSegment[11] = '}';
        _currentSegment[12] = '}';
        _currentSegment[13] = '}';
        _currentSegment[14] = '}';
        _currentSegment[15] = '}';
        _currentSegment[16] = '}';
        _currentSegment[17] = '}';
        _currentSegment[18] = '}';
        _currentSegment[19] = '}';
        _currentSegment[20] = '}';
        _currentSegment[21] = '}';
        _currentSegment[22] = '}';
        _currentSegment[23] = '}';
        _currentSegment[24] = '}';
        _currentSegment[25] = '}';
        _currentSegment[26] = '}';
        _currentSegment[27] = '}';
        _currentSegment[28] = '}';
        _currentSegment[29] = '}';
        _currentSegment[30] = '}';
        _currentSegment[31] = '}';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = std.deserialize(jsonParserDelegate, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize44() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[32];
        _currentSegment[1] = '}';
        _currentSegment[2] = '}';
        _currentSegment[3] = '}';
        _currentSegment[4] = '}';
        _currentSegment[5] = '}';
        _currentSegment[6] = '}';
        _currentSegment[7] = '}';
        _currentSegment[8] = '}';
        _currentSegment[9] = '}';
        _currentSegment[10] = '}';
        _currentSegment[11] = '}';
        _currentSegment[12] = '}';
        _currentSegment[13] = '}';
        _currentSegment[14] = '}';
        _currentSegment[15] = '}';
        _currentSegment[16] = '}';
        _currentSegment[17] = '}';
        _currentSegment[18] = '}';
        _currentSegment[19] = '}';
        _currentSegment[20] = '}';
        _currentSegment[21] = '}';
        _currentSegment[22] = '}';
        _currentSegment[23] = '}';
        _currentSegment[24] = '}';
        _currentSegment[25] = '}';
        _currentSegment[26] = '}';
        _currentSegment[27] = '}';
        _currentSegment[28] = '}';
        _currentSegment[29] = '}';
        _currentSegment[30] = '}';
        _currentSegment[31] = '}';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = documentDeserializer.deserialize(jsonParserDelegate1, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize45() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 3);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        URI actual = ((URI) std.deserialize(jsonParserDelegate1, impl));
        
        URI expected = ((URI) createInstance("java.net.URI"));
        
        // java.net.URI has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize46() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 3);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        URI actual = ((URI) std.deserialize(jsonParserSequence, null));
        
        URI expected = ((URI) createInstance("java.net.URI"));
        
        // java.net.URI has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize47() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        Object actual = std.deserialize(jsonParserDelegate, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize48() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 13);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        StringBuilder actual = ((StringBuilder) std.deserialize(jsonParserDelegate1, null));
        
        StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        
    }
    
    @Test
    public void testDeserialize49() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        Locale actual = ((Locale) std.deserialize(jsonParserDelegate1, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize50() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        Object actual = uUIDDeserializer.deserialize(jsonParserDelegate1, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    /// Actual number of generated tests (107) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test
    public void testDeserialize51() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.StringIndexOutOfBoundsException: offset 1, count 1, length 1]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:337)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString(ParserMinimalBase.java:404)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:228)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        nodeDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize52() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.StringIndexOutOfBoundsException: offset 1, count 1, length 1]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:337)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:223)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        nodeDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize53() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MAX_VALUE);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 2147483647, length 6]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:344)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:223)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        nodeDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize54() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483647);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NegativeArraySizeException: -2147483646]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuilder.<init>(StringBuilder.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:346)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:223)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        uUIDDeserializer.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize55() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483647);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NegativeArraySizeException: -2147483646]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuilder.<init>(StringBuilder.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:346)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString(ParserMinimalBase.java:404)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:228)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        std.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize56() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        ArrayList _segments = new ArrayList();
        char[] charArray = {};
        _segments.add(charArray);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.IndexOutOfBoundsException: start 0, end 9, length 1]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:223)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        uUIDDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize57() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483647);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NegativeArraySizeException: -2147483646]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuilder.<init>(StringBuilder.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:346)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:223)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        std.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize58() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483647);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NegativeArraySizeException: -2147483646]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuilder.<init>(StringBuilder.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:346)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString(ParserMinimalBase.java:404)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:228)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        std.deserialize(jsonParserDelegate1, null);
    }
    
    @Test
    public void testDeserialize59() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
            TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            char[][] _charBuffers = {};
            setField(_allocator, "com.fasterxml.jackson.core.util.BufferRecycler", "_charBuffers", _charBuffers);
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            ArrayList _segments = new ArrayList();
            _segments.add(null);
            _segments.add(null);
            _segments.add(null);
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
            setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
            JsonToken _currToken = JsonToken.VALUE_STRING;
            setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:591)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:221)
                com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
                com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
                com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
            documentDeserializer.deserialize(jsonParserSequence, null);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    @Test
    public void testDeserialize60() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1100)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1075)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:158) */
        nodeDeserializer.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize61() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1100)
            com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer._deserializeFromArray(StdScalarDeserializer.java:56)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:145) */
        nodeDeserializer.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize62() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer._deserializeFromArray(StdScalarDeserializer.java:38)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:145) */
        uUIDDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize63() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:135) */
        nodeDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize64() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:158) */
        uUIDDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize65() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdStringValue(DeserializationContext.java:911)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._badFormat(UUIDDeserializer.java:79)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:48)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:13)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
        uUIDDeserializer.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize66() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString(ParserMinimalBase.java:404)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:228)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        documentDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize67() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdStringValue(DeserializationContext.java:911)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._badFormat(UUIDDeserializer.java:79)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:13)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
        uUIDDeserializer.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize68() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "!";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:135) */
        documentDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize69() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 3);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdStringException(DeserializationContext.java:1412)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:135) */
        std.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize70() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = new char[17];
        _resultArray[0] = '!';
        _resultArray[1] = '}';
        _resultArray[2] = '}';
        _resultArray[3] = '}';
        _resultArray[4] = '}';
        _resultArray[5] = '}';
        _resultArray[6] = '}';
        _resultArray[7] = '}';
        _resultArray[8] = '}';
        _resultArray[9] = '}';
        _resultArray[10] = '}';
        _resultArray[11] = '}';
        _resultArray[12] = '}';
        _resultArray[13] = '}';
        _resultArray[14] = '}';
        _resultArray[15] = '\u0001';
        _resultArray[16] = '\u0001';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:135) */
        nodeDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize71() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:158) */
        documentDeserializer.deserialize(jsonParserDelegate1, null);
    }
    
    @Test
    public void testDeserialize72() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:135) */
        documentDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize73() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._badFormat(UUIDDeserializer.java:79)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:13)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
        uUIDDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize74() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483647);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:344)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:223)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        uUIDDeserializer.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize75() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'!'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:135) */
        nodeDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize76() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 2);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = new char[16];
        _resultArray[0] = '!';
        _resultArray[1] = '}';
        _resultArray[2] = '}';
        _resultArray[3] = '}';
        _resultArray[4] = '}';
        _resultArray[5] = '}';
        _resultArray[6] = '}';
        _resultArray[7] = '}';
        _resultArray[8] = '}';
        _resultArray[9] = '}';
        _resultArray[10] = '}';
        _resultArray[11] = '}';
        _resultArray[12] = '}';
        _resultArray[13] = '}';
        _resultArray[14] = '}';
        _resultArray[15] = '!';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdStringException(DeserializationContext.java:1412)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:135) */
        std.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize77() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {'!', ' '};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._badFormat(UUIDDeserializer.java:79)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:13)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
        uUIDDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize78() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 2);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:135) */
        std.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize79() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._badFormat(UUIDDeserializer.java:79)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:13)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
        uUIDDeserializer.deserialize(jsonParserDelegate1, null);
    }
    
    @Test
    public void testDeserialize80() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 4);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "!";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.instantiationException(DeserializationContext.java:1443)
            com.fasterxml.jackson.databind.DeserializationContext.handleInstantiationProblem(DeserializationContext.java:1055)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:225)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
        std.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize81() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[32];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '!';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 29);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:135) */
        documentDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize82() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1073741827);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer._deserializeFromArray(StdScalarDeserializer.java:38)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:145) */
        documentDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize83() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:223)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        documentDeserializer.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize84() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483647);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:344)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString(ParserMinimalBase.java:404)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:228)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        uUIDDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize85() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 4);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.instantiationException(DeserializationContext.java:1443)
            com.fasterxml.jackson.databind.DeserializationContext.handleInstantiationProblem(DeserializationContext.java:1055)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:225)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
        std.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize86() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 5);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:229)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
        std.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize87() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 4);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'.', '}', '!'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.instantiationException(DeserializationContext.java:1443)
            com.fasterxml.jackson.databind.DeserializationContext.handleInstantiationProblem(DeserializationContext.java:1055)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:225)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
        std.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize88() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 4);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'.', '}', '!'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object _classLoader = createInstance("jdk.internal.loader.ClassLoaders$BootClassLoader");
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader", _classLoader);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.instantiationException(DeserializationContext.java:1443)
            com.fasterxml.jackson.databind.DeserializationContext.handleInstantiationProblem(DeserializationContext.java:1055)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:225)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
        std.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize89() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1856)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:221)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        std.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize90() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1100)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1075)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:158) */
        std.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize91() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 4);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'}', '}', '}', '}', '}', '}', '!', '}'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 6);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.instantiationException(DeserializationContext.java:1443)
            com.fasterxml.jackson.databind.DeserializationContext.handleInstantiationProblem(DeserializationContext.java:1055)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:225)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
        std.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize92() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 5);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'}', '}', '}', '}', '}', '}', '!', '}'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 6);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:229)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
        std.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize93() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        _segments.add(charArray);
        char[] charArray1 = {};
        _segments.add(charArray1);
        _segments.add(charArray1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._badFormat(UUIDDeserializer.java:79)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:13)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
        uUIDDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize94() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString(ParserMinimalBase.java:404)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:228)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        std.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize95() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        char[] charArray = {};
        _segments.add(charArray);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1100)
            com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer._deserializeFromArray(StdScalarDeserializer.java:56)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:145) */
        nodeDeserializer.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize96() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:587)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:221)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        nodeDeserializer.deserialize(jsonParserDelegate1, null);
    }
    
    @Test
    public void testDeserialize97() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        char[] charArray = {};
        _segments.add(charArray);
        char[] charArray1 = {};
        _segments.add(charArray1);
        _segments.add(charArray1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString(ParserMinimalBase.java:404)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:228)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        nodeDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize98() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:223)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        std.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize99() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        char[] charArray = {};
        _segments.add(charArray);
        char[] charArray1 = {};
        _segments.add(charArray1);
        _segments.add(charArray1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentName(ParserBase.java:395)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:226)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        documentDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize100() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        char[] charArray = {};
        _segments.add(charArray);
        char[] charArray1 = {};
        _segments.add(charArray1);
        _segments.add(charArray1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString(ParserMinimalBase.java:404)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:228)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:108) */
        uUIDDeserializer.deserialize(jsonParserDelegate, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserialize101() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        nodeDeserializer.deserialize(jsonParserSequence, impl);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserialize102() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "\u0001\u0001\u0001!";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        nodeDeserializer.deserialize(jsonParserSequence, impl);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserialize103() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        nodeDeserializer.deserialize(jsonParserSequence, impl);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserialize104() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        nodeDeserializer.deserialize(uTF8DataInputJsonParser, impl);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserialize105() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        nodeDeserializer.deserialize(jsonParserDelegate, impl);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserialize106() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        documentDeserializer.deserialize(jsonParserSequence, impl);
    }
    
    @Test(expected = UnknownHostException.class)
    public void testDeserialize107() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        std.deserialize(jsonParserSequence, impl);
    }
    
    @Test(expected = UnknownHostException.class)
    public void testDeserialize108() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!\u0000!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        std.deserialize(jsonParserDelegate, impl);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserialize109() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "\u0001\u0001!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        documentDeserializer.deserialize(jsonParserDelegate1, impl);
    }
    
    @Test(expected = UnknownHostException.class)
    public void testDeserialize110() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        std.deserialize(jsonParserSequence, null);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserialize111() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[34];
        _currentSegment[0] = '!';
        _currentSegment[1] = '\u0001';
        _currentSegment[2] = '\u0001';
        _currentSegment[3] = '}';
        _currentSegment[4] = '}';
        _currentSegment[5] = '}';
        _currentSegment[6] = '}';
        _currentSegment[7] = '}';
        _currentSegment[8] = '}';
        _currentSegment[9] = '}';
        _currentSegment[10] = '}';
        _currentSegment[11] = '}';
        _currentSegment[12] = '}';
        _currentSegment[13] = '}';
        _currentSegment[14] = '}';
        _currentSegment[15] = '}';
        _currentSegment[16] = '}';
        _currentSegment[17] = '}';
        _currentSegment[18] = '}';
        _currentSegment[19] = '}';
        _currentSegment[20] = '}';
        _currentSegment[21] = '}';
        _currentSegment[22] = '}';
        _currentSegment[23] = '}';
        _currentSegment[24] = '}';
        _currentSegment[25] = '}';
        _currentSegment[26] = '}';
        _currentSegment[27] = '}';
        _currentSegment[28] = '}';
        _currentSegment[29] = '}';
        _currentSegment[30] = '}';
        _currentSegment[31] = '}';
        _currentSegment[32] = '}';
        _currentSegment[33] = '}';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 3);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        nodeDeserializer.deserialize(jsonParserDelegate, impl);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserialize112() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        documentDeserializer.deserialize(jsonParserDelegate2, impl);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserialize113() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[32];
        _currentSegment[0] = '!';
        _currentSegment[1] = '}';
        _currentSegment[2] = '}';
        _currentSegment[3] = '\u0001';
        _currentSegment[4] = '\u0001';
        _currentSegment[5] = '}';
        _currentSegment[6] = '}';
        _currentSegment[7] = '}';
        _currentSegment[8] = '}';
        _currentSegment[9] = '}';
        _currentSegment[10] = '}';
        _currentSegment[11] = '}';
        _currentSegment[12] = '}';
        _currentSegment[13] = '}';
        _currentSegment[14] = '}';
        _currentSegment[15] = '}';
        _currentSegment[16] = '}';
        _currentSegment[17] = '}';
        _currentSegment[18] = '}';
        _currentSegment[19] = '}';
        _currentSegment[20] = '}';
        _currentSegment[21] = '}';
        _currentSegment[22] = '}';
        _currentSegment[23] = '}';
        _currentSegment[24] = '}';
        _currentSegment[25] = '}';
        _currentSegment[26] = '}';
        _currentSegment[27] = '}';
        _currentSegment[28] = '}';
        _currentSegment[29] = '}';
        _currentSegment[30] = '}';
        _currentSegment[31] = '}';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        nodeDeserializer.deserialize(jsonParserDelegate1, impl);
    }
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserialize114() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        _segments.add(charArray);
        char[] charArray1 = {};
        _segments.add(charArray1);
        _segments.add(charArray1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        nodeDeserializer.deserialize(jsonParserDelegate, impl);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = RuntimeException.class)
    public void testDeserialize115() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        std.deserialize(jsonParserSequence, impl);
    }
    
    @Test(expected = RuntimeException.class)
    public void testDeserialize116() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        std.deserialize(jsonParserSequence, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testDeserialize117() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = new char[16];
        _resultArray[0] = '!';
        _resultArray[1] = '}';
        _resultArray[2] = '}';
        _resultArray[3] = '}';
        _resultArray[4] = '}';
        _resultArray[5] = '}';
        _resultArray[6] = '}';
        _resultArray[7] = '}';
        _resultArray[8] = '}';
        _resultArray[9] = '}';
        _resultArray[10] = '}';
        _resultArray[11] = '}';
        _resultArray[12] = '}';
        _resultArray[13] = '}';
        _resultArray[14] = '}';
        _resultArray[15] = '!';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        std.deserialize(jsonParserSequence, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testDeserialize118() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[33];
        _inputBuffer[1] = '!';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '!';
        _inputBuffer[31] = '\u0001';
        _inputBuffer[32] = '}';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 32);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        std.deserialize(jsonParserSequence, impl);
    }
    
    @Test(expected = RuntimeException.class)
    public void testDeserialize119() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[34];
        _currentSegment[1] = '\u0081';
        _currentSegment[2] = '\u0001';
        _currentSegment[3] = '}';
        _currentSegment[4] = '}';
        _currentSegment[5] = '}';
        _currentSegment[6] = '}';
        _currentSegment[7] = '}';
        _currentSegment[8] = '}';
        _currentSegment[9] = '}';
        _currentSegment[10] = '}';
        _currentSegment[11] = '}';
        _currentSegment[12] = '}';
        _currentSegment[13] = '}';
        _currentSegment[14] = '}';
        _currentSegment[15] = '}';
        _currentSegment[16] = '}';
        _currentSegment[17] = '}';
        _currentSegment[18] = '}';
        _currentSegment[19] = '}';
        _currentSegment[20] = '}';
        _currentSegment[21] = '}';
        _currentSegment[22] = '}';
        _currentSegment[23] = '}';
        _currentSegment[24] = '}';
        _currentSegment[25] = '}';
        _currentSegment[26] = '}';
        _currentSegment[27] = '}';
        _currentSegment[28] = '}';
        _currentSegment[29] = '}';
        _currentSegment[30] = '}';
        _currentSegment[31] = '}';
        _currentSegment[32] = '}';
        _currentSegment[33] = '}';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 3);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        std.deserialize(jsonParserDelegate1, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testDeserialize120() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        std.deserialize(jsonParserSequence, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserialize121() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 5);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        std.deserialize(jsonParserSequence, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserialize122() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 5);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = new char[16];
        _resultArray[0] = '!';
        _resultArray[1] = '}';
        _resultArray[2] = '}';
        _resultArray[3] = '}';
        _resultArray[4] = '}';
        _resultArray[5] = '}';
        _resultArray[6] = '}';
        _resultArray[7] = '}';
        _resultArray[8] = '}';
        _resultArray[9] = '}';
        _resultArray[10] = '}';
        _resultArray[11] = '}';
        _resultArray[12] = '}';
        _resultArray[13] = '}';
        _resultArray[14] = '}';
        _resultArray[15] = '!';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        std.deserialize(jsonParserSequence, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserialize123() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 5);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        std.deserialize(jsonParserDelegate, impl);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testDeserialize124() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = new char[16];
        _resultArray[0] = '!';
        _resultArray[1] = '}';
        _resultArray[2] = '}';
        _resultArray[3] = '}';
        _resultArray[4] = '}';
        _resultArray[5] = '}';
        _resultArray[6] = '}';
        _resultArray[7] = '}';
        _resultArray[8] = '}';
        _resultArray[9] = '}';
        _resultArray[10] = '}';
        _resultArray[11] = '}';
        _resultArray[12] = '}';
        _resultArray[13] = '}';
        _resultArray[14] = '}';
        _resultArray[15] = '!';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.security.AccessControlException: access denied ("java.net.SocketPermission" "!}}}}}}}}}}}}}}!" "resolve")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkConnect(SecurityManager.java:916)
            java.base/java.net.InetAddress.getAllByName0(InetAddress.java:1480)
            java.base/java.net.InetAddress.getAllByName(InetAddress.java:1384)
            java.base/java.net.InetAddress.getAllByName(InetAddress.java:1305)
            java.base/java.net.InetAddress.getByName(InetAddress.java:1255)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:256)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testDeserialize125() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 12);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = new char[16];
        _resultArray[0] = '!';
        _resultArray[1] = '}';
        _resultArray[2] = '}';
        _resultArray[3] = '}';
        _resultArray[4] = '}';
        _resultArray[5] = '}';
        _resultArray[6] = '}';
        _resultArray[7] = '}';
        _resultArray[8] = '}';
        _resultArray[9] = '}';
        _resultArray[10] = '}';
        _resultArray[11] = '}';
        _resultArray[12] = '}';
        _resultArray[13] = '}';
        _resultArray[14] = '}';
        _resultArray[15] = '!';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.security.AccessControlException: access denied ("java.net.SocketPermission" "!}}}}}}}}}}}}}}!" "resolve")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkConnect(SecurityManager.java:916)
            java.base/java.net.InetAddress.getAllByName0(InetAddress.java:1480)
            java.base/java.net.InetAddress.getAllByName(InetAddress.java:1384)
            java.base/java.net.InetAddress.getAllByName(InetAddress.java:1305)
            java.base/java.net.InetAddress.getByName(InetAddress.java:1255)
            java.base/java.net.InetSocketAddress.<init>(InetSocketAddress.java:229)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:279)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testDeserialize126() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[40];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '!';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '}';
        _inputBuffer[38] = '}';
        _inputBuffer[39] = '}';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 30);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.security.AccessControlException: access denied ("java.net.SocketPermission" "!" "resolve")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkConnect(SecurityManager.java:916)
            java.base/java.net.InetAddress.getAllByName0(InetAddress.java:1480)
            java.base/java.net.InetAddress.getAllByName(InetAddress.java:1384)
            java.base/java.net.InetAddress.getAllByName(InetAddress.java:1305)
            java.base/java.net.InetAddress.getByName(InetAddress.java:1255)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:256)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testDeserialize127() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 12);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[40];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '!';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '}';
        _inputBuffer[38] = '}';
        _inputBuffer[39] = '}';
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 30);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize] produces [java.security.AccessControlException: access denied ("java.net.SocketPermission" "!" "resolve")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkConnect(SecurityManager.java:916)
            java.base/java.net.InetAddress.getAllByName0(InetAddress.java:1480)
            java.base/java.net.InetAddress.getAllByName(InetAddress.java:1384)
            java.base/java.net.InetAddress.getAllByName(InetAddress.java:1305)
            java.base/java.net.InetAddress.getByName(InetAddress.java:1255)
            java.base/java.net.InetSocketAddress.<init>(InetSocketAddress.java:229)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:279)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(FromStringDeserializer.java:119) */
    }
    ///endregion
    
    ///region Errors report for deserialize
    
    public void testDeserialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Concrete execution failed
        
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
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#reportMappingException(java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.reportMappingException("Don't know how to convert embedded Object of type %s into %s", ob.getClass().getName(), _valueClass.getName());
 *  */
    @Test
    public void test_deserializeEmbedded_ThrowNullPointerException_2() throws IOException  {
        Class class1 = Object.class;
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(class1, 0);
        short[] shortArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeEmbedded] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeEmbedded(FromStringDeserializer.java:165) */
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
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeEmbedded(FromStringDeserializer.java:166) */
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
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeEmbedded(FromStringDeserializer.java:166) */
        std._deserializeEmbedded(null, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _deserializeEmbedded(java.lang.Object, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = JsonMappingException.class)
    public void test_deserializeEmbedded1() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        Object object = new Object();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        documentDeserializer._deserializeEmbedded(object, impl);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1084857233996100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1084857233996100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1084857234002800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1084857233996100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1084857234002800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1084857234408600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1084857234408600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1084857234410600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1084857234408600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1084857234410600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1084857235181400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1084857235181400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1084857235182700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1084857235181400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1084857235182700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

