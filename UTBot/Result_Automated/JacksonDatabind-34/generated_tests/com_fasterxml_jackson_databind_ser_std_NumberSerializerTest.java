package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import java.math.BigInteger;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.core.util.DefaultIndenter;
import java.io.PrintWriter;
import java.io.CharArrayWriter;
import java.io.StringWriter;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.BufferedWriter;
import java.io.FileWriter;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.node.TextNode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_ser_std_NumberSerializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serialize(java.lang.Number, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:479)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:345)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:810)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:769)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:648)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
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
    public void testSerialize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:796)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:648)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:479)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:345)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:810)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:769)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:691)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: g.writeNumber((BigDecimal) value);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:796)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:691)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
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
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:720)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:652)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): False}
 * @utbot.executesCondition {@code (value instanceof Integer): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: g.writeNumber(value.intValue());
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", Integer.MAX_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MAX_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483636);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedInt(WriterBasedJsonGenerator.java:614)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:600)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:53) */
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): False}
 * @utbot.executesCondition {@code (value instanceof Integer): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: g.writeNumber(value.intValue());
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = -1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483640);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483644);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483640 out of bounds for length 1]
            com.fasterxml.jackson.core.io.NumberOutput.outputInt(NumberOutput.java:77)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:607)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:53) */
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
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
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
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
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) null), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): False}
 * @utbot.executesCondition {@code (value instanceof Integer): False}
 * @utbot.executesCondition {@code (value instanceof Long): False}
 * @utbot.executesCondition {@code (value instanceof Double): False}
 * @utbot.executesCondition {@code (value instanceof Float): False}
 * @utbot.executesCondition {@code ((value instanceof Byte) || (value instanceof Short)): True}
 * @utbot.executesCondition {@code (if ((value instanceof Byte) || (value instanceof Short)) {
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
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:64) */
        numberSerializer.serialize(((Number) null), ((JsonGenerator) null), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): False}
 * @utbot.executesCondition {@code (value instanceof Integer): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeNumber(value.intValue());
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_3() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:53) */
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
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:720)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:652)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#serialize(java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof BigDecimal): False}
 * @utbot.executesCondition {@code (value instanceof BigInteger): False}
 * @utbot.executesCondition {@code (value instanceof Integer): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeNumber(value.intValue());
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_5() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483637);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedInt(WriterBasedJsonGenerator.java:614)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:600)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:53) */
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method serialize(java.lang.Number, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test
    public void testSerialize1() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer2 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 2));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer3 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 3));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer2);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer3);
        
        assertEquals(4, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize2() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 34);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer32 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 32));
        int finalWriterBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer32);
        
        assertEquals(0, finalWriterBasedJsonGenerator_outputHead);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize3() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 0L);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer2 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 2));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer3 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 3));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer2);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer3);
        
        assertEquals(4, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize4() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals(2, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize5() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = -1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[28];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 24);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 23);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 31);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer23 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 23));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer24 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 24));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer25 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 25));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer26 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 26));
        char[] writerBasedJsonGenerator_outputBuffer4 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer27 = ((Character) get(writerBasedJsonGenerator_outputBuffer4, 27));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer23);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer24);
        
        assertEquals('-', finalWriterBasedJsonGenerator_outputBuffer25);
        
        assertEquals('1', finalWriterBasedJsonGenerator_outputBuffer26);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer27);
        
        assertEquals(28, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize6() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[13];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 4);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 29);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer4 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 4));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer5 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 5));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer4);
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer5);
        
        assertEquals(6, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize7() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer2 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 2));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer3 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 3));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer2);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer3);
        
        assertEquals(4, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize8() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer2 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 2));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer3 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 3));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer2);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer3);
        
        assertEquals(4, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize9() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals(2, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize10() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = -1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[12];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 4);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 15);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer3 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 3));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer4 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 4));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer5 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 5));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer6 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 6));
        char[] writerBasedJsonGenerator_outputBuffer4 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer7 = ((Character) get(writerBasedJsonGenerator_outputBuffer4, 7));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer3);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer4);
        
        assertEquals('-', finalWriterBasedJsonGenerator_outputBuffer5);
        
        assertEquals('1', finalWriterBasedJsonGenerator_outputBuffer6);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer7);
        
        assertEquals(8, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize11() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer2 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 2));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer3 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 3));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer2);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer3);
        
        assertEquals(4, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize12() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals(2, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize13() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 34);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) impl));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer32 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 32));
        int finalWriterBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer32);
        
        assertEquals(0, finalWriterBasedJsonGenerator_outputHead);
        
        assertEquals(2, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize14() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer2 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 2));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer3 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 3));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer2);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer3);
        
        assertEquals(4, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize15() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer2 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 2));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer3 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 3));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer2);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer3);
        
        assertEquals(4, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize16() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 34);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 1));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer32 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 32));
        int finalWriterBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer32);
        
        assertEquals(0, finalWriterBasedJsonGenerator_outputHead);
        
        assertEquals(2, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize17() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", Integer.MIN_VALUE);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals(2, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize18() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 34);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer32 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 32));
        int finalWriterBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer32);
        
        assertEquals(0, finalWriterBasedJsonGenerator_outputHead);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize19() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[11];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 256);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer2 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 2));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer3 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 3));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer2);
        
        assertEquals('0', finalWriterBasedJsonGenerator_outputBuffer3);
        
        assertEquals(4, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testSerialize20() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(_writer, "java.io.Writer", "lock", lock);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method serialize(java.lang.Number, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    /// Actual number of generated tests (199) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test
    public void testSerialize21() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 9223372036854775805L);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArithmeticException: Overflow]
            java.base/java.math.BigDecimal.checkScaleNonZero(BigDecimal.java:4512)
            java.base/java.math.BigDecimal.toPlainString(BigDecimal.java:3475)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:695)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) impl));
    }
    
    @Test
    public void testSerialize22() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {
            -2147483647, 21, 21, 21, 21, 21, 21, 21,
            21
        };
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.IndexOutOfBoundsException: start 0, end -1, length 63]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:680)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:218)
            java.base/java.math.BigInteger.smallToString(BigInteger.java:4058)
            java.base/java.math.BigInteger.toString(BigInteger.java:4087)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:654)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize23() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.smallToString(BigInteger.java:4038)
            java.base/java.math.BigInteger.toString(BigInteger.java:4087)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:654)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize24() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2147483648, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:486)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:426)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:654)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize25() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 9223372036854775805L);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147482621);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArithmeticException: Overflow]
            java.base/java.math.BigDecimal.checkScaleNonZero(BigDecimal.java:4512)
            java.base/java.math.BigDecimal.toPlainString(BigDecimal.java:3475)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:698)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize26() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        int[] mag = {1572866};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:725)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:652)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize27() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        int[] mag = {134217728};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.StringIndexOutOfBoundsException: offset 2, count 9, length 9]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:423)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:721)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:652)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize28() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.smallToString(BigInteger.java:4038)
            java.base/java.math.BigInteger.toString(BigInteger.java:4087)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.toPlainString(BigDecimal.java:3468)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:695)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize29() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.smallToString(BigInteger.java:4038)
            java.base/java.math.BigInteger.toString(BigInteger.java:4087)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.toPlainString(BigDecimal.java:3468)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:698)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) impl));
    }
    
    @Test
    public void testSerialize30() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.smallToString(BigInteger.java:4038)
            java.base/java.math.BigInteger.toString(BigInteger.java:4087)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:652)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize31() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        String stringCache = "";
        setField(bigDecimal, "java.math.BigDecimal", "stringCache", stringCache);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:720)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:696)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize32() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 1L);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:486)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:426)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:700)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize33() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        CharArrayWriter _writer = ((CharArrayWriter) createInstance("java.io.CharArrayWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.io.CharArrayWriter.write(CharArrayWriter.java:102)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:718)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:696)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize34() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        StringWriter _writer = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.io.StringWriter.write(StringWriter.java:95)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:718)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:696)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize35() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.smallToString(BigInteger.java:4038)
            java.base/java.math.BigInteger.toString(BigInteger.java:4087)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:3980)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:695)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize36() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        CharArrayWriter _writer = ((CharArrayWriter) createInstance("java.io.CharArrayWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -4);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -3);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.io.CharArrayWriter.write(CharArrayWriter.java:102)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:786)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:648)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize37() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        StringWriter _writer = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -4);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -3);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.io.StringWriter.write(StringWriter.java:95)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:786)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:648)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize38() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.smallToString(BigInteger.java:4038)
            java.base/java.math.BigInteger.toString(BigInteger.java:4087)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:3980)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:700)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize39() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Short short1 = (short) 0;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:61) */
        numberSerializer.serialize(((Number) short1), ((JsonGenerator) null), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize40() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Float float1 = 0.0f;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:59) */
        numberSerializer.serialize(((Number) float1), ((JsonGenerator) null), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize41() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Double double1 = 0.0;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:57) */
        numberSerializer.serialize(((Number) double1), ((JsonGenerator) null), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize42() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        setField(bigInteger, "java.math.BigInteger", "bitLengthPlusOne", 1);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.toString(BigInteger.java:4086)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:652)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize43() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:654)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize44() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.bitLength(BigInteger.java:3701)
            java.base/java.math.BigInteger.toString(BigInteger.java:3972)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.toPlainString(BigDecimal.java:3494)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:698)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize45() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", -9L);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:486)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:426)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:698)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) impl));
    }
    
    @Test
    public void testSerialize46() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", -1);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", -1);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.<init>(BigInteger.java:1138)
            java.base/java.math.BigInteger.negate(BigInteger.java:2683)
            java.base/java.math.BigInteger.abs(BigInteger.java:2674)
            java.base/java.math.BigInteger.toString(BigInteger.java:3967)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.toPlainString(BigDecimal.java:3481)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:698)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize47() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        setField(intVal, "java.math.BigInteger", "bitLengthPlusOne", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.toString(BigInteger.java:4086)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.toPlainString(BigDecimal.java:3468)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:695)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize48() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        setField(intVal, "java.math.BigInteger", "bitLengthPlusOne", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.toString(BigInteger.java:4086)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.toPlainString(BigDecimal.java:3468)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:698)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize49() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        setField(bigInteger, "java.math.BigInteger", "bitLengthPlusOne", 1);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.toString(BigInteger.java:4086)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:654)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize50() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:486)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:426)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:654)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize51() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.<init>(BigInteger.java:1138)
            java.base/java.math.BigInteger.negate(BigInteger.java:2683)
            java.base/java.math.BigInteger.abs(BigInteger.java:2674)
            java.base/java.math.BigInteger.toString(BigInteger.java:3967)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:652)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize52() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 1L);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:720)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:696)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize53() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", -9399278);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.bitLength(BigInteger.java:3701)
            java.base/java.math.BigInteger.toString(BigInteger.java:3972)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.toPlainString(BigDecimal.java:3481)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:695)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize54() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.<init>(BigInteger.java:1138)
            java.base/java.math.BigInteger.negate(BigInteger.java:2683)
            java.base/java.math.BigInteger.abs(BigInteger.java:2674)
            java.base/java.math.BigInteger.toString(BigInteger.java:3967)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:654)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize55() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", -1);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        CharArrayWriter _writer = ((CharArrayWriter) createInstance("java.io.CharArrayWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.io.CharArrayWriter.write(CharArrayWriter.java:106)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:718)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:696)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize56() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", -1);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        StringWriter _writer = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:99)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:718)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:696)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize57() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", -1);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        BufferedWriter _writer = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:170)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:718)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:696)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize58() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", -1);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        FileWriter _writer = ((FileWriter) createInstance("java.io.FileWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:205)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:718)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:696)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize59() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        setField(intVal, "java.math.BigInteger", "bitLengthPlusOne", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.toString(BigInteger.java:4086)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:3980)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:695)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize60() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.<init>(BigInteger.java:1138)
            java.base/java.math.BigInteger.negate(BigInteger.java:2683)
            java.base/java.math.BigInteger.abs(BigInteger.java:2674)
            java.base/java.math.BigDecimal.toPlainString(BigDecimal.java:3494)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:695)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize61() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        CharArrayWriter _writer = ((CharArrayWriter) createInstance("java.io.CharArrayWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.io.CharArrayWriter.write(CharArrayWriter.java:106)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:721)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:652)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize62() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        StringWriter _writer = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:99)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:721)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:652)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize63() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        BufferedWriter _writer = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:170)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:721)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:652)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize64() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        FileWriter _writer = ((FileWriter) createInstance("java.io.FileWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:205)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:721)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:652)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize65() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 2);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.bitLength(BigInteger.java:3701)
            java.base/java.math.BigInteger.toString(BigInteger.java:3972)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:3980)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:700)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize66() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:423)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:786)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:648)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize67() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.<init>(BigInteger.java:1138)
            java.base/java.math.BigInteger.negate(BigInteger.java:2683)
            java.base/java.math.BigInteger.abs(BigInteger.java:2674)
            java.base/java.math.BigInteger.toString(BigInteger.java:3967)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:3980)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:700)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) impl));
    }
    
    @Test
    public void testSerialize68() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(_writer, "java.io.PrintWriter", "out", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeQuotedRaw(WriterBasedJsonGenerator.java:718)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:652)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:47) */
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) impl));
    }
    
    @Test
    public void testSerialize69() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(_writer, "java.io.PrintWriter", "out", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:794)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:691)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test
    public void testSerialize70() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1024);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:423)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:786)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNumber(WriterBasedJsonGenerator.java:691)
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.serialize(NumberSerializer.java:45) */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method serialize(java.lang.Number, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test(expected = JsonGenerationException.class)
    public void testSerialize71() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test(expected = JsonGenerationException.class)
    public void testSerialize72() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) uTF8JsonGenerator), ((SerializerProvider) null));
    }
    
    @Test(expected = JsonGenerationException.class)
    public void testSerialize73() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) uTF8JsonGenerator), ((SerializerProvider) null));
    }
    
    @Test(expected = JsonGenerationException.class)
    public void testSerialize74() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) impl));
    }
    
    @Test(expected = JsonGenerationException.class)
    public void testSerialize75() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        numberSerializer.serialize(((Number) bigInteger), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test(expected = JsonGenerationException.class)
    public void testSerialize76() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test(expected = JsonGenerationException.class)
    public void testSerialize77() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        numberSerializer.serialize(((Number) integer), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    
    @Test(expected = JsonGenerationException.class)
    public void testSerialize78() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = new BigDecimal(0);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) null));
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method serialize(java.lang.Number, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test(timeout = 1000L)
    public void testSerialize79() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", -418791448);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 9223372036854775805L);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 64);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        numberSerializer.serialize(((Number) bigDecimal), ((JsonGenerator) writerBasedJsonGenerator), ((SerializerProvider) impl));
    }
    ///endregion
    
    ///region Errors report for serialize
    
    public void testSerialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.NumberSerializer.acceptJsonFormatVisitor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_isInt): True}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor__isInt() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        setField(numberSerializer, "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "_isInt", true);
        
        numberSerializer.acceptJsonFormatVisitor(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_isInt): True}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor__isInt_1() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        setField(numberSerializer, "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "_isInt", true);
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base();
        
        numberSerializer.acceptJsonFormatVisitor(base, null);
    }
    
    /**
    @utbot.classUnderTest {@link NumberSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_isInt): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#handledType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#visitFloatFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser.NumberType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_Not_isInt() throws Exception  {
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
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#handledType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.NumberSerializer#visitFloatFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser.NumberType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException() throws Exception  {
        NumberSerializer numberSerializer = ((NumberSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Class _handledType = Object.class;
        setField(numberSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializer.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.NumberSerializer.acceptJsonFormatVisitor(NumberSerializer.java:84) */
        numberSerializer.acceptJsonFormatVisitor(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.NumberSerializer.getSchema
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1071576877934600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1071576877934600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1071576877939699 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1071576877934600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1071576877939699).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1071576878603700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1071576878603700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1071576878604900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1071576878603700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1071576878604900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1071576878972200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1071576878972200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1071576878973800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1071576878972200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1071576878973800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

