package com.fasterxml.jackson.databind.node;

import org.junit.Test;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.TreeMap;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.util.Separators;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.IOException;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.PrintWriter;
import java.util.concurrent.atomic.LongAdder;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.util.RawValue;
import com.fasterxml.jackson.core.JsonToken;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_databind_node_POJONodeTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.node.POJONode.serialize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method serialize(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): True}
 *  */
    @Test
    public void testSerialize__valueEqualsNull() throws Exception  {
        POJONode pOJONode = new POJONode(null);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 11);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 16);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer", true);
        
        pOJONode.serialize(writerBasedJsonGenerator, impl);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer11 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 11));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer12 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 12));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer13 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 13));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer14 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 14));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer11);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer12);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer13);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer14);
        
        assertEquals(15, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): True}
 *  */
    @Test
    public void testSerialize__valueEqualsNull_1() throws Exception  {
        POJONode pOJONode = new POJONode(null);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 7);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 7);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 11);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer", true);
        
        pOJONode.serialize(writerBasedJsonGenerator, impl);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer7 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 7));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer8 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 8));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer9 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 9));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer10 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 10));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer7);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer8);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer9);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer10);
        
        assertEquals(11, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): False}
 *  */
    @Test
    public void testSerialize_Not_valueNotInstanceOfJsonSerializable_2() throws Exception  {
        byte[] byteArray = {(byte) 0};
        POJONode pOJONode = new POJONode(byteArray);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_next", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 16);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        Object initialTokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        
        pOJONode.serialize(tokenBuffer, null);
        
        Object finalTokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 *  */
    @Test
    public void testSerialize__valueInstanceOfJsonSerializable_1() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(true);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[31];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 26);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 32);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        pOJONode.serialize(writerBasedJsonGenerator, null);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer26 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 26));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer27 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 27));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer28 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 28));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer29 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 29));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('t', finalWriterBasedJsonGenerator_outputBuffer26);
        
        assertEquals('r', finalWriterBasedJsonGenerator_outputBuffer27);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer28);
        
        assertEquals('e', finalWriterBasedJsonGenerator_outputBuffer29);
        
        assertEquals(30, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 *  */
    @Test
    public void testSerialize__valueInstanceOfJsonSerializable() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(false);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 10);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 16);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        pOJONode.serialize(writerBasedJsonGenerator, null);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer10 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 10));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer11 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 11));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer12 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 12));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer13 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 13));
        char[] writerBasedJsonGenerator_outputBuffer4 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer14 = ((Character) get(writerBasedJsonGenerator_outputBuffer4, 14));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('f', finalWriterBasedJsonGenerator_outputBuffer10);
        
        assertEquals('a', finalWriterBasedJsonGenerator_outputBuffer11);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer12);
        
        assertEquals('s', finalWriterBasedJsonGenerator_outputBuffer13);
        
        assertEquals('e', finalWriterBasedJsonGenerator_outputBuffer14);
        
        assertEquals(15, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): False}
 *  */
    @Test
    public void testSerialize_Not_valueNotInstanceOfJsonSerializable() throws Exception  {
        byte[] byteArray = {(byte) 0};
        POJONode pOJONode = new POJONode(byteArray);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        java.lang.Object[] tokenBuffer_last_last_tokens = ((java.lang.Object[]) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens"));
        Object initialTokenBuffer_last_tokens0 = get(tokenBuffer_last_last_tokens, 0);
        
        pOJONode.serialize(tokenBuffer, null);
        
        Object tokenBuffer_last1 = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last1, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
        Object tokenBuffer_last2 = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        java.lang.Object[] tokenBuffer_last2_last_tokens = ((java.lang.Object[]) getFieldValue(tokenBuffer_last2, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens"));
        Object finalTokenBuffer_last_tokens0 = get(tokenBuffer_last2_last_tokens, 0);
        int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
        JsonWriteContext tokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
        int finalTokenBuffer_writeContext_index = ((Integer) getFieldValue(tokenBuffer_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(6L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
        
        assertEquals(1, finalTokenBuffer_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): False}
 *  */
    @Test
    public void testSerialize_Not_valueNotInstanceOfJsonSerializable_1() throws Exception  {
        byte[] byteArray = {(byte) 0};
        POJONode pOJONode = new POJONode(byteArray);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        java.lang.Object[] tokenBuffer_last_last_tokens = ((java.lang.Object[]) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens"));
        Object initialTokenBuffer_last_tokens1 = get(tokenBuffer_last_last_tokens, 1);
        
        pOJONode.serialize(tokenBuffer, null);
        
        Object tokenBuffer_last1 = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last1, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
        Object tokenBuffer_last2 = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        java.lang.Object[] tokenBuffer_last2_last_tokens = ((java.lang.Object[]) getFieldValue(tokenBuffer_last2, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens"));
        Object finalTokenBuffer_last_tokens1 = get(tokenBuffer_last2_last_tokens, 1);
        int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
        JsonWriteContext tokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
        int finalTokenBuffer_writeContext_index = ((Integer) getFieldValue(tokenBuffer_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertFalse(initialTokenBuffer_last_tokens1 == finalTokenBuffer_last_tokens1);
        
        assertEquals(96L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
        
        assertEquals(1, finalTokenBuffer_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): False}
 *  */
    @Test
    public void testSerialize_Not_valueNotInstanceOfJsonSerializable_3() throws Exception  {
        byte[] byteArray = {(byte) 0};
        POJONode pOJONode = new POJONode(byteArray);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        java.lang.Object[] tokenBuffer_last_last_tokens = ((java.lang.Object[]) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens"));
        Object initialTokenBuffer_last_tokens0 = get(tokenBuffer_last_last_tokens, 0);
        
        pOJONode.serialize(tokenBuffer, null);
        
        Object tokenBuffer_last1 = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last1, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
        Object tokenBuffer_last2 = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        java.lang.Object[] tokenBuffer_last2_last_tokens = ((java.lang.Object[]) getFieldValue(tokenBuffer_last2, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens"));
        Object finalTokenBuffer_last_tokens0 = get(tokenBuffer_last2_last_tokens, 0);
        int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
        JsonWriteContext tokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
        int finalTokenBuffer_writeContext_index = ((Integer) getFieldValue(tokenBuffer_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(6L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
        
        assertEquals(1, finalTokenBuffer_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): False}
 *  */
    @Test
    public void testSerialize_Not_valueNotInstanceOfJsonSerializable_4() throws Exception  {
        byte[] byteArray = {(byte) 0};
        POJONode pOJONode = new POJONode(byteArray);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 1);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        java.lang.Object[] tokenBuffer_last_last_tokens = ((java.lang.Object[]) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens"));
        Object initialTokenBuffer_last_tokens1 = get(tokenBuffer_last_last_tokens, 1);
        
        pOJONode.serialize(tokenBuffer, null);
        
        Object tokenBuffer_last1 = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last1, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
        Object tokenBuffer_last2 = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        java.lang.Object[] tokenBuffer_last2_last_tokens = ((java.lang.Object[]) getFieldValue(tokenBuffer_last2, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens"));
        Object finalTokenBuffer_last_tokens1 = get(tokenBuffer_last2_last_tokens, 1);
        int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
        
        assertFalse(initialTokenBuffer_last_tokens1 == finalTokenBuffer_last_tokens1);
        
        assertEquals(96L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serialize(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ctxt.defaultSerializeNull(gen);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        POJONode pOJONode = new POJONode(null);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 5);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1672)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:831)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeNull(SerializerProvider.java:1125)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:108) */
        pOJONode.serialize(writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ctxt.defaultSerializeNull(gen);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        POJONode pOJONode = new POJONode(null);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 12);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 17);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1674)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:831)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeNull(SerializerProvider.java:1125)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:108) */
        pOJONode.serialize(writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ctxt.defaultSerializeNull(gen);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        POJONode pOJONode = new POJONode(null);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -3 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1671)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:831)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeNull(SerializerProvider.java:1125)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:108) */
        pOJONode.serialize(writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ctxt.defaultSerializeNull(gen);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        POJONode pOJONode = new POJONode(null);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:872)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:830)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeNull(SerializerProvider.java:1125)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:108) */
        pOJONode.serialize(writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ctxt.defaultSerializeNull(gen);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        POJONode pOJONode = new POJONode(null);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 7);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1671)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:831)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeNull(SerializerProvider.java:1125)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:108) */
        pOJONode.serialize(writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ctxt.defaultSerializeNull(gen);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_16() throws Exception  {
        POJONode pOJONode = new POJONode(null);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 12);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 31);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1673)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:831)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeNull(SerializerProvider.java:1125)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:108) */
        pOJONode.serialize(writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ctxt.defaultSerializeNull(gen);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_22() throws Exception  {
        POJONode pOJONode = new POJONode(null);
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1085)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeNull(UTF8JsonGenerator.java:1040)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeNull(SerializerProvider.java:1125)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:108) */
        pOJONode.serialize(uTF8JsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ctxt.defaultSerializeNull(gen);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_23() throws Exception  {
        POJONode pOJONode = new POJONode(null);
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1085)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeNull(UTF8JsonGenerator.java:1040)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeNull(SerializerProvider.java:1125)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:108) */
        pOJONode.serialize(uTF8JsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonSerializable) _value).serialize(gen, ctxt);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(false);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483644);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483646);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483644 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeBoolean(WriterBasedJsonGenerator.java:819)
            com.fasterxml.jackson.databind.node.BooleanNode.serialize(BooleanNode.java:79)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:110) */
        pOJONode.serialize(writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonSerializable) _value).serialize(gen, ctxt);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(false);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 6);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeBoolean(WriterBasedJsonGenerator.java:820)
            com.fasterxml.jackson.databind.node.BooleanNode.serialize(BooleanNode.java:79)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:110) */
        pOJONode.serialize(writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonSerializable) _value).serialize(gen, ctxt);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(true);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 5);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeBoolean(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.databind.node.BooleanNode.serialize(BooleanNode.java:79)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:110) */
        pOJONode.serialize(writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonSerializable) _value).serialize(gen, ctxt);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(true);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483644);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483646);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483644 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeBoolean(WriterBasedJsonGenerator.java:814)
            com.fasterxml.jackson.databind.node.BooleanNode.serialize(BooleanNode.java:79)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:110) */
        pOJONode.serialize(writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonSerializable) _value).serialize(gen, ctxt);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(false);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 4);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeBoolean(WriterBasedJsonGenerator.java:819)
            com.fasterxml.jackson.databind.node.BooleanNode.serialize(BooleanNode.java:79)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:110) */
        pOJONode.serialize(writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonSerializable) _value).serialize(gen, ctxt);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_17() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(false);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:872)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeBoolean(WriterBasedJsonGenerator.java:807)
            com.fasterxml.jackson.databind.node.BooleanNode.serialize(BooleanNode.java:79)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:110) */
        pOJONode.serialize(writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_18() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(true);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[40];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 60);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 127);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        Separators _separators = ((Separators) createInstance("com.fasterxml.jackson.core.util.Separators"));
        setField(_separators, "com.fasterxml.jackson.core.util.Separators", "objectFieldValueSeparator", '\u0000');
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.MinimalPrettyPrinter", "_separators", _separators);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 60 out of bounds for length 40]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:558)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeObjectFieldValueSeparator(MinimalPrettyPrinter.java:100)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl._verifyPrettyValueWrite(JsonGeneratorImpl.java:220)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:846)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeBoolean(WriterBasedJsonGenerator.java:807)
            com.fasterxml.jackson.databind.node.BooleanNode.serialize(BooleanNode.java:79)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:110) */
        pOJONode.serialize(writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gen.writeObject(_value);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        byte[] byteArray = {(byte) 0};
        POJONode pOJONode = new POJONode(byteArray);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        java.lang.Object[] _tokens = {};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", Integer.MIN_VALUE);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:2012)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1921)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendValue(TokenBuffer.java:1190)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:898)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:114) */
        pOJONode.serialize(tokenBuffer, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonSerializable) _value).serialize(gen, ctxt);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(true);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 6);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeBoolean(WriterBasedJsonGenerator.java:815)
            com.fasterxml.jackson.databind.node.BooleanNode.serialize(BooleanNode.java:79)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:110) */
        pOJONode.serialize(writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonSerializable) _value).serialize(gen, ctxt);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(true);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -3 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeBoolean(WriterBasedJsonGenerator.java:814)
            com.fasterxml.jackson.databind.node.BooleanNode.serialize(BooleanNode.java:79)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:110) */
        pOJONode.serialize(writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonSerializable) _value).serialize(gen, ctxt);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(false);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 5);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeBoolean(WriterBasedJsonGenerator.java:821)
            com.fasterxml.jackson.databind.node.BooleanNode.serialize(BooleanNode.java:79)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:110) */
        pOJONode.serialize(writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonSerializable) _value).serialize(gen, ctxt);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(false);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[14];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 10);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 16);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeBoolean(WriterBasedJsonGenerator.java:823)
            com.fasterxml.jackson.databind.node.BooleanNode.serialize(BooleanNode.java:79)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:110) */
        pOJONode.serialize(writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonSerializable) _value).serialize(gen, ctxt);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(false);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 12);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 18);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeBoolean(WriterBasedJsonGenerator.java:822)
            com.fasterxml.jackson.databind.node.BooleanNode.serialize(BooleanNode.java:79)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:110) */
        pOJONode.serialize(writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonSerializable) _value).serialize(gen, ctxt);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(true);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 12);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 12);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 17);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeBoolean(WriterBasedJsonGenerator.java:817)
            com.fasterxml.jackson.databind.node.BooleanNode.serialize(BooleanNode.java:79)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:110) */
        pOJONode.serialize(writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gen.writeObject(_value);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_19() throws Exception  {
        byte[] byteArray = {(byte) 0};
        POJONode pOJONode = new POJONode(byteArray);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        java.lang.Object[] _tokens = {};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", Integer.MIN_VALUE);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:2023)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1933)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendValue(TokenBuffer.java:1189)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:898)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:114) */
        pOJONode.serialize(tokenBuffer, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gen.writeObject(_value);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_20() throws Exception  {
        byte[] byteArray = {(byte) 0};
        POJONode pOJONode = new POJONode(byteArray);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 15);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:2023)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1933)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendValue(TokenBuffer.java:1189)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:898)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:114) */
        pOJONode.serialize(tokenBuffer, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gen.writeObject(_value);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_3() throws Exception  {
        byte[] byteArray = {};
        POJONode pOJONode = new POJONode(byteArray);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectCodec", _objectCodec);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._appendValue(TokenBuffer.java:1187)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:898)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:114) */
        pOJONode.serialize(tokenBuffer, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gen.writeObject(_value);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException() throws IOException  {
        Object object = new Object();
        POJONode pOJONode = new POJONode(object);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:114) */
        pOJONode.serialize(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.defaultSerializeNull(gen);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_1() throws IOException  {
        POJONode pOJONode = new POJONode(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:108) */
        pOJONode.serialize(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.defaultSerializeNull(gen);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_2() throws Exception  {
        POJONode pOJONode = new POJONode(null);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1671)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:831)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeNull(SerializerProvider.java:1125)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:108) */
        pOJONode.serialize(writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gen.writeObject(_value);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_5() throws Exception  {
        byte[] byteArray = {};
        POJONode pOJONode = new POJONode(byteArray);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 15);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:2012)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1921)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendValue(TokenBuffer.java:1190)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:898)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:114) */
        pOJONode.serialize(tokenBuffer, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.defaultSerializeNull(gen);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_7() throws Exception  {
        POJONode pOJONode = new POJONode(null);
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = {(byte) 0};
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeBytes(UTF8JsonGenerator.java:1180)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1074)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeNull(UTF8JsonGenerator.java:1040)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeNull(SerializerProvider.java:1125)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:108) */
        pOJONode.serialize(uTF8JsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonSerializable#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_4() throws Exception  {
        BooleanNode booleanNode = new BooleanNode(false);
        POJONode pOJONode = new POJONode(booleanNode);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1946)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeBoolean(WriterBasedJsonGenerator.java:809)
            com.fasterxml.jackson.databind.node.BooleanNode.serialize(BooleanNode.java:79)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:110) */
        pOJONode.serialize(writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.executesCondition {@code (_value instanceof JsonSerializable): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gen.writeObject(_value);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_6() throws Exception  {
        byte[] byteArray = {};
        POJONode pOJONode = new POJONode(byteArray);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 15);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:2023)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1933)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendValue(TokenBuffer.java:1189)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:898)
            com.fasterxml.jackson.databind.node.POJONode.serialize(POJONode.java:114) */
        pOJONode.serialize(tokenBuffer, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method serialize(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: gen.writeObject(_value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSerialize_ThrowUnsupportedOperationException() throws Exception  {
        byte[] byteArray = {};
        POJONode pOJONode = new POJONode(byteArray);
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_objectCodec", _objectCodec);
        
        pOJONode.serialize(uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#serialize(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: gen.writeObject(_value);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSerialize_ThrowIllegalStateException() throws Exception  {
        LongAdder longAdder = new LongAdder();
        POJONode pOJONode = new POJONode(longAdder);
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        pOJONode.serialize(uTF8JsonGenerator, null);
    }
    ///endregion
    
    ///region Errors report for serialize
    
    public void testSerialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.POJONode.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (o instanceof POJONode): False}
 *  */
    @Test
    public void testEquals_NotONotInstanceOfPOJONode() {
        POJONode pOJONode = new POJONode(null);
        byte[] byteArray = {};
        
        boolean actual = pOJONode.equals(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): True}
 *  */
    @Test
    public void testEquals_OEqualsNull() {
        POJONode pOJONode = new POJONode(null);
        
        boolean actual = pOJONode.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_O() {
        POJONode pOJONode = new POJONode(null);
        
        boolean actual = pOJONode.equals(pOJONode);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (o instanceof POJONode): True}
 * @utbot.returnsFrom {@code return _pojoEquals((POJONode) o);}
 *  */
    @Test
    public void testEquals_OInstanceOfPOJONode() {
        POJONode pOJONode = new POJONode(null);
        Object object = new Object();
        POJONode pOJONode1 = new POJONode(object);
        
        boolean actual = pOJONode.equals(pOJONode1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (o instanceof POJONode): True}
 * @utbot.returnsFrom {@code return _pojoEquals((POJONode) o);}
 *  */
    @Test
    public void testEquals_OInstanceOfPOJONode_1() {
        POJONode pOJONode = new POJONode(null);
        POJONode pOJONode1 = new POJONode(null);
        
        boolean actual = pOJONode.equals(pOJONode1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (o instanceof POJONode): True}
 * @utbot.returnsFrom {@code return _pojoEquals((POJONode) o);}
 *  */
    @Test
    public void testEquals_OInstanceOfPOJONode_2() {
        Integer integer = 0;
        POJONode pOJONode = new POJONode(integer);
        POJONode pOJONode1 = new POJONode(null);
        
        boolean actual = pOJONode.equals(pOJONode1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.POJONode.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#toString()}
 * @utbot.executesCondition {@code (_value instanceof byte[]): False}
 * @utbot.executesCondition {@code (_value instanceof RawValue): False}
 * @utbot.returnsFrom {@code return String.valueOf(_value);}
 *  */
    @Test
    public void testToString_Not_valueNotInstanceOfRawValue() {
        POJONode pOJONode = new POJONode(null);
        
        String actual = pOJONode.toString();
        
        String expected = "null";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#toString()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testToString_ThrowClassCastException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {};
        Class rawValueClazz = Class.forName("com.fasterxml.jackson.databind.util.RawValue");
        Class byteArrayType = Class.forName("java.lang.String");
        Constructor rawValueConstructor = rawValueClazz.getDeclaredConstructor(byteArrayType);
        rawValueConstructor.setAccessible(true);
        java.lang.Object[] rawValueConstructorArguments = new java.lang.Object[1];
        rawValueConstructorArguments[0] = ((Object) byteArray);
        RawValue rawValue = ((RawValue) rawValueConstructor.newInstance(rawValueConstructorArguments));
        POJONode pOJONode = new POJONode(rawValue);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.toString] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
        pOJONode.toString();
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#toString()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testToString_ThrowClassCastException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {};
        Class rawValueClazz = Class.forName("com.fasterxml.jackson.databind.util.RawValue");
        Class byteArrayType = Class.forName("java.lang.String");
        Constructor rawValueConstructor = rawValueClazz.getDeclaredConstructor(byteArrayType);
        rawValueConstructor.setAccessible(true);
        java.lang.Object[] rawValueConstructorArguments = new java.lang.Object[1];
        rawValueConstructorArguments[0] = ((Object) byteArray);
        RawValue rawValue = ((RawValue) rawValueConstructor.newInstance(rawValueConstructorArguments));
        POJONode pOJONode = new POJONode(rawValue);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.toString] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
        pOJONode.toString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() {
        byte[] byteArray = {};
        POJONode pOJONode = new POJONode(byteArray);
        
        String actual = pOJONode.toString();
        
        String expected = "(binary value of 0 bytes)";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() {
        RawValue rawValue = new RawValue(((String) null));
        POJONode pOJONode = new POJONode(rawValue);
        
        String actual = pOJONode.toString();
        
        String expected = "(raw value '[RawValue of type [null]]')";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.POJONode.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#hashCode()}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testHashCode_ObjectHashCode() {
        Integer integer = 0;
        POJONode pOJONode = new POJONode(integer);
        
        int actual = pOJONode.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#hashCode()}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() {
        POJONode pOJONode = new POJONode(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode.hashCode] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.POJONode.hashCode(POJONode.java:158) */
        pOJONode.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.POJONode.asInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asInt(int)
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#asInt(int)}
 * @utbot.executesCondition {@code (_value instanceof Number): False}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testAsInt_Not_valueNotInstanceOfNumber() {
        Object object = new Object();
        POJONode pOJONode = new POJONode(object);
        
        int actual = pOJONode.asInt(0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#asInt(int)}
 * @utbot.executesCondition {@code (_value instanceof Number): True}
 * @utbot.invokes {@link java.lang.Number#intValue()}
 * @utbot.returnsFrom {@code return ((Number) _value).intValue();}
 *  */
    @Test
    public void testAsInt__valueInstanceOfNumber() {
        Integer integer = 0;
        POJONode pOJONode = new POJONode(integer);
        
        int actual = pOJONode.asInt(-255);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.POJONode.asToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asToken()
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#asToken()}
 * @utbot.returnsFrom {@code return JsonToken.VALUE_EMBEDDED_OBJECT;}
 *  */
    @Test
    public void testAsToken_ReturnJsonTokenVALUE_EMBEDDED_OBJECT() {
        POJONode pOJONode = new POJONode(null);
        
        JsonToken actual = pOJONode.asToken();
        
        JsonToken expected = JsonToken.VALUE_EMBEDDED_OBJECT;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method asToken()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.node.POJONode}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#asToken()}
     */
    @Test
    public void testAsToken() {
        Object object = new Object();
        POJONode pOJONode = new POJONode(object);
        
        JsonToken actual = pOJONode.asToken();
        
        JsonToken expected = JsonToken.VALUE_EMBEDDED_OBJECT;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.POJONode.getPojo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPojo()
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#getPojo()}
 * @utbot.returnsFrom {@code return _value;}
 *  */
    @Test
    public void testGetPojo_Return_value() {
        POJONode pOJONode = new POJONode(null);
        
        Object actual = pOJONode.getPojo();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.POJONode.getNodeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNodeType()
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#getNodeType()}
 * @utbot.returnsFrom {@code return JsonNodeType.POJO;}
 *  */
    @Test
    public void testGetNodeType_ReturnJsonNodeTypePOJO() {
        POJONode pOJONode = new POJONode(null);
        
        JsonNodeType actual = pOJONode.getNodeType();
        
        JsonNodeType expected = JsonNodeType.POJO;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getNodeType()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.node.POJONode}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#getNodeType()}
     */
    @Test
    public void testGetNodeType() {
        Object object = new Object();
        POJONode pOJONode = new POJONode(object);
        
        JsonNodeType actual = pOJONode.getNodeType();
        
        JsonNodeType expected = JsonNodeType.POJO;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.POJONode.asText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asText()
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#asText()}
 * @utbot.executesCondition {@code ((_value == null)): False}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testAsText__valueNotEqualsNull() {
        Integer integer = 0;
        POJONode pOJONode = new POJONode(integer);
        
        String actual = pOJONode.asText();
        
        String expected = "0";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#asText()}
 * @utbot.executesCondition {@code ((_value == null)): True}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testAsText__valueEqualsNull() {
        POJONode pOJONode = new POJONode(null);
        
        String actual = pOJONode.asText();
        
        String expected = "null";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.POJONode.asText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#asText(java.lang.String)}
 * @utbot.executesCondition {@code ((_value == null)): False}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.returnsFrom {@code return (_value == null) ? defaultValue : _value.toString();}
 *  */
    @Test
    public void testAsText__valueNotEqualsNull1() {
        Integer integer = 0;
        POJONode pOJONode = new POJONode(integer);
        
        String actual = pOJONode.asText(null);
        
        String expected = "0";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#asText(java.lang.String)}
 * @utbot.executesCondition {@code ((_value == null)): True}
 * @utbot.returnsFrom {@code return (_value == null) ? defaultValue : _value.toString();}
 *  */
    @Test
    public void testAsText__valueEqualsNull1() {
        POJONode pOJONode = new POJONode(null);
        
        String actual = pOJONode.asText(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.POJONode.asLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asLong(long)
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#asLong(long)}
 * @utbot.executesCondition {@code (_value instanceof Number): False}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testAsLong_Not_valueNotInstanceOfNumber() {
        Object object = new Object();
        POJONode pOJONode = new POJONode(object);
        
        long actual = pOJONode.asLong(-255L);
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#asLong(long)}
 * @utbot.executesCondition {@code (_value instanceof Number): True}
 * @utbot.invokes {@link java.lang.Number#longValue()}
 * @utbot.returnsFrom {@code return ((Number) _value).longValue();}
 *  */
    @Test
    public void testAsLong__valueInstanceOfNumber() {
        Integer integer = 0;
        POJONode pOJONode = new POJONode(integer);
        
        long actual = pOJONode.asLong(-255L);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.POJONode.asDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asDouble(double)
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#asDouble(double)}
 * @utbot.executesCondition {@code (_value instanceof Number): False}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testAsDouble_Not_valueNotInstanceOfNumber() {
        Object object = new Object();
        POJONode pOJONode = new POJONode(object);
        
        double actual = pOJONode.asDouble(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#asDouble(double)}
 * @utbot.executesCondition {@code (_value instanceof Number): True}
 * @utbot.invokes {@link java.lang.Number#doubleValue()}
 * @utbot.returnsFrom {@code return ((Number) _value).doubleValue();}
 *  */
    @Test
    public void testAsDouble__valueInstanceOfNumber() {
        Integer integer = 0;
        POJONode pOJONode = new POJONode(integer);
        
        double actual = pOJONode.asDouble(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.POJONode.binaryValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method binaryValue()
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#binaryValue()}
 * @utbot.executesCondition {@code (_value instanceof byte[]): True}
 * @utbot.returnsFrom {@code return (byte[]) _value;}
 *  */
    @Test
    public void testBinaryValue__valueInstanceOfByte() throws IOException  {
        byte[] byteArray = {(byte) 0};
        POJONode pOJONode = new POJONode(byteArray);
        
        byte[] actual = pOJONode.binaryValue();
        
        assertArrayEquals(byteArray, actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#binaryValue()}
 * @utbot.executesCondition {@code (_value instanceof byte[]): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ValueNode#binaryValue()}
 * @utbot.returnsFrom {@code return super.binaryValue();}
 *  */
    @Test
    public void testBinaryValue_Not_valueNotInstanceOfByte() throws IOException  {
        Object object = new Object();
        POJONode pOJONode = new POJONode(object);
        
        byte[] actual = pOJONode.binaryValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.POJONode.asBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asBoolean(boolean)
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#asBoolean(boolean)}
 * @utbot.executesCondition {@code (_value != null): True}
 * @utbot.executesCondition {@code (_value instanceof Boolean): False}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testAsBoolean_Not_valueNotInstanceOfBoolean() {
        Object object = new Object();
        POJONode pOJONode = new POJONode(object);
        
        boolean actual = pOJONode.asBoolean(false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#asBoolean(boolean)}
 * @utbot.executesCondition {@code (_value != null): False}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testAsBoolean__valueEqualsNull() {
        POJONode pOJONode = new POJONode(null);
        
        boolean actual = pOJONode.asBoolean(false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#asBoolean(boolean)}
 * @utbot.executesCondition {@code (_value != null): True}
 * @utbot.executesCondition {@code (_value instanceof Boolean): True}
 * @utbot.invokes {@link java.lang.Boolean#booleanValue()}
 * @utbot.returnsFrom {@code return ((Boolean) _value).booleanValue();}
 *  */
    @Test
    public void testAsBoolean__valueInstanceOfBoolean() {
        Boolean boolean1 = false;
        POJONode pOJONode = new POJONode(boolean1);
        
        boolean actual = pOJONode.asBoolean(false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.POJONode._pojoEquals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _pojoEquals(com.fasterxml.jackson.databind.node.POJONode)
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#_pojoEquals(com.fasterxml.jackson.databind.node.POJONode)}
 * @utbot.executesCondition {@code (_value == null): True}
 * @utbot.returnsFrom {@code return other._value == null;}
 *  */
    @Test
    public void test_pojoEquals_Other_valueNotEqualsNull() {
        POJONode pOJONode = new POJONode(null);
        Object object = new Object();
        POJONode pOJONode1 = new POJONode(object);
        
        boolean actual = pOJONode._pojoEquals(pOJONode1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#_pojoEquals(com.fasterxml.jackson.databind.node.POJONode)}
 * @utbot.executesCondition {@code (_value == null): True}
 * @utbot.returnsFrom {@code return other._value == null;}
 *  */
    @Test
    public void test_pojoEquals_Other_valueEqualsNull() {
        POJONode pOJONode = new POJONode(null);
        
        boolean actual = pOJONode._pojoEquals(pOJONode);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#_pojoEquals(com.fasterxml.jackson.databind.node.POJONode)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return _value.equals(other._value);}
 *  */
    @Test
    public void test_pojoEquals__valueNotEqualsNull() {
        Integer integer = -1;
        POJONode pOJONode = new POJONode(integer);
        Integer integer1 = 0;
        POJONode pOJONode1 = new POJONode(integer1);
        
        boolean actual = pOJONode._pojoEquals(pOJONode1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _pojoEquals(com.fasterxml.jackson.databind.node.POJONode)
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#_pojoEquals(com.fasterxml.jackson.databind.node.POJONode)}
 * @utbot.executesCondition {@code (_value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _value.equals(other._value);
 *  */
    @Test
    public void test_pojoEquals_ThrowNullPointerException() {
        Object object = new Object();
        POJONode pOJONode = new POJONode(object);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode._pojoEquals] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.POJONode._pojoEquals(POJONode.java:154) */
        pOJONode._pojoEquals(null);
    }
    
    /**
    @utbot.classUnderTest {@link POJONode}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.POJONode#_pojoEquals(com.fasterxml.jackson.databind.node.POJONode)}
 * @utbot.executesCondition {@code (_value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return other._value == null;
 *  */
    @Test
    public void test_pojoEquals_ThrowNullPointerException_1() {
        POJONode pOJONode = new POJONode(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.POJONode._pojoEquals] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.POJONode._pojoEquals(POJONode.java:152) */
        pOJONode._pojoEquals(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1088610316910900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1088610316910900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1088610316917900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1088610316910900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1088610316917900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1088610317398499 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1088610317398499.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1088610317404900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1088610317398499.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1088610317404900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

