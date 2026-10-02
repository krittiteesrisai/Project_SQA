package com.fasterxml.jackson.core.json;

import org.junit.Test;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.OutputStream;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import java.util.HashSet;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.Writer;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileWriter;
import com.fasterxml.jackson.core.util.DefaultIndenter;
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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_core_json_JsonGeneratorImplTest {
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonGeneratorImpl.version
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method version()
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#version()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.VersionUtil#versionFor(java.lang.Class)}
 *  */
    @Test
    public void testVersion_VersionUtilVersionFor() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        Version actual = uTF8JsonGenerator.version();
        
        Version expected = ((Version) createInstance("com.fasterxml.jackson.core.Version"));
        setField(expected, "com.fasterxml.jackson.core.Version", "_majorVersion", 2);
        setField(expected, "com.fasterxml.jackson.core.Version", "_minorVersion", 7);
        setField(expected, "com.fasterxml.jackson.core.Version", "_patchLevel", 2);
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
        setField(expected, "com.fasterxml.jackson.core.Version", "_patchLevel", 2);
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
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonGeneratorImpl.enable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method enable(com.fasterxml.jackson.core.JsonGenerator$Feature)
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#enable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code (f == Feature.QUOTE_FIELD_NAMES): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnable_FNotEqualsFeatureQUOTE_FIELD_NAMES() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", -255);
            JsonGenerator.Feature feature = JsonGenerator.Feature.AUTO_CLOSE_TARGET;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.enable(feature));
            
            OutputStream actual_outputStream = actual._outputStream;
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = actual._outputBuffer;
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = uTF8JsonGenerator._outputTail;
            int actual_outputTail = actual._outputTail;
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = uTF8JsonGenerator._outputEnd;
            int actual_outputEnd = actual._outputEnd;
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = uTF8JsonGenerator._outputMaxContiguous;
            int actual_outputMaxContiguous = actual._outputMaxContiguous;
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = actual._charBuffer;
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = uTF8JsonGenerator._charBufferLength;
            int actual_charBufferLength = actual._charBufferLength;
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = actual._entityBuffer;
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = actual._bufferRecyclable;
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = actual._ioContext;
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = actual._outputEscapes;
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = uTF8JsonGenerator._maximumNonEscapedChar;
            int actual_maximumNonEscapedChar = actual._maximumNonEscapedChar;
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = actual._characterEscapes;
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = actual._rootValueSeparator;
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = actual._cfgUnqNames;
            assertFalse(actual_cfgUnqNames);
            
            String actualWRITE_BINARY = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BINARY"));
            assertNull(actualWRITE_BINARY);
            
            String actualWRITE_BOOLEAN = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BOOLEAN"));
            assertNull(actualWRITE_BOOLEAN);
            
            String actualWRITE_NULL = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NULL"));
            assertNull(actualWRITE_NULL);
            
            String actualWRITE_NUMBER = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NUMBER"));
            assertNull(actualWRITE_NUMBER);
            
            String actualWRITE_RAW = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_RAW"));
            assertNull(actualWRITE_RAW);
            
            String actualWRITE_STRING = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_STRING"));
            assertNull(actualWRITE_STRING);
            
            ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_objectCodec"));
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
            int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings"));
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = ((JsonWriteContext) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
            assertNull(actual_writeContext);
            
            boolean actual_closed = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_closed"));
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#enable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code (f == Feature.QUOTE_FIELD_NAMES): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnable_FEqualsFeatureQUOTE_FIELD_NAMES() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", -255);
            JsonGenerator.Feature feature = JsonGenerator.Feature.QUOTE_FIELD_NAMES;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.enable(feature));
            
            OutputStream actual_outputStream = actual._outputStream;
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = actual._outputBuffer;
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = uTF8JsonGenerator._outputTail;
            int actual_outputTail = actual._outputTail;
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = uTF8JsonGenerator._outputEnd;
            int actual_outputEnd = actual._outputEnd;
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = uTF8JsonGenerator._outputMaxContiguous;
            int actual_outputMaxContiguous = actual._outputMaxContiguous;
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = actual._charBuffer;
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = uTF8JsonGenerator._charBufferLength;
            int actual_charBufferLength = actual._charBufferLength;
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = actual._entityBuffer;
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = actual._bufferRecyclable;
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = actual._ioContext;
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = actual._outputEscapes;
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = uTF8JsonGenerator._maximumNonEscapedChar;
            int actual_maximumNonEscapedChar = actual._maximumNonEscapedChar;
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = actual._characterEscapes;
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = actual._rootValueSeparator;
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = actual._cfgUnqNames;
            assertFalse(actual_cfgUnqNames);
            
            String actualWRITE_BINARY = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BINARY"));
            assertNull(actualWRITE_BINARY);
            
            String actualWRITE_BOOLEAN = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BOOLEAN"));
            assertNull(actualWRITE_BOOLEAN);
            
            String actualWRITE_NULL = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NULL"));
            assertNull(actualWRITE_NULL);
            
            String actualWRITE_NUMBER = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NUMBER"));
            assertNull(actualWRITE_NUMBER);
            
            String actualWRITE_RAW = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_RAW"));
            assertNull(actualWRITE_RAW);
            
            String actualWRITE_STRING = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_STRING"));
            assertNull(actualWRITE_STRING);
            
            ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_objectCodec"));
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
            int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings"));
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = ((JsonWriteContext) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
            assertNull(actual_writeContext);
            
            boolean actual_closed = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_closed"));
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalUTF8JsonGenerator_features = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
            
            assertEquals(-247, finalUTF8JsonGenerator_features);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#enable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code (f == Feature.QUOTE_FIELD_NAMES): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnable_FNotEqualsFeatureQUOTE_FIELD_NAMES_1() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", -255);
            JsonGenerator.Feature feature = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.enable(feature));
            
            OutputStream actual_outputStream = actual._outputStream;
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = actual._outputBuffer;
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = uTF8JsonGenerator._outputTail;
            int actual_outputTail = actual._outputTail;
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = uTF8JsonGenerator._outputEnd;
            int actual_outputEnd = actual._outputEnd;
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = uTF8JsonGenerator._outputMaxContiguous;
            int actual_outputMaxContiguous = actual._outputMaxContiguous;
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = actual._charBuffer;
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = uTF8JsonGenerator._charBufferLength;
            int actual_charBufferLength = actual._charBufferLength;
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = actual._entityBuffer;
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = actual._bufferRecyclable;
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = actual._ioContext;
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = actual._outputEscapes;
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = uTF8JsonGenerator._maximumNonEscapedChar;
            int actual_maximumNonEscapedChar = actual._maximumNonEscapedChar;
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = actual._characterEscapes;
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = actual._rootValueSeparator;
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = actual._cfgUnqNames;
            assertFalse(actual_cfgUnqNames);
            
            String actualWRITE_BINARY = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BINARY"));
            assertNull(actualWRITE_BINARY);
            
            String actualWRITE_BOOLEAN = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BOOLEAN"));
            assertNull(actualWRITE_BOOLEAN);
            
            String actualWRITE_NULL = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NULL"));
            assertNull(actualWRITE_NULL);
            
            String actualWRITE_NUMBER = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NUMBER"));
            assertNull(actualWRITE_NUMBER);
            
            String actualWRITE_RAW = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_RAW"));
            assertNull(actualWRITE_RAW);
            
            String actualWRITE_STRING = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_STRING"));
            assertNull(actualWRITE_STRING);
            
            ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_objectCodec"));
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
            int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings"));
            assertTrue(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = ((JsonWriteContext) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
            assertNull(actual_writeContext);
            
            boolean actual_closed = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_closed"));
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalUTF8JsonGenerator_features = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
            boolean finalUTF8JsonGenerator_cfgNumbersAsStrings = ((Boolean) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings"));
            
            assertEquals(-223, finalUTF8JsonGenerator_features);
            
            assertTrue(finalUTF8JsonGenerator_cfgNumbersAsStrings);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#enable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code (f == Feature.QUOTE_FIELD_NAMES): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnable_FNotEqualsFeatureQUOTE_FIELD_NAMES_2() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            uTF8JsonGenerator._maximumNonEscapedChar = -255;
            setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", -255);
            JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.enable(feature));
            
            OutputStream actual_outputStream = actual._outputStream;
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = actual._outputBuffer;
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = uTF8JsonGenerator._outputTail;
            int actual_outputTail = actual._outputTail;
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = uTF8JsonGenerator._outputEnd;
            int actual_outputEnd = actual._outputEnd;
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = uTF8JsonGenerator._outputMaxContiguous;
            int actual_outputMaxContiguous = actual._outputMaxContiguous;
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = actual._charBuffer;
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = uTF8JsonGenerator._charBufferLength;
            int actual_charBufferLength = actual._charBufferLength;
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = actual._entityBuffer;
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = actual._bufferRecyclable;
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = actual._ioContext;
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = actual._outputEscapes;
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = uTF8JsonGenerator._maximumNonEscapedChar;
            int actual_maximumNonEscapedChar = actual._maximumNonEscapedChar;
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = actual._characterEscapes;
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = actual._rootValueSeparator;
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = actual._cfgUnqNames;
            assertFalse(actual_cfgUnqNames);
            
            String actualWRITE_BINARY = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BINARY"));
            assertNull(actualWRITE_BINARY);
            
            String actualWRITE_BOOLEAN = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BOOLEAN"));
            assertNull(actualWRITE_BOOLEAN);
            
            String actualWRITE_NULL = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NULL"));
            assertNull(actualWRITE_NULL);
            
            String actualWRITE_NUMBER = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NUMBER"));
            assertNull(actualWRITE_NUMBER);
            
            String actualWRITE_RAW = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_RAW"));
            assertNull(actualWRITE_RAW);
            
            String actualWRITE_STRING = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_STRING"));
            assertNull(actualWRITE_STRING);
            
            ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_objectCodec"));
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
            int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings"));
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext actual_writeContext = ((JsonWriteContext) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
            assertNull(actual_writeContext);
            
            boolean actual_closed = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_closed"));
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
            int finalUTF8JsonGenerator_maximumNonEscapedChar = uTF8JsonGenerator._maximumNonEscapedChar;
            int finalUTF8JsonGenerator_features = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
            
            assertEquals(127, finalUTF8JsonGenerator_maximumNonEscapedChar);
            
            assertEquals(-127, finalUTF8JsonGenerator_features);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#enable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code (f == Feature.QUOTE_FIELD_NAMES): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.DupDetector#rootDetector(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#withDupDetector(com.fasterxml.jackson.core.json.DupDetector)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnable_FNotEqualsFeatureQUOTE_FIELD_NAMES_4() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", -255);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
            JsonGenerator.Feature feature = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
            
            JsonWriteContext uTF8JsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
            DupDetector initialUTF8JsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.enable(feature));
            
            OutputStream actual_outputStream = actual._outputStream;
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = actual._outputBuffer;
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = uTF8JsonGenerator._outputTail;
            int actual_outputTail = actual._outputTail;
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = uTF8JsonGenerator._outputEnd;
            int actual_outputEnd = actual._outputEnd;
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = uTF8JsonGenerator._outputMaxContiguous;
            int actual_outputMaxContiguous = actual._outputMaxContiguous;
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = actual._charBuffer;
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = uTF8JsonGenerator._charBufferLength;
            int actual_charBufferLength = actual._charBufferLength;
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = actual._entityBuffer;
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = actual._bufferRecyclable;
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = actual._ioContext;
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = actual._outputEscapes;
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = uTF8JsonGenerator._maximumNonEscapedChar;
            int actual_maximumNonEscapedChar = actual._maximumNonEscapedChar;
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = actual._characterEscapes;
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = actual._rootValueSeparator;
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = actual._cfgUnqNames;
            assertFalse(actual_cfgUnqNames);
            
            String actualWRITE_BINARY = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BINARY"));
            assertNull(actualWRITE_BINARY);
            
            String actualWRITE_BOOLEAN = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BOOLEAN"));
            assertNull(actualWRITE_BOOLEAN);
            
            String actualWRITE_NULL = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NULL"));
            assertNull(actualWRITE_NULL);
            
            String actualWRITE_NUMBER = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NUMBER"));
            assertNull(actualWRITE_NUMBER);
            
            String actualWRITE_RAW = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_RAW"));
            assertNull(actualWRITE_RAW);
            
            String actualWRITE_STRING = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_STRING"));
            assertNull(actualWRITE_STRING);
            
            ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_objectCodec"));
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
            int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings"));
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext uTF8JsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
            JsonWriteContext actual_writeContext = ((JsonWriteContext) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
            JsonWriteContext actual_writeContext_parent = actual_writeContext._parent;
            assertNull(actual_writeContext_parent);
            
            DupDetector uTF8JsonGenerator_writeContext1_dups = uTF8JsonGenerator_writeContext1._dups;
            DupDetector actual_writeContext_dups = actual_writeContext._dups;
            Object uTF8JsonGenerator_writeContext1_dups_source = uTF8JsonGenerator_writeContext1_dups._source;
            Object actual_writeContext_dups_source = actual_writeContext_dups._source;
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            assertTrue(deepEquals(uTF8JsonGenerator_writeContext1_dups_source, actual_writeContext_dups_source));
            boolean actual_writeContext_dups_source_closed = ((Boolean) getFieldValue(actual_writeContext_dups_source, "com.fasterxml.jackson.core.base.GeneratorBase", "_closed"));
            assertFalse(actual_writeContext_dups_source_closed);
            
            PrettyPrinter actual_writeContext_dups_source_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual_writeContext_dups_source, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_writeContext_dups_source_cfgPrettyPrinter);
            
            String actual_writeContext_dups_firstName = actual_writeContext_dups._firstName;
            assertNull(actual_writeContext_dups_firstName);
            
            String actual_writeContext_dups_secondName = actual_writeContext_dups._secondName;
            assertNull(actual_writeContext_dups_secondName);
            
            HashSet actual_writeContext_dups_seen = actual_writeContext_dups._seen;
            assertNull(actual_writeContext_dups_seen);
            
            JsonWriteContext actual_writeContext_child = actual_writeContext._child;
            assertNull(actual_writeContext_child);
            
            String actual_writeContext_currentName = actual_writeContext._currentName;
            assertNull(actual_writeContext_currentName);
            
            Object actual_writeContext_currentValue = actual_writeContext._currentValue;
            assertNull(actual_writeContext_currentValue);
            
            boolean actual_writeContext_gotName = actual_writeContext._gotName;
            assertFalse(actual_writeContext_gotName);
            
            int uTF8JsonGenerator_writeContext1_type = ((Integer) getFieldValue(uTF8JsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            int actual_writeContext_type = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            assertEquals(uTF8JsonGenerator_writeContext1_type, actual_writeContext_type);
            
            int uTF8JsonGenerator_writeContext1_index = ((Integer) getFieldValue(uTF8JsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            int actual_writeContext_index = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            assertEquals(uTF8JsonGenerator_writeContext1_index, actual_writeContext_index);
            
            assertTrue(deepEquals(uTF8JsonGenerator, actual));
            assertTrue(deepEquals(uTF8JsonGenerator, actual));
            
            JsonWriteContext uTF8JsonGenerator_writeContext2 = ((JsonWriteContext) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
            DupDetector finalUTF8JsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(uTF8JsonGenerator_writeContext2, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            
            assertFalse(initialUTF8JsonGenerator_writeContext_dups == finalUTF8JsonGenerator_writeContext_dups);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#enable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.executesCondition {@code (f == Feature.QUOTE_FIELD_NAMES): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnable_FNotEqualsFeatureQUOTE_FIELD_NAMES_3() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features", -255);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
            _writeContext._dups = _dups;
            setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
            JsonGenerator.Feature feature = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
            
            UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.enable(feature));
            
            OutputStream actual_outputStream = actual._outputStream;
            assertNull(actual_outputStream);
            
            byte[] actual_outputBuffer = actual._outputBuffer;
            assertNull(actual_outputBuffer);
            
            int uTF8JsonGenerator_outputTail = uTF8JsonGenerator._outputTail;
            int actual_outputTail = actual._outputTail;
            assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
            
            int uTF8JsonGenerator_outputEnd = uTF8JsonGenerator._outputEnd;
            int actual_outputEnd = actual._outputEnd;
            assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
            
            int uTF8JsonGenerator_outputMaxContiguous = uTF8JsonGenerator._outputMaxContiguous;
            int actual_outputMaxContiguous = actual._outputMaxContiguous;
            assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
            
            char[] actual_charBuffer = actual._charBuffer;
            assertNull(actual_charBuffer);
            
            int uTF8JsonGenerator_charBufferLength = uTF8JsonGenerator._charBufferLength;
            int actual_charBufferLength = actual._charBufferLength;
            assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
            
            byte[] actual_entityBuffer = actual._entityBuffer;
            assertNull(actual_entityBuffer);
            
            boolean actual_bufferRecyclable = actual._bufferRecyclable;
            assertFalse(actual_bufferRecyclable);
            
            IOContext actual_ioContext = actual._ioContext;
            assertNull(actual_ioContext);
            
            int[] actual_outputEscapes = actual._outputEscapes;
            assertNull(actual_outputEscapes);
            
            int uTF8JsonGenerator_maximumNonEscapedChar = uTF8JsonGenerator._maximumNonEscapedChar;
            int actual_maximumNonEscapedChar = actual._maximumNonEscapedChar;
            assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
            
            CharacterEscapes actual_characterEscapes = actual._characterEscapes;
            assertNull(actual_characterEscapes);
            
            SerializableString actual_rootValueSeparator = actual._rootValueSeparator;
            assertNull(actual_rootValueSeparator);
            
            boolean actual_cfgUnqNames = actual._cfgUnqNames;
            assertFalse(actual_cfgUnqNames);
            
            String actualWRITE_BINARY = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BINARY"));
            assertNull(actualWRITE_BINARY);
            
            String actualWRITE_BOOLEAN = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BOOLEAN"));
            assertNull(actualWRITE_BOOLEAN);
            
            String actualWRITE_NULL = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NULL"));
            assertNull(actualWRITE_NULL);
            
            String actualWRITE_NUMBER = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NUMBER"));
            assertNull(actualWRITE_NUMBER);
            
            String actualWRITE_RAW = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_RAW"));
            assertNull(actualWRITE_RAW);
            
            String actualWRITE_STRING = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_STRING"));
            assertNull(actualWRITE_STRING);
            
            ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_objectCodec"));
            assertNull(actual_objectCodec);
            
            int uTF8JsonGenerator_features = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
            int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
            assertEquals(uTF8JsonGenerator_features, actual_features);
            
            boolean actual_cfgNumbersAsStrings = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings"));
            assertFalse(actual_cfgNumbersAsStrings);
            
            JsonWriteContext uTF8JsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
            JsonWriteContext actual_writeContext = ((JsonWriteContext) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
            JsonWriteContext actual_writeContext_parent = actual_writeContext._parent;
            assertNull(actual_writeContext_parent);
            
            DupDetector uTF8JsonGenerator_writeContext_dups = uTF8JsonGenerator_writeContext._dups;
            DupDetector actual_writeContext_dups = actual_writeContext._dups;
            Object actual_writeContext_dups_source = actual_writeContext_dups._source;
            assertNull(actual_writeContext_dups_source);
            
            String actual_writeContext_dups_firstName = actual_writeContext_dups._firstName;
            assertNull(actual_writeContext_dups_firstName);
            
            String actual_writeContext_dups_secondName = actual_writeContext_dups._secondName;
            assertNull(actual_writeContext_dups_secondName);
            
            HashSet actual_writeContext_dups_seen = actual_writeContext_dups._seen;
            assertNull(actual_writeContext_dups_seen);
            
            JsonWriteContext actual_writeContext_child = actual_writeContext._child;
            assertNull(actual_writeContext_child);
            
            String actual_writeContext_currentName = actual_writeContext._currentName;
            assertNull(actual_writeContext_currentName);
            
            Object actual_writeContext_currentValue = actual_writeContext._currentValue;
            assertNull(actual_writeContext_currentValue);
            
            boolean actual_writeContext_gotName = actual_writeContext._gotName;
            assertFalse(actual_writeContext_gotName);
            
            int uTF8JsonGenerator_writeContext_type = ((Integer) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            int actual_writeContext_type = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            assertEquals(uTF8JsonGenerator_writeContext_type, actual_writeContext_type);
            
            int uTF8JsonGenerator_writeContext_index = ((Integer) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            int actual_writeContext_index = ((Integer) getFieldValue(actual_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            assertEquals(uTF8JsonGenerator_writeContext_index, actual_writeContext_index);
            
            boolean actual_closed = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_closed"));
            assertFalse(actual_closed);
            
            PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
            assertNull(actual_cfgPrettyPrinter);
            
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonGeneratorImpl.getHighestEscapedChar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getHighestEscapedChar()
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#getHighestEscapedChar()}
 * @utbot.returnsFrom {@code return _maximumNonEscapedChar;}
 *  */
    @Test
    public void testGetHighestEscapedChar_Return_maximumNonEscapedChar() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        writerBasedJsonGenerator._maximumNonEscapedChar = -255;
        
        int actual = writerBasedJsonGenerator.getHighestEscapedChar();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonGeneratorImpl._checkStdFeatureChanges
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _checkStdFeatureChanges(int, int)
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#_checkStdFeatureChanges(int,int)}
 *  */
    @Test
    public void test_checkStdFeatureChanges() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            
            uTF8JsonGenerator._checkStdFeatureChanges(-247, 1);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#_checkStdFeatureChanges(int,int)}
 *  */
    @Test
    public void test_checkStdFeatureChanges_1() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            
            uTF8JsonGenerator._checkStdFeatureChanges(-255, 1);
            
            boolean finalUTF8JsonGenerator_cfgUnqNames = uTF8JsonGenerator._cfgUnqNames;
            
            assertTrue(finalUTF8JsonGenerator_cfgUnqNames);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#_checkStdFeatureChanges(int,int)}
 *  */
    @Test
    public void test_checkStdFeatureChanges_2() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            
            uTF8JsonGenerator._checkStdFeatureChanges(-247, 33);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#_checkStdFeatureChanges(int,int)}
 *  */
    @Test
    public void test_checkStdFeatureChanges_4() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            writerBasedJsonGenerator._maximumNonEscapedChar = -255;
            
            writerBasedJsonGenerator._checkStdFeatureChanges(-247, 161);
            
            int finalWriterBasedJsonGenerator_maximumNonEscapedChar = writerBasedJsonGenerator._maximumNonEscapedChar;
            
            assertEquals(0, finalWriterBasedJsonGenerator_maximumNonEscapedChar);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#_checkStdFeatureChanges(int,int)}
 *  */
    @Test
    public void test_checkStdFeatureChanges_5() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            
            uTF8JsonGenerator._checkStdFeatureChanges(-127, 161);
            
            int finalUTF8JsonGenerator_maximumNonEscapedChar = uTF8JsonGenerator._maximumNonEscapedChar;
            boolean finalUTF8JsonGenerator_cfgUnqNames = uTF8JsonGenerator._cfgUnqNames;
            
            assertEquals(127, finalUTF8JsonGenerator_maximumNonEscapedChar);
            
            assertTrue(finalUTF8JsonGenerator_cfgUnqNames);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#_checkStdFeatureChanges(int,int)}
 *  */
    @Test
    public void test_checkStdFeatureChanges_6() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
            _writeContext._dups = _dups;
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
            
            writerBasedJsonGenerator._checkStdFeatureChanges(-223, -223);
            
            boolean finalWriterBasedJsonGenerator_cfgUnqNames = writerBasedJsonGenerator._cfgUnqNames;
            boolean finalWriterBasedJsonGenerator_cfgNumbersAsStrings = ((Boolean) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings"));
            
            assertTrue(finalWriterBasedJsonGenerator_cfgUnqNames);
            
            assertTrue(finalWriterBasedJsonGenerator_cfgNumbersAsStrings);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#_checkStdFeatureChanges(int,int)}
 *  */
    @Test
    public void test_checkStdFeatureChanges_3() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
            
            JsonWriteContext uTF8JsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
            DupDetector initialUTF8JsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(uTF8JsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            
            uTF8JsonGenerator._checkStdFeatureChanges(-255, -208);
            
            boolean finalUTF8JsonGenerator_cfgUnqNames = uTF8JsonGenerator._cfgUnqNames;
            JsonWriteContext uTF8JsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
            DupDetector finalUTF8JsonGenerator_writeContext_dups = ((DupDetector) getFieldValue(uTF8JsonGenerator_writeContext1, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups"));
            
            assertFalse(initialUTF8JsonGenerator_writeContext_dups == finalUTF8JsonGenerator_writeContext_dups);
            
            assertTrue(finalUTF8JsonGenerator_cfgUnqNames);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#_checkStdFeatureChanges(int,int)}
 *  */
    @Test
    public void test_checkStdFeatureChanges_7() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
            
            writerBasedJsonGenerator._checkStdFeatureChanges(33, -223);
            
            boolean finalWriterBasedJsonGenerator_cfgUnqNames = writerBasedJsonGenerator._cfgUnqNames;
            boolean finalWriterBasedJsonGenerator_cfgNumbersAsStrings = ((Boolean) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings"));
            
            assertTrue(finalWriterBasedJsonGenerator_cfgUnqNames);
            
            assertTrue(finalWriterBasedJsonGenerator_cfgNumbersAsStrings);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonGeneratorImpl.setHighestNonEscapedChar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setHighestNonEscapedChar(int)
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#setHighestNonEscapedChar(int)}
 * @utbot.executesCondition {@code ((charCode < 0)): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetHighestNonEscapedChar_CharCodeLessThanZero() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.setHighestNonEscapedChar(-1));
        
        OutputStream actual_outputStream = actual._outputStream;
        assertNull(actual_outputStream);
        
        byte[] actual_outputBuffer = actual._outputBuffer;
        assertNull(actual_outputBuffer);
        
        int uTF8JsonGenerator_outputTail = uTF8JsonGenerator._outputTail;
        int actual_outputTail = actual._outputTail;
        assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
        
        int uTF8JsonGenerator_outputEnd = uTF8JsonGenerator._outputEnd;
        int actual_outputEnd = actual._outputEnd;
        assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
        
        int uTF8JsonGenerator_outputMaxContiguous = uTF8JsonGenerator._outputMaxContiguous;
        int actual_outputMaxContiguous = actual._outputMaxContiguous;
        assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
        
        char[] actual_charBuffer = actual._charBuffer;
        assertNull(actual_charBuffer);
        
        int uTF8JsonGenerator_charBufferLength = uTF8JsonGenerator._charBufferLength;
        int actual_charBufferLength = actual._charBufferLength;
        assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
        
        byte[] actual_entityBuffer = actual._entityBuffer;
        assertNull(actual_entityBuffer);
        
        boolean actual_bufferRecyclable = actual._bufferRecyclable;
        assertFalse(actual_bufferRecyclable);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        int[] actual_outputEscapes = actual._outputEscapes;
        assertNull(actual_outputEscapes);
        
        int uTF8JsonGenerator_maximumNonEscapedChar = uTF8JsonGenerator._maximumNonEscapedChar;
        int actual_maximumNonEscapedChar = actual._maximumNonEscapedChar;
        assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
        
        CharacterEscapes actual_characterEscapes = actual._characterEscapes;
        assertNull(actual_characterEscapes);
        
        SerializableString actual_rootValueSeparator = actual._rootValueSeparator;
        assertNull(actual_rootValueSeparator);
        
        boolean actual_cfgUnqNames = actual._cfgUnqNames;
        assertFalse(actual_cfgUnqNames);
        
        String actualWRITE_BINARY = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BINARY"));
        assertNull(actualWRITE_BINARY);
        
        String actualWRITE_BOOLEAN = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BOOLEAN"));
        assertNull(actualWRITE_BOOLEAN);
        
        String actualWRITE_NULL = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NULL"));
        assertNull(actualWRITE_NULL);
        
        String actualWRITE_NUMBER = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NUMBER"));
        assertNull(actualWRITE_NUMBER);
        
        String actualWRITE_RAW = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_RAW"));
        assertNull(actualWRITE_RAW);
        
        String actualWRITE_STRING = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_STRING"));
        assertNull(actualWRITE_STRING);
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        int uTF8JsonGenerator_features = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
        assertEquals(uTF8JsonGenerator_features, actual_features);
        
        boolean actual_cfgNumbersAsStrings = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings"));
        assertFalse(actual_cfgNumbersAsStrings);
        
        JsonWriteContext actual_writeContext = ((JsonWriteContext) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        assertNull(actual_writeContext);
        
        boolean actual_closed = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_closed"));
        assertFalse(actual_closed);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#setHighestNonEscapedChar(int)}
 * @utbot.executesCondition {@code ((charCode < 0)): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetHighestNonEscapedChar_CharCodeGreaterOrEqualZero() throws Exception  {
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        uTF8JsonGenerator._maximumNonEscapedChar = -255;
        
        UTF8JsonGenerator actual = ((UTF8JsonGenerator) uTF8JsonGenerator.setHighestNonEscapedChar(0));
        
        OutputStream actual_outputStream = actual._outputStream;
        assertNull(actual_outputStream);
        
        byte[] actual_outputBuffer = actual._outputBuffer;
        assertNull(actual_outputBuffer);
        
        int uTF8JsonGenerator_outputTail = uTF8JsonGenerator._outputTail;
        int actual_outputTail = actual._outputTail;
        assertEquals(uTF8JsonGenerator_outputTail, actual_outputTail);
        
        int uTF8JsonGenerator_outputEnd = uTF8JsonGenerator._outputEnd;
        int actual_outputEnd = actual._outputEnd;
        assertEquals(uTF8JsonGenerator_outputEnd, actual_outputEnd);
        
        int uTF8JsonGenerator_outputMaxContiguous = uTF8JsonGenerator._outputMaxContiguous;
        int actual_outputMaxContiguous = actual._outputMaxContiguous;
        assertEquals(uTF8JsonGenerator_outputMaxContiguous, actual_outputMaxContiguous);
        
        char[] actual_charBuffer = actual._charBuffer;
        assertNull(actual_charBuffer);
        
        int uTF8JsonGenerator_charBufferLength = uTF8JsonGenerator._charBufferLength;
        int actual_charBufferLength = actual._charBufferLength;
        assertEquals(uTF8JsonGenerator_charBufferLength, actual_charBufferLength);
        
        byte[] actual_entityBuffer = actual._entityBuffer;
        assertNull(actual_entityBuffer);
        
        boolean actual_bufferRecyclable = actual._bufferRecyclable;
        assertFalse(actual_bufferRecyclable);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        int[] actual_outputEscapes = actual._outputEscapes;
        assertNull(actual_outputEscapes);
        
        int uTF8JsonGenerator_maximumNonEscapedChar = uTF8JsonGenerator._maximumNonEscapedChar;
        int actual_maximumNonEscapedChar = actual._maximumNonEscapedChar;
        assertEquals(uTF8JsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
        
        CharacterEscapes actual_characterEscapes = actual._characterEscapes;
        assertNull(actual_characterEscapes);
        
        SerializableString actual_rootValueSeparator = actual._rootValueSeparator;
        assertNull(actual_rootValueSeparator);
        
        boolean actual_cfgUnqNames = actual._cfgUnqNames;
        assertFalse(actual_cfgUnqNames);
        
        String actualWRITE_BINARY = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BINARY"));
        assertNull(actualWRITE_BINARY);
        
        String actualWRITE_BOOLEAN = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BOOLEAN"));
        assertNull(actualWRITE_BOOLEAN);
        
        String actualWRITE_NULL = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NULL"));
        assertNull(actualWRITE_NULL);
        
        String actualWRITE_NUMBER = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NUMBER"));
        assertNull(actualWRITE_NUMBER);
        
        String actualWRITE_RAW = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_RAW"));
        assertNull(actualWRITE_RAW);
        
        String actualWRITE_STRING = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_STRING"));
        assertNull(actualWRITE_STRING);
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        int uTF8JsonGenerator_features = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
        assertEquals(uTF8JsonGenerator_features, actual_features);
        
        boolean actual_cfgNumbersAsStrings = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings"));
        assertFalse(actual_cfgNumbersAsStrings);
        
        JsonWriteContext actual_writeContext = ((JsonWriteContext) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        assertNull(actual_writeContext);
        
        boolean actual_closed = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_closed"));
        assertFalse(actual_closed);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
        int finalUTF8JsonGenerator_maximumNonEscapedChar = uTF8JsonGenerator._maximumNonEscapedChar;
        
        assertEquals(0, finalUTF8JsonGenerator_maximumNonEscapedChar);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonGeneratorImpl.setRootValueSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRootValueSeparator(com.fasterxml.jackson.core.SerializableString)
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#setRootValueSeparator(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetRootValueSeparator_Return() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        
        WriterBasedJsonGenerator actual = ((WriterBasedJsonGenerator) writerBasedJsonGenerator.setRootValueSeparator(null));
        
        Writer actual_writer = actual._writer;
        assertNull(actual_writer);
        
        char[] actual_outputBuffer = actual._outputBuffer;
        assertNull(actual_outputBuffer);
        
        int writerBasedJsonGenerator_outputHead = writerBasedJsonGenerator._outputHead;
        int actual_outputHead = actual._outputHead;
        assertEquals(writerBasedJsonGenerator_outputHead, actual_outputHead);
        
        int writerBasedJsonGenerator_outputTail = writerBasedJsonGenerator._outputTail;
        int actual_outputTail = actual._outputTail;
        assertEquals(writerBasedJsonGenerator_outputTail, actual_outputTail);
        
        int writerBasedJsonGenerator_outputEnd = writerBasedJsonGenerator._outputEnd;
        int actual_outputEnd = actual._outputEnd;
        assertEquals(writerBasedJsonGenerator_outputEnd, actual_outputEnd);
        
        char[] actual_entityBuffer = actual._entityBuffer;
        assertNull(actual_entityBuffer);
        
        SerializableString actual_currentEscape = actual._currentEscape;
        assertNull(actual_currentEscape);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        int[] actual_outputEscapes = actual._outputEscapes;
        assertNull(actual_outputEscapes);
        
        int writerBasedJsonGenerator_maximumNonEscapedChar = writerBasedJsonGenerator._maximumNonEscapedChar;
        int actual_maximumNonEscapedChar = actual._maximumNonEscapedChar;
        assertEquals(writerBasedJsonGenerator_maximumNonEscapedChar, actual_maximumNonEscapedChar);
        
        CharacterEscapes actual_characterEscapes = actual._characterEscapes;
        assertNull(actual_characterEscapes);
        
        SerializableString actual_rootValueSeparator = actual._rootValueSeparator;
        assertNull(actual_rootValueSeparator);
        
        boolean actual_cfgUnqNames = actual._cfgUnqNames;
        assertFalse(actual_cfgUnqNames);
        
        String actualWRITE_BINARY = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BINARY"));
        assertNull(actualWRITE_BINARY);
        
        String actualWRITE_BOOLEAN = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_BOOLEAN"));
        assertNull(actualWRITE_BOOLEAN);
        
        String actualWRITE_NULL = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NULL"));
        assertNull(actualWRITE_NULL);
        
        String actualWRITE_NUMBER = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_NUMBER"));
        assertNull(actualWRITE_NUMBER);
        
        String actualWRITE_RAW = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_RAW"));
        assertNull(actualWRITE_RAW);
        
        String actualWRITE_STRING = ((String) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "WRITE_STRING"));
        assertNull(actualWRITE_STRING);
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        int writerBasedJsonGenerator_features = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_features"));
        assertEquals(writerBasedJsonGenerator_features, actual_features);
        
        boolean actual_cfgNumbersAsStrings = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_cfgNumbersAsStrings"));
        assertFalse(actual_cfgNumbersAsStrings);
        
        JsonWriteContext actual_writeContext = ((JsonWriteContext) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        assertNull(actual_writeContext);
        
        boolean actual_closed = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.base.GeneratorBase", "_closed"));
        assertFalse(actual_closed);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
        SerializableString finalWriterBasedJsonGenerator_rootValueSeparator = writerBasedJsonGenerator._rootValueSeparator;
        
        assertNull(finalWriterBasedJsonGenerator_rootValueSeparator);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonGeneratorImpl.getCharacterEscapes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCharacterEscapes()
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#getCharacterEscapes()}
 * @utbot.returnsFrom {@code return _characterEscapes;}
 *  */
    @Test
    public void testGetCharacterEscapes_Return_characterEscapes() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        
        CharacterEscapes actual = writerBasedJsonGenerator.getCharacterEscapes();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeStringField(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#writeStringField(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonGenerationException} in: writeFieldName(fieldName);
 *  */
    @Test(expected = JsonGenerationException.class)
    public void testWriteStringField_ThrowJsonGenerationException() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        _writeContext._gotName = true;
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        writerBasedJsonGenerator.writeStringField(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#writeStringField(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonGenerationException} in: writeFieldName(fieldName);
 *  */
    @Test(expected = JsonGenerationException.class)
    public void testWriteStringField_ThrowJsonGenerationException_1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "";
        _dups._firstName = _firstName;
        _writeContext._dups = _dups;
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        writerBasedJsonGenerator.writeStringField(_firstName, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeStringField(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#writeStringField(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteStringField_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputTail = -1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:471)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator(DefaultPrettyPrinter.java:301)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writePPFieldName(WriterBasedJsonGenerator.java:268)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:128)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#writeStringField(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeFieldName(fieldName);
 *  */
    @Test
    public void testWriteStringField_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputTail = -1;
        writerBasedJsonGenerator._outputEnd = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:144)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#writeStringField(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeFieldName(fieldName);
 *  */
    @Test
    public void testWriteStringField_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputTail = Integer.MAX_VALUE;
        writerBasedJsonGenerator._outputEnd = -2147483647;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:136)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#writeStringField(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeFieldName(fieldName);
 *  */
    @Test
    public void testWriteStringField_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:144)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#writeStringField(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeFieldName(fieldName);
 *  */
    @Test
    public void testWriteStringField_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 3;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultPrettyPrinter.FixedSpaceIndenter _objectIndenter = ((DefaultPrettyPrinter.FixedSpaceIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writePPFieldName(WriterBasedJsonGenerator.java:279)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:128)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#writeStringField(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteStringField_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputTail = 1073741823;
        writerBasedJsonGenerator._outputEnd = 1073741824;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        _writeContext._dups = _dups;
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:471)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator(DefaultPrettyPrinter.java:301)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writePPFieldName(WriterBasedJsonGenerator.java:268)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:128)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#writeStringField(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeFieldName(fieldName);
 *  */
    @Test
    public void testWriteStringField_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = -1;
        writerBasedJsonGenerator._outputTail = -1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        _writeContext._dups = _dups;
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:144)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#writeStringField(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeFieldName(fieldName);
 *  */
    @Test
    public void testWriteStringField_ThrowNullPointerException() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 2;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:908)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:146)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#writeStringField(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeFieldName(fieldName);
 *  */
    @Test
    public void testWriteStringField_ThrowNullPointerException_1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultPrettyPrinter.FixedSpaceIndenter _objectIndenter = ((DefaultPrettyPrinter.FixedSpaceIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:908)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writePPFieldName(WriterBasedJsonGenerator.java:274)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:128)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#writeStringField(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeFieldName(fieldName);
 *  */
    @Test
    public void testWriteStringField_ThrowNullPointerException_3() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 1;
        writerBasedJsonGenerator._outputEnd = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        _writeContext._dups = _dups;
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:908)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writePPFieldName(WriterBasedJsonGenerator.java:280)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:128)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonGeneratorImpl}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#writeStringField(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeFieldName(fieldName);
 *  */
    @Test
    public void testWriteStringField_ThrowNullPointerException_2() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = -2;
        writerBasedJsonGenerator._outputTail = -1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        _writeContext._dups = _dups;
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:133)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeStringField(java.lang.String, java.lang.String)
    
    @Test
    public void testWriteStringField1() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1073741824;
        int[] _outputEscapes = {0};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0001";
        
        writerBasedJsonGenerator.writeStringField(string, string);
        
        char finalWriterBasedJsonGenerator_outputBuffer0 = writerBasedJsonGenerator._outputBuffer[0];
        char finalWriterBasedJsonGenerator_outputBuffer2 = writerBasedJsonGenerator._outputBuffer[2];
        char finalWriterBasedJsonGenerator_outputBuffer3 = writerBasedJsonGenerator._outputBuffer[3];
        char finalWriterBasedJsonGenerator_outputBuffer4 = writerBasedJsonGenerator._outputBuffer[4];
        char finalWriterBasedJsonGenerator_outputBuffer6 = writerBasedJsonGenerator._outputBuffer[6];
        char finalWriterBasedJsonGenerator_outputBuffer7 = writerBasedJsonGenerator._outputBuffer[7];
        int finalWriterBasedJsonGenerator_outputTail = writerBasedJsonGenerator._outputTail;
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('\u0001', finalWriterBasedJsonGenerator_outputBuffer2);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer3);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer4);
        
        assertEquals('\u0001', finalWriterBasedJsonGenerator_outputBuffer6);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer7);
        
        assertEquals(8, finalWriterBasedJsonGenerator_outputTail);
        
        assertTrue(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteStringField2() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[39];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputTail = 32;
        writerBasedJsonGenerator._outputEnd = 40;
        int[] _outputEscapes = {0};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._maximumNonEscapedChar = -1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "";
        
        writerBasedJsonGenerator.writeStringField(string, string);
        
        char finalWriterBasedJsonGenerator_outputBuffer32 = writerBasedJsonGenerator._outputBuffer[32];
        char finalWriterBasedJsonGenerator_outputBuffer33 = writerBasedJsonGenerator._outputBuffer[33];
        char finalWriterBasedJsonGenerator_outputBuffer34 = writerBasedJsonGenerator._outputBuffer[34];
        char finalWriterBasedJsonGenerator_outputBuffer35 = writerBasedJsonGenerator._outputBuffer[35];
        int finalWriterBasedJsonGenerator_outputTail = writerBasedJsonGenerator._outputTail;
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer32);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer33);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer34);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer35);
        
        assertEquals(36, finalWriterBasedJsonGenerator_outputTail);
        
        assertTrue(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteStringField3() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[39];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputTail = 32;
        writerBasedJsonGenerator._outputEnd = 40;
        int[] _outputEscapes = {};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "";
        
        writerBasedJsonGenerator.writeStringField(string, string);
        
        char finalWriterBasedJsonGenerator_outputBuffer32 = writerBasedJsonGenerator._outputBuffer[32];
        char finalWriterBasedJsonGenerator_outputBuffer33 = writerBasedJsonGenerator._outputBuffer[33];
        char finalWriterBasedJsonGenerator_outputBuffer34 = writerBasedJsonGenerator._outputBuffer[34];
        char finalWriterBasedJsonGenerator_outputBuffer35 = writerBasedJsonGenerator._outputBuffer[35];
        int finalWriterBasedJsonGenerator_outputTail = writerBasedJsonGenerator._outputTail;
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer32);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer33);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer34);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer35);
        
        assertEquals(36, finalWriterBasedJsonGenerator_outputTail);
        
        assertTrue(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteStringField4() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 2147483265;
        writerBasedJsonGenerator._outputEnd = 2;
        int[] _outputEscapes = new int[15];
        _outputEscapes[1] = 3;
        _outputEscapes[2] = 3;
        _outputEscapes[3] = 3;
        _outputEscapes[4] = 3;
        _outputEscapes[5] = 3;
        _outputEscapes[6] = 3;
        _outputEscapes[7] = 3;
        _outputEscapes[8] = 3;
        _outputEscapes[9] = 3;
        _outputEscapes[10] = 3;
        _outputEscapes[11] = 3;
        _outputEscapes[12] = 3;
        _outputEscapes[13] = 3;
        _outputEscapes[14] = 3;
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000";
        
        writerBasedJsonGenerator.writeStringField(string, string);
        
        char finalWriterBasedJsonGenerator_outputBuffer0 = writerBasedJsonGenerator._outputBuffer[0];
        char finalWriterBasedJsonGenerator_outputBuffer2 = writerBasedJsonGenerator._outputBuffer[2];
        char finalWriterBasedJsonGenerator_outputBuffer3 = writerBasedJsonGenerator._outputBuffer[3];
        char finalWriterBasedJsonGenerator_outputBuffer5 = writerBasedJsonGenerator._outputBuffer[5];
        int finalWriterBasedJsonGenerator_outputTail = writerBasedJsonGenerator._outputTail;
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer2);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer3);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer5);
        
        assertEquals(6, finalWriterBasedJsonGenerator_outputTail);
        
        assertTrue(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(-2147483647, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteStringField5() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1073741824;
        int[] _outputEscapes = {0};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0001\u0000";
        
        writerBasedJsonGenerator.writeStringField(string, string);
        
        char finalWriterBasedJsonGenerator_outputBuffer0 = writerBasedJsonGenerator._outputBuffer[0];
        char finalWriterBasedJsonGenerator_outputBuffer1 = writerBasedJsonGenerator._outputBuffer[1];
        char finalWriterBasedJsonGenerator_outputBuffer3 = writerBasedJsonGenerator._outputBuffer[3];
        char finalWriterBasedJsonGenerator_outputBuffer4 = writerBasedJsonGenerator._outputBuffer[4];
        char finalWriterBasedJsonGenerator_outputBuffer6 = writerBasedJsonGenerator._outputBuffer[6];
        int finalWriterBasedJsonGenerator_outputTail = writerBasedJsonGenerator._outputTail;
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('\u0001', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer3);
        
        assertEquals('\u0001', finalWriterBasedJsonGenerator_outputBuffer4);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer6);
        
        assertEquals(7, finalWriterBasedJsonGenerator_outputTail);
        
        assertTrue(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteStringField6() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[39];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputTail = 32;
        writerBasedJsonGenerator._outputEnd = 40;
        int[] _outputEscapes = {0};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._maximumNonEscapedChar = -1;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "";
        
        writerBasedJsonGenerator.writeStringField(string, string);
        
        char finalWriterBasedJsonGenerator_outputBuffer32 = writerBasedJsonGenerator._outputBuffer[32];
        char finalWriterBasedJsonGenerator_outputBuffer33 = writerBasedJsonGenerator._outputBuffer[33];
        char finalWriterBasedJsonGenerator_outputBuffer34 = writerBasedJsonGenerator._outputBuffer[34];
        int finalWriterBasedJsonGenerator_outputTail = writerBasedJsonGenerator._outputTail;
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer32);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer33);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer34);
        
        assertEquals(35, finalWriterBasedJsonGenerator_outputTail);
        
        assertTrue(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteStringField7() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputTail = 1;
        writerBasedJsonGenerator._outputEnd = 1073741824;
        int[] _outputEscapes = {};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000";
        
        writerBasedJsonGenerator.writeStringField(string, string);
        
        char finalWriterBasedJsonGenerator_outputBuffer1 = writerBasedJsonGenerator._outputBuffer[1];
        char finalWriterBasedJsonGenerator_outputBuffer3 = writerBasedJsonGenerator._outputBuffer[3];
        char finalWriterBasedJsonGenerator_outputBuffer4 = writerBasedJsonGenerator._outputBuffer[4];
        char finalWriterBasedJsonGenerator_outputBuffer6 = writerBasedJsonGenerator._outputBuffer[6];
        int finalWriterBasedJsonGenerator_outputTail = writerBasedJsonGenerator._outputTail;
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals(':', finalWriterBasedJsonGenerator_outputBuffer3);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer4);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer6);
        
        assertEquals(7, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    @Test
    public void testWriteStringField8() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1073741824;
        int[] _outputEscapes = new int[14];
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "";
        
        writerBasedJsonGenerator.writeStringField(string, string);
        
        char finalWriterBasedJsonGenerator_outputBuffer0 = writerBasedJsonGenerator._outputBuffer[0];
        char finalWriterBasedJsonGenerator_outputBuffer1 = writerBasedJsonGenerator._outputBuffer[1];
        char finalWriterBasedJsonGenerator_outputBuffer2 = writerBasedJsonGenerator._outputBuffer[2];
        char finalWriterBasedJsonGenerator_outputBuffer3 = writerBasedJsonGenerator._outputBuffer[3];
        int finalWriterBasedJsonGenerator_outputTail = writerBasedJsonGenerator._outputTail;
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        boolean finalWriterBasedJsonGenerator_writeContext_gotName = ((Boolean) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        JsonWriteContext writerBasedJsonGenerator_writeContext1 = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(',', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer2);
        
        assertEquals('\"', finalWriterBasedJsonGenerator_outputBuffer3);
        
        assertEquals(4, finalWriterBasedJsonGenerator_outputTail);
        
        assertTrue(finalWriterBasedJsonGenerator_writeContext_gotName);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeStringField(java.lang.String, java.lang.String)
    /// Actual number of generated tests (106) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test
    public void testWriteStringField9() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 1;
        writerBasedJsonGenerator._outputEnd = 44;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 44, length 1]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeLongString(WriterBasedJsonGenerator.java:983)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:910)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:146)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField10() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 10;
        writerBasedJsonGenerator._outputTail = 8;
        writerBasedJsonGenerator._outputEnd = 44;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        _writeContext._currentName = _currentName;
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 44, length 15]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeLongString(WriterBasedJsonGenerator.java:983)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:910)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:146)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField11() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 1073741826;
        writerBasedJsonGenerator._outputEnd = 1;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        _writeContext._currentName = _currentName;
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.StringIndexOutOfBoundsException: offset 1, count 1, length 1]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:919)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField12() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        StringWriter _writer = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        writerBasedJsonGenerator._outputHead = -2;
        writerBasedJsonGenerator._outputTail = -1;
        writerBasedJsonGenerator._outputEnd = 1;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.io.StringWriter.write(StringWriter.java:95)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeLongString(WriterBasedJsonGenerator.java:974)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:910)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField13() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[21];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 2;
        writerBasedJsonGenerator._outputTail = 2;
        writerBasedJsonGenerator._outputEnd = 32;
        int[] _outputEscapes = {0};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.StringIndexOutOfBoundsException: offset 2, count 31, length 21]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:919)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField14() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 1;
        writerBasedJsonGenerator._outputEnd = 1073741824;
        int[] _outputEscapes = new int[40];
        _outputEscapes[0] = 1;
        _outputEscapes[1] = 41;
        _outputEscapes[2] = 41;
        _outputEscapes[3] = 41;
        _outputEscapes[4] = 41;
        _outputEscapes[5] = 41;
        _outputEscapes[6] = 41;
        _outputEscapes[7] = 41;
        _outputEscapes[8] = 41;
        _outputEscapes[9] = 41;
        _outputEscapes[10] = 41;
        _outputEscapes[11] = 41;
        _outputEscapes[12] = 41;
        _outputEscapes[13] = 41;
        _outputEscapes[14] = 41;
        _outputEscapes[15] = 41;
        _outputEscapes[16] = 41;
        _outputEscapes[17] = 41;
        _outputEscapes[18] = 41;
        _outputEscapes[19] = 41;
        _outputEscapes[20] = 41;
        _outputEscapes[21] = 41;
        _outputEscapes[22] = 41;
        _outputEscapes[23] = 41;
        _outputEscapes[24] = 41;
        _outputEscapes[25] = 41;
        _outputEscapes[26] = 41;
        _outputEscapes[27] = 41;
        _outputEscapes[28] = 41;
        _outputEscapes[29] = 41;
        _outputEscapes[30] = 41;
        _outputEscapes[31] = 41;
        _outputEscapes[32] = 41;
        _outputEscapes[33] = 41;
        _outputEscapes[34] = 41;
        _outputEscapes[35] = 41;
        _outputEscapes[36] = 41;
        _outputEscapes[37] = 41;
        _outputEscapes[38] = 41;
        _outputEscapes[39] = 41;
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._maximumNonEscapedChar = 40;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        _writeContext._currentName = _currentName;
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeString(WriterBasedJsonGenerator.java:329)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:195) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField15() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        char[] _entityBuffer = {};
        writerBasedJsonGenerator._entityBuffer = _entityBuffer;
        int[] _outputEscapes = new int[32];
        _outputEscapes[31] = -1;
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u001F";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 0]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._prependOrWriteCharacterEscape(WriterBasedJsonGenerator.java:1690)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(WriterBasedJsonGenerator.java:963)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:926)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField16() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 4;
        writerBasedJsonGenerator._outputTail = 3;
        writerBasedJsonGenerator._outputEnd = 8;
        char[] _entityBuffer = {'\u0000', '\u0000'};
        writerBasedJsonGenerator._entityBuffer = _entityBuffer;
        int[] _outputEscapes = {-1};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        _writeContext._currentName = _currentName;
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._prependOrWriteCharacterEscape(WriterBasedJsonGenerator.java:1690)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(WriterBasedJsonGenerator.java:963)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:926)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField17() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[19];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 2;
        writerBasedJsonGenerator._outputTail = 1;
        writerBasedJsonGenerator._outputEnd = 10;
        char[] _entityBuffer = {'\u0000', '\u0000'};
        writerBasedJsonGenerator._entityBuffer = _entityBuffer;
        int[] _outputEscapes = new int[38];
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._maximumNonEscapedChar = -2;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\uFF7F\uFF7F\uFF7F\uFF7F\uFF7F\uFF7F\uFF7F\uFF7F";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._prependOrWriteCharacterEscape(WriterBasedJsonGenerator.java:1684)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(WriterBasedJsonGenerator.java:1147)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:924)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField18() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(_writer, "java.io.Writer", "lock", lock);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[31];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 16;
        writerBasedJsonGenerator._outputTail = 16;
        writerBasedJsonGenerator._outputEnd = 1073741826;
        int[] _outputEscapes = new int[40];
        _outputEscapes[0] = 1;
        _outputEscapes[1] = 74;
        _outputEscapes[2] = 74;
        _outputEscapes[3] = 74;
        _outputEscapes[4] = 74;
        _outputEscapes[5] = 74;
        _outputEscapes[6] = 74;
        _outputEscapes[7] = 74;
        _outputEscapes[8] = 74;
        _outputEscapes[9] = 74;
        _outputEscapes[10] = 74;
        _outputEscapes[11] = 74;
        _outputEscapes[12] = 74;
        _outputEscapes[13] = 74;
        _outputEscapes[14] = 74;
        _outputEscapes[15] = 74;
        _outputEscapes[16] = 74;
        _outputEscapes[17] = 74;
        _outputEscapes[18] = 74;
        _outputEscapes[19] = 74;
        _outputEscapes[20] = 74;
        _outputEscapes[21] = 74;
        _outputEscapes[22] = 74;
        _outputEscapes[23] = 74;
        _outputEscapes[24] = 74;
        _outputEscapes[25] = 74;
        _outputEscapes[26] = 74;
        _outputEscapes[27] = 74;
        _outputEscapes[28] = 74;
        _outputEscapes[29] = 74;
        _outputEscapes[30] = 74;
        _outputEscapes[31] = 74;
        _outputEscapes[32] = 74;
        _outputEscapes[33] = 74;
        _outputEscapes[34] = 74;
        _outputEscapes[35] = 74;
        _outputEscapes[36] = 74;
        _outputEscapes[37] = 74;
        _outputEscapes[38] = 74;
        _outputEscapes[39] = 74;
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._maximumNonEscapedChar = 40;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 31 out of bounds for length 31]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:151)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField19() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        writerBasedJsonGenerator._outputHead = -1;
        writerBasedJsonGenerator._outputTail = -1;
        writerBasedJsonGenerator._outputEnd = 1;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeLongString(WriterBasedJsonGenerator.java:983)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:910)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField20() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 2;
        writerBasedJsonGenerator._outputEnd = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeSegment(WriterBasedJsonGenerator.java:1007)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeLongString(WriterBasedJsonGenerator.java:989)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:910)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:146)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField21() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 7;
        writerBasedJsonGenerator._outputEnd = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeSegment(WriterBasedJsonGenerator.java:1007)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeLongString(WriterBasedJsonGenerator.java:989)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:910)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:146)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField22() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        BufferedWriter _writer = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:170)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeLongString(WriterBasedJsonGenerator.java:974)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:910)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:146)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField23() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        StringWriter _writer = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:99)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeLongString(WriterBasedJsonGenerator.java:974)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:910)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField24() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        BufferedWriter _writer = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:170)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeLongString(WriterBasedJsonGenerator.java:974)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:910)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField25() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        OutputStreamWriter _writer = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:205)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeLongString(WriterBasedJsonGenerator.java:974)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:910)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField26() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        writerBasedJsonGenerator._maximumNonEscapedChar = 8;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(WriterBasedJsonGenerator.java:1119)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:924)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField27() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        StringWriter _writer = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        _writeContext._dups = _dups;
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:99)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeLongString(WriterBasedJsonGenerator.java:974)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:910)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:146)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField28() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(_writer, "java.io.PrintWriter", "out", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeLongString(WriterBasedJsonGenerator.java:974)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:910)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:146)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField29() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        setField(_writer, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(_writer, "java.io.Writer", "lock", lock);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[30];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 22;
        writerBasedJsonGenerator._outputTail = 22;
        writerBasedJsonGenerator._outputEnd = -2147483618;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:205)
            java.base/java.io.PrintWriter.write(PrintWriter.java:506)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeLongString(WriterBasedJsonGenerator.java:974)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:910)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:146)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField30() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 2;
        writerBasedJsonGenerator._outputTail = 2;
        writerBasedJsonGenerator._outputEnd = 8;
        int[] _outputEscapes = new int[40];
        _outputEscapes[1] = 41;
        _outputEscapes[2] = 41;
        _outputEscapes[3] = 41;
        _outputEscapes[4] = 41;
        _outputEscapes[5] = 41;
        _outputEscapes[6] = 41;
        _outputEscapes[7] = 41;
        _outputEscapes[8] = 41;
        _outputEscapes[9] = 41;
        _outputEscapes[10] = 41;
        _outputEscapes[11] = 41;
        _outputEscapes[12] = 41;
        _outputEscapes[13] = 41;
        _outputEscapes[14] = 41;
        _outputEscapes[15] = 41;
        _outputEscapes[16] = 41;
        _outputEscapes[17] = 41;
        _outputEscapes[18] = 41;
        _outputEscapes[19] = 41;
        _outputEscapes[20] = 41;
        _outputEscapes[21] = 41;
        _outputEscapes[22] = 41;
        _outputEscapes[23] = 41;
        _outputEscapes[24] = 41;
        _outputEscapes[25] = 41;
        _outputEscapes[26] = 41;
        _outputEscapes[27] = 41;
        _outputEscapes[28] = 41;
        _outputEscapes[29] = 41;
        _outputEscapes[30] = 41;
        _outputEscapes[31] = 41;
        _outputEscapes[32] = 41;
        _outputEscapes[33] = 41;
        _outputEscapes[34] = 41;
        _outputEscapes[35] = 41;
        _outputEscapes[36] = 41;
        _outputEscapes[37] = 41;
        _outputEscapes[38] = 41;
        _outputEscapes[39] = 41;
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._maximumNonEscapedChar = 40;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        _writeContext._currentName = _currentName;
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeString(WriterBasedJsonGenerator.java:327)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:195) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField31() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 4;
        writerBasedJsonGenerator._outputTail = 2;
        writerBasedJsonGenerator._outputEnd = 1073741824;
        int[] _outputEscapes = {1};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0001\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(WriterBasedJsonGenerator.java:957)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:926)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeString(WriterBasedJsonGenerator.java:330)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:195) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField32() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 9;
        writerBasedJsonGenerator._outputTail = 9;
        writerBasedJsonGenerator._outputEnd = 10;
        int[] _outputEscapes = {-1};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeString(WriterBasedJsonGenerator.java:327)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:195) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField33() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputTail = 12;
        writerBasedJsonGenerator._outputEnd = 15;
        int[] _outputEscapes = new int[15];
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._maximumNonEscapedChar = Integer.MAX_VALUE;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeString(WriterBasedJsonGenerator.java:327)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:195) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField34() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 1;
        writerBasedJsonGenerator._outputEnd = 1073741824;
        int[] _outputEscapes = new int[40];
        _outputEscapes[0] = 1;
        _outputEscapes[1] = 74;
        _outputEscapes[2] = 74;
        _outputEscapes[3] = 74;
        _outputEscapes[4] = 74;
        _outputEscapes[5] = 74;
        _outputEscapes[6] = 74;
        _outputEscapes[7] = 74;
        _outputEscapes[8] = 74;
        _outputEscapes[9] = 74;
        _outputEscapes[10] = 74;
        _outputEscapes[11] = 74;
        _outputEscapes[12] = 74;
        _outputEscapes[13] = 74;
        _outputEscapes[14] = 74;
        _outputEscapes[15] = 74;
        _outputEscapes[16] = 74;
        _outputEscapes[17] = 74;
        _outputEscapes[18] = 74;
        _outputEscapes[19] = 74;
        _outputEscapes[20] = 74;
        _outputEscapes[21] = 74;
        _outputEscapes[22] = 74;
        _outputEscapes[23] = 74;
        _outputEscapes[24] = 74;
        _outputEscapes[25] = 74;
        _outputEscapes[26] = 74;
        _outputEscapes[27] = 74;
        _outputEscapes[28] = 74;
        _outputEscapes[29] = 74;
        _outputEscapes[30] = 74;
        _outputEscapes[31] = 74;
        _outputEscapes[32] = 74;
        _outputEscapes[33] = 74;
        _outputEscapes[34] = 74;
        _outputEscapes[35] = 74;
        _outputEscapes[36] = 74;
        _outputEscapes[37] = 74;
        _outputEscapes[38] = 74;
        _outputEscapes[39] = 74;
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._maximumNonEscapedChar = 40;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(WriterBasedJsonGenerator.java:1144)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:924)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeString(WriterBasedJsonGenerator.java:330)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:195) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField35() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        int[] _outputEscapes = {67108864};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._prependOrWriteCharacterEscape(WriterBasedJsonGenerator.java:1651)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(WriterBasedJsonGenerator.java:963)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:926)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField36() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(_writer, "java.io.PrintWriter", "out", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeLongString(WriterBasedJsonGenerator.java:974)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:910)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField37() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputTail = 13;
        writerBasedJsonGenerator._outputEnd = 15;
        int[] _outputEscapes = {0};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeString(WriterBasedJsonGenerator.java:327)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:195) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField38() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 2;
        int[] _outputEscapes = {};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._maximumNonEscapedChar = 1;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeString(WriterBasedJsonGenerator.java:327)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:195) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField39() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[16];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 2;
        int[] _outputEscapes = {};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeString(WriterBasedJsonGenerator.java:333)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:195) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField40() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 10;
        writerBasedJsonGenerator._outputTail = 9;
        writerBasedJsonGenerator._outputEnd = 524296;
        int[] _outputEscapes = {-2147483582, -2147483582, -2147483582, -2147483582, -1, -2147483582};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._maximumNonEscapedChar = 4;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0004";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(WriterBasedJsonGenerator.java:1144)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:924)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeString(WriterBasedJsonGenerator.java:330)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:195) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField41() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 3;
        writerBasedJsonGenerator._outputTail = 1;
        writerBasedJsonGenerator._outputEnd = 1073741825;
        int[] _outputEscapes = {1};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0001\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(WriterBasedJsonGenerator.java:957)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:926)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeString(WriterBasedJsonGenerator.java:330)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:195) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField42() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[39];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 35;
        writerBasedJsonGenerator._outputTail = 34;
        writerBasedJsonGenerator._outputEnd = 516;
        int[] _outputEscapes = {0};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._maximumNonEscapedChar = 1;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0100";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(WriterBasedJsonGenerator.java:1144)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:924)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeString(WriterBasedJsonGenerator.java:330)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:195) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField43() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[14];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 2;
        int[] _outputEscapes = {0, 0};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._maximumNonEscapedChar = 1;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0001";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeString(WriterBasedJsonGenerator.java:327)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:195) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField44() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        StringWriter _writer = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[31];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 18;
        writerBasedJsonGenerator._outputTail = 17;
        writerBasedJsonGenerator._outputEnd = 19;
        int[] _outputEscapes = {0};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        _writeContext._currentName = _currentName;
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:99)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:149)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField45() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(WriterBasedJsonGenerator.java:935)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:926)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:146)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField46() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[14];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 2147483646;
        writerBasedJsonGenerator._outputTail = 9;
        writerBasedJsonGenerator._outputEnd = 10;
        writerBasedJsonGenerator._maximumNonEscapedChar = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(WriterBasedJsonGenerator.java:1119)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:924)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:146)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField47() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        StringWriter _writer = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[40];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 30;
        writerBasedJsonGenerator._outputTail = 29;
        writerBasedJsonGenerator._outputEnd = 1073741825;
        int[] _outputEscapes = {1};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0001\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:99)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(WriterBasedJsonGenerator.java:957)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:926)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField48() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        BufferedWriter _writer = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[40];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 30;
        writerBasedJsonGenerator._outputTail = 29;
        writerBasedJsonGenerator._outputEnd = 1073741825;
        int[] _outputEscapes = {1};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0001\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:170)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(WriterBasedJsonGenerator.java:957)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:926)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField49() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        OutputStreamWriter _writer = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[40];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 30;
        writerBasedJsonGenerator._outputTail = 29;
        writerBasedJsonGenerator._outputEnd = 1073741825;
        int[] _outputEscapes = {1};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0001\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:205)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(WriterBasedJsonGenerator.java:957)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:926)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField50() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(WriterBasedJsonGenerator.java:935)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:926)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField51() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 5;
        writerBasedJsonGenerator._outputTail = 4;
        writerBasedJsonGenerator._outputEnd = 1073741830;
        int[] _outputEscapes = {1};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0001\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(WriterBasedJsonGenerator.java:957)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:926)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField52() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(_writer, "java.io.PrintWriter", "out", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 44;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        _writeContext._dups = _dups;
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1880)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeLongString(WriterBasedJsonGenerator.java:974)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:910)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:146)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField53() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        writerBasedJsonGenerator._outputHead = -1197473782;
        writerBasedJsonGenerator._outputTail = -1197473783;
        writerBasedJsonGenerator._outputEnd = -1197473782;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        _writeContext._dups = _dups;
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "\u0000\u0000";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_objectIndenter", _objectIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:478)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.util.DefaultIndenter.writeIndentation(DefaultIndenter.java:87)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeObjectEntries(DefaultPrettyPrinter.java:267)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writePPFieldName(WriterBasedJsonGenerator.java:270)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:128)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(eol, eol);
    }
    
    @Test
    public void testWriteStringField54() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(_writer, "java.io.Writer", "lock", lock);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        writerBasedJsonGenerator._outputHead = -613155906;
        writerBasedJsonGenerator._outputTail = 297477249;
        writerBasedJsonGenerator._outputEnd = 297477256;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:919)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField55() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        int[] _outputEscapes = {-1};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._prependOrWriteCharacterEscape(WriterBasedJsonGenerator.java:1692)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(WriterBasedJsonGenerator.java:963)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:926)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField56() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        int[] _outputEscapes = {-2};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._prependOrWriteCharacterEscape(WriterBasedJsonGenerator.java:1699)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(WriterBasedJsonGenerator.java:963)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:926)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField57() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputEnd = 1;
        SerializedString _currentEscape = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_currentEscape", _currentEscape);
        int[] _outputEscapes = {-2};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._prependOrWriteCharacterEscape(WriterBasedJsonGenerator.java:1704)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(WriterBasedJsonGenerator.java:963)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:926)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    
    @Test
    public void testWriteStringField58() throws Exception  {
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[33];
        writerBasedJsonGenerator._outputBuffer = _outputBuffer;
        writerBasedJsonGenerator._outputHead = 1;
        writerBasedJsonGenerator._outputTail = 1;
        writerBasedJsonGenerator._outputEnd = 5;
        int[] _outputEscapes = {1};
        writerBasedJsonGenerator._outputEscapes = _outputEscapes;
        writerBasedJsonGenerator._cfgUnqNames = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        String string = "\u0001\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(WriterBasedJsonGenerator.java:957)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString(WriterBasedJsonGenerator.java:926)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeFieldName(WriterBasedJsonGenerator.java:140)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeFieldName(WriterBasedJsonGenerator.java:111)
            com.fasterxml.jackson.core.json.JsonGeneratorImpl.writeStringField(JsonGeneratorImpl.java:194) */
        writerBasedJsonGenerator.writeStringField(string, string);
    }
    ///endregion
    
    ///region Errors report for writeStringField
    
    public void testWriteStringField_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 97 occurrences of:
        // Concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1024925932953200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1024925932953200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1024925932958900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1024925932953200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1024925932958900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1024925933551100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1024925933551100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1024925933552500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1024925933551100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1024925933552500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1024925934283300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1024925934283300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1024925934285000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1024925934283300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1024925934285000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1024925935116900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1024925935116900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1024925935118200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1024925935116900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1024925935118200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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

