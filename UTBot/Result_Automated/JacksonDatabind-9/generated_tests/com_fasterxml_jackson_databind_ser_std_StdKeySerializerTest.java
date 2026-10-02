package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter;
import com.fasterxml.jackson.core.json.DupDetector;
import java.sql.Time;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.SerializationConfig;
import java.io.PrintWriter;
import java.io.IOException;
import java.sql.Date;
import com.fasterxml.jackson.core.JsonGenerationException;
import sun.util.calendar.LocalGregorianCalendar;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipException;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.node.TextNode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class com_fasterxml_jackson_databind_ser_std_StdKeySerializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serialize(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:472)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator(DefaultPrettyPrinter.java:299)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writePPFieldName(WriterBasedJsonGenerator.java:268)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:191)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:104)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 4);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writePPFieldName(WriterBasedJsonGenerator.java:277)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:191)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:104)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2147483645);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483645 out of bounds for length 2]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:653)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator(DefaultPrettyPrinter.java:299)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._writePPFieldName(UTF8JsonGenerator.java:349)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeFieldName(UTF8JsonGenerator.java:175)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jgen.writeFieldName(str);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 4);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:211)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:104)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1883242496);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1883242496);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -1883242496);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultPrettyPrinter.FixedSpaceIndenter _objectIndenter = ((DefaultPrettyPrinter.FixedSpaceIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1883242496 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:472)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter.writeIndentation(DefaultPrettyPrinter.java:402)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeObjectEntries(DefaultPrettyPrinter.java:263)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writePPFieldName(WriterBasedJsonGenerator.java:270)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:191)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:104)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jgen.writeFieldName(str);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1073741823);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeFieldName(UTF8JsonGenerator.java:186)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jgen.writeFieldName(str);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", Integer.MIN_VALUE);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", Integer.MIN_VALUE);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength", 11);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 0]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeFieldName(UTF8JsonGenerator.java:204)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jgen.writeFieldName(str);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength", 10);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeStringSegments(UTF8JsonGenerator.java:1159)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeFieldName(UTF8JsonGenerator.java:198)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", 4);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writePPFieldName(WriterBasedJsonGenerator.java:277)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:191)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:104)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:472)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeObjectEntrySeparator(MinimalPrettyPrinter.java:109)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writePPFieldName(WriterBasedJsonGenerator.java:268)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:191)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:104)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#defaultSerializeDateKey(java.util.Date,com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: provider.defaultSerializeDateKey((Date) value, jgen);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Time time = new Time(0L);
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1073741823);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeFieldName(UTF8JsonGenerator.java:186)
            com.fasterxml.jackson.databind.SerializerProvider.defaultSerializeDateKey(SerializerProvider.java:1027)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:29) */
        stdKeySerializer.serialize(time, uTF8JsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jgen.writeFieldName(str);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeFieldName(UTF8JsonGenerator.java:186)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: jgen.writeFieldName(str);
 *  */
    @Test
    public void testSerialize_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous", Integer.MIN_VALUE);
        char[] _charBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer", _charBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_cfgUnqNames", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2147483648, length 11]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeStringSegments(UTF8JsonGenerator.java:1168)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeFieldName(UTF8JsonGenerator.java:192)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: jgen.writeFieldName(str);
 *  */
    @Test
    public void testSerialize_ThrowStringIndexOutOfBoundsException() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1073741828);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous", 11);
        char[] _charBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer", _charBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength", 11);
        int[] _outputEscapes = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes", _outputEscapes);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 11, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeFieldName(UTF8JsonGenerator.java:205)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jgen.writeFieldName(str);
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MAX_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "";
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName", _firstName);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:199)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:104)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(_writer, "java.io.Writer", "lock", lock);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:199)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:104)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowStringIndexOutOfBoundsException_2() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -8);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous", 8);
        char[] _charBuffer = {'\u0000'};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer", _charBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_cfgUnqNames", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 8, length 1]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeStringSegments(UTF8JsonGenerator.java:1168)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeFieldName(UTF8JsonGenerator.java:192)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: jgen.writeFieldName(str);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException() throws IOException  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: provider.defaultSerializeDateKey((Date) value, jgen);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_1() throws IOException  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Date date = new Date(0L);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:29) */
        stdKeySerializer.serialize(date, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: str = value.toString();
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_2() throws IOException  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:32) */
        stdKeySerializer.serialize(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: jgen.writeFieldName(str);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_7() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "";
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName", _firstName);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:199)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:104)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_8() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "";
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName", _firstName);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:653)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeObjectEntrySeparator(MinimalPrettyPrinter.java:109)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._writePPFieldName(UTF8JsonGenerator.java:349)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeFieldName(UTF8JsonGenerator.java:175)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: jgen.writeFieldName(str);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_5() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "";
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName", _firstName);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeFieldName(UTF8JsonGenerator.java:186)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: jgen.writeFieldName(str);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_4() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1073741823);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1073741824);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength", 10);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeStringSegments(UTF8JsonGenerator.java:1159)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeFieldName(UTF8JsonGenerator.java:198)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: jgen.writeFieldName(str);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_6() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1073741828);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous", 11);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength", 11);
        int[] _outputEscapes = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes", _outputEscapes);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeFieldName(UTF8JsonGenerator.java:205)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_3() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483638);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483638);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 11);
        int[] _outputEscapes = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes", _outputEscapes);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:918)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:206)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:104)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.serialize(StdKeySerializer.java:34) */
        stdKeySerializer.serialize(integer, writerBasedJsonGenerator, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method serialize(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonGenerationException} in: jgen.writeFieldName(str);
 *  */
    @Test(expected = JsonGenerationException.class)
    public void testSerialize_ThrowJsonGenerationException() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        stdKeySerializer.serialize(integer, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): True}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonGenerationException} in: provider.defaultSerializeDateKey((Date) value, jgen);
 *  */
    @Test(expected = JsonGenerationException.class)
    public void testSerialize_ThrowJsonGenerationException_2() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Date date = new Date(java.lang.Long.MIN_VALUE);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        stdKeySerializer.serialize(date, writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): True}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonGenerationException} in: provider.defaultSerializeDateKey((Date) value, jgen);
 *  */
    @Test(expected = JsonGenerationException.class)
    public void testSerialize_ThrowJsonGenerationException_4() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Date date = ((Date) createInstance("java.sql.Date"));
        setField(date, "java.util.Date", "fastTime", java.lang.Long.MIN_VALUE);
        sun.util.calendar.LocalGregorianCalendar.Date cdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(cdate, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date, "java.util.Date", "cdate", cdate);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        stdKeySerializer.serialize(date, writerBasedJsonGenerator, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonGenerationException} in: jgen.writeFieldName(str);
 *  */
    @Test(expected = JsonGenerationException.class)
    public void testSerialize_ThrowJsonGenerationException_3() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonGenerationException} in: jgen.writeFieldName(str);
 *  */
    @Test(expected = JsonGenerationException.class)
    public void testSerialize_ThrowJsonGenerationException_1() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testSerialize_ThrowZipException() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ZipOutputStream _outputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength", 10);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSerialize_ThrowIOException() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        OutputStreamWriter _writer = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(_writer, "java.io.OutputStreamWriter", "se", se);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        stdKeySerializer.serialize(integer, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: jgen.writeFieldName(str);
 *  */
    @Test(expected = ZipException.class)
    public void testSerialize_ThrowZipException_1() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ZipOutputStream _outputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSerialize_ThrowIOException_1() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        GZIPOutputStream _outputStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(_outputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (value instanceof Date): False}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSerialize_ThrowIOException_2() throws Exception  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        Integer integer = Integer.MIN_VALUE;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ZipOutputStream _outputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(_outputStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        Object zsRef = createInstance("java.util.zip.Deflater$DeflaterZStreamRef");
        setField(def, "java.util.zip.Deflater", "zsRef", zsRef);
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(_outputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength", 11);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        stdKeySerializer.serialize(integer, uTF8JsonGenerator, null);
    }
    ///endregion
    
    ///region Errors report for serialize
    
    public void testSerialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdKeySerializer.acceptJsonFormatVisitor
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#expectStringFormat(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: visitor.expectStringFormat(typeHint);
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException() throws JsonMappingException  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdKeySerializer.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.StdKeySerializer.acceptJsonFormatVisitor(StdKeySerializer.java:44) */
        stdKeySerializer.acceptJsonFormatVisitor(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdKeySerializer.getSchema
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link StdKeySerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#createSchemaNode(java.lang.String)}
 * @utbot.returnsFrom {@code return createSchemaNode("string");}
 *  */
    @Test
    public void testGetSchema_StdKeySerializerCreateSchemaNode() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, JsonMappingException  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            StdKeySerializer stdKeySerializer = new StdKeySerializer();
            
            ObjectNode actual = ((ObjectNode) stdKeySerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "string";
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
     */
    @Test
    public void testGetSchema() throws JsonMappingException  {
        StdKeySerializer stdKeySerializer = new StdKeySerializer();
        
        ObjectNode actual = ((ObjectNode) stdKeySerializer.getSchema(null, null));
        
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "type";
        String string1 = "string";
        TextNode textNode = new TextNode(string1);
        linkedHashMap.put(string, textNode);
        ObjectNode expected = new ObjectNode(jsonNodeFactory, linkedHashMap);
        
        // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
        assertEquals(expected, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1064330444650900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1064330444650900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1064330444660499 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1064330444650900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1064330444660499).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1064330445619599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1064330445619599.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1064330445623999 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1064330445619599.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1064330445623999).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

