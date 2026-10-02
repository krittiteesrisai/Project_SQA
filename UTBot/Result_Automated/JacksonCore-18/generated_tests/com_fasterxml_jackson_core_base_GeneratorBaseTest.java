package com.fasterxml.jackson.core.base;

import org.junit.Test;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import java.util.concurrent.atomic.LongAdder;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.OutputStream;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.json.DupDetector;
import java.io.Writer;
import java.util.HashSet;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.PrintWriter;
import com.fasterxml.jackson.core.JsonGenerationException;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import sun.security.util.DerOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_core_base_GeneratorBaseTest {
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.version
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method version()
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#version()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.VersionUtil#versionFor(java.lang.Class)}
 *  */
    @Test
    public void testVersion_VersionUtilVersionFor() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        Version actual = uTF8JsonGenerator.version();
        
        Version expected = ((Version) createInstance("com.fasterxml.jackson.core.Version"));
        setField(expected, "com.fasterxml.jackson.core.Version", "_majorVersion", 2);
        setField(expected, "com.fasterxml.jackson.core.Version", "_minorVersion", 7);
        setField(expected, "com.fasterxml.jackson.core.Version", "_patchLevel", 7);
        String _groupId = "com.fasterxml.jackson.core";
        setField(expected, "com.fasterxml.jackson.core.Version", "_groupId", _groupId);
        String _artifactId = "jackson-core";
        setField(expected, "com.fasterxml.jackson.core.Version", "_artifactId", _artifactId);
        String _snapshotInfo = "SNAPSHOT";
        setField(expected, "com.fasterxml.jackson.core.Version", "_snapshotInfo", _snapshotInfo);
        
        // com.fasterxml.jackson.core.Version has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method version()
    
    @Test
    public void testVersion1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        
        Version actual = writerBasedJsonGenerator.version();
        
        Version expected = ((Version) createInstance("com.fasterxml.jackson.core.Version"));
        setField(expected, "com.fasterxml.jackson.core.Version", "_majorVersion", 2);
        setField(expected, "com.fasterxml.jackson.core.Version", "_minorVersion", 7);
        setField(expected, "com.fasterxml.jackson.core.Version", "_patchLevel", 7);
        String _groupId = "com.fasterxml.jackson.core";
        setField(expected, "com.fasterxml.jackson.core.Version", "_groupId", _groupId);
        String _artifactId = "jackson-core";
        setField(expected, "com.fasterxml.jackson.core.Version", "_artifactId", _artifactId);
        String _snapshotInfo = "SNAPSHOT";
        setField(expected, "com.fasterxml.jackson.core.Version", "_snapshotInfo", _snapshotInfo);
        
        // com.fasterxml.jackson.core.Version has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for version
    
    public void testVersion_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.writeObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeObject(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeObject(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.GeneratorBase#writeNull()}
 *  */
    @Test
    public void testWriteObject_ValueEqualsNull() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[31];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 23);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 28);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        writerBasedJsonGenerator.writeObject(null);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer23 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 23));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer24 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 24));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer25 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 25));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer26 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 26));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer23);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer24);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer25);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer26);
        
        assertEquals(27, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeObject(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeObject(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _writeSimpleObject(value);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testWriteObject_ThrowIllegalStateException_1() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[][] byteArray = {null};
        
        uTF8JsonGenerator.writeObject(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeObject(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _writeSimpleObject(value);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testWriteObject_ThrowIllegalStateException() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        LongAdder longAdder = new LongAdder();
        
        uTF8JsonGenerator.writeObject(longAdder);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeObject(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeNull();
 *  */
    @Test
    public void testWriteObject_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:746)
            com.fasterxml.jackson.core.base.GeneratorBase.writeObject(GeneratorBase.java:357) */
        writerBasedJsonGenerator.writeObject(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeObject(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeNull();
 *  */
    @Test
    public void testWriteObject_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:746)
            com.fasterxml.jackson.core.base.GeneratorBase.writeObject(GeneratorBase.java:357) */
        writerBasedJsonGenerator.writeObject(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeObject(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeNull();
 *  */
    @Test
    public void testWriteObject_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -3 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1615)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:747)
            com.fasterxml.jackson.core.base.GeneratorBase.writeObject(GeneratorBase.java:357) */
        writerBasedJsonGenerator.writeObject(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeObject(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeNull();
 *  */
    @Test
    public void testWriteObject_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:746)
            com.fasterxml.jackson.core.base.GeneratorBase.writeObject(GeneratorBase.java:357) */
        writerBasedJsonGenerator.writeObject(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeObject(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (_objectCodec != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.GeneratorBase#_writeSimpleObject(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteObject_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[40];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 55);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 61);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        Boolean boolean1 = false;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 55 out of bounds for length 40]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeBoolean(WriterBasedJsonGenerator.java:735)
            com.fasterxml.jackson.core.JsonGenerator._writeSimpleObject(JsonGenerator.java:1792)
            com.fasterxml.jackson.core.base.GeneratorBase.writeObject(GeneratorBase.java:368) */
        writerBasedJsonGenerator.writeObject(boolean1);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeObject(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeNull();
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MAX_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483644);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1615)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:747)
            com.fasterxml.jackson.core.base.GeneratorBase.writeObject(GeneratorBase.java:357) */
        writerBasedJsonGenerator.writeObject(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.close
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* There is no instantiatable inheritor of the class under test
        that does not override a method given for testing */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.writeString
    
    ///region Errors report for writeString
    
    public void testWriteString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* There is no instantiatable inheritor of the class under test
        that does not override a method given for testing */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.isEnabled
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.returnsFrom {@code return (_features & f.getMask()) != 0;}
 *  */
    @Test
    public void testIsEnabled_Return_featuresBitwiseAndFGetMaskEqualsZero() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        uTF8JsonGenerator._features = 1;
        JsonGenerator.Feature feature = JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
        
        boolean actual = uTF8JsonGenerator.isEnabled(feature);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.returnsFrom {@code return (_features & f.getMask()) != 0;}
 *  */
    @Test
    public void testIsEnabled_Return_featuresBitwiseAndFGetMaskEqualsZero_1() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        uTF8JsonGenerator._features = -1;
        JsonGenerator.Feature feature = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
        
        boolean actual = uTF8JsonGenerator.isEnabled(feature);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator.Feature#getMask()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: /*
 *     /**********************************************************
 *     /* Configuration
 *     /**********************************************************
 *      */
 * @Override
 * public final boolean isEnabled(Feature f) {
 *     return (_features & f.getMask()) != 0;
 * }
 *  */
    @Test
    public void testIsEnabled_ThrowNullPointerException() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        uTF8JsonGenerator._features = -255;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.isEnabled] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.GeneratorBase.isEnabled(GeneratorBase.java:146) */
        uTF8JsonGenerator.isEnabled(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.enable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method enable(com.fasterxml.jackson.core.JsonGenerator$Feature)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#enable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code ((mask & DERIVED_FEATURES_MASK) != 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnable_MaskBitwiseAndDERIVED_FEATURES_MASKEqualsZero() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -255;
            JsonGenerator.Feature feature = JsonGenerator.Feature.AUTO_CLOSE_TARGET;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.enable(feature));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#enable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code ((mask & DERIVED_FEATURES_MASK) != 0): True}
 * @utbot.executesCondition {@code (f == Feature.WRITE_NUMBERS_AS_STRINGS): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnable_FEqualsFeatureWRITE_NUMBERS_AS_STRINGS() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -255;
            JsonGenerator.Feature feature = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.enable(feature));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertTrue(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalUTF8JsonGenerator_features = uTF8JsonGenerator._features;
            boolean finalUTF8JsonGenerator_cfgNumbersAsStrings = uTF8JsonGenerator._cfgNumbersAsStrings;
            
            assertEquals(-223, finalUTF8JsonGenerator_features);
            
            assertTrue(finalUTF8JsonGenerator_cfgNumbersAsStrings);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#enable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code ((mask & DERIVED_FEATURES_MASK) != 0): True}
 * @utbot.executesCondition {@code (f == Feature.WRITE_NUMBERS_AS_STRINGS): False}
 * @utbot.executesCondition {@code (f == Feature.ESCAPE_NON_ASCII): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.GeneratorBase#setHighestNonEscapedChar(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnable_FEqualsFeatureESCAPE_NON_ASCII() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -255;
            JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.enable(feature));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalUTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int finalUTF8JsonGenerator_features = uTF8JsonGenerator._features;
            
            assertEquals(127, finalUTF8JsonGenerator_maximumNonEscapedChar);
            
            assertEquals(-127, finalUTF8JsonGenerator_features);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#enable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code ((mask & DERIVED_FEATURES_MASK) != 0): True}
 * @utbot.executesCondition {@code (f == Feature.WRITE_NUMBERS_AS_STRINGS): False}
 * @utbot.executesCondition {@code (f == Feature.ESCAPE_NON_ASCII): False}
 * @utbot.executesCondition {@code (f == Feature.STRICT_DUPLICATE_DETECTION): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.DupDetector#rootDetector(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#withDupDetector(com.fasterxml.jackson.core.json.DupDetector)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnable_JsonWriteContextWithDupDetector() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            writerBasedJsonGenerator._features = -255;
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            writerBasedJsonGenerator._writeContext = _writeContext;
            JsonGenerator.Feature feature = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
            
            JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
            DupDetector initialWriterBasedJsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            
            WriterBasedJsonGenerator actual = ((WriterBasedJsonGenerator) writerBasedJsonGenerator.enable(feature));
            
            Writer actual_writer = ((Writer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
            assertNull(actual_writer);
            
            char[] actual_outputBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int writerBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            int actual_outputHead = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            assertEquals(writerBasedJsonGenerator_outputHead, actual_outputHead);
            
            int writerBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            assertEquals(writerBasedJsonGenerator_outputTail, actual_outputTail);
            
            int writerBasedJsonGenerator_outputEnd = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            assertEquals(writerBasedJsonGenerator_outputEnd, actual_outputEnd);
            
            char[] actual_entityBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            SerializableString actual_currentEscape = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_currentEscape"));
            assertNull(actual_currentEscape);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int writerBasedJsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(writerBasedJsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int writerBasedJsonGenerator_features = writerBasedJsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(writerBasedJsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext writerBasedJsonGenerator_writeContext = writerBasedJsonGenerator._writeContext;
            JsonWriteContext actual_writeContext = actual._writeContext;
            JsonWriteContext actual_writeContext_parent = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent"));
            assertNull(actual_writeContext_parent);
            
            DupDetector writerBasedJsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            DupDetector actual_writeContext_dups = ((DupDetector) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            Object writerBasedJsonGenerator_writeContext_dups_source = getFieldValue(writerBasedJsonGenerator_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
            Object actual_writeContext_dups_source = getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            boolean actual_writeContext_dups_source_closed = ((Boolean) getFieldValue(actual_writeContext_dups_source, "com.fasterxml.jackson.core.base.GeneratorBase", "_closed"));
            assertFalse(actual_writeContext_dups_source_closed);
            
            PrettyPrinter actual_writeContext_dups_source_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual_writeContext_dups_source, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_writeContext_dups_source_cfgPrettyPrinter);
            
            String actual_writeContext_dups_firstName = ((String) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName"));
            assertNull(actual_writeContext_dups_firstName);
            
            String actual_writeContext_dups_secondName = ((String) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_secondName"));
            assertNull(actual_writeContext_dups_secondName);
            
            HashSet actual_writeContext_dups_seen = ((HashSet) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_seen"));
            assertNull(actual_writeContext_dups_seen);
            
            JsonWriteContext actual_writeContext_child = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child"));
            assertNull(actual_writeContext_child);
            
            String actual_writeContext_currentName = ((String) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName"));
            assertNull(actual_writeContext_currentName);
            
            Object actual_writeContext_currentValue = getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentValue");
            assertNull(actual_writeContext_currentValue);
            
            boolean actual_writeContext_gotName = ((Boolean) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
            assertFalse(actual_writeContext_gotName);
            
            int writerBasedJsonGenerator_writeContext_type = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            int actual_writeContext_type = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            assertEquals(writerBasedJsonGenerator_writeContext_type, actual_writeContext_type);
            
            int writerBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            int actual_writeContext_index = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            assertEquals(writerBasedJsonGenerator_writeContext_index, actual_writeContext_index);
            
            assertTrue(deepEquals(writerBasedJsonGenerator, actual));
            assertTrue(deepEquals(writerBasedJsonGenerator, actual));
            
            JsonWriteContext jsonWriteContext1 = writerBasedJsonGenerator._writeContext;
            DupDetector finalWriterBasedJsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            
            assertFalse(initialWriterBasedJsonGenerator_writeContext_dups == finalWriterBasedJsonGenerator_writeContext_dups);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#enable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code ((mask & DERIVED_FEATURES_MASK) != 0): True}
 * @utbot.executesCondition {@code (f == Feature.WRITE_NUMBERS_AS_STRINGS): False}
 * @utbot.executesCondition {@code (f == Feature.ESCAPE_NON_ASCII): False}
 * @utbot.executesCondition {@code (f == Feature.STRICT_DUPLICATE_DETECTION): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnable_FEqualsFeatureSTRICT_DUPLICATE_DETECTION() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            writerBasedJsonGenerator._features = 2;
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
            setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
            writerBasedJsonGenerator._writeContext = _writeContext;
            JsonGenerator.Feature feature = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
            
            WriterBasedJsonGenerator actual = ((WriterBasedJsonGenerator) writerBasedJsonGenerator.enable(feature));
            
            Writer actual_writer = ((Writer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
            assertNull(actual_writer);
            
            char[] actual_outputBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int writerBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            int actual_outputHead = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            assertEquals(writerBasedJsonGenerator_outputHead, actual_outputHead);
            
            int writerBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            assertEquals(writerBasedJsonGenerator_outputTail, actual_outputTail);
            
            int writerBasedJsonGenerator_outputEnd = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            assertEquals(writerBasedJsonGenerator_outputEnd, actual_outputEnd);
            
            char[] actual_entityBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            SerializableString actual_currentEscape = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_currentEscape"));
            assertNull(actual_currentEscape);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int writerBasedJsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(writerBasedJsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int writerBasedJsonGenerator_features = writerBasedJsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(writerBasedJsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext writerBasedJsonGenerator_writeContext = writerBasedJsonGenerator._writeContext;
            JsonWriteContext actual_writeContext = actual._writeContext;
            JsonWriteContext actual_writeContext_parent = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent"));
            assertNull(actual_writeContext_parent);
            
            DupDetector writerBasedJsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            DupDetector actual_writeContext_dups = ((DupDetector) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            Object actual_writeContext_dups_source = getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
            assertNull(actual_writeContext_dups_source);
            
            String actual_writeContext_dups_firstName = ((String) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName"));
            assertNull(actual_writeContext_dups_firstName);
            
            String actual_writeContext_dups_secondName = ((String) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_secondName"));
            assertNull(actual_writeContext_dups_secondName);
            
            HashSet actual_writeContext_dups_seen = ((HashSet) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_seen"));
            assertNull(actual_writeContext_dups_seen);
            
            JsonWriteContext actual_writeContext_child = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child"));
            assertNull(actual_writeContext_child);
            
            String actual_writeContext_currentName = ((String) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName"));
            assertNull(actual_writeContext_currentName);
            
            Object actual_writeContext_currentValue = getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentValue");
            assertNull(actual_writeContext_currentValue);
            
            boolean actual_writeContext_gotName = ((Boolean) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
            assertFalse(actual_writeContext_gotName);
            
            int writerBasedJsonGenerator_writeContext_type = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            int actual_writeContext_type = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            assertEquals(writerBasedJsonGenerator_writeContext_type, actual_writeContext_type);
            
            int writerBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            int actual_writeContext_index = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            assertEquals(writerBasedJsonGenerator_writeContext_index, actual_writeContext_index);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalWriterBasedJsonGenerator_features = writerBasedJsonGenerator._features;
            
            assertEquals(258, finalWriterBasedJsonGenerator_features);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method enable(com.fasterxml.jackson.core.JsonGenerator$Feature)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#enable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator.Feature#getMask()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int mask = f.getMask();
 *  */
    @Test
    public void testEnable_ThrowNullPointerException() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.enable] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.GeneratorBase.enable(GeneratorBase.java:153) */
        uTF8JsonGenerator.enable(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#enable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code ((mask & DERIVED_FEATURES_MASK) != 0): True}
 * @utbot.executesCondition {@code (f == Feature.WRITE_NUMBERS_AS_STRINGS): False}
 * @utbot.executesCondition {@code (f == Feature.ESCAPE_NON_ASCII): False}
 * @utbot.executesCondition {@code (f == Feature.STRICT_DUPLICATE_DETECTION): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator.Feature#getMask()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#getDupDetector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _writeContext.getDupDetector() == null
 *  */
    @Test
    public void testEnable_ThrowNullPointerException_1() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -255;
            JsonGenerator.Feature feature = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
            
            /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.enable] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.base.GeneratorBase.enable(GeneratorBase.java:162) */
            uTF8JsonGenerator.enable(feature);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.disable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method disable(com.fasterxml.jackson.core.JsonGenerator$Feature)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#disable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code ((mask & DERIVED_FEATURES_MASK) != 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDisable_MaskBitwiseAndDERIVED_FEATURES_MASKEqualsZero() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -255;
            JsonGenerator.Feature feature = JsonGenerator.Feature.AUTO_CLOSE_TARGET;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.disable(feature));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalUTF8JsonGenerator_features = uTF8JsonGenerator._features;
            
            assertEquals(-256, finalUTF8JsonGenerator_features);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#disable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code ((mask & DERIVED_FEATURES_MASK) != 0): True}
 * @utbot.executesCondition {@code (f == Feature.WRITE_NUMBERS_AS_STRINGS): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDisable_FEqualsFeatureWRITE_NUMBERS_AS_STRINGS() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -255;
            JsonGenerator.Feature feature = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.disable(feature));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#disable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code ((mask & DERIVED_FEATURES_MASK) != 0): True}
 * @utbot.executesCondition {@code (f == Feature.WRITE_NUMBERS_AS_STRINGS): False}
 * @utbot.executesCondition {@code (f == Feature.ESCAPE_NON_ASCII): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.GeneratorBase#setHighestNonEscapedChar(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDisable_FEqualsFeatureESCAPE_NON_ASCII() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -255;
            JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.disable(feature));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#disable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code ((mask & DERIVED_FEATURES_MASK) != 0): True}
 * @utbot.executesCondition {@code (f == Feature.WRITE_NUMBERS_AS_STRINGS): False}
 * @utbot.executesCondition {@code (f == Feature.ESCAPE_NON_ASCII): False}
 * @utbot.executesCondition {@code (f == Feature.STRICT_DUPLICATE_DETECTION): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#withDupDetector(com.fasterxml.jackson.core.json.DupDetector)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDisable_FEqualsFeatureSTRICT_DUPLICATE_DETECTION() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -255;
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            uTF8JsonGenerator._writeContext = _writeContext;
            JsonGenerator.Feature feature = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.disable(feature));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext uTF8JsonGenerator_writeContext = uTF8JsonGenerator._writeContext;
            JsonWriteContext actual_writeContext = actual._writeContext;
            JsonWriteContext actual_writeContext_parent = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent"));
            assertNull(actual_writeContext_parent);
            
            DupDetector actual_writeContext_dups = ((DupDetector) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            assertNull(actual_writeContext_dups);
            
            JsonWriteContext actual_writeContext_child = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child"));
            assertNull(actual_writeContext_child);
            
            String actual_writeContext_currentName = ((String) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName"));
            assertNull(actual_writeContext_currentName);
            
            Object actual_writeContext_currentValue = getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentValue");
            assertNull(actual_writeContext_currentValue);
            
            boolean actual_writeContext_gotName = ((Boolean) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
            assertFalse(actual_writeContext_gotName);
            
            int uTF8JsonGenerator_writeContext_type = ((Integer) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            int actual_writeContext_type = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            assertEquals(uTF8JsonGenerator_writeContext_type, actual_writeContext_type);
            
            int uTF8JsonGenerator_writeContext_index = ((Integer) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            int actual_writeContext_index = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            assertEquals(uTF8JsonGenerator_writeContext_index, actual_writeContext_index);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalUTF8JsonGenerator_features = uTF8JsonGenerator._features;
            
            assertEquals(-511, finalUTF8JsonGenerator_features);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method disable(com.fasterxml.jackson.core.JsonGenerator$Feature)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#disable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator.Feature#getMask()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int mask = f.getMask();
 *  */
    @Test
    public void testDisable_ThrowNullPointerException() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.disable] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.GeneratorBase.disable(GeneratorBase.java:172) */
        uTF8JsonGenerator.disable(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#disable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code ((mask & DERIVED_FEATURES_MASK) != 0): True}
 * @utbot.executesCondition {@code (f == Feature.WRITE_NUMBERS_AS_STRINGS): False}
 * @utbot.executesCondition {@code (f == Feature.ESCAPE_NON_ASCII): False}
 * @utbot.executesCondition {@code (f == Feature.STRICT_DUPLICATE_DETECTION): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator.Feature#getMask()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#withDupDetector(com.fasterxml.jackson.core.json.DupDetector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _writeContext = _writeContext.withDupDetector(null);
 *  */
    @Test
    public void testDisable_ThrowNullPointerException_1() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -255;
            JsonGenerator.Feature feature = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
            
            /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.disable] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.base.GeneratorBase.disable(GeneratorBase.java:180) */
            uTF8JsonGenerator.disable(feature);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.writeTree
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method writeTree(com.fasterxml.jackson.core.TreeNode)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False}
    /// invoke:
    ///     {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeValue()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 *  */
    @Test
    public void testWriteTree() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 9);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 14);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        writerBasedJsonGenerator.writeTree(null);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer9 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 9));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer10 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 10));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer11 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 11));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer12 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 12));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer9);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer10);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer11);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer12);
        
        assertEquals(13, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 *  */
    @Test
    public void testWriteTree_1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 7);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 7);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 11);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        writerBasedJsonGenerator.writeTree(null);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer7 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 7));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer8 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 8));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer9 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 9));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer10 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 10));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer7);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer8);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer9);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer10);
        
        assertEquals(11, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 *  */
    @Test
    public void testWriteTree_2() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 9);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 14);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        writerBasedJsonGenerator.writeTree(null);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer9 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 9));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer10 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 10));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer11 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 11));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer12 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 12));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer9);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer10);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer11);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer12);
        
        assertEquals(13, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method writeTree(com.fasterxml.jackson.core.TreeNode)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 *  */
    @Test
    public void testWriteTree_5() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 4);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 15);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        writerBasedJsonGenerator.writeTree(null);
        
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
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer4);
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer5);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer6);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer7);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer8);
        
        assertEquals(9, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 *  */
    @Test
    public void testWriteTree_3() throws Exception  {
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
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        writerBasedJsonGenerator.writeTree(null);
        
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
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext jsonWriteContext1 = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
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
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 *  */
    @Test
    public void testWriteTree_4() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 7);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 7);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 11);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        writerBasedJsonGenerator.writeTree(null);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer7 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 7));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer8 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 8));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer9 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 9));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer10 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 10));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer7);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer8);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer9);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer10);
        
        assertEquals(11, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeTree(com.fasterxml.jackson.core.TreeNode)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeNull();
 *  */
    @Test
    public void testWriteTree_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 5);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeTree] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1616)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:747)
            com.fasterxml.jackson.core.base.GeneratorBase.writeTree(GeneratorBase.java:376) */
        writerBasedJsonGenerator.writeTree(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeNull();
 *  */
    @Test
    public void testWriteTree_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 11);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeTree] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1618)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:747)
            com.fasterxml.jackson.core.base.GeneratorBase.writeTree(GeneratorBase.java:376) */
        writerBasedJsonGenerator.writeTree(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteTree_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeTree] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:471)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator(DefaultPrettyPrinter.java:285)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:805)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:746)
            com.fasterxml.jackson.core.base.GeneratorBase.writeTree(GeneratorBase.java:376) */
        writerBasedJsonGenerator.writeTree(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteTree_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeTree] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:471)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:345)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:802)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:746)
            com.fasterxml.jackson.core.base.GeneratorBase.writeTree(GeneratorBase.java:376) */
        writerBasedJsonGenerator.writeTree(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeNull();
 *  */
    @Test
    public void testWriteTree_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeTree] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:746)
            com.fasterxml.jackson.core.base.GeneratorBase.writeTree(GeneratorBase.java:376) */
        writerBasedJsonGenerator.writeTree(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeNull();
 *  */
    @Test
    public void testWriteTree_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MAX_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483644);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeTree] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1615)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:747)
            com.fasterxml.jackson.core.base.GeneratorBase.writeTree(GeneratorBase.java:376) */
        writerBasedJsonGenerator.writeTree(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeNull();
 *  */
    @Test
    public void testWriteTree_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 5);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeTree] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1618)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:747)
            com.fasterxml.jackson.core.base.GeneratorBase.writeTree(GeneratorBase.java:376) */
        writerBasedJsonGenerator.writeTree(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeNull();
 *  */
    @Test
    public void testWriteTree_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 4);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeTree] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1617)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:747)
            com.fasterxml.jackson.core.base.GeneratorBase.writeTree(GeneratorBase.java:376) */
        writerBasedJsonGenerator.writeTree(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeNull();
 *  */
    @Test
    public void testWriteTree_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeTree] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:746)
            com.fasterxml.jackson.core.base.GeneratorBase.writeTree(GeneratorBase.java:376) */
        writerBasedJsonGenerator.writeTree(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeNull();
 *  */
    @Test
    public void testWriteTree_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeTree] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:746)
            com.fasterxml.jackson.core.base.GeneratorBase.writeTree(GeneratorBase.java:376) */
        writerBasedJsonGenerator.writeTree(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeNull();
 *  */
    @Test
    public void testWriteTree_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MAX_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483644);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeTree] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1615)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:747)
            com.fasterxml.jackson.core.base.GeneratorBase.writeTree(GeneratorBase.java:376) */
        writerBasedJsonGenerator.writeTree(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeNull();
 *  */
    @Test
    public void testWriteTree_ThrowNullPointerException() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeTree] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1615)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:747)
            com.fasterxml.jackson.core.base.GeneratorBase.writeTree(GeneratorBase.java:376) */
        writerBasedJsonGenerator.writeTree(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeNull();
 *  */
    @Test
    public void testWriteTree_ThrowNullPointerException_2() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MAX_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483644);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeTree] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1615)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:747)
            com.fasterxml.jackson.core.base.GeneratorBase.writeTree(GeneratorBase.java:376) */
        writerBasedJsonGenerator.writeTree(null);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeNull();
 *  */
    @Test
    public void testWriteTree_ThrowNullPointerException_1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000', '\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeTree] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1611)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:747)
            com.fasterxml.jackson.core.base.GeneratorBase.writeTree(GeneratorBase.java:376) */
        writerBasedJsonGenerator.writeTree(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.setCodec
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCodec(com.fasterxml.jackson.core.ObjectCodec)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#setCodec(com.fasterxml.jackson.core.ObjectCodec)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetCodec_Return() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.setCodec(null));
        
        OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
        assertNull(actual_outputStream);
        
        byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        assertNull(actual_outputBuffer);
        
        int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
        
        int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
        int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
        assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
        
        int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
        int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
        assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
        
        char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
        assertNull(actual_charBuffer);
        
        int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
        int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
        assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
        
        byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
        assertNull(actual_entityBuffer);
        
        boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
        assertFalse(actual_bufferRecyclable);
        
        IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
        assertNull(actual_ioContext);
        
        int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
        assertNull(actual_outputEscapes);
        
        int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
        int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
        assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
        
        CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
        assertNull(actual_characterEscapes);
        
        SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
        assertNull(actual_rootValueSeparator);
        
        boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
        assertFalse(actual_cfgUnqNames);
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
        int actual_features = actual._features;
        assertEquals(uTF8JsonGenerator_features, actual_features);
        
        boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
        assertFalse(actual_cfgNumbersAsStrings);
        
        JsonWriteContext actual_writeContext = actual._writeContext;
        assertNull(actual_writeContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.getCodec
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCodec()
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#getCodec()}
 * @utbot.returnsFrom {@code return _objectCodec;}
 *  */
    @Test
    public void testGetCodec_Return_objectCodec() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        ObjectCodec actual = uTF8JsonGenerator.getCodec();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.setCurrentValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCurrentValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#setCurrentValue(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#setCurrentValue(java.lang.Object)}
 *  */
    @Test
    public void testSetCurrentValue_JsonWriteContextSetCurrentValue() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        
        uTF8JsonGenerator.setCurrentValue(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setCurrentValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#setCurrentValue(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#setCurrentValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _writeContext.setCurrentValue(v);
 *  */
    @Test
    public void testSetCurrentValue_ThrowNullPointerException() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.setCurrentValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.GeneratorBase.setCurrentValue(GeneratorBase.java:136) */
        uTF8JsonGenerator.setCurrentValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.getCurrentValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentValue()
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#getCurrentValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#getCurrentValue()}
 * @utbot.returnsFrom {@code return _writeContext.getCurrentValue();}
 *  */
    @Test
    public void testGetCurrentValue_JsonWriteContextGetCurrentValue() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        
        Object actual = uTF8JsonGenerator.getCurrentValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCurrentValue()
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#getCurrentValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#getCurrentValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _writeContext.getCurrentValue();
 *  */
    @Test
    public void testGetCurrentValue_ThrowNullPointerException() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.getCurrentValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.GeneratorBase.getCurrentValue(GeneratorBase.java:131) */
        uTF8JsonGenerator.getCurrentValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.setFeatureMask
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFeatureMask(int)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#setFeatureMask(int)}
 * @utbot.executesCondition {@code (changed != 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetFeatureMask_ChangedEqualsZero() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        uTF8JsonGenerator._features = -254;
        
        UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.setFeatureMask(-254));
        
        OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
        assertNull(actual_outputStream);
        
        byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        assertNull(actual_outputBuffer);
        
        int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
        
        int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
        int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
        assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
        
        int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
        int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
        assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
        
        char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
        assertNull(actual_charBuffer);
        
        int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
        int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
        assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
        
        byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
        assertNull(actual_entityBuffer);
        
        boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
        assertFalse(actual_bufferRecyclable);
        
        IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
        assertNull(actual_ioContext);
        
        int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
        assertNull(actual_outputEscapes);
        
        int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
        int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
        assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
        
        CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
        assertNull(actual_characterEscapes);
        
        SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
        assertNull(actual_rootValueSeparator);
        
        boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
        assertFalse(actual_cfgUnqNames);
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
        int actual_features = actual._features;
        assertEquals(uTF8JsonGenerator_features, actual_features);
        
        boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
        assertFalse(actual_cfgNumbersAsStrings);
        
        JsonWriteContext actual_writeContext = actual._writeContext;
        assertNull(actual_writeContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#setFeatureMask(int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetFeatureMask_ChangedNotEqualsZero() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            writerBasedJsonGenerator._features = -250;
            
            WriterBasedJsonGenerator actual = ((WriterBasedJsonGenerator) writerBasedJsonGenerator.setFeatureMask(-167));
            
            Writer actual_writer = ((Writer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
            assertNull(actual_writer);
            
            char[] actual_outputBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int writerBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            int actual_outputHead = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            assertEquals(writerBasedJsonGenerator_outputHead, actual_outputHead);
            
            int writerBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            assertEquals(writerBasedJsonGenerator_outputTail, actual_outputTail);
            
            int writerBasedJsonGenerator_outputEnd = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            assertEquals(writerBasedJsonGenerator_outputEnd, actual_outputEnd);
            
            char[] actual_entityBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            SerializableString actual_currentEscape = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_currentEscape"));
            assertNull(actual_currentEscape);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int writerBasedJsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(writerBasedJsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int writerBasedJsonGenerator_features = writerBasedJsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(writerBasedJsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalWriterBasedJsonGenerator_features = writerBasedJsonGenerator._features;
            
            assertEquals(-167, finalWriterBasedJsonGenerator_features);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#setFeatureMask(int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetFeatureMask_ChangedNotEqualsZero_1() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -180;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.setFeatureMask(-236));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertTrue(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            boolean finalUTF8JsonGenerator_cfgUnqNames = ((Boolean) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            int finalUTF8JsonGenerator_features = uTF8JsonGenerator._features;
            
            assertTrue(finalUTF8JsonGenerator_cfgUnqNames);
            
            assertEquals(-236, finalUTF8JsonGenerator_features);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#setFeatureMask(int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetFeatureMask_ChangedNotEqualsZero_3() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -92;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.setFeatureMask(-232));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalUTF8JsonGenerator_features = uTF8JsonGenerator._features;
            
            assertEquals(-232, finalUTF8JsonGenerator_features);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#setFeatureMask(int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetFeatureMask_ChangedNotEqualsZero_6() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -244;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.setFeatureMask(-76));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertTrue(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertTrue(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalUTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            boolean finalUTF8JsonGenerator_cfgUnqNames = ((Boolean) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            int finalUTF8JsonGenerator_features = uTF8JsonGenerator._features;
            boolean finalUTF8JsonGenerator_cfgNumbersAsStrings = uTF8JsonGenerator._cfgNumbersAsStrings;
            
            assertEquals(127, finalUTF8JsonGenerator_maximumNonEscapedChar);
            
            assertTrue(finalUTF8JsonGenerator_cfgUnqNames);
            
            assertEquals(-76, finalUTF8JsonGenerator_features);
            
            assertTrue(finalUTF8JsonGenerator_cfgNumbersAsStrings);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#setFeatureMask(int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetFeatureMask_ChangedNotEqualsZero_5() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -191;
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            uTF8JsonGenerator._writeContext = _writeContext;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.setFeatureMask(46));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertTrue(actual_cfgNumbersAsStrings);
            
            JsonWriteContext uTF8JsonGenerator_writeContext = uTF8JsonGenerator._writeContext;
            JsonWriteContext actual_writeContext = actual._writeContext;
            JsonWriteContext actual_writeContext_parent = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent"));
            assertNull(actual_writeContext_parent);
            
            DupDetector actual_writeContext_dups = ((DupDetector) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            assertNull(actual_writeContext_dups);
            
            JsonWriteContext actual_writeContext_child = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child"));
            assertNull(actual_writeContext_child);
            
            String actual_writeContext_currentName = ((String) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName"));
            assertNull(actual_writeContext_currentName);
            
            Object actual_writeContext_currentValue = getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentValue");
            assertNull(actual_writeContext_currentValue);
            
            boolean actual_writeContext_gotName = ((Boolean) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
            assertFalse(actual_writeContext_gotName);
            
            int uTF8JsonGenerator_writeContext_type = ((Integer) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            int actual_writeContext_type = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            assertEquals(uTF8JsonGenerator_writeContext_type, actual_writeContext_type);
            
            int uTF8JsonGenerator_writeContext_index = ((Integer) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            int actual_writeContext_index = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            assertEquals(uTF8JsonGenerator_writeContext_index, actual_writeContext_index);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalUTF8JsonGenerator_features = uTF8JsonGenerator._features;
            boolean finalUTF8JsonGenerator_cfgNumbersAsStrings = uTF8JsonGenerator._cfgNumbersAsStrings;
            
            assertEquals(46, finalUTF8JsonGenerator_features);
            
            assertTrue(finalUTF8JsonGenerator_cfgNumbersAsStrings);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#setFeatureMask(int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetFeatureMask_ChangedNotEqualsZero_4() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            writerBasedJsonGenerator._features = 112;
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            writerBasedJsonGenerator._writeContext = _writeContext;
            
            JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
            DupDetector initialWriterBasedJsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            
            WriterBasedJsonGenerator actual = ((WriterBasedJsonGenerator) writerBasedJsonGenerator.setFeatureMask(-245));
            
            Writer actual_writer = ((Writer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
            assertNull(actual_writer);
            
            char[] actual_outputBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int writerBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            int actual_outputHead = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            assertEquals(writerBasedJsonGenerator_outputHead, actual_outputHead);
            
            int writerBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            assertEquals(writerBasedJsonGenerator_outputTail, actual_outputTail);
            
            int writerBasedJsonGenerator_outputEnd = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            assertEquals(writerBasedJsonGenerator_outputEnd, actual_outputEnd);
            
            char[] actual_entityBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            SerializableString actual_currentEscape = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_currentEscape"));
            assertNull(actual_currentEscape);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int writerBasedJsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(writerBasedJsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int writerBasedJsonGenerator_features = writerBasedJsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(writerBasedJsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext writerBasedJsonGenerator_writeContext = writerBasedJsonGenerator._writeContext;
            JsonWriteContext actual_writeContext = actual._writeContext;
            JsonWriteContext actual_writeContext_parent = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent"));
            assertNull(actual_writeContext_parent);
            
            DupDetector writerBasedJsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            DupDetector actual_writeContext_dups = ((DupDetector) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            Object writerBasedJsonGenerator_writeContext_dups_source = getFieldValue(writerBasedJsonGenerator_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
            Object actual_writeContext_dups_source = getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(writerBasedJsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            boolean actual_writeContext_dups_source_closed = ((Boolean) getFieldValue(actual_writeContext_dups_source, "com.fasterxml.jackson.core.base.GeneratorBase", "_closed"));
            assertFalse(actual_writeContext_dups_source_closed);
            
            PrettyPrinter actual_writeContext_dups_source_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual_writeContext_dups_source, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_writeContext_dups_source_cfgPrettyPrinter);
            
            String actual_writeContext_dups_firstName = ((String) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName"));
            assertNull(actual_writeContext_dups_firstName);
            
            String actual_writeContext_dups_secondName = ((String) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_secondName"));
            assertNull(actual_writeContext_dups_secondName);
            
            HashSet actual_writeContext_dups_seen = ((HashSet) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_seen"));
            assertNull(actual_writeContext_dups_seen);
            
            JsonWriteContext actual_writeContext_child = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child"));
            assertNull(actual_writeContext_child);
            
            String actual_writeContext_currentName = ((String) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName"));
            assertNull(actual_writeContext_currentName);
            
            Object actual_writeContext_currentValue = getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentValue");
            assertNull(actual_writeContext_currentValue);
            
            boolean actual_writeContext_gotName = ((Boolean) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
            assertFalse(actual_writeContext_gotName);
            
            int writerBasedJsonGenerator_writeContext_type = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            int actual_writeContext_type = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            assertEquals(writerBasedJsonGenerator_writeContext_type, actual_writeContext_type);
            
            int writerBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            int actual_writeContext_index = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            assertEquals(writerBasedJsonGenerator_writeContext_index, actual_writeContext_index);
            
            assertTrue(deepEquals(writerBasedJsonGenerator, actual));
            assertTrue(deepEquals(writerBasedJsonGenerator, actual));
            
            int finalWriterBasedJsonGenerator_features = writerBasedJsonGenerator._features;
            JsonWriteContext jsonWriteContext1 = writerBasedJsonGenerator._writeContext;
            DupDetector finalWriterBasedJsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            
            assertFalse(initialWriterBasedJsonGenerator_writeContext_dups == finalWriterBasedJsonGenerator_writeContext_dups);
            
            assertEquals(-245, finalWriterBasedJsonGenerator_features);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#setFeatureMask(int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetFeatureMask_ChangedNotEqualsZero_2() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = 122;
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
            setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
            uTF8JsonGenerator._writeContext = _writeContext;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.setFeatureMask(-255));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertTrue(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext uTF8JsonGenerator_writeContext = uTF8JsonGenerator._writeContext;
            JsonWriteContext actual_writeContext = actual._writeContext;
            JsonWriteContext actual_writeContext_parent = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent"));
            assertNull(actual_writeContext_parent);
            
            DupDetector uTF8JsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            DupDetector actual_writeContext_dups = ((DupDetector) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            Object actual_writeContext_dups_source = getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
            assertNull(actual_writeContext_dups_source);
            
            String actual_writeContext_dups_firstName = ((String) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName"));
            assertNull(actual_writeContext_dups_firstName);
            
            String actual_writeContext_dups_secondName = ((String) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_secondName"));
            assertNull(actual_writeContext_dups_secondName);
            
            HashSet actual_writeContext_dups_seen = ((HashSet) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_seen"));
            assertNull(actual_writeContext_dups_seen);
            
            JsonWriteContext actual_writeContext_child = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child"));
            assertNull(actual_writeContext_child);
            
            String actual_writeContext_currentName = ((String) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName"));
            assertNull(actual_writeContext_currentName);
            
            Object actual_writeContext_currentValue = getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentValue");
            assertNull(actual_writeContext_currentValue);
            
            boolean actual_writeContext_gotName = ((Boolean) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
            assertFalse(actual_writeContext_gotName);
            
            int uTF8JsonGenerator_writeContext_type = ((Integer) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            int actual_writeContext_type = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            assertEquals(uTF8JsonGenerator_writeContext_type, actual_writeContext_type);
            
            int uTF8JsonGenerator_writeContext_index = ((Integer) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            int actual_writeContext_index = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            assertEquals(uTF8JsonGenerator_writeContext_index, actual_writeContext_index);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            boolean finalUTF8JsonGenerator_cfgUnqNames = ((Boolean) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            int finalUTF8JsonGenerator_features = uTF8JsonGenerator._features;
            
            assertTrue(finalUTF8JsonGenerator_cfgUnqNames);
            
            assertEquals(-255, finalUTF8JsonGenerator_features);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.getFeatureMask
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFeatureMask()
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#getFeatureMask()}
 * @utbot.returnsFrom {@code return _features;}
 *  */
    @Test
    public void testGetFeatureMask_Return_features() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        uTF8JsonGenerator._features = -255;
        
        int actual = uTF8JsonGenerator.getFeatureMask();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.isClosed
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isClosed()
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#isClosed()}
 * @utbot.returnsFrom {@code return _closed;}
 *  */
    @Test
    public void testIsClosed_Return_closed() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        boolean actual = uTF8JsonGenerator.isClosed();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.overrideStdFeatures
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method overrideStdFeatures(int, int)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#overrideStdFeatures(int,int)}
 * @utbot.executesCondition {@code (changed != 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testOverrideStdFeatures_ChangedEqualsZero() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        uTF8JsonGenerator._features = -255;
        
        UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.overrideStdFeatures(1, 1));
        
        OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
        assertNull(actual_outputStream);
        
        byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        assertNull(actual_outputBuffer);
        
        int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
        
        int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
        int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
        assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
        
        int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
        int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
        assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
        
        char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
        assertNull(actual_charBuffer);
        
        int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
        int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
        assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
        
        byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
        assertNull(actual_entityBuffer);
        
        boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
        assertFalse(actual_bufferRecyclable);
        
        IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
        assertNull(actual_ioContext);
        
        int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
        assertNull(actual_outputEscapes);
        
        int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
        int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
        assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
        
        CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
        assertNull(actual_characterEscapes);
        
        SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
        assertNull(actual_rootValueSeparator);
        
        boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
        assertFalse(actual_cfgUnqNames);
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
        int actual_features = actual._features;
        assertEquals(uTF8JsonGenerator_features, actual_features);
        
        boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
        assertFalse(actual_cfgNumbersAsStrings);
        
        JsonWriteContext actual_writeContext = actual._writeContext;
        assertNull(actual_writeContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#overrideStdFeatures(int,int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testOverrideStdFeatures_ChangedNotEqualsZero() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -145;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.overrideStdFeatures(-216, -177));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalUTF8JsonGenerator_features = uTF8JsonGenerator._features;
            
            assertEquals(-216, finalUTF8JsonGenerator_features);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#overrideStdFeatures(int,int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testOverrideStdFeatures_ChangedNotEqualsZero_1() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            writerBasedJsonGenerator._features = -146;
            
            WriterBasedJsonGenerator actual = ((WriterBasedJsonGenerator) writerBasedJsonGenerator.overrideStdFeatures(-223, -178));
            
            Writer actual_writer = ((Writer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
            assertNull(actual_writer);
            
            char[] actual_outputBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int writerBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            int actual_outputHead = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            assertEquals(writerBasedJsonGenerator_outputHead, actual_outputHead);
            
            int writerBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            assertEquals(writerBasedJsonGenerator_outputTail, actual_outputTail);
            
            int writerBasedJsonGenerator_outputEnd = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            assertEquals(writerBasedJsonGenerator_outputEnd, actual_outputEnd);
            
            char[] actual_entityBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            SerializableString actual_currentEscape = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_currentEscape"));
            assertNull(actual_currentEscape);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int writerBasedJsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(writerBasedJsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertTrue(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int writerBasedJsonGenerator_features = writerBasedJsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(writerBasedJsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            boolean finalWriterBasedJsonGenerator_cfgUnqNames = ((Boolean) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            int finalWriterBasedJsonGenerator_features = writerBasedJsonGenerator._features;
            
            assertTrue(finalWriterBasedJsonGenerator_cfgUnqNames);
            
            assertEquals(-224, finalWriterBasedJsonGenerator_features);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#overrideStdFeatures(int,int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testOverrideStdFeatures_ChangedNotEqualsZero_2() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -3;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.overrideStdFeatures(-118, -155));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalUTF8JsonGenerator_features = uTF8JsonGenerator._features;
            
            assertEquals(-104, finalUTF8JsonGenerator_features);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#overrideStdFeatures(int,int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testOverrideStdFeatures_ChangedNotEqualsZero_4() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            writerBasedJsonGenerator._features = -183;
            
            WriterBasedJsonGenerator actual = ((WriterBasedJsonGenerator) writerBasedJsonGenerator.overrideStdFeatures(-106, -34));
            
            Writer actual_writer = ((Writer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
            assertNull(actual_writer);
            
            char[] actual_outputBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int writerBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            int actual_outputHead = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            assertEquals(writerBasedJsonGenerator_outputHead, actual_outputHead);
            
            int writerBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            assertEquals(writerBasedJsonGenerator_outputTail, actual_outputTail);
            
            int writerBasedJsonGenerator_outputEnd = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            assertEquals(writerBasedJsonGenerator_outputEnd, actual_outputEnd);
            
            char[] actual_entityBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            SerializableString actual_currentEscape = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_currentEscape"));
            assertNull(actual_currentEscape);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int writerBasedJsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(writerBasedJsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertTrue(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int writerBasedJsonGenerator_features = writerBasedJsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(writerBasedJsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalWriterBasedJsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            boolean finalWriterBasedJsonGenerator_cfgUnqNames = ((Boolean) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            int finalWriterBasedJsonGenerator_features = writerBasedJsonGenerator._features;
            
            assertEquals(127, finalWriterBasedJsonGenerator_maximumNonEscapedChar);
            
            assertTrue(finalWriterBasedJsonGenerator_cfgUnqNames);
            
            assertEquals(-105, finalWriterBasedJsonGenerator_features);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#overrideStdFeatures(int,int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testOverrideStdFeatures_ChangedNotEqualsZero_7() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            writerBasedJsonGenerator._features = -87;
            
            WriterBasedJsonGenerator actual = ((WriterBasedJsonGenerator) writerBasedJsonGenerator.overrideStdFeatures(-194, -107));
            
            Writer actual_writer = ((Writer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
            assertNull(actual_writer);
            
            char[] actual_outputBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int writerBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            int actual_outputHead = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            assertEquals(writerBasedJsonGenerator_outputHead, actual_outputHead);
            
            int writerBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            assertEquals(writerBasedJsonGenerator_outputTail, actual_outputTail);
            
            int writerBasedJsonGenerator_outputEnd = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            assertEquals(writerBasedJsonGenerator_outputEnd, actual_outputEnd);
            
            char[] actual_entityBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            SerializableString actual_currentEscape = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_currentEscape"));
            assertNull(actual_currentEscape);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int writerBasedJsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(writerBasedJsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int writerBasedJsonGenerator_features = writerBasedJsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(writerBasedJsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertTrue(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalWriterBasedJsonGenerator_features = writerBasedJsonGenerator._features;
            boolean finalWriterBasedJsonGenerator_cfgNumbersAsStrings = writerBasedJsonGenerator._cfgNumbersAsStrings;
            
            assertEquals(-196, finalWriterBasedJsonGenerator_features);
            
            assertTrue(finalWriterBasedJsonGenerator_cfgNumbersAsStrings);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#overrideStdFeatures(int,int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testOverrideStdFeatures_ChangedNotEqualsZero_3() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = -50;
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            uTF8JsonGenerator._writeContext = _writeContext;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.overrideStdFeatures(129, -177));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertTrue(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext uTF8JsonGenerator_writeContext = uTF8JsonGenerator._writeContext;
            JsonWriteContext actual_writeContext = actual._writeContext;
            JsonWriteContext actual_writeContext_parent = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent"));
            assertNull(actual_writeContext_parent);
            
            DupDetector actual_writeContext_dups = ((DupDetector) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            assertNull(actual_writeContext_dups);
            
            JsonWriteContext actual_writeContext_child = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child"));
            assertNull(actual_writeContext_child);
            
            String actual_writeContext_currentName = ((String) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName"));
            assertNull(actual_writeContext_currentName);
            
            Object actual_writeContext_currentValue = getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentValue");
            assertNull(actual_writeContext_currentValue);
            
            boolean actual_writeContext_gotName = ((Boolean) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
            assertFalse(actual_writeContext_gotName);
            
            int uTF8JsonGenerator_writeContext_type = ((Integer) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            int actual_writeContext_type = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            assertEquals(uTF8JsonGenerator_writeContext_type, actual_writeContext_type);
            
            int uTF8JsonGenerator_writeContext_index = ((Integer) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            int actual_writeContext_index = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            assertEquals(uTF8JsonGenerator_writeContext_index, actual_writeContext_index);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            boolean finalUTF8JsonGenerator_cfgUnqNames = ((Boolean) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            int finalUTF8JsonGenerator_features = uTF8JsonGenerator._features;
            
            assertTrue(finalUTF8JsonGenerator_cfgUnqNames);
            
            assertEquals(129, finalUTF8JsonGenerator_features);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#overrideStdFeatures(int,int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testOverrideStdFeatures_ChangedNotEqualsZero_6() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._features = 168;
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            uTF8JsonGenerator._writeContext = _writeContext;
            
            JsonWriteContext jsonWriteContext = uTF8JsonGenerator._writeContext;
            DupDetector initialUTF8JsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.overrideStdFeatures(-169, -161));
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertTrue(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertTrue(actual_cfgNumbersAsStrings);
            
            JsonWriteContext uTF8JsonGenerator_writeContext = uTF8JsonGenerator._writeContext;
            JsonWriteContext actual_writeContext = actual._writeContext;
            JsonWriteContext actual_writeContext_parent = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent"));
            assertNull(actual_writeContext_parent);
            
            DupDetector uTF8JsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            DupDetector actual_writeContext_dups = ((DupDetector) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            Object uTF8JsonGenerator_writeContext_dups_source = getFieldValue(uTF8JsonGenerator_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
            Object actual_writeContext_dups_source = getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext_dups_source, actual_writeContext_dups_source));
            boolean actual_writeContext_dups_source_closed = ((Boolean) getFieldValue(actual_writeContext_dups_source, "com.fasterxml.jackson.core.base.GeneratorBase", "_closed"));
            assertFalse(actual_writeContext_dups_source_closed);
            
            PrettyPrinter actual_writeContext_dups_source_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual_writeContext_dups_source, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_writeContext_dups_source_cfgPrettyPrinter);
            
            String actual_writeContext_dups_firstName = ((String) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName"));
            assertNull(actual_writeContext_dups_firstName);
            
            String actual_writeContext_dups_secondName = ((String) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_secondName"));
            assertNull(actual_writeContext_dups_secondName);
            
            HashSet actual_writeContext_dups_seen = ((HashSet) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_seen"));
            assertNull(actual_writeContext_dups_seen);
            
            JsonWriteContext actual_writeContext_child = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child"));
            assertNull(actual_writeContext_child);
            
            String actual_writeContext_currentName = ((String) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName"));
            assertNull(actual_writeContext_currentName);
            
            Object actual_writeContext_currentValue = getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentValue");
            assertNull(actual_writeContext_currentValue);
            
            boolean actual_writeContext_gotName = ((Boolean) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
            assertFalse(actual_writeContext_gotName);
            
            int uTF8JsonGenerator_writeContext_type = ((Integer) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            int actual_writeContext_type = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            assertEquals(uTF8JsonGenerator_writeContext_type, actual_writeContext_type);
            
            int uTF8JsonGenerator_writeContext_index = ((Integer) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            int actual_writeContext_index = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            assertEquals(uTF8JsonGenerator_writeContext_index, actual_writeContext_index);
            
            assertTrue(deepEquals(uTF8JsonGenerator, actual));
            assertTrue(deepEquals(uTF8JsonGenerator, actual));
            
            boolean finalUTF8JsonGenerator_cfgUnqNames = ((Boolean) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            int finalUTF8JsonGenerator_features = uTF8JsonGenerator._features;
            boolean finalUTF8JsonGenerator_cfgNumbersAsStrings = uTF8JsonGenerator._cfgNumbersAsStrings;
            JsonWriteContext jsonWriteContext1 = uTF8JsonGenerator._writeContext;
            DupDetector finalUTF8JsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            
            assertFalse(initialUTF8JsonGenerator_writeContext_dups == finalUTF8JsonGenerator_writeContext_dups);
            
            assertTrue(finalUTF8JsonGenerator_cfgUnqNames);
            
            assertEquals(-9, finalUTF8JsonGenerator_features);
            
            assertTrue(finalUTF8JsonGenerator_cfgNumbersAsStrings);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#overrideStdFeatures(int,int)}
 * @utbot.executesCondition {@code (changed != 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testOverrideStdFeatures_ChangedNotEqualsZero_5() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            writerBasedJsonGenerator._features = 238;
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
            setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
            writerBasedJsonGenerator._writeContext = _writeContext;
            
            WriterBasedJsonGenerator actual = ((WriterBasedJsonGenerator) writerBasedJsonGenerator.overrideStdFeatures(-119, -185));
            
            Writer actual_writer = ((Writer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
            assertNull(actual_writer);
            
            char[] actual_outputBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int writerBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            int actual_outputHead = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
            assertEquals(writerBasedJsonGenerator_outputHead, actual_outputHead);
            
            int writerBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
            assertEquals(writerBasedJsonGenerator_outputTail, actual_outputTail);
            
            int writerBasedJsonGenerator_outputEnd = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd"));
            assertEquals(writerBasedJsonGenerator_outputEnd, actual_outputEnd);
            
            char[] actual_entityBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            SerializableString actual_currentEscape = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_currentEscape"));
            assertNull(actual_currentEscape);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int writerBasedJsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(writerBasedJsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int writerBasedJsonGenerator_features = writerBasedJsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(writerBasedJsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertTrue(actual_cfgNumbersAsStrings);
            
            JsonWriteContext writerBasedJsonGenerator_writeContext = writerBasedJsonGenerator._writeContext;
            JsonWriteContext actual_writeContext = actual._writeContext;
            JsonWriteContext actual_writeContext_parent = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent"));
            assertNull(actual_writeContext_parent);
            
            DupDetector writerBasedJsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            DupDetector actual_writeContext_dups = ((DupDetector) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            Object actual_writeContext_dups_source = getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source");
            assertNull(actual_writeContext_dups_source);
            
            String actual_writeContext_dups_firstName = ((String) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName"));
            assertNull(actual_writeContext_dups_firstName);
            
            String actual_writeContext_dups_secondName = ((String) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_secondName"));
            assertNull(actual_writeContext_dups_secondName);
            
            HashSet actual_writeContext_dups_seen = ((HashSet) getFieldValue(actual_writeContext_dups, "com.fasterxml.jackson.core.json.DupDetector", "_seen"));
            assertNull(actual_writeContext_dups_seen);
            
            JsonWriteContext actual_writeContext_child = ((JsonWriteContext) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child"));
            assertNull(actual_writeContext_child);
            
            String actual_writeContext_currentName = ((String) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName"));
            assertNull(actual_writeContext_currentName);
            
            Object actual_writeContext_currentValue = getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentValue");
            assertNull(actual_writeContext_currentValue);
            
            boolean actual_writeContext_gotName = ((Boolean) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
            assertFalse(actual_writeContext_gotName);
            
            int writerBasedJsonGenerator_writeContext_type = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            int actual_writeContext_type = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            assertEquals(writerBasedJsonGenerator_writeContext_type, actual_writeContext_type);
            
            int writerBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            int actual_writeContext_index = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            assertEquals(writerBasedJsonGenerator_writeContext_index, actual_writeContext_index);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalWriterBasedJsonGenerator_features = writerBasedJsonGenerator._features;
            boolean finalWriterBasedJsonGenerator_cfgNumbersAsStrings = writerBasedJsonGenerator._cfgNumbersAsStrings;
            
            assertEquals(-87, finalWriterBasedJsonGenerator_features);
            
            assertTrue(finalWriterBasedJsonGenerator_cfgNumbersAsStrings);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.getOutputContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOutputContext()
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#getOutputContext()}
 * @utbot.returnsFrom {@code return _writeContext;}
 *  */
    @Test
    public void testGetOutputContext_Return_writeContext() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        JsonWriteContext actual = uTF8JsonGenerator.getOutputContext();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase._decodeSurrogate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _decodeSurrogate(int, int)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#_decodeSurrogate(int,int)}
 * @utbot.executesCondition {@code (surr2 < SURR2_FIRST): False}
 * @utbot.executesCondition {@code (surr2 > SURR2_LAST): False}
 * @utbot.returnsFrom {@code return c;}
 *  */
    @Test
    public void test_decodeSurrogate_Surr2LessOrEqualSURR2_LAST() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        int actual = uTF8JsonGenerator._decodeSurrogate(-255, 56320);
        
        assertEquals(-56818688, actual);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _decodeSurrogate(int, int)
    
    @Test(expected = JsonGenerationException.class)
    public void test_decodeSurrogate1() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        uTF8JsonGenerator._decodeSurrogate(-2147483647, 57344);
    }
    
    @Test(expected = JsonGenerationException.class)
    public void test_decodeSurrogate2() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        uTF8JsonGenerator._decodeSurrogate(-2147483647, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.writeFieldName
    
    ///region Errors report for writeFieldName
    
    public void testWriteFieldName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* There is no instantiatable inheritor of the class under test
        that does not override a method given for testing */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase._asString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _asString(java.math.BigDecimal)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#_asString(java.math.BigDecimal)}
 * @utbot.invokes {@link java.math.BigDecimal#toString()}
 * @utbot.returnsFrom {@code return value.toString();}
 *  */
    @Test
    public void test_asString_BigDecimalToString() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        String stringCache = "";
        setField(bigDecimal, "java.math.BigDecimal", "stringCache", stringCache);
        
        String actual = uTF8JsonGenerator._asString(bigDecimal);
        
        assertEquals(stringCache, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _asString(java.math.BigDecimal)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#_asString(java.math.BigDecimal)}
 * @utbot.invokes {@link java.math.BigDecimal#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return value.toString();
 *  */
    @Test
    public void test_asString_ThrowNullPointerException() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase._asString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.GeneratorBase._asString(GeneratorBase.java:435) */
        uTF8JsonGenerator._asString(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _asString(java.math.BigDecimal)
    
    @Test
    public void test_asString1() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase._asString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.smallToString(BigInteger.java:4038)
            java.base/java.math.BigInteger.toString(BigInteger.java:4087)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:3980)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            com.fasterxml.jackson.core.base.GeneratorBase._asString(GeneratorBase.java:435) */
        uTF8JsonGenerator._asString(bigDecimal);
    }
    
    @Test
    public void test_asString2() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        setField(intVal, "java.math.BigInteger", "bitLengthPlusOne", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase._asString] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.toString(BigInteger.java:4086)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:3980)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            com.fasterxml.jackson.core.base.GeneratorBase._asString(GeneratorBase.java:435) */
        uTF8JsonGenerator._asString(bigDecimal);
    }
    
    @Test
    public void test_asString3() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", 2097152);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase._asString] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.bitLength(BigInteger.java:3701)
            java.base/java.math.BigInteger.toString(BigInteger.java:3972)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:4000)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            com.fasterxml.jackson.core.base.GeneratorBase._asString(GeneratorBase.java:435) */
        uTF8JsonGenerator._asString(bigDecimal);
    }
    
    @Test
    public void test_asString4() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase._asString] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.<init>(BigInteger.java:1138)
            java.base/java.math.BigInteger.negate(BigInteger.java:2683)
            java.base/java.math.BigInteger.abs(BigInteger.java:2674)
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:4000)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            com.fasterxml.jackson.core.base.GeneratorBase._asString(GeneratorBase.java:435) */
        uTF8JsonGenerator._asString(bigDecimal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.writeBinary
    
    ///region Errors report for writeBinary
    
    public void testWriteBinary_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* There is no instantiatable inheritor of the class under test
        that does not override a method given for testing */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeRawValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:471)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator(DefaultPrettyPrinter.java:285)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:805)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:303) */
        writerBasedJsonGenerator.writeRawValue(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:303) */
        writerBasedJsonGenerator.writeRawValue(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:303) */
        writerBasedJsonGenerator.writeRawValue(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRaw(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteRawValue_ThrowStringIndexOutOfBoundsException() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483646);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: offset 2147483645, count 0, length 1]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:304) */
        writerBasedJsonGenerator.writeRawValue(string);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.Console$3"));
        Object lock = createInstance("java.lang.Object");
        setField(_writer, "java.io.Writer", "lock", lock);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:303) */
        writerBasedJsonGenerator.writeRawValue(((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeRawValue(java.lang.String)
    
    @Test
    public void testWriteRawValue1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 34);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "";
        
        writerBasedJsonGenerator.writeRawValue(string);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer32 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 32));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer32);
        
        assertEquals(33, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue2() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 34);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "\u0000";
        
        writerBasedJsonGenerator.writeRawValue(string);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer32 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 32));
        int finalWriterBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext jsonWriteContext1 = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer32);
        
        assertEquals(0, finalWriterBasedJsonGenerator_outputHead);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue3() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 4);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        String string = "";
        
        writerBasedJsonGenerator.writeRawValue(string);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeRawValue(java.lang.String)
    
    @Test
    public void testWriteRawValue4() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -1073741823);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 9]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:471)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:345)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:802)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:303) */
        writerBasedJsonGenerator.writeRawValue(((String) null));
    }
    
    @Test
    public void testWriteRawValue5() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 34);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: offset 1, count 33, length 9]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:304) */
        writerBasedJsonGenerator.writeRawValue(string);
    }
    
    @Test
    public void testWriteRawValue6() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2078265816);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2078265815, length 10]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:304) */
        writerBasedJsonGenerator.writeRawValue(string);
    }
    
    @Test
    public void testWriteRawValue7() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -3);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: offset -3, count 3, length 9]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:778)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:303) */
        writerBasedJsonGenerator.writeRawValue(string);
    }
    
    @Test
    public void testWriteRawValue8() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:519)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:304) */
        uTF8JsonGenerator.writeRawValue(((String) null));
    }
    
    @Test
    public void testWriteRawValue9() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:471)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeObjectFieldValueSeparator(MinimalPrettyPrinter.java:95)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:805)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:303) */
        writerBasedJsonGenerator.writeRawValue(((String) null));
    }
    
    @Test
    public void testWriteRawValue10() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:406)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:304) */
        writerBasedJsonGenerator.writeRawValue(((String) null));
    }
    
    @Test
    public void testWriteRawValue11() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:406)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:304) */
        writerBasedJsonGenerator.writeRawValue(((String) null));
    }
    
    @Test
    public void testWriteRawValue12() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_spacesInObjectEntries", true);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator(DefaultPrettyPrinter.java:283)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:805)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:303) */
        writerBasedJsonGenerator.writeRawValue(((String) null));
    }
    
    @Test
    public void testWriteRawValue13() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = ((DefaultPrettyPrinter.FixedSpaceIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:304) */
        writerBasedJsonGenerator.writeRawValue(string);
    }
    
    @Test
    public void testWriteRawValue14() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:304) */
        writerBasedJsonGenerator.writeRawValue(string);
    }
    
    @Test
    public void testWriteRawValue15() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741825);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:406)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:304) */
        writerBasedJsonGenerator.writeRawValue(((String) null));
    }
    
    @Test
    public void testWriteRawValue16() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(_writer, "java.io.PrintWriter", "out", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:469)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeObjectFieldValueSeparator(MinimalPrettyPrinter.java:95)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:805)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:303) */
        writerBasedJsonGenerator.writeRawValue(string);
    }
    
    @Test
    public void testWriteRawValue17() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "\u0000\u0000\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.util.DefaultIndenter.writeIndentation(DefaultIndenter.java:87)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeArrayValues(DefaultPrettyPrinter.java:330)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:813)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:303) */
        writerBasedJsonGenerator.writeRawValue(string);
    }
    
    @Test
    public void testWriteRawValue18() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(_writer, "java.io.PrintWriter", "out", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:469)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeArrayValueSeparator(MinimalPrettyPrinter.java:144)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:802)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:303) */
        writerBasedJsonGenerator.writeRawValue(string);
    }
    
    @Test
    public void testWriteRawValue19() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:304) */
        writerBasedJsonGenerator.writeRawValue(string);
    }
    
    @Test
    public void testWriteRawValue20() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", Integer.MIN_VALUE);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        SerializedString _rootSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_rootSeparator", _rootSeparator);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeRootValueSeparator(DefaultPrettyPrinter.java:251)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:808)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:303) */
        writerBasedJsonGenerator.writeRawValue(string);
    }
    
    @Test
    public void testWriteRawValue21() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -3);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:778)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:303) */
        writerBasedJsonGenerator.writeRawValue(string);
    }
    
    @Test
    public void testWriteRawValue22() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:304) */
        writerBasedJsonGenerator.writeRawValue(string);
    }
    
    @Test
    public void testWriteRawValue23() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:778)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:303) */
        writerBasedJsonGenerator.writeRawValue(string);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method writeRawValue(java.lang.String)
    
    @Test(expected = JsonGenerationException.class)
    public void testWriteRawValue24() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        
        uTF8JsonGenerator.writeRawValue(((String) null));
    }
    
    @Test(expected = JsonGenerationException.class)
    public void testWriteRawValue25() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        writerBasedJsonGenerator.writeRawValue(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeRawValue(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 *  */
    @Test
    public void testWriteRawValue() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "";
        
        writerBasedJsonGenerator.writeRawValue(string, 0, 0);
        
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 *  */
    @Test
    public void testWriteRawValue_1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "";
        
        writerBasedJsonGenerator.writeRawValue(string, 0, 0);
        
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 *  */
    @Test
    public void testWriteRawValue_2() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "";
        
        writerBasedJsonGenerator.writeRawValue(string, 0, 0);
        
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeRawValue(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:471)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:345)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:802)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:308) */
        writerBasedJsonGenerator.writeRawValue(((String) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: writeRaw(text, offset, len);
 *  */
    @Test
    public void testWriteRawValue_ThrowStringIndexOutOfBoundsException_3() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2147483640);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2147483640);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483640);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end 1, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:437)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:309) */
        writerBasedJsonGenerator.writeRawValue(string, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:471)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator(DefaultPrettyPrinter.java:285)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:805)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:308) */
        writerBasedJsonGenerator.writeRawValue(((String) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:637)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeObjectFieldValueSeparator(MinimalPrettyPrinter.java:95)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyPrettyValueWrite(UTF8JsonGenerator.java:1016)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1005)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:308) */
        uTF8JsonGenerator.writeRawValue(((String) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:308) */
        writerBasedJsonGenerator.writeRawValue(((String) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:308) */
        writerBasedJsonGenerator.writeRawValue(((String) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:308) */
        writerBasedJsonGenerator.writeRawValue(((String) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: writeRaw(text, offset, len);
 *  */
    @Test
    public void testWriteRawValue_ThrowStringIndexOutOfBoundsException1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[17];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 16);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 536870920);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: begin 62, end 2, length 16]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:434)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:309) */
        writerBasedJsonGenerator.writeRawValue(string, 62, -60);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1000)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:308) */
        uTF8JsonGenerator.writeRawValue(((String) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1000)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:308) */
        uTF8JsonGenerator.writeRawValue(((String) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: writeRaw(text, offset, len);
 *  */
    @Test
    public void testWriteRawValue_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 255);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end -256, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:434)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:309) */
        writerBasedJsonGenerator.writeRawValue(string, -1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: writeRaw(text, offset, len);
 *  */
    @Test
    public void testWriteRawValue_ThrowStringIndexOutOfBoundsException_2() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 65791);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 65536);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: begin -1, end -256, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:434)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:309) */
        writerBasedJsonGenerator.writeRawValue(string, -1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(java.lang.String,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeRaw(text, offset, len);
 *  */
    @Test
    public void testWriteRawValue_ThrowNullPointerException() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:429)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:309) */
        writerBasedJsonGenerator.writeRawValue(string, -1, 4);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeRawValue(java.lang.String, int, int)
    
    @Test
    public void testWriteRawValue26() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 34);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        writerBasedJsonGenerator.writeRawValue(string, 0, 8);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer32 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 32));
        int finalWriterBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer32);
        
        assertEquals(0, finalWriterBasedJsonGenerator_outputHead);
        
        assertEquals(8, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeRawValue(java.lang.String, int, int)
    
    @Test
    public void testWriteRawValue27() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2147483648, length 32]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:437)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:309) */
        writerBasedJsonGenerator.writeRawValue(string, 1, 32);
    }
    
    @Test
    public void testWriteRawValue28() throws Exception  {
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
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2147483648, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.util.DefaultIndenter.writeIndentation(DefaultIndenter.java:87)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:346)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:802)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:308) */
        writerBasedJsonGenerator.writeRawValue(((String) null), 0, 0);
    }
    
    @Test(expected = OutOfMemoryError.class)
    public void testWriteRawValue29() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ByteArrayOutputStream _outputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[33];
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(_outputStream, "java.io.ByteArrayOutputStream", "count", Integer.MIN_VALUE);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = new byte[32];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = {(byte) 0, (byte) 0};
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        String string = "";
        
        uTF8JsonGenerator.writeRawValue(string, 0, 0);
    }
    
    @Test
    public void testWriteRawValue30() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ByteArrayOutputStream _outputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(_outputStream, "java.io.ByteArrayOutputStream", "count", -2147483646);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = new byte[32];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = {(byte) 0, (byte) 0};
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147483646 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._flushBuffer(UTF8JsonGenerator.java:2032)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeBytes(UTF8JsonGenerator.java:1120)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:989)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:308) */
        uTF8JsonGenerator.writeRawValue(((String) null), 0, 0);
    }
    
    @Test
    public void testWriteRawValue31() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ByteArrayOutputStream _outputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[38];
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = new byte[32];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483643);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:535)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:309) */
        uTF8JsonGenerator.writeRawValue(((String) null), 0, 0);
    }
    
    @Test
    public void testWriteRawValue32() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ObjectOutputStream _outputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        setField(_outputStream, "java.io.ObjectOutputStream", "bout", bout);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = new byte[34];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 31);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483613);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1913)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._flushBuffer(UTF8JsonGenerator.java:2032)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:633)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeObjectFieldValueSeparator(MinimalPrettyPrinter.java:95)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyPrettyValueWrite(UTF8JsonGenerator.java:1016)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1005)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:308) */
        uTF8JsonGenerator.writeRawValue(string, 0, 0);
    }
    
    @Test
    public void testWriteRawValue33() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 268435457);
        char[] _charBuffer = new char[33];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer", _charBuffer);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = {};
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._flushBuffer(UTF8JsonGenerator.java:2032)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:600)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:537)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:309) */
        uTF8JsonGenerator.writeRawValue(string, 13, 0);
    }
    
    @Test
    public void testWriteRawValue34() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        char[] _charBuffer = new char[36];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer", _charBuffer);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = {};
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeSegmentedRaw(UTF8JsonGenerator.java:668)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:596)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:537)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:309) */
        uTF8JsonGenerator.writeRawValue(string, 11, 29);
    }
    
    @Test
    public void testWriteRawValue35() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 67108864);
        char[] _charBuffer = new char[36];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer", _charBuffer);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = {};
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:614)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:537)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:309) */
        uTF8JsonGenerator.writeRawValue(string, 3, 21);
    }
    
    @Test
    public void testWriteRawValue36() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", Integer.MIN_VALUE);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        SerializedString _rootSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000";
        setField(_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_rootSeparator", _rootSeparator);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeRootValueSeparator(DefaultPrettyPrinter.java:251)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:808)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:308) */
        writerBasedJsonGenerator.writeRawValue(((String) null), 0, 0);
    }
    
    @Test
    public void testWriteRawValue37() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ObjectOutputStream _outputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2147482626);
        setField(_outputStream, "java.io.ObjectOutputStream", "bout", bout);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = new byte[34];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 31);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483613);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._flushBuffer(UTF8JsonGenerator.java:2032)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:633)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeObjectFieldValueSeparator(MinimalPrettyPrinter.java:95)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyPrettyValueWrite(UTF8JsonGenerator.java:1016)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1005)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:308) */
        uTF8JsonGenerator.writeRawValue(string, 0, 0);
    }
    
    @Test
    public void testWriteRawValue38() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2147483614);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.util.DefaultIndenter.writeIndentation(DefaultIndenter.java:87)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:346)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:802)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:308) */
        writerBasedJsonGenerator.writeRawValue(((String) null), 0, 0);
    }
    
    @Test
    public void testWriteRawValue39() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        SerializedString _rootSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_rootSeparator", _rootSeparator);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeRootValueSeparator(DefaultPrettyPrinter.java:251)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:808)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:308) */
        writerBasedJsonGenerator.writeRawValue(string, 0, 0);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method writeRawValue(java.lang.String, int, int)
    
    @Test(timeout = 1000L)
    public void testWriteRawValue40() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ByteArrayOutputStream _outputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(_outputStream, "java.io.ByteArrayOutputStream", "count", 2147483624);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = new byte[24];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 18);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = {(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        uTF8JsonGenerator.writeRawValue(string, 0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeRawValue([C, int, int)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeRaw(text, offset, len);
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 8);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:456)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(charArray, -1, -2);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeRaw(text, offset, len);
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_32() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -31);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = {' '};
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:456)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(charArray, -1, 31);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(((char[]) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_22() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(((char[]) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_41() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1073741823);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1000)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(((char[]) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(char[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_51() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", Integer.MIN_VALUE);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", Integer.MIN_VALUE);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        uTF8JsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1000)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(((char[]) null), -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(char[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeRaw(text, offset, len);
 *  */
    @Test
    public void testWriteRawValue_ThrowNullPointerException1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 8);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 8);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 38);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:456)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(charArray, -255, 31);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(char[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeRaw(text, offset, len);
 *  */
    @Test
    public void testWriteRawValue_ThrowNullPointerException_2() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -31);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:456)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(((char[]) null), -255, 31);
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(char[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeRaw(text, offset, len);
 *  */
    @Test
    public void testWriteRawValue_ThrowNullPointerException_1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -31);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:456)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(((char[]) null), -255, 31);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeRawValue([C, int, int)
    
    @Test
    public void testWriteRawValue41() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        uTF8JsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
        
        JsonWriteContext jsonWriteContext = uTF8JsonGenerator._writeContext;
        int finalUTF8JsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(0, finalUTF8JsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue42() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        uTF8JsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
        
        JsonWriteContext jsonWriteContext = uTF8JsonGenerator._writeContext;
        int finalUTF8JsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(0, finalUTF8JsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue43() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 8388610);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 3);
        
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(3, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue44() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue45() throws Exception  {
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
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext jsonWriteContext1 = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue46() throws Exception  {
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
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue47() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue48() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
        
        JsonWriteContext jsonWriteContext = uTF8JsonGenerator._writeContext;
        int finalUTF8JsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(1, finalUTF8JsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue49() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 2);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 3);
        
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(3, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue50() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741826);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 3);
        
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(3, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue51() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 34);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer32 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 32));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer32);
        
        assertEquals(33, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue52() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        DerOutputStream _outputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = {};
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(_outputStream, "java.io.ByteArrayOutputStream", "count", 2);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = new byte[32];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483646);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        
        OutputStream uTF8JsonGenerator_outputStream = ((OutputStream) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
        byte[] initialUTF8JsonGenerator_outputStreamBuf = ((byte[]) getFieldValue(uTF8JsonGenerator_outputStream, "java.io.ByteArrayOutputStream", "buf"));
        
        uTF8JsonGenerator.writeRawValue(((char[]) null), 0, 0);
        
        OutputStream uTF8JsonGenerator_outputStream1 = ((OutputStream) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
        byte[] finalUTF8JsonGenerator_outputStreamBuf = ((byte[]) getFieldValue(uTF8JsonGenerator_outputStream1, "java.io.ByteArrayOutputStream", "buf"));
        OutputStream uTF8JsonGenerator_outputStream2 = ((OutputStream) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
        int finalUTF8JsonGenerator_outputStreamCount = ((Integer) getFieldValue(uTF8JsonGenerator_outputStream2, "java.io.ByteArrayOutputStream", "count"));
        byte[] uTF8JsonGenerator_outputBuffer = ((byte[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        byte finalUTF8JsonGenerator_outputBuffer0 = ((Byte) get(uTF8JsonGenerator_outputBuffer, 0));
        JsonWriteContext jsonWriteContext = uTF8JsonGenerator._writeContext;
        boolean finalUTF8JsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext jsonWriteContext1 = uTF8JsonGenerator._writeContext;
        int finalUTF8JsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertFalse(initialUTF8JsonGenerator_outputStreamBuf == finalUTF8JsonGenerator_outputStreamBuf);
        
        assertEquals(3, finalUTF8JsonGenerator_outputStreamCount);
        
        assertEquals((byte) 58, finalUTF8JsonGenerator_outputBuffer0);
        
        assertFalse(finalUTF8JsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalUTF8JsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue53() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(_writer, "java.io.Writer", "lock", lock);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 2);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 3);
        
        Writer writerBasedJsonGenerator_writer = ((Writer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
        boolean finalWriterBasedJsonGenerator_writerTrouble = ((Boolean) getFieldValue(writerBasedJsonGenerator_writer, "java.io.PrintWriter", "trouble"));
        int finalWriterBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertTrue(finalWriterBasedJsonGenerator_writerTrouble);
        
        assertEquals(0, finalWriterBasedJsonGenerator_outputHead);
        
        assertEquals(3, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(-2147483647, finalWriterBasedJsonGenerator_writeContext_index);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeRawValue([C, int, int)
    
    @Test
    public void testWriteRawValue54() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:471)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:345)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:802)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue55() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -1073741823);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 9]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:471)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator(DefaultPrettyPrinter.java:285)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:805)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue56() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:610)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        uTF8JsonGenerator.writeRawValue(charArray, Integer.MIN_VALUE, -2147483647);
    }
    
    @Test
    public void testWriteRawValue57() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        DerOutputStream _outputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483646);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        uTF8JsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.IndexOutOfBoundsException: Range [0, 0 + 1) out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckFromIndexSize(Preconditions.java:82)
            java.base/jdk.internal.util.Preconditions.checkFromIndexSize(Preconditions.java:361)
            java.base/java.util.Objects.checkFromIndexSize(Objects.java:411)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:129)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._flushBuffer(UTF8JsonGenerator.java:2032)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:998)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue58() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2147483649 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:456)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(charArray, 2147483632, 17);
    }
    
    @Test
    public void testWriteRawValue59() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        DerOutputStream _outputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483646);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.IndexOutOfBoundsException: Range [0, 0 + 1) out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckFromIndexSize(Preconditions.java:82)
            java.base/jdk.internal.util.Preconditions.checkFromIndexSize(Preconditions.java:361)
            java.base/java.util.Objects.checkFromIndexSize(Objects.java:411)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:129)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._flushBuffer(UTF8JsonGenerator.java:2032)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:998)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(((char[]) null), 0, 0);
    }
    
    @Test
    public void testWriteRawValue60() throws Exception  {
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
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2147483648, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.util.DefaultIndenter.writeIndentation(DefaultIndenter.java:87)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:346)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:802)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue61() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", Integer.MIN_VALUE);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = {(byte) 0};
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147483648 out of bounds for byte[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeBytes(UTF8JsonGenerator.java:1127)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:989)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue62() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        DerOutputStream _outputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = {};
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(_outputStream, "java.io.ByteArrayOutputStream", "count", -2147483646);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = new byte[32];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483646);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147483646 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._flushBuffer(UTF8JsonGenerator.java:2032)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:998)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(((char[]) null), 0, 0);
    }
    
    @Test
    public void testWriteRawValue63() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[11];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 17);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: offset 1, count 16, length 11]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.util.DefaultIndenter.writeIndentation(DefaultIndenter.java:87)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:346)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:802)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(((char[]) null), 0, 0);
    }
    
    @Test
    public void testWriteRawValue64() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        DerOutputStream _outputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = {(byte) 0, (byte) 0};
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.IndexOutOfBoundsException: Range [0, 0 + 1) out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckFromIndexSize(Preconditions.java:82)
            java.base/jdk.internal.util.Preconditions.checkFromIndexSize(Preconditions.java:361)
            java.base/java.util.Objects.checkFromIndexSize(Objects.java:411)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:129)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._flushBuffer(UTF8JsonGenerator.java:2032)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeBytes(UTF8JsonGenerator.java:1120)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:989)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue65() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1048577);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2079424252);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2078375675, length 7]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:778)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue66() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:462)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 1073741824);
    }
    
    @Test
    public void testWriteRawValue67() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:456)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue68() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_spacesInObjectEntries", true);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator(DefaultPrettyPrinter.java:283)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:805)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue69() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:637)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeObjectFieldValueSeparator(MinimalPrettyPrinter.java:95)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyPrettyValueWrite(UTF8JsonGenerator.java:1016)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1005)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue70() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1000)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue71() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", Integer.MIN_VALUE);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0080', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:621)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 1);
    }
    
    @Test
    public void testWriteRawValue72() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeSegmentedRaw(UTF8JsonGenerator.java:668)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:596)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 1);
    }
    
    @Test
    public void testWriteRawValue73() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -268435459);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 67108864);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_spacesInObjectEntries", true);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator(DefaultPrettyPrinter.java:283)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:805)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue74() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        DerOutputStream _outputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483645);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        uTF8JsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.ByteArrayOutputStream.ensureCapacity(ByteArrayOutputStream.java:97)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:130)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._flushBuffer(UTF8JsonGenerator.java:2032)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:998)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue75() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        OutputStreamWriter _writer = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:205)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:461)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 1073741824);
    }
    
    @Test
    public void testWriteRawValue76() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        SerializedString _rootSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_rootSeparator", _rootSeparator);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeRootValueSeparator(DefaultPrettyPrinter.java:251)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:808)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue77() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", Integer.MIN_VALUE);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.util.DefaultIndenter.writeIndentation(DefaultIndenter.java:87)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeArrayValues(DefaultPrettyPrinter.java:330)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:813)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue78() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._flushBuffer(UTF8JsonGenerator.java:2032)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:600)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue79() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ObjectOutputStream _outputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2147483641);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:712)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._flushBuffer(UTF8JsonGenerator.java:2032)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:633)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeObjectFieldValueSeparator(MinimalPrettyPrinter.java:95)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyPrettyValueWrite(UTF8JsonGenerator.java:1016)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1005)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue80() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        DerOutputStream _outputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2147483641);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:129)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._flushBuffer(UTF8JsonGenerator.java:2032)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:633)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeObjectFieldValueSeparator(MinimalPrettyPrinter.java:95)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyPrettyValueWrite(UTF8JsonGenerator.java:1016)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1005)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue81() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        uTF8JsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:521)
            com.fasterxml.jackson.core.util.DefaultIndenter.writeIndentation(DefaultIndenter.java:87)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeArrayValues(DefaultPrettyPrinter.java:330)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyPrettyValueWrite(UTF8JsonGenerator.java:1024)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:1005)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue82() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        OutputStreamWriter _writer = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 34);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:205)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:462)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(((char[]) null), 0, 1073741824);
    }
    
    @Test
    public void testWriteRawValue83() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(_writer, "java.io.PrintWriter", "out", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:462)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 1073741824);
    }
    
    @Test
    public void testWriteRawValue84() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(_writer, "java.io.PrintWriter", "out", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:462)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 1073741824);
    }
    
    @Test
    public void testWriteRawValue85() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", Integer.MIN_VALUE);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(UTF8JsonGenerator.java:614)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 1);
    }
    
    @Test
    public void testWriteRawValue86() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.JsonStringEncoder.encodeAsUTF8(JsonStringEncoder.java:261)
            com.fasterxml.jackson.core.io.SerializedString.asUnquotedUTF8(SerializedString.java:115)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:987)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue87() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(_writer, "java.io.PrintWriter", "out", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:462)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 1073741824);
    }
    
    @Test
    public void testWriteRawValue88() throws Exception  {
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
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:456)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(((char[]) null), 0, 0);
    }
    
    @Test
    public void testWriteRawValue89() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.util.DefaultIndenter.writeIndentation(DefaultIndenter.java:87)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeArrayValues(DefaultPrettyPrinter.java:330)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:813)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue90() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -31);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = new byte[32];
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeBytes(UTF8JsonGenerator.java:1127)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:989)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue91() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        DerOutputStream _outputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = {(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        uTF8JsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.ByteArrayOutputStream.ensureCapacity(ByteArrayOutputStream.java:97)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:130)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._flushBuffer(UTF8JsonGenerator.java:2032)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeBytes(UTF8JsonGenerator.java:1120)
            com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(UTF8JsonGenerator.java:989)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue92() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(_writer, "java.io.PrintWriter", "out", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = new char[16];
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:454)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 1);
    }
    
    @Test
    public void testWriteRawValue93() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000";
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:778)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue94() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", Integer.MIN_VALUE);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000";
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:778)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue95() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        BufferedWriter out = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:469)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeArrayValueSeparator(MinimalPrettyPrinter.java:144)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:802)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue96() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        BufferedWriter out = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2147483614);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:454)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(((char[]) null), 0, 1);
    }
    
    @Test
    public void testWriteRawValue97() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2147483614);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:454)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(((char[]) null), 0, 1);
    }
    
    @Test
    public void testWriteRawValue98() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = new char[12];
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:786)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test
    public void testWriteRawValue99() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(_writer, "java.io.PrintWriter", "out", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:461)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 1073741824);
    }
    
    @Test
    public void testWriteRawValue100() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2147483614);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:461)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(((char[]) null), 0, 1073741824);
    }
    
    @Test
    public void testWriteRawValue101() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 34);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:462)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:314) */
        writerBasedJsonGenerator.writeRawValue(((char[]) null), 0, 1073741824);
    }
    
    @Test
    public void testWriteRawValue102() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(_writer, "java.io.PrintWriter", "out", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:778)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:313) */
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method writeRawValue([C, int, int)
    
    @Test(expected = JsonGenerationException.class)
    public void testWriteRawValue103() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8JsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        uTF8JsonGenerator.writeRawValue(charArray, 0, 0);
    }
    
    @Test(expected = JsonGenerationException.class)
    public void testWriteRawValue104() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        writerBasedJsonGenerator.writeRawValue(charArray, 0, 0);
    }
    ///endregion
    
    ///region Errors report for writeRawValue
    
    public void testWriteRawValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeRawValue(com.fasterxml.jackson.core.SerializableString)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_23() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:471)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator(DefaultPrettyPrinter.java:285)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:805)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:318) */
        writerBasedJsonGenerator.writeRawValue(((SerializableString) null));
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_33() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2139160574);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2139160574);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2139160574);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2139160574 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:471)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:345)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:802)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:318) */
        writerBasedJsonGenerator.writeRawValue(((SerializableString) null));
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:318) */
        writerBasedJsonGenerator.writeRawValue(((SerializableString) null));
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _verifyValueWrite("write raw value");
 *  */
    @Test
    public void testWriteRawValue_ThrowArrayIndexOutOfBoundsException3() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(_writer, "java.io.Writer", "lock", lock);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -4);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:788)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:318) */
        writerBasedJsonGenerator.writeRawValue(((SerializableString) null));
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRawValue(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.GeneratorBase#writeRaw(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testWriteRawValue_ThrowNullPointerException2() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -16);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeRawValue(com.fasterxml.jackson.core.SerializableString)
    
    @Test
    public void testWriteRawValue105() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 34);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        writerBasedJsonGenerator.writeRawValue(serializedString);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer32 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 32));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext jsonWriteContext1 = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer32);
        
        assertEquals(33, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue106() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 30);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 28);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 29);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        writerBasedJsonGenerator.writeRawValue(serializedString);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer28 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 28));
        int finalWriterBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext jsonWriteContext1 = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer28);
        
        assertEquals(0, finalWriterBasedJsonGenerator_outputHead);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue107() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 8);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        writerBasedJsonGenerator.writeRawValue(serializedString);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext jsonWriteContext1 = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue108() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", Integer.MIN_VALUE);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        writerBasedJsonGenerator.writeRawValue(serializedString);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext jsonWriteContext1 = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
        
        assertFalse(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue109() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 34);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        writerBasedJsonGenerator.writeRawValue(serializedString);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer32 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 32));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer32);
        
        assertEquals(33, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteRawValue110() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[11];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 7);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        writerBasedJsonGenerator.writeRawValue(serializedString);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer2 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 2));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext jsonWriteContext = writerBasedJsonGenerator._writeContext;
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer2);
        
        assertEquals(3, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeRawValue(com.fasterxml.jackson.core.SerializableString)
    
    @Test
    public void testWriteRawValue111() throws Exception  {
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
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2147483648, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue112() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[17];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2145796030);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 16);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483643);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: offset 17, count 32, length 17]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue113() throws Exception  {
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
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2147483648, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue114() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 34);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: offset 1, count 33, length 9]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue115() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2046689244);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2046689243, length 40]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.getChars(String.java:1680)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue116() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -3);
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.StringIndexOutOfBoundsException: offset -3, count 3, length 9]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:778)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:318) */
        writerBasedJsonGenerator.writeRawValue(((SerializableString) null));
    }
    
    @Test
    public void testWriteRawValue117() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue118() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue119() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = ((DefaultPrettyPrinter.FixedSpaceIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(((SerializableString) null));
    }
    
    @Test
    public void testWriteRawValue120() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[11];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000\u0000\u0000";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:480)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue121() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.util.DefaultIndenter.writeIndentation(DefaultIndenter.java:87)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:346)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:802)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:318) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue122() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 34);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:406)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue123() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue124() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue125() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = ((DefaultPrettyPrinter.FixedSpaceIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:471)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter.writeIndentation(DefaultPrettyPrinter.java:397)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeArrayValues(DefaultPrettyPrinter.java:330)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:813)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:318) */
        writerBasedJsonGenerator.writeRawValue(((SerializableString) null));
    }
    
    @Test
    public void testWriteRawValue126() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        OutputStreamWriter _writer = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2147483614);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:205)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue127() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 34);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 32);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 33);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(((SerializableString) null));
    }
    
    @Test
    public void testWriteRawValue128() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.util.DefaultIndenter.writeIndentation(DefaultIndenter.java:87)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeArrayValues(DefaultPrettyPrinter.java:330)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:813)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:318) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue129() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue130() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue131() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_spacesInObjectEntries", true);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator(DefaultPrettyPrinter.java:283)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:805)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:318) */
        writerBasedJsonGenerator.writeRawValue(((SerializableString) null));
    }
    
    @Test
    public void testWriteRawValue132() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        OutputStreamWriter _writer = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        SerializedString _rootSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_rootSeparator", _rootSeparator);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeRootValueSeparator(DefaultPrettyPrinter.java:251)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:808)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:318) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue133() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue134() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:415)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue135() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue136() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue137() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[37];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2147483618);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 28);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 29);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue138() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741825);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741825);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:469)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:345)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:802)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:318) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue139() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue140() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.util.DefaultIndenter.writeIndentation(DefaultIndenter.java:87)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeArrayValues(DefaultPrettyPrinter.java:330)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:813)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:761)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:318) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue141() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    
    @Test
    public void testWriteRawValue142() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        writerBasedJsonGenerator._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:410)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:444)
            com.fasterxml.jackson.core.base.GeneratorBase.writeRawValue(GeneratorBase.java:319) */
        writerBasedJsonGenerator.writeRawValue(serializedString);
    }
    ///endregion
    
    ///region Errors report for writeRawValue
    
    public void testWriteRawValue_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase._checkStdFeatureChanges
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _checkStdFeatureChanges(int, int)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#_checkStdFeatureChanges(int,int)}
 * @utbot.executesCondition {@code ((changedFeatures & DERIVED_FEATURES_MASK) == 0): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void test_checkStdFeatureChanges_ChangedFeaturesBitwiseAndDERIVED_FEATURES_MASKEqualsZero() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            
            uTF8JsonGenerator._checkStdFeatureChanges(-255, 1);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#_checkStdFeatureChanges(int,int)}
 * @utbot.executesCondition {@code ((changedFeatures & DERIVED_FEATURES_MASK) == 0): False}
 * @utbot.executesCondition {@code (Feature.ESCAPE_NON_ASCII.enabledIn(changedFeatures)): False}
 * @utbot.executesCondition {@code (Feature.STRICT_DUPLICATE_DETECTION.enabledIn(changedFeatures)): False}
 *  */
    @Test
    public void test_checkStdFeatureChanges_NotFeatureSTRICT_DUPLICATE_DETECTIONEnabledIn() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            
            uTF8JsonGenerator._checkStdFeatureChanges(-223, 33);
            
            boolean finalUTF8JsonGenerator_cfgNumbersAsStrings = uTF8JsonGenerator._cfgNumbersAsStrings;
            
            assertTrue(finalUTF8JsonGenerator_cfgNumbersAsStrings);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#_checkStdFeatureChanges(int,int)}
 * @utbot.executesCondition {@code ((changedFeatures & DERIVED_FEATURES_MASK) == 0): False}
 * @utbot.executesCondition {@code (Feature.ESCAPE_NON_ASCII.enabledIn(changedFeatures)): True}
 * @utbot.executesCondition {@code (Feature.ESCAPE_NON_ASCII.enabledIn(newFeatureFlags)): False}
 * @utbot.executesCondition {@code (Feature.STRICT_DUPLICATE_DETECTION.enabledIn(changedFeatures)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.GeneratorBase#setHighestNonEscapedChar(int)}
 *  */
    @Test
    public void test_checkStdFeatureChanges_NotFeatureESCAPE_NON_ASCIIEnabledIn() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            
            uTF8JsonGenerator._checkStdFeatureChanges(-255, 161);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#_checkStdFeatureChanges(int,int)}
 * @utbot.executesCondition {@code ((changedFeatures & DERIVED_FEATURES_MASK) == 0): False}
 * @utbot.executesCondition {@code (Feature.ESCAPE_NON_ASCII.enabledIn(changedFeatures)): True}
 * @utbot.executesCondition {@code (Feature.ESCAPE_NON_ASCII.enabledIn(newFeatureFlags)): True}
 * @utbot.executesCondition {@code (Feature.STRICT_DUPLICATE_DETECTION.enabledIn(changedFeatures)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.GeneratorBase#setHighestNonEscapedChar(int)}
 *  */
    @Test
    public void test_checkStdFeatureChanges_FeatureESCAPE_NON_ASCIIEnabledIn() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            
            uTF8JsonGenerator._checkStdFeatureChanges(-95, 161);
            
            int finalUTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            boolean finalUTF8JsonGenerator_cfgNumbersAsStrings = uTF8JsonGenerator._cfgNumbersAsStrings;
            
            assertEquals(127, finalUTF8JsonGenerator_maximumNonEscapedChar);
            
            assertTrue(finalUTF8JsonGenerator_cfgNumbersAsStrings);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#_checkStdFeatureChanges(int,int)}
 * @utbot.executesCondition {@code ((changedFeatures & DERIVED_FEATURES_MASK) == 0): False}
 * @utbot.executesCondition {@code (Feature.ESCAPE_NON_ASCII.enabledIn(changedFeatures)): False}
 * @utbot.executesCondition {@code (Feature.STRICT_DUPLICATE_DETECTION.enabledIn(changedFeatures)): True}
 * @utbot.executesCondition {@code (Feature.STRICT_DUPLICATE_DETECTION.enabledIn(newFeatureFlags)): True}
 * @utbot.executesCondition {@code (_writeContext.getDupDetector() == null): False}
 *  */
    @Test
    public void test_checkStdFeatureChanges__writeContextGetDupDetectorNotEqualsNull() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
            setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
            writerBasedJsonGenerator._writeContext = _writeContext;
            
            writerBasedJsonGenerator._checkStdFeatureChanges(-222, -223);
            
            boolean finalWriterBasedJsonGenerator_cfgNumbersAsStrings = writerBasedJsonGenerator._cfgNumbersAsStrings;
            
            assertTrue(finalWriterBasedJsonGenerator_cfgNumbersAsStrings);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#_checkStdFeatureChanges(int,int)}
 * @utbot.executesCondition {@code ((changedFeatures & DERIVED_FEATURES_MASK) == 0): False}
 * @utbot.executesCondition {@code (Feature.ESCAPE_NON_ASCII.enabledIn(changedFeatures)): False}
 * @utbot.executesCondition {@code (Feature.STRICT_DUPLICATE_DETECTION.enabledIn(changedFeatures)): True}
 * @utbot.executesCondition {@code (Feature.STRICT_DUPLICATE_DETECTION.enabledIn(newFeatureFlags)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#withDupDetector(com.fasterxml.jackson.core.json.DupDetector)}
 *  */
    @Test
    public void test_checkStdFeatureChanges_NotFeatureSTRICT_DUPLICATE_DETECTIONEnabledIn_1() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            uTF8JsonGenerator._writeContext = _writeContext;
            
            uTF8JsonGenerator._checkStdFeatureChanges(33, -223);
            
            boolean finalUTF8JsonGenerator_cfgNumbersAsStrings = uTF8JsonGenerator._cfgNumbersAsStrings;
            
            assertTrue(finalUTF8JsonGenerator_cfgNumbersAsStrings);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#_checkStdFeatureChanges(int,int)}
 * @utbot.executesCondition {@code ((changedFeatures & DERIVED_FEATURES_MASK) == 0): False}
 * @utbot.executesCondition {@code (Feature.ESCAPE_NON_ASCII.enabledIn(changedFeatures)): False}
 * @utbot.executesCondition {@code (Feature.STRICT_DUPLICATE_DETECTION.enabledIn(changedFeatures)): True}
 * @utbot.executesCondition {@code (Feature.STRICT_DUPLICATE_DETECTION.enabledIn(newFeatureFlags)): True}
 * @utbot.executesCondition {@code (_writeContext.getDupDetector() == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.DupDetector#rootDetector(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#withDupDetector(com.fasterxml.jackson.core.json.DupDetector)}
 *  */
    @Test
    public void test_checkStdFeatureChanges__writeContextGetDupDetectorEqualsNull() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            uTF8JsonGenerator._writeContext = _writeContext;
            
            JsonWriteContext jsonWriteContext = uTF8JsonGenerator._writeContext;
            DupDetector initialUTF8JsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            
            uTF8JsonGenerator._checkStdFeatureChanges(-224, -224);
            
            boolean finalUTF8JsonGenerator_cfgNumbersAsStrings = uTF8JsonGenerator._cfgNumbersAsStrings;
            JsonWriteContext jsonWriteContext1 = uTF8JsonGenerator._writeContext;
            DupDetector finalUTF8JsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            
            assertFalse(initialUTF8JsonGenerator_writeContext_dups == finalUTF8JsonGenerator_writeContext_dups);
            
            assertTrue(finalUTF8JsonGenerator_cfgNumbersAsStrings);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _checkStdFeatureChanges(int, int)
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#_checkStdFeatureChanges(int,int)}
 * @utbot.executesCondition {@code (Feature.STRICT_DUPLICATE_DETECTION.enabledIn(newFeatureFlags)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#withDupDetector(com.fasterxml.jackson.core.json.DupDetector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _writeContext = _writeContext.withDupDetector(null);
 *  */
    @Test
    public void test_checkStdFeatureChanges_ThrowNullPointerException() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            
            /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase._checkStdFeatureChanges] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.base.GeneratorBase._checkStdFeatureChanges(GeneratorBase.java:237) */
            uTF8JsonGenerator._checkStdFeatureChanges(33, -223);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#_checkStdFeatureChanges(int,int)}
 * @utbot.executesCondition {@code (Feature.STRICT_DUPLICATE_DETECTION.enabledIn(newFeatureFlags)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#getDupDetector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _writeContext.getDupDetector() == null
 *  */
    @Test
    public void test_checkStdFeatureChanges_ThrowNullPointerException_1() throws Exception  {
        int prevDERIVED_FEATURES_MASK = GeneratorBase.DERIVED_FEATURES_MASK;
        try {
            Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            
            /* This test fails because method [com.fasterxml.jackson.core.base.GeneratorBase._checkStdFeatureChanges] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.base.GeneratorBase._checkStdFeatureChanges(GeneratorBase.java:233) */
            uTF8JsonGenerator._checkStdFeatureChanges(-223, -223);
        } finally {
            setStaticField(GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase.useDefaultPrettyPrinter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method useDefaultPrettyPrinter()
    
    /**
    @utbot.classUnderTest {@link GeneratorBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.GeneratorBase#useDefaultPrettyPrinter()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.GeneratorBase#getPrettyPrinter()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testUseDefaultPrettyPrinter_GeneratorBaseGetPrettyPrinter() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.useDefaultPrettyPrinter());
        
        OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
        assertNull(actual_outputStream);
        
        byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        assertNull(actual_outputBuffer);
        
        int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
        
        int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
        int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
        assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
        
        int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
        int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
        assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
        
        char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
        assertNull(actual_charBuffer);
        
        int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
        int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
        assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
        
        byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
        assertNull(actual_entityBuffer);
        
        boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
        assertFalse(actual_bufferRecyclable);
        
        IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
        assertNull(actual_ioContext);
        
        int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
        assertNull(actual_outputEscapes);
        
        int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
        int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
        assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
        
        CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
        assertNull(actual_characterEscapes);
        
        SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
        assertNull(actual_rootValueSeparator);
        
        boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
        assertFalse(actual_cfgUnqNames);
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
        int actual_features = actual._features;
        assertEquals(uTF8JsonGenerator_features, actual_features);
        
        boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
        assertFalse(actual_cfgNumbersAsStrings);
        
        JsonWriteContext actual_writeContext = actual._writeContext;
        assertNull(actual_writeContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        PrettyPrinter uTF8JsonGenerator_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        String actual_cfgPrettyPrinter_rootValueSeparator = ((String) getFieldValue(actual_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.MinimalPrettyPrinter", "_rootValueSeparator"));
        assertNull(actual_cfgPrettyPrinter_rootValueSeparator);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method useDefaultPrettyPrinter()
    
    @Test
    public void testUseDefaultPrettyPrinter1() throws Exception  {
        SerializedString prevDEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        DefaultPrettyPrinter.FixedSpaceIndenter prevInstance = DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        try {
            SerializedString defaultRootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            String _value = " ";
            setField(defaultRootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
            Class defaultPrettyPrinterClazz = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
            setStaticField(defaultPrettyPrinterClazz, "DEFAULT_ROOT_VALUE_SEPARATOR", defaultRootValueSeparator);
            DefaultPrettyPrinter.FixedSpaceIndenter instance = new DefaultPrettyPrinter.FixedSpaceIndenter();
            Class fixedSpaceIndenterClazz = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter");
            setStaticField(fixedSpaceIndenterClazz, "instance", instance);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            
            PrettyPrinter initialUTF8JsonGenerator_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.useDefaultPrettyPrinter());
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter uTF8JsonGenerator_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            DefaultPrettyPrinter.Indenter uTF8JsonGenerator_cfgPrettyPrinter_arrayIndenter = ((DefaultPrettyPrinter.Indenter) getFieldValue(uTF8JsonGenerator_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter"));
            DefaultPrettyPrinter.Indenter actual_cfgPrettyPrinter_arrayIndenter = ((DefaultPrettyPrinter.Indenter) getFieldValue(actual_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter"));
            
            DefaultPrettyPrinter.Indenter uTF8JsonGenerator_cfgPrettyPrinter_objectIndenter = ((DefaultPrettyPrinter.Indenter) getFieldValue(uTF8JsonGenerator_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_objectIndenter"));
            DefaultPrettyPrinter.Indenter actual_cfgPrettyPrinter_objectIndenter = ((DefaultPrettyPrinter.Indenter) getFieldValue(actual_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_objectIndenter"));
            char[] uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterIndents = ((char[]) getFieldValue(uTF8JsonGenerator_cfgPrettyPrinter_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents"));
            char[] actual_cfgPrettyPrinter_objectIndenterIndents = ((char[]) getFieldValue(actual_cfgPrettyPrinter_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents"));
            int uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterIndentsSize = uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterIndents.length;
            assertEquals(uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterIndentsSize, actual_cfgPrettyPrinter_objectIndenterIndents.length);
            assertArrayEquals(uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterIndents, actual_cfgPrettyPrinter_objectIndenterIndents);
            
            int uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterCharsPerLevel = ((Integer) getFieldValue(uTF8JsonGenerator_cfgPrettyPrinter_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel"));
            int actual_cfgPrettyPrinter_objectIndenterCharsPerLevel = ((Integer) getFieldValue(actual_cfgPrettyPrinter_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel"));
            assertEquals(uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterCharsPerLevel, actual_cfgPrettyPrinter_objectIndenterCharsPerLevel);
            
            String uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterEol = (((DefaultIndenter) uTF8JsonGenerator_cfgPrettyPrinter_objectIndenter)).getEol();
            String actual_cfgPrettyPrinter_objectIndenterEol = (((DefaultIndenter) actual_cfgPrettyPrinter_objectIndenter)).getEol();
            assertEquals(uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterEol, actual_cfgPrettyPrinter_objectIndenterEol);
            
            SerializableString uTF8JsonGenerator_cfgPrettyPrinter_rootSeparator = ((SerializableString) getFieldValue(uTF8JsonGenerator_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_rootSeparator"));
            SerializableString actual_cfgPrettyPrinter_rootSeparator = ((SerializableString) getFieldValue(actual_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_rootSeparator"));
            String uTF8JsonGenerator_cfgPrettyPrinter_rootSeparator_value = ((String) getFieldValue(uTF8JsonGenerator_cfgPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value"));
            String actual_cfgPrettyPrinter_rootSeparator_value = ((String) getFieldValue(actual_cfgPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value"));
            assertEquals(uTF8JsonGenerator_cfgPrettyPrinter_rootSeparator_value, actual_cfgPrettyPrinter_rootSeparator_value);
            
            byte[] actual_cfgPrettyPrinter_rootSeparator_quotedUTF8Ref = ((byte[]) getFieldValue(actual_cfgPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_quotedUTF8Ref"));
            assertNull(actual_cfgPrettyPrinter_rootSeparator_quotedUTF8Ref);
            
            byte[] actual_cfgPrettyPrinter_rootSeparator_unquotedUTF8Ref = ((byte[]) getFieldValue(actual_cfgPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref"));
            assertNull(actual_cfgPrettyPrinter_rootSeparator_unquotedUTF8Ref);
            
            char[] actual_cfgPrettyPrinter_rootSeparator_quotedChars = ((char[]) getFieldValue(actual_cfgPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_quotedChars"));
            assertNull(actual_cfgPrettyPrinter_rootSeparator_quotedChars);
            
            String actual_cfgPrettyPrinter_rootSeparator_jdkSerializeValue = ((String) getFieldValue(actual_cfgPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_jdkSerializeValue"));
            assertNull(actual_cfgPrettyPrinter_rootSeparator_jdkSerializeValue);
            
            boolean actual_cfgPrettyPrinter_spacesInObjectEntries = ((Boolean) getFieldValue(actual_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_spacesInObjectEntries"));
            assertTrue(actual_cfgPrettyPrinter_spacesInObjectEntries);
            
            int uTF8JsonGenerator_cfgPrettyPrinter_nesting = ((Integer) getFieldValue(uTF8JsonGenerator_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_nesting"));
            int actual_cfgPrettyPrinter_nesting = ((Integer) getFieldValue(actual_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_nesting"));
            assertEquals(uTF8JsonGenerator_cfgPrettyPrinter_nesting, actual_cfgPrettyPrinter_nesting);
            
            PrettyPrinter finalUTF8JsonGenerator_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            
            assertFalse(initialUTF8JsonGenerator_cfgPrettyPrinter == finalUTF8JsonGenerator_cfgPrettyPrinter);
        } finally {
            setStaticField(DefaultPrettyPrinter.class, "DEFAULT_ROOT_VALUE_SEPARATOR", prevDEFAULT_ROOT_VALUE_SEPARATOR);
            setStaticField(DefaultPrettyPrinter.FixedSpaceIndenter.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testUseDefaultPrettyPrinter2() throws Exception  {
        SerializedString prevDEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        DefaultPrettyPrinter.FixedSpaceIndenter prevInstance = DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        try {
            SerializedString defaultRootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            String _value = " ";
            setField(defaultRootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
            Class defaultPrettyPrinterClazz = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
            setStaticField(defaultPrettyPrinterClazz, "DEFAULT_ROOT_VALUE_SEPARATOR", defaultRootValueSeparator);
            DefaultPrettyPrinter.FixedSpaceIndenter instance = new DefaultPrettyPrinter.FixedSpaceIndenter();
            Class fixedSpaceIndenterClazz = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter");
            setStaticField(fixedSpaceIndenterClazz, "instance", instance);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            
            PrettyPrinter initialUTF8JsonGenerator_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.useDefaultPrettyPrinter());
            
            OutputStream actual_outputStream = ((OutputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            int actual_outputTail = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            int actual_outputEnd = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd"));
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            int actual_outputMaxContiguous = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputMaxContiguous"));
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            int actual_charBufferLength = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBufferLength"));
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_entityBuffer"));
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_bufferRecyclable"));
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = ((IOContext) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext"));
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_outputEscapes"));
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            int actual_maximumNonEscapedChar = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_maximumNonEscapedChar"));
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = ((CharacterEscapes) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_characterEscapes"));
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator"));
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_cfgUnqNames"));
            assertFalse(actual_cfgUnqNames);
            
            ObjectCodec actual_objectCodec = actual._objectCodec;
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = uTF8JsonGenerator._features;
            int actual_features = actual._features;
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = actual._cfgNumbersAsStrings;
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = actual._writeContext;
            assertNull(actual_writeContext);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            PrettyPrinter uTF8JsonGenerator_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            DefaultPrettyPrinter.Indenter uTF8JsonGenerator_cfgPrettyPrinter_arrayIndenter = ((DefaultPrettyPrinter.Indenter) getFieldValue(uTF8JsonGenerator_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter"));
            DefaultPrettyPrinter.Indenter actual_cfgPrettyPrinter_arrayIndenter = ((DefaultPrettyPrinter.Indenter) getFieldValue(actual_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter"));
            
            DefaultPrettyPrinter.Indenter uTF8JsonGenerator_cfgPrettyPrinter_objectIndenter = ((DefaultPrettyPrinter.Indenter) getFieldValue(uTF8JsonGenerator_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_objectIndenter"));
            DefaultPrettyPrinter.Indenter actual_cfgPrettyPrinter_objectIndenter = ((DefaultPrettyPrinter.Indenter) getFieldValue(actual_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_objectIndenter"));
            char[] uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterIndents = ((char[]) getFieldValue(uTF8JsonGenerator_cfgPrettyPrinter_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents"));
            char[] actual_cfgPrettyPrinter_objectIndenterIndents = ((char[]) getFieldValue(actual_cfgPrettyPrinter_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents"));
            int uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterIndentsSize = uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterIndents.length;
            assertEquals(uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterIndentsSize, actual_cfgPrettyPrinter_objectIndenterIndents.length);
            assertArrayEquals(uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterIndents, actual_cfgPrettyPrinter_objectIndenterIndents);
            
            int uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterCharsPerLevel = ((Integer) getFieldValue(uTF8JsonGenerator_cfgPrettyPrinter_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel"));
            int actual_cfgPrettyPrinter_objectIndenterCharsPerLevel = ((Integer) getFieldValue(actual_cfgPrettyPrinter_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel"));
            assertEquals(uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterCharsPerLevel, actual_cfgPrettyPrinter_objectIndenterCharsPerLevel);
            
            String uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterEol = (((DefaultIndenter) uTF8JsonGenerator_cfgPrettyPrinter_objectIndenter)).getEol();
            String actual_cfgPrettyPrinter_objectIndenterEol = (((DefaultIndenter) actual_cfgPrettyPrinter_objectIndenter)).getEol();
            assertEquals(uTF8JsonGenerator_cfgPrettyPrinter_objectIndenterEol, actual_cfgPrettyPrinter_objectIndenterEol);
            
            SerializableString uTF8JsonGenerator_cfgPrettyPrinter_rootSeparator = ((SerializableString) getFieldValue(uTF8JsonGenerator_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_rootSeparator"));
            SerializableString actual_cfgPrettyPrinter_rootSeparator = ((SerializableString) getFieldValue(actual_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_rootSeparator"));
            String uTF8JsonGenerator_cfgPrettyPrinter_rootSeparator_value = ((String) getFieldValue(uTF8JsonGenerator_cfgPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value"));
            String actual_cfgPrettyPrinter_rootSeparator_value = ((String) getFieldValue(actual_cfgPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value"));
            assertEquals(uTF8JsonGenerator_cfgPrettyPrinter_rootSeparator_value, actual_cfgPrettyPrinter_rootSeparator_value);
            
            byte[] actual_cfgPrettyPrinter_rootSeparator_quotedUTF8Ref = ((byte[]) getFieldValue(actual_cfgPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_quotedUTF8Ref"));
            assertNull(actual_cfgPrettyPrinter_rootSeparator_quotedUTF8Ref);
            
            byte[] actual_cfgPrettyPrinter_rootSeparator_unquotedUTF8Ref = ((byte[]) getFieldValue(actual_cfgPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref"));
            assertNull(actual_cfgPrettyPrinter_rootSeparator_unquotedUTF8Ref);
            
            char[] actual_cfgPrettyPrinter_rootSeparator_quotedChars = ((char[]) getFieldValue(actual_cfgPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_quotedChars"));
            assertNull(actual_cfgPrettyPrinter_rootSeparator_quotedChars);
            
            String actual_cfgPrettyPrinter_rootSeparator_jdkSerializeValue = ((String) getFieldValue(actual_cfgPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_jdkSerializeValue"));
            assertNull(actual_cfgPrettyPrinter_rootSeparator_jdkSerializeValue);
            
            boolean actual_cfgPrettyPrinter_spacesInObjectEntries = ((Boolean) getFieldValue(actual_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_spacesInObjectEntries"));
            assertTrue(actual_cfgPrettyPrinter_spacesInObjectEntries);
            
            int uTF8JsonGenerator_cfgPrettyPrinter_nesting = ((Integer) getFieldValue(uTF8JsonGenerator_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_nesting"));
            int actual_cfgPrettyPrinter_nesting = ((Integer) getFieldValue(actual_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_nesting"));
            assertEquals(uTF8JsonGenerator_cfgPrettyPrinter_nesting, actual_cfgPrettyPrinter_nesting);
            
            PrettyPrinter finalUTF8JsonGenerator_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            
            assertFalse(initialUTF8JsonGenerator_cfgPrettyPrinter == finalUTF8JsonGenerator_cfgPrettyPrinter);
        } finally {
            setStaticField(DefaultPrettyPrinter.class, "DEFAULT_ROOT_VALUE_SEPARATOR", prevDEFAULT_ROOT_VALUE_SEPARATOR);
            setStaticField(DefaultPrettyPrinter.FixedSpaceIndenter.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.GeneratorBase._constructDefaultPrettyPrinter
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _constructDefaultPrettyPrinter()
    
    @Test
    public void test_constructDefaultPrettyPrinter1() throws Exception  {
        SerializedString prevDEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        DefaultPrettyPrinter.FixedSpaceIndenter prevInstance = DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        try {
            SerializedString defaultRootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            String _value = " ";
            setField(defaultRootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
            Class defaultPrettyPrinterClazz = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
            setStaticField(defaultPrettyPrinterClazz, "DEFAULT_ROOT_VALUE_SEPARATOR", defaultRootValueSeparator);
            DefaultPrettyPrinter.FixedSpaceIndenter instance = new DefaultPrettyPrinter.FixedSpaceIndenter();
            Class fixedSpaceIndenterClazz = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter");
            setStaticField(fixedSpaceIndenterClazz, "instance", instance);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            
            DefaultPrettyPrinter actual = ((DefaultPrettyPrinter) writerBasedJsonGenerator._constructDefaultPrettyPrinter());
            
            DefaultPrettyPrinter expected = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
            DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = ((DefaultPrettyPrinter.FixedSpaceIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
            setField(expected, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
            DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
            char[] indents = new char[32];
            indents[0] = ' ';
            indents[1] = ' ';
            indents[2] = ' ';
            indents[3] = ' ';
            indents[4] = ' ';
            indents[5] = ' ';
            indents[6] = ' ';
            indents[7] = ' ';
            indents[8] = ' ';
            indents[9] = ' ';
            indents[10] = ' ';
            indents[11] = ' ';
            indents[12] = ' ';
            indents[13] = ' ';
            indents[14] = ' ';
            indents[15] = ' ';
            indents[16] = ' ';
            indents[17] = ' ';
            indents[18] = ' ';
            indents[19] = ' ';
            indents[20] = ' ';
            indents[21] = ' ';
            indents[22] = ' ';
            indents[23] = ' ';
            indents[24] = ' ';
            indents[25] = ' ';
            indents[26] = ' ';
            indents[27] = ' ';
            indents[28] = ' ';
            indents[29] = ' ';
            indents[30] = ' ';
            indents[31] = ' ';
            setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
            setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 2);
            String eol = "\n";
            setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
            setField(expected, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_objectIndenter", _objectIndenter);
            setField(expected, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_rootSeparator", defaultRootValueSeparator);
            setField(expected, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_spacesInObjectEntries", true);
            
            DefaultPrettyPrinter.Indenter expected_arrayIndenter = ((DefaultPrettyPrinter.Indenter) getFieldValue(expected, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter"));
            DefaultPrettyPrinter.Indenter actual_arrayIndenter = ((DefaultPrettyPrinter.Indenter) getFieldValue(actual, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter"));
            
            DefaultPrettyPrinter.Indenter expected_objectIndenter = ((DefaultPrettyPrinter.Indenter) getFieldValue(expected, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_objectIndenter"));
            DefaultPrettyPrinter.Indenter actual_objectIndenter = ((DefaultPrettyPrinter.Indenter) getFieldValue(actual, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_objectIndenter"));
            char[] expected_objectIndenterIndents = ((char[]) getFieldValue(expected_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents"));
            char[] actual_objectIndenterIndents = ((char[]) getFieldValue(actual_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents"));
            int expected_objectIndenterIndentsSize = expected_objectIndenterIndents.length;
            assertEquals(expected_objectIndenterIndentsSize, actual_objectIndenterIndents.length);
            assertArrayEquals(expected_objectIndenterIndents, actual_objectIndenterIndents);
            
            int expected_objectIndenterCharsPerLevel = ((Integer) getFieldValue(expected_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel"));
            int actual_objectIndenterCharsPerLevel = ((Integer) getFieldValue(actual_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel"));
            assertEquals(expected_objectIndenterCharsPerLevel, actual_objectIndenterCharsPerLevel);
            
            String expected_objectIndenterEol = (((DefaultIndenter) expected_objectIndenter)).getEol();
            String actual_objectIndenterEol = (((DefaultIndenter) actual_objectIndenter)).getEol();
            assertEquals(expected_objectIndenterEol, actual_objectIndenterEol);
            
            SerializableString expected_rootSeparator = ((SerializableString) getFieldValue(expected, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_rootSeparator"));
            SerializableString actual_rootSeparator = ((SerializableString) getFieldValue(actual, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_rootSeparator"));
            String expected_rootSeparator_value = ((String) getFieldValue(expected_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value"));
            String actual_rootSeparator_value = ((String) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value"));
            assertEquals(expected_rootSeparator_value, actual_rootSeparator_value);
            
            byte[] actual_rootSeparator_quotedUTF8Ref = ((byte[]) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_quotedUTF8Ref"));
            assertNull(actual_rootSeparator_quotedUTF8Ref);
            
            byte[] actual_rootSeparator_unquotedUTF8Ref = ((byte[]) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref"));
            assertNull(actual_rootSeparator_unquotedUTF8Ref);
            
            char[] actual_rootSeparator_quotedChars = ((char[]) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_quotedChars"));
            assertNull(actual_rootSeparator_quotedChars);
            
            String actual_rootSeparator_jdkSerializeValue = ((String) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_jdkSerializeValue"));
            assertNull(actual_rootSeparator_jdkSerializeValue);
            
            boolean actual_spacesInObjectEntries = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_spacesInObjectEntries"));
            assertTrue(actual_spacesInObjectEntries);
            
            int expected_nesting = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_nesting"));
            int actual_nesting = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_nesting"));
            assertEquals(expected_nesting, actual_nesting);
            
        } finally {
            setStaticField(DefaultPrettyPrinter.class, "DEFAULT_ROOT_VALUE_SEPARATOR", prevDEFAULT_ROOT_VALUE_SEPARATOR);
            setStaticField(DefaultPrettyPrinter.FixedSpaceIndenter.class, "instance", prevInstance);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1025858887948300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1025858887948300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1025858887953500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1025858887948300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1025858887953500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1025858889010000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1025858889010000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1025858889012400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1025858889010000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1025858889012400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1025858889691800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1025858889691800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1025858889693300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1025858889691800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1025858889693300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

