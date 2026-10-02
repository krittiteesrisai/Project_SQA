package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import java.math.BigInteger;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Features;
import com.fasterxml.jackson.databind.BeanProperty.Bogus;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import java.lang.reflect.Method;
import java.util.Map;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class com_fasterxml_jackson_databind_ser_std_NumberSerializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serialize(java.lang.Number, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: g.writeNumber((BigInteger) value);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:895)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:751)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:72) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: g.writeNumber((BigInteger) value);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_quoteChar", '\u0000');
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:819)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:72) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: g.writeNumber((BigDecimal) value);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:895)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:793)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:70) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: g.writeNumber((BigDecimal) value);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:895)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:793)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:70) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): False}
 * @utbot.executesCondition {@code (value instanceof Long): False}
 * @utbot.executesCondition {@code (value instanceof Double): False}
 * @utbot.executesCondition {@code (value instanceof Float): False}
 * @utbot.executesCondition {@code (value instanceof Integer || value instanceof Byte): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: g.writeNumber(value.intValue());
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:895)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:701)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:83) */
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): False}
 * @utbot.executesCondition {@code (value instanceof Long): False}
 * @utbot.executesCondition {@code (value instanceof Double): False}
 * @utbot.executesCondition {@code (value instanceof Float): False}
 * @utbot.executesCondition {@code (value instanceof Integer || value instanceof Byte): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = -1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_quoteChar", '\u0000');
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 15);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.io.NumberOutput.outputInt(NumberOutput.java:64)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedInt(WriterBasedJsonGenerator.java:718)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:703)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:83) */
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): False}
 * @utbot.executesCondition {@code (value instanceof Long): False}
 * @utbot.executesCondition {@code (value instanceof Double): False}
 * @utbot.executesCondition {@code (value instanceof Float): False}
 * @utbot.executesCondition {@code (value instanceof Integer || value instanceof Byte): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: g.writeNumber(value.intValue());
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = -1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -7);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 5);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -7 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberOutput.outputInt(NumberOutput.java:64)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:710)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:83) */
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): False}
 * @utbot.executesCondition {@code (value instanceof Long): False}
 * @utbot.executesCondition {@code (value instanceof Double): False}
 * @utbot.executesCondition {@code (value instanceof Float): False}
 * @utbot.executesCondition {@code (value instanceof Integer || value instanceof Byte): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: g.writeNumber(value.intValue());
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1073741823);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1095)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeNumber(UTF8JsonGenerator.java:906)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:83) */
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) uTF8JsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): False}
 * @utbot.executesCondition {@code (value instanceof Long): False}
 * @utbot.executesCondition {@code (value instanceof Double): False}
 * @utbot.executesCondition {@code (value instanceof Float): False}
 * @utbot.executesCondition {@code (value instanceof Integer || value instanceof Byte): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: g.writeNumber(value.intValue());
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_quoteChar", '\u0000');
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483644);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483638);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483644 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedInt(WriterBasedJsonGenerator.java:717)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:703)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:83) */
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: g.writeNumber((BigDecimal) value);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        String stringCache = "";
        setField(bigDecimal, "java.math.BigDecimal", "stringCache", stringCache);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_quoteChar", '\u0000');
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:819)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:797)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:70) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeNumber((BigInteger) value);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_1() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:72) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) null), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeNumber((BigDecimal) value);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:70) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) null), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): False}
 * @utbot.executesCondition {@code (value instanceof Long): False}
 * @utbot.executesCondition {@code (value instanceof Double): False}
 * @utbot.executesCondition {@code (value instanceof Float): False}
 * @utbot.executesCondition {@code (value instanceof Integer || value instanceof Byte): True}
 * @utbot.executesCondition {@code (value instanceof Short): True}
 * @utbot.executesCondition {@code (if (value instanceof Integer || value instanceof Byte || value instanceof Short) {
 *     g.writeNumber(value.intValue());
 * } else {
 *     g.writeNumber(value.toString());
 * }): False}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeNumber(value.toString());
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_2() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:86) */
        numberSerializer.serialize(((Number) null), ((JsonGenerator) null), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): False}
 * @utbot.executesCondition {@code (value instanceof Long): False}
 * @utbot.executesCondition {@code (value instanceof Double): False}
 * @utbot.executesCondition {@code (value instanceof Float): False}
 * @utbot.executesCondition {@code (value instanceof Integer || value instanceof Byte): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeNumber(value.intValue());
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_3() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:83) */
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) null), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeNumber((BigInteger) value);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_4() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_quoteChar", '\u0000');
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2147483640);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2147483640);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483640);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:819)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:72) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): False}
 * @utbot.executesCondition {@code (value instanceof Long): False}
 * @utbot.executesCondition {@code (value instanceof Double): False}
 * @utbot.executesCondition {@code (value instanceof Float): False}
 * @utbot.executesCondition {@code (value instanceof Integer || value instanceof Byte): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeNumber(value.intValue());
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_5() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_quoteChar", '\u0000');
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483637);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedInt(WriterBasedJsonGenerator.java:717)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:703)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:83) */
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.NumberSerializer.acceptJsonFormatVisitor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_isInt): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#visitIntFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser.NumberType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor__isInt() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        setField(numberSerializer, "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "_isInt", true);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        
        numberSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_isInt): False}
 * @utbot.executesCondition {@code ((Class<?>) handledType()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#handledType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#visitFloatFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser.NumberType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_HandledType() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Class _handledType = Object.class;
        setField(numberSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base();
        
        Class initialNumberSerializer_handledType = numberSerializer._handledType;
        
        numberSerializer.acceptJsonFormatVisitor(base, null);
        
        Class finalNumberSerializer_handledType = numberSerializer._handledType;
        
        assertFalse(initialNumberSerializer_handledType == finalNumberSerializer_handledType);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_isInt): False}
 * @utbot.executesCondition {@code ((Class<?>) handledType()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#handledType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#expectNumberFormat(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: visitor.expectNumberFormat(typeHint);
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.acceptJsonFormatVisitor(NumberSerializer.java:105) */
        numberSerializer.acceptJsonFormatVisitor(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.NumberSerializer.getSchema
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (_isInt): True}
 * @utbot.returnsFrom {@code return createSchemaNode(_isInt ? "integer" : "number", true);}
 *  */
    @Test
    public void testGetSchema__isInt() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
            setField(numberSerializer, "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "_isInt", true);
            
            ObjectNode actual = ((ObjectNode) numberSerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "integer";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (_isInt): False}
 * @utbot.returnsFrom {@code return createSchemaNode(_isInt ? "integer" : "number", true);}
 *  */
    @Test
    public void testGetSchema_Not_isInt() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
            
            ObjectNode actual = ((ObjectNode) numberSerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "number";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.NumberSerializer.createContextual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCreateContextual_Return() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
        setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        NumberSerializer actual = ((NumberSerializer) numberSerializer.createContextual(impl, null));
        
        boolean actual_isInt = actual._isInt;
        assertFalse(actual_isInt);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.activatesSwitch {@code switch(format.getShape()) case: default}
 *  */
    @Test
    public void testCreateContextual_SwitchFormatGetShapeCasedefault() throws Exception  {
        ToStringSerializer prevInstance = ToStringSerializer.instance;
        try {
            Class class1 = Object.class;
            ToStringSerializer instance = new ToStringSerializer(class1);
            Class toStringSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.ToStringSerializer");
            setStaticField(toStringSerializerClazz, "instance", instance);
            NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
            LinkedHashMap _overrides = new LinkedHashMap();
            MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
            JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            JsonFormat.Shape _shape = JsonFormat.Shape.STRING;
            setField(_format, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
            setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
            _overrides.put(null, mutableConfigOverride);
            setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            ToStringSerializer actual = ((ToStringSerializer) numberSerializer.createContextual(impl, null));
            
            Class instance_handledType = instance._handledType;
            Class actual_handledType = actual._handledType;
            assertEquals(Class.class, actual_handledType.getClass());
            
        } finally {
            setStaticField(ToStringSerializer.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCreateContextual_Return_2() throws Exception  {
        Class featuresClazz = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Features");
        JsonFormat.Features prevEMPTY = ((JsonFormat.Features) getStaticFieldValue(featuresClazz, "EMPTY"));
        Class valueClazz = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value");
        JsonFormat.Value prevEMPTY1 = ((JsonFormat.Value) getStaticFieldValue(valueClazz, "EMPTY"));
        try {
            JsonFormat.Features empty = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setStaticField(featuresClazz, "EMPTY", empty);
            JsonFormat.Value empty1 = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            String _pattern = "";
            setField(empty1, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_pattern", _pattern);
            JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
            setField(empty1, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
            setField(empty1, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_features", empty);
            setStaticField(valueClazz, "EMPTY", empty1);
            NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            BeanProperty.Bogus bogus = new BeanProperty.Bogus();
            
            NumberSerializer actual = ((NumberSerializer) numberSerializer.createContextual(impl, bogus));
            
            boolean actual_isInt = actual._isInt;
            assertFalse(actual_isInt);
            
            Class actual_handledType = actual._handledType;
            assertNull(actual_handledType);
            
        } finally {
            setStaticField(JsonFormat.Features.class, "EMPTY", prevEMPTY);
            setStaticField(JsonFormat.Value.class, "EMPTY", prevEMPTY1);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCreateContextual_Return_1() throws Exception  {
        Class valueClazz = Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value");
        com.fasterxml.jackson.annotation.JsonInclude.Value prevEMPTY = ((com.fasterxml.jackson.annotation.JsonInclude.Value) getStaticFieldValue(valueClazz, "EMPTY"));
        Class featuresClazz = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Features");
        JsonFormat.Features prevEMPTY1 = ((JsonFormat.Features) getStaticFieldValue(featuresClazz, "EMPTY"));
        Class valueClazz1 = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value");
        JsonFormat.Value prevEMPTY2 = ((JsonFormat.Value) getStaticFieldValue(valueClazz1, "EMPTY"));
        Class mapperConfigClazz = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        JsonFormat.Value prevEMPTY_FORMAT = ((JsonFormat.Value) getStaticFieldValue(mapperConfigClazz, "EMPTY_FORMAT"));
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value empty = ((com.fasterxml.jackson.annotation.JsonInclude.Value) createInstance("com.fasterxml.jackson.annotation.JsonInclude$Value"));
            JsonInclude.Include _valueInclusion = JsonInclude.Include.USE_DEFAULTS;
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_valueInclusion", _valueInclusion);
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_contentInclusion", _valueInclusion);
            setStaticField(valueClazz, "EMPTY", empty);
            JsonFormat.Features empty1 = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setStaticField(featuresClazz, "EMPTY", empty1);
            JsonFormat.Value empty2 = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            String _pattern = "";
            setField(empty2, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_pattern", _pattern);
            JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
            setField(empty2, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
            setField(empty2, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_features", empty1);
            setStaticField(valueClazz1, "EMPTY", empty2);
            setStaticField(mapperConfigClazz, "EMPTY_FORMAT", empty2);
            NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
            LinkedHashMap _overrides = new LinkedHashMap();
            setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            NumberSerializer actual = ((NumberSerializer) numberSerializer.createContextual(impl, null));
            
            boolean actual_isInt = actual._isInt;
            assertFalse(actual_isInt);
            
            Class actual_handledType = actual._handledType;
            assertNull(actual_handledType);
            
        } finally {
            setStaticField(com.fasterxml.jackson.annotation.JsonInclude.Value.class, "EMPTY", prevEMPTY);
            setStaticField(JsonFormat.Features.class, "EMPTY", prevEMPTY1);
            setStaticField(JsonFormat.Value.class, "EMPTY", prevEMPTY2);
            setStaticField(com.fasterxml.jackson.databind.cfg.MapperConfig.class, "EMPTY_FORMAT", prevEMPTY_FORMAT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.MapperFeature#getMask()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.BaseSettings#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.BaseSettings#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#getAnnotationIntrospector()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCreateContextual_Return_3() throws Exception  {
        Class valueClazz = Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value");
        com.fasterxml.jackson.annotation.JsonInclude.Value prevEMPTY = ((com.fasterxml.jackson.annotation.JsonInclude.Value) getStaticFieldValue(valueClazz, "EMPTY"));
        Class featuresClazz = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Features");
        JsonFormat.Features prevEMPTY1 = ((JsonFormat.Features) getStaticFieldValue(featuresClazz, "EMPTY"));
        Class valueClazz1 = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value");
        JsonFormat.Value prevEMPTY2 = ((JsonFormat.Value) getStaticFieldValue(valueClazz1, "EMPTY"));
        Class mapperConfigClazz = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        JsonFormat.Value prevEMPTY_FORMAT = ((JsonFormat.Value) getStaticFieldValue(mapperConfigClazz, "EMPTY_FORMAT"));
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value empty = ((com.fasterxml.jackson.annotation.JsonInclude.Value) createInstance("com.fasterxml.jackson.annotation.JsonInclude$Value"));
            JsonInclude.Include _valueInclusion = JsonInclude.Include.USE_DEFAULTS;
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_valueInclusion", _valueInclusion);
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_contentInclusion", _valueInclusion);
            setStaticField(valueClazz, "EMPTY", empty);
            JsonFormat.Features empty1 = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setStaticField(featuresClazz, "EMPTY", empty1);
            JsonFormat.Value empty2 = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            String _pattern = "";
            setField(empty2, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_pattern", _pattern);
            JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
            setField(empty2, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
            setField(empty2, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_features", empty1);
            setStaticField(valueClazz1, "EMPTY", empty2);
            setStaticField(mapperConfigClazz, "EMPTY_FORMAT", empty2);
            NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ValueInjector valueInjector = new ValueInjector(null, null, null, null);
            
            Class numberSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializer");
            Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
            Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Method createContextualMethod = numberSerializerClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
            createContextualMethod.setAccessible(true);
            java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
            createContextualMethodArguments[0] = impl;
            createContextualMethodArguments[1] = valueInjector;
            NumberSerializer actual = ((NumberSerializer) createContextualMethod.invoke(numberSerializer, createContextualMethodArguments));
            
            boolean actual_isInt = actual._isInt;
            assertFalse(actual_isInt);
            
            Class actual_handledType = actual._handledType;
            assertNull(actual_handledType);
            
            SerializationConfig impl_config = ((SerializationConfig) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config"));
            ConfigOverrides impl_config_config_configOverrides = ((ConfigOverrides) getFieldValue(impl_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides"));
            Map finalImpl_config_configOverrides_overrides = ((Map) getFieldValue(impl_config_config_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides"));
            
            assertNull(finalImpl_config_configOverrides_overrides);
        } finally {
            setStaticField(com.fasterxml.jackson.annotation.JsonInclude.Value.class, "EMPTY", prevEMPTY);
            setStaticField(JsonFormat.Features.class, "EMPTY", prevEMPTY1);
            setStaticField(JsonFormat.Value.class, "EMPTY", prevEMPTY2);
            setStaticField(com.fasterxml.jackson.databind.cfg.MapperConfig.class, "EMPTY_FORMAT", prevEMPTY_FORMAT);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(format.getShape())
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_3() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Class _handledType = Object.class;
        setField(numberSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(_handledType, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.createContextual(NumberSerializer.java:55) */
        numberSerializer.createContextual(impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(format.getShape())
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.createContextual(NumberSerializer.java:55) */
        numberSerializer.createContextual(impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(format.getShape())
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_4() throws Throwable  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
            Class _handledType = Object.class;
            setField(numberSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
            LinkedHashMap _overrides = new LinkedHashMap();
            MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
            JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
            _overrides.put(_handledType, mutableConfigOverride);
            setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ValueInjector valueInjector = new ValueInjector(null, null, null, null, null);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.createContextual] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.std.NumberSerializer.createContextual(NumberSerializer.java:55) */
            Class numberSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializer");
            Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
            Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Method createContextualMethod = numberSerializerClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
            createContextualMethod.setAccessible(true);
            java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
            createContextualMethodArguments[0] = impl;
            createContextualMethodArguments[1] = valueInjector;
            try {
                createContextualMethod.invoke(numberSerializer, createContextualMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(format.getShape())
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_2() throws Throwable  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.createContextual(NumberSerializer.java:55) */
        Class numberSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = numberSerializerClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        try {
            createContextualMethod.invoke(numberSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(format.getShape())
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_1() throws Throwable  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.createContextual(NumberSerializer.java:55) */
        Class numberSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = numberSerializerClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        try {
            createContextualMethod.invoke(numberSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testCreateContextual1() throws Exception  {
        Class valueClazz = Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value");
        com.fasterxml.jackson.annotation.JsonInclude.Value prevEMPTY = ((com.fasterxml.jackson.annotation.JsonInclude.Value) getStaticFieldValue(valueClazz, "EMPTY"));
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value empty = ((com.fasterxml.jackson.annotation.JsonInclude.Value) createInstance("com.fasterxml.jackson.annotation.JsonInclude$Value"));
            JsonInclude.Include _valueInclusion = JsonInclude.Include.USE_DEFAULTS;
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_valueInclusion", _valueInclusion);
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_contentInclusion", _valueInclusion);
            setStaticField(valueClazz, "EMPTY", empty);
            NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
            LinkedHashMap _overrides = new LinkedHashMap();
            Class class1 = Object.class;
            MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
            _overrides.put(class1, mutableConfigOverride);
            _overrides.put(null, mutableConfigOverride);
            setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            NumberSerializer actual = ((NumberSerializer) numberSerializer.createContextual(impl, null));
            
            boolean actual_isInt = actual._isInt;
            assertFalse(actual_isInt);
            
            Class actual_handledType = actual._handledType;
            assertNull(actual_handledType);
            
        } finally {
            setStaticField(com.fasterxml.jackson.annotation.JsonInclude.Value.class, "EMPTY", prevEMPTY);
        }
    }
    
    @Test
    public void testCreateContextual2() throws Exception  {
        Class valueClazz = Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value");
        com.fasterxml.jackson.annotation.JsonInclude.Value prevEMPTY = ((com.fasterxml.jackson.annotation.JsonInclude.Value) getStaticFieldValue(valueClazz, "EMPTY"));
        Class featuresClazz = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Features");
        JsonFormat.Features prevEMPTY1 = ((JsonFormat.Features) getStaticFieldValue(featuresClazz, "EMPTY"));
        Class valueClazz1 = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value");
        JsonFormat.Value prevEMPTY2 = ((JsonFormat.Value) getStaticFieldValue(valueClazz1, "EMPTY"));
        Class mapperConfigClazz = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        JsonFormat.Value prevEMPTY_FORMAT = ((JsonFormat.Value) getStaticFieldValue(mapperConfigClazz, "EMPTY_FORMAT"));
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value empty = ((com.fasterxml.jackson.annotation.JsonInclude.Value) createInstance("com.fasterxml.jackson.annotation.JsonInclude$Value"));
            JsonInclude.Include _valueInclusion = JsonInclude.Include.USE_DEFAULTS;
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_valueInclusion", _valueInclusion);
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_contentInclusion", _valueInclusion);
            setStaticField(valueClazz, "EMPTY", empty);
            JsonFormat.Features empty1 = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setStaticField(featuresClazz, "EMPTY", empty1);
            JsonFormat.Value empty2 = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            String _pattern = "";
            setField(empty2, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_pattern", _pattern);
            JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
            setField(empty2, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
            setField(empty2, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_features", empty1);
            setStaticField(valueClazz1, "EMPTY", empty2);
            setStaticField(mapperConfigClazz, "EMPTY_FORMAT", empty2);
            NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
            Class _handledType = Object.class;
            setField(numberSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
            LinkedHashMap _overrides = new LinkedHashMap();
            MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
            _overrides.put(_handledType, mutableConfigOverride);
            setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ValueInjector valueInjector = new ValueInjector(null, null, null, null, null);
            
            Class initialNumberSerializer_handledType = numberSerializer._handledType;
            
            Class numberSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializer");
            Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
            Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Method createContextualMethod = numberSerializerClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
            createContextualMethod.setAccessible(true);
            java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
            createContextualMethodArguments[0] = impl;
            createContextualMethodArguments[1] = valueInjector;
            NumberSerializer actual = ((NumberSerializer) createContextualMethod.invoke(numberSerializer, createContextualMethodArguments));
            
            boolean actual_isInt = actual._isInt;
            assertFalse(actual_isInt);
            
            Class numberSerializer_handledType = numberSerializer._handledType;
            Class actual_handledType = actual._handledType;
            assertEquals(Class.class, actual_handledType.getClass());
            
            Class finalNumberSerializer_handledType = numberSerializer._handledType;
            
            assertFalse(initialNumberSerializer_handledType == finalNumberSerializer_handledType);
        } finally {
            setStaticField(com.fasterxml.jackson.annotation.JsonInclude.Value.class, "EMPTY", prevEMPTY);
            setStaticField(JsonFormat.Features.class, "EMPTY", prevEMPTY1);
            setStaticField(JsonFormat.Value.class, "EMPTY", prevEMPTY2);
            setStaticField(com.fasterxml.jackson.databind.cfg.MapperConfig.class, "EMPTY_FORMAT", prevEMPTY_FORMAT);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testCreateContextual3() throws Throwable  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(mutableConfigOverride, "com.fasterxml.jackson.databind.cfg.ConfigOverride", "_format", _format);
        _overrides.put(null, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary4 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        ValueInjector valueInjector = new ValueInjector(null, null, null, annotatedMethod, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:447)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:446)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:446)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:446)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:446)
            com.fasterxml.jackson.databind.BeanProperty$Std.findPropertyFormat(BeanProperty.java:293)
            com.fasterxml.jackson.databind.ser.std.StdSerializer.findFormatOverrides(StdSerializer.java:446)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.createContextual(NumberSerializer.java:53) */
        Class numberSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = numberSerializerClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        try {
            createContextualMethod.invoke(numberSerializer, createContextualMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1094416094625900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1094416094625900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1094416094634600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1094416094625900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1094416094634600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1094416095103300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1094416095103300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1094416095107300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1094416095103300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1094416095107300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1094416096168800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1094416096168800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1094416096173900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1094416096168800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1094416096173900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1094416097281100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1094416097281100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1094416097286500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1094416097281100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1094416097286500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

