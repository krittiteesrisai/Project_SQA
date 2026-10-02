package com.fasterxml.jackson.databind.ser.impl;

import org.junit.Test;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import java.lang.reflect.Field;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.PrintWriter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;

public final class com_fasterxml_jackson_databind_ser_impl_WritableObjectIdTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.impl.WritableObjectId.generateId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method generateId(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#generateId(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.annotation.ObjectIdGenerator#generateId(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: id = generator.generateId(forPojo);
 *  */
    @Test
    public void testGenerateId_ThrowNullPointerException() {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.generateId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.generateId(WritableObjectId.java:50) */
        writableObjectId.generateId(null);
    }
    ///endregion
    
    ///region Errors report for generateId
    
    public void testGenerateId_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 24 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeAsField(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsField(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (gen.canWriteObjectId()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeObjectId(java.lang.Object)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testWriteAsField_GenCanWriteObjectId() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        writableObjectId.idWritten = false;
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeObjectIds", true);
        
        writableObjectId.writeAsField(tokenBuffer, null, null);
        
        boolean finalWritableObjectIdIdWritten = writableObjectId.idWritten;
        
        boolean finalTokenBuffer_hasNativeId = ((Boolean) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId"));
        
        assertTrue(finalWritableObjectIdIdWritten);
        
        assertTrue(finalTokenBuffer_hasNativeId);
    }
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsField(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (gen.canWriteObjectId()): False}
 * @utbot.executesCondition {@code (name != null): False}
 *  */
    @Test
    public void testWriteAsField_NameEqualsNull() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        writableObjectId.idWritten = false;
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, null, false);
        
        writableObjectId.writeAsField(tokenBuffer, null, objectIdWriter);
        
        boolean finalWritableObjectIdIdWritten = writableObjectId.idWritten;
        
        assertTrue(finalWritableObjectIdIdWritten);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeAsField(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsField(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (gen.canWriteObjectId()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#canWriteObjectId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SerializableString name = w.propertyName;
 *  */
    @Test
    public void testWriteAsField_ThrowNullPointerException_1() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        writableObjectId.idWritten = false;
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsField(WritableObjectId.java:69) */
        writableObjectId.writeAsField(tokenBuffer, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsField(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#canWriteObjectId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: gen.canWriteObjectId()
 *  */
    @Test
    public void testWriteAsField_ThrowNullPointerException() throws IOException  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        writableObjectId.idWritten = false;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsField(WritableObjectId.java:63) */
        writableObjectId.writeAsField(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeAsField(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)
    
    @Test
    public void testWriteAsField1() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        writableObjectId.idWritten = false;
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, serializedString, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1076)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:657)
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsField(WritableObjectId.java:71) */
        writableObjectId.writeAsField(tokenBuffer, null, objectIdWriter);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeAsId(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (id != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testWriteAsId_IdEqualsNull() throws IOException  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        
        boolean actual = writableObjectId.writeAsId(null, null, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (id != null): True}
 * @utbot.executesCondition {@code (idWritten || w.alwaysAsId): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testWriteAsId_IdEqualsNullAndIdWrittenOrWAlwaysAsId() throws IOException  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = false;
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, null, false);
        
        boolean actual = writableObjectId.writeAsId(null, null, objectIdWriter);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (id != null): True}
 * @utbot.executesCondition {@code (idWritten || w.alwaysAsId): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testWriteAsId_IdWrittenOrWAlwaysAsId() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        short[] id = {};
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 4);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 15);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, nullSerializer, false);
        
        boolean actual = writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
        
        assertTrue(actual);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer4 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 4));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer5 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 5));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer6 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 6));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer7 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 7));
        char[] writerBasedJsonGenerator_outputBuffer4 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer8 = ((Character) get(writerBasedJsonGenerator_outputBuffer4, 8));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer4);
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer5);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer6);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer7);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer8);
        
        assertEquals(9, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (id != null): True}
 * @utbot.executesCondition {@code (idWritten || w.alwaysAsId): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testWriteAsId_IdWrittenOrWAlwaysAsId_1() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        byte[] id = {};
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 7);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 12);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, nullSerializer);
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, typeWrappedSerializer, false);
        
        boolean actual = writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
        
        assertTrue(actual);
        
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
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeAsId(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (idWritten || w.alwaysAsId): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: w.serializer.serialize(id, gen, provider);
 *  */
    @Test
    public void testWriteAsId_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        byte[] id = {};
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 7);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, nullSerializer, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1624)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
    }
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (idWritten || w.alwaysAsId): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: w.serializer.serialize(id, gen, provider);
 *  */
    @Test
    public void testWriteAsId_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        int[] id = {};
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[12];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 12);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 11);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 15);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, nullSerializer, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
    }
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (idWritten || w.alwaysAsId): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: w.serializer.serialize(id, gen, provider);
 *  */
    @Test
    public void testWriteAsId_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        int[] id = {};
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, nullSerializer, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:796)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:754)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
    }
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (idWritten || w.alwaysAsId): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: w.serializer.serialize(id, gen, provider);
 *  */
    @Test
    public void testWriteAsId_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        byte[] id = {};
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MAX_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483644);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        AsArrayTypeSerializer asArrayTypeSerializer = new AsArrayTypeSerializer(null, null);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(asArrayTypeSerializer, nullSerializer);
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, typeWrappedSerializer, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serializeWithType(NullSerializer.java:44)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:32)
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
    }
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (idWritten || w.alwaysAsId): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: w.serializer.serialize(id, gen, provider);
 *  */
    @Test
    public void testWriteAsId_ThrowNullPointerException_3() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(tokenBuffer, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (idWritten || w.alwaysAsId): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: w.serializer.serialize(id, gen, provider);
 *  */
    @Test
    public void testWriteAsId_ThrowNullPointerException_5() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(uTF8JsonGenerator, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (idWritten || w.alwaysAsId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (id != null) && (idWritten || w.alwaysAsId)
 *  */
    @Test
    public void testWriteAsId_ThrowNullPointerException() throws IOException  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = false;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:34) */
        writableObjectId.writeAsId(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (idWritten || w.alwaysAsId): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: gen.canWriteObjectId()
 *  */
    @Test
    public void testWriteAsId_ThrowNullPointerException_1() throws IOException  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:36) */
        writableObjectId.writeAsId(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (idWritten || w.alwaysAsId): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: w.serializer.serialize(id, gen, provider);
 *  */
    @Test
    public void testWriteAsId_ThrowNullPointerException_4() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(tokenBuffer, null, objectIdWriter);
    }
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (idWritten || w.alwaysAsId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: gen.canWriteObjectId()
 *  */
    @Test
    public void testWriteAsId_ThrowNullPointerException_2() throws IOException  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = false;
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, null, true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:36) */
        writableObjectId.writeAsId(null, null, objectIdWriter);
    }
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (idWritten || w.alwaysAsId): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: w.serializer.serialize(id, gen, provider);
 *  */
    @Test
    public void testWriteAsId_ThrowNullPointerException_6() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        byte[] id = {};
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, nullSerializer, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeAsId(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)
    
    /**
    @utbot.classUnderTest {@link WritableObjectId}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.impl.WritableObjectId#writeAsId(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)}
 * @utbot.executesCondition {@code (id != null): True}
 * @utbot.executesCondition {@code (idWritten || w.alwaysAsId): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#canWriteObjectId()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeObjectRef(java.lang.Object)}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonGenerationException} in: gen.writeObjectRef(String.valueOf(id));
 *  */
    @Test(expected = JsonGenerationException.class)
    public void testWriteAsId_ThrowJsonGenerationException() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Integer id = 0;
        writableObjectId.id = id;
        writableObjectId.idWritten = false;
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeObjectIds", true);
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, null, true);
        
        writableObjectId.writeAsId(tokenBuffer, null, objectIdWriter);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeAsId(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)
    
    @Test
    public void testWriteAsId1() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[13];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 9);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 14);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, nullSerializer, false);
        
        boolean actual = writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
        
        assertTrue(actual);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer9 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 9));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer10 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 10));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer11 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 11));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer12 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 12));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer9);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer10);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer11);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer12);
        
        assertEquals(13, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteAsId2() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[13];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483646);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 9);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483634);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, nullSerializer, false);
        
        boolean actual = writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
        
        assertTrue(actual);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer9 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 9));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer10 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 10));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer11 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 11));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer12 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 12));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer9);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer10);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer11);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer12);
        
        assertEquals(13, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteAsId3() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[13];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483646);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 9);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483634);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, nullSerializer);
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, typeWrappedSerializer, false);
        
        boolean actual = writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
        
        assertTrue(actual);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer9 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 9));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer10 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 10));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer11 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 11));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer12 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 12));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer9);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer10);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer11);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer12);
        
        assertEquals(13, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteAsId4() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[13];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483646);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 9);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483634);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, nullSerializer);
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, typeWrappedSerializer, false);
        
        boolean actual = writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
        
        assertTrue(actual);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer9 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 9));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer10 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 10));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer11 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 11));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer12 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 12));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer9);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer10);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer11);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer12);
        
        assertEquals(13, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(-2147483647, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteAsId5() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 7);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 4);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 7);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, nullSerializer);
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, typeWrappedSerializer, false);
        
        boolean actual = writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
        
        assertTrue(actual);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer4 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 4));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer5 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 5));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer6 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 6));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer7 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 7));
        char[] writerBasedJsonGenerator_outputBuffer4 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer8 = ((Character) get(writerBasedJsonGenerator_outputBuffer4, 8));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer4);
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer5);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer6);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer7);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer8);
        
        assertEquals(9, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeAsId(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)
    
    @Test
    public void testWriteAsId6() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = false;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 35);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 35);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, nullSerializer, true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.ArrayIndexOutOfBoundsException: Index 33 out of bounds for length 33]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
    }
    
    @Test
    public void testWriteAsId7() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 8);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 13);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, nullSerializer);
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, typeWrappedSerializer, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1624)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serializeWithType(NullSerializer.java:44)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:32)
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
    }
    
    @Test
    public void testWriteAsId8() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, nullSerializer, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
    }
    
    @Test
    public void testWriteAsId9() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -12);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 2147483641);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, nullSerializer, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
    }
    
    @Test
    public void testWriteAsId10() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, nullSerializer, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:477)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:354)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:810)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:769)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:754)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
    }
    
    @Test
    public void testWriteAsId11() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, nullSerializer);
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, typeWrappedSerializer, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serializeWithType(NullSerializer.java:44)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:32)
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
    }
    
    @Test
    public void testWriteAsId12() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = false;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483643);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, nullSerializer, true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1619)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
    }
    
    @Test
    public void testWriteAsId13() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = true;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, nullSerializer);
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, typeWrappedSerializer, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:477)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:354)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:810)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:769)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:754)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serializeWithType(NullSerializer.java:44)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:32)
            com.fasterxml.jackson.databind.ser.impl.WritableObjectId.writeAsId(WritableObjectId.java:39) */
        writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method writeAsId(com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)
    
    @Test(expected = JsonGenerationException.class)
    public void testWriteAsId14() throws Exception  {
        WritableObjectId writableObjectId = new WritableObjectId(null);
        Object id = new Object();
        writableObjectId.id = id;
        writableObjectId.idWritten = false;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, nullSerializer);
        TypeWrappedSerializer typeWrappedSerializer1 = new TypeWrappedSerializer(null, typeWrappedSerializer);
        TypeWrappedSerializer typeWrappedSerializer2 = new TypeWrappedSerializer(null, typeWrappedSerializer1);
        ObjectIdWriter objectIdWriter = new ObjectIdWriter(null, null, null, typeWrappedSerializer2, true);
        
        writableObjectId.writeAsId(writerBasedJsonGenerator, null, objectIdWriter);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1075834792533899 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1075834792533899.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1075834792544300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1075834792533899.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1075834792544300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1075834793243800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1075834793243800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1075834793246200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1075834793243800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1075834793246200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

