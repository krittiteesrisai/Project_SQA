package com.fasterxml.jackson.core.util;

import org.junit.Test;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import sun.security.util.DerOutputStream;
import java.io.FileWriter;
import sun.nio.cs.StreamEncoder;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileDescriptor;
import java.io.ObjectOutputStream;
import java.nio.ReadOnlyBufferException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_core_util_DefaultPrettyPrinterTest {
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.createInstance
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createInstance()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#createInstance()}
     */
    @Test
    public void testCreateInstance() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter.createInstance();
        
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = " ";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        DefaultPrettyPrinter expected = new DefaultPrettyPrinter(null, serializedString);
        DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        expected._arrayIndenter = _arrayIndenter;
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
        expected._objectIndenter = _objectIndenter;
        expected._spacesInObjectEntries = true;
        expected._nesting = 0;
        Separators _separators = new Separators(':', ',', ',');
        expected._separators = _separators;
        String _objectFieldValueSeparatorWithSpaces = " : ";
        expected._objectFieldValueSeparatorWithSpaces = _objectFieldValueSeparatorWithSpaces;
        
        DefaultPrettyPrinter.Indenter expected_arrayIndenter = expected._arrayIndenter;
        DefaultPrettyPrinter.Indenter actual_arrayIndenter = actual._arrayIndenter;
        
        DefaultPrettyPrinter.Indenter expected_objectIndenter = expected._objectIndenter;
        DefaultPrettyPrinter.Indenter actual_objectIndenter = actual._objectIndenter;
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
        
        SerializableString expected_rootSeparator = expected._rootSeparator;
        SerializableString actual_rootSeparator = actual._rootSeparator;
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
        
        boolean actual_spacesInObjectEntries = actual._spacesInObjectEntries;
        assertTrue(actual_spacesInObjectEntries);
        
        int expected_nesting = expected._nesting;
        int actual_nesting = actual._nesting;
        assertEquals(expected_nesting, actual_nesting);
        
        Separators expected_separators = expected._separators;
        Separators actual_separators = actual._separators;
        char expected_separatorsObjectFieldValueSeparator = expected_separators.getObjectFieldValueSeparator();
        char actual_separatorsObjectFieldValueSeparator = actual_separators.getObjectFieldValueSeparator();
        assertEquals(expected_separatorsObjectFieldValueSeparator, actual_separatorsObjectFieldValueSeparator);
        
        char expected_separatorsObjectEntrySeparator = expected_separators.getObjectEntrySeparator();
        char actual_separatorsObjectEntrySeparator = actual_separators.getObjectEntrySeparator();
        assertEquals(expected_separatorsObjectEntrySeparator, actual_separatorsObjectEntrySeparator);
        
        char expected_separatorsArrayValueSeparator = expected_separators.getArrayValueSeparator();
        char actual_separatorsArrayValueSeparator = actual_separators.getArrayValueSeparator();
        assertEquals(expected_separatorsArrayValueSeparator, actual_separatorsArrayValueSeparator);
        
        String expected_objectFieldValueSeparatorWithSpaces = expected._objectFieldValueSeparatorWithSpaces;
        String actual_objectFieldValueSeparatorWithSpaces = actual._objectFieldValueSeparatorWithSpaces;
        assertEquals(expected_objectFieldValueSeparatorWithSpaces, actual_objectFieldValueSeparatorWithSpaces);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeEndObject(com.fasterxml.jackson.core.JsonGenerator, int)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter#isInline()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeRaw(char)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeRaw(char)}
 *  */
    @Test
    public void testWriteEndObject_NrOfEntriesLessOrEqualZero() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeEndObject(writerBasedJsonGenerator, 0);
        
        int finalDefaultPrettyPrinter_nesting = defaultPrettyPrinter._nesting;
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(-256, finalDefaultPrettyPrinter_nesting);
        
        assertEquals(' ', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals('}', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals(2, finalWriterBasedJsonGenerator_outputTail);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeEndObject(com.fasterxml.jackson.core.JsonGenerator, int)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndObject_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeEndObject(writerBasedJsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndObject_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeEndObject(writerBasedJsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndObject_ThrowIndexOutOfBoundsException_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2147483645);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483647);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeEndObject(uTF8JsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndObject_ThrowIndexOutOfBoundsException_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeEndObject(writerBasedJsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndObject_ThrowIndexOutOfBoundsException_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeEndObject(uTF8JsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw('}');
 *  */
    @Test
    public void testWriteEndObject_ThrowIndexOutOfBoundsException_5() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeEndObject(writerBasedJsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter#writeIndentation(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw('}');
 *  */
    @Test
    public void testWriteEndObject_ThrowIndexOutOfBoundsException_6() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "\u0000";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 536870912);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741825);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeEndObject(writerBasedJsonGenerator, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndObject_ThrowIndexOutOfBoundsException_7() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeEndObject(writerBasedJsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_objectIndenter.isInline()
 *  */
    @Test
    public void testWriteEndObject_ThrowNullPointerException() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._objectIndenter = null;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeEndObject(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndObject_ThrowNullPointerException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeEndObject(null, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndObject_ThrowNullPointerException_2() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultPrettyPrinter.FixedSpaceIndenter _objectIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeEndObject(null, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeEndObject(com.fasterxml.jackson.core.JsonGenerator, int)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteEndObject_ThrowIndexOutOfBoundsException_8() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ByteArrayOutputStream _outputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0};
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(_outputStream, "java.io.ByteArrayOutputStream", "count", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 5);
        
        defaultPrettyPrinter.writeEndObject(uTF8JsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteEndObject_ThrowIndexOutOfBoundsException_9() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        DerOutputStream _outputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(_outputStream, "java.io.ByteArrayOutputStream", "count", -4);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = new byte[14];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 14);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 17);
        
        defaultPrettyPrinter.writeEndObject(uTF8JsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteEndObject_ThrowIndexOutOfBoundsException_10() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = {};
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", -1610612735);
        String eol = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 2;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -7);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 6);
        
        defaultPrettyPrinter.writeEndObject(writerBasedJsonGenerator, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} 
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testWriteEndObject_ThrowStringIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", Integer.MAX_VALUE);
        
        defaultPrettyPrinter.writeEndObject(writerBasedJsonGenerator, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteEndObject_ThrowIndexOutOfBoundsException_11() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        FileWriter _writer = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(_writer, "java.io.OutputStreamWriter", "se", se);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", Integer.MIN_VALUE);
        
        defaultPrettyPrinter.writeEndObject(writerBasedJsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteEndObject_ThrowIndexOutOfBoundsException_12() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        FileWriter _writer = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(_writer, "java.io.OutputStreamWriter", "se", se);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1);
        
        defaultPrettyPrinter.writeEndObject(writerBasedJsonGenerator, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWriteEndObject_ThrowNullPointerException_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[29];
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 30);
        String eol = "";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 2;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -131074);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 131073);
        
        defaultPrettyPrinter.writeEndObject(writerBasedJsonGenerator, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWriteEndObject_ThrowNullPointerException_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[29];
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 30);
        String eol = "";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 2;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483637);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483637);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483638);
        
        defaultPrettyPrinter.writeEndObject(writerBasedJsonGenerator, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfEntries > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWriteEndObject_ThrowNullPointerException_5() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = {};
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 1);
        String eol = "";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 2;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2147483640);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2147483640);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483640);
        
        defaultPrettyPrinter.writeEndObject(writerBasedJsonGenerator, 1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method writeEndObject(com.fasterxml.jackson.core.JsonGenerator, int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
     */
    @Test
    public void testWriteEndObjectThrowsNPE() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        JsonGeneratorDelegate jsonGeneratorDelegate = new JsonGeneratorDelegate(null, true);
        JsonGeneratorDelegate jsonGeneratorDelegate1 = new JsonGeneratorDelegate(jsonGeneratorDelegate, true);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:274)
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:274)
            com.fasterxml.jackson.core.util.DefaultIndenter.writeIndentation(DefaultIndenter.java:87)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject(DefaultPrettyPrinter.java:329) */
        defaultPrettyPrinter.writeEndObject(jsonGeneratorDelegate1, 1073741825);
    }
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndObject(com.fasterxml.jackson.core.JsonGenerator,int)}
     */
    @Test
    public void testWriteEndObjectThrowsNPE1() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        JsonGeneratorDelegate jsonGeneratorDelegate = new JsonGeneratorDelegate(null, true);
        JsonGeneratorDelegate jsonGeneratorDelegate1 = new JsonGeneratorDelegate(jsonGeneratorDelegate, true);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndObject(DefaultPrettyPrinter.java:331) */
        defaultPrettyPrinter.writeEndObject(jsonGeneratorDelegate1, -1073741823);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeArrayValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testBeforeArrayValues() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483646);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        
        defaultPrettyPrinter.beforeArrayValues(writerBasedJsonGenerator);
        
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(Integer.MAX_VALUE, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testBeforeArrayValues_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1610612736);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1610612736);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -1610612736);
        
        defaultPrettyPrinter.beforeArrayValues(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testBeforeArrayValues_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = {'\u0000', '\u0000'};
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 2);
        String eol = "\u0000\u0000\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 2);
        
        defaultPrettyPrinter.beforeArrayValues(writerBasedJsonGenerator);
        
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(3, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testBeforeArrayValues_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 0;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 3);
        char[] _charBuffer = {'\u0000'};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer", _charBuffer);
        
        defaultPrettyPrinter.beforeArrayValues(uTF8JsonGenerator);
        
        byte[] uTF8JsonGenerator_outputBuffer = ((byte[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        byte finalUTF8JsonGenerator_outputBuffer0 = ((Byte) get(uTF8JsonGenerator_outputBuffer, 0));
        int finalUTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        char[] uTF8JsonGenerator_charBuffer = ((char[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
        char finalUTF8JsonGenerator_charBuffer0 = ((Character) get(uTF8JsonGenerator_charBuffer, 0));
        
        assertEquals(java.lang.Byte.MAX_VALUE, finalUTF8JsonGenerator_outputBuffer0);
        
        assertEquals(1, finalUTF8JsonGenerator_outputTail);
        
        assertEquals('', finalUTF8JsonGenerator_charBuffer0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testBeforeArrayValues_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 0;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -1);
        char[] _charBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer", _charBuffer);
        
        defaultPrettyPrinter.beforeArrayValues(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testBeforeArrayValues_5() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[32];
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 32);
        String eol = "\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(_writer, "java.io.Writer", "lock", lock);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.beforeArrayValues(writerBasedJsonGenerator);
        
        Writer writerBasedJsonGenerator_writer = ((Writer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
        boolean finalWriterBasedJsonGenerator_writerTrouble = ((Boolean) getFieldValue(writerBasedJsonGenerator_writer, "java.io.PrintWriter", "trouble"));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertTrue(finalWriterBasedJsonGenerator_writerTrouble);
        
        assertEquals(-1, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testBeforeArrayValues_6() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1);
        
        defaultPrettyPrinter.beforeArrayValues(writerBasedJsonGenerator);
        
        Writer writerBasedJsonGenerator_writer = ((Writer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
        boolean finalWriterBasedJsonGenerator_writerTrouble = ((Boolean) getFieldValue(writerBasedJsonGenerator_writer, "java.io.PrintWriter", "trouble"));
        int finalWriterBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
        
        assertTrue(finalWriterBasedJsonGenerator_writerTrouble);
        
        assertEquals(0, finalWriterBasedJsonGenerator_outputHead);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter#writeIndentation(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _arrayIndenter.writeIndentation(g, _nesting);
 *  */
    @Test
    public void testBeforeArrayValues_ThrowNullPointerException() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._arrayIndenter = null;
        defaultPrettyPrinter._nesting = -255;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeArrayValues] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.beforeArrayValues(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: _arrayIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testBeforeArrayValues_ThrowStringIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", Integer.MAX_VALUE);
        
        defaultPrettyPrinter.beforeArrayValues(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _arrayIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testBeforeArrayValues_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[33];
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 27);
        String eol = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1669070865);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -1669070829);
        
        defaultPrettyPrinter.beforeArrayValues(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _arrayIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testBeforeArrayValues_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[31];
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 32);
        String eol = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -28);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 27);
        
        defaultPrettyPrinter.beforeArrayValues(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _arrayIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testBeforeArrayValues_ThrowIndexOutOfBoundsException_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[32];
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 33);
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        OutputStreamWriter _writer = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(_writer, "java.io.OutputStreamWriter", "se", se);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741823);
        
        defaultPrettyPrinter.beforeArrayValues(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testBeforeArrayValues_ThrowIndexOutOfBoundsException_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.beforeArrayValues(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _arrayIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = NullPointerException.class)
    public void testBeforeArrayValues_ThrowNullPointerException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[33];
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 2);
        String eol = "\u0000\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1058286599);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483646);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        
        defaultPrettyPrinter.beforeArrayValues(writerBasedJsonGenerator);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeArrayValues(com.fasterxml.jackson.core.JsonGenerator)}
     */
    @Test
    public void testBeforeArrayValuesThrowsNPE() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        JsonGeneratorDelegate jsonGeneratorDelegate = new JsonGeneratorDelegate(null, true);
        JsonGeneratorDelegate jsonGeneratorDelegate1 = new JsonGeneratorDelegate(jsonGeneratorDelegate, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeArrayValues] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter.writeIndentation(DefaultPrettyPrinter.java:413)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeArrayValues(DefaultPrettyPrinter.java:347) */
        defaultPrettyPrinter.beforeArrayValues(jsonGeneratorDelegate1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeEndArray(com.fasterxml.jackson.core.JsonGenerator, int)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeRaw(char)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeRaw(char)}
 *  */
    @Test
    public void testWriteEndArray_NrOfValuesLessOrEqualZero() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 0);
        
        int finalDefaultPrettyPrinter_nesting = defaultPrettyPrinter._nesting;
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(-256, finalDefaultPrettyPrinter_nesting);
        
        assertEquals(' ', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(']', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals(2, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter#writeIndentation(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter#writeIndentation(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeRaw(char)}
 *  */
    @Test
    public void testWriteEndArray_NrOfValuesGreaterThanZero() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[32];
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 32);
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 2;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[33];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 24);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 24);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 69);
        
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 1);
        
        int finalDefaultPrettyPrinter_nesting = defaultPrettyPrinter._nesting;
        
        Writer writerBasedJsonGenerator_writer = ((Writer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
        boolean finalWriterBasedJsonGenerator_writerTrouble = ((Boolean) getFieldValue(writerBasedJsonGenerator_writer, "java.io.PrintWriter", "trouble"));
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer24 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 24));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(1, finalDefaultPrettyPrinter_nesting);
        
        assertTrue(finalWriterBasedJsonGenerator_writerTrouble);
        
        assertEquals(']', finalWriterBasedJsonGenerator_outputBuffer24);
        
        assertEquals(25, finalWriterBasedJsonGenerator_outputTail);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeEndArray(com.fasterxml.jackson.core.JsonGenerator, int)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndArray_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndArray_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndArray_ThrowIndexOutOfBoundsException_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2147483645);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483647);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeEndArray(uTF8JsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndArray_ThrowIndexOutOfBoundsException_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndArray_ThrowIndexOutOfBoundsException_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeEndArray(uTF8JsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(']');
 *  */
    @Test
    public void testWriteEndArray_ThrowIndexOutOfBoundsException_5() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(']');
 *  */
    @Test
    public void testWriteEndArray_ThrowIndexOutOfBoundsException_6() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 536870912);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741825);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(']');
 *  */
    @Test
    public void testWriteEndArray_ThrowIndexOutOfBoundsException_7() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[14];
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 14);
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 2;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2147483634);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483634);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", Integer.MAX_VALUE);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndArray_ThrowIndexOutOfBoundsException_8() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndArray_ThrowIndexOutOfBoundsException_9() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_arrayIndenter.isInline()
 *  */
    @Test
    public void testWriteEndArray_ThrowNullPointerException() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._arrayIndenter = null;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeEndArray(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndArray_ThrowNullPointerException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeEndArray(null, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw(' ');
 *  */
    @Test
    public void testWriteEndArray_ThrowNullPointerException_2() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeEndArray(null, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeEndArray(com.fasterxml.jackson.core.JsonGenerator, int)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteEndArray_ThrowIndexOutOfBoundsException_10() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ByteArrayOutputStream _outputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0};
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(_outputStream, "java.io.ByteArrayOutputStream", "count", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 5);
        
        defaultPrettyPrinter.writeEndArray(uTF8JsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteEndArray_ThrowIndexOutOfBoundsException_11() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ByteArrayOutputStream _outputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(_outputStream, "java.io.ByteArrayOutputStream", "count", -2);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 10);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 13);
        
        defaultPrettyPrinter.writeEndArray(uTF8JsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _arrayIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteEndArray_ThrowIndexOutOfBoundsException_12() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = {};
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", -1610612735);
        String eol = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 2;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -15);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 14);
        
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _arrayIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteEndArray_ThrowIndexOutOfBoundsException_13() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[31];
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 32);
        String eol = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 2;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2147483645);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483614);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483615);
        
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} 
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testWriteEndArray_ThrowStringIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", Integer.MAX_VALUE);
        
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteEndArray_ThrowIndexOutOfBoundsException_14() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        FileWriter _writer = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(_writer, "java.io.OutputStreamWriter", "se", se);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", Integer.MIN_VALUE);
        
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _arrayIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWriteEndArray_ThrowNullPointerException_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = {'\u0000'};
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 2);
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 2;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2113929214);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 2113929217);
        
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.executesCondition {@code (nrOfValues > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _arrayIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWriteEndArray_ThrowNullPointerException_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = {};
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 2;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2147483640);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2147483640);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483640);
        
        defaultPrettyPrinter.writeEndArray(writerBasedJsonGenerator, 1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method writeEndArray(com.fasterxml.jackson.core.JsonGenerator, int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
     */
    @Test
    public void testWriteEndArrayThrowsNPE() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        JsonGeneratorDelegate jsonGeneratorDelegate = new JsonGeneratorDelegate(null, true);
        JsonGeneratorDelegate jsonGeneratorDelegate1 = new JsonGeneratorDelegate(jsonGeneratorDelegate, true);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter.writeIndentation(DefaultPrettyPrinter.java:413)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray(DefaultPrettyPrinter.java:373) */
        defaultPrettyPrinter.writeEndArray(jsonGeneratorDelegate1, 1073741825);
    }
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeEndArray(com.fasterxml.jackson.core.JsonGenerator,int)}
     */
    @Test
    public void testWriteEndArrayThrowsNPE1() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        JsonGeneratorDelegate jsonGeneratorDelegate = new JsonGeneratorDelegate(null, true);
        JsonGeneratorDelegate jsonGeneratorDelegate1 = new JsonGeneratorDelegate(jsonGeneratorDelegate, true);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeEndArray(DefaultPrettyPrinter.java:375) */
        defaultPrettyPrinter.writeEndArray(jsonGeneratorDelegate1, -1073741823);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method writeStartArray(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteStartArray() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeStartArray(writerBasedJsonGenerator);
        
        int finalDefaultPrettyPrinter_nesting = defaultPrettyPrinter._nesting;
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(-254, finalDefaultPrettyPrinter_nesting);
        
        assertEquals('[', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteStartArray_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 2;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeStartArray(writerBasedJsonGenerator);
        
        int finalDefaultPrettyPrinter_nesting = defaultPrettyPrinter._nesting;
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 1));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(3, finalDefaultPrettyPrinter_nesting);
        
        assertEquals('[', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals(2, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteStartArray_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2147483647);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        
        defaultPrettyPrinter.writeStartArray(writerBasedJsonGenerator);
        
        int finalDefaultPrettyPrinter_nesting = defaultPrettyPrinter._nesting;
        
        Writer writerBasedJsonGenerator_writer = ((Writer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
        boolean finalWriterBasedJsonGenerator_writerTrouble = ((Boolean) getFieldValue(writerBasedJsonGenerator_writer, "java.io.PrintWriter", "trouble"));
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(2, finalDefaultPrettyPrinter_nesting);
        
        assertTrue(finalWriterBasedJsonGenerator_writerTrouble);
        
        assertEquals('[', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(0, finalWriterBasedJsonGenerator_outputHead);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteStartArray_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 58769408);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 58769409);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 58769409);
        
        defaultPrettyPrinter.writeStartArray(writerBasedJsonGenerator);
        
        int finalDefaultPrettyPrinter_nesting = defaultPrettyPrinter._nesting;
        
        Writer writerBasedJsonGenerator_writer = ((Writer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
        Writer writerBasedJsonGenerator_writer_writerOut = ((Writer) getFieldValue(writerBasedJsonGenerator_writer, "java.io.PrintWriter", "out"));
        boolean finalWriterBasedJsonGenerator_writerOutTrouble = ((Boolean) getFieldValue(writerBasedJsonGenerator_writer_writerOut, "java.io.PrintWriter", "trouble"));
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(2, finalDefaultPrettyPrinter_nesting);
        
        assertTrue(finalWriterBasedJsonGenerator_writerOutTrouble);
        
        assertEquals('[', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(0, finalWriterBasedJsonGenerator_outputHead);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method writeStartArray(com.fasterxml.jackson.core.JsonGenerator)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link com.fasterxml.jackson.core.JsonGenerator#writeRaw(char)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteStartArray_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        defaultPrettyPrinter.writeStartArray(uTF8JsonGenerator);
        
        int finalDefaultPrettyPrinter_nesting = defaultPrettyPrinter._nesting;
        
        byte[] uTF8JsonGenerator_outputBuffer = ((byte[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        byte finalUTF8JsonGenerator_outputBuffer0 = ((Byte) get(uTF8JsonGenerator_outputBuffer, 0));
        int finalUTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        
        assertEquals(-254, finalDefaultPrettyPrinter_nesting);
        
        assertEquals((byte) 91, finalUTF8JsonGenerator_outputBuffer0);
        
        assertEquals(1, finalUTF8JsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteStartArray_5() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ByteArrayOutputStream _outputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", buf);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 5);
        
        defaultPrettyPrinter.writeStartArray(uTF8JsonGenerator);
        
        int finalDefaultPrettyPrinter_nesting = defaultPrettyPrinter._nesting;
        
        OutputStream uTF8JsonGenerator_outputStream = ((OutputStream) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
        byte[] uTF8JsonGenerator_outputStream_outputStreamBuf = ((byte[]) getFieldValue(uTF8JsonGenerator_outputStream, "java.io.ByteArrayOutputStream", "buf"));
        byte finalUTF8JsonGenerator_outputStreamBuf0 = ((Byte) get(uTF8JsonGenerator_outputStream_outputStreamBuf, 0));
        OutputStream uTF8JsonGenerator_outputStream1 = ((OutputStream) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
        int finalUTF8JsonGenerator_outputStreamCount = ((Integer) getFieldValue(uTF8JsonGenerator_outputStream1, "java.io.ByteArrayOutputStream", "count"));
        byte[] uTF8JsonGenerator_outputBuffer = ((byte[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        byte finalUTF8JsonGenerator_outputBuffer0 = ((Byte) get(uTF8JsonGenerator_outputBuffer, 0));
        int finalUTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        
        assertEquals(-254, finalDefaultPrettyPrinter_nesting);
        
        assertEquals((byte) 91, finalUTF8JsonGenerator_outputStreamBuf0);
        
        assertEquals(2, finalUTF8JsonGenerator_outputStreamCount);
        
        assertEquals((byte) 91, finalUTF8JsonGenerator_outputBuffer0);
        
        assertEquals(1, finalUTF8JsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteStartArray_6() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ByteArrayOutputStream _outputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0};
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 5);
        
        OutputStream uTF8JsonGenerator_outputStream = ((OutputStream) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
        byte[] initialUTF8JsonGenerator_outputStreamBuf = ((byte[]) getFieldValue(uTF8JsonGenerator_outputStream, "java.io.ByteArrayOutputStream", "buf"));
        
        defaultPrettyPrinter.writeStartArray(uTF8JsonGenerator);
        
        int finalDefaultPrettyPrinter_nesting = defaultPrettyPrinter._nesting;
        
        OutputStream uTF8JsonGenerator_outputStream1 = ((OutputStream) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
        byte[] finalUTF8JsonGenerator_outputStreamBuf = ((byte[]) getFieldValue(uTF8JsonGenerator_outputStream1, "java.io.ByteArrayOutputStream", "buf"));
        OutputStream uTF8JsonGenerator_outputStream2 = ((OutputStream) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream"));
        int finalUTF8JsonGenerator_outputStreamCount = ((Integer) getFieldValue(uTF8JsonGenerator_outputStream2, "java.io.ByteArrayOutputStream", "count"));
        byte[] uTF8JsonGenerator_outputBuffer = ((byte[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        byte finalUTF8JsonGenerator_outputBuffer0 = ((Byte) get(uTF8JsonGenerator_outputBuffer, 0));
        int finalUTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        
        assertEquals(-254, finalDefaultPrettyPrinter_nesting);
        
        assertFalse(initialUTF8JsonGenerator_outputStreamBuf == finalUTF8JsonGenerator_outputStreamBuf);
        
        assertEquals(2, finalUTF8JsonGenerator_outputStreamCount);
        
        assertEquals((byte) 91, finalUTF8JsonGenerator_outputBuffer0);
        
        assertEquals(1, finalUTF8JsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteStartArray_7() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 1;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        FileOutputStream _outputStream = ((FileOutputStream) createInstance("java.io.FileOutputStream"));
        FileDescriptor fd = ((FileDescriptor) createInstance("java.io.FileDescriptor"));
        setField(_outputStream, "java.io.FileOutputStream", "fd", fd);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        defaultPrettyPrinter.writeStartArray(uTF8JsonGenerator);
        
        int finalDefaultPrettyPrinter_nesting = defaultPrettyPrinter._nesting;
        
        byte[] uTF8JsonGenerator_outputBuffer = ((byte[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        byte finalUTF8JsonGenerator_outputBuffer0 = ((Byte) get(uTF8JsonGenerator_outputBuffer, 0));
        
        assertEquals(2, finalDefaultPrettyPrinter_nesting);
        
        assertEquals((byte) 91, finalUTF8JsonGenerator_outputBuffer0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeStartArray(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw('[');
 *  */
    @Test
    public void testWriteStartArray_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartArray] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeStartArray(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw('[');
 *  */
    @Test
    public void testWriteStartArray_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartArray] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeStartArray(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw('[');
 *  */
    @Test
    public void testWriteStartArray_ThrowIndexOutOfBoundsException_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -3);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartArray] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeStartArray(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw('[');
 *  */
    @Test
    public void testWriteStartArray_ThrowIndexOutOfBoundsException_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartArray] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeStartArray(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_arrayIndenter.isInline()
 *  */
    @Test
    public void testWriteStartArray_ThrowNullPointerException() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._arrayIndenter = null;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartArray] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeStartArray(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw('[');
 *  */
    @Test
    public void testWriteStartArray_ThrowNullPointerException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartArray] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeStartArray(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw('[');
 *  */
    @Test
    public void testWriteStartArray_ThrowNullPointerException_2() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartArray] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeStartArray(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeStartArray(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw('[');
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteStartArray_ThrowIndexOutOfBoundsException_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ObjectOutputStream _outputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        defaultPrettyPrinter.writeStartArray(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWriteStartArray_ThrowOutOfMemoryError() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 4;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ByteArrayOutputStream _outputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0};
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(_outputStream, "java.io.ByteArrayOutputStream", "count", 2147483624);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = new byte[33];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 25);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 28);
        
        defaultPrettyPrinter.writeStartArray(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteStartArray_ThrowIndexOutOfBoundsException_5() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        FileWriter _writer = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(_writer, "java.io.OutputStreamWriter", "se", se);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1);
        
        defaultPrettyPrinter.writeStartArray(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testWriteStartArray_ThrowReadOnlyBufferException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        OutputStreamWriter _writer = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(_writer, "java.io.OutputStreamWriter", "se", se);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[25];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 15);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 18);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 18);
        
        defaultPrettyPrinter.writeStartArray(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testWriteStartArray_ThrowReadOnlyBufferException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        OutputStreamWriter _writer = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(_writer, "java.io.OutputStreamWriter", "se", se);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[25];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 15);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 18);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 18);
        
        defaultPrettyPrinter.writeStartArray(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testWriteStartArray_ThrowIllegalStateException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        FileWriter _writer = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        setField(_writer, "java.io.OutputStreamWriter", "se", se);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeStartArray(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteStartArray_ThrowIndexOutOfBoundsException_6() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1);
        
        defaultPrettyPrinter.writeStartArray(writerBasedJsonGenerator);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method writeStartArray(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartArray(com.fasterxml.jackson.core.JsonGenerator)}
     */
    @Test
    public void testWriteStartArrayThrowsNPE() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        JsonGeneratorDelegate jsonGeneratorDelegate = new JsonGeneratorDelegate(null, true);
        JsonGeneratorDelegate jsonGeneratorDelegate1 = new JsonGeneratorDelegate(jsonGeneratorDelegate, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartArray(DefaultPrettyPrinter.java:342) */
        defaultPrettyPrinter.writeStartArray(jsonGeneratorDelegate1);
    }
    ///endregion
    
    ///region Errors report for writeStartArray
    
    public void testWriteStartArray_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.malformed4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeStartObject(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (!_objectIndenter.isInline()): True}
 *  */
    @Test
    public void testWriteStartObject_Not_objectIndenterIsInline() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeStartObject(writerBasedJsonGenerator);
        
        int finalDefaultPrettyPrinter_nesting = defaultPrettyPrinter._nesting;
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(-254, finalDefaultPrettyPrinter_nesting);
        
        assertEquals('{', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (!_objectIndenter.isInline()): False}
 *  */
    @Test
    public void testWriteStartObject__objectIndenterIsInline() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultPrettyPrinter.FixedSpaceIndenter _objectIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeStartObject(writerBasedJsonGenerator);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals('{', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteStartObject() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultPrettyPrinter.NopIndenter _objectIndenter = new DefaultPrettyPrinter.NopIndenter();
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        
        defaultPrettyPrinter.writeStartObject(writerBasedJsonGenerator);
        
        Writer writerBasedJsonGenerator_writer = ((Writer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
        boolean finalWriterBasedJsonGenerator_writerTrouble = ((Boolean) getFieldValue(writerBasedJsonGenerator_writer, "java.io.PrintWriter", "trouble"));
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertTrue(finalWriterBasedJsonGenerator_writerTrouble);
        
        assertEquals('{', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(0, finalWriterBasedJsonGenerator_outputHead);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeStartObject(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw('{');
 *  */
    @Test
    public void testWriteStartObject_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(((DefaultPrettyPrinter) null));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeStartObject(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw('{');
 *  */
    @Test
    public void testWriteStartObject_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(((DefaultPrettyPrinter) null));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeStartObject(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw('{');
 *  */
    @Test
    public void testWriteStartObject_ThrowIndexOutOfBoundsException_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(((DefaultPrettyPrinter) null));
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2147483645);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483647);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeStartObject(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw('{');
 *  */
    @Test
    public void testWriteStartObject_ThrowIndexOutOfBoundsException_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(((DefaultPrettyPrinter) null));
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeStartObject(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw('{');
 *  */
    @Test
    public void testWriteStartObject_ThrowIndexOutOfBoundsException_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(((DefaultPrettyPrinter) null));
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -3);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeStartObject(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw('{');
 *  */
    @Test
    public void testWriteStartObject_ThrowIndexOutOfBoundsException_5() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(((DefaultPrettyPrinter) null));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeStartObject(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw('{');
 *  */
    @Test
    public void testWriteStartObject_ThrowIndexOutOfBoundsException_6() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(((DefaultPrettyPrinter) null));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeStartObject(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeRaw(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw('{');
 *  */
    @Test
    public void testWriteStartObject_ThrowNullPointerException() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(((DefaultPrettyPrinter) null));
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeStartObject(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_objectIndenter.isInline()
 *  */
    @Test
    public void testWriteStartObject_ThrowNullPointerException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._objectIndenter = null;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeStartObject(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_objectIndenter.isInline()
 *  */
    @Test
    public void testWriteStartObject_ThrowNullPointerException_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._objectIndenter = null;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeStartObject(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_objectIndenter.isInline()
 *  */
    @Test
    public void testWriteStartObject_ThrowNullPointerException_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._objectIndenter = null;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeStartObject(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_objectIndenter.isInline()
 *  */
    @Test
    public void testWriteStartObject_ThrowNullPointerException_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._objectIndenter = null;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ByteArrayOutputStream _outputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", buf);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 5);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeStartObject(uTF8JsonGenerator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeStartObject(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} in: g.writeRaw('{');
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testWriteStartObject_ThrowOutOfMemoryError() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(((DefaultPrettyPrinter) null));
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        ByteArrayOutputStream _outputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[16];
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(_outputStream, "java.io.ByteArrayOutputStream", "count", 2147483640);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = new byte[18];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 8);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 11);
        
        defaultPrettyPrinter.writeStartObject(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw('{');
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteStartObject_ThrowIndexOutOfBoundsException_7() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(((DefaultPrettyPrinter) null));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1);
        
        defaultPrettyPrinter.writeStartObject(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: g.writeRaw('{');
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testWriteStartObject_ThrowReadOnlyBufferException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(((DefaultPrettyPrinter) null));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[25];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 11);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 18);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 18);
        
        defaultPrettyPrinter.writeStartObject(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: g.writeRaw('{');
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testWriteStartObject_ThrowReadOnlyBufferException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(((DefaultPrettyPrinter) null));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = new char[25];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 11);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 18);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 18);
        
        defaultPrettyPrinter.writeStartObject(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: g.writeRaw('{');
 *  */
    @Test(expected = IllegalStateException.class)
    public void testWriteStartObject_ThrowIllegalStateException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(((DefaultPrettyPrinter) null));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.ISO_8859_1$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeStartObject(writerBasedJsonGenerator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeStartObject(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeRaw(char)}
 * @utbot.throwsException {@link java.io.IOException} in: g.writeRaw('{');
 *  */
    @Test(expected = IOException.class)
    public void testWriteStartObject_ThrowIOException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(((DefaultPrettyPrinter) null));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        FileWriter _writer = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(_writer, "java.io.OutputStreamWriter", "se", se);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2);
        
        defaultPrettyPrinter.writeStartObject(writerBasedJsonGenerator);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method writeStartObject(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeStartObject(com.fasterxml.jackson.core.JsonGenerator)}
     */
    @Test
    public void testWriteStartObjectThrowsNPE() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        JsonGeneratorDelegate jsonGeneratorDelegate = new JsonGeneratorDelegate(null, true);
        JsonGeneratorDelegate jsonGeneratorDelegate1 = new JsonGeneratorDelegate(jsonGeneratorDelegate, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeStartObject(DefaultPrettyPrinter.java:275) */
        defaultPrettyPrinter.writeStartObject(jsonGeneratorDelegate1);
    }
    ///endregion
    
    ///region Errors report for writeStartObject
    
    public void testWriteStartObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 8 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 6 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.malformed4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.withSeparators
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withSeparators(com.fasterxml.jackson.core.util.Separators)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withSeparators(com.fasterxml.jackson.core.util.Separators)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.Separators#getObjectFieldValueSeparator()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithSeparators_StringBuilderToString() {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._separators = null;
        defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces = null;
        Separators separators = new Separators(' ', '\u0000', '\u0000');
        
        Separators initialDefaultPrettyPrinter_separators = defaultPrettyPrinter._separators;
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter.withSeparators(separators);
        
        Separators defaultPrettyPrinter_separators = defaultPrettyPrinter._separators;
        Separators actual_separators = actual._separators;
        char defaultPrettyPrinter_separatorsObjectFieldValueSeparator = defaultPrettyPrinter_separators.getObjectFieldValueSeparator();
        char actual_separatorsObjectFieldValueSeparator = actual_separators.getObjectFieldValueSeparator();
        assertEquals(defaultPrettyPrinter_separatorsObjectFieldValueSeparator, actual_separatorsObjectFieldValueSeparator);
        
        String defaultPrettyPrinter_objectFieldValueSeparatorWithSpaces = defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces;
        String actual_objectFieldValueSeparatorWithSpaces = actual._objectFieldValueSeparatorWithSpaces;
        assertEquals(defaultPrettyPrinter_objectFieldValueSeparatorWithSpaces, actual_objectFieldValueSeparatorWithSpaces);
        
        Separators finalDefaultPrettyPrinter_separators = defaultPrettyPrinter._separators;
        
        assertFalse(initialDefaultPrettyPrinter_separators == finalDefaultPrettyPrinter_separators);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withSeparators(com.fasterxml.jackson.core.util.Separators)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withSeparators(com.fasterxml.jackson.core.util.Separators)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _objectFieldValueSeparatorWithSpaces = " " + separators.getObjectFieldValueSeparator() + " ";
 *  */
    @Test
    public void testWithSeparators_ThrowNullPointerException() {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._separators = null;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.withSeparators] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.withSeparators(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withSeparators(com.fasterxml.jackson.core.util.Separators)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withSeparators(com.fasterxml.jackson.core.util.Separators)}
     */
    @Test
    public void testWithSeparators() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        Separators separators = new Separators('', '', '@');
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter.withSeparators(separators);
        
        DefaultPrettyPrinter.Indenter defaultPrettyPrinter_arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        DefaultPrettyPrinter.Indenter actual_arrayIndenter = actual._arrayIndenter;
        
        DefaultPrettyPrinter.Indenter defaultPrettyPrinter_objectIndenter = defaultPrettyPrinter._objectIndenter;
        DefaultPrettyPrinter.Indenter actual_objectIndenter = actual._objectIndenter;
        char[] defaultPrettyPrinter_objectIndenterIndents = ((char[]) getFieldValue(defaultPrettyPrinter_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents"));
        char[] actual_objectIndenterIndents = ((char[]) getFieldValue(actual_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents"));
        int defaultPrettyPrinter_objectIndenterIndentsSize = defaultPrettyPrinter_objectIndenterIndents.length;
        assertEquals(defaultPrettyPrinter_objectIndenterIndentsSize, actual_objectIndenterIndents.length);
        assertArrayEquals(defaultPrettyPrinter_objectIndenterIndents, actual_objectIndenterIndents);
        
        int defaultPrettyPrinter_objectIndenterCharsPerLevel = ((Integer) getFieldValue(defaultPrettyPrinter_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel"));
        int actual_objectIndenterCharsPerLevel = ((Integer) getFieldValue(actual_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel"));
        assertEquals(defaultPrettyPrinter_objectIndenterCharsPerLevel, actual_objectIndenterCharsPerLevel);
        
        String defaultPrettyPrinter_objectIndenterEol = (((DefaultIndenter) defaultPrettyPrinter_objectIndenter)).getEol();
        String actual_objectIndenterEol = (((DefaultIndenter) actual_objectIndenter)).getEol();
        assertEquals(defaultPrettyPrinter_objectIndenterEol, actual_objectIndenterEol);
        
        SerializableString defaultPrettyPrinter_rootSeparator = defaultPrettyPrinter._rootSeparator;
        SerializableString actual_rootSeparator = actual._rootSeparator;
        String defaultPrettyPrinter_rootSeparator_value = ((String) getFieldValue(defaultPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value"));
        String actual_rootSeparator_value = ((String) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value"));
        assertEquals(defaultPrettyPrinter_rootSeparator_value, actual_rootSeparator_value);
        
        byte[] actual_rootSeparator_quotedUTF8Ref = ((byte[]) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_quotedUTF8Ref"));
        assertNull(actual_rootSeparator_quotedUTF8Ref);
        
        byte[] actual_rootSeparator_unquotedUTF8Ref = ((byte[]) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref"));
        assertNull(actual_rootSeparator_unquotedUTF8Ref);
        
        char[] actual_rootSeparator_quotedChars = ((char[]) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_quotedChars"));
        assertNull(actual_rootSeparator_quotedChars);
        
        String actual_rootSeparator_jdkSerializeValue = ((String) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_jdkSerializeValue"));
        assertNull(actual_rootSeparator_jdkSerializeValue);
        
        boolean actual_spacesInObjectEntries = actual._spacesInObjectEntries;
        assertTrue(actual_spacesInObjectEntries);
        
        int defaultPrettyPrinter_nesting = defaultPrettyPrinter._nesting;
        int actual_nesting = actual._nesting;
        assertEquals(defaultPrettyPrinter_nesting, actual_nesting);
        
        Separators defaultPrettyPrinter_separators = defaultPrettyPrinter._separators;
        Separators actual_separators = actual._separators;
        char defaultPrettyPrinter_separatorsObjectFieldValueSeparator = defaultPrettyPrinter_separators.getObjectFieldValueSeparator();
        char actual_separatorsObjectFieldValueSeparator = actual_separators.getObjectFieldValueSeparator();
        assertEquals(defaultPrettyPrinter_separatorsObjectFieldValueSeparator, actual_separatorsObjectFieldValueSeparator);
        
        char defaultPrettyPrinter_separatorsObjectEntrySeparator = defaultPrettyPrinter_separators.getObjectEntrySeparator();
        char actual_separatorsObjectEntrySeparator = actual_separators.getObjectEntrySeparator();
        assertEquals(defaultPrettyPrinter_separatorsObjectEntrySeparator, actual_separatorsObjectEntrySeparator);
        
        char defaultPrettyPrinter_separatorsArrayValueSeparator = defaultPrettyPrinter_separators.getArrayValueSeparator();
        char actual_separatorsArrayValueSeparator = actual_separators.getArrayValueSeparator();
        assertEquals(defaultPrettyPrinter_separatorsArrayValueSeparator, actual_separatorsArrayValueSeparator);
        
        String defaultPrettyPrinter_objectFieldValueSeparatorWithSpaces = defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces;
        String actual_objectFieldValueSeparatorWithSpaces = actual._objectFieldValueSeparatorWithSpaces;
        assertEquals(defaultPrettyPrinter_objectFieldValueSeparatorWithSpaces, actual_objectFieldValueSeparatorWithSpaces);
        
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method withSeparators(com.fasterxml.jackson.core.util.Separators)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withSeparators(com.fasterxml.jackson.core.util.Separators)}
     */
    @Test
    public void testWithSeparatorsThrowsNPE() {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter("");
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.withSeparators] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.withSeparators(DefaultPrettyPrinter.java:243) */
        defaultPrettyPrinter.withSeparators(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.withObjectIndenter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withObjectIndenter(com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withObjectIndenter(com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)}
 * @utbot.executesCondition {@code (i == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithObjectIndenter_INotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultPrettyPrinter.FixedSpaceIndenter _objectIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        
        Class defaultPrettyPrinterClazz = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
        Class _objectIndenterType = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter");
        Method withObjectIndenterMethod = defaultPrettyPrinterClazz.getDeclaredMethod("withObjectIndenter", _objectIndenterType);
        withObjectIndenterMethod.setAccessible(true);
        java.lang.Object[] withObjectIndenterMethodArguments = new java.lang.Object[1];
        withObjectIndenterMethodArguments[0] = _objectIndenter;
        DefaultPrettyPrinter actual = ((DefaultPrettyPrinter) withObjectIndenterMethod.invoke(defaultPrettyPrinter, withObjectIndenterMethodArguments));
        
        DefaultPrettyPrinter.Indenter defaultPrettyPrinter_objectIndenter = defaultPrettyPrinter._objectIndenter;
        DefaultPrettyPrinter.Indenter actual_objectIndenter = actual._objectIndenter;
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withObjectIndenter(com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)}
 * @utbot.executesCondition {@code (i == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithObjectIndenter_IEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        DefaultPrettyPrinter.NopIndenter prevInstance = DefaultPrettyPrinter.NopIndenter.instance;
        try {
            DefaultPrettyPrinter.NopIndenter instance = new DefaultPrettyPrinter.NopIndenter();
            Class nopIndenterClazz = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter");
            setStaticField(nopIndenterClazz, "instance", instance);
            DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
            defaultPrettyPrinter._objectIndenter = instance;
            
            DefaultPrettyPrinter actual = defaultPrettyPrinter.withObjectIndenter(null);
            
            DefaultPrettyPrinter.Indenter defaultPrettyPrinter_objectIndenter = defaultPrettyPrinter._objectIndenter;
            DefaultPrettyPrinter.Indenter actual_objectIndenter = actual._objectIndenter;
            
        } finally {
            setStaticField(DefaultPrettyPrinter.NopIndenter.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withObjectIndenter(com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withObjectIndenter(com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)}
     */
    @Test
    public void testWithObjectIndenter() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        DefaultPrettyPrinter.NopIndenter nopIndenter = new DefaultPrettyPrinter.NopIndenter();
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter.withObjectIndenter(nopIndenter);
        
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = " ";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        DefaultPrettyPrinter expected = new DefaultPrettyPrinter(null, serializedString);
        DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        expected._arrayIndenter = _arrayIndenter;
        expected._objectIndenter = nopIndenter;
        expected._spacesInObjectEntries = true;
        expected._nesting = 0;
        Separators _separators = new Separators(':', ',', ',');
        expected._separators = _separators;
        String _objectFieldValueSeparatorWithSpaces = " : ";
        expected._objectFieldValueSeparatorWithSpaces = _objectFieldValueSeparatorWithSpaces;
        
        DefaultPrettyPrinter.Indenter expected_arrayIndenter = expected._arrayIndenter;
        DefaultPrettyPrinter.Indenter actual_arrayIndenter = actual._arrayIndenter;
        
        DefaultPrettyPrinter.Indenter expected_objectIndenter = expected._objectIndenter;
        DefaultPrettyPrinter.Indenter actual_objectIndenter = actual._objectIndenter;
        
        SerializableString expected_rootSeparator = expected._rootSeparator;
        SerializableString actual_rootSeparator = actual._rootSeparator;
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
        
        boolean actual_spacesInObjectEntries = actual._spacesInObjectEntries;
        assertTrue(actual_spacesInObjectEntries);
        
        int expected_nesting = expected._nesting;
        int actual_nesting = actual._nesting;
        assertEquals(expected_nesting, actual_nesting);
        
        Separators expected_separators = expected._separators;
        Separators actual_separators = actual._separators;
        char expected_separatorsObjectFieldValueSeparator = expected_separators.getObjectFieldValueSeparator();
        char actual_separatorsObjectFieldValueSeparator = actual_separators.getObjectFieldValueSeparator();
        assertEquals(expected_separatorsObjectFieldValueSeparator, actual_separatorsObjectFieldValueSeparator);
        
        char expected_separatorsObjectEntrySeparator = expected_separators.getObjectEntrySeparator();
        char actual_separatorsObjectEntrySeparator = actual_separators.getObjectEntrySeparator();
        assertEquals(expected_separatorsObjectEntrySeparator, actual_separatorsObjectEntrySeparator);
        
        char expected_separatorsArrayValueSeparator = expected_separators.getArrayValueSeparator();
        char actual_separatorsArrayValueSeparator = actual_separators.getArrayValueSeparator();
        assertEquals(expected_separatorsArrayValueSeparator, actual_separatorsArrayValueSeparator);
        
        String expected_objectFieldValueSeparatorWithSpaces = expected._objectFieldValueSeparatorWithSpaces;
        String actual_objectFieldValueSeparatorWithSpaces = actual._objectFieldValueSeparatorWithSpaces;
        assertEquals(expected_objectFieldValueSeparatorWithSpaces, actual_objectFieldValueSeparatorWithSpaces);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.withRootSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withRootSeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withRootSeparator(java.lang.String)}
 * @utbot.executesCondition {@code ((rootSeparator == null)): True}
 * @utbot.returnsFrom {@code return withRootSeparator((rootSeparator == null) ? null : new SerializedString(rootSeparator));}
 *  */
    @Test
    public void testWithRootSeparator_RootSeparatorEqualsNull() {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter.withRootSeparator(((String) null));
        
        SerializableString actual_rootSeparator = actual._rootSeparator;
        assertNull(actual_rootSeparator);
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withRootSeparator(java.lang.String)}
 * @utbot.executesCondition {@code ((rootSeparator == null)): False}
 * @utbot.returnsFrom {@code return withRootSeparator((rootSeparator == null) ? null : new SerializedString(rootSeparator));}
 *  */
    @Test
    public void testWithRootSeparator_RootSeparatorNotEqualsNull() throws Exception  {
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, serializedString);
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter.withRootSeparator(_value);
        
        SerializableString defaultPrettyPrinter_rootSeparator = defaultPrettyPrinter._rootSeparator;
        SerializableString actual_rootSeparator = actual._rootSeparator;
        String defaultPrettyPrinter_rootSeparator_value = ((String) getFieldValue(defaultPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value"));
        String actual_rootSeparator_value = ((String) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value"));
        assertEquals(defaultPrettyPrinter_rootSeparator_value, actual_rootSeparator_value);
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withRootSeparator(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withRootSeparator(java.lang.String)}
     */
    @Test
    public void testWithRootSeparatorWithNonEmptyString() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter.withRootSeparator("ZX");
        
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "ZX";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        DefaultPrettyPrinter expected = new DefaultPrettyPrinter(null, serializedString);
        DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        expected._arrayIndenter = _arrayIndenter;
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
        expected._objectIndenter = _objectIndenter;
        expected._spacesInObjectEntries = true;
        expected._nesting = 0;
        Separators _separators = new Separators(':', ',', ',');
        expected._separators = _separators;
        String _objectFieldValueSeparatorWithSpaces = " : ";
        expected._objectFieldValueSeparatorWithSpaces = _objectFieldValueSeparatorWithSpaces;
        
        DefaultPrettyPrinter.Indenter expected_arrayIndenter = expected._arrayIndenter;
        DefaultPrettyPrinter.Indenter actual_arrayIndenter = actual._arrayIndenter;
        
        DefaultPrettyPrinter.Indenter expected_objectIndenter = expected._objectIndenter;
        DefaultPrettyPrinter.Indenter actual_objectIndenter = actual._objectIndenter;
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
        
        SerializableString expected_rootSeparator = expected._rootSeparator;
        SerializableString actual_rootSeparator = actual._rootSeparator;
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
        
        boolean actual_spacesInObjectEntries = actual._spacesInObjectEntries;
        assertTrue(actual_spacesInObjectEntries);
        
        int expected_nesting = expected._nesting;
        int actual_nesting = actual._nesting;
        assertEquals(expected_nesting, actual_nesting);
        
        Separators expected_separators = expected._separators;
        Separators actual_separators = actual._separators;
        char expected_separatorsObjectFieldValueSeparator = expected_separators.getObjectFieldValueSeparator();
        char actual_separatorsObjectFieldValueSeparator = actual_separators.getObjectFieldValueSeparator();
        assertEquals(expected_separatorsObjectFieldValueSeparator, actual_separatorsObjectFieldValueSeparator);
        
        char expected_separatorsObjectEntrySeparator = expected_separators.getObjectEntrySeparator();
        char actual_separatorsObjectEntrySeparator = actual_separators.getObjectEntrySeparator();
        assertEquals(expected_separatorsObjectEntrySeparator, actual_separatorsObjectEntrySeparator);
        
        char expected_separatorsArrayValueSeparator = expected_separators.getArrayValueSeparator();
        char actual_separatorsArrayValueSeparator = actual_separators.getArrayValueSeparator();
        assertEquals(expected_separatorsArrayValueSeparator, actual_separatorsArrayValueSeparator);
        
        String expected_objectFieldValueSeparatorWithSpaces = expected._objectFieldValueSeparatorWithSpaces;
        String actual_objectFieldValueSeparatorWithSpaces = actual._objectFieldValueSeparatorWithSpaces;
        assertEquals(expected_objectFieldValueSeparatorWithSpaces, actual_objectFieldValueSeparatorWithSpaces);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.withRootSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withRootSeparator(com.fasterxml.jackson.core.SerializableString)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withRootSeparator(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.executesCondition {@code (_rootSeparator == rootSeparator): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithRootSeparator__rootSeparatorEqualsRootSeparator() {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter.withRootSeparator(((SerializableString) null));
        
        SerializableString actual_rootSeparator = actual._rootSeparator;
        assertNull(actual_rootSeparator);
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withRootSeparator(com.fasterxml.jackson.core.SerializableString)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withRootSeparator(com.fasterxml.jackson.core.SerializableString)}
     */
    @Test
    public void testWithRootSeparator() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        SerializedString serializedString = new SerializedString("#$\\\"'");
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter.withRootSeparator(serializedString);
        
        SerializedString serializedString1 = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "#$\\\"'";
        setField(serializedString1, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        DefaultPrettyPrinter expected = new DefaultPrettyPrinter(null, serializedString1);
        DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        expected._arrayIndenter = _arrayIndenter;
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
        expected._objectIndenter = _objectIndenter;
        expected._spacesInObjectEntries = true;
        expected._nesting = 0;
        Separators _separators = new Separators(':', ',', ',');
        expected._separators = _separators;
        String _objectFieldValueSeparatorWithSpaces = " : ";
        expected._objectFieldValueSeparatorWithSpaces = _objectFieldValueSeparatorWithSpaces;
        
        DefaultPrettyPrinter.Indenter expected_arrayIndenter = expected._arrayIndenter;
        DefaultPrettyPrinter.Indenter actual_arrayIndenter = actual._arrayIndenter;
        
        DefaultPrettyPrinter.Indenter expected_objectIndenter = expected._objectIndenter;
        DefaultPrettyPrinter.Indenter actual_objectIndenter = actual._objectIndenter;
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
        
        SerializableString expected_rootSeparator = expected._rootSeparator;
        SerializableString actual_rootSeparator = actual._rootSeparator;
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
        
        boolean actual_spacesInObjectEntries = actual._spacesInObjectEntries;
        assertTrue(actual_spacesInObjectEntries);
        
        int expected_nesting = expected._nesting;
        int actual_nesting = actual._nesting;
        assertEquals(expected_nesting, actual_nesting);
        
        Separators expected_separators = expected._separators;
        Separators actual_separators = actual._separators;
        char expected_separatorsObjectFieldValueSeparator = expected_separators.getObjectFieldValueSeparator();
        char actual_separatorsObjectFieldValueSeparator = actual_separators.getObjectFieldValueSeparator();
        assertEquals(expected_separatorsObjectFieldValueSeparator, actual_separatorsObjectFieldValueSeparator);
        
        char expected_separatorsObjectEntrySeparator = expected_separators.getObjectEntrySeparator();
        char actual_separatorsObjectEntrySeparator = actual_separators.getObjectEntrySeparator();
        assertEquals(expected_separatorsObjectEntrySeparator, actual_separatorsObjectEntrySeparator);
        
        char expected_separatorsArrayValueSeparator = expected_separators.getArrayValueSeparator();
        char actual_separatorsArrayValueSeparator = actual_separators.getArrayValueSeparator();
        assertEquals(expected_separatorsArrayValueSeparator, actual_separatorsArrayValueSeparator);
        
        String expected_objectFieldValueSeparatorWithSpaces = expected._objectFieldValueSeparatorWithSpaces;
        String actual_objectFieldValueSeparatorWithSpaces = actual._objectFieldValueSeparatorWithSpaces;
        assertEquals(expected_objectFieldValueSeparatorWithSpaces, actual_objectFieldValueSeparatorWithSpaces);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.indentObjectsWith
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indentObjectsWith(com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#indentObjectsWith(com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)}
 * @utbot.executesCondition {@code ((i == null)): False}
 *  */
    @Test
    public void testIndentObjectsWith_INotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._objectIndenter = null;
        DefaultPrettyPrinter.FixedSpaceIndenter fixedSpaceIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        
        DefaultPrettyPrinter.Indenter initialDefaultPrettyPrinter_objectIndenter = defaultPrettyPrinter._objectIndenter;
        
        Class defaultPrettyPrinterClazz = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
        Class fixedSpaceIndenterType = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter");
        Method indentObjectsWithMethod = defaultPrettyPrinterClazz.getDeclaredMethod("indentObjectsWith", fixedSpaceIndenterType);
        indentObjectsWithMethod.setAccessible(true);
        java.lang.Object[] indentObjectsWithMethodArguments = new java.lang.Object[1];
        indentObjectsWithMethodArguments[0] = fixedSpaceIndenter;
        indentObjectsWithMethod.invoke(defaultPrettyPrinter, indentObjectsWithMethodArguments);
        
        DefaultPrettyPrinter.Indenter finalDefaultPrettyPrinter_objectIndenter = defaultPrettyPrinter._objectIndenter;
        
        assertFalse(initialDefaultPrettyPrinter_objectIndenter == finalDefaultPrettyPrinter_objectIndenter);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#indentObjectsWith(com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)}
 * @utbot.executesCondition {@code ((i == null)): True}
 *  */
    @Test
    public void testIndentObjectsWith_IEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        DefaultPrettyPrinter.NopIndenter prevInstance = DefaultPrettyPrinter.NopIndenter.instance;
        try {
            DefaultPrettyPrinter.NopIndenter instance = new DefaultPrettyPrinter.NopIndenter();
            Class nopIndenterClazz = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter");
            setStaticField(nopIndenterClazz, "instance", instance);
            DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
            defaultPrettyPrinter._objectIndenter = null;
            
            DefaultPrettyPrinter.Indenter initialDefaultPrettyPrinter_objectIndenter = defaultPrettyPrinter._objectIndenter;
            
            defaultPrettyPrinter.indentObjectsWith(null);
            
            DefaultPrettyPrinter.Indenter finalDefaultPrettyPrinter_objectIndenter = defaultPrettyPrinter._objectIndenter;
            
            assertFalse(initialDefaultPrettyPrinter_objectIndenter == finalDefaultPrettyPrinter_objectIndenter);
        } finally {
            setStaticField(DefaultPrettyPrinter.NopIndenter.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indentObjectsWith(com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#indentObjectsWith(com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)}
     */
    @Test
    public void testIndentObjectsWith() {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        DefaultPrettyPrinter.NopIndenter nopIndenter = new DefaultPrettyPrinter.NopIndenter();
        
        defaultPrettyPrinter.indentObjectsWith(nopIndenter);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter._withSpaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _withSpaces(boolean)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#_withSpaces(boolean)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries == state): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void test_withSpaces__spacesInObjectEntriesEqualsState() {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter._withSpaces(false);
        
        boolean actual_spacesInObjectEntries = actual._spacesInObjectEntries;
        assertFalse(actual_spacesInObjectEntries);
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method _withSpaces(boolean)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#_withSpaces(boolean)}
     */
    @Test
    public void test_withSpaces() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter._withSpaces(false);
        
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = " ";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        DefaultPrettyPrinter expected = new DefaultPrettyPrinter(null, serializedString);
        DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        expected._arrayIndenter = _arrayIndenter;
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
        expected._objectIndenter = _objectIndenter;
        expected._spacesInObjectEntries = false;
        expected._nesting = 0;
        Separators _separators = new Separators(':', ',', ',');
        expected._separators = _separators;
        String _objectFieldValueSeparatorWithSpaces = " : ";
        expected._objectFieldValueSeparatorWithSpaces = _objectFieldValueSeparatorWithSpaces;
        
        DefaultPrettyPrinter.Indenter expected_arrayIndenter = expected._arrayIndenter;
        DefaultPrettyPrinter.Indenter actual_arrayIndenter = actual._arrayIndenter;
        
        DefaultPrettyPrinter.Indenter expected_objectIndenter = expected._objectIndenter;
        DefaultPrettyPrinter.Indenter actual_objectIndenter = actual._objectIndenter;
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
        
        SerializableString expected_rootSeparator = expected._rootSeparator;
        SerializableString actual_rootSeparator = actual._rootSeparator;
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
        
        boolean actual_spacesInObjectEntries = actual._spacesInObjectEntries;
        assertFalse(actual_spacesInObjectEntries);
        
        int expected_nesting = expected._nesting;
        int actual_nesting = actual._nesting;
        assertEquals(expected_nesting, actual_nesting);
        
        Separators expected_separators = expected._separators;
        Separators actual_separators = actual._separators;
        char expected_separatorsObjectFieldValueSeparator = expected_separators.getObjectFieldValueSeparator();
        char actual_separatorsObjectFieldValueSeparator = actual_separators.getObjectFieldValueSeparator();
        assertEquals(expected_separatorsObjectFieldValueSeparator, actual_separatorsObjectFieldValueSeparator);
        
        char expected_separatorsObjectEntrySeparator = expected_separators.getObjectEntrySeparator();
        char actual_separatorsObjectEntrySeparator = actual_separators.getObjectEntrySeparator();
        assertEquals(expected_separatorsObjectEntrySeparator, actual_separatorsObjectEntrySeparator);
        
        char expected_separatorsArrayValueSeparator = expected_separators.getArrayValueSeparator();
        char actual_separatorsArrayValueSeparator = actual_separators.getArrayValueSeparator();
        assertEquals(expected_separatorsArrayValueSeparator, actual_separatorsArrayValueSeparator);
        
        String expected_objectFieldValueSeparatorWithSpaces = expected._objectFieldValueSeparatorWithSpaces;
        String actual_objectFieldValueSeparatorWithSpaces = actual._objectFieldValueSeparatorWithSpaces;
        assertEquals(expected_objectFieldValueSeparatorWithSpaces, actual_objectFieldValueSeparatorWithSpaces);
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#_withSpaces(boolean)}
     */
    @Test
    public void test_withSpaces1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter._withSpaces(true);
        
        DefaultPrettyPrinter.Indenter defaultPrettyPrinter_arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        DefaultPrettyPrinter.Indenter actual_arrayIndenter = actual._arrayIndenter;
        
        DefaultPrettyPrinter.Indenter defaultPrettyPrinter_objectIndenter = defaultPrettyPrinter._objectIndenter;
        DefaultPrettyPrinter.Indenter actual_objectIndenter = actual._objectIndenter;
        char[] defaultPrettyPrinter_objectIndenterIndents = ((char[]) getFieldValue(defaultPrettyPrinter_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents"));
        char[] actual_objectIndenterIndents = ((char[]) getFieldValue(actual_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents"));
        int defaultPrettyPrinter_objectIndenterIndentsSize = defaultPrettyPrinter_objectIndenterIndents.length;
        assertEquals(defaultPrettyPrinter_objectIndenterIndentsSize, actual_objectIndenterIndents.length);
        assertArrayEquals(defaultPrettyPrinter_objectIndenterIndents, actual_objectIndenterIndents);
        
        int defaultPrettyPrinter_objectIndenterCharsPerLevel = ((Integer) getFieldValue(defaultPrettyPrinter_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel"));
        int actual_objectIndenterCharsPerLevel = ((Integer) getFieldValue(actual_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel"));
        assertEquals(defaultPrettyPrinter_objectIndenterCharsPerLevel, actual_objectIndenterCharsPerLevel);
        
        String defaultPrettyPrinter_objectIndenterEol = (((DefaultIndenter) defaultPrettyPrinter_objectIndenter)).getEol();
        String actual_objectIndenterEol = (((DefaultIndenter) actual_objectIndenter)).getEol();
        assertEquals(defaultPrettyPrinter_objectIndenterEol, actual_objectIndenterEol);
        
        SerializableString defaultPrettyPrinter_rootSeparator = defaultPrettyPrinter._rootSeparator;
        SerializableString actual_rootSeparator = actual._rootSeparator;
        String defaultPrettyPrinter_rootSeparator_value = ((String) getFieldValue(defaultPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value"));
        String actual_rootSeparator_value = ((String) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value"));
        assertEquals(defaultPrettyPrinter_rootSeparator_value, actual_rootSeparator_value);
        
        byte[] actual_rootSeparator_quotedUTF8Ref = ((byte[]) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_quotedUTF8Ref"));
        assertNull(actual_rootSeparator_quotedUTF8Ref);
        
        byte[] actual_rootSeparator_unquotedUTF8Ref = ((byte[]) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref"));
        assertNull(actual_rootSeparator_unquotedUTF8Ref);
        
        char[] actual_rootSeparator_quotedChars = ((char[]) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_quotedChars"));
        assertNull(actual_rootSeparator_quotedChars);
        
        String actual_rootSeparator_jdkSerializeValue = ((String) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_jdkSerializeValue"));
        assertNull(actual_rootSeparator_jdkSerializeValue);
        
        boolean actual_spacesInObjectEntries = actual._spacesInObjectEntries;
        assertTrue(actual_spacesInObjectEntries);
        
        int defaultPrettyPrinter_nesting = defaultPrettyPrinter._nesting;
        int actual_nesting = actual._nesting;
        assertEquals(defaultPrettyPrinter_nesting, actual_nesting);
        
        Separators defaultPrettyPrinter_separators = defaultPrettyPrinter._separators;
        Separators actual_separators = actual._separators;
        char defaultPrettyPrinter_separatorsObjectFieldValueSeparator = defaultPrettyPrinter_separators.getObjectFieldValueSeparator();
        char actual_separatorsObjectFieldValueSeparator = actual_separators.getObjectFieldValueSeparator();
        assertEquals(defaultPrettyPrinter_separatorsObjectFieldValueSeparator, actual_separatorsObjectFieldValueSeparator);
        
        char defaultPrettyPrinter_separatorsObjectEntrySeparator = defaultPrettyPrinter_separators.getObjectEntrySeparator();
        char actual_separatorsObjectEntrySeparator = actual_separators.getObjectEntrySeparator();
        assertEquals(defaultPrettyPrinter_separatorsObjectEntrySeparator, actual_separatorsObjectEntrySeparator);
        
        char defaultPrettyPrinter_separatorsArrayValueSeparator = defaultPrettyPrinter_separators.getArrayValueSeparator();
        char actual_separatorsArrayValueSeparator = actual_separators.getArrayValueSeparator();
        assertEquals(defaultPrettyPrinter_separatorsArrayValueSeparator, actual_separatorsArrayValueSeparator);
        
        String defaultPrettyPrinter_objectFieldValueSeparatorWithSpaces = defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces;
        String actual_objectFieldValueSeparatorWithSpaces = actual._objectFieldValueSeparatorWithSpaces;
        assertEquals(defaultPrettyPrinter_objectFieldValueSeparatorWithSpaces, actual_objectFieldValueSeparatorWithSpaces);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.withArrayIndenter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withArrayIndenter(com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withArrayIndenter(com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)}
 * @utbot.executesCondition {@code (i == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithArrayIndenter_INotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        
        Class defaultPrettyPrinterClazz = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
        Class _arrayIndenterType = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter");
        Method withArrayIndenterMethod = defaultPrettyPrinterClazz.getDeclaredMethod("withArrayIndenter", _arrayIndenterType);
        withArrayIndenterMethod.setAccessible(true);
        java.lang.Object[] withArrayIndenterMethodArguments = new java.lang.Object[1];
        withArrayIndenterMethodArguments[0] = _arrayIndenter;
        DefaultPrettyPrinter actual = ((DefaultPrettyPrinter) withArrayIndenterMethod.invoke(defaultPrettyPrinter, withArrayIndenterMethodArguments));
        
        DefaultPrettyPrinter.Indenter defaultPrettyPrinter_arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        DefaultPrettyPrinter.Indenter actual_arrayIndenter = actual._arrayIndenter;
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withArrayIndenter(com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)}
 * @utbot.executesCondition {@code (i == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithArrayIndenter_IEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        DefaultPrettyPrinter.NopIndenter prevInstance = DefaultPrettyPrinter.NopIndenter.instance;
        try {
            DefaultPrettyPrinter.NopIndenter instance = new DefaultPrettyPrinter.NopIndenter();
            Class nopIndenterClazz = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter");
            setStaticField(nopIndenterClazz, "instance", instance);
            DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
            defaultPrettyPrinter._arrayIndenter = instance;
            
            DefaultPrettyPrinter actual = defaultPrettyPrinter.withArrayIndenter(null);
            
            DefaultPrettyPrinter.Indenter defaultPrettyPrinter_arrayIndenter = defaultPrettyPrinter._arrayIndenter;
            DefaultPrettyPrinter.Indenter actual_arrayIndenter = actual._arrayIndenter;
            
        } finally {
            setStaticField(DefaultPrettyPrinter.NopIndenter.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withArrayIndenter(com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withArrayIndenter(com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)}
     */
    @Test
    public void testWithArrayIndenter() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        DefaultPrettyPrinter.NopIndenter nopIndenter = new DefaultPrettyPrinter.NopIndenter();
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter.withArrayIndenter(nopIndenter);
        
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = " ";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        DefaultPrettyPrinter expected = new DefaultPrettyPrinter(null, serializedString);
        expected._arrayIndenter = nopIndenter;
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
        expected._objectIndenter = _objectIndenter;
        expected._spacesInObjectEntries = true;
        expected._nesting = 0;
        Separators _separators = new Separators(':', ',', ',');
        expected._separators = _separators;
        String _objectFieldValueSeparatorWithSpaces = " : ";
        expected._objectFieldValueSeparatorWithSpaces = _objectFieldValueSeparatorWithSpaces;
        
        DefaultPrettyPrinter.Indenter expected_arrayIndenter = expected._arrayIndenter;
        DefaultPrettyPrinter.Indenter actual_arrayIndenter = actual._arrayIndenter;
        
        DefaultPrettyPrinter.Indenter expected_objectIndenter = expected._objectIndenter;
        DefaultPrettyPrinter.Indenter actual_objectIndenter = actual._objectIndenter;
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
        
        SerializableString expected_rootSeparator = expected._rootSeparator;
        SerializableString actual_rootSeparator = actual._rootSeparator;
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
        
        boolean actual_spacesInObjectEntries = actual._spacesInObjectEntries;
        assertTrue(actual_spacesInObjectEntries);
        
        int expected_nesting = expected._nesting;
        int actual_nesting = actual._nesting;
        assertEquals(expected_nesting, actual_nesting);
        
        Separators expected_separators = expected._separators;
        Separators actual_separators = actual._separators;
        char expected_separatorsObjectFieldValueSeparator = expected_separators.getObjectFieldValueSeparator();
        char actual_separatorsObjectFieldValueSeparator = actual_separators.getObjectFieldValueSeparator();
        assertEquals(expected_separatorsObjectFieldValueSeparator, actual_separatorsObjectFieldValueSeparator);
        
        char expected_separatorsObjectEntrySeparator = expected_separators.getObjectEntrySeparator();
        char actual_separatorsObjectEntrySeparator = actual_separators.getObjectEntrySeparator();
        assertEquals(expected_separatorsObjectEntrySeparator, actual_separatorsObjectEntrySeparator);
        
        char expected_separatorsArrayValueSeparator = expected_separators.getArrayValueSeparator();
        char actual_separatorsArrayValueSeparator = actual_separators.getArrayValueSeparator();
        assertEquals(expected_separatorsArrayValueSeparator, actual_separatorsArrayValueSeparator);
        
        String expected_objectFieldValueSeparatorWithSpaces = expected._objectFieldValueSeparatorWithSpaces;
        String actual_objectFieldValueSeparatorWithSpaces = actual._objectFieldValueSeparatorWithSpaces;
        assertEquals(expected_objectFieldValueSeparatorWithSpaces, actual_objectFieldValueSeparatorWithSpaces);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.indentArraysWith
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indentArraysWith(com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#indentArraysWith(com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)}
 * @utbot.executesCondition {@code ((i == null)): False}
 *  */
    @Test
    public void testIndentArraysWith_INotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._arrayIndenter = null;
        DefaultPrettyPrinter.FixedSpaceIndenter fixedSpaceIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        
        DefaultPrettyPrinter.Indenter initialDefaultPrettyPrinter_arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        
        Class defaultPrettyPrinterClazz = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
        Class fixedSpaceIndenterType = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter");
        Method indentArraysWithMethod = defaultPrettyPrinterClazz.getDeclaredMethod("indentArraysWith", fixedSpaceIndenterType);
        indentArraysWithMethod.setAccessible(true);
        java.lang.Object[] indentArraysWithMethodArguments = new java.lang.Object[1];
        indentArraysWithMethodArguments[0] = fixedSpaceIndenter;
        indentArraysWithMethod.invoke(defaultPrettyPrinter, indentArraysWithMethodArguments);
        
        DefaultPrettyPrinter.Indenter finalDefaultPrettyPrinter_arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        
        assertFalse(initialDefaultPrettyPrinter_arrayIndenter == finalDefaultPrettyPrinter_arrayIndenter);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#indentArraysWith(com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)}
 * @utbot.executesCondition {@code ((i == null)): True}
 *  */
    @Test
    public void testIndentArraysWith_IEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        DefaultPrettyPrinter.NopIndenter prevInstance = DefaultPrettyPrinter.NopIndenter.instance;
        try {
            DefaultPrettyPrinter.NopIndenter instance = new DefaultPrettyPrinter.NopIndenter();
            Class nopIndenterClazz = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter");
            setStaticField(nopIndenterClazz, "instance", instance);
            DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
            defaultPrettyPrinter._arrayIndenter = null;
            
            DefaultPrettyPrinter.Indenter initialDefaultPrettyPrinter_arrayIndenter = defaultPrettyPrinter._arrayIndenter;
            
            defaultPrettyPrinter.indentArraysWith(null);
            
            DefaultPrettyPrinter.Indenter finalDefaultPrettyPrinter_arrayIndenter = defaultPrettyPrinter._arrayIndenter;
            
            assertFalse(initialDefaultPrettyPrinter_arrayIndenter == finalDefaultPrettyPrinter_arrayIndenter);
        } finally {
            setStaticField(DefaultPrettyPrinter.NopIndenter.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indentArraysWith(com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#indentArraysWith(com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)}
     */
    @Test
    public void testIndentArraysWith() {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        DefaultPrettyPrinter.NopIndenter nopIndenter = new DefaultPrettyPrinter.NopIndenter();
        
        defaultPrettyPrinter.indentArraysWith(nopIndenter);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.withSpacesInObjectEntries
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withSpacesInObjectEntries()
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withSpacesInObjectEntries()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#_withSpaces(boolean)}
 * @utbot.returnsFrom {@code return _withSpaces(true);}
 *  */
    @Test
    public void testWithSpacesInObjectEntries_DefaultPrettyPrinter_withSpaces() {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = true;
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter.withSpacesInObjectEntries();
        
        boolean actual_spacesInObjectEntries = actual._spacesInObjectEntries;
        assertTrue(actual_spacesInObjectEntries);
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withSpacesInObjectEntries()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withSpacesInObjectEntries()}
     */
    @Test
    public void testWithSpacesInObjectEntries() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter.withSpacesInObjectEntries();
        
        DefaultPrettyPrinter.Indenter defaultPrettyPrinter_arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        DefaultPrettyPrinter.Indenter actual_arrayIndenter = actual._arrayIndenter;
        
        DefaultPrettyPrinter.Indenter defaultPrettyPrinter_objectIndenter = defaultPrettyPrinter._objectIndenter;
        DefaultPrettyPrinter.Indenter actual_objectIndenter = actual._objectIndenter;
        char[] defaultPrettyPrinter_objectIndenterIndents = ((char[]) getFieldValue(defaultPrettyPrinter_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents"));
        char[] actual_objectIndenterIndents = ((char[]) getFieldValue(actual_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents"));
        int defaultPrettyPrinter_objectIndenterIndentsSize = defaultPrettyPrinter_objectIndenterIndents.length;
        assertEquals(defaultPrettyPrinter_objectIndenterIndentsSize, actual_objectIndenterIndents.length);
        assertArrayEquals(defaultPrettyPrinter_objectIndenterIndents, actual_objectIndenterIndents);
        
        int defaultPrettyPrinter_objectIndenterCharsPerLevel = ((Integer) getFieldValue(defaultPrettyPrinter_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel"));
        int actual_objectIndenterCharsPerLevel = ((Integer) getFieldValue(actual_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel"));
        assertEquals(defaultPrettyPrinter_objectIndenterCharsPerLevel, actual_objectIndenterCharsPerLevel);
        
        String defaultPrettyPrinter_objectIndenterEol = (((DefaultIndenter) defaultPrettyPrinter_objectIndenter)).getEol();
        String actual_objectIndenterEol = (((DefaultIndenter) actual_objectIndenter)).getEol();
        assertEquals(defaultPrettyPrinter_objectIndenterEol, actual_objectIndenterEol);
        
        SerializableString defaultPrettyPrinter_rootSeparator = defaultPrettyPrinter._rootSeparator;
        SerializableString actual_rootSeparator = actual._rootSeparator;
        String defaultPrettyPrinter_rootSeparator_value = ((String) getFieldValue(defaultPrettyPrinter_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value"));
        String actual_rootSeparator_value = ((String) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value"));
        assertEquals(defaultPrettyPrinter_rootSeparator_value, actual_rootSeparator_value);
        
        byte[] actual_rootSeparator_quotedUTF8Ref = ((byte[]) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_quotedUTF8Ref"));
        assertNull(actual_rootSeparator_quotedUTF8Ref);
        
        byte[] actual_rootSeparator_unquotedUTF8Ref = ((byte[]) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref"));
        assertNull(actual_rootSeparator_unquotedUTF8Ref);
        
        char[] actual_rootSeparator_quotedChars = ((char[]) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_quotedChars"));
        assertNull(actual_rootSeparator_quotedChars);
        
        String actual_rootSeparator_jdkSerializeValue = ((String) getFieldValue(actual_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_jdkSerializeValue"));
        assertNull(actual_rootSeparator_jdkSerializeValue);
        
        boolean actual_spacesInObjectEntries = actual._spacesInObjectEntries;
        assertTrue(actual_spacesInObjectEntries);
        
        int defaultPrettyPrinter_nesting = defaultPrettyPrinter._nesting;
        int actual_nesting = actual._nesting;
        assertEquals(defaultPrettyPrinter_nesting, actual_nesting);
        
        Separators defaultPrettyPrinter_separators = defaultPrettyPrinter._separators;
        Separators actual_separators = actual._separators;
        char defaultPrettyPrinter_separatorsObjectFieldValueSeparator = defaultPrettyPrinter_separators.getObjectFieldValueSeparator();
        char actual_separatorsObjectFieldValueSeparator = actual_separators.getObjectFieldValueSeparator();
        assertEquals(defaultPrettyPrinter_separatorsObjectFieldValueSeparator, actual_separatorsObjectFieldValueSeparator);
        
        char defaultPrettyPrinter_separatorsObjectEntrySeparator = defaultPrettyPrinter_separators.getObjectEntrySeparator();
        char actual_separatorsObjectEntrySeparator = actual_separators.getObjectEntrySeparator();
        assertEquals(defaultPrettyPrinter_separatorsObjectEntrySeparator, actual_separatorsObjectEntrySeparator);
        
        char defaultPrettyPrinter_separatorsArrayValueSeparator = defaultPrettyPrinter_separators.getArrayValueSeparator();
        char actual_separatorsArrayValueSeparator = actual_separators.getArrayValueSeparator();
        assertEquals(defaultPrettyPrinter_separatorsArrayValueSeparator, actual_separatorsArrayValueSeparator);
        
        String defaultPrettyPrinter_objectFieldValueSeparatorWithSpaces = defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces;
        String actual_objectFieldValueSeparatorWithSpaces = actual._objectFieldValueSeparatorWithSpaces;
        assertEquals(defaultPrettyPrinter_objectFieldValueSeparatorWithSpaces, actual_objectFieldValueSeparatorWithSpaces);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.withoutSpacesInObjectEntries
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withoutSpacesInObjectEntries()
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withoutSpacesInObjectEntries()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#_withSpaces(boolean)}
 * @utbot.returnsFrom {@code return _withSpaces(false);}
 *  */
    @Test
    public void testWithoutSpacesInObjectEntries_DefaultPrettyPrinter_withSpaces() {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter.withoutSpacesInObjectEntries();
        
        boolean actual_spacesInObjectEntries = actual._spacesInObjectEntries;
        assertFalse(actual_spacesInObjectEntries);
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withoutSpacesInObjectEntries()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#withoutSpacesInObjectEntries()}
     */
    @Test
    public void testWithoutSpacesInObjectEntries() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        
        DefaultPrettyPrinter actual = defaultPrettyPrinter.withoutSpacesInObjectEntries();
        
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = " ";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        DefaultPrettyPrinter expected = new DefaultPrettyPrinter(null, serializedString);
        DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        expected._arrayIndenter = _arrayIndenter;
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
        expected._objectIndenter = _objectIndenter;
        expected._spacesInObjectEntries = false;
        expected._nesting = 0;
        Separators _separators = new Separators(':', ',', ',');
        expected._separators = _separators;
        String _objectFieldValueSeparatorWithSpaces = " : ";
        expected._objectFieldValueSeparatorWithSpaces = _objectFieldValueSeparatorWithSpaces;
        
        DefaultPrettyPrinter.Indenter expected_arrayIndenter = expected._arrayIndenter;
        DefaultPrettyPrinter.Indenter actual_arrayIndenter = actual._arrayIndenter;
        
        DefaultPrettyPrinter.Indenter expected_objectIndenter = expected._objectIndenter;
        DefaultPrettyPrinter.Indenter actual_objectIndenter = actual._objectIndenter;
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
        
        SerializableString expected_rootSeparator = expected._rootSeparator;
        SerializableString actual_rootSeparator = actual._rootSeparator;
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
        
        boolean actual_spacesInObjectEntries = actual._spacesInObjectEntries;
        assertFalse(actual_spacesInObjectEntries);
        
        int expected_nesting = expected._nesting;
        int actual_nesting = actual._nesting;
        assertEquals(expected_nesting, actual_nesting);
        
        Separators expected_separators = expected._separators;
        Separators actual_separators = actual._separators;
        char expected_separatorsObjectFieldValueSeparator = expected_separators.getObjectFieldValueSeparator();
        char actual_separatorsObjectFieldValueSeparator = actual_separators.getObjectFieldValueSeparator();
        assertEquals(expected_separatorsObjectFieldValueSeparator, actual_separatorsObjectFieldValueSeparator);
        
        char expected_separatorsObjectEntrySeparator = expected_separators.getObjectEntrySeparator();
        char actual_separatorsObjectEntrySeparator = actual_separators.getObjectEntrySeparator();
        assertEquals(expected_separatorsObjectEntrySeparator, actual_separatorsObjectEntrySeparator);
        
        char expected_separatorsArrayValueSeparator = expected_separators.getArrayValueSeparator();
        char actual_separatorsArrayValueSeparator = actual_separators.getArrayValueSeparator();
        assertEquals(expected_separatorsArrayValueSeparator, actual_separatorsArrayValueSeparator);
        
        String expected_objectFieldValueSeparatorWithSpaces = expected._objectFieldValueSeparatorWithSpaces;
        String actual_objectFieldValueSeparatorWithSpaces = actual._objectFieldValueSeparatorWithSpaces;
        assertEquals(expected_objectFieldValueSeparatorWithSpaces, actual_objectFieldValueSeparatorWithSpaces);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeRootValueSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeRootValueSeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeRootValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_rootSeparator != null): False}
 *  */
    @Test
    public void testWriteRootValueSeparator__rootSeparatorEqualsNull() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        
        defaultPrettyPrinter.writeRootValueSeparator(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeRootValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_rootSeparator != null): True}
 *  */
    @Test
    public void testWriteRootValueSeparator__rootSeparatorNotEqualsNull() throws Exception  {
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = {};
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, serializedString);
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _unquotedUTF8Ref);
        
        defaultPrettyPrinter.writeRootValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeRootValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_rootSeparator != null): True}
 *  */
    @Test
    public void testWriteRootValueSeparator__rootSeparatorNotEqualsNull_1() throws Exception  {
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = {};
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, serializedString);
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _unquotedUTF8Ref);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeRootValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeRootValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_rootSeparator != null): True}
 *  */
    @Test
    public void testWriteRootValueSeparator__rootSeparatorNotEqualsNull_2() throws Exception  {
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = {(byte) 0};
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, serializedString);
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        
        defaultPrettyPrinter.writeRootValueSeparator(uTF8JsonGenerator);
        
        int finalUTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        
        assertEquals(1, finalUTF8JsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeRootValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_rootSeparator != null): True}
 *  */
    @Test
    public void testWriteRootValueSeparator__rootSeparatorNotEqualsNull_3() throws Exception  {
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, serializedString);
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1);
        
        defaultPrettyPrinter.writeRootValueSeparator(writerBasedJsonGenerator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeRootValueSeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeRootValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_rootSeparator != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeRaw(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw(_rootSeparator);
 *  */
    @Test
    public void testWriteRootValueSeparator_ThrowNullPointerException() throws Exception  {
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, serializedString);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeRootValueSeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeRootValueSeparator(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeRootValueSeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeRootValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_rootSeparator);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteRootValueSeparator_ThrowIndexOutOfBoundsException() throws Exception  {
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = {(byte) 0, (byte) 0};
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, serializedString);
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -1);
        
        defaultPrettyPrinter.writeRootValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeRootValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_rootSeparator);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteRootValueSeparator_ThrowIndexOutOfBoundsException_1() throws Exception  {
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] _unquotedUTF8Ref = {(byte) 0, (byte) 0};
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_unquotedUTF8Ref", _unquotedUTF8Ref);
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, serializedString);
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeRootValueSeparator(uTF8JsonGenerator);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method writeRootValueSeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeRootValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
     */
    @Test
    public void testWriteRootValueSeparatorThrowsNPE() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        JsonGeneratorDelegate jsonGeneratorDelegate = new JsonGeneratorDelegate(null, true);
        JsonGeneratorDelegate jsonGeneratorDelegate1 = new JsonGeneratorDelegate(jsonGeneratorDelegate, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeRootValueSeparator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:280)
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:280)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeRootValueSeparator(DefaultPrettyPrinter.java:268) */
        defaultPrettyPrinter.writeRootValueSeparator(jsonGeneratorDelegate1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeObjectEntries
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testBeforeObjectEntries() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "\u0000";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 2147483646);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        
        defaultPrettyPrinter.beforeObjectEntries(writerBasedJsonGenerator);
        
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(Integer.MAX_VALUE, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testBeforeObjectEntries_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1610612736);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1610612736);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -1610612736);
        
        defaultPrettyPrinter.beforeObjectEntries(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testBeforeObjectEntries_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = {'\u0000', '\u0000'};
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 2);
        String eol = "\u0000\u0000\u0000";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 2);
        
        defaultPrettyPrinter.beforeObjectEntries(writerBasedJsonGenerator);
        
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(3, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testBeforeObjectEntries_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 0;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 3);
        char[] _charBuffer = {'\u0000'};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer", _charBuffer);
        
        defaultPrettyPrinter.beforeObjectEntries(uTF8JsonGenerator);
        
        byte[] uTF8JsonGenerator_outputBuffer = ((byte[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        byte finalUTF8JsonGenerator_outputBuffer0 = ((Byte) get(uTF8JsonGenerator_outputBuffer, 0));
        int finalUTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        char[] uTF8JsonGenerator_charBuffer = ((char[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer"));
        char finalUTF8JsonGenerator_charBuffer0 = ((Character) get(uTF8JsonGenerator_charBuffer, 0));
        
        assertEquals(java.lang.Byte.MAX_VALUE, finalUTF8JsonGenerator_outputBuffer0);
        
        assertEquals(1, finalUTF8JsonGenerator_outputTail);
        
        assertEquals('', finalUTF8JsonGenerator_charBuffer0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testBeforeObjectEntries_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 0;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -1);
        char[] _charBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer", _charBuffer);
        
        defaultPrettyPrinter.beforeObjectEntries(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testBeforeObjectEntries_5() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 0;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1);
        
        defaultPrettyPrinter.beforeObjectEntries(writerBasedJsonGenerator);
        
        Writer writerBasedJsonGenerator_writer = ((Writer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
        boolean finalWriterBasedJsonGenerator_writerTrouble = ((Boolean) getFieldValue(writerBasedJsonGenerator_writer, "java.io.PrintWriter", "trouble"));
        int finalWriterBasedJsonGenerator_outputHead = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead"));
        
        assertTrue(finalWriterBasedJsonGenerator_writerTrouble);
        
        assertEquals(0, finalWriterBasedJsonGenerator_outputHead);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testBeforeObjectEntries_6() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[32];
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 32);
        String eol = "";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(_writer, "java.io.Writer", "lock", lock);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1602224129);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -536870914);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -536870911);
        
        defaultPrettyPrinter.beforeObjectEntries(writerBasedJsonGenerator);
        
        Writer writerBasedJsonGenerator_writer = ((Writer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer"));
        boolean finalWriterBasedJsonGenerator_writerTrouble = ((Boolean) getFieldValue(writerBasedJsonGenerator_writer, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalWriterBasedJsonGenerator_writerTrouble);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter#writeIndentation(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test
    public void testBeforeObjectEntries_ThrowNullPointerException() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._objectIndenter = null;
        defaultPrettyPrinter._nesting = -255;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeObjectEntries] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.beforeObjectEntries(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testBeforeObjectEntries_ThrowStringIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", Integer.MAX_VALUE);
        
        defaultPrettyPrinter.beforeObjectEntries(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testBeforeObjectEntries_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[33];
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 27);
        String eol = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1669070865);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -1669070829);
        
        defaultPrettyPrinter.beforeObjectEntries(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testBeforeObjectEntries_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[31];
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 32);
        String eol = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -28);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 27);
        
        defaultPrettyPrinter.beforeObjectEntries(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testBeforeObjectEntries_ThrowIndexOutOfBoundsException_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[32];
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 33);
        String eol = "";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        OutputStreamWriter _writer = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(_writer, "java.io.OutputStreamWriter", "se", se);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", Integer.MAX_VALUE);
        
        defaultPrettyPrinter.beforeObjectEntries(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testBeforeObjectEntries_ThrowIndexOutOfBoundsException_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.beforeObjectEntries(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test(expected = NullPointerException.class)
    public void testBeforeObjectEntries_ThrowNullPointerException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[32];
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 3);
        String eol = "\u0000";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 1;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -2147483387);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 473399294);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 473399297);
        
        defaultPrettyPrinter.beforeObjectEntries(writerBasedJsonGenerator);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#beforeObjectEntries(com.fasterxml.jackson.core.JsonGenerator)}
     */
    @Test
    public void testBeforeObjectEntriesThrowsNPE() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        JsonGeneratorDelegate jsonGeneratorDelegate = new JsonGeneratorDelegate(null, true);
        JsonGeneratorDelegate jsonGeneratorDelegate1 = new JsonGeneratorDelegate(jsonGeneratorDelegate, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeObjectEntries] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:274)
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:274)
            com.fasterxml.jackson.core.util.DefaultIndenter.writeIndentation(DefaultIndenter.java:87)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeObjectEntries(DefaultPrettyPrinter.java:284) */
        defaultPrettyPrinter.beforeObjectEntries(jsonGeneratorDelegate1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_Not_spacesInObjectEntries() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators(' ', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeObjectFieldValueSeparator(writerBasedJsonGenerator);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(' ', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_Not_spacesInObjectEntries_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators(' ', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeObjectFieldValueSeparator(writerBasedJsonGenerator);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 1));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(' ', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals(2, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_Not_spacesInObjectEntries_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators('', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        defaultPrettyPrinter.writeObjectFieldValueSeparator(uTF8JsonGenerator);
        
        byte[] uTF8JsonGenerator_outputBuffer = ((byte[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        byte finalUTF8JsonGenerator_outputBuffer0 = ((Byte) get(uTF8JsonGenerator_outputBuffer, 0));
        int finalUTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        
        assertEquals(java.lang.Byte.MAX_VALUE, finalUTF8JsonGenerator_outputBuffer0);
        
        assertEquals(1, finalUTF8JsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_Not_spacesInObjectEntries_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators('', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 3);
        
        defaultPrettyPrinter.writeObjectFieldValueSeparator(uTF8JsonGenerator);
        
        byte[] uTF8JsonGenerator_outputBuffer = ((byte[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        byte finalUTF8JsonGenerator_outputBuffer0 = ((Byte) get(uTF8JsonGenerator_outputBuffer, 0));
        int finalUTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        
        assertEquals(java.lang.Byte.MAX_VALUE, finalUTF8JsonGenerator_outputBuffer0);
        
        assertEquals(1, finalUTF8JsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_Not_spacesInObjectEntries_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators('\uE000', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = new byte[39];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 31);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 35);
        
        defaultPrettyPrinter.writeObjectFieldValueSeparator(uTF8JsonGenerator);
        
        byte[] uTF8JsonGenerator_outputBuffer = ((byte[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        byte finalUTF8JsonGenerator_outputBuffer31 = ((Byte) get(uTF8JsonGenerator_outputBuffer, 31));
        byte[] uTF8JsonGenerator_outputBuffer1 = ((byte[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        byte finalUTF8JsonGenerator_outputBuffer32 = ((Byte) get(uTF8JsonGenerator_outputBuffer1, 32));
        byte[] uTF8JsonGenerator_outputBuffer2 = ((byte[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        byte finalUTF8JsonGenerator_outputBuffer33 = ((Byte) get(uTF8JsonGenerator_outputBuffer2, 33));
        int finalUTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        
        assertEquals((byte) -18, finalUTF8JsonGenerator_outputBuffer31);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalUTF8JsonGenerator_outputBuffer32);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalUTF8JsonGenerator_outputBuffer33);
        
        assertEquals(34, finalUTF8JsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_Not_spacesInObjectEntries_5() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators('\u0080', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 3);
        
        defaultPrettyPrinter.writeObjectFieldValueSeparator(uTF8JsonGenerator);
        
        byte[] uTF8JsonGenerator_outputBuffer = ((byte[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        byte finalUTF8JsonGenerator_outputBuffer0 = ((Byte) get(uTF8JsonGenerator_outputBuffer, 0));
        byte[] uTF8JsonGenerator_outputBuffer1 = ((byte[]) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer"));
        byte finalUTF8JsonGenerator_outputBuffer1 = ((Byte) get(uTF8JsonGenerator_outputBuffer1, 1));
        int finalUTF8JsonGenerator_outputTail = ((Integer) getFieldValue(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail"));
        
        assertEquals((byte) -62, finalUTF8JsonGenerator_outputBuffer0);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalUTF8JsonGenerator_outputBuffer1);
        
        assertEquals(2, finalUTF8JsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): True}
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator__spacesInObjectEntries() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = true;
        String _objectFieldValueSeparatorWithSpaces = "";
        defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces = _objectFieldValueSeparatorWithSpaces;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        char[] _charBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer", _charBuffer);
        
        defaultPrettyPrinter.writeObjectFieldValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): True}
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator__spacesInObjectEntries_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = true;
        String _objectFieldValueSeparatorWithSpaces = "@   ";
        defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces = _objectFieldValueSeparatorWithSpaces;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 212989);
        
        defaultPrettyPrinter.writeObjectFieldValueSeparator(writerBasedJsonGenerator);
        
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(2, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): True}
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator__spacesInObjectEntries_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = true;
        String _objectFieldValueSeparatorWithSpaces = "";
        defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces = _objectFieldValueSeparatorWithSpaces;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 8);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 8);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 8);
        
        defaultPrettyPrinter.writeObjectFieldValueSeparator(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): True}
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator__spacesInObjectEntries_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = true;
        String _objectFieldValueSeparatorWithSpaces = "";
        defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces = _objectFieldValueSeparatorWithSpaces;
        FilteringGeneratorDelegate filteringGeneratorDelegate = ((FilteringGeneratorDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate"));
        
        defaultPrettyPrinter.writeObjectFieldValueSeparator(filteringGeneratorDelegate);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectFieldValueSeparator());
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators(' ', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeObjectFieldValueSeparator(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectFieldValueSeparator());
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators(' ', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeObjectFieldValueSeparator(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectFieldValueSeparator());
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_ThrowIndexOutOfBoundsException_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators('\u0080', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeObjectFieldValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectFieldValueSeparator());
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_ThrowIndexOutOfBoundsException_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators('\u0080', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeObjectFieldValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectFieldValueSeparator());
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_ThrowIndexOutOfBoundsException_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators('\u0080', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeObjectFieldValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectFieldValueSeparator());
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_ThrowIndexOutOfBoundsException_5() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators('', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeObjectFieldValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectFieldValueSeparator());
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_ThrowIndexOutOfBoundsException_6() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators('', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2147483645);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483647);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeObjectFieldValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectFieldValueSeparator());
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_ThrowIndexOutOfBoundsException_7() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators('\uD7FF', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeObjectFieldValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectFieldValueSeparator());
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_ThrowIndexOutOfBoundsException_8() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators('\uD7FF', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeObjectFieldValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectFieldValueSeparator());
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_ThrowIndexOutOfBoundsException_9() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators('\uE000', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -3);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeObjectFieldValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeRaw(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw(_objectFieldValueSeparatorWithSpaces);
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_ThrowNullPointerException() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = true;
        defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces = null;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeObjectFieldValueSeparator(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw(_separators.getObjectFieldValueSeparator());
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_ThrowNullPointerException_1() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        defaultPrettyPrinter._separators = null;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeObjectFieldValueSeparator(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw(_separators.getObjectFieldValueSeparator());
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_ThrowNullPointerException_2() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators(' ', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeObjectFieldValueSeparator(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw(_separators.getObjectFieldValueSeparator());
 *  */
    @Test
    public void testWriteObjectFieldValueSeparator_ThrowNullPointerException_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators('\uE000', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 3);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeObjectFieldValueSeparator(uTF8JsonGenerator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: g.writeRaw(_objectFieldValueSeparatorWithSpaces);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testWriteObjectFieldValueSeparator_ThrowStringIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = true;
        String _objectFieldValueSeparatorWithSpaces = "\u0000";
        defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces = _objectFieldValueSeparatorWithSpaces;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483636);
        char[] _charBuffer = {};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_charBuffer", _charBuffer);
        
        defaultPrettyPrinter.writeObjectFieldValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: g.writeRaw(_objectFieldValueSeparatorWithSpaces);
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testWriteObjectFieldValueSeparator_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = true;
        String _objectFieldValueSeparatorWithSpaces = "";
        defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces = _objectFieldValueSeparatorWithSpaces;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", Integer.MAX_VALUE);
        
        defaultPrettyPrinter.writeObjectFieldValueSeparator(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteObjectFieldValueSeparator_ThrowIndexOutOfBoundsException_10() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = true;
        String _objectFieldValueSeparatorWithSpaces = " ";
        defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces = _objectFieldValueSeparatorWithSpaces;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        OutputStreamWriter _writer = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(_writer, "java.io.OutputStreamWriter", "se", se);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -2147483647);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        
        defaultPrettyPrinter.writeObjectFieldValueSeparator(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.executesCondition {@code (_spacesInObjectEntries): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.Separators#getObjectFieldValueSeparator()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeRaw(char)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteObjectFieldValueSeparator_ThrowIndexOutOfBoundsException_11() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._spacesInObjectEntries = false;
        Separators _separators = new Separators(' ', '\u0000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(_writer, "java.io.PrintWriter", "out", out);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        char[] _outputBuffer = {};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeObjectFieldValueSeparator(writerBasedJsonGenerator);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectFieldValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
     */
    @Test
    public void testWriteObjectFieldValueSeparatorThrowsNPE() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        JsonGeneratorDelegate jsonGeneratorDelegate = new JsonGeneratorDelegate(null, true);
        JsonGeneratorDelegate jsonGeneratorDelegate1 = new JsonGeneratorDelegate(jsonGeneratorDelegate, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:274)
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:274)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator(DefaultPrettyPrinter.java:300) */
        defaultPrettyPrinter.writeObjectFieldValueSeparator(jsonGeneratorDelegate1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteObjectEntrySeparator() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultPrettyPrinter.FixedSpaceIndenter _objectIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 0;
        Separators _separators = new Separators('\u0000', ' ', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 3);
        
        defaultPrettyPrinter.writeObjectEntrySeparator(writerBasedJsonGenerator);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(' ', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(' ', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals(2, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteObjectEntrySeparator_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "\u0000\u0000";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 0;
        Separators _separators = new Separators('\u0000', ' ', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[29];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 20);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 20);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483642);
        
        defaultPrettyPrinter.writeObjectEntrySeparator(writerBasedJsonGenerator);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer20 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 20));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(' ', finalWriterBasedJsonGenerator_outputBuffer20);
        
        assertEquals(23, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteObjectEntrySeparator_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 0;
        Separators _separators = new Separators('\u0000', ' ', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeObjectEntrySeparator(writerBasedJsonGenerator);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(' ', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteObjectEntrySeparator_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[40];
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 31);
        String eol = "\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = 1;
        Separators _separators = new Separators('\u0000', ' ', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741825);
        
        defaultPrettyPrinter.writeObjectEntrySeparator(writerBasedJsonGenerator);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(' ', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(38, finalWriterBasedJsonGenerator_outputTail);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectEntrySeparator());
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', ' ', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeObjectEntrySeparator(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectEntrySeparator());
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', ' ', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeObjectEntrySeparator(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectEntrySeparator());
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowIndexOutOfBoundsException_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -3);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeObjectEntrySeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectEntrySeparator());
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowIndexOutOfBoundsException_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2147483645);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483647);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeObjectEntrySeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectEntrySeparator());
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowIndexOutOfBoundsException_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0080', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -3);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeObjectEntrySeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectEntrySeparator());
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowIndexOutOfBoundsException_5() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeObjectEntrySeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectEntrySeparator());
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowIndexOutOfBoundsException_6() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0080', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2147483645);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483647);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeObjectEntrySeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectEntrySeparator());
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowIndexOutOfBoundsException_7() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\uE000', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeObjectEntrySeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectEntrySeparator());
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowIndexOutOfBoundsException_8() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0080', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeObjectEntrySeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getObjectEntrySeparator());
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowIndexOutOfBoundsException_9() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\uD7FF', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeObjectEntrySeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw(_separators.getObjectEntrySeparator());
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowNullPointerException() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._separators = null;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeObjectEntrySeparator(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw(_separators.getObjectEntrySeparator());
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowNullPointerException_1() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', ' ', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeObjectEntrySeparator(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw(_separators.getObjectEntrySeparator());
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowNullPointerException_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\uD7FF', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2147483645);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483647);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeObjectEntrySeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowNullPointerException_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._objectIndenter = null;
        defaultPrettyPrinter._nesting = -255;
        Separators _separators = new Separators('\u0000', ' ', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeObjectEntrySeparator(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowNullPointerException_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._objectIndenter = null;
        defaultPrettyPrinter._nesting = 0;
        Separators _separators = new Separators('\u0000', '', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeObjectEntrySeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowNullPointerException_5() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._objectIndenter = null;
        defaultPrettyPrinter._nesting = 0;
        Separators _separators = new Separators('\u0000', '\u0080', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeObjectEntrySeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowNullPointerException_6() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._objectIndenter = null;
        defaultPrettyPrinter._nesting = 0;
        Separators _separators = new Separators('\u0000', '\uD7FF', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = new byte[15];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 12);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 16);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeObjectEntrySeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowNullPointerException_7() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._objectIndenter = null;
        defaultPrettyPrinter._nesting = 0;
        Separators _separators = new Separators('\u0000', '', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        DerOutputStream _outputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", buf);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 5);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeObjectEntrySeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _objectIndenter.writeIndentation(g, _nesting);
 *  */
    @Test
    public void testWriteObjectEntrySeparator_ThrowNullPointerException_8() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._objectIndenter = null;
        defaultPrettyPrinter._nesting = 0;
        Separators _separators = new Separators('\u0000', ' ', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        FilteringGeneratorDelegate filteringGeneratorDelegate = ((FilteringGeneratorDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeObjectEntrySeparator(filteringGeneratorDelegate);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteObjectEntrySeparator_ThrowIndexOutOfBoundsException_10() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', ' ', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        DerOutputStream _outputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = {(byte) 0};
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(_outputStream, "java.io.ByteArrayOutputStream", "count", -30);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        byte[] _outputBuffer = new byte[32];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 32);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 35);
        
        defaultPrettyPrinter.writeObjectEntrySeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteObjectEntrySeparator_ThrowIndexOutOfBoundsException_11() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', ' ', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        OutputStreamWriter _writer = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(_writer, "java.io.OutputStreamWriter", "se", se);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1);
        
        defaultPrettyPrinter.writeObjectEntrySeparator(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter#writeIndentation(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} 
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testWriteObjectEntrySeparator_ThrowStringIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _objectIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_objectIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._objectIndenter = _objectIndenter;
        defaultPrettyPrinter._nesting = -255;
        Separators _separators = new Separators('\u0000', ' ', '\u0000');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeObjectEntrySeparator(writerBasedJsonGenerator);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeObjectEntrySeparator(com.fasterxml.jackson.core.JsonGenerator)}
     */
    @Test
    public void testWriteObjectEntrySeparatorThrowsNPE() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        JsonGeneratorDelegate jsonGeneratorDelegate = new JsonGeneratorDelegate(null, true);
        JsonGeneratorDelegate jsonGeneratorDelegate1 = new JsonGeneratorDelegate(jsonGeneratorDelegate, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectEntrySeparator(DefaultPrettyPrinter.java:318) */
        defaultPrettyPrinter.writeObjectEntrySeparator(jsonGeneratorDelegate1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteArrayValueSeparator() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 0;
        Separators _separators = new Separators('\u0000', '\u0000', ' ');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 3);
        
        defaultPrettyPrinter.writeArrayValueSeparator(writerBasedJsonGenerator);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer1 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 1));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(' ', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(' ', finalWriterBasedJsonGenerator_outputBuffer1);
        
        assertEquals(2, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteArrayValueSeparator_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "\u0000\u0000";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 0;
        Separators _separators = new Separators('\u0000', '\u0000', ' ');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[29];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 20);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 20);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483642);
        
        defaultPrettyPrinter.writeArrayValueSeparator(writerBasedJsonGenerator);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer20 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 20));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(' ', finalWriterBasedJsonGenerator_outputBuffer20);
        
        assertEquals(23, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteArrayValueSeparator_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 0;
        Separators _separators = new Separators('\u0000', '\u0000', ' ');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeArrayValueSeparator(writerBasedJsonGenerator);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer0 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 0));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(' ', finalWriterBasedJsonGenerator_outputBuffer0);
        
        assertEquals(1, finalWriterBasedJsonGenerator_outputTail);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 *  */
    @Test
    public void testWriteArrayValueSeparator_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] indents = new char[16];
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "indents", indents);
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "charsPerLevel", 16);
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = 1;
        Separators _separators = new Separators('\u0000', '\u0000', ' ');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[12];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 6);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 6);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483646);
        
        defaultPrettyPrinter.writeArrayValueSeparator(writerBasedJsonGenerator);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer6 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 6));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        
        assertEquals(' ', finalWriterBasedJsonGenerator_outputBuffer6);
        
        assertEquals(23, finalWriterBasedJsonGenerator_outputTail);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getArrayValueSeparator());
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0000', ' ');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeArrayValueSeparator(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getArrayValueSeparator());
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0000', ' ');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeArrayValueSeparator(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getArrayValueSeparator());
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowIndexOutOfBoundsException_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0000', '');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -3);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeArrayValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getArrayValueSeparator());
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowIndexOutOfBoundsException_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0000', '');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2147483645);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483647);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeArrayValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getArrayValueSeparator());
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowIndexOutOfBoundsException_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0000', '\u0080');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -3);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 1);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeArrayValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getArrayValueSeparator());
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowIndexOutOfBoundsException_5() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0000', '');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeArrayValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getArrayValueSeparator());
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowIndexOutOfBoundsException_6() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0000', '\u0080');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2147483645);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483647);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeArrayValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getArrayValueSeparator());
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowIndexOutOfBoundsException_7() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0000', '\uE000');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", -1);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        defaultPrettyPrinter.writeArrayValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getArrayValueSeparator());
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowIndexOutOfBoundsException_8() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0000', '\u0080');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeArrayValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: g.writeRaw(_separators.getArrayValueSeparator());
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowIndexOutOfBoundsException_9() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0000', '\uD7FF');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        defaultPrettyPrinter.writeArrayValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw(_separators.getArrayValueSeparator());
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowNullPointerException() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._separators = null;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeArrayValueSeparator(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw(_separators.getArrayValueSeparator());
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowNullPointerException_1() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0000', ' ');
        defaultPrettyPrinter._separators = _separators;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeArrayValueSeparator(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.writeRaw(_separators.getArrayValueSeparator());
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowNullPointerException_2() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0000', '\uD7FF');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2147483645);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", -2147483647);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeArrayValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _arrayIndenter.writeIndentation(g, _nesting);
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowNullPointerException_3() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._arrayIndenter = null;
        defaultPrettyPrinter._nesting = -255;
        Separators _separators = new Separators('\u0000', '\u0000', ' ');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeArrayValueSeparator(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _arrayIndenter.writeIndentation(g, _nesting);
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowNullPointerException_4() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._arrayIndenter = null;
        defaultPrettyPrinter._nesting = 0;
        Separators _separators = new Separators('\u0000', '\u0000', '');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeArrayValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _arrayIndenter.writeIndentation(g, _nesting);
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowNullPointerException_5() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._arrayIndenter = null;
        defaultPrettyPrinter._nesting = 0;
        Separators _separators = new Separators('\u0000', '\u0000', '\u0080');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 4);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeArrayValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _arrayIndenter.writeIndentation(g, _nesting);
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowNullPointerException_6() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._arrayIndenter = null;
        defaultPrettyPrinter._nesting = 0;
        Separators _separators = new Separators('\u0000', '\u0000', '\uD7FF');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] _outputBuffer = new byte[15];
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", _outputBuffer);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 12);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 16);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeArrayValueSeparator(uTF8JsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _arrayIndenter.writeIndentation(g, _nesting);
 *  */
    @Test
    public void testWriteArrayValueSeparator_ThrowNullPointerException_7() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        defaultPrettyPrinter._arrayIndenter = null;
        defaultPrettyPrinter._nesting = 0;
        Separators _separators = new Separators('\u0000', '\u0000', '');
        defaultPrettyPrinter._separators = _separators;
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        DerOutputStream _outputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0};
        setField(_outputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputStream", _outputStream);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputBuffer", buf);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputTail", 2);
        setField(uTF8JsonGenerator, "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputEnd", 5);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.NullPointerException] */
        defaultPrettyPrinter.writeArrayValueSeparator(uTF8JsonGenerator);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteArrayValueSeparator_ThrowIndexOutOfBoundsException_10() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        Separators _separators = new Separators('\u0000', '\u0000', ' ');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        OutputStreamWriter _writer = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(_writer, "java.io.OutputStreamWriter", "se", se);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1);
        
        defaultPrettyPrinter.writeArrayValueSeparator(writerBasedJsonGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultPrettyPrinter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter#writeIndentation(com.fasterxml.jackson.core.JsonGenerator,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} 
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testWriteArrayValueSeparator_ThrowStringIndexOutOfBoundsException() throws Exception  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(null, null);
        DefaultIndenter _arrayIndenter = ((DefaultIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultIndenter"));
        String eol = "";
        setField(_arrayIndenter, "com.fasterxml.jackson.core.util.DefaultIndenter", "eol", eol);
        defaultPrettyPrinter._arrayIndenter = _arrayIndenter;
        defaultPrettyPrinter._nesting = -255;
        Separators _separators = new Separators('\u0000', '\u0000', ' ');
        defaultPrettyPrinter._separators = _separators;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        
        defaultPrettyPrinter.writeArrayValueSeparator(writerBasedJsonGenerator);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.DefaultPrettyPrinter#writeArrayValueSeparator(com.fasterxml.jackson.core.JsonGenerator)}
     */
    @Test
    public void testWriteArrayValueSeparatorThrowsNPE() throws IOException  {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        JsonGeneratorDelegate jsonGeneratorDelegate = new JsonGeneratorDelegate(null, true);
        JsonGeneratorDelegate jsonGeneratorDelegate1 = new JsonGeneratorDelegate(jsonGeneratorDelegate, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.JsonGeneratorDelegate.writeRaw(JsonGeneratorDelegate.java:286)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:362) */
        defaultPrettyPrinter.writeArrayValueSeparator(jsonGeneratorDelegate1);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1027545975356200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1027545975356200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1027545975361900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1027545975356200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1027545975361900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1027545976885900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1027545976885900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1027545976887500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1027545976885900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1027545976887500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1027545977994400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1027545977994400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1027545977996000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1027545977994400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1027545977996000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

